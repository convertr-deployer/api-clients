<?php
/**
 * DuedilApiClient
 * @copyright 2012 Duedil Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
if ( version_compare(PHP_VERSION, '5.2.0', '<') ) {
    throw new DuedilApiException('Duedil Client need PHP version >= 5.2.0');
}
if ( !function_exists('curl_init') ) {
    throw new DuedilApiException('Duedil Client need the CURL PHP extension.');
}
if ( !function_exists('json_decode') ) {
    throw new DuedilApiException('Duedil Client need the JSON PHP extension.');
}

/**
 * Duedil API Client
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
class DuedilApiClient
{
    const COMPANY_NAMESPACE = '/company';

    const COMPANIES_NAMESPACE = '/companies';

    const DIRECTORSHIPS_NAMESPACE = '/directorships';

    const DIRECTOR_NAMESPACE = '/director';

    const DIRECTORS_NAMESPACE = '/directors';

    const SEARCH_COMPANIES = '/search/companies';

    const SEARCH_DIRECTORS = '/search/directors';

    const REQUEST_DETAILS = '/request-details';

    const GET_ALL = 'get_all';

    const COMMA = ',';

    const QUESTION_MARK = '?';

    const SLASH = '/';

    public static $version = 'duedil.api.client-php-0.3';

    /**
     * @var HttpClient
     */
    private $httpClient;

    private $limit;

    private $offset;

    private $fields;

    private $namespace;

    private $pagination;

    private $nextPage = false;

    private $traversal;

    private $lastRequestId;

    private $key;

    private $query;

    public function __construct($key, $url)
    {
        if ( !$key ) {
            throw new DuedilApiException('No API Key found');
        }
        if ( !$url ) {
            throw new DuedilApiException('No API URL found');
        }
        $this->key = $key;
        $this->httpClient = new HttpClient($key, $url);
    }

    public function run($pagination = false)
    {
        if ( $pagination ) {
            $result = $this->httpClient->getData(
                $this->pagination[ResponseEnum::NAME_SPACE],
                $this->pagination[ResponseEnum::FILEDS],
                $this->pagination[ResponseEnum::LIMIT],
                $this->pagination[ResponseEnum::OFFSET],
                null,
                $this->pagination[ResponseEnum::QUERY]
            );
        } else {
            $result = $this->httpClient->getData(
                $this->namespace, $this->fields, $this->limit, $this->offset, $this->traversal, $this->query
            );
        }

        //the request ID
        if ( isset($result[ResponseEnum::REQUEST_ID]) ) {
            $this->lastRequestId = $result[ResponseEnum::REQUEST_ID];
        }

        //Get next page
        if ( isset($result[ResponseEnum::PAGINATION]) OR array_key_exists(ResponseEnum::PAGINATION, $result[ResponseEnum::RESPONSE]) ) {
            if ( isset($result[ResponseEnum::RESPONSE][ResponseEnum::PAGINATION]) ) $pagination = $result[ResponseEnum::RESPONSE][ResponseEnum::PAGINATION];
            else $pagination = $result[ResponseEnum::PAGINATION];
            $this->analyzePaginationParam($pagination);
        } else {
            $this->nextPage = false;
        }

        $this->reset();

        return $this->cleanupResults($result);
    }

    private function cleanupResults($result)
    {
        if ( isset($result[ResponseEnum::RESPONSE][ResponseEnum::PAGINATION]) ) {
            unset($result[ResponseEnum::RESPONSE][ResponseEnum::PAGINATION]);
        }
        if ( isset($result[ResponseEnum::REQUEST_ID]) ) {
            unset($result[ResponseEnum::REQUEST_ID]);
        }
        if ( isset($result[ResponseEnum::PAGINATION]) ) {
            unset($result[ResponseEnum::PAGINATION]);
        }

        return $result;
    }

    private function reset()
    {
        $this->limit = null;
        $this->offset = null;
        $this->fields = null;
        $this->traversal = null;
    }

    //PAGINATION
    private function analyzePaginationParam($pagination)
    {
        $this->pagination = explode(self::QUESTION_MARK, $pagination);
        parse_str($this->pagination[1], $param);

        if ( !isset($param[ResponseEnum::LAST]) ) {
            //set up pagination details
            $this->nextPage = true;
            $this->pagination[ResponseEnum::NAME_SPACE] = $this->namespace;

            if ( isset($param[ResponseEnum::FILEDS]) ) {
                $this->pagination[ResponseEnum::FILEDS] = $param[ResponseEnum::FILEDS];
            } else {
                $this->pagination[ResponseEnum::FILEDS] = null;
            }

            if ( isset($param[ResponseEnum::LIMIT]) ) {
                $this->pagination[ResponseEnum::LIMIT] = $param[ResponseEnum::LIMIT];
            }
            if ( isset($param[ResponseEnum::OFFSET]) ) {
                $this->pagination[ResponseEnum::OFFSET] = $param[ResponseEnum::OFFSET];
            }
            if ( isset($param[ResponseEnum::FILEDS]) ) {
                $this->pagination[ResponseEnum::FILEDS] = $param[ResponseEnum::FILEDS];
            }
            if ( isset($param[ResponseEnum::QUERY]) ) {
                $this->pagination[ResponseEnum::QUERY] = $param[ResponseEnum::QUERY];
            }
        } else {
            $this->nextPage = false;
        }
    }

    public function hasNextPage()
    {
        return $this->nextPage;
    }

    public function getNextPage()
    {
        return $this->run(true);
    }

    public function getPagination()
    {
        return $this->pagination;
    }

    //TRAVERSAL
    private function isTraversalAllow()
    {
        $traversal = false;

        if ( strpos($this->namespace, self::COMPANY_NAMESPACE) === 0 OR strpos($this->namespace, self::DIRECTOR_NAMESPACE) === 0 ) {
            $traversal = true;
        }

        return $traversal;
    }

    public function setTraversal($traversal)
    {
        if ( !$this->isTraversalAllow() ) {
            throw new DuedilApiException('Traversal are allow only on {' . self::COMPANY_NAMESPACE . '} and {' . self::DIRECTOR_NAMESPACE . '} endpoints');
        }

        if ( $traversal instanceof Traversal ) {
            $this->traversal = $traversal->getQuery();
        } elseif ( is_array($traversal) ) {
            $this->traversal = json_encode($traversal);
        } else {
            throw new DuedilApiException('Traversal wrong format. Must be an array or and instance of Traversal');
        }
        return $this;
    }

    public function setT($traversal)
    {
        $this->setTraversal($traversal);
        return $this;
    }

    //PARAM SETTER
    public function setLimit($limit)
    {
        $this->limit = $limit;
        return $this;
    }

    public function getAllFields()
    {
        $this->fields = self::GET_ALL;
        return $this;
    }

    public function setOffset($offset)
    {
        $this->offset = $offset;
        return $this;
    }

    public function setFields($fields)
    {
        if ( is_array($fields) ) {
            $fields = join(self::COMMA, $fields);
        }

        $this->fields = $fields;
        return $this;
    }

    //COMPANIES	
    public function getCompanyByOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org;
        return $this;
    }

    public function getCreditLimitsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/credit-limits';
        return $this;
    }

    public function getCreditRatingsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/credit-ratings';
        return $this;
    }

    public function getPreviousCompanyNameByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/previous-company-names';
        return $this;
    }

    public function getPreviousCompanyDetailsByCompanyOrg($company_org, $old_company_id)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/previous-company-names/' . $old_company_id;
        return $this;
    }

    public function getRegisteredAddressByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/registered-address';
        return $this;
    }

    public function getBankAccountsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/bank-accounts';
        return $this;
    }

    public function getSecondaryIndustriesByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/secondary-industries';
        return $this;
    }

    public function getShareholdingsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/shareholdings';
        return $this;
    }

    public function getDocumentsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/documents';
        return $this;
    }

    public function getMortgagesByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/mortgages';
        return $this;
    }

    //ACCOUNTS
    public function getAccountsByCompanyOrg($company_org)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/accounts';
        return $this;
    }

    public function getAccountsDetailsByOrg($company_org, $account_id, $account_type)
    {
        $this->namespace = self::COMPANY_NAMESPACE . self::SLASH . $company_org . '/accounts/' . $account_id . '/' . $account_type;
        return $this;
    }

    //DIRECTORSHIPS
    public function getAllDirectoshipsFromCompanyOrg($company_org)
    {
        $this->namespace = self::DIRECTORSHIPS_NAMESPACE . self::COMPANY_NAMESPACE . self::SLASH . $company_org;
        return $this;
    }

    public function getServiceAddressesByDirectorshipsId($directorship_id)
    {
        $this->namespace = self::DIRECTORSHIPS_NAMESPACE . self::SLASH . $directorship_id . '/service-addresses';
        return $this;
    }

    public function getDirectorshipsByDirectorId($director_id)
    {
        $this->namespace = self::DIRECTOR_NAMESPACE . self::SLASH . $director_id . self::SLASH . self::DIRECTORSHIPS_NAMESPACE;
        return $this;
    }

    //DIRECTOR	
    public function getDirectorById($director_id)
    {
        $this->namespace = self::DIRECTOR_NAMESPACE . self::SLASH . $director_id;
        return $this;
    }

    //REQUEST INFO
    public function getRequestId()
    {
        if ( !$this->lastRequestId ) {
            throw new DuedilApiException('Request id not found. You need to call method run() before call getRequestId()');
        }

        return $this->lastRequestId;
    }

    public function getRequestDetails($request_id = null)
    {
        if ( !$request_id ) {
            $request_id = $this->getRequestId();
        }

        $result = $this->httpClient->getData(self::REQUEST_DETAILS . self::SLASH . $request_id);

        return $result;
    }

    //SEARCH FUNCTION
    public function searchCompanies($query)
    {
        $this->namespace = self::SEARCH_COMPANIES;
        $this->query = $query;
        return $this;
    }

    public function searchDirectors($query)
    {
        $this->namespace = self::SEARCH_DIRECTORS;
        $this->query = $query;
        return $this;
    }

    public function searchCompaniesByUrl($url)
    {
        //TODO
    }
}

/**
 * Traversal Query Container
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
final class Traversal
{
    private $join;
    private $limit;
    private $offset;
    private $from;
    private $fields;

    private $traversalArray = array();

    private function singleTraversal()
    {
        $single = array();

        if ( !isset($this->from) ) {
            throw new DuedilApiException('Value {get} is mandatory');
        }

        $single[ResponseEnum::FROM] = $this->from;

        if ( isset($this->limit) ) {
            $single[ResponseEnum::LIMIT] = $this->limit;
        }

        if ( isset($this->offset) ) {
            $single[ResponseEnum::OFFSET] = $this->offset;
        }

        if ( isset($this->fields) ) {
            $single[ResponseEnum::FILEDS] = $this->fields;
        }

        if ( isset($this->join) ) {
            $single[ResponseEnum::JOIN] = $this->join;
        }

        //unset old value
        $this->from = null;
        $this->fields = null;
        $this->limit = null;
        $this->offset = null;
        $this->join = null;

        array_push($this->traversalArray, $single);
    }

    public function getAllFields()
    {
        $this->fields = DuedilApiClient::GET_ALL;
        return $this;
    }

    public function getQuery()
    {
        if ( $this->from ) {
            $this->singleTraversal();
        }

        if ( empty($this->traversalArray) ) {
            throw new DuedilApiException('Traversal object is empty');
        }

        return json_encode($this->traversalArray);
    }

    public function setJoin($join)
    {
        $this->join = $join;
        return $this;
    }

    public function join($join)
    {
        return $this->setJoin($join);
    }

    public function setLimit($limit)
    {
        $this->limit = $limit;
        return $this;
    }

    public function setOffset($offset)
    {
        $this->offset = $offset;
        return $this;
    }

    public function setFrom($from)
    {
        if ( $this->from ) {
            $this->singleTraversal();
        }

        $this->from = $from;
        return $this;
    }

    public function get($from)
    {
        return $this->setFrom($from);
    }

    public function setFields($fields)
    {
        if ( is_array($fields) ) {
            $fields = join(DuedilApiClient::COMMA, $fields);
        }

        $this->fields = $fields;
        return $this;
    }

    public function fields($fields)
    {
        return $this->setFields($fields);
    }
}

/**
 * Simple HTTP Client
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
final class HttpClient
{
    const GET = 'GET';

    private $url;

    private $key;

    public function __construct($key, $url)
    {
        $this->key = $key;
        $this->url = $url;
    }

    private function openConnection($path)
    {
        $curl = curl_init();

        $this->setCurlOption($curl, $path);

        $response = curl_exec($curl);

        $code = curl_getinfo($curl, CURLINFO_HTTP_CODE);

        if ( $code == 0 ) {
            throw new DuedilApiException('Error while connecting to ' . $path);
        }

        if ( $code != 200 ) {
            $msg = json_decode($response, true);
            throw new DuedilApiException($msg);
        }

        curl_close($curl);

        return $response;
    }

    private function setCurlOption($curl, $path)
    {
        curl_setopt($curl, CURLOPT_URL, $path);
        curl_setopt($curl, CURLOPT_HEADER, 0);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, TRUE);
        curl_setopt($curl, CURLOPT_FOLLOWLOCATION, 1);
        curl_setopt($curl, CURLOPT_CUSTOMREQUEST, self::GET);
        curl_setopt($curl, CURLOPT_USERAGENT, DuedilApiClient::$version);
        //timeout
        curl_setopt($curl, CURLOPT_CONNECTTIMEOUT, 4);
        curl_setopt($curl, CURLOPT_TIMEOUT, 4);
    }

    private function createRequest($path, $param)
    {
        $url = $this->url . $path . DuedilApiClient::QUESTION_MARK . $param;

        return json_decode($this->openConnection($url), true);
    }

    private function createParamList($param, $limits, $offset, $traversal, $query)
    {
        $params = array();

        if ( $param != null ) {
            $params[ResponseEnum::FILEDS] = $param;
        }

        if ( $limits != null ) {
            $params[ResponseEnum::LIMIT] = $limits;
        }

        if ( $offset != null ) {
            $params[ResponseEnum::OFFSET] = $offset;
        }

        if ( $traversal != null ) {
            $params[ResponseEnum::T] = $traversal;
        }

        if ( $query != null ) {
            $params[ResponseEnum::QUERY] = $query;
        }

        $params[ResponseEnum::API_KEY] = $this->key;

        return http_build_query($params);
    }

    public function getData($path, $param = null, $limits = null, $offset = null, $traversal = null, $query = null)
    {
        $param = $this->createParamList($param, $limits, $offset, $traversal, $query);

        return $this->createRequest($path, $param);
    }
}

/**
 * DuedilApiException
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
final class DuedilApiException extends Exception
{
    private $errorInfo = null;

    public function __construct($message, $code = null, $previous = null)
    {
        if ( is_array($message) ) {
            $this->errorInfo = $message;
            $message = $message[ResponseEnum::MSG];
        }
        parent::__construct($message);
    }

    public function getErrorInfo()
    {
        return $this->errorInfo;
    }

    public function hasErrorInfo()
    {
        $error = false;
        if ( $this->errorInfo ) $error = true;
        return $error;
    }
}

/**
 * ResponseEnum
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
final class ResponseEnum
{
    const RESPONSE = 'response';
    const REQUEST_ID = 'request_id';
    const TRAVERSAL = 'traversal';
    const DATA = 'data';
    const PAGINATION = 'pagination';
    const FILEDS = 'fields';
    const LIMIT = 'limit';
    const OFFSET = 'offset';
    const NAME_SPACE = 'namespace';
    const API_KEY = 'api_key';
    const QUERY = 'query';
    const T = 't';
    const JOIN = 'join';
    const LAST = 'last_result';
    const FROM = 'get';
    const MSG = 'message';
}

/**
 * Traversal Class
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2012 Duedil Ltd.
 *
 */
final class TraversalHelper
{
    public static function getAllCompanyInfo($company_org, DuedilApiClient $duedilApiClient, $limit = 50)
    {
        $traversal = new Traversal();
        $traversal->get('directors')->getAllFields()->setLimit($limit)
            ->get('serviceAddress')->getAllFields()
            ->get('creditRatings')->getAllFields()
            ->get('creditLimits')->getAllFields()
            ->get('mortgages')->getAllFields()
            ->get('bankAccounts')->getAllFields()
            ->get('registeredAddress')->getAllFields()
            ->get('previousCompanyNames')->getAllFields()
            ->get('secondaryIndustries')->getAllFields()
            ->get('shareholdings')->getAllFields();

        return $duedilApiClient->getCompanyByOrg($company_org)->setTraversal($traversal)->getAllFields()->run();
    }

    public static function getAllDirectorInfo($director_id, DuedilApiClient $duedilApiClient, $limit = 50)
    {
        $traversal = new Traversal();
        $traversal->get('company')->join('directorships')->setLimit($limit)->getAllFields()
            ->get('serviceAddress')->join('directorships')->getAllFields();

        return $duedilApiClient->getDirectorById($director_id)->setTraversal($traversal)->getAllFields()->run();
    }
}
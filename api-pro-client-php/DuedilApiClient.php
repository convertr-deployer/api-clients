<?php
/**
 * DuedilApiClient
 * @copyright 2013 Duedil Ltd.
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
 * @copyright 2013 Duedil Ltd.
 *
 */
abstract class AbstractDuedilApiClient
{
    public static $version = 'duedil.api.client-php-2.0';

    const COMPANY = '/company/';

    const COMPANIES = '/companies';

    const DIRECTOR = '/director/';

    const SEARCH_COMPANIES = '/search/companies';

    const SEARCH_DIRECTORS = '/search/directors';

    const REQUEST_DETAILS = '/request-details/';

    const CREDIT = '/credit';

    const GET_ALL = 'get_all';

    const COMMA = ',';

    const QUESTION_MARK = '?';

    /**
     * @var int
     */
    private $limit;

    /**
     * @var int
     */
    private $offset;

    /**
     * @var string
     */
    private $fields;

    /**
     * @var string
     */
    private $traversal;

    /**
     * @var string
     */
    private $pagination;

    /**
     * @var string
     */
    private $traversalResult;

    /**
     * @var string
     */
    protected $requestId;

    /**
     * @var string
     */
    protected $path;

    /**
     * @var string
     */
    protected $query = array();

    /**
     * @var HttpClient
     */
    protected $httpClient;

    /**
     * @param string $key the api key
     * @param string $url the api url
     */
    public function __construct($key, $url = 'http://api.duedil.com/v2/')
    {
        if ( !$key ) {
            throw new DuedilApiException('No API Key found');
        }
        if ( !$url ) {
            throw new DuedilApiException('No API URL found');
        }
        $this->httpClient = new HttpClient($key, $url);
    }

    /**
     * @return mixed
     */
    public function run()
    {
        $result = $this->httpClient->run(
            $this->path, $this->fields, $this->limit, $this->offset, $this->traversal, $this->query
        );

        return $this->cleanupResults($result);
    }

    /**
     * @param $result
     * @return mixed
     */
    private function cleanupResults($result)
    {
        if ( isset($result[ResponseEnum::REQUEST_ID]) ) {
            $this->requestId = ($result[ResponseEnum::REQUEST_ID]);
        }

        if ( isset($result[ResponseEnum::PAGINATION]) ) {
            $this->pagination = $result[ResponseEnum::PAGINATION];
        }

        if ( isset($result[ResponseEnum::TRAVERSAL_RESULT]) ) {
            $this->traversalResult = $result[ResponseEnum::TRAVERSAL_RESULT];
        }
        $this->reset();
        return $result[ResponseEnum::RESPONSE];
    }

    /**
     * Reset the client's properties
     */
    private function reset()
    {
        $this->limit = null;
        $this->offset = null;
        $this->fields = null;
        $this->traversal = null;
    }

    /**
     * @return string
     */
    public function getPagination()
    {
        return $this->pagination;
    }

    /**
     * @return string
     */
    public function getRequestId()
    {
        return $this->requestId;
    }

    /**
     * @return mixed
     */
    public function getTraversalResult()
    {
        return $this->traversalResult;
    }

    /**
     * Check if traversal is available on the endpoint
     *
     * @return bool
     */
    private function isTraversalAllow()
    {
        $traversal = false;

        if ( strpos($this->path, self::COMPANY) === 0 OR strpos($this->path, self::DIRECTOR) === 0 ) {
            $traversal = true;
        }

        return $traversal;
    }

    /**
     * Set the traversal value
     *
     * @param $traversal
     * @return $this
     *
     * @throws DuedilApiException
     */
    public function setTraversal($traversal)
    {
        if ( !$this->isTraversalAllow() ) {
            throw new DuedilApiException(
                'Traversal are allow only on {' . self::COMPANY . '} and {' . self::DIRECTOR . '} endpoints'
            );
        }

        if ( $traversal instanceof Traversal ) {
            $this->traversal = $traversal->getQuery();
        } elseif ( is_array($traversal) ) {
            $this->traversal = json_encode($traversal);
        } else {
            throw new DuedilApiException('Traversal wrong format. Must be an array or an instance of Traversal');
        }
        return $this;
    }

    public function getAllFields()
    {
        $this->fields = self::GET_ALL;
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
}

/**
 * Class DuedilApiClient
 */
final class DuedilApiClient extends AbstractDuedilApiClient
{
    //COMPANIES
    public function getCompanyByOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org;
        return $this;
    }

    public function getPreviousCompanyNameByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/previous-company-names';
        return $this;
    }

    public function getPreviousCompanyDetailsByCompanyOrg($company_org, $old_company_id)
    {
        $this->path = self::COMPANY . $company_org . '/previous-company-names/' . $old_company_id;
        return $this;
    }

    public function getRegisteredAddressByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/registered-address';
        return $this;
    }

    public function getBankAccountsByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/bank-accounts';
        return $this;
    }

    public function getSecondaryIndustriesByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/secondary-industries';
        return $this;
    }

    public function getShareholdingsByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/shareholdings';
        return $this;
    }

    public function getDocumentsByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/documents';
        return $this;
    }

    public function getMortgagesByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/mortgages';
        return $this;
    }

    public function getAccountsByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/accounts';
        return $this;
    }

    public function getAccountsDetailsByOrg($company_org, $account_id)
    {
        $this->path = self::COMPANY . $company_org . '/accounts/' . $account_id;
        return $this;
    }

    public function getSubsidiariesByCompanyOrg($company_org)
    {
        $this->path = self::COMPANY . $company_org . '/subsidiaries';
        return $this;
    }

    public function geCompanyBySubsidiaryOrg($company_org)
    {
        $this->path = '/subsidiary/' . $company_org . '/get-parent';
        return $this;
    }

    //CREDIT
    public function getCreditLimitsByCompanyOrg($company_org)
    {
        $this->path = self::CREDIT . self::COMPANY . $company_org . '/limits';
        return $this;
    }

    public function getCreditRatingsByCompanyOrg($company_org)
    {
        $this->path = self::CREDIT . self::COMPANY . $company_org . '/ratings';
        return $this;
    }

    //DIRECTOR	
    public function getDirectorById($director_id)
    {
        $this->path = self::DIRECTOR . $director_id;
        return $this;
    }

    public function getCompaniesByDirectorsId($director_id)
    {
        $this->path = self::DIRECTOR . $director_id . self::COMPANIES;
        return $this;
    }

    public function getDirectorshipsByDirectorsId($director_id)
    {
        $this->path = self::DIRECTOR . $director_id . '/directorships';
        return $this;
    }

    public function getServiceAddressByDirectorsId($director_id)
    {
        $this->path = self::DIRECTOR . $director_id . '/service-addresses';
        return $this;
    }

    public function countCompaniesByDirectorsId($director_id)
    {
        $this->path = self::DIRECTOR . $director_id . self::COMPANIES . '/count';
        return $this;
    }

    //REQUEST ID
    public function getRequestDetails($request_id = null)
    {
        if ( !$request_id ) {
            $request_id = $this->getRequestId();
        }

        if ( !$request_id ) {
            throw new DuedilApiException('Request id not found. You need to call method run() before call getRequestId()');
        }

        return $this->httpClient->run(self::REQUEST_DETAILS . $request_id);
    }

    //SEARCH FUNCTION
    public function searchCompanies($query)
    {
        $this->path = self::SEARCH_COMPANIES;
        $this->query = array('query' => $query);
        return $this;
    }

    public function searchDirectors($query)
    {
        $this->path = self::SEARCH_DIRECTORS;
        $this->query = array('query' => $query);
        return $this;
    }

    public function searchCompaniesByUrl($url)
    {
        $this->path = self::SEARCH_COMPANIES;
        $this->query = array('url' => $url);
        return $this;
    }
}

/**
 * Traversal Query Container
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
 *
 */
final class Traversal
{
    /**
     * @var
     */
    private $limit;

    /**
     * @var
     */
    private $offset;

    /**
     * @var
     */
    private $get;

    /**
     * @var
     */
    private $fields;

    /**
     * @var array
     */
    private $value = array();

    private function singleTraversal()
    {
        $single = array();

        if ( !isset($this->get) ) {
            throw new DuedilApiException('Value {get} is mandatory');
        }

        $single[ResponseEnum::FROM] = $this->get;

        if ( isset($this->limit) ) {
            $single[ResponseEnum::LIMIT] = $this->limit;
        }

        if ( isset($this->offset) ) {
            $single[ResponseEnum::OFFSET] = $this->offset;
        }

        if ( isset($this->fields) ) {
            $single[ResponseEnum::FILEDS] = $this->fields;
        }

        //unset old value
        $this->get = null;
        $this->fields = null;
        $this->limit = null;
        $this->offset = null;

        array_push($this->value, $single);
    }

    public function getAllFields()
    {
        $this->fields = DuedilApiClient::GET_ALL;
        return $this;
    }

    public function getQuery()
    {
        if ( $this->get ) {
            $this->singleTraversal();
        }

        if ( empty($this->value) ) {
            throw new DuedilApiException('Traversal object is empty');
        }

        return json_encode($this->value);
    }

    public function limit($limit)
    {
        $this->limit = $limit;
        return $this;
    }

    public function offset($offset)
    {
        $this->offset = $offset;
        return $this;
    }

    public function get($get)
    {
        if ( $this->get ) {
            $this->singleTraversal();
        }

        $this->get = $get;
        return $this;
    }

    public function fields($fields)
    {
        if ( is_array($fields) ) {
            $fields = join(DuedilApiClient::COMMA, $fields);
        }

        $this->fields = $fields;
        return $this;
    }
}

/**
 * Simple HTTP Client
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
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

    private function execute($path)
    {
        $curl = $this->createCurl($path);

        $response = curl_exec($curl);

        $code = curl_getinfo($curl, CURLINFO_HTTP_CODE);

        if ( $code == 0 ) {
            throw new DuedilApiException('Error while connecting to ' . $path);
        }

        if ( $code != 200 ) {
            throw new DuedilApiException(json_decode($response, true));
        }

        curl_close($curl);

        return $response;
    }

    private function createCurl($path)
    {
        $curl = curl_init();
        curl_setopt($curl, CURLOPT_URL, $path);
        curl_setopt($curl, CURLOPT_HEADER, 0);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
        curl_setopt($curl, CURLOPT_FOLLOWLOCATION, 1);
        curl_setopt($curl, CURLOPT_CUSTOMREQUEST, self::GET);
        curl_setopt($curl, CURLOPT_USERAGENT, DuedilApiClient::$version);
        //timeout
        curl_setopt($curl, CURLOPT_CONNECTTIMEOUT, 4);
        curl_setopt($curl, CURLOPT_TIMEOUT, 4);
        return $curl;
    }

    private function callEndpoint($path, $param)
    {
        return json_decode(
            $this->execute($this->url . $path . DuedilApiClient::QUESTION_MARK . $param), true
        );
    }

    private function createParamList($param, $limits, $offset, $traversal, array $query)
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
            $key = key($query);
            $params[$key] = $query[$key];
        }

        $params[ResponseEnum::API_KEY] = $this->key;

        return http_build_query($params);
    }

    public function run($path, $param = null, $limits = null, $offset = null, $traversal = null, $query = null)
    {
        return $this->callEndpoint(
            $path, $this->createParamList($param, $limits, $offset, $traversal, $query)
        );
    }
}

/**
 * DuedilApiException
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
 *
 */
final class DuedilApiException extends Exception
{
    private $msg;

    public function __construct($message, $code = null, $previous = null)
    {
        if ( is_array($message) ) {
            $this->msg = $message;
            $message = $message[ResponseEnum::MSG];
        }
        parent::__construct($message);
    }

    public function getMsg()
    {
        return $this->msg;
    }
}

/**
 * ResponseEnum
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
 *
 */
final class ResponseEnum
{
    const RESPONSE = 'response';
    const REQUEST_ID = 'request_id';
    const TRAVERSAL = 'traversal';
    const TRAVERSAL_RESULT = 'traversals';
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
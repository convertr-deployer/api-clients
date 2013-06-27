<?php
/**
 * DuedilOpenApiClient
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
    throw new DuedilOpenApiException('Duedil Open Api Client needs PHP version >= 5.2.0');
}
if ( !function_exists('curl_init') ) {
    throw new DuedilOpenApiException('Duedil Open Api  Client needs the CURL PHP extension.');
}
if ( !function_exists('json_decode') ) {
    throw new DuedilOpenApiException('Duedil Open Api  Client needs the JSON PHP extension.');
}

/**
 * The main class DuedilOpenApiClient
 */
class DuedilOpenApiClient
{
    const VERSION = '0.1';
    const SLASH = '/';
    const FORMAT = '.json';
    const SEARCH = 'search';

    /**
     * @var HttpClient
     */
    private $httpClient;

    /**
     * @var string the API uri
     */
    private $uri;

    /**
     * The "pagination" of the search endpoint
     * @var string
     */
    private $pagination;

    /**
     * @param string $key your API key
     */
    public function __construct($key, $uri = 'http://api.duedil.com/open')
    {
        if ( !$key ) {
            throw new DuedilOpenApiException('You need a valid key');
        }

        $this->uri = $uri;
        $this->httpClient = new HttpClient($key);
    }

    /**
     * Get company by locale and org id
     *
     * @param string $locale the company's locale
     * @param string $org the companys's org id
     *
     * @return Company Object
     *
     * @throws DuedilOpenApiException
     */
    public function getCompany($locale, $org)
    {
        if ( !$locale or !$org ) {
            throw new DuedilOpenApiException('Locale and Org id are mandatory fields');
        }

        $company = $this->httpClient->callEndpoint(
            $this->uri . self::SLASH . $locale . self::SLASH . 'company' . self::SLASH . $org . self::FORMAT
        );

        return Populate::arrayToEntity($company, new Company());
    }

    /**
     * Search companies with name $query
     *
     * NB the open search function is limited to only 5 results!
     *
     * @param string $query the query param
     *
     * @return array of Company
     *
     * @throws DuedilOpenApiException
     */
    public function searchCompanies($query, $limit = null, $offest = null)
    {
        if ( !$query ) {
            throw new DuedilOpenApiException('Locale and Org id are mandatory fields');
        }

        $params = array( 'q' => $query, 'limit' =>  $limit, 'offset' => $offest );

        $companies = $this->httpClient->callEndpoint($this->uri . self::SLASH . self::SEARCH, $params);

        $this->pagination = $companies['response']['pagination'];

        return Populate::arrayToCollectionOfEntities($companies['response']['data'], new Company());
    }

    /**
     * @return string
     */
    public function getPagination()
    {
        return $this->pagination;
    }
}

/**
 * DuedilOpenApiException
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
 *
 */
final class DuedilOpenApiException extends Exception
{
    function __construct($error)
    {
        if ( is_array($error) ) {
            parent::__construct($error['message'], $error['status_code']);
        } else {
            parent::__construct($error);
        }
    }
}

/**
 * Class DuedilOpenApiHelper
 * A simple helper to transform locale description into locale code
 */
final class DuedilOpenApiHelper
{
    public static function fromDescriptionToLocale($string)
    {
        $locale = 'uk';
        switch (strtolower($string)) {
            case 'republic of ireland':
                break;
        }
        return $locale;
    }
}

/**
 * Basic HTTP Client
 *
 * @author Duedil Ltd <api@duedil.com>
 * @copyright 2013 Duedil Ltd.
 *
 */
final class HttpClient
{
    const GET = 'GET';
    const API_KEY = 'api_key';
    const QUERY = 'q';
    const SEPARATOR = '?';

    /**
     * @var string the endpoint URL
     */
    private $url;

    /**
     * @var string A valid open API key
     */
    private $key;

    /**
     * @param string $key the user api key
     */
    public function __construct($key)
    {
        $this->key = $key;
    }

    /**
     * Open the connection on $path
     *
     * @param string $path to API
     *
     * @return string json string response
     *
     * @throws DuedilOpenApiException
     */
    private function openConnection($path)
    {
        $curl = $this->createCurl($path);

        $response = curl_exec($curl);

        $code = curl_getinfo($curl, CURLINFO_HTTP_CODE);

        if ( $code == 0 ) {
            throw new DuedilOpenApiException('Error while connecting to ' . $path);
        }

        if ( $code != 200 ) {
            throw new DuedilOpenApiException(json_decode($response, true));
        }

        curl_close($curl);

        return $response;
    }

    /**
     * Create the CURL resource
     *
     * @param $path string the endpoint path
     *
     * @return resource
     */
    private function createCurl($path)
    {
        $curl = curl_init();
        curl_setopt($curl, CURLOPT_URL, $path);
        curl_setopt($curl, CURLOPT_HEADER, 0);
        curl_setopt($curl, CURLOPT_RETURNTRANSFER, TRUE);
        curl_setopt($curl, CURLOPT_FOLLOWLOCATION, 1);
        curl_setopt($curl, CURLOPT_CUSTOMREQUEST, self::GET);
        curl_setopt($curl, CURLOPT_USERAGENT, DuedilOpenApiClient::VERSION);
        //timeout
        curl_setopt($curl, CURLOPT_CONNECTTIMEOUT, 4);
        curl_setopt($curl, CURLOPT_TIMEOUT, 4);
        return $curl;
    }

    /**
     * Run the request
     *
     * @param string $path the request path
     * @param string $param the request params
     *
     * @return array | null the response in array format
     */
    private function createRequest($path, $param)
    {
        return json_decode($this->openConnection($this->url . $path  . self::SEPARATOR  . $param), true);
    }

    /**
     * Create the params
     *
     * @param $query
     *
     * @return string
     */
    private function createParamList($query)
    {
        if ( $query ) {
            $query[self::API_KEY] = $this->key;
        } else {
            $query = array();
            $query[self::API_KEY] = $this->key;
        }

        return http_build_query($query);
    }

    /**
     * Open the connection towards the endpoint
     *
     * @param string $path the endpoint URI
     * @param string |null $query the endpoint param
     *
     * @return array | null the endpoint response
     */
    public function callEndpoint($path, $query = null)
    {
        return $this->createRequest($path, $this->createParamList($query));
    }
}

/**
 * The "Company" class domain
 */
final class Company
{
    private $duedilUrl;
    private $companyNumber;
    private $name;
    private $nameFormatted;
    private $registeredAddress;
    private $category;
    private $status;
    private $locale;
    private $previousNames;
    private $sicCodes;
    private $incorporationDate;
    private $accounts;
    private $returns;
    private $link;
    private $uri;

    public function setUri($uri)
    {
        $this->uri = $uri;
    }

    public function getUri()
    {
        return $this->uri;
    }

    public function setLink($link)
    {
        $this->link = $link;
    }

    public function getLink()
    {
        return $this->link;
    }

    public function setAccounts($accounts)
    {
        $this->accounts = $accounts;
    }

    public function getAccounts()
    {
        return $this->accounts;
    }

    public function setCategory($category)
    {
        $this->category = $category;
    }

    public function getCategory()
    {
        return $this->category;
    }

    public function setCompanyNumber($companyNumber)
    {
        $this->companyNumber = $companyNumber;
    }

    public function getCompanyNumber()
    {
        return $this->companyNumber;
    }

    public function setDuedilUrl($duedilUrl)
    {
        $this->duedilUrl = $duedilUrl;
    }

    public function getDuedilUrl()
    {
        return $this->duedilUrl;
    }

    public function setIncorporationDate($incorporationDate)
    {
        $this->incorporationDate = $incorporationDate;
    }

    public function getIncorporationDate()
    {
        return $this->incorporationDate;
    }

    public function setLocale($locale)
    {
        $this->locale = $locale;
    }

    public function getLocale()
    {
        return $this->locale;
    }

    public function setName($name)
    {
        $this->name = $name;
    }

    public function getName()
    {
        return $this->name;
    }

    public function setNameFormatted($nameFormatted)
    {
        $this->nameFormatted = $nameFormatted;
    }

    public function getNameFormatted()
    {
        return $this->nameFormatted;
    }

    public function setPreviousNames($previousNames)
    {
        $this->previousNames = $previousNames;
    }

    public function getPreviousNames()
    {
        return $this->previousNames;
    }

    public function setRegisteredAddress($registeredAddress)
    {
        $this->registeredAddress = $registeredAddress;
    }

    public function getRegisteredAddress()
    {
        return $this->registeredAddress;
    }

    public function setReturns($returns)
    {
        $this->returns = $returns;
    }

    public function getReturns()
    {
        return $this->returns;
    }

    public function setSicCodes($sicCodes)
    {
        $this->sicCodes = $sicCodes;
    }

    public function getSicCodes()
    {
        return $this->sicCodes;
    }

    public function setStatus($status)
    {
        $this->status = $status;
    }

    public function getStatus()
    {
        return $this->status;
    }

}

final class Populate
{
    const SET = 'set';

    /**
     * Populate $entity with $array values
     *
     * @param array $array
     *
     * @param Object $entity
     *
     * @return Object
     *
     * @throws DuedilOpenApiException
     */
    public static function arrayToEntity(array $array, $entity)
    {
        foreach ( $array as $k => $v ) {
            if ( ($v != null and $v != '') ) {
                $method = self::facadePurifyString($k);
                if ( !method_exists($entity, $method) ) {
                    throw new DuedilOpenApiException(
                        'Method [' . $method . '] class [' . get_class($entity) . '] key [' . $k . '] not found'
                    );
                }
                $entity->$method($v);
            }
            unset($array[$k]);
        }

        if ( sizeof($array) != 0 ) {
            throw new DuedilOpenApiException('Can not transform the array into an entity');
        }

        return $entity;
    }

    /**
     * Purify the Method's name
     *
     * @param $method
     *
     * @return mixed
     */
    private static function facadePurifyString($method)
    {
        return self::toCamelCase(self::getSetterName($method));
    }

    /**
     * Populate array with $entity with $array values
     *
     * @param array $array
     * @param $entity
     *
     * @return array
     */
    public static function arrayToCollectionOfEntities(array $array, $entity)
    {
        $value = array();
        foreach ( $array as $v ) {
            $value[] = self::arrayToEntity($v, clone $entity);
        }
        return $value;
    }

    /**
     * Get setter name from index name
     *
     * @param string $key
     *
     * @return string
     */
    private static function getSetterName($key)
    {
        return self::SET . ucfirst(strtolower($key));
    }

    /**
     * Method to Camel Case
     *
     * @param $string
     * @param bool $capitalizeFirstCharacter
     *
     * @return mixed
     */
    public static function toCamelCase($string, $capitalizeFirstCharacter = false)
    {
        $str = str_replace(' ', '', ucwords(str_replace('_', ' ', $string)));

        if ( !$capitalizeFirstCharacter ) {
            $str[0] = strtolower($str[0]);
        }

        return $str;
    }
}
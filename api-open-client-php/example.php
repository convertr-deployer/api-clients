<?php
include_once 'DuedilOpenApiClient.php';

/**
 * Open Api Key
 * Get it from developer.duedil.com
 */
$api_key = 'YOUR_API_KEY';

$client = new DuedilOpenApiClient($api_key);

foreach ( $client->searchCompanies('duedil') as $company ) {
    var_dump($client->getPagination());
    $locale = DuedilOpenApiHelper::fromDescriptionToLocale($company->getLocale());
    var_dump($client->getCompany($locale, $company->getCompanyNumber()));
    //the open api is limited to 2 calls par second
    sleep(1);
}
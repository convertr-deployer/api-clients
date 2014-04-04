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
error_reporting(E_ALL);
ini_set("display_errors", 1);

include_once 'DuedilApiClient.php';

$duedilApiClient = new AdvancedSearchDuedilApiClient('YOUR_API_KEY');

//Searching companies with name matching "tesco", a turnover of {0,10000}, a cashof {0,10000} and "uk" as locale order by turover ASC
try {
    var_dump(
        $duedilApiClient
            ->searchCompanies('tesco')
            ->setTerms(SearchFields::LOCALE,'uk')
            ->setRange(SearchFields::TURNOVER, 0, 10000)
            ->setRange(SearchFields::CASH, 0, 10000)
            ->orderBy(SearchFields::TURNOVER, SearchFields::ASC)
            ->run()
    );

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Searching companies with postcode 'EC1R 5EY' limit to first 5 results
try {
    var_dump(
        $duedilApiClient
            ->searchCompanies()
            ->setTerms(SearchFields::POSTCODE, 'EC1R 5EY')
            ->setLimit(5)
            ->run(),
        $duedilApiClient->getPagination()
    );

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}
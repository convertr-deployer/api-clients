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

$duedilApiClient = new DuedilApiClient('YOUR_API_KEY');
$company_org = 'SC193794';
$director_id = '914039209';

//Company
try {
    var_dump(
        $duedilApiClient
            ->getCompanyByOrg($company_org)
            ->setLimit(2)
            ->setOffset(3)
            ->run()
    );

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Directors
try {
    var_dump(
        $duedilApiClient
            ->getDirectorById($director_id)
            ->run()
    );

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Traversal
try {
    $traversal = array(
        array('get' => 'directors'),
        array('get' => 'documents', 'limit' => '1')
    );
    $duedilApiClient
        ->getCompanyByOrg($company_org)
        ->setTraversal($traversal)
        ->run();

    var_dump($duedilApiClient->getTraversalResult());

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Search companies matching 'google'
try {
    $query = 'google';
    var_dump(
        $duedilApiClient
        ->searchCompanies($query)
        ->run()
    );
} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Search companies matching url 'google.com'
try {
    $query = 'google.co.uk';
    var_dump(
        $duedilApiClient
            ->searchCompaniesByUrl($query)
            ->run()
    );
} catch (DuedilApiException $e) {
    echo $e->getMessage();
}

//Exception
try {
    var_dump(
        $duedilApiClient
            ->getCompanyByOrg('ABC-123')
            ->run()
    );

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}
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
error_reporting(E_ALL);
ini_set("display_errors", 1);

include_once 'DuedilApiClient.php';
include_once 'credential.php';

$duedilApiClient = new DuedilApiClient($api_key, $api_url);

try {
    $company_org = 'SC193794';
    $director_id = '914039209';

    //Company details
    print_r($duedilApiClient->getCompanyByOrg($company_org)->getAllFields()->run());

    print_r($duedilApiClient->getDocumentsByCompanyOrg($company_org)->setLimit(2)->run());

    print_r($duedilApiClient->getShareholdingsByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getCreditLimitsByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getCreditRatingsByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getPreviousCompanyNameByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getRegisteredAddressByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getBankAccountsByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getSecondaryIndustriesByCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getMortgagesByCompanyOrg($company_org)->setLimit(2)->run());

    //Accounts
    $account = $duedilApiClient->getAccountsByCompanyOrg($company_org)->setLimit(2)->run();
    print_r($account);

    $account_id = $account['response']['data'][0]['id'];
    $account_type = $account['response']['data'][0]['accounts_type'];
    print_r($duedilApiClient->getAccountsDetailsByOrg($company_org, $account_id, $account_type)->run());

    //Directors and directorships
    print_r($duedilApiClient->getDirectorById($director_id)->run());

    print_r($duedilApiClient->getAllDirectoshipsFromCompanyOrg($company_org)->run());

    print_r($duedilApiClient->getServiceAddressesByDirectorshipsId($director_id)->setLimit(2)->run());

} catch (DuedilApiException $e) {
    echo $e->getMessage();
}
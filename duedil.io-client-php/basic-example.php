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

$duedilApiClient = new DuedilApiClient('USER_API_KEY');

try {	
	$company_id = 'SC193794';
	$director_id = '914039209';
	
	//Company details
	print_r($duedilApiClient->getCompanyById($company_id)->getAllFields()->run());
	
	print_r($duedilApiClient->getDocumentsByCompanyId($company_id)->setLimit(2)->run());		
				
	print_r($duedilApiClient->getShareholdingsByCompanyId($company_id)->run());	
	
	print_r($duedilApiClient->getCreditLimitsByCompanyId($company_id)->run());	
	
	print_r($duedilApiClient->getCreditRatingsByCompanyId($company_id)->run());	

	print_r($duedilApiClient->getPreviousCompanyNameByCompanyId($company_id)->run());	
	
	print_r($duedilApiClient->getRegisteredAddressByCompanyId($company_id)->run());	
	
	print_r($duedilApiClient->getBankAccountsByCompanyId($company_id)->run());	

	print_r($duedilApiClient->getSecondaryIndustriesByCompanyId($company_id)->run());	
		
	print_r($duedilApiClient->getMortgagesByCompanyId($company_id)->setLimit(2)->run());	
	
	//Accounts
	$account = $duedilApiClient->getAccountsByCompanyId($company_id)->setLimit(2)->run();
	print_r($account);	
	
	$account_id = $account['response']['data'][0]['id'];
	$account_type = $account['response']['data'][0]['accounts_type'];
	print_r($duedilApiClient->getAccountsDetailsById($company_id, $account_id, $account_type)->run());
	
	//Directors and directorships 
	print_r($duedilApiClient->getDirectorById($director_id)->run());	
	
	print_r($duedilApiClient->getAllDirectoshipsFromCompanyId($company_id)->run());	
	
	print_r($duedilApiClient->getServiceAddressesByDirectorshipsId($director_id)->setLimit(2)->run());	

} catch (DuedilApiException $e) {	
	echo $e->getMessage();
}

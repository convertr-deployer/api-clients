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
	$company_id = 'SC193794';

	//get company details..
	print_r($duedilApiClient->getCompanyByOrg($company_id)->run());

	//...and print request ID
	print_r($duedilApiClient->getRequestDetails());

	//get request details of a generic ID
	$request_id = $duedilApiClient->getRequestId();
	
	print_r($duedilApiClient->getRequestDetails($request_id));
	
} catch (DuedilApiException $e) {	
	echo $e->getMessage();
}
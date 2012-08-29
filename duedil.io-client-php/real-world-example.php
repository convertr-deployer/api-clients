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
	//search for company duedil and get the id
	$q = 'duedil';
	$duedil = $duedilApiClient->searchCompanies($q)->setLimit(1)->run();
	$duedil_id = $duedil['response']['data'][0]['id'];
	
	//get all the info for company duedil
	$allInfo = TraversalHelper::getAllCompanyInfo($duedil_id, $duedilApiClient);
	print_r($allInfo);
			
	//get the directors for company duedil	
	$directors = $allInfo['traversal']['directors'];
	
	//get all the directors info
	foreach ($directors as $key => $director) {
		print_r(TraversalHelper::getAllDirectorInfo($director['id'], $duedilApiClient));
	}
	
} catch (DuedilApiException $e) {	
	echo $e->getMessage();
}

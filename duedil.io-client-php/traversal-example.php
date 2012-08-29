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
	
	//company id duedil
	$company_id = 'SC193794';
	
	//Get directors, serviceAddress, creditRatings, creditLimits and shareholdings
	$traversal  = new Traversal();	
	$traversal->get('directors')->join('directorships')->getAllFields()->setLimit(5)
		->get('serviceAddress')->join('directorships')->getAllFields()->setLimit(5)->setOffset(10)
		->get('creditRatings')->fields('description, creditRating')
		->get('creditLimits')
		->get('shareholdings');

	//for company $company_id
	print_r( 
		$duedilApiClient->getCompanyById($company_id)->setTraversal($traversal)->run()
	);	
		
	//Traversal can be also a simple array
	$traversal = array (
                    array (
                        'from' => 'directors',
                        'join' => 'directorships',
                        'fields' => 'get_all',
                        'limit' => 5
                    ),
                    array (
                        'from' => 'serviceAddress',
                        'join' => 'directorships',
                        'fields' => 'get_all',
                        'limit' => 5,
                        'offset' => 10
                    ),
                    array (
                        'from' => 'creditRatings',
                        'fields' => 'description, creditRating'
                    ),
                    array (
                        'from' => 'creditLimits'
                    ),
                    array (
                        'from' => 'shareholdings'
                    )
               );
	
	print_r( 
		$duedilApiClient->getCompanyById($company_id)->setTraversal($traversal)->run()
	);
	
} catch (DuedilApiException $e) {	
	echo $e->getMessage();
}

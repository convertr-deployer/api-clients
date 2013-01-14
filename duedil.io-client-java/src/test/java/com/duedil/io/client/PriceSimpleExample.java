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
package com.duedil.io.client;

import com.duedil.io.client.entity.DuedilRayCompanies;
import com.duedil.io.client.entity.DuedilRequestPrice;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class PriceSimpleExample {

    private static final String COMPANY_ID = "SC193794";
    private static final String REQUEST_ID = "5034e93249b10";

    public static void main (String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {

            //do the request and get the price
            DuedilRayCompanies company = duedilApiClient.getCompanyByOrg(COMPANY_ID);
            DuedilRequestPrice price = duedilApiClient.getRequestDetails();
            System.out.println(price);

            //get price for a generic request
            price = duedilApiClient.getRequestDetails(REQUEST_ID);
            System.out.println(price);

        } catch (DuedilClientException e) {
            System.out.println(e.getMessage());
        }

    }
}

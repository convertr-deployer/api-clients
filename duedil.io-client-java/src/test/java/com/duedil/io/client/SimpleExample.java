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
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class SimpleExample {

    private static final String COMPANY_UK = "SC193794";
    private static final String COMPANY_ROI = "IE384137";

    public static void main (String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {
            //get company info and request price
            DuedilRayCompanies company_uk = duedilApiClient.getAllFields().getCompanyById(COMPANY_UK);
            System.out.println(company_uk);
            System.out.println(duedilApiClient.getRequestDetails());

            //get company info of a non-uk company_uk
            duedilApiClient.setLocale("ROI");
            DuedilRayCompanies company_roi = duedilApiClient.getAllFields().getCompanyById(COMPANY_ROI);
            System.out.println(company_roi);
            System.out.println(duedilApiClient.getRequestDetails());

        } catch (DuedilClientException e) {
            e.printStackTrace();
        }
    }

}

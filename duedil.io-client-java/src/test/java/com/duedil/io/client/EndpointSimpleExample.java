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

import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class EndpointSimpleExample {

    private static final String COMPANY_ID = "SC193794";
    private static final String DIRECTOR_ID = "914039209";
    private static final String DIRECTORSHIP_ID = "06999618_914039209_False_None";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {

            //Credit limits from company id
            List<DuedilRayCreditLimits> creditLimits = duedilApiClient.getAllFields().getCreditLimitsByCompanyId(COMPANY_ID);
            for (DuedilRayCreditLimits credit :creditLimits) {
                System.out.println(credit);
            }

            //DuedilRayBankAccounts
            List<DuedilRayBankAccounts> bankAccounts = duedilApiClient.getAllFields().getBankAccountsByCompanyId(COMPANY_ID);
            for (DuedilRayBankAccounts bankAccount : bankAccounts) {
                System.out.println(bankAccount);
            }

            //DuedilRayCreditRatings
            List<DuedilRayCreditRatings> creditRatings = duedilApiClient.getAllFields().getCreditRatingsByCompanyId(COMPANY_ID);
            for (DuedilRayCreditRatings creditRating : creditRatings) {
                System.out.println(creditRating);
            }

            //DuedilRayRegisteredAddresses
            List<DuedilRayRegisteredAddresses> registeredAddresses = duedilApiClient.getAllFields().getRegisteredAddressByCompanyId(COMPANY_ID);
            for (DuedilRayRegisteredAddresses addresses : registeredAddresses) {
                System.out.println(addresses);
            }

            //DuedilRayShareholdings
            List<DuedilRayShareholdings> shareholdings = duedilApiClient.getAllFields().getShareholdingsByCompanyId(COMPANY_ID);
            for (DuedilRayShareholdings shareholding : shareholdings) {
                System.out.println(shareholding);
            }

            //Directorships by company ID
            List<DuedilRayDirectorships> directorshipsByCompanyId = duedilApiClient.getAllFields().getAllDirectoshipsFromCompanyId(COMPANY_ID);
            for (DuedilRayDirectorships directorship: directorshipsByCompanyId) {
                System.out.println(directorship);
            }

            DuedilRayDirectors directorsById = duedilApiClient.getAllFields().getDirectorById(DIRECTOR_ID);
            System.out.println(directorsById);

            //Previous company name
            List<DuedilRayPreviousCompanyNames> previousCompanyNames = duedilApiClient.getAllFields().getPreviousCompanyNameByCompanyId(COMPANY_ID);
            for (DuedilRayPreviousCompanyNames name : previousCompanyNames) {
                System.out.println(name);
            }

            //Documents
            List<DuedilRayUkDocuments> ukDocuments = duedilApiClient.getAllFields().getDocumentsByCompanyId(COMPANY_ID);
            for (DuedilRayUkDocuments document : ukDocuments) {
                System.out.println(document);
            }

            //Service Address
            DuedilRayServiceAddresses serviceAddresses = duedilApiClient.getAllFields().getServiceAddressesByDirectorshipsId(DIRECTORSHIP_ID);
            System.out.println(serviceAddresses);


            //Mortgages
            List<DuedilRayUkMortgages> ukMortgages = duedilApiClient.getAllFields().getMortgagesByCompanyId(COMPANY_ID);
            for (DuedilRayUkMortgages mortgage : ukMortgages) {
                System.out.println(mortgage);
            }

            //DuedilRaySecondaryIndustries
            List<DuedilRaySecondaryIndustries> secondaryIndustries = duedilApiClient.getAllFields().getSecondaryIndustriesByCompanyId(COMPANY_ID);
            for (DuedilRaySecondaryIndustries duedilRaySecondaryIndustry : secondaryIndustries) {
                System.out.println(duedilRaySecondaryIndustry);
            }

        } catch (DuedilClientException e) {
            e.printStackTrace();
        }
    }
}

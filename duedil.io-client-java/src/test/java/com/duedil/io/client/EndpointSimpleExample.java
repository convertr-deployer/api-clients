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

    private static final String COMPANY_ORG = "SC193794";
    private static final String DIRECTOR_ID = "914039209";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {

            //Credit limits from company org
            List<DuedilRayCreditLimits> creditLimits = duedilApiClient.getAllFields().getCreditLimitsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayCreditLimits credit :creditLimits) {
                System.out.println(credit);
            }

            //DuedilRayBankAccounts
            List<DuedilRayBankAccounts> bankAccounts = duedilApiClient.getAllFields().getBankAccountsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayBankAccounts bankAccount : bankAccounts) {
                System.out.println(bankAccount);
            }

            //DuedilRayCreditRatings
            List<DuedilRayCreditRatings> creditRatings = duedilApiClient.getAllFields().getCreditRatingsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayCreditRatings creditRating : creditRatings) {
                System.out.println(creditRating);
            }

            //DuedilRayRegisteredAddresses
            List<DuedilRayRegisteredAddresses> registeredAddresses = duedilApiClient.getAllFields().getRegisteredAddressByCompanyOrg(COMPANY_ORG);
            for (DuedilRayRegisteredAddresses addresses : registeredAddresses) {
                System.out.println(addresses);
            }

            //DuedilRayShareholdings
            List<DuedilRayShareholdings> shareholdings = duedilApiClient.getAllFields().getShareholdingsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayShareholdings shareholding : shareholdings) {
                System.out.println(shareholding);
            }

            DuedilRayDirectors directorsById = duedilApiClient.getAllFields().getDirectorById(DIRECTOR_ID);
            System.out.println(directorsById);

            //Previous company name
            List<DuedilRayPreviousCompanyNames> previousCompanyNames = duedilApiClient.getAllFields().getPreviousCompanyNameByCompanyOrg(COMPANY_ORG);
            for (DuedilRayPreviousCompanyNames name : previousCompanyNames) {
                System.out.println(name);
            }

            //Documents
            List<DuedilRayUkDocuments> ukDocuments = duedilApiClient.getAllFields().getDocumentsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayUkDocuments document : ukDocuments) {
                System.out.println(document);
            }

            //DuedilRaySecondaryIndustries
            List<DuedilRaySecondaryIndustries> secondaryIndustries = duedilApiClient.getAllFields().getSecondaryIndustriesByCompanyOrg(COMPANY_ORG);
            for (DuedilRaySecondaryIndustries duedilRaySecondaryIndustry : secondaryIndustries) {
                System.out.println(duedilRaySecondaryIndustry);
            }

            //Mortgages
            List<DuedilRayUkMortgages> ukMortgages = duedilApiClient.getAllFields().getMortgagesByCompanyOrg(COMPANY_ORG);
            for (DuedilRayUkMortgages mortgage : ukMortgages) {
                System.out.println(mortgage);
            }

        } catch (DuedilClientException e) {
            e.printStackTrace();
        }
    }
}

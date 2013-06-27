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

            //Subsidiaries
            List<DuedilCompaniesSearch> companies = duedilApiClient.getAllFields().getSubsidiariesByCompanyOrg(COMPANY_ORG);
            for (DuedilCompaniesSearch company : companies) {
                System.out.println(company);
            }

            //Directorships
            List<DuedilRayDirectorships> directorships = duedilApiClient.getAllFields().getDirectorshipsByCompanyOrg(COMPANY_ORG);
            for (DuedilRayDirectorships directorship : directorships) {
                System.out.println(directorship);
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

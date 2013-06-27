package com.duedil.io.client;

import com.duedil.io.client.entity.DuedilCompaniesSearch;
import com.duedil.io.client.entity.DuedilRayCompanies;
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
public class SimpleExample {

    private static final String COMPANY_ORG = "SC193794";

    private static final String DIRECTOR_ID = "914039209";


    public static void main (String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {
            //get subsidiary info and request details
            List<DuedilCompaniesSearch> subsidiaries = duedilApiClient.getSubsidiariesByCompanyOrg(COMPANY_ORG);
            for (DuedilCompaniesSearch subsidiary : subsidiaries) {
                DuedilRayCompanies parent = duedilApiClient.getParentCompanyBySubsidiaryOrg(subsidiary.getId());
                System.out.println("Parent ID " + parent.getId() + " and Sub ID " + subsidiary.getId());
            }

        } catch (DuedilClientException e) {
            e.printStackTrace();
        }
    }

}

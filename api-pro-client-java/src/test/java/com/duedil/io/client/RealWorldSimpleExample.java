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
public class RealWorldSimpleExample {

    private static final String QUERY = "arsenal";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient) context.getBean("duedilApiClient");

        try {
            //Search for a company and get the info
            List<DuedilCompaniesSearch> companies = duedilApiClient.setLimit(1).searchCompanies(QUERY);
            DuedilRayCompanies duedil = duedilApiClient.getAllFields().getCompanyByOrg(companies.get(0).getId());
            System.out.println("Company name: " + duedil.getName());

        } catch (DuedilClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
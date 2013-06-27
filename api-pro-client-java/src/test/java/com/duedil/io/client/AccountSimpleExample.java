package com.duedil.io.client;

import com.duedil.io.client.entity.DuedilRayAccounts;
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
public class AccountSimpleExample {

    private static final String COMPANY_ID = "SC193794";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient)context.getBean("duedilApiClient");

        try {
            //Accounts
            List<DuedilRayAccounts> accounts = duedilApiClient.getAccountsByCompanyOrg(COMPANY_ID);
            for (DuedilRayAccounts account : accounts) {
                System.out.println(
                        duedilApiClient.getAllFields().getAccountsDetailsByAccountId(COMPANY_ID, account.getId())
                );
            }

        } catch (DuedilClientException e) {
            e.printStackTrace();
        }
    }
}

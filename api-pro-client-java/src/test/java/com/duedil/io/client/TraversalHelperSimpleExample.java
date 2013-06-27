package com.duedil.io.client;

import com.duedil.io.client.entity.DuedilRayCompanies;
import com.duedil.io.client.entity.DuedilRayDirectors;
import com.duedil.io.client.entity.Entity;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import com.duedil.io.client.utility.TraversalHelper;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class TraversalHelperSimpleExample {

    private static final String COMPANY_ID = "SC193794";
    private static final String DIRECTOR_ID = "914039209";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient) context.getBean("duedilApiClient");

        try {
            //Company
            DuedilRayCompanies company = TraversalHelper.getAllCompanyInfo(COMPANY_ID, duedilApiClient);
            System.out.println(company);

            //iterate through HashMap values iterator
            HashMap<String, List<Entity>> traversal = duedilApiClient.getTraversal();
            for (Map.Entry<String, List<Entity>> entry : traversal.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            DuedilRayDirectors directors = TraversalHelper.getAllDirectorInfo(DIRECTOR_ID, duedilApiClient);
            traversal = duedilApiClient.getTraversal();
            for (Map.Entry<String, List<Entity>> entry : traversal.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

        } catch (DuedilClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
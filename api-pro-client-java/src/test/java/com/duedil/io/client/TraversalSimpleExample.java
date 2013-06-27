package com.duedil.io.client;

import com.duedil.io.client.domain.Traversal;
import com.duedil.io.client.domain.TraversalEnum;
import com.duedil.io.client.entity.DuedilRayCompanies;
import com.duedil.io.client.entity.DuedilRayDirectors;
import com.duedil.io.client.entity.Entity;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class TraversalSimpleExample {

    private static final String COMPANY_ID = "SC193794";
    private static final String DIRECTOR_ID = "914039209";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient) context.getBean("duedilApiClient");

        try {
            //Traversal Object
            List<Traversal> traversals = new ArrayList<Traversal>();
            traversals.add(new Traversal().get(TraversalEnum.directors).limit(1));
            traversals.add(new Traversal().get(TraversalEnum.shareholdings));
            traversals.add(new Traversal().get(TraversalEnum.documents));
            traversals.add(new Traversal().get(TraversalEnum.mortgages));
            traversals.add(new Traversal().get(TraversalEnum.bankAccounts));
            traversals.add(new Traversal().get(TraversalEnum.secondaryIndustries));
            traversals.add(new Traversal().get(TraversalEnum.previousCompanyNames));
            traversals.add(new Traversal().get(TraversalEnum.serviceAddress).limit(1));

            //Company
            DuedilRayCompanies company = duedilApiClient.setTraversal(traversals).getCompanyByOrg(COMPANY_ID);
            System.out.println(company);

            //iterate through HashMap values iterator
            HashMap<String, List<Entity>> traversal = duedilApiClient.getTraversal();
            for (Map.Entry<String, List<Entity>> entry : traversal.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

            //Director
            traversals = new ArrayList<Traversal>();
            traversals.add(new Traversal().get(TraversalEnum.company).getAllFields());
            traversals.add(new Traversal().get(TraversalEnum.serviceAddress).getAllFields());

            DuedilRayDirectors directors = duedilApiClient.setTraversal(traversals).getDirectorById(DIRECTOR_ID);
            traversal = duedilApiClient.getTraversal();
            for (Map.Entry<String, List<Entity>> entry : traversal.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }

        } catch (DuedilClientException e) {
            System.out.println(e.getMessage());
        }
    }
}
package com.duedil.io.client.utility;

import com.duedil.io.client.domain.Traversal;
import com.duedil.io.client.domain.TraversalEnum;
import com.duedil.io.client.entity.DuedilRayCompanies;
import com.duedil.io.client.entity.DuedilRayDirectors;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.utility
 */
public class TraversalHelper {

    public static DuedilRayCompanies getAllCompanyInfo(String company_id, DuedilApiClient duedilApiClient) throws DuedilClientException {
        List<Traversal> traversals = new ArrayList<Traversal>();
        traversals.add(new Traversal().get(TraversalEnum.directors));
        traversals.add(new Traversal().get(TraversalEnum.shareholdings).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.documents).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.mortgages).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.bankAccounts).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.secondaryIndustries).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.previousCompanyNames).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.serviceAddress));

        return duedilApiClient.setTraversal(traversals).getCompanyByOrg(company_id);
    }


    public static DuedilRayDirectors getAllDirectorInfo(String director_id, DuedilApiClient duedilApiClient) throws DuedilClientException {
        List<Traversal> traversals = new ArrayList<Traversal>();
        traversals.add(new Traversal().get(TraversalEnum.company).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.serviceAddress).getAllFields());

        return duedilApiClient.setTraversal(traversals).getDirectorById(director_id);
    }
}
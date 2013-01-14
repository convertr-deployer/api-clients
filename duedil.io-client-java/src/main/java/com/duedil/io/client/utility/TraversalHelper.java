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
package com.duedil.io.client.utility;

import com.duedil.io.client.domain.Traversal;
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
        traversals.add(new Traversal().get(TraversalEnum.directors.toString()));
        traversals.add(new Traversal().get(TraversalEnum.creditRatings.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.creditLimits.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.shareholdings.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.documents.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.mortgages.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.bankAccounts.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.secondaryIndustries.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.previousCompanyNames.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.serviceAddress.toString()));

        return duedilApiClient.setTraversal(traversals).getCompanyByOrg(company_id);
    }


    public static DuedilRayDirectors getAllDirectorInfo(String director_id, DuedilApiClient duedilApiClient) throws DuedilClientException {
        List<Traversal> traversals = new ArrayList<Traversal>();
        traversals = new ArrayList<Traversal>();
        traversals.add(new Traversal().get(TraversalEnum.company.toString()).getAllFields());
        traversals.add(new Traversal().get(TraversalEnum.serviceAddress.toString()).getAllFields());

        return duedilApiClient.setTraversal(traversals).getDirectorById(director_id);
    }
}
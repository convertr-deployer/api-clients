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

import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.utility
 */
public class FactoryTraversalTransformer {


    /**
     * Return the right Type from Traversal namespace
     *
     * @param name traversal namespace
     *
     * @return The Type for GSON transformer
     *
     * @throws DuedilClientException
     */
    public static Type getCollectionTypeFromString(String name) throws DuedilClientException {

        TraversalEnum traversal = TraversalEnum.valueOf(name);

        switch (traversal) {
            case directors:
                return new TypeToken<List<DuedilRayDirectors>>(){}.getType();
            case bankAccounts:
                return new TypeToken<List<DuedilRayBankAccounts>>(){}.getType();
            case creditRatings:
                return new TypeToken<List<DuedilRayCreditRatings>>(){}.getType();
            case directorships:
                return new TypeToken<List<DuedilRayDirectorships>>(){}.getType();
            case company:
                return new TypeToken<List<DuedilRayCompanies>>(){}.getType();
            case creditLimits:
                return new TypeToken<List<DuedilRayCreditLimits>>(){}.getType();
            case shareholdings:
                return new TypeToken<List<DuedilRayShareholdings>>(){}.getType();
            case documents:
                return new TypeToken<List<DuedilRayUkDocuments>>(){}.getType();
            case mortgages:
                return new TypeToken<List<DuedilRayUkMortgages>>(){}.getType();
            case secondaryIndustries:
                return new TypeToken<List<DuedilRaySecondaryIndustries>>(){}.getType();
            case serviceAddress:
                return new TypeToken<List<DuedilRayServiceAddresses>>(){}.getType();
            case previousCompanyNames:
                return new TypeToken<List<DuedilRayPreviousCompanyNames>>(){}.getType();
            default:
                throw new DuedilClientException("Can't find a collection for traversal: " + name);
        }
    }
}
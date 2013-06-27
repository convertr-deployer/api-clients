package com.duedil.io.client.utility;

import com.duedil.io.client.domain.TraversalEnum;
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
            case directorships:
                return new TypeToken<List<DuedilRayDirectorships>>(){}.getType();
            case company:
                return new TypeToken<List<DuedilRayCompanies>>(){}.getType();
            case shareholdings:
                return new TypeToken<List<DuedilRayShareholdings>>(){}.getType();
            case documents:
                return new TypeToken<List<DuedilRayUkDocuments>>(){}.getType();
            case mortgages:
                return new TypeToken<List<DuedilRayUkMortgages>>(){}.getType();
            case secondaryIndustries:
                return new TypeToken<List<DuedilRaySecondaryIndustries>>(){}.getType();
            case previousCompanyNames:
                return new TypeToken<List<DuedilRayPreviousCompanyNames>>(){}.getType();
            case serviceAddress:
                return new TypeToken<List<DuedilRayUkServiceAddresses>>(){}.getType();
            default:
                throw new DuedilClientException("Can't find a collection for traversal: " + name);
        }
    }
}
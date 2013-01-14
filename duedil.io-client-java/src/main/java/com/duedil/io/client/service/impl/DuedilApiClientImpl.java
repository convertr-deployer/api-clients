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
package com.duedil.io.client.service.impl;

import com.duedil.io.client.domain.Pagination;
import com.duedil.io.client.domain.Request;
import com.duedil.io.client.domain.Traversal;
import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import com.duedil.io.client.transporter.Transporter;
import com.duedil.io.client.utility.EndpointNamespace;
import com.duedil.io.client.utility.JsonTransformer;
import com.google.gson.reflect.TypeToken;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.service.impl
 */
@Component("duedilApiClient")
public class DuedilApiClientImpl implements DuedilApiClient {

    private static Logger logger = Logger.getLogger(DuedilApiClientImpl.class);

    private static final String SLASH = "/";

    private static final String GET__ALL = "get_all";

    public static final String VERSION = "duedil.api.client-java-0.3-stable";

    @Autowired
    private Transporter transporter;

    private Request request;

    private List<Traversal> traversals = new ArrayList<Traversal>();

    private String request_id;

    private Pagination pagination = null;

    public DuedilApiClientImpl(){
        request = new Request();
    }

    private String run() throws DuedilClientException {
        logger.debug("Call method run");

        int size = traversals.size() ;

        if ( size > 0) {
            request.setTraversals(traversals);
        }

        String response = transporter.getData(request);
        logger.debug("Response: " + response);

        if ( size > 0 ) {
            JsonTransformer.setTraversal(response);
        }

        if ( hasRequestId() ) {
            request_id = JsonTransformer.getRequestId(response);
        }

        if ( hasPagination(response) ) {
            pagination = JsonTransformer.getPagination(response);
        }

        reset();
        return response;
    }

    private boolean hasPagination(String response) {
        return response.matches("(?i).*pagination.*");
    }

    public boolean hasPagination() {
        boolean value = false;
        if ( pagination != null && !pagination.isLast()) value = true;
        return value;
    }

    public Pagination getPagination(){
        return pagination;
    }

    private boolean hasRequestId() {
        return request.getPath().indexOf(EndpointNamespace.REQUEST_DETAILS) == -1
                && request.getPath().indexOf(EndpointNamespace.SEARCH_COMPANIES) == -1
                && request.getPath().indexOf(EndpointNamespace.SEARCH_DIRECTORS) == -1;
    }

    private void reset() {
        logger.debug("Reset init value");
        traversals =  new ArrayList<Traversal>();
        request = new Request();
    }

    @Override
    public List<DuedilCompaniesSearch> searchCompanies(String query) throws DuedilClientException {
        String path = EndpointNamespace.SEARCH_COMPANIES;
        logger.debug("Get companies, path: " + path);
        request.setPath(path);
        request.addParams("query",query);

        Type collectionType = new TypeToken<List<DuedilCompaniesSearch>>(){}.getType();
        List<DuedilCompaniesSearch> companies = JsonTransformer.getCompaniesSearch(run(), collectionType);

        return companies;
    }

    @Override
    public List<DuedilDirectorsSearch> searchDirectors(String query) throws DuedilClientException {

        String path = EndpointNamespace.SEARCH_DIRECTORS;
        logger.debug("Get directors, path: " + path);
        request.setPath(path);
        request.addParams("query",query);

        Type collectionType = new TypeToken<List<DuedilDirectorsSearch>>(){}.getType();
        List<DuedilDirectorsSearch> directors = JsonTransformer.getDirectorsSearch(run(), collectionType);

        return directors;
    }

    @Override
    public DuedilRayCompanies getCompanyByOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org;
        logger.debug("Get company, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayCompanies> companyJsonTransformer = new JsonTransformer<DuedilRayCompanies>();
        return companyJsonTransformer.getSingleEntity(run(), DuedilRayCompanies.class);
    }

    @Override
    public List<DuedilRayCreditLimits> getCreditLimitsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.CREDIT_LIMITS;
        logger.debug("getCreditLimitsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayCreditLimits>>(){}.getType();
        List<DuedilRayCreditLimits> duedilRayCreditLimitses = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return duedilRayCreditLimitses;
    }

    @Override
    public List<DuedilRayCreditRatings> getCreditRatingsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.CREDIT_RATINGS;
        logger.debug("getCreditRatingsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayCreditRatings>>(){}.getType();

        return JsonTransformer.getEntitiesCollection(run(), collectionType);
    }

    @Override
    public List<DuedilRayPreviousCompanyNames> getPreviousCompanyNameByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.PREVIOUS_COMPANY_NAMES;
        logger.debug("getPreviousCompanyNameByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayPreviousCompanyNames>>(){}.getType();
        List<DuedilRayPreviousCompanyNames> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayRegisteredAddresses> getRegisteredAddressByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.REGISTERED_ADDRESS;
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayRegisteredAddresses>>(){}.getType();
        List<DuedilRayRegisteredAddresses> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayBankAccounts> getBankAccountsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.BANK_ACCOUNTS;
        logger.debug("getBankAccountsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayBankAccounts>>(){}.getType();
        List<DuedilRayBankAccounts> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRaySecondaryIndustries> getSecondaryIndustriesByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SECONDARY_INDUSTRIES;
        logger.debug("getSecondaryIndustriesByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRaySecondaryIndustries>>(){}.getType();
        List<DuedilRaySecondaryIndustries> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayShareholdings> getShareholdingsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SHAREHOLDINGS;
        logger.debug("getShareholdingsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayShareholdings>>(){}.getType();
        List<DuedilRayShareholdings> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayUkDocuments> getDocumentsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.UK_DOCUMENTS;
        logger.debug("getDocumentsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayUkDocuments>>(){}.getType();
        List<DuedilRayUkDocuments> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayUkMortgages> getMortgagesByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.UK_MORTGAGES;
        logger.debug("getMortgagesByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayUkMortgages>>(){}.getType();
        List<DuedilRayUkMortgages> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public List<DuedilRayAccounts> getAccountsByCompanyOrg(String org) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.ACCOUNTS;
        logger.debug("getAccountsByCompanyOrg, path: " + path);
        request.setPath(path);

        Type collectionType = new TypeToken<List<DuedilRayAccounts>>(){}.getType();
        List<DuedilRayAccounts> response = JsonTransformer.getEntitiesCollection(run(), collectionType);

        return response;
    }

    @Override
    public DuedilRayFinancialCompanyAccounts getFinancialCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException {
        String path = getPathToAccountDetails(company_org, account_id, "statutory");
        logger.debug("getFinancialCompanyAccountDetailsById, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayFinancialCompanyAccounts> companyJsonTransformer = new JsonTransformer<DuedilRayFinancialCompanyAccounts>();
        DuedilRayFinancialCompanyAccounts financialCompanyAccounts =  companyJsonTransformer.getSingleEntity(run(), DuedilRayFinancialCompanyAccounts.class);

        return financialCompanyAccounts;
    }

    @Override
    public DuedilRayGaapAccounts getGappAccountDetailsById(String company_org, String account_id) throws DuedilClientException {
        String path = getPathToAccountDetails(company_org, account_id, "statutory");
        logger.debug("getGappAccountDetailsById, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayGaapAccounts> companyJsonTransformer = new JsonTransformer<DuedilRayGaapAccounts>();
        DuedilRayGaapAccounts gaapAccounts =  companyJsonTransformer.getSingleEntity(run(), DuedilRayGaapAccounts.class);

        return gaapAccounts;
    }

    @Override
    public DuedilRayIfrsAccounts getIfrsAccountDetailsById(String company_org, String account_id) throws DuedilClientException {
        String path = getPathToAccountDetails(company_org, account_id, "statutory");
        logger.debug("getIfrsAccountDetailsById, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayIfrsAccounts> companyJsonTransformer = new JsonTransformer<DuedilRayIfrsAccounts>();
        DuedilRayIfrsAccounts ifrsAccounts =  companyJsonTransformer.getSingleEntity(run(), DuedilRayIfrsAccounts.class);

        return ifrsAccounts;
    }

    @Override
    public DuedilRayInsuranceCompanyAccounts getInsuranceCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException {
        String path = getPathToAccountDetails(company_org, account_id, "statutory");
        logger.debug("getInsuranceCompanyAccountDetailsById, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayInsuranceCompanyAccounts> companyJsonTransformer = new JsonTransformer<DuedilRayInsuranceCompanyAccounts>();
        DuedilRayInsuranceCompanyAccounts insuranceCompanyAccounts =  companyJsonTransformer.getSingleEntity(run(), DuedilRayInsuranceCompanyAccounts.class);

        return insuranceCompanyAccounts;
    }

    @Override
    public DuedilRayStatutoryAccounts getStatutoryCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException {
        String path = getPathToAccountDetails(company_org, account_id, "statutory");
        logger.debug("getStatutoryCompanyAccountDetailsById, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayStatutoryAccounts> companyJsonTransformer = new JsonTransformer<DuedilRayStatutoryAccounts>();
        DuedilRayStatutoryAccounts statutoryAccounts =  companyJsonTransformer.getSingleEntity(run(), DuedilRayStatutoryAccounts.class);

        return statutoryAccounts;
    }

    private String getPathToAccountDetails(String company_id, String account_id, String type) {
        String path = SLASH +  EndpointNamespace.COMPANY  + SLASH + company_id + EndpointNamespace.ACCOUNTS + SLASH + account_id + SLASH + type ;
        return path;
    }

    @Override
    public DuedilRayDirectors getDirectorById(String id) throws DuedilClientException {
        String path = SLASH +  EndpointNamespace.DIRECTOR  + SLASH + id;
        logger.debug("getDirectoships, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRayDirectors> companyJsonTransformer = new JsonTransformer<DuedilRayDirectors>();
        DuedilRayDirectors directors =  companyJsonTransformer.getSingleEntity(run(), DuedilRayDirectors.class);

        return directors;
    }

    @Override
    public String getRequestId() {
        return request_id;
    }

    @Override
    public DuedilRequestPrice getRequestDetails(String request_id) throws DuedilClientException {
        String path =  EndpointNamespace.REQUEST_DETAILS + SLASH + request_id;
        logger.debug("getRequestDetails, path: " + path);
        request.setPath(path);

        JsonTransformer<DuedilRequestPrice> priceJsonTransformer = new JsonTransformer<DuedilRequestPrice>();
        DuedilRequestPrice price =  priceJsonTransformer.getRequestPrice(run());

        return price;
    }

    @Override
    public DuedilRequestPrice getRequestDetails() throws DuedilClientException {
        return getRequestDetails(request_id);
    }

    @Override
    public DuedilApiClient setTraversal(Traversal traversals) {
        this.traversals.add(traversals);
        return this;
    }

    @Override
    public DuedilApiClient setTraversal(List<Traversal> traversals) {
        this.traversals = traversals;
        return this;
    }

    @Override
    public HashMap<String,List<Entity>> getTraversal(){
        return JsonTransformer.getTraversal();
    }

    @Override
    public DuedilApiClientImpl setLimit(int limit) {
        request.setLimit(limit);
        return this;
    }

    @Override
    public DuedilApiClientImpl setOffset(int offset) {
        request.setOffset(offset);
        return this;
    }

    @Override
    public DuedilApiClientImpl getAllFields() {
        request.setFields(GET__ALL);
        return this;
    }

    @Override
    public DuedilApiClientImpl setFields(String fields) {
        request.setFields(fields);
        return this;
    }
}
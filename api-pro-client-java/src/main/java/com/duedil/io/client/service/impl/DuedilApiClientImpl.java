package com.duedil.io.client.service.impl;

import com.duedil.io.client.domain.Traversal;
import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import com.duedil.io.client.utility.AccountsHelper;
import com.duedil.io.client.utility.EndpointNamespace;
import com.duedil.io.client.utility.JsonTransformer;
import com.google.gson.reflect.TypeToken;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.service.impl
 */
@Component("duedilApiClient")
public class DuedilApiClientImpl extends AbstractDuedilApiClientImpl {

    private static final String QUERY = "query";
    private static final String URL = "url";

    //SEARCH
    @Override
    public List<DuedilCompaniesSearch> searchCompanies(String query) throws DuedilClientException {
        request.setPath(EndpointNamespace.SEARCH_COMPANIES).addParams(QUERY, query);
        return JsonTransformer.getCompaniesSearch(run(), new TypeToken<List<DuedilCompaniesSearch>>(){}.getType());
    }

    @Override
    public List<DuedilDirectorsSearch> searchDirectors(String query) throws DuedilClientException {
        request.setPath(EndpointNamespace.SEARCH_DIRECTORS).addParams(QUERY, query);
        return JsonTransformer.getDirectorsSearch(run(), new TypeToken<List<DuedilDirectorsSearch>>(){}.getType());
    }

    @Override
    public List<DuedilCompaniesSearch> searchCompaniesByUrl(String url) throws DuedilClientException {
        request.setPath(EndpointNamespace.SEARCH_COMPANIES).addParams(URL, url);
        return JsonTransformer.getCompaniesSearch(run(), new TypeToken<List<DuedilCompaniesSearch>>(){}.getType());
    }

    //COMPANIES
    @Override
    public DuedilRayCompanies getCompanyByOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org);
        return new JsonTransformer<DuedilRayCompanies>().getSingleEntity(run(), DuedilRayCompanies.class);
    }

    @Override
    public DuedilRayCompanies getParentCompanyBySubsidiaryOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.SUBSIDIARY + SLASH + org + EndpointNamespace.PARENT);
        return new JsonTransformer<DuedilRayCompanies>().getSingleEntity(run(), DuedilRayCompanies.class);
    }

    @Override
    public List<DuedilCompaniesSearch> getSubsidiariesByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SUBSIDIARIES);
        return JsonTransformer.getCompaniesSearch(run(), new TypeToken<List<DuedilCompaniesSearch>>(){}.getType());
    }

    @Override
    public List<DuedilRayDirectorships> getDirectorshipsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.DIRECTORSHIPS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayDirectorships>>(){}.getType());
    }

    @Override
    public List<DuedilRayCreditLimits> getCreditLimitsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.CREDIT + SLASH + EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.CREDIT_LIMITS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayCreditLimits>>(){}.getType());
    }

    @Override
    public List<DuedilRayCreditRatings> getCreditRatingsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.CREDIT + SLASH +  EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.CREDIT_RATINGS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayCreditRatings>>(){}.getType());
    }

    @Override
    public List<DuedilRayPreviousCompanyNames> getPreviousCompanyNameByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.PREVIOUS_COMPANY_NAMES);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayPreviousCompanyNames>>(){}.getType());
    }

    @Override
    public List<DuedilRayRegisteredAddresses> getRegisteredAddressByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.REGISTERED_ADDRESS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayRegisteredAddresses>>(){}.getType());
    }

    @Override
    public List<DuedilRayBankAccounts> getBankAccountsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.BANK_ACCOUNTS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayBankAccounts>>(){}.getType());
    }

    @Override
    public List<DuedilRaySecondaryIndustries> getSecondaryIndustriesByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SECONDARY_INDUSTRIES);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRaySecondaryIndustries>>(){}.getType());
    }

    @Override
    public List<DuedilRayShareholdings> getShareholdingsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SHAREHOLDINGS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayShareholdings>>(){}.getType());
    }

    @Override
    public List<DuedilRayUkDocuments> getDocumentsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.DOCUMENTS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayUkDocuments>>(){}.getType());
    }

    @Override
    public List<DuedilRayUkMortgages> getMortgagesByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.MORTGAGES);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayUkMortgages>>(){}.getType());
    }

    @Override
    public List<DuedilRayAccounts> getAccountsByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.ACCOUNTS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayAccounts>>(){}.getType());
    }


    @Override
    public List<DuedilRayBasicAccounts> getAccountsDetailsByAccountId(String org, String accountId) throws DuedilClientException {
        request.setPath(getPathToAccountDetails(org, accountId));
        String response = run();
        List<DuedilRayBasicAccounts> duedilRayBasicAccounts =
                JsonTransformer.getEntitiesCollectionAccounts(response, new TypeToken<List<DuedilRayBasicAccounts>>(){}.getType());

        String type = duedilRayBasicAccounts.get(0).getType();

        return JsonTransformer.getEntitiesCollectionAccounts(response, AccountsHelper.getAccountsEntityFromAccountType(type));
    }

    @Override
    public List<DuedilRayUkServiceAddresses> getServiceAddressByCompanyOrg(String org) throws DuedilClientException {
        request.setPath(EndpointNamespace.COMPANY + SLASH + org + EndpointNamespace.SERVICE_ADDRESS);
        return JsonTransformer.getServiceAddressCollection(run(), new TypeToken<List<DuedilRayUkServiceAddresses>>(){}.getType());
    }

    private String getPathToAccountDetails(String company_id, String account_id) {
        return EndpointNamespace.COMPANY  + SLASH + company_id + EndpointNamespace.ACCOUNTS + SLASH + account_id;
    }

    //DIRECTOR
    @Override
    public DuedilRayDirectors getDirectorById(String id) throws DuedilClientException {
        request.setPath(EndpointNamespace.DIRECTOR  + SLASH + id);
        return new JsonTransformer<DuedilRayDirectors>().getSingleEntity(run(), DuedilRayDirectors.class);
    }

    @Override
    public List<DuedilCompaniesSearch> getCompaniesByDirectorId(String id) throws DuedilClientException {
        request.setPath(EndpointNamespace.DIRECTOR + SLASH + id + EndpointNamespace.COMPANIES);
        return JsonTransformer.getCompaniesSearch(run(), new TypeToken<List<DuedilCompaniesSearch>>(){}.getType());
    }

    @Override
    public List<DuedilRayDirectorships> getDirectorshipsByDirectorId(String id) throws DuedilClientException {
        request.setPath(EndpointNamespace.DIRECTOR + SLASH + id + EndpointNamespace.DIRECTORSHIPS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayDirectorships>>(){}.getType());
    }

    @Override
    public List<DuedilRayUkServiceAddresses> getServiceAddressByDirectorsId(String id) throws DuedilClientException {
        request.setPath(EndpointNamespace.DIRECTOR + SLASH + id + EndpointNamespace.REGISTERED_ADDRESS);
        return JsonTransformer.getEntitiesCollection(run(), new TypeToken<List<DuedilRayRegisteredAddresses>>(){}.getType());
    }

    //EXTRA
    @Override
    public DuedilRequestPrice getRequestDetails(String request_id) throws DuedilClientException {
        request.setPath(EndpointNamespace.REQUEST_DETAILS + SLASH + request_id);
        return new JsonTransformer<DuedilRequestPrice>().getRequestPrice(run());
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
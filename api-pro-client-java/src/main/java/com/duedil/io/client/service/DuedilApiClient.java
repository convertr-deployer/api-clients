package com.duedil.io.client.service;

import com.duedil.io.client.domain.Pagination;
import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.impl.DuedilApiClientImpl;
import com.duedil.io.client.domain.Traversal;

import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.service
 */
public interface DuedilApiClient {

    //company methods
    public DuedilRayCompanies getCompanyByOrg(String org) throws DuedilClientException;

    public DuedilRayCompanies getParentCompanyBySubsidiaryOrg(String org) throws DuedilClientException;

    public List<DuedilRayPreviousCompanyNames> getPreviousCompanyNameByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilCompaniesSearch> getSubsidiariesByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayRegisteredAddresses> getRegisteredAddressByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayBankAccounts> getBankAccountsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRaySecondaryIndustries> getSecondaryIndustriesByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayShareholdings> getShareholdingsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayDirectorships> getDirectorshipsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayUkDocuments> getDocumentsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayUkMortgages> getMortgagesByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayAccounts> getAccountsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayBasicAccounts> getAccountsDetailsByAccountId(String org, String accountId) throws DuedilClientException;

    public List<DuedilRayUkServiceAddresses> getServiceAddressByCompanyOrg(String org) throws DuedilClientException;

    //CREDIT
    public List<DuedilRayCreditLimits> getCreditLimitsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayCreditRatings> getCreditRatingsByCompanyOrg(String org) throws DuedilClientException;

    //DIRECTOR
    public DuedilRayDirectors getDirectorById(String id) throws DuedilClientException;

    public List<DuedilCompaniesSearch> getCompaniesByDirectorId(String id) throws DuedilClientException;

    //public List<DuedilCompaniesSearch> countCompaniesByDirectorId(String id) throws DuedilClientException;

    public List<DuedilRayDirectorships> getDirectorshipsByDirectorId(String id) throws DuedilClientException;

    public List<DuedilRayUkServiceAddresses> getServiceAddressByDirectorsId(String id) throws DuedilClientException;

    //SEARCH
    public List<DuedilCompaniesSearch> searchCompanies(String query) throws DuedilClientException;

    public List<DuedilCompaniesSearch> searchCompaniesByUrl(String url) throws DuedilClientException;

    public List<DuedilDirectorsSearch> searchDirectors(String query) throws DuedilClientException;

    //REQUEST
    public String getRequestId();

    public DuedilRequestPrice getRequestDetails(String request_id) throws DuedilClientException;

    public DuedilRequestPrice getRequestDetails() throws DuedilClientException;

    //Traversal
    public DuedilApiClient setTraversal(Traversal traversals);

    public DuedilApiClient setTraversal(List<Traversal> traversals);

    public HashMap<String,List<Entity>> getTraversal();

    //Extra
    public DuedilApiClientImpl setLimit(int limit);

    public DuedilApiClientImpl getAllFields();

    public DuedilApiClientImpl setOffset(int offset);

    public DuedilApiClientImpl setFields(String fields);

    public boolean hasPagination();

    public Pagination getPagination();

}
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

    //company method
    public DuedilRayCompanies getCompanyByOrg(String org) throws DuedilClientException;

    public List<DuedilRayCreditLimits> getCreditLimitsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayCreditRatings> getCreditRatingsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayPreviousCompanyNames> getPreviousCompanyNameByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayRegisteredAddresses> getRegisteredAddressByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayBankAccounts> getBankAccountsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRaySecondaryIndustries> getSecondaryIndustriesByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayShareholdings> getShareholdingsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayUkDocuments> getDocumentsByCompanyOrg(String org) throws DuedilClientException;

    public List<DuedilRayUkMortgages> getMortgagesByCompanyOrg(String org) throws DuedilClientException;

    //director
    public DuedilRayDirectors getDirectorById(String id) throws DuedilClientException;

    //accounts
    public List<DuedilRayAccounts> getAccountsByCompanyOrg(String org) throws DuedilClientException;

    public DuedilRayFinancialCompanyAccounts getFinancialCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException;

    public DuedilRayGaapAccounts getGappAccountDetailsById(String company_org, String account_id) throws DuedilClientException;

    public DuedilRayIfrsAccounts getIfrsAccountDetailsById(String company_org, String account_id) throws DuedilClientException;

    public DuedilRayInsuranceCompanyAccounts getInsuranceCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException;

    public DuedilRayStatutoryAccounts getStatutoryCompanyAccountDetailsById(String company_org, String account_id) throws DuedilClientException;

    //search function
    public List<DuedilCompaniesSearch> searchCompanies(String query) throws DuedilClientException;

    public List<DuedilDirectorsSearch> searchDirectors(String query) throws DuedilClientException;

    //Request details
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
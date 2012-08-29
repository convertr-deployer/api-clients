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
package com.duedil.io.client.entity;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.entity
 */
public class DuedilRayIfrsAccounts extends Entity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int accountStatus;

    public int getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(int accountStatus) {
        this.accountStatus = accountStatus;
    }

    private double accountantFees;

    public double getAccountantFees() {
        return accountantFees;
    }

    public void setAccountantFees(double accountantFees) {
        this.accountantFees = accountantFees;
    }

    private double accrualsDeferredIncome;

    public double getAccrualsDeferredIncome() {
        return accrualsDeferredIncome;
    }

    public void setAccrualsDeferredIncome(double accrualsDeferredIncome) {
        this.accrualsDeferredIncome = accrualsDeferredIncome;
    }

    private double accrualsDeferredIncomeDue;

    public double getAccrualsDeferredIncomeDue() {
        return accrualsDeferredIncomeDue;
    }

    public void setAccrualsDeferredIncomeDue(double accrualsDeferredIncomeDue) {
        this.accrualsDeferredIncomeDue = accrualsDeferredIncomeDue;
    }

    private double amortisationOfIntangibles;

    public double getAmortisationOfIntangibles() {
        return amortisationOfIntangibles;
    }

    public void setAmortisationOfIntangibles(double amortisationOfIntangibles) {
        this.amortisationOfIntangibles = amortisationOfIntangibles;
    }

    private double assetsFinancial;

    public double getAssetsFinancial() {
        return assetsFinancial;
    }

    public void setAssetsFinancial(double assetsFinancial) {
        this.assetsFinancial = assetsFinancial;
    }

    private double assetsFinancialCurrent;

    public double getAssetsFinancialCurrent() {
        return assetsFinancialCurrent;
    }

    public void setAssetsFinancialCurrent(double assetsFinancialCurrent) {
        this.assetsFinancialCurrent = assetsFinancialCurrent;
    }

    private double assetsIntangible;

    public double getAssetsIntangible() {
        return assetsIntangible;
    }

    public void setAssetsIntangible(double assetsIntangible) {
        this.assetsIntangible = assetsIntangible;
    }

    private double assetsInvestment;

    public double getAssetsInvestment() {
        return assetsInvestment;
    }

    public void setAssetsInvestment(double assetsInvestment) {
        this.assetsInvestment = assetsInvestment;
    }

    private double assetsOtherCurrent;

    public double getAssetsOtherCurrent() {
        return assetsOtherCurrent;
    }

    public void setAssetsOtherCurrent(double assetsOtherCurrent) {
        this.assetsOtherCurrent = assetsOtherCurrent;
    }

    private double assetsOtherNonCurrent;

    public double getAssetsOtherNonCurrent() {
        return assetsOtherNonCurrent;
    }

    public void setAssetsOtherNonCurrent(double assetsOtherNonCurrent) {
        this.assetsOtherNonCurrent = assetsOtherNonCurrent;
    }

    private double assetsTangible;

    public double getAssetsTangible() {
        return assetsTangible;
    }

    public void setAssetsTangible(double assetsTangible) {
        this.assetsTangible = assetsTangible;
    }

    private double assetsTotalCurrent;

    public double getAssetsTotalCurrent() {
        return assetsTotalCurrent;
    }

    public void setAssetsTotalCurrent(double assetsTotalCurrent) {
        this.assetsTotalCurrent = assetsTotalCurrent;
    }

    private double assetsTotalNonCurrent;

    public double getAssetsTotalNonCurrent() {
        return assetsTotalNonCurrent;
    }

    public void setAssetsTotalNonCurrent(double assetsTotalNonCurrent) {
        this.assetsTotalNonCurrent = assetsTotalNonCurrent;
    }

    private double auditorFees;

    public double getAuditorFees() {
        return auditorFees;
    }

    public void setAuditorFees(double auditorFees) {
        this.auditorFees = auditorFees;
    }

    private double bankInterestPayable;

    public double getBankInterestPayable() {
        return bankInterestPayable;
    }

    public void setBankInterestPayable(double bankInterestPayable) {
        this.bankInterestPayable = bankInterestPayable;
    }

    private double bankInterestReceivable;

    public double getBankInterestReceivable() {
        return bankInterestReceivable;
    }

    public void setBankInterestReceivable(double bankInterestReceivable) {
        this.bankInterestReceivable = bankInterestReceivable;
    }

    private double bankLoan;

    public double getBankLoan() {
        return bankLoan;
    }

    public void setBankLoan(double bankLoan) {
        this.bankLoan = bankLoan;
    }

    private double bankOverdraft;

    public double getBankOverdraft() {
        return bankOverdraft;
    }

    public void setBankOverdraft(double bankOverdraft) {
        this.bankOverdraft = bankOverdraft;
    }

    private double cashEquivalents;

    public double getCashEquivalents() {
        return cashEquivalents;
    }

    public void setCashEquivalents(double cashEquivalents) {
        this.cashEquivalents = cashEquivalents;
    }

    private double cashYearStart;

    public double getCashYearStart() {
        return cashYearStart;
    }

    public void setCashYearStart(double cashYearStart) {
        this.cashYearStart = cashYearStart;
    }

    private double changeInCash;

    public double getChangeInCash() {
        return changeInCash;
    }

    public void setChangeInCash(double changeInCash) {
        this.changeInCash = changeInCash;
    }

    private String consolidated;

    public String getConsolidated() {
        return consolidated;
    }

    public void setConsolidated(String consolidated) {
        this.consolidated = consolidated;
    }

    private double costOfSales;

    public double getCostOfSales() {
        return costOfSales;
    }

    public void setCostOfSales(double costOfSales) {
        this.costOfSales = costOfSales;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private double currentGrants;

    public double getCurrentGrants() {
        return currentGrants;
    }

    public void setCurrentGrants(double currentGrants) {
        this.currentGrants = currentGrants;
    }

    private double currentHpCommitments;

    public double getCurrentHpCommitments() {
        return currentHpCommitments;
    }

    public void setCurrentHpCommitments(double currentHpCommitments) {
        this.currentHpCommitments = currentHpCommitments;
    }

    private double currentLeaseCommitments;

    public double getCurrentLeaseCommitments() {
        return currentLeaseCommitments;
    }

    public void setCurrentLeaseCommitments(double currentLeaseCommitments) {
        this.currentLeaseCommitments = currentLeaseCommitments;
    }

    private double debtorsDueAfter;

    public double getDebtorsDueAfter() {
        return debtorsDueAfter;
    }

    public void setDebtorsDueAfter(double debtorsDueAfter) {
        this.debtorsDueAfter = debtorsDueAfter;
    }

    private double depreciationOfTangibles;

    public double getDepreciationOfTangibles() {
        return depreciationOfTangibles;
    }

    public void setDepreciationOfTangibles(double depreciationOfTangibles) {
        this.depreciationOfTangibles = depreciationOfTangibles;
    }

    private double directorFees;

    public double getDirectorFees() {
        return directorFees;
    }

    public void setDirectorFees(double directorFees) {
        this.directorFees = directorFees;
    }

    private double directorOther;

    public double getDirectorOther() {
        return directorOther;
    }

    public void setDirectorOther(double directorOther) {
        this.directorOther = directorOther;
    }

    private double directorPensions;

    public double getDirectorPensions() {
        return directorPensions;
    }

    public void setDirectorPensions(double directorPensions) {
        this.directorPensions = directorPensions;
    }

    private double directorSocialSecurity;

    public double getDirectorSocialSecurity() {
        return directorSocialSecurity;
    }

    public void setDirectorSocialSecurity(double directorSocialSecurity) {
        this.directorSocialSecurity = directorSocialSecurity;
    }

    private double directorsAccounts;

    public double getDirectorsAccounts() {
        return directorsAccounts;
    }

    public void setDirectorsAccounts(double directorsAccounts) {
        this.directorsAccounts = directorsAccounts;
    }

    private double directorsRemuneration;

    public double getDirectorsRemuneration() {
        return directorsRemuneration;
    }

    public void setDirectorsRemuneration(double directorsRemuneration) {
        this.directorsRemuneration = directorsRemuneration;
    }

    private double dividendsPaid;

    public double getDividendsPaid() {
        return dividendsPaid;
    }

    public void setDividendsPaid(double dividendsPaid) {
        this.dividendsPaid = dividendsPaid;
    }

    private double employeeCosts;

    public double getEmployeeCosts() {
        return employeeCosts;
    }

    public void setEmployeeCosts(double employeeCosts) {
        this.employeeCosts = employeeCosts;
    }

    private double employeeNumbers;

    public double getEmployeeNumbers() {
        return employeeNumbers;
    }

    public void setEmployeeNumbers(double employeeNumbers) {
        this.employeeNumbers = employeeNumbers;
    }

    private double employeeOther;

    public double getEmployeeOther() {
        return employeeOther;
    }

    public void setEmployeeOther(double employeeOther) {
        this.employeeOther = employeeOther;
    }

    private double employeePensions;

    public double getEmployeePensions() {
        return employeePensions;
    }

    public void setEmployeePensions(double employeePensions) {
        this.employeePensions = employeePensions;
    }

    private double employeeRemuneration;

    public double getEmployeeRemuneration() {
        return employeeRemuneration;
    }

    public void setEmployeeRemuneration(double employeeRemuneration) {
        this.employeeRemuneration = employeeRemuneration;
    }

    private double employeeSocialSecurity;

    public double getEmployeeSocialSecurity() {
        return employeeSocialSecurity;
    }

    public void setEmployeeSocialSecurity(double employeeSocialSecurity) {
        this.employeeSocialSecurity = employeeSocialSecurity;
    }

    private double exceptionalItems;

    public double getExceptionalItems() {
        return exceptionalItems;
    }

    public void setExceptionalItems(double exceptionalItems) {
        this.exceptionalItems = exceptionalItems;
    }

    private double exceptionalOtherItems;

    public double getExceptionalOtherItems() {
        return exceptionalOtherItems;
    }

    public void setExceptionalOtherItems(double exceptionalOtherItems) {
        this.exceptionalOtherItems = exceptionalOtherItems;
    }

    private double exceptionalPandlOnAcquisition;

    public double getExceptionalPandlOnAcquisition() {
        return exceptionalPandlOnAcquisition;
    }

    public void setExceptionalPandlOnAcquisition(double exceptionalPandlOnAcquisition) {
        this.exceptionalPandlOnAcquisition = exceptionalPandlOnAcquisition;
    }

    private double exceptionalPandlOnReorganisations;

    public double getExceptionalPandlOnReorganisations() {
        return exceptionalPandlOnReorganisations;
    }

    public void setExceptionalPandlOnReorganisations(double exceptionalPandlOnReorganisations) {
        this.exceptionalPandlOnReorganisations = exceptionalPandlOnReorganisations;
    }

    private double exchangeRateEffect;

    public double getExchangeRateEffect() {
        return exchangeRateEffect;
    }

    public void setExchangeRateEffect(double exchangeRateEffect) {
        this.exchangeRateEffect = exchangeRateEffect;
    }

    private double exports;

    public double getExports() {
        return exports;
    }

    public void setExports(double exports) {
        this.exports = exports;
    }

    private double financingActivities;

    public double getFinancingActivities() {
        return financingActivities;
    }

    public void setFinancingActivities(double financingActivities) {
        this.financingActivities = financingActivities;
    }

    private double finishedGoods;

    public double getFinishedGoods() {
        return finishedGoods;
    }

    public void setFinishedGoods(double finishedGoods) {
        this.finishedGoods = finishedGoods;
    }

    private double grossProfit;

    public double getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(double grossProfit) {
        this.grossProfit = grossProfit;
    }

    private double groupAccounts;

    public double getGroupAccounts() {
        return groupAccounts;
    }

    public void setGroupAccounts(double groupAccounts) {
        this.groupAccounts = groupAccounts;
    }

    private double groupAccountsPayable;

    public double getGroupAccountsPayable() {
        return groupAccountsPayable;
    }

    public void setGroupAccountsPayable(double groupAccountsPayable) {
        this.groupAccountsPayable = groupAccountsPayable;
    }

    private double groupDebtors;

    public double getGroupDebtors() {
        return groupDebtors;
    }

    public void setGroupDebtors(double groupDebtors) {
        this.groupDebtors = groupDebtors;
    }

    private double groupInterestReceivable;

    public double getGroupInterestReceivable() {
        return groupInterestReceivable;
    }

    public void setGroupInterestReceivable(double groupInterestReceivable) {
        this.groupInterestReceivable = groupInterestReceivable;
    }

    private double highestPaidDirector;

    public double getHighestPaidDirector() {
        return highestPaidDirector;
    }

    public void setHighestPaidDirector(double highestPaidDirector) {
        this.highestPaidDirector = highestPaidDirector;
    }

    private double hpInterestPayable;

    public double getHpInterestPayable() {
        return hpInterestPayable;
    }

    public void setHpInterestPayable(double hpInterestPayable) {
        this.hpInterestPayable = hpInterestPayable;
    }

    private double interestBearingLoans;

    public double getInterestBearingLoans() {
        return interestBearingLoans;
    }

    public void setInterestBearingLoans(double interestBearingLoans) {
        this.interestBearingLoans = interestBearingLoans;
    }

    private double interestPayable;

    public double getInterestPayable() {
        return interestPayable;
    }

    public void setInterestPayable(double interestPayable) {
        this.interestPayable = interestPayable;
    }

    private double interestReceivable;

    public double getInterestReceivable() {
        return interestReceivable;
    }

    public void setInterestReceivable(double interestReceivable) {
        this.interestReceivable = interestReceivable;
    }

    private double inventories;

    public double getInventories() {
        return inventories;
    }

    public void setInventories(double inventories) {
        this.inventories = inventories;
    }

    private double investingActivities;

    public double getInvestingActivities() {
        return investingActivities;
    }

    public void setInvestingActivities(double investingActivities) {
        this.investingActivities = investingActivities;
    }

    private double leaseInterestPayable;

    public double getLeaseInterestPayable() {
        return leaseInterestPayable;
    }

    public void setLeaseInterestPayable(double leaseInterestPayable) {
        this.leaseInterestPayable = leaseInterestPayable;
    }

    private double liabilitiesCurrentFinancial;

    public double getLiabilitiesCurrentFinancial() {
        return liabilitiesCurrentFinancial;
    }

    public void setLiabilitiesCurrentFinancial(double liabilitiesCurrentFinancial) {
        this.liabilitiesCurrentFinancial = liabilitiesCurrentFinancial;
    }

    private double liabilitiesCurrentResale;

    public double getLiabilitiesCurrentResale() {
        return liabilitiesCurrentResale;
    }

    public void setLiabilitiesCurrentResale(double liabilitiesCurrentResale) {
        this.liabilitiesCurrentResale = liabilitiesCurrentResale;
    }

    private double liabilitiesCurrentTax;

    public double getLiabilitiesCurrentTax() {
        return liabilitiesCurrentTax;
    }

    public void setLiabilitiesCurrentTax(double liabilitiesCurrentTax) {
        this.liabilitiesCurrentTax = liabilitiesCurrentTax;
    }

    private double liabilitiesDeferredTax;

    public double getLiabilitiesDeferredTax() {
        return liabilitiesDeferredTax;
    }

    public void setLiabilitiesDeferredTax(double liabilitiesDeferredTax) {
        this.liabilitiesDeferredTax = liabilitiesDeferredTax;
    }

    private double liabilitiesNonCurrentFinancial;

    public double getLiabilitiesNonCurrentFinancial() {
        return liabilitiesNonCurrentFinancial;
    }

    public void setLiabilitiesNonCurrentFinancial(double liabilitiesNonCurrentFinancial) {
        this.liabilitiesNonCurrentFinancial = liabilitiesNonCurrentFinancial;
    }

    private double liabilitiesNonCurrentResale;

    public double getLiabilitiesNonCurrentResale() {
        return liabilitiesNonCurrentResale;
    }

    public void setLiabilitiesNonCurrentResale(double liabilitiesNonCurrentResale) {
        this.liabilitiesNonCurrentResale = liabilitiesNonCurrentResale;
    }

    private double liabilitiesOtherCurrent;

    public double getLiabilitiesOtherCurrent() {
        return liabilitiesOtherCurrent;
    }

    public void setLiabilitiesOtherCurrent(double liabilitiesOtherCurrent) {
        this.liabilitiesOtherCurrent = liabilitiesOtherCurrent;
    }

    private double liabilitiesOtherCurrentFinancial;

    public double getLiabilitiesOtherCurrentFinancial() {
        return liabilitiesOtherCurrentFinancial;
    }

    public void setLiabilitiesOtherCurrentFinancial(double liabilitiesOtherCurrentFinancial) {
        this.liabilitiesOtherCurrentFinancial = liabilitiesOtherCurrentFinancial;
    }

    private double liabilitiesOtherNonCurrentFinancial;

    public double getLiabilitiesOtherNonCurrentFinancial() {
        return liabilitiesOtherNonCurrentFinancial;
    }

    public void setLiabilitiesOtherNonCurrentFinancial(double liabilitiesOtherNonCurrentFinancial) {
        this.liabilitiesOtherNonCurrentFinancial = liabilitiesOtherNonCurrentFinancial;
    }

    private double liabilitiesPension;

    public double getLiabilitiesPension() {
        return liabilitiesPension;
    }

    public void setLiabilitiesPension(double liabilitiesPension) {
        this.liabilitiesPension = liabilitiesPension;
    }

    private double liabilitiesTotalCurrent;

    public double getLiabilitiesTotalCurrent() {
        return liabilitiesTotalCurrent;
    }

    public void setLiabilitiesTotalCurrent(double liabilitiesTotalCurrent) {
        this.liabilitiesTotalCurrent = liabilitiesTotalCurrent;
    }

    private double liabilitiesTotalNonCurrent;

    public double getLiabilitiesTotalNonCurrent() {
        return liabilitiesTotalNonCurrent;
    }

    public void setLiabilitiesTotalNonCurrent(double liabilitiesTotalNonCurrent) {
        this.liabilitiesTotalNonCurrent = liabilitiesTotalNonCurrent;
    }

    private double liabilitiesTotalOtherCurrent;

    public double getLiabilitiesTotalOtherCurrent() {
        return liabilitiesTotalOtherCurrent;
    }

    public void setLiabilitiesTotalOtherCurrent(double liabilitiesTotalOtherCurrent) {
        this.liabilitiesTotalOtherCurrent = liabilitiesTotalOtherCurrent;
    }

    private double liabilitiesTotalOtherNonCurrent;

    public double getLiabilitiesTotalOtherNonCurrent() {
        return liabilitiesTotalOtherNonCurrent;
    }

    public void setLiabilitiesTotalOtherNonCurrent(double liabilitiesTotalOtherNonCurrent) {
        this.liabilitiesTotalOtherNonCurrent = liabilitiesTotalOtherNonCurrent;
    }

    private double minorityInterests;

    public double getMinorityInterests() {
        return minorityInterests;
    }

    public void setMinorityInterests(double minorityInterests) {
        this.minorityInterests = minorityInterests;
    }

    private double minorityInterestsProfit;

    public double getMinorityInterestsProfit() {
        return minorityInterestsProfit;
    }

    public void setMinorityInterestsProfit(double minorityInterestsProfit) {
        this.minorityInterestsProfit = minorityInterestsProfit;
    }

    private double miscDebtors;

    public double getMiscDebtors() {
        return miscDebtors;
    }

    public void setMiscDebtors(double miscDebtors) {
        this.miscDebtors = miscDebtors;
    }

    private int months;

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    private double netChangeInCash;

    public double getNetChangeInCash() {
        return netChangeInCash;
    }

    public void setNetChangeInCash(double netChangeInCash) {
        this.netChangeInCash = netChangeInCash;
    }

    private double nonCurrentDirectorsLoans;

    public double getNonCurrentDirectorsLoans() {
        return nonCurrentDirectorsLoans;
    }

    public void setNonCurrentDirectorsLoans(double nonCurrentDirectorsLoans) {
        this.nonCurrentDirectorsLoans = nonCurrentDirectorsLoans;
    }

    private double nonCurrentGrants;

    public double getNonCurrentGrants() {
        return nonCurrentGrants;
    }

    public void setNonCurrentGrants(double nonCurrentGrants) {
        this.nonCurrentGrants = nonCurrentGrants;
    }

    private double nonCurrentGroupAccountsPayable;

    public double getNonCurrentGroupAccountsPayable() {
        return nonCurrentGroupAccountsPayable;
    }

    public void setNonCurrentGroupAccountsPayable(double nonCurrentGroupAccountsPayable) {
        this.nonCurrentGroupAccountsPayable = nonCurrentGroupAccountsPayable;
    }

    private double nonCurrentGroupLoans;

    public double getNonCurrentGroupLoans() {
        return nonCurrentGroupLoans;
    }

    public void setNonCurrentGroupLoans(double nonCurrentGroupLoans) {
        this.nonCurrentGroupLoans = nonCurrentGroupLoans;
    }

    private double nonCurrentHpCommitments;

    public double getNonCurrentHpCommitments() {
        return nonCurrentHpCommitments;
    }

    public void setNonCurrentHpCommitments(double nonCurrentHpCommitments) {
        this.nonCurrentHpCommitments = nonCurrentHpCommitments;
    }

    private double nonCurrentLeaseCommitments;

    public double getNonCurrentLeaseCommitments() {
        return nonCurrentLeaseCommitments;
    }

    public void setNonCurrentLeaseCommitments(double nonCurrentLeaseCommitments) {
        this.nonCurrentLeaseCommitments = nonCurrentLeaseCommitments;
    }

    private double nonCurrentOtherPayables;

    public double getNonCurrentOtherPayables() {
        return nonCurrentOtherPayables;
    }

    public void setNonCurrentOtherPayables(double nonCurrentOtherPayables) {
        this.nonCurrentOtherPayables = nonCurrentOtherPayables;
    }

    private double nonCurrentTradePayables;

    public double getNonCurrentTradePayables() {
        return nonCurrentTradePayables;
    }

    public void setNonCurrentTradePayables(double nonCurrentTradePayables) {
        this.nonCurrentTradePayables = nonCurrentTradePayables;
    }

    private double operatingActivities;

    public double getOperatingActivities() {
        return operatingActivities;
    }

    public void setOperatingActivities(double operatingActivities) {
        this.operatingActivities = operatingActivities;
    }

    private double operatingProfit;

    public double getOperatingProfit() {
        return operatingProfit;
    }

    public void setOperatingProfit(double operatingProfit) {
        this.operatingProfit = operatingProfit;
    }

    private double operationsLoss;

    public double getOperationsLoss() {
        return operationsLoss;
    }

    public void setOperationsLoss(double operationsLoss) {
        this.operationsLoss = operationsLoss;
    }

    private double ordinaryShares;

    public double getOrdinaryShares() {
        return ordinaryShares;
    }

    public void setOrdinaryShares(double ordinaryShares) {
        this.ordinaryShares = ordinaryShares;
    }

    private double otherAppropriations;

    public double getOtherAppropriations() {
        return otherAppropriations;
    }

    public void setOtherAppropriations(double otherAppropriations) {
        this.otherAppropriations = otherAppropriations;
    }

    private double otherAuditCosts;

    public double getOtherAuditCosts() {
        return otherAuditCosts;
    }

    public void setOtherAuditCosts(double otherAuditCosts) {
        this.otherAuditCosts = otherAuditCosts;
    }

    private double otherInterestPayable;

    public double getOtherInterestPayable() {
        return otherInterestPayable;
    }

    public void setOtherInterestPayable(double otherInterestPayable) {
        this.otherInterestPayable = otherInterestPayable;
    }

    private double otherInterestReceivable;

    public double getOtherInterestReceivable() {
        return otherInterestReceivable;
    }

    public void setOtherInterestReceivable(double otherInterestReceivable) {
        this.otherInterestReceivable = otherInterestReceivable;
    }

    private double otherPayables;

    public double getOtherPayables() {
        return otherPayables;
    }

    public void setOtherPayables(double otherPayables) {
        this.otherPayables = otherPayables;
    }

    private double otherProvisions;

    public double getOtherProvisions() {
        return otherProvisions;
    }

    public void setOtherProvisions(double otherProvisions) {
        this.otherProvisions = otherProvisions;
    }

    private double otherReceivables;

    public double getOtherReceivables() {
        return otherReceivables;
    }

    public void setOtherReceivables(double otherReceivables) {
        this.otherReceivables = otherReceivables;
    }

    private double otherReserves;

    public double getOtherReserves() {
        return otherReserves;
    }

    public void setOtherReserves(double otherReserves) {
        this.otherReserves = otherReserves;
    }

    private double otherShares;

    public double getOtherShares() {
        return otherShares;
    }

    public void setOtherShares(double otherShares) {
        this.otherShares = otherShares;
    }

    private double pandlRevenueReserve;

    public double getPandlRevenueReserve() {
        return pandlRevenueReserve;
    }

    public void setPandlRevenueReserve(double pandlRevenueReserve) {
        this.pandlRevenueReserve = pandlRevenueReserve;
    }

    private double preTaxProfit;

    public double getPreTaxProfit() {
        return preTaxProfit;
    }

    public void setPreTaxProfit(double preTaxProfit) {
        this.preTaxProfit = preTaxProfit;
    }

    private double preferenceShares;

    public double getPreferenceShares() {
        return preferenceShares;
    }

    public void setPreferenceShares(double preferenceShares) {
        this.preferenceShares = preferenceShares;
    }

    private double profitAfterTax;

    public double getProfitAfterTax() {
        return profitAfterTax;
    }

    public void setProfitAfterTax(double profitAfterTax) {
        this.profitAfterTax = profitAfterTax;
    }

    private double provisions;

    public double getProvisions() {
        return provisions;
    }

    public void setProvisions(double provisions) {
        this.provisions = provisions;
    }

    private double provisionsCharges;

    public double getProvisionsCharges() {
        return provisionsCharges;
    }

    public void setProvisionsCharges(double provisionsCharges) {
        this.provisionsCharges = provisionsCharges;
    }

    private double rawMaterials;

    public double getRawMaterials() {
        return rawMaterials;
    }

    public void setRawMaterials(double rawMaterials) {
        this.rawMaterials = rawMaterials;
    }

    private double retainedProfit;

    public double getRetainedProfit() {
        return retainedProfit;
    }

    public void setRetainedProfit(double retainedProfit) {
        this.retainedProfit = retainedProfit;
    }

    private double revaluationReserve;

    public double getRevaluationReserve() {
        return revaluationReserve;
    }

    public void setRevaluationReserve(double revaluationReserve) {
        this.revaluationReserve = revaluationReserve;
    }

    private double shortTermLoans;

    public double getShortTermLoans() {
        return shortTermLoans;
    }

    public void setShortTermLoans(double shortTermLoans) {
        this.shortTermLoans = shortTermLoans;
    }

    private double statutoryAuditCosts;

    public double getStatutoryAuditCosts() {
        return statutoryAuditCosts;
    }

    public void setStatutoryAuditCosts(double statutoryAuditCosts) {
        this.statutoryAuditCosts = statutoryAuditCosts;
    }

    private double tax;

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    private double totalCalledIssuedCapital;

    public double getTotalCalledIssuedCapital() {
        return totalCalledIssuedCapital;
    }

    public void setTotalCalledIssuedCapital(double totalCalledIssuedCapital) {
        this.totalCalledIssuedCapital = totalCalledIssuedCapital;
    }

    private double totalShareholderFunds;

    public double getTotalShareholderFunds() {
        return totalShareholderFunds;
    }

    public void setTotalShareholderFunds(double totalShareholderFunds) {
        this.totalShareholderFunds = totalShareholderFunds;
    }

    private double tradeCreditors;

    public double getTradeCreditors() {
        return tradeCreditors;
    }

    public void setTradeCreditors(double tradeCreditors) {
        this.tradeCreditors = tradeCreditors;
    }

    private double tradeDebtors;

    public double getTradeDebtors() {
        return tradeDebtors;
    }

    public void setTradeDebtors(double tradeDebtors) {
        this.tradeDebtors = tradeDebtors;
    }

    private double tradeOtherPayables;

    public double getTradeOtherPayables() {
        return tradeOtherPayables;
    }

    public void setTradeOtherPayables(double tradeOtherPayables) {
        this.tradeOtherPayables = tradeOtherPayables;
    }

    private double turnover;

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

    private double workInProgress;

    public double getWorkInProgress() {
        return workInProgress;
    }

    public void setWorkInProgress(double workInProgress) {
        this.workInProgress = workInProgress;
    }

    private double yearEndCashEquivalents;

    public double getYearEndCashEquivalents() {
        return yearEndCashEquivalents;
    }

    public void setYearEndCashEquivalents(double yearEndCashEquivalents) {
        this.yearEndCashEquivalents = yearEndCashEquivalents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayIfrsAccounts that = (DuedilRayIfrsAccounts) o;

        if (accountStatus != that.accountStatus) return false;
        if (Double.compare(that.accountantFees, accountantFees) != 0) return false;
        if (Double.compare(that.accrualsDeferredIncome, accrualsDeferredIncome) != 0) return false;
        if (Double.compare(that.accrualsDeferredIncomeDue, accrualsDeferredIncomeDue) != 0) return false;
        if (Double.compare(that.amortisationOfIntangibles, amortisationOfIntangibles) != 0) return false;
        if (Double.compare(that.assetsFinancial, assetsFinancial) != 0) return false;
        if (Double.compare(that.assetsFinancialCurrent, assetsFinancialCurrent) != 0) return false;
        if (Double.compare(that.assetsIntangible, assetsIntangible) != 0) return false;
        if (Double.compare(that.assetsInvestment, assetsInvestment) != 0) return false;
        if (Double.compare(that.assetsOtherCurrent, assetsOtherCurrent) != 0) return false;
        if (Double.compare(that.assetsOtherNonCurrent, assetsOtherNonCurrent) != 0) return false;
        if (Double.compare(that.assetsTangible, assetsTangible) != 0) return false;
        if (Double.compare(that.assetsTotalCurrent, assetsTotalCurrent) != 0) return false;
        if (Double.compare(that.assetsTotalNonCurrent, assetsTotalNonCurrent) != 0) return false;
        if (Double.compare(that.auditorFees, auditorFees) != 0) return false;
        if (Double.compare(that.bankInterestPayable, bankInterestPayable) != 0) return false;
        if (Double.compare(that.bankInterestReceivable, bankInterestReceivable) != 0) return false;
        if (Double.compare(that.bankLoan, bankLoan) != 0) return false;
        if (Double.compare(that.bankOverdraft, bankOverdraft) != 0) return false;
        if (Double.compare(that.cashEquivalents, cashEquivalents) != 0) return false;
        if (Double.compare(that.cashYearStart, cashYearStart) != 0) return false;
        if (Double.compare(that.changeInCash, changeInCash) != 0) return false;
        if (Double.compare(that.costOfSales, costOfSales) != 0) return false;
        if (Double.compare(that.currentGrants, currentGrants) != 0) return false;
        if (Double.compare(that.currentHpCommitments, currentHpCommitments) != 0) return false;
        if (Double.compare(that.currentLeaseCommitments, currentLeaseCommitments) != 0) return false;
        if (Double.compare(that.debtorsDueAfter, debtorsDueAfter) != 0) return false;
        if (Double.compare(that.depreciationOfTangibles, depreciationOfTangibles) != 0) return false;
        if (Double.compare(that.directorFees, directorFees) != 0) return false;
        if (Double.compare(that.directorOther, directorOther) != 0) return false;
        if (Double.compare(that.directorPensions, directorPensions) != 0) return false;
        if (Double.compare(that.directorSocialSecurity, directorSocialSecurity) != 0) return false;
        if (Double.compare(that.directorsAccounts, directorsAccounts) != 0) return false;
        if (Double.compare(that.directorsRemuneration, directorsRemuneration) != 0) return false;
        if (Double.compare(that.dividendsPaid, dividendsPaid) != 0) return false;
        if (Double.compare(that.employeeCosts, employeeCosts) != 0) return false;
        if (Double.compare(that.employeeNumbers, employeeNumbers) != 0) return false;
        if (Double.compare(that.employeeOther, employeeOther) != 0) return false;
        if (Double.compare(that.employeePensions, employeePensions) != 0) return false;
        if (Double.compare(that.employeeRemuneration, employeeRemuneration) != 0) return false;
        if (Double.compare(that.employeeSocialSecurity, employeeSocialSecurity) != 0) return false;
        if (Double.compare(that.exceptionalItems, exceptionalItems) != 0) return false;
        if (Double.compare(that.exceptionalOtherItems, exceptionalOtherItems) != 0) return false;
        if (Double.compare(that.exceptionalPandlOnAcquisition, exceptionalPandlOnAcquisition) != 0) return false;
        if (Double.compare(that.exceptionalPandlOnReorganisations, exceptionalPandlOnReorganisations) != 0)
            return false;
        if (Double.compare(that.exchangeRateEffect, exchangeRateEffect) != 0) return false;
        if (Double.compare(that.exports, exports) != 0) return false;
        if (Double.compare(that.financingActivities, financingActivities) != 0) return false;
        if (Double.compare(that.finishedGoods, finishedGoods) != 0) return false;
        if (Double.compare(that.grossProfit, grossProfit) != 0) return false;
        if (Double.compare(that.groupAccounts, groupAccounts) != 0) return false;
        if (Double.compare(that.groupAccountsPayable, groupAccountsPayable) != 0) return false;
        if (Double.compare(that.groupDebtors, groupDebtors) != 0) return false;
        if (Double.compare(that.groupInterestReceivable, groupInterestReceivable) != 0) return false;
        if (Double.compare(that.highestPaidDirector, highestPaidDirector) != 0) return false;
        if (Double.compare(that.hpInterestPayable, hpInterestPayable) != 0) return false;
        if (Double.compare(that.interestBearingLoans, interestBearingLoans) != 0) return false;
        if (Double.compare(that.interestPayable, interestPayable) != 0) return false;
        if (Double.compare(that.interestReceivable, interestReceivable) != 0) return false;
        if (Double.compare(that.inventories, inventories) != 0) return false;
        if (Double.compare(that.investingActivities, investingActivities) != 0) return false;
        if (Double.compare(that.leaseInterestPayable, leaseInterestPayable) != 0) return false;
        if (Double.compare(that.liabilitiesCurrentFinancial, liabilitiesCurrentFinancial) != 0) return false;
        if (Double.compare(that.liabilitiesCurrentResale, liabilitiesCurrentResale) != 0) return false;
        if (Double.compare(that.liabilitiesCurrentTax, liabilitiesCurrentTax) != 0) return false;
        if (Double.compare(that.liabilitiesDeferredTax, liabilitiesDeferredTax) != 0) return false;
        if (Double.compare(that.liabilitiesNonCurrentFinancial, liabilitiesNonCurrentFinancial) != 0) return false;
        if (Double.compare(that.liabilitiesNonCurrentResale, liabilitiesNonCurrentResale) != 0) return false;
        if (Double.compare(that.liabilitiesOtherCurrent, liabilitiesOtherCurrent) != 0) return false;
        if (Double.compare(that.liabilitiesOtherCurrentFinancial, liabilitiesOtherCurrentFinancial) != 0) return false;
        if (Double.compare(that.liabilitiesOtherNonCurrentFinancial, liabilitiesOtherNonCurrentFinancial) != 0)
            return false;
        if (Double.compare(that.liabilitiesPension, liabilitiesPension) != 0) return false;
        if (Double.compare(that.liabilitiesTotalCurrent, liabilitiesTotalCurrent) != 0) return false;
        if (Double.compare(that.liabilitiesTotalNonCurrent, liabilitiesTotalNonCurrent) != 0) return false;
        if (Double.compare(that.liabilitiesTotalOtherCurrent, liabilitiesTotalOtherCurrent) != 0) return false;
        if (Double.compare(that.liabilitiesTotalOtherNonCurrent, liabilitiesTotalOtherNonCurrent) != 0) return false;
        if (Double.compare(that.minorityInterests, minorityInterests) != 0) return false;
        if (Double.compare(that.minorityInterestsProfit, minorityInterestsProfit) != 0) return false;
        if (Double.compare(that.miscDebtors, miscDebtors) != 0) return false;
        if (months != that.months) return false;
        if (Double.compare(that.netChangeInCash, netChangeInCash) != 0) return false;
        if (Double.compare(that.nonCurrentDirectorsLoans, nonCurrentDirectorsLoans) != 0) return false;
        if (Double.compare(that.nonCurrentGrants, nonCurrentGrants) != 0) return false;
        if (Double.compare(that.nonCurrentGroupAccountsPayable, nonCurrentGroupAccountsPayable) != 0) return false;
        if (Double.compare(that.nonCurrentGroupLoans, nonCurrentGroupLoans) != 0) return false;
        if (Double.compare(that.nonCurrentHpCommitments, nonCurrentHpCommitments) != 0) return false;
        if (Double.compare(that.nonCurrentLeaseCommitments, nonCurrentLeaseCommitments) != 0) return false;
        if (Double.compare(that.nonCurrentOtherPayables, nonCurrentOtherPayables) != 0) return false;
        if (Double.compare(that.nonCurrentTradePayables, nonCurrentTradePayables) != 0) return false;
        if (Double.compare(that.operatingActivities, operatingActivities) != 0) return false;
        if (Double.compare(that.operatingProfit, operatingProfit) != 0) return false;
        if (Double.compare(that.operationsLoss, operationsLoss) != 0) return false;
        if (Double.compare(that.ordinaryShares, ordinaryShares) != 0) return false;
        if (Double.compare(that.otherAppropriations, otherAppropriations) != 0) return false;
        if (Double.compare(that.otherAuditCosts, otherAuditCosts) != 0) return false;
        if (Double.compare(that.otherInterestPayable, otherInterestPayable) != 0) return false;
        if (Double.compare(that.otherInterestReceivable, otherInterestReceivable) != 0) return false;
        if (Double.compare(that.otherPayables, otherPayables) != 0) return false;
        if (Double.compare(that.otherProvisions, otherProvisions) != 0) return false;
        if (Double.compare(that.otherReceivables, otherReceivables) != 0) return false;
        if (Double.compare(that.otherReserves, otherReserves) != 0) return false;
        if (Double.compare(that.otherShares, otherShares) != 0) return false;
        if (Double.compare(that.pandlRevenueReserve, pandlRevenueReserve) != 0) return false;
        if (Double.compare(that.preTaxProfit, preTaxProfit) != 0) return false;
        if (Double.compare(that.preferenceShares, preferenceShares) != 0) return false;
        if (Double.compare(that.profitAfterTax, profitAfterTax) != 0) return false;
        if (Double.compare(that.provisions, provisions) != 0) return false;
        if (Double.compare(that.provisionsCharges, provisionsCharges) != 0) return false;
        if (Double.compare(that.rawMaterials, rawMaterials) != 0) return false;
        if (Double.compare(that.retainedProfit, retainedProfit) != 0) return false;
        if (Double.compare(that.revaluationReserve, revaluationReserve) != 0) return false;
        if (Double.compare(that.shortTermLoans, shortTermLoans) != 0) return false;
        if (Double.compare(that.statutoryAuditCosts, statutoryAuditCosts) != 0) return false;
        if (Double.compare(that.tax, tax) != 0) return false;
        if (Double.compare(that.totalCalledIssuedCapital, totalCalledIssuedCapital) != 0) return false;
        if (Double.compare(that.totalShareholderFunds, totalShareholderFunds) != 0) return false;
        if (Double.compare(that.tradeCreditors, tradeCreditors) != 0) return false;
        if (Double.compare(that.tradeDebtors, tradeDebtors) != 0) return false;
        if (Double.compare(that.tradeOtherPayables, tradeOtherPayables) != 0) return false;
        if (Double.compare(that.turnover, turnover) != 0) return false;
        if (Double.compare(that.workInProgress, workInProgress) != 0) return false;
        if (Double.compare(that.yearEndCashEquivalents, yearEndCashEquivalents) != 0) return false;
        if (consolidated != null ? !consolidated.equals(that.consolidated) : that.consolidated != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + accountStatus;
        temp = accountantFees != +0.0d ? Double.doubleToLongBits(accountantFees) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accrualsDeferredIncome != +0.0d ? Double.doubleToLongBits(accrualsDeferredIncome) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accrualsDeferredIncomeDue != +0.0d ? Double.doubleToLongBits(accrualsDeferredIncomeDue) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = amortisationOfIntangibles != +0.0d ? Double.doubleToLongBits(amortisationOfIntangibles) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsFinancial != +0.0d ? Double.doubleToLongBits(assetsFinancial) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsFinancialCurrent != +0.0d ? Double.doubleToLongBits(assetsFinancialCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsIntangible != +0.0d ? Double.doubleToLongBits(assetsIntangible) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsInvestment != +0.0d ? Double.doubleToLongBits(assetsInvestment) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsOtherCurrent != +0.0d ? Double.doubleToLongBits(assetsOtherCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsOtherNonCurrent != +0.0d ? Double.doubleToLongBits(assetsOtherNonCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsTangible != +0.0d ? Double.doubleToLongBits(assetsTangible) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsTotalCurrent != +0.0d ? Double.doubleToLongBits(assetsTotalCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = assetsTotalNonCurrent != +0.0d ? Double.doubleToLongBits(assetsTotalNonCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = auditorFees != +0.0d ? Double.doubleToLongBits(auditorFees) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = bankInterestPayable != +0.0d ? Double.doubleToLongBits(bankInterestPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = bankInterestReceivable != +0.0d ? Double.doubleToLongBits(bankInterestReceivable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = bankLoan != +0.0d ? Double.doubleToLongBits(bankLoan) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = bankOverdraft != +0.0d ? Double.doubleToLongBits(bankOverdraft) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = cashEquivalents != +0.0d ? Double.doubleToLongBits(cashEquivalents) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = cashYearStart != +0.0d ? Double.doubleToLongBits(cashYearStart) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = changeInCash != +0.0d ? Double.doubleToLongBits(changeInCash) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (consolidated != null ? consolidated.hashCode() : 0);
        temp = costOfSales != +0.0d ? Double.doubleToLongBits(costOfSales) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        temp = currentGrants != +0.0d ? Double.doubleToLongBits(currentGrants) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = currentHpCommitments != +0.0d ? Double.doubleToLongBits(currentHpCommitments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = currentLeaseCommitments != +0.0d ? Double.doubleToLongBits(currentLeaseCommitments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = debtorsDueAfter != +0.0d ? Double.doubleToLongBits(debtorsDueAfter) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = depreciationOfTangibles != +0.0d ? Double.doubleToLongBits(depreciationOfTangibles) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorFees != +0.0d ? Double.doubleToLongBits(directorFees) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorOther != +0.0d ? Double.doubleToLongBits(directorOther) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorPensions != +0.0d ? Double.doubleToLongBits(directorPensions) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorSocialSecurity != +0.0d ? Double.doubleToLongBits(directorSocialSecurity) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorsAccounts != +0.0d ? Double.doubleToLongBits(directorsAccounts) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = directorsRemuneration != +0.0d ? Double.doubleToLongBits(directorsRemuneration) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = dividendsPaid != +0.0d ? Double.doubleToLongBits(dividendsPaid) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeeCosts != +0.0d ? Double.doubleToLongBits(employeeCosts) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeeNumbers != +0.0d ? Double.doubleToLongBits(employeeNumbers) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeeOther != +0.0d ? Double.doubleToLongBits(employeeOther) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeePensions != +0.0d ? Double.doubleToLongBits(employeePensions) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeeRemuneration != +0.0d ? Double.doubleToLongBits(employeeRemuneration) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = employeeSocialSecurity != +0.0d ? Double.doubleToLongBits(employeeSocialSecurity) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exceptionalItems != +0.0d ? Double.doubleToLongBits(exceptionalItems) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exceptionalOtherItems != +0.0d ? Double.doubleToLongBits(exceptionalOtherItems) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exceptionalPandlOnAcquisition != +0.0d ? Double.doubleToLongBits(exceptionalPandlOnAcquisition) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exceptionalPandlOnReorganisations != +0.0d ? Double.doubleToLongBits(exceptionalPandlOnReorganisations) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exchangeRateEffect != +0.0d ? Double.doubleToLongBits(exchangeRateEffect) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = exports != +0.0d ? Double.doubleToLongBits(exports) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = financingActivities != +0.0d ? Double.doubleToLongBits(financingActivities) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = finishedGoods != +0.0d ? Double.doubleToLongBits(finishedGoods) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = grossProfit != +0.0d ? Double.doubleToLongBits(grossProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = groupAccounts != +0.0d ? Double.doubleToLongBits(groupAccounts) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = groupAccountsPayable != +0.0d ? Double.doubleToLongBits(groupAccountsPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = groupDebtors != +0.0d ? Double.doubleToLongBits(groupDebtors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = groupInterestReceivable != +0.0d ? Double.doubleToLongBits(groupInterestReceivable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = highestPaidDirector != +0.0d ? Double.doubleToLongBits(highestPaidDirector) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = hpInterestPayable != +0.0d ? Double.doubleToLongBits(hpInterestPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = interestBearingLoans != +0.0d ? Double.doubleToLongBits(interestBearingLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = interestPayable != +0.0d ? Double.doubleToLongBits(interestPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = interestReceivable != +0.0d ? Double.doubleToLongBits(interestReceivable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = inventories != +0.0d ? Double.doubleToLongBits(inventories) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = investingActivities != +0.0d ? Double.doubleToLongBits(investingActivities) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = leaseInterestPayable != +0.0d ? Double.doubleToLongBits(leaseInterestPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesCurrentFinancial != +0.0d ? Double.doubleToLongBits(liabilitiesCurrentFinancial) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesCurrentResale != +0.0d ? Double.doubleToLongBits(liabilitiesCurrentResale) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesCurrentTax != +0.0d ? Double.doubleToLongBits(liabilitiesCurrentTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesDeferredTax != +0.0d ? Double.doubleToLongBits(liabilitiesDeferredTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesNonCurrentFinancial != +0.0d ? Double.doubleToLongBits(liabilitiesNonCurrentFinancial) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesNonCurrentResale != +0.0d ? Double.doubleToLongBits(liabilitiesNonCurrentResale) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesOtherCurrent != +0.0d ? Double.doubleToLongBits(liabilitiesOtherCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesOtherCurrentFinancial != +0.0d ? Double.doubleToLongBits(liabilitiesOtherCurrentFinancial) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesOtherNonCurrentFinancial != +0.0d ? Double.doubleToLongBits(liabilitiesOtherNonCurrentFinancial) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesPension != +0.0d ? Double.doubleToLongBits(liabilitiesPension) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesTotalCurrent != +0.0d ? Double.doubleToLongBits(liabilitiesTotalCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesTotalNonCurrent != +0.0d ? Double.doubleToLongBits(liabilitiesTotalNonCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesTotalOtherCurrent != +0.0d ? Double.doubleToLongBits(liabilitiesTotalOtherCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = liabilitiesTotalOtherNonCurrent != +0.0d ? Double.doubleToLongBits(liabilitiesTotalOtherNonCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = minorityInterests != +0.0d ? Double.doubleToLongBits(minorityInterests) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = minorityInterestsProfit != +0.0d ? Double.doubleToLongBits(minorityInterestsProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = miscDebtors != +0.0d ? Double.doubleToLongBits(miscDebtors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + months;
        temp = netChangeInCash != +0.0d ? Double.doubleToLongBits(netChangeInCash) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentDirectorsLoans != +0.0d ? Double.doubleToLongBits(nonCurrentDirectorsLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentGrants != +0.0d ? Double.doubleToLongBits(nonCurrentGrants) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentGroupAccountsPayable != +0.0d ? Double.doubleToLongBits(nonCurrentGroupAccountsPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentGroupLoans != +0.0d ? Double.doubleToLongBits(nonCurrentGroupLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentHpCommitments != +0.0d ? Double.doubleToLongBits(nonCurrentHpCommitments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentLeaseCommitments != +0.0d ? Double.doubleToLongBits(nonCurrentLeaseCommitments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentOtherPayables != +0.0d ? Double.doubleToLongBits(nonCurrentOtherPayables) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = nonCurrentTradePayables != +0.0d ? Double.doubleToLongBits(nonCurrentTradePayables) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = operatingActivities != +0.0d ? Double.doubleToLongBits(operatingActivities) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = operatingProfit != +0.0d ? Double.doubleToLongBits(operatingProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = operationsLoss != +0.0d ? Double.doubleToLongBits(operationsLoss) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = ordinaryShares != +0.0d ? Double.doubleToLongBits(ordinaryShares) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherAppropriations != +0.0d ? Double.doubleToLongBits(otherAppropriations) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherAuditCosts != +0.0d ? Double.doubleToLongBits(otherAuditCosts) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherInterestPayable != +0.0d ? Double.doubleToLongBits(otherInterestPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherInterestReceivable != +0.0d ? Double.doubleToLongBits(otherInterestReceivable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherPayables != +0.0d ? Double.doubleToLongBits(otherPayables) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherProvisions != +0.0d ? Double.doubleToLongBits(otherProvisions) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherReceivables != +0.0d ? Double.doubleToLongBits(otherReceivables) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherReserves != +0.0d ? Double.doubleToLongBits(otherReserves) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = otherShares != +0.0d ? Double.doubleToLongBits(otherShares) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = pandlRevenueReserve != +0.0d ? Double.doubleToLongBits(pandlRevenueReserve) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = preTaxProfit != +0.0d ? Double.doubleToLongBits(preTaxProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = preferenceShares != +0.0d ? Double.doubleToLongBits(preferenceShares) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = profitAfterTax != +0.0d ? Double.doubleToLongBits(profitAfterTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = provisions != +0.0d ? Double.doubleToLongBits(provisions) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = provisionsCharges != +0.0d ? Double.doubleToLongBits(provisionsCharges) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = rawMaterials != +0.0d ? Double.doubleToLongBits(rawMaterials) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = retainedProfit != +0.0d ? Double.doubleToLongBits(retainedProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = revaluationReserve != +0.0d ? Double.doubleToLongBits(revaluationReserve) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = shortTermLoans != +0.0d ? Double.doubleToLongBits(shortTermLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = statutoryAuditCosts != +0.0d ? Double.doubleToLongBits(statutoryAuditCosts) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = tax != +0.0d ? Double.doubleToLongBits(tax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalCalledIssuedCapital != +0.0d ? Double.doubleToLongBits(totalCalledIssuedCapital) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalShareholderFunds != +0.0d ? Double.doubleToLongBits(totalShareholderFunds) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = tradeCreditors != +0.0d ? Double.doubleToLongBits(tradeCreditors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = tradeDebtors != +0.0d ? Double.doubleToLongBits(tradeDebtors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = tradeOtherPayables != +0.0d ? Double.doubleToLongBits(tradeOtherPayables) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = turnover != +0.0d ? Double.doubleToLongBits(turnover) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = workInProgress != +0.0d ? Double.doubleToLongBits(workInProgress) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = yearEndCashEquivalents != +0.0d ? Double.doubleToLongBits(yearEndCashEquivalents) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayIfrsAccounts{" +
                "id='" + id + '\'' +
                ", accountStatus=" + accountStatus +
                ", accountantFees=" + accountantFees +
                ", accrualsDeferredIncome=" + accrualsDeferredIncome +
                ", accrualsDeferredIncomeDue=" + accrualsDeferredIncomeDue +
                ", amortisationOfIntangibles=" + amortisationOfIntangibles +
                ", assetsFinancial=" + assetsFinancial +
                ", assetsFinancialCurrent=" + assetsFinancialCurrent +
                ", assetsIntangible=" + assetsIntangible +
                ", assetsInvestment=" + assetsInvestment +
                ", assetsOtherCurrent=" + assetsOtherCurrent +
                ", assetsOtherNonCurrent=" + assetsOtherNonCurrent +
                ", assetsTangible=" + assetsTangible +
                ", assetsTotalCurrent=" + assetsTotalCurrent +
                ", assetsTotalNonCurrent=" + assetsTotalNonCurrent +
                ", auditorFees=" + auditorFees +
                ", bankInterestPayable=" + bankInterestPayable +
                ", bankInterestReceivable=" + bankInterestReceivable +
                ", bankLoan=" + bankLoan +
                ", bankOverdraft=" + bankOverdraft +
                ", cashEquivalents=" + cashEquivalents +
                ", cashYearStart=" + cashYearStart +
                ", changeInCash=" + changeInCash +
                ", consolidated='" + consolidated + '\'' +
                ", costOfSales=" + costOfSales +
                ", currency='" + currency + '\'' +
                ", currentGrants=" + currentGrants +
                ", currentHpCommitments=" + currentHpCommitments +
                ", currentLeaseCommitments=" + currentLeaseCommitments +
                ", debtorsDueAfter=" + debtorsDueAfter +
                ", depreciationOfTangibles=" + depreciationOfTangibles +
                ", directorFees=" + directorFees +
                ", directorOther=" + directorOther +
                ", directorPensions=" + directorPensions +
                ", directorSocialSecurity=" + directorSocialSecurity +
                ", directorsAccounts=" + directorsAccounts +
                ", directorsRemuneration=" + directorsRemuneration +
                ", dividendsPaid=" + dividendsPaid +
                ", employeeCosts=" + employeeCosts +
                ", employeeNumbers=" + employeeNumbers +
                ", employeeOther=" + employeeOther +
                ", employeePensions=" + employeePensions +
                ", employeeRemuneration=" + employeeRemuneration +
                ", employeeSocialSecurity=" + employeeSocialSecurity +
                ", exceptionalItems=" + exceptionalItems +
                ", exceptionalOtherItems=" + exceptionalOtherItems +
                ", exceptionalPandlOnAcquisition=" + exceptionalPandlOnAcquisition +
                ", exceptionalPandlOnReorganisations=" + exceptionalPandlOnReorganisations +
                ", exchangeRateEffect=" + exchangeRateEffect +
                ", exports=" + exports +
                ", financingActivities=" + financingActivities +
                ", finishedGoods=" + finishedGoods +
                ", grossProfit=" + grossProfit +
                ", groupAccounts=" + groupAccounts +
                ", groupAccountsPayable=" + groupAccountsPayable +
                ", groupDebtors=" + groupDebtors +
                ", groupInterestReceivable=" + groupInterestReceivable +
                ", highestPaidDirector=" + highestPaidDirector +
                ", hpInterestPayable=" + hpInterestPayable +
                ", interestBearingLoans=" + interestBearingLoans +
                ", interestPayable=" + interestPayable +
                ", interestReceivable=" + interestReceivable +
                ", inventories=" + inventories +
                ", investingActivities=" + investingActivities +
                ", leaseInterestPayable=" + leaseInterestPayable +
                ", liabilitiesCurrentFinancial=" + liabilitiesCurrentFinancial +
                ", liabilitiesCurrentResale=" + liabilitiesCurrentResale +
                ", liabilitiesCurrentTax=" + liabilitiesCurrentTax +
                ", liabilitiesDeferredTax=" + liabilitiesDeferredTax +
                ", liabilitiesNonCurrentFinancial=" + liabilitiesNonCurrentFinancial +
                ", liabilitiesNonCurrentResale=" + liabilitiesNonCurrentResale +
                ", liabilitiesOtherCurrent=" + liabilitiesOtherCurrent +
                ", liabilitiesOtherCurrentFinancial=" + liabilitiesOtherCurrentFinancial +
                ", liabilitiesOtherNonCurrentFinancial=" + liabilitiesOtherNonCurrentFinancial +
                ", liabilitiesPension=" + liabilitiesPension +
                ", liabilitiesTotalCurrent=" + liabilitiesTotalCurrent +
                ", liabilitiesTotalNonCurrent=" + liabilitiesTotalNonCurrent +
                ", liabilitiesTotalOtherCurrent=" + liabilitiesTotalOtherCurrent +
                ", liabilitiesTotalOtherNonCurrent=" + liabilitiesTotalOtherNonCurrent +
                ", minorityInterests=" + minorityInterests +
                ", minorityInterestsProfit=" + minorityInterestsProfit +
                ", miscDebtors=" + miscDebtors +
                ", months=" + months +
                ", netChangeInCash=" + netChangeInCash +
                ", nonCurrentDirectorsLoans=" + nonCurrentDirectorsLoans +
                ", nonCurrentGrants=" + nonCurrentGrants +
                ", nonCurrentGroupAccountsPayable=" + nonCurrentGroupAccountsPayable +
                ", nonCurrentGroupLoans=" + nonCurrentGroupLoans +
                ", nonCurrentHpCommitments=" + nonCurrentHpCommitments +
                ", nonCurrentLeaseCommitments=" + nonCurrentLeaseCommitments +
                ", nonCurrentOtherPayables=" + nonCurrentOtherPayables +
                ", nonCurrentTradePayables=" + nonCurrentTradePayables +
                ", operatingActivities=" + operatingActivities +
                ", operatingProfit=" + operatingProfit +
                ", operationsLoss=" + operationsLoss +
                ", ordinaryShares=" + ordinaryShares +
                ", otherAppropriations=" + otherAppropriations +
                ", otherAuditCosts=" + otherAuditCosts +
                ", otherInterestPayable=" + otherInterestPayable +
                ", otherInterestReceivable=" + otherInterestReceivable +
                ", otherPayables=" + otherPayables +
                ", otherProvisions=" + otherProvisions +
                ", otherReceivables=" + otherReceivables +
                ", otherReserves=" + otherReserves +
                ", otherShares=" + otherShares +
                ", pandlRevenueReserve=" + pandlRevenueReserve +
                ", preTaxProfit=" + preTaxProfit +
                ", preferenceShares=" + preferenceShares +
                ", profitAfterTax=" + profitAfterTax +
                ", provisions=" + provisions +
                ", provisionsCharges=" + provisionsCharges +
                ", rawMaterials=" + rawMaterials +
                ", retainedProfit=" + retainedProfit +
                ", revaluationReserve=" + revaluationReserve +
                ", shortTermLoans=" + shortTermLoans +
                ", statutoryAuditCosts=" + statutoryAuditCosts +
                ", tax=" + tax +
                ", totalCalledIssuedCapital=" + totalCalledIssuedCapital +
                ", totalShareholderFunds=" + totalShareholderFunds +
                ", tradeCreditors=" + tradeCreditors +
                ", tradeDebtors=" + tradeDebtors +
                ", tradeOtherPayables=" + tradeOtherPayables +
                ", turnover=" + turnover +
                ", workInProgress=" + workInProgress +
                ", yearEndCashEquivalents=" + yearEndCashEquivalents +
                '}';
    }
}

package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayCompanies {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String liquidationStatus;

    public String getLiquidationStatus() {
        return liquidationStatus;
    }

    public void setLiquidationStatus(String liquidationStatus) {
        this.liquidationStatus = liquidationStatus;
    }

    private boolean administrationOrder;

    public boolean isAdministrationOrder() {
        return administrationOrder;
    }

    public void setAdministrationOrder(boolean administrationOrder) {
        this.administrationOrder = administrationOrder;
    }

    private boolean voluntaryAgreement;

    public boolean isVoluntaryAgreement() {
        return voluntaryAgreement;
    }

    public void setVoluntaryAgreement(boolean voluntaryAgreement) {
        this.voluntaryAgreement = voluntaryAgreement;
    }

    private boolean administration;

    public boolean isAdministration() {
        return administration;
    }

    public void setAdministration(boolean administration) {
        this.administration = administration;
    }

    private boolean receivership;

    public boolean isReceivership() {
        return receivership;
    }

    public void setReceivership(boolean receivership) {
        this.receivership = receivership;
    }

    private Timestamp incorporationDate;

    public Timestamp getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(Timestamp incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    private Timestamp latestAnnualReturnDate;

    public Timestamp getLatestAnnualReturnDate() {
        return latestAnnualReturnDate;
    }

    public void setLatestAnnualReturnDate(Timestamp latestAnnualReturnDate) {
        this.latestAnnualReturnDate = latestAnnualReturnDate;
    }

    private Timestamp nextAnnualReturnDate;

    public Timestamp getNextAnnualReturnDate() {
        return nextAnnualReturnDate;
    }

    public void setNextAnnualReturnDate(Timestamp nextAnnualReturnDate) {
        this.nextAnnualReturnDate = nextAnnualReturnDate;
    }

    private Timestamp latestAccountsDate;

    public Timestamp getLatestAccountsDate() {
        return latestAccountsDate;
    }

    public void setLatestAccountsDate(Timestamp latestAccountsDate) {
        this.latestAccountsDate = latestAccountsDate;
    }

    private String charityNumber;

    public String getCharityNumber() {
        return charityNumber;
    }

    public void setCharityNumber(String charityNumber) {
        this.charityNumber = charityNumber;
    }

    private String companyType;

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    private String accountsType;

    public String getAccountsType() {
        return accountsType;
    }

    public void setAccountsType(String accountsType) {
        this.accountsType = accountsType;
    }

    private String sicCode;

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    private String sicDescription;

    public String getSicDescription() {
        return sicDescription;
    }

    public void setSicDescription(String sicDescription) {
        this.sicDescription = sicDescription;
    }

    private int sicCodesCount;

    public int getSicCodesCount() {
        return sicCodesCount;
    }

    public void setSicCodesCount(int sicCodesCount) {
        this.sicCodesCount = sicCodesCount;
    }

    private String previousName;

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    private int previousNameCount;

    public int getPreviousNameCount() {
        return previousNameCount;
    }

    public void setPreviousNameCount(int previousNameCount) {
        this.previousNameCount = previousNameCount;
    }

    private Timestamp previousNameLastChanged;

    public Timestamp getPreviousNameLastChanged() {
        return previousNameLastChanged;
    }

    public void setPreviousNameLastChanged(Timestamp previousNameLastChanged) {
        this.previousNameLastChanged = previousNameLastChanged;
    }

    private String regAddress1;

    public String getRegAddress1() {
        return regAddress1;
    }

    public void setRegAddress1(String regAddress1) {
        this.regAddress1 = regAddress1;
    }

    private String regAddress2;

    public String getRegAddress2() {
        return regAddress2;
    }

    public void setRegAddress2(String regAddress2) {
        this.regAddress2 = regAddress2;
    }

    private String regAddress3;

    public String getRegAddress3() {
        return regAddress3;
    }

    public void setRegAddress3(String regAddress3) {
        this.regAddress3 = regAddress3;
    }

    private String regAddress4;

    public String getRegAddress4() {
        return regAddress4;
    }

    public void setRegAddress4(String regAddress4) {
        this.regAddress4 = regAddress4;
    }

    private int creditLimitLatest;

    public int getCreditLimitLatest() {
        return creditLimitLatest;
    }

    public void setCreditLimitLatest(int creditLimitLatest) {
        this.creditLimitLatest = creditLimitLatest;
    }

    private Timestamp creditLimitLatestDate;

    public Timestamp getCreditLimitLatestDate() {
        return creditLimitLatestDate;
    }

    public void setCreditLimitLatestDate(Timestamp creditLimitLatestDate) {
        this.creditLimitLatestDate = creditLimitLatestDate;
    }

    private int creditRatingLatest;

    public int getCreditRatingLatest() {
        return creditRatingLatest;
    }

    public void setCreditRatingLatest(int creditRatingLatest) {
        this.creditRatingLatest = creditRatingLatest;
    }

    private Timestamp creditRatingLatestDate;

    public Timestamp getCreditRatingLatestDate() {
        return creditRatingLatestDate;
    }

    public void setCreditRatingLatestDate(Timestamp creditRatingLatestDate) {
        this.creditRatingLatestDate = creditRatingLatestDate;
    }

    private String creditRatingLatestDescription;

    public String getCreditRatingLatestDescription() {
        return creditRatingLatestDescription;
    }

    public void setCreditRatingLatestDescription(String creditRatingLatestDescription) {
        this.creditRatingLatestDescription = creditRatingLatestDescription;
    }

    private int bankAccountsCount;

    public int getBankAccountsCount() {
        return bankAccountsCount;
    }

    public void setBankAccountsCount(int bankAccountsCount) {
        this.bankAccountsCount = bankAccountsCount;
    }

    private Timestamp ccjUpdateLatest;

    public Timestamp getCcjUpdateLatest() {
        return ccjUpdateLatest;
    }

    public void setCcjUpdateLatest(Timestamp ccjUpdateLatest) {
        this.ccjUpdateLatest = ccjUpdateLatest;
    }

    private int shareholdingsCount;

    public int getShareholdingsCount() {
        return shareholdingsCount;
    }

    public void setShareholdingsCount(int shareholdingsCount) {
        this.shareholdingsCount = shareholdingsCount;
    }

    private double sharesIssued;

    public double getSharesIssued() {
        return sharesIssued;
    }

    public void setSharesIssued(double sharesIssued) {
        this.sharesIssued = sharesIssued;
    }

    private int ordinaryShareholdingsCount;

    public int getOrdinaryShareholdingsCount() {
        return ordinaryShareholdingsCount;
    }

    public void setOrdinaryShareholdingsCount(int ordinaryShareholdingsCount) {
        this.ordinaryShareholdingsCount = ordinaryShareholdingsCount;
    }

    private double ordinarySharesIssued;

    public double getOrdinarySharesIssued() {
        return ordinarySharesIssued;
    }

    public void setOrdinarySharesIssued(double ordinarySharesIssued) {
        this.ordinarySharesIssued = ordinarySharesIssued;
    }

    private int preferenceShareholdingsCount;

    public int getPreferenceShareholdingsCount() {
        return preferenceShareholdingsCount;
    }

    public void setPreferenceShareholdingsCount(int preferenceShareholdingsCount) {
        this.preferenceShareholdingsCount = preferenceShareholdingsCount;
    }

    private double preferenceSharesIssued;

    public double getPreferenceSharesIssued() {
        return preferenceSharesIssued;
    }

    public void setPreferenceSharesIssued(double preferenceSharesIssued) {
        this.preferenceSharesIssued = preferenceSharesIssued;
    }

    private String accountsAccountStatus;

    public String getAccountsAccountStatus() {
        return accountsAccountStatus;
    }

    public void setAccountsAccountStatus(String accountsAccountStatus) {
        this.accountsAccountStatus = accountsAccountStatus;
    }

    private String accountsAccountants;

    public String getAccountsAccountants() {
        return accountsAccountants;
    }

    public void setAccountsAccountants(String accountsAccountants) {
        this.accountsAccountants = accountsAccountants;
    }

    private String accountsAccountsFormat;

    public String getAccountsAccountsFormat() {
        return accountsAccountsFormat;
    }

    public void setAccountsAccountsFormat(String accountsAccountsFormat) {
        this.accountsAccountsFormat = accountsAccountsFormat;
    }

    private double accountsAssetsCurrent;

    public double getAccountsAssetsCurrent() {
        return accountsAssetsCurrent;
    }

    public void setAccountsAssetsCurrent(double accountsAssetsCurrent) {
        this.accountsAssetsCurrent = accountsAssetsCurrent;
    }

    private double accountsAssetsIntangible;

    public double getAccountsAssetsIntangible() {
        return accountsAssetsIntangible;
    }

    public void setAccountsAssetsIntangible(double accountsAssetsIntangible) {
        this.accountsAssetsIntangible = accountsAssetsIntangible;
    }

    private double accountsAssetsNet;

    public double getAccountsAssetsNet() {
        return accountsAssetsNet;
    }

    public void setAccountsAssetsNet(double accountsAssetsNet) {
        this.accountsAssetsNet = accountsAssetsNet;
    }

    private double accountsAssetsOtherCurrent;

    public double getAccountsAssetsOtherCurrent() {
        return accountsAssetsOtherCurrent;
    }

    public void setAccountsAssetsOtherCurrent(double accountsAssetsOtherCurrent) {
        this.accountsAssetsOtherCurrent = accountsAssetsOtherCurrent;
    }

    private double accountsAssetsTangible;

    public double getAccountsAssetsTangible() {
        return accountsAssetsTangible;
    }

    public void setAccountsAssetsTangible(double accountsAssetsTangible) {
        this.accountsAssetsTangible = accountsAssetsTangible;
    }

    private double accountsAssetsTotal;

    public double getAccountsAssetsTotal() {
        return accountsAssetsTotal;
    }

    public void setAccountsAssetsTotal(double accountsAssetsTotal) {
        this.accountsAssetsTotal = accountsAssetsTotal;
    }

    private double accountsAssetsTotalCurrent;

    public double getAccountsAssetsTotalCurrent() {
        return accountsAssetsTotalCurrent;
    }

    public void setAccountsAssetsTotalCurrent(double accountsAssetsTotalCurrent) {
        this.accountsAssetsTotalCurrent = accountsAssetsTotalCurrent;
    }

    private double accountsAssetsTotalFix;

    public double getAccountsAssetsTotalFix() {
        return accountsAssetsTotalFix;
    }

    public void setAccountsAssetsTotalFix(double accountsAssetsTotalFix) {
        this.accountsAssetsTotalFix = accountsAssetsTotalFix;
    }

    private double accountsAuditFees;

    public double getAccountsAuditFees() {
        return accountsAuditFees;
    }

    public void setAccountsAuditFees(double accountsAuditFees) {
        this.accountsAuditFees = accountsAuditFees;
    }

    private String accountsAuditors;

    public String getAccountsAuditors() {
        return accountsAuditors;
    }

    public void setAccountsAuditors(String accountsAuditors) {
        this.accountsAuditors = accountsAuditors;
    }

    private double accountsBankOverdraft;

    public double getAccountsBankOverdraft() {
        return accountsBankOverdraft;
    }

    public void setAccountsBankOverdraft(double accountsBankOverdraft) {
        this.accountsBankOverdraft = accountsBankOverdraft;
    }

    private double accountsBankOverdraftLtLoans;

    public double getAccountsBankOverdraftLtLoans() {
        return accountsBankOverdraftLtLoans;
    }

    public void setAccountsBankOverdraftLtLoans(double accountsBankOverdraftLtLoans) {
        this.accountsBankOverdraftLtLoans = accountsBankOverdraftLtLoans;
    }

    private double accountsCapitalEmployed;

    public double getAccountsCapitalEmployed() {
        return accountsCapitalEmployed;
    }

    public void setAccountsCapitalEmployed(double accountsCapitalEmployed) {
        this.accountsCapitalEmployed = accountsCapitalEmployed;
    }

    private double accountsCash;

    public double getAccountsCash() {
        return accountsCash;
    }

    public void setAccountsCash(double accountsCash) {
        this.accountsCash = accountsCash;
    }

    private String accountsConsolidated;

    public String getAccountsConsolidated() {
        return accountsConsolidated;
    }

    public void setAccountsConsolidated(String accountsConsolidated) {
        this.accountsConsolidated = accountsConsolidated;
    }

    private double accountsContingentLiability;

    public double getAccountsContingentLiability() {
        return accountsContingentLiability;
    }

    public void setAccountsContingentLiability(double accountsContingentLiability) {
        this.accountsContingentLiability = accountsContingentLiability;
    }

    private double accountsCostOfSales;

    public double getAccountsCostOfSales() {
        return accountsCostOfSales;
    }

    public void setAccountsCostOfSales(double accountsCostOfSales) {
        this.accountsCostOfSales = accountsCostOfSales;
    }

    private String accountsCurrency;

    public String getAccountsCurrency() {
        return accountsCurrency;
    }

    public void setAccountsCurrency(String accountsCurrency) {
        this.accountsCurrency = accountsCurrency;
    }

    private Timestamp accountsDate;

    public Timestamp getAccountsDate() {
        return accountsDate;
    }

    public void setAccountsDate(Timestamp accountsDate) {
        this.accountsDate = accountsDate;
    }

    private double accountsDepreciation;

    public double getAccountsDepreciation() {
        return accountsDepreciation;
    }

    public void setAccountsDepreciation(double accountsDepreciation) {
        this.accountsDepreciation = accountsDepreciation;
    }

    private double accountsDirectorsEmoluments;

    public double getAccountsDirectorsEmoluments() {
        return accountsDirectorsEmoluments;
    }

    public void setAccountsDirectorsEmoluments(double accountsDirectorsEmoluments) {
        this.accountsDirectorsEmoluments = accountsDirectorsEmoluments;
    }

    private double accountsDividendsPayable;

    public double getAccountsDividendsPayable() {
        return accountsDividendsPayable;
    }

    public void setAccountsDividendsPayable(double accountsDividendsPayable) {
        this.accountsDividendsPayable = accountsDividendsPayable;
    }

    private double accountsExports;

    public double getAccountsExports() {
        return accountsExports;
    }

    public void setAccountsExports(double accountsExports) {
        this.accountsExports = accountsExports;
    }

    private double accountsGrossProfit;

    public double getAccountsGrossProfit() {
        return accountsGrossProfit;
    }

    public void setAccountsGrossProfit(double accountsGrossProfit) {
        this.accountsGrossProfit = accountsGrossProfit;
    }

    private double accountsIncreaseInCash;

    public double getAccountsIncreaseInCash() {
        return accountsIncreaseInCash;
    }

    public void setAccountsIncreaseInCash(double accountsIncreaseInCash) {
        this.accountsIncreaseInCash = accountsIncreaseInCash;
    }

    private double accountsInterestPayments;

    public double getAccountsInterestPayments() {
        return accountsInterestPayments;
    }

    public void setAccountsInterestPayments(double accountsInterestPayments) {
        this.accountsInterestPayments = accountsInterestPayments;
    }

    private String accountsJointAuditors;

    public String getAccountsJointAuditors() {
        return accountsJointAuditors;
    }

    public void setAccountsJointAuditors(String accountsJointAuditors) {
        this.accountsJointAuditors = accountsJointAuditors;
    }

    private double accountsLiabilitiesCurrent;

    public double getAccountsLiabilitiesCurrent() {
        return accountsLiabilitiesCurrent;
    }

    public void setAccountsLiabilitiesCurrent(double accountsLiabilitiesCurrent) {
        this.accountsLiabilitiesCurrent = accountsLiabilitiesCurrent;
    }

    private double accountsLiabilitiesLt;

    public double getAccountsLiabilitiesLt() {
        return accountsLiabilitiesLt;
    }

    public void setAccountsLiabilitiesLt(double accountsLiabilitiesLt) {
        this.accountsLiabilitiesLt = accountsLiabilitiesLt;
    }

    private double accountsLiabilitiesMiscCurrent;

    public double getAccountsLiabilitiesMiscCurrent() {
        return accountsLiabilitiesMiscCurrent;
    }

    public void setAccountsLiabilitiesMiscCurrent(double accountsLiabilitiesMiscCurrent) {
        this.accountsLiabilitiesMiscCurrent = accountsLiabilitiesMiscCurrent;
    }

    private double accountsLiabilitiesTotal;

    public double getAccountsLiabilitiesTotal() {
        return accountsLiabilitiesTotal;
    }

    public void setAccountsLiabilitiesTotal(double accountsLiabilitiesTotal) {
        this.accountsLiabilitiesTotal = accountsLiabilitiesTotal;
    }

    private double accountsLtLoans;

    public double getAccountsLtLoans() {
        return accountsLtLoans;
    }

    public void setAccountsLtLoans(double accountsLtLoans) {
        this.accountsLtLoans = accountsLtLoans;
    }

    private int accountsMonths;

    public int getAccountsMonths() {
        return accountsMonths;
    }

    public void setAccountsMonths(int accountsMonths) {
        this.accountsMonths = accountsMonths;
    }

    private double accountsNetCashflowBeforeFinancing;

    public double getAccountsNetCashflowBeforeFinancing() {
        return accountsNetCashflowBeforeFinancing;
    }

    public void setAccountsNetCashflowBeforeFinancing(double accountsNetCashflowBeforeFinancing) {
        this.accountsNetCashflowBeforeFinancing = accountsNetCashflowBeforeFinancing;
    }

    private double accountsNetCashflowFromFinancing;

    public double getAccountsNetCashflowFromFinancing() {
        return accountsNetCashflowFromFinancing;
    }

    public void setAccountsNetCashflowFromFinancing(double accountsNetCashflowFromFinancing) {
        this.accountsNetCashflowFromFinancing = accountsNetCashflowFromFinancing;
    }

    private double accountsNetWorth;

    public double getAccountsNetWorth() {
        return accountsNetWorth;
    }

    public void setAccountsNetWorth(double accountsNetWorth) {
        this.accountsNetWorth = accountsNetWorth;
    }

    private int accountsNoOfEmployees;

    public int getAccountsNoOfEmployees() {
        return accountsNoOfEmployees;
    }

    public void setAccountsNoOfEmployees(int accountsNoOfEmployees) {
        this.accountsNoOfEmployees = accountsNoOfEmployees;
    }

    private double accountsOperatingProfits;

    public double getAccountsOperatingProfits() {
        return accountsOperatingProfits;
    }

    public void setAccountsOperatingProfits(double accountsOperatingProfits) {
        this.accountsOperatingProfits = accountsOperatingProfits;
    }

    private double accountsOperationsNetCashflow;

    public double getAccountsOperationsNetCashflow() {
        return accountsOperationsNetCashflow;
    }

    public void setAccountsOperationsNetCashflow(double accountsOperationsNetCashflow) {
        this.accountsOperationsNetCashflow = accountsOperationsNetCashflow;
    }

    private double accountsPaidUpEquity;

    public double getAccountsPaidUpEquity() {
        return accountsPaidUpEquity;
    }

    public void setAccountsPaidUpEquity(double accountsPaidUpEquity) {
        this.accountsPaidUpEquity = accountsPaidUpEquity;
    }

    private double accountsPandlAccountReserve;

    public double getAccountsPandlAccountReserve() {
        return accountsPandlAccountReserve;
    }

    public void setAccountsPandlAccountReserve(double accountsPandlAccountReserve) {
        this.accountsPandlAccountReserve = accountsPandlAccountReserve;
    }

    private double accountsPreTaxProfit;

    public double getAccountsPreTaxProfit() {
        return accountsPreTaxProfit;
    }

    public void setAccountsPreTaxProfit(double accountsPreTaxProfit) {
        this.accountsPreTaxProfit = accountsPreTaxProfit;
    }

    private double accountsProfitAfterTax;

    public double getAccountsProfitAfterTax() {
        return accountsProfitAfterTax;
    }

    public void setAccountsProfitAfterTax(double accountsProfitAfterTax) {
        this.accountsProfitAfterTax = accountsProfitAfterTax;
    }

    private String accountsQualificationCode;

    public String getAccountsQualificationCode() {
        return accountsQualificationCode;
    }

    public void setAccountsQualificationCode(String accountsQualificationCode) {
        this.accountsQualificationCode = accountsQualificationCode;
    }

    private double accountsRetainedProfit;

    public double getAccountsRetainedProfit() {
        return accountsRetainedProfit;
    }

    public void setAccountsRetainedProfit(double accountsRetainedProfit) {
        this.accountsRetainedProfit = accountsRetainedProfit;
    }

    private double accountsRevaluationReserve;

    public double getAccountsRevaluationReserve() {
        return accountsRevaluationReserve;
    }

    public void setAccountsRevaluationReserve(double accountsRevaluationReserve) {
        this.accountsRevaluationReserve = accountsRevaluationReserve;
    }

    private double accountsShareholderFunds;

    public double getAccountsShareholderFunds() {
        return accountsShareholderFunds;
    }

    public void setAccountsShareholderFunds(double accountsShareholderFunds) {
        this.accountsShareholderFunds = accountsShareholderFunds;
    }

    private double accountsShortTermLoans;

    public double getAccountsShortTermLoans() {
        return accountsShortTermLoans;
    }

    public void setAccountsShortTermLoans(double accountsShortTermLoans) {
        this.accountsShortTermLoans = accountsShortTermLoans;
    }

    private String accountsSolicitors;

    public String getAccountsSolicitors() {
        return accountsSolicitors;
    }

    public void setAccountsSolicitors(String accountsSolicitors) {
        this.accountsSolicitors = accountsSolicitors;
    }

    private double accountsStock;

    public double getAccountsStock() {
        return accountsStock;
    }

    public void setAccountsStock(double accountsStock) {
        this.accountsStock = accountsStock;
    }

    private double accountsSundryReserves;

    public double getAccountsSundryReserves() {
        return accountsSundryReserves;
    }

    public void setAccountsSundryReserves(double accountsSundryReserves) {
        this.accountsSundryReserves = accountsSundryReserves;
    }

    private double accountsTaxation;

    public double getAccountsTaxation() {
        return accountsTaxation;
    }

    public void setAccountsTaxation(double accountsTaxation) {
        this.accountsTaxation = accountsTaxation;
    }

    private double accountsTradeCreditors;

    public double getAccountsTradeCreditors() {
        return accountsTradeCreditors;
    }

    public void setAccountsTradeCreditors(double accountsTradeCreditors) {
        this.accountsTradeCreditors = accountsTradeCreditors;
    }

    private double accountsTradeDebtors;

    public double getAccountsTradeDebtors() {
        return accountsTradeDebtors;
    }

    public void setAccountsTradeDebtors(double accountsTradeDebtors) {
        this.accountsTradeDebtors = accountsTradeDebtors;
    }

    private double accountsTurnover;

    public double getAccountsTurnover() {
        return accountsTurnover;
    }

    public void setAccountsTurnover(double accountsTurnover) {
        this.accountsTurnover = accountsTurnover;
    }

    private double accountsWages;

    public double getAccountsWages() {
        return accountsWages;
    }

    public void setAccountsWages(double accountsWages) {
        this.accountsWages = accountsWages;
    }

    private double accountsWorkingCapital;

    public double getAccountsWorkingCapital() {
        return accountsWorkingCapital;
    }

    public void setAccountsWorkingCapital(double accountsWorkingCapital) {
        this.accountsWorkingCapital = accountsWorkingCapital;
    }

    private int directorsTotal;

    public int getDirectorsTotal() {
        return directorsTotal;
    }

    public void setDirectorsTotal(int directorsTotal) {
        this.directorsTotal = directorsTotal;
    }

    private int directorshipsTotal;

    public int getDirectorshipsTotal() {
        return directorshipsTotal;
    }

    public void setDirectorshipsTotal(int directorshipsTotal) {
        this.directorshipsTotal = directorshipsTotal;
    }

    private int directorshipsOpen;

    public int getDirectorshipsOpen() {
        return directorshipsOpen;
    }

    public void setDirectorshipsOpen(int directorshipsOpen) {
        this.directorshipsOpen = directorshipsOpen;
    }

    private int directorshipsOpenSecretary;

    public int getDirectorshipsOpenSecretary() {
        return directorshipsOpenSecretary;
    }

    public void setDirectorshipsOpenSecretary(int directorshipsOpenSecretary) {
        this.directorshipsOpenSecretary = directorshipsOpenSecretary;
    }

    private int directorshipsOpenDirector;

    public int getDirectorshipsOpenDirector() {
        return directorshipsOpenDirector;
    }

    public void setDirectorshipsOpenDirector(int directorshipsOpenDirector) {
        this.directorshipsOpenDirector = directorshipsOpenDirector;
    }

    private int directorshipsClosed;

    public int getDirectorshipsClosed() {
        return directorshipsClosed;
    }

    public void setDirectorshipsClosed(int directorshipsClosed) {
        this.directorshipsClosed = directorshipsClosed;
    }

    private int directorshipsClosedSecretary;

    public int getDirectorshipsClosedSecretary() {
        return directorshipsClosedSecretary;
    }

    public void setDirectorshipsClosedSecretary(int directorshipsClosedSecretary) {
        this.directorshipsClosedSecretary = directorshipsClosedSecretary;
    }

    private int directorshipsClosedDirector;

    public int getDirectorshipsClosedDirector() {
        return directorshipsClosedDirector;
    }

    public void setDirectorshipsClosedDirector(int directorshipsClosedDirector) {
        this.directorshipsClosedDirector = directorshipsClosedDirector;
    }

    private int directorshipsRetired;

    public int getDirectorshipsRetired() {
        return directorshipsRetired;
    }

    public void setDirectorshipsRetired(int directorshipsRetired) {
        this.directorshipsRetired = directorshipsRetired;
    }

    private int directorshipsRetiredSecretary;

    public int getDirectorshipsRetiredSecretary() {
        return directorshipsRetiredSecretary;
    }

    public void setDirectorshipsRetiredSecretary(int directorshipsRetiredSecretary) {
        this.directorshipsRetiredSecretary = directorshipsRetiredSecretary;
    }

    private int directorshipsRetiredDirector;

    public int getDirectorshipsRetiredDirector() {
        return directorshipsRetiredDirector;
    }

    public void setDirectorshipsRetiredDirector(int directorshipsRetiredDirector) {
        this.directorshipsRetiredDirector = directorshipsRetiredDirector;
    }

    private int documentsTotalCount;

    public int getDocumentsTotalCount() {
        return documentsTotalCount;
    }

    public void setDocumentsTotalCount(int documentsTotalCount) {
        this.documentsTotalCount = documentsTotalCount;
    }

    private Timestamp dataset;

    public Timestamp getDataset() {
        return dataset;
    }

    public void setDataset(Timestamp dataset) {
        this.dataset = dataset;
    }

    private String locale;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    private Timestamp accountsFilingDate;

    public Timestamp getAccountsFilingDate() {
        return accountsFilingDate;
    }

    public void setAccountsFilingDate(Timestamp accountsFilingDate) {
        this.accountsFilingDate = accountsFilingDate;
    }

    private String ftseA;

    public String getFtseA() {
        return ftseA;
    }

    public void setFtseA(String ftseA) {
        this.ftseA = ftseA;
    }

    private String ftseT;

    public String getFtseT() {
        return ftseT;
    }

    public void setFtseT(String ftseT) {
        this.ftseT = ftseT;
    }

    private int mortgagePartialCount;

    public int getMortgagePartialCount() {
        return mortgagePartialCount;
    }

    public void setMortgagePartialCount(int mortgagePartialCount) {
        this.mortgagePartialCount = mortgagePartialCount;
    }

    private int mortgagePartialPropertyReleaseCount;

    public int getMortgagePartialPropertyReleaseCount() {
        return mortgagePartialPropertyReleaseCount;
    }

    public void setMortgagePartialPropertyReleaseCount(int mortgagePartialPropertyReleaseCount) {
        this.mortgagePartialPropertyReleaseCount = mortgagePartialPropertyReleaseCount;
    }

    private int mortgagePartialPropertyCeasingToBelongCount;

    public int getMortgagePartialPropertyCeasingToBelongCount() {
        return mortgagePartialPropertyCeasingToBelongCount;
    }

    public void setMortgagePartialPropertyCeasingToBelongCount(int mortgagePartialPropertyCeasingToBelongCount) {
        this.mortgagePartialPropertyCeasingToBelongCount = mortgagePartialPropertyCeasingToBelongCount;
    }

    private int mortgagePropertyCeasingToBelongCount;

    public int getMortgagePropertyCeasingToBelongCount() {
        return mortgagePropertyCeasingToBelongCount;
    }

    public void setMortgagePropertyCeasingToBelongCount(int mortgagePropertyCeasingToBelongCount) {
        this.mortgagePropertyCeasingToBelongCount = mortgagePropertyCeasingToBelongCount;
    }

    private int mortgagePartialOutstandingCount;

    public int getMortgagePartialOutstandingCount() {
        return mortgagePartialOutstandingCount;
    }

    public void setMortgagePartialOutstandingCount(int mortgagePartialOutstandingCount) {
        this.mortgagePartialOutstandingCount = mortgagePartialOutstandingCount;
    }

    private int mortgagePartialPropertySatisfiedCount;

    public int getMortgagePartialPropertySatisfiedCount() {
        return mortgagePartialPropertySatisfiedCount;
    }

    public void setMortgagePartialPropertySatisfiedCount(int mortgagePartialPropertySatisfiedCount) {
        this.mortgagePartialPropertySatisfiedCount = mortgagePartialPropertySatisfiedCount;
    }

    private int mortgagePartialPropertyCount;

    public int getMortgagePartialPropertyCount() {
        return mortgagePartialPropertyCount;
    }

    public void setMortgagePartialPropertyCount(int mortgagePartialPropertyCount) {
        this.mortgagePartialPropertyCount = mortgagePartialPropertyCount;
    }

    private int mortgagesCount;

    public int getMortgagesCount() {
        return mortgagesCount;
    }

    public void setMortgagesCount(int mortgagesCount) {
        this.mortgagesCount = mortgagesCount;
    }

    private int mortgagesOutstandingCount;

    public int getMortgagesOutstandingCount() {
        return mortgagesOutstandingCount;
    }

    public void setMortgagesOutstandingCount(int mortgagesOutstandingCount) {
        this.mortgagesOutstandingCount = mortgagesOutstandingCount;
    }

    private int mortgagesSatisfiedCount;

    public int getMortgagesSatisfiedCount() {
        return mortgagesSatisfiedCount;
    }

    public void setMortgagesSatisfiedCount(int mortgagesSatisfiedCount) {
        this.mortgagesSatisfiedCount = mortgagesSatisfiedCount;
    }

    private String regAddressPostcode;

    public String getRegAddressPostcode() {
        return regAddressPostcode;
    }

    public void setRegAddressPostcode(String regAddressPostcode) {
        this.regAddressPostcode = regAddressPostcode;
    }

    private String regAreaCode;

    public String getRegAreaCode() {
        return regAreaCode;
    }

    public void setRegAreaCode(String regAreaCode) {
        this.regAreaCode = regAreaCode;
    }

    private String regCareOf;

    public String getRegCareOf() {
        return regCareOf;
    }

    public void setRegCareOf(String regCareOf) {
        this.regCareOf = regCareOf;
    }

    private String regEmail;

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    private String regPhone;

    public String getRegPhone() {
        return regPhone;
    }

    public void setRegPhone(String regPhone) {
        this.regPhone = regPhone;
    }

    private String regPobox;

    public String getRegPobox() {
        return regPobox;
    }

    public void setRegPobox(String regPobox) {
        this.regPobox = regPobox;
    }

    private String regTps;

    public String getRegTps() {
        return regTps;
    }

    public void setRegTps(String regTps) {
        this.regTps = regTps;
    }

    private String regWeb;

    public String getRegWeb() {
        return regWeb;
    }

    public void setRegWeb(String regWeb) {
        this.regWeb = regWeb;
    }

    private String sic2007Code;

    public String getSic2007Code() {
        return sic2007Code;
    }

    public void setSic2007Code(String sic2007Code) {
        this.sic2007Code = sic2007Code;
    }

    private String tradingAddress1;

    public String getTradingAddress1() {
        return tradingAddress1;
    }

    public void setTradingAddress1(String tradingAddress1) {
        this.tradingAddress1 = tradingAddress1;
    }

    private String tradingAddress2;

    public String getTradingAddress2() {
        return tradingAddress2;
    }

    public void setTradingAddress2(String tradingAddress2) {
        this.tradingAddress2 = tradingAddress2;
    }

    private String tradingAddress3;

    public String getTradingAddress3() {
        return tradingAddress3;
    }

    public void setTradingAddress3(String tradingAddress3) {
        this.tradingAddress3 = tradingAddress3;
    }

    private String tradingAddress4;

    public String getTradingAddress4() {
        return tradingAddress4;
    }

    public void setTradingAddress4(String tradingAddress4) {
        this.tradingAddress4 = tradingAddress4;
    }

    private String tradingAddressPostcode;

    public String getTradingAddressPostcode() {
        return tradingAddressPostcode;
    }

    public void setTradingAddressPostcode(String tradingAddressPostcode) {
        this.tradingAddressPostcode = tradingAddressPostcode;
    }

    private String tradingPhone;

    public String getTradingPhone() {
        return tradingPhone;
    }

    public void setTradingPhone(String tradingPhone) {
        this.tradingPhone = tradingPhone;
    }

    private String tradingPhoneStd;

    public String getTradingPhoneStd() {
        return tradingPhoneStd;
    }

    public void setTradingPhoneStd(String tradingPhoneStd) {
        this.tradingPhoneStd = tradingPhoneStd;
    }

    private String regAddressTown;

    public String getRegAddressTown() {
        return regAddressTown;
    }

    public void setRegAddressTown(String regAddressTown) {
        this.regAddressTown = regAddressTown;
    }

    private String regAddressTowncode;

    public String getRegAddressTowncode() {
        return regAddressTowncode;
    }

    public void setRegAddressTowncode(String regAddressTowncode) {
        this.regAddressTowncode = regAddressTowncode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayCompanies that = (DuedilRayCompanies) o;

        if (Double.compare(that.accountsAssetsCurrent, accountsAssetsCurrent) != 0) return false;
        if (Double.compare(that.accountsAssetsIntangible, accountsAssetsIntangible) != 0) return false;
        if (Double.compare(that.accountsAssetsNet, accountsAssetsNet) != 0) return false;
        if (Double.compare(that.accountsAssetsOtherCurrent, accountsAssetsOtherCurrent) != 0) return false;
        if (Double.compare(that.accountsAssetsTangible, accountsAssetsTangible) != 0) return false;
        if (Double.compare(that.accountsAssetsTotal, accountsAssetsTotal) != 0) return false;
        if (Double.compare(that.accountsAssetsTotalCurrent, accountsAssetsTotalCurrent) != 0) return false;
        if (Double.compare(that.accountsAssetsTotalFix, accountsAssetsTotalFix) != 0) return false;
        if (Double.compare(that.accountsAuditFees, accountsAuditFees) != 0) return false;
        if (Double.compare(that.accountsBankOverdraft, accountsBankOverdraft) != 0) return false;
        if (Double.compare(that.accountsBankOverdraftLtLoans, accountsBankOverdraftLtLoans) != 0) return false;
        if (Double.compare(that.accountsCapitalEmployed, accountsCapitalEmployed) != 0) return false;
        if (Double.compare(that.accountsCash, accountsCash) != 0) return false;
        if (Double.compare(that.accountsContingentLiability, accountsContingentLiability) != 0) return false;
        if (Double.compare(that.accountsCostOfSales, accountsCostOfSales) != 0) return false;
        if (Double.compare(that.accountsDepreciation, accountsDepreciation) != 0) return false;
        if (Double.compare(that.accountsDirectorsEmoluments, accountsDirectorsEmoluments) != 0) return false;
        if (Double.compare(that.accountsDividendsPayable, accountsDividendsPayable) != 0) return false;
        if (Double.compare(that.accountsExports, accountsExports) != 0) return false;
        if (Double.compare(that.accountsGrossProfit, accountsGrossProfit) != 0) return false;
        if (Double.compare(that.accountsIncreaseInCash, accountsIncreaseInCash) != 0) return false;
        if (Double.compare(that.accountsInterestPayments, accountsInterestPayments) != 0) return false;
        if (Double.compare(that.accountsLiabilitiesCurrent, accountsLiabilitiesCurrent) != 0) return false;
        if (Double.compare(that.accountsLiabilitiesLt, accountsLiabilitiesLt) != 0) return false;
        if (Double.compare(that.accountsLiabilitiesMiscCurrent, accountsLiabilitiesMiscCurrent) != 0) return false;
        if (Double.compare(that.accountsLiabilitiesTotal, accountsLiabilitiesTotal) != 0) return false;
        if (Double.compare(that.accountsLtLoans, accountsLtLoans) != 0) return false;
        if (accountsMonths != that.accountsMonths) return false;
        if (Double.compare(that.accountsNetCashflowBeforeFinancing, accountsNetCashflowBeforeFinancing) != 0)
            return false;
        if (Double.compare(that.accountsNetCashflowFromFinancing, accountsNetCashflowFromFinancing) != 0) return false;
        if (Double.compare(that.accountsNetWorth, accountsNetWorth) != 0) return false;
        if (accountsNoOfEmployees != that.accountsNoOfEmployees) return false;
        if (Double.compare(that.accountsOperatingProfits, accountsOperatingProfits) != 0) return false;
        if (Double.compare(that.accountsOperationsNetCashflow, accountsOperationsNetCashflow) != 0) return false;
        if (Double.compare(that.accountsPaidUpEquity, accountsPaidUpEquity) != 0) return false;
        if (Double.compare(that.accountsPandlAccountReserve, accountsPandlAccountReserve) != 0) return false;
        if (Double.compare(that.accountsPreTaxProfit, accountsPreTaxProfit) != 0) return false;
        if (Double.compare(that.accountsProfitAfterTax, accountsProfitAfterTax) != 0) return false;
        if (Double.compare(that.accountsRetainedProfit, accountsRetainedProfit) != 0) return false;
        if (Double.compare(that.accountsRevaluationReserve, accountsRevaluationReserve) != 0) return false;
        if (Double.compare(that.accountsShareholderFunds, accountsShareholderFunds) != 0) return false;
        if (Double.compare(that.accountsShortTermLoans, accountsShortTermLoans) != 0) return false;
        if (Double.compare(that.accountsStock, accountsStock) != 0) return false;
        if (Double.compare(that.accountsSundryReserves, accountsSundryReserves) != 0) return false;
        if (Double.compare(that.accountsTaxation, accountsTaxation) != 0) return false;
        if (Double.compare(that.accountsTradeCreditors, accountsTradeCreditors) != 0) return false;
        if (Double.compare(that.accountsTradeDebtors, accountsTradeDebtors) != 0) return false;
        if (Double.compare(that.accountsTurnover, accountsTurnover) != 0) return false;
        if (Double.compare(that.accountsWages, accountsWages) != 0) return false;
        if (Double.compare(that.accountsWorkingCapital, accountsWorkingCapital) != 0) return false;
        if (administration != that.administration) return false;
        if (administrationOrder != that.administrationOrder) return false;
        if (bankAccountsCount != that.bankAccountsCount) return false;
        if (creditLimitLatest != that.creditLimitLatest) return false;
        if (creditRatingLatest != that.creditRatingLatest) return false;
        if (directorsTotal != that.directorsTotal) return false;
        if (directorshipsClosed != that.directorshipsClosed) return false;
        if (directorshipsClosedDirector != that.directorshipsClosedDirector) return false;
        if (directorshipsClosedSecretary != that.directorshipsClosedSecretary) return false;
        if (directorshipsOpen != that.directorshipsOpen) return false;
        if (directorshipsOpenDirector != that.directorshipsOpenDirector) return false;
        if (directorshipsOpenSecretary != that.directorshipsOpenSecretary) return false;
        if (directorshipsRetired != that.directorshipsRetired) return false;
        if (directorshipsRetiredDirector != that.directorshipsRetiredDirector) return false;
        if (directorshipsRetiredSecretary != that.directorshipsRetiredSecretary) return false;
        if (directorshipsTotal != that.directorshipsTotal) return false;
        if (documentsTotalCount != that.documentsTotalCount) return false;
        if (mortgagePartialCount != that.mortgagePartialCount) return false;
        if (mortgagePartialOutstandingCount != that.mortgagePartialOutstandingCount) return false;
        if (mortgagePartialPropertyCeasingToBelongCount != that.mortgagePartialPropertyCeasingToBelongCount)
            return false;
        if (mortgagePartialPropertyCount != that.mortgagePartialPropertyCount) return false;
        if (mortgagePartialPropertyReleaseCount != that.mortgagePartialPropertyReleaseCount) return false;
        if (mortgagePartialPropertySatisfiedCount != that.mortgagePartialPropertySatisfiedCount) return false;
        if (mortgagePropertyCeasingToBelongCount != that.mortgagePropertyCeasingToBelongCount) return false;
        if (mortgagesCount != that.mortgagesCount) return false;
        if (mortgagesOutstandingCount != that.mortgagesOutstandingCount) return false;
        if (mortgagesSatisfiedCount != that.mortgagesSatisfiedCount) return false;
        if (ordinaryShareholdingsCount != that.ordinaryShareholdingsCount) return false;
        if (Double.compare(that.ordinarySharesIssued, ordinarySharesIssued) != 0) return false;
        if (preferenceShareholdingsCount != that.preferenceShareholdingsCount) return false;
        if (Double.compare(that.preferenceSharesIssued, preferenceSharesIssued) != 0) return false;
        if (previousNameCount != that.previousNameCount) return false;
        if (receivership != that.receivership) return false;
        if (shareholdingsCount != that.shareholdingsCount) return false;
        if (Double.compare(that.sharesIssued, sharesIssued) != 0) return false;
        if (sicCodesCount != that.sicCodesCount) return false;
        if (voluntaryAgreement != that.voluntaryAgreement) return false;
        if (accountsAccountStatus != null ? !accountsAccountStatus.equals(that.accountsAccountStatus) : that.accountsAccountStatus != null)
            return false;
        if (accountsAccountants != null ? !accountsAccountants.equals(that.accountsAccountants) : that.accountsAccountants != null)
            return false;
        if (accountsAccountsFormat != null ? !accountsAccountsFormat.equals(that.accountsAccountsFormat) : that.accountsAccountsFormat != null)
            return false;
        if (accountsAuditors != null ? !accountsAuditors.equals(that.accountsAuditors) : that.accountsAuditors != null)
            return false;
        if (accountsConsolidated != null ? !accountsConsolidated.equals(that.accountsConsolidated) : that.accountsConsolidated != null)
            return false;
        if (accountsCurrency != null ? !accountsCurrency.equals(that.accountsCurrency) : that.accountsCurrency != null)
            return false;
        if (accountsDate != null ? !accountsDate.equals(that.accountsDate) : that.accountsDate != null) return false;
        if (accountsFilingDate != null ? !accountsFilingDate.equals(that.accountsFilingDate) : that.accountsFilingDate != null)
            return false;
        if (accountsJointAuditors != null ? !accountsJointAuditors.equals(that.accountsJointAuditors) : that.accountsJointAuditors != null)
            return false;
        if (accountsQualificationCode != null ? !accountsQualificationCode.equals(that.accountsQualificationCode) : that.accountsQualificationCode != null)
            return false;
        if (accountsSolicitors != null ? !accountsSolicitors.equals(that.accountsSolicitors) : that.accountsSolicitors != null)
            return false;
        if (accountsType != null ? !accountsType.equals(that.accountsType) : that.accountsType != null) return false;
        if (ccjUpdateLatest != null ? !ccjUpdateLatest.equals(that.ccjUpdateLatest) : that.ccjUpdateLatest != null)
            return false;
        if (charityNumber != null ? !charityNumber.equals(that.charityNumber) : that.charityNumber != null)
            return false;
        if (companyType != null ? !companyType.equals(that.companyType) : that.companyType != null) return false;
        if (creditLimitLatestDate != null ? !creditLimitLatestDate.equals(that.creditLimitLatestDate) : that.creditLimitLatestDate != null)
            return false;
        if (creditRatingLatestDate != null ? !creditRatingLatestDate.equals(that.creditRatingLatestDate) : that.creditRatingLatestDate != null)
            return false;
        if (creditRatingLatestDescription != null ? !creditRatingLatestDescription.equals(that.creditRatingLatestDescription) : that.creditRatingLatestDescription != null)
            return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (ftseA != null ? !ftseA.equals(that.ftseA) : that.ftseA != null) return false;
        if (ftseT != null ? !ftseT.equals(that.ftseT) : that.ftseT != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (incorporationDate != null ? !incorporationDate.equals(that.incorporationDate) : that.incorporationDate != null)
            return false;
        if (latestAccountsDate != null ? !latestAccountsDate.equals(that.latestAccountsDate) : that.latestAccountsDate != null)
            return false;
        if (latestAnnualReturnDate != null ? !latestAnnualReturnDate.equals(that.latestAnnualReturnDate) : that.latestAnnualReturnDate != null)
            return false;
        if (liquidationStatus != null ? !liquidationStatus.equals(that.liquidationStatus) : that.liquidationStatus != null)
            return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (nextAnnualReturnDate != null ? !nextAnnualReturnDate.equals(that.nextAnnualReturnDate) : that.nextAnnualReturnDate != null)
            return false;
        if (previousName != null ? !previousName.equals(that.previousName) : that.previousName != null) return false;
        if (previousNameLastChanged != null ? !previousNameLastChanged.equals(that.previousNameLastChanged) : that.previousNameLastChanged != null)
            return false;
        if (regAddress1 != null ? !regAddress1.equals(that.regAddress1) : that.regAddress1 != null) return false;
        if (regAddress2 != null ? !regAddress2.equals(that.regAddress2) : that.regAddress2 != null) return false;
        if (regAddress3 != null ? !regAddress3.equals(that.regAddress3) : that.regAddress3 != null) return false;
        if (regAddress4 != null ? !regAddress4.equals(that.regAddress4) : that.regAddress4 != null) return false;
        if (regAddressPostcode != null ? !regAddressPostcode.equals(that.regAddressPostcode) : that.regAddressPostcode != null)
            return false;
        if (regAddressTown != null ? !regAddressTown.equals(that.regAddressTown) : that.regAddressTown != null)
            return false;
        if (regAddressTowncode != null ? !regAddressTowncode.equals(that.regAddressTowncode) : that.regAddressTowncode != null)
            return false;
        if (regAreaCode != null ? !regAreaCode.equals(that.regAreaCode) : that.regAreaCode != null) return false;
        if (regCareOf != null ? !regCareOf.equals(that.regCareOf) : that.regCareOf != null) return false;
        if (regEmail != null ? !regEmail.equals(that.regEmail) : that.regEmail != null) return false;
        if (regPhone != null ? !regPhone.equals(that.regPhone) : that.regPhone != null) return false;
        if (regPobox != null ? !regPobox.equals(that.regPobox) : that.regPobox != null) return false;
        if (regTps != null ? !regTps.equals(that.regTps) : that.regTps != null) return false;
        if (regWeb != null ? !regWeb.equals(that.regWeb) : that.regWeb != null) return false;
        if (sic2007Code != null ? !sic2007Code.equals(that.sic2007Code) : that.sic2007Code != null) return false;
        if (sicCode != null ? !sicCode.equals(that.sicCode) : that.sicCode != null) return false;
        if (sicDescription != null ? !sicDescription.equals(that.sicDescription) : that.sicDescription != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (tradingAddress1 != null ? !tradingAddress1.equals(that.tradingAddress1) : that.tradingAddress1 != null)
            return false;
        if (tradingAddress2 != null ? !tradingAddress2.equals(that.tradingAddress2) : that.tradingAddress2 != null)
            return false;
        if (tradingAddress3 != null ? !tradingAddress3.equals(that.tradingAddress3) : that.tradingAddress3 != null)
            return false;
        if (tradingAddress4 != null ? !tradingAddress4.equals(that.tradingAddress4) : that.tradingAddress4 != null)
            return false;
        if (tradingAddressPostcode != null ? !tradingAddressPostcode.equals(that.tradingAddressPostcode) : that.tradingAddressPostcode != null)
            return false;
        if (tradingPhone != null ? !tradingPhone.equals(that.tradingPhone) : that.tradingPhone != null) return false;
        if (tradingPhoneStd != null ? !tradingPhoneStd.equals(that.tradingPhoneStd) : that.tradingPhoneStd != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (liquidationStatus != null ? liquidationStatus.hashCode() : 0);
        result = 31 * result + (administrationOrder ? 1 : 0);
        result = 31 * result + (voluntaryAgreement ? 1 : 0);
        result = 31 * result + (administration ? 1 : 0);
        result = 31 * result + (receivership ? 1 : 0);
        result = 31 * result + (incorporationDate != null ? incorporationDate.hashCode() : 0);
        result = 31 * result + (latestAnnualReturnDate != null ? latestAnnualReturnDate.hashCode() : 0);
        result = 31 * result + (nextAnnualReturnDate != null ? nextAnnualReturnDate.hashCode() : 0);
        result = 31 * result + (latestAccountsDate != null ? latestAccountsDate.hashCode() : 0);
        result = 31 * result + (charityNumber != null ? charityNumber.hashCode() : 0);
        result = 31 * result + (companyType != null ? companyType.hashCode() : 0);
        result = 31 * result + (accountsType != null ? accountsType.hashCode() : 0);
        result = 31 * result + (sicCode != null ? sicCode.hashCode() : 0);
        result = 31 * result + (sicDescription != null ? sicDescription.hashCode() : 0);
        result = 31 * result + sicCodesCount;
        result = 31 * result + (previousName != null ? previousName.hashCode() : 0);
        result = 31 * result + previousNameCount;
        result = 31 * result + (previousNameLastChanged != null ? previousNameLastChanged.hashCode() : 0);
        result = 31 * result + (regAddress1 != null ? regAddress1.hashCode() : 0);
        result = 31 * result + (regAddress2 != null ? regAddress2.hashCode() : 0);
        result = 31 * result + (regAddress3 != null ? regAddress3.hashCode() : 0);
        result = 31 * result + (regAddress4 != null ? regAddress4.hashCode() : 0);
        result = 31 * result + creditLimitLatest;
        result = 31 * result + (creditLimitLatestDate != null ? creditLimitLatestDate.hashCode() : 0);
        result = 31 * result + creditRatingLatest;
        result = 31 * result + (creditRatingLatestDate != null ? creditRatingLatestDate.hashCode() : 0);
        result = 31 * result + (creditRatingLatestDescription != null ? creditRatingLatestDescription.hashCode() : 0);
        result = 31 * result + bankAccountsCount;
        result = 31 * result + (ccjUpdateLatest != null ? ccjUpdateLatest.hashCode() : 0);
        result = 31 * result + shareholdingsCount;
        temp = sharesIssued != +0.0d ? Double.doubleToLongBits(sharesIssued) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + ordinaryShareholdingsCount;
        temp = ordinarySharesIssued != +0.0d ? Double.doubleToLongBits(ordinarySharesIssued) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + preferenceShareholdingsCount;
        temp = preferenceSharesIssued != +0.0d ? Double.doubleToLongBits(preferenceSharesIssued) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsAccountStatus != null ? accountsAccountStatus.hashCode() : 0);
        result = 31 * result + (accountsAccountants != null ? accountsAccountants.hashCode() : 0);
        result = 31 * result + (accountsAccountsFormat != null ? accountsAccountsFormat.hashCode() : 0);
        temp = accountsAssetsCurrent != +0.0d ? Double.doubleToLongBits(accountsAssetsCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsIntangible != +0.0d ? Double.doubleToLongBits(accountsAssetsIntangible) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsNet != +0.0d ? Double.doubleToLongBits(accountsAssetsNet) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsOtherCurrent != +0.0d ? Double.doubleToLongBits(accountsAssetsOtherCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsTangible != +0.0d ? Double.doubleToLongBits(accountsAssetsTangible) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsTotal != +0.0d ? Double.doubleToLongBits(accountsAssetsTotal) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsTotalCurrent != +0.0d ? Double.doubleToLongBits(accountsAssetsTotalCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAssetsTotalFix != +0.0d ? Double.doubleToLongBits(accountsAssetsTotalFix) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsAuditFees != +0.0d ? Double.doubleToLongBits(accountsAuditFees) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsAuditors != null ? accountsAuditors.hashCode() : 0);
        temp = accountsBankOverdraft != +0.0d ? Double.doubleToLongBits(accountsBankOverdraft) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsBankOverdraftLtLoans != +0.0d ? Double.doubleToLongBits(accountsBankOverdraftLtLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsCapitalEmployed != +0.0d ? Double.doubleToLongBits(accountsCapitalEmployed) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsCash != +0.0d ? Double.doubleToLongBits(accountsCash) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsConsolidated != null ? accountsConsolidated.hashCode() : 0);
        temp = accountsContingentLiability != +0.0d ? Double.doubleToLongBits(accountsContingentLiability) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsCostOfSales != +0.0d ? Double.doubleToLongBits(accountsCostOfSales) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsCurrency != null ? accountsCurrency.hashCode() : 0);
        result = 31 * result + (accountsDate != null ? accountsDate.hashCode() : 0);
        temp = accountsDepreciation != +0.0d ? Double.doubleToLongBits(accountsDepreciation) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsDirectorsEmoluments != +0.0d ? Double.doubleToLongBits(accountsDirectorsEmoluments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsDividendsPayable != +0.0d ? Double.doubleToLongBits(accountsDividendsPayable) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsExports != +0.0d ? Double.doubleToLongBits(accountsExports) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsGrossProfit != +0.0d ? Double.doubleToLongBits(accountsGrossProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsIncreaseInCash != +0.0d ? Double.doubleToLongBits(accountsIncreaseInCash) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsInterestPayments != +0.0d ? Double.doubleToLongBits(accountsInterestPayments) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsJointAuditors != null ? accountsJointAuditors.hashCode() : 0);
        temp = accountsLiabilitiesCurrent != +0.0d ? Double.doubleToLongBits(accountsLiabilitiesCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsLiabilitiesLt != +0.0d ? Double.doubleToLongBits(accountsLiabilitiesLt) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsLiabilitiesMiscCurrent != +0.0d ? Double.doubleToLongBits(accountsLiabilitiesMiscCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsLiabilitiesTotal != +0.0d ? Double.doubleToLongBits(accountsLiabilitiesTotal) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsLtLoans != +0.0d ? Double.doubleToLongBits(accountsLtLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + accountsMonths;
        temp = accountsNetCashflowBeforeFinancing != +0.0d ? Double.doubleToLongBits(accountsNetCashflowBeforeFinancing) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsNetCashflowFromFinancing != +0.0d ? Double.doubleToLongBits(accountsNetCashflowFromFinancing) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsNetWorth != +0.0d ? Double.doubleToLongBits(accountsNetWorth) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + accountsNoOfEmployees;
        temp = accountsOperatingProfits != +0.0d ? Double.doubleToLongBits(accountsOperatingProfits) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsOperationsNetCashflow != +0.0d ? Double.doubleToLongBits(accountsOperationsNetCashflow) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsPaidUpEquity != +0.0d ? Double.doubleToLongBits(accountsPaidUpEquity) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsPandlAccountReserve != +0.0d ? Double.doubleToLongBits(accountsPandlAccountReserve) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsPreTaxProfit != +0.0d ? Double.doubleToLongBits(accountsPreTaxProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsProfitAfterTax != +0.0d ? Double.doubleToLongBits(accountsProfitAfterTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsQualificationCode != null ? accountsQualificationCode.hashCode() : 0);
        temp = accountsRetainedProfit != +0.0d ? Double.doubleToLongBits(accountsRetainedProfit) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsRevaluationReserve != +0.0d ? Double.doubleToLongBits(accountsRevaluationReserve) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsShareholderFunds != +0.0d ? Double.doubleToLongBits(accountsShareholderFunds) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsShortTermLoans != +0.0d ? Double.doubleToLongBits(accountsShortTermLoans) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (accountsSolicitors != null ? accountsSolicitors.hashCode() : 0);
        temp = accountsStock != +0.0d ? Double.doubleToLongBits(accountsStock) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsSundryReserves != +0.0d ? Double.doubleToLongBits(accountsSundryReserves) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsTaxation != +0.0d ? Double.doubleToLongBits(accountsTaxation) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsTradeCreditors != +0.0d ? Double.doubleToLongBits(accountsTradeCreditors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsTradeDebtors != +0.0d ? Double.doubleToLongBits(accountsTradeDebtors) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsTurnover != +0.0d ? Double.doubleToLongBits(accountsTurnover) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsWages != +0.0d ? Double.doubleToLongBits(accountsWages) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = accountsWorkingCapital != +0.0d ? Double.doubleToLongBits(accountsWorkingCapital) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + directorsTotal;
        result = 31 * result + directorshipsTotal;
        result = 31 * result + directorshipsOpen;
        result = 31 * result + directorshipsOpenSecretary;
        result = 31 * result + directorshipsOpenDirector;
        result = 31 * result + directorshipsClosed;
        result = 31 * result + directorshipsClosedSecretary;
        result = 31 * result + directorshipsClosedDirector;
        result = 31 * result + directorshipsRetired;
        result = 31 * result + directorshipsRetiredSecretary;
        result = 31 * result + directorshipsRetiredDirector;
        result = 31 * result + documentsTotalCount;
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (accountsFilingDate != null ? accountsFilingDate.hashCode() : 0);
        result = 31 * result + (ftseA != null ? ftseA.hashCode() : 0);
        result = 31 * result + (ftseT != null ? ftseT.hashCode() : 0);
        result = 31 * result + mortgagePartialCount;
        result = 31 * result + mortgagePartialPropertyReleaseCount;
        result = 31 * result + mortgagePartialPropertyCeasingToBelongCount;
        result = 31 * result + mortgagePropertyCeasingToBelongCount;
        result = 31 * result + mortgagePartialOutstandingCount;
        result = 31 * result + mortgagePartialPropertySatisfiedCount;
        result = 31 * result + mortgagePartialPropertyCount;
        result = 31 * result + mortgagesCount;
        result = 31 * result + mortgagesOutstandingCount;
        result = 31 * result + mortgagesSatisfiedCount;
        result = 31 * result + (regAddressPostcode != null ? regAddressPostcode.hashCode() : 0);
        result = 31 * result + (regAreaCode != null ? regAreaCode.hashCode() : 0);
        result = 31 * result + (regCareOf != null ? regCareOf.hashCode() : 0);
        result = 31 * result + (regEmail != null ? regEmail.hashCode() : 0);
        result = 31 * result + (regPhone != null ? regPhone.hashCode() : 0);
        result = 31 * result + (regPobox != null ? regPobox.hashCode() : 0);
        result = 31 * result + (regTps != null ? regTps.hashCode() : 0);
        result = 31 * result + (regWeb != null ? regWeb.hashCode() : 0);
        result = 31 * result + (sic2007Code != null ? sic2007Code.hashCode() : 0);
        result = 31 * result + (tradingAddress1 != null ? tradingAddress1.hashCode() : 0);
        result = 31 * result + (tradingAddress2 != null ? tradingAddress2.hashCode() : 0);
        result = 31 * result + (tradingAddress3 != null ? tradingAddress3.hashCode() : 0);
        result = 31 * result + (tradingAddress4 != null ? tradingAddress4.hashCode() : 0);
        result = 31 * result + (tradingAddressPostcode != null ? tradingAddressPostcode.hashCode() : 0);
        result = 31 * result + (tradingPhone != null ? tradingPhone.hashCode() : 0);
        result = 31 * result + (tradingPhoneStd != null ? tradingPhoneStd.hashCode() : 0);
        result = 31 * result + (regAddressTown != null ? regAddressTown.hashCode() : 0);
        result = 31 * result + (regAddressTowncode != null ? regAddressTowncode.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayCompanies{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", liquidationStatus='" + liquidationStatus + '\'' +
                ", administrationOrder=" + administrationOrder +
                ", voluntaryAgreement=" + voluntaryAgreement +
                ", administration=" + administration +
                ", receivership=" + receivership +
                ", incorporationDate=" + incorporationDate +
                ", latestAnnualReturnDate=" + latestAnnualReturnDate +
                ", nextAnnualReturnDate=" + nextAnnualReturnDate +
                ", latestAccountsDate=" + latestAccountsDate +
                ", charityNumber='" + charityNumber + '\'' +
                ", companyType='" + companyType + '\'' +
                ", accountsType='" + accountsType + '\'' +
                ", sicCode='" + sicCode + '\'' +
                ", sicDescription='" + sicDescription + '\'' +
                ", sicCodesCount=" + sicCodesCount +
                ", previousName='" + previousName + '\'' +
                ", previousNameCount=" + previousNameCount +
                ", previousNameLastChanged=" + previousNameLastChanged +
                ", regAddress1='" + regAddress1 + '\'' +
                ", regAddress2='" + regAddress2 + '\'' +
                ", regAddress3='" + regAddress3 + '\'' +
                ", regAddress4='" + regAddress4 + '\'' +
                ", creditLimitLatest=" + creditLimitLatest +
                ", creditLimitLatestDate=" + creditLimitLatestDate +
                ", creditRatingLatest=" + creditRatingLatest +
                ", creditRatingLatestDate=" + creditRatingLatestDate +
                ", creditRatingLatestDescription='" + creditRatingLatestDescription + '\'' +
                ", bankAccountsCount=" + bankAccountsCount +
                ", ccjUpdateLatest=" + ccjUpdateLatest +
                ", shareholdingsCount=" + shareholdingsCount +
                ", sharesIssued=" + sharesIssued +
                ", ordinaryShareholdingsCount=" + ordinaryShareholdingsCount +
                ", ordinarySharesIssued=" + ordinarySharesIssued +
                ", preferenceShareholdingsCount=" + preferenceShareholdingsCount +
                ", preferenceSharesIssued=" + preferenceSharesIssued +
                ", accountsAccountStatus='" + accountsAccountStatus + '\'' +
                ", accountsAccountants='" + accountsAccountants + '\'' +
                ", accountsAccountsFormat='" + accountsAccountsFormat + '\'' +
                ", accountsAssetsCurrent=" + accountsAssetsCurrent +
                ", accountsAssetsIntangible=" + accountsAssetsIntangible +
                ", accountsAssetsNet=" + accountsAssetsNet +
                ", accountsAssetsOtherCurrent=" + accountsAssetsOtherCurrent +
                ", accountsAssetsTangible=" + accountsAssetsTangible +
                ", accountsAssetsTotal=" + accountsAssetsTotal +
                ", accountsAssetsTotalCurrent=" + accountsAssetsTotalCurrent +
                ", accountsAssetsTotalFix=" + accountsAssetsTotalFix +
                ", accountsAuditFees=" + accountsAuditFees +
                ", accountsAuditors='" + accountsAuditors + '\'' +
                ", accountsBankOverdraft=" + accountsBankOverdraft +
                ", accountsBankOverdraftLtLoans=" + accountsBankOverdraftLtLoans +
                ", accountsCapitalEmployed=" + accountsCapitalEmployed +
                ", accountsCash=" + accountsCash +
                ", accountsConsolidated='" + accountsConsolidated + '\'' +
                ", accountsContingentLiability=" + accountsContingentLiability +
                ", accountsCostOfSales=" + accountsCostOfSales +
                ", accountsCurrency='" + accountsCurrency + '\'' +
                ", accountsDate=" + accountsDate +
                ", accountsDepreciation=" + accountsDepreciation +
                ", accountsDirectorsEmoluments=" + accountsDirectorsEmoluments +
                ", accountsDividendsPayable=" + accountsDividendsPayable +
                ", accountsExports=" + accountsExports +
                ", accountsGrossProfit=" + accountsGrossProfit +
                ", accountsIncreaseInCash=" + accountsIncreaseInCash +
                ", accountsInterestPayments=" + accountsInterestPayments +
                ", accountsJointAuditors='" + accountsJointAuditors + '\'' +
                ", accountsLiabilitiesCurrent=" + accountsLiabilitiesCurrent +
                ", accountsLiabilitiesLt=" + accountsLiabilitiesLt +
                ", accountsLiabilitiesMiscCurrent=" + accountsLiabilitiesMiscCurrent +
                ", accountsLiabilitiesTotal=" + accountsLiabilitiesTotal +
                ", accountsLtLoans=" + accountsLtLoans +
                ", accountsMonths=" + accountsMonths +
                ", accountsNetCashflowBeforeFinancing=" + accountsNetCashflowBeforeFinancing +
                ", accountsNetCashflowFromFinancing=" + accountsNetCashflowFromFinancing +
                ", accountsNetWorth=" + accountsNetWorth +
                ", accountsNoOfEmployees=" + accountsNoOfEmployees +
                ", accountsOperatingProfits=" + accountsOperatingProfits +
                ", accountsOperationsNetCashflow=" + accountsOperationsNetCashflow +
                ", accountsPaidUpEquity=" + accountsPaidUpEquity +
                ", accountsPandlAccountReserve=" + accountsPandlAccountReserve +
                ", accountsPreTaxProfit=" + accountsPreTaxProfit +
                ", accountsProfitAfterTax=" + accountsProfitAfterTax +
                ", accountsQualificationCode='" + accountsQualificationCode + '\'' +
                ", accountsRetainedProfit=" + accountsRetainedProfit +
                ", accountsRevaluationReserve=" + accountsRevaluationReserve +
                ", accountsShareholderFunds=" + accountsShareholderFunds +
                ", accountsShortTermLoans=" + accountsShortTermLoans +
                ", accountsSolicitors='" + accountsSolicitors + '\'' +
                ", accountsStock=" + accountsStock +
                ", accountsSundryReserves=" + accountsSundryReserves +
                ", accountsTaxation=" + accountsTaxation +
                ", accountsTradeCreditors=" + accountsTradeCreditors +
                ", accountsTradeDebtors=" + accountsTradeDebtors +
                ", accountsTurnover=" + accountsTurnover +
                ", accountsWages=" + accountsWages +
                ", accountsWorkingCapital=" + accountsWorkingCapital +
                ", directorsTotal=" + directorsTotal +
                ", directorshipsTotal=" + directorshipsTotal +
                ", directorshipsOpen=" + directorshipsOpen +
                ", directorshipsOpenSecretary=" + directorshipsOpenSecretary +
                ", directorshipsOpenDirector=" + directorshipsOpenDirector +
                ", directorshipsClosed=" + directorshipsClosed +
                ", directorshipsClosedSecretary=" + directorshipsClosedSecretary +
                ", directorshipsClosedDirector=" + directorshipsClosedDirector +
                ", directorshipsRetired=" + directorshipsRetired +
                ", directorshipsRetiredSecretary=" + directorshipsRetiredSecretary +
                ", directorshipsRetiredDirector=" + directorshipsRetiredDirector +
                ", documentsTotalCount=" + documentsTotalCount +
                ", dataset=" + dataset +
                ", locale='" + locale + '\'' +
                ", accountsFilingDate=" + accountsFilingDate +
                ", ftseA='" + ftseA + '\'' +
                ", ftseT='" + ftseT + '\'' +
                ", mortgagePartialCount=" + mortgagePartialCount +
                ", mortgagePartialPropertyReleaseCount=" + mortgagePartialPropertyReleaseCount +
                ", mortgagePartialPropertyCeasingToBelongCount=" + mortgagePartialPropertyCeasingToBelongCount +
                ", mortgagePropertyCeasingToBelongCount=" + mortgagePropertyCeasingToBelongCount +
                ", mortgagePartialOutstandingCount=" + mortgagePartialOutstandingCount +
                ", mortgagePartialPropertySatisfiedCount=" + mortgagePartialPropertySatisfiedCount +
                ", mortgagePartialPropertyCount=" + mortgagePartialPropertyCount +
                ", mortgagesCount=" + mortgagesCount +
                ", mortgagesOutstandingCount=" + mortgagesOutstandingCount +
                ", mortgagesSatisfiedCount=" + mortgagesSatisfiedCount +
                ", regAddressPostcode='" + regAddressPostcode + '\'' +
                ", regAreaCode='" + regAreaCode + '\'' +
                ", regCareOf='" + regCareOf + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", regPhone='" + regPhone + '\'' +
                ", regPobox='" + regPobox + '\'' +
                ", regTps='" + regTps + '\'' +
                ", regWeb='" + regWeb + '\'' +
                ", sic2007Code='" + sic2007Code + '\'' +
                ", tradingAddress1='" + tradingAddress1 + '\'' +
                ", tradingAddress2='" + tradingAddress2 + '\'' +
                ", tradingAddress3='" + tradingAddress3 + '\'' +
                ", tradingAddress4='" + tradingAddress4 + '\'' +
                ", tradingAddressPostcode='" + tradingAddressPostcode + '\'' +
                ", tradingPhone='" + tradingPhone + '\'' +
                ", tradingPhoneStd='" + tradingPhoneStd + '\'' +
                ", regAddressTown='" + regAddressTown + '\'' +
                ", regAddressTowncode='" + regAddressTowncode + '\'' +
                '}';
    }
}

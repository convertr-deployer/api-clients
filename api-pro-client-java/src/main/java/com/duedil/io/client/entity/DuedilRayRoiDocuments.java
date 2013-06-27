package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayRoiDocuments {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Timestamp submissionDate;

    public Timestamp getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Timestamp submissionDate) {
        this.submissionDate = submissionDate;
    }

    private Timestamp effectiveDate;

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    private Timestamp accountsDate;

    public Timestamp getAccountsDate() {
        return accountsDate;
    }

    public void setAccountsDate(Timestamp accountsDate) {
        this.accountsDate = accountsDate;
    }

    private String filenetDocId;

    public String getFilenetDocId() {
        return filenetDocId;
    }

    public void setFilenetDocId(String filenetDocId) {
        this.filenetDocId = filenetDocId;
    }

    private String submissionNumber;

    public String getSubmissionNumber() {
        return submissionNumber;
    }

    public void setSubmissionNumber(String submissionNumber) {
        this.submissionNumber = submissionNumber;
    }

    private String submissionDocumentNumber;

    public String getSubmissionDocumentNumber() {
        return submissionDocumentNumber;
    }

    public void setSubmissionDocumentNumber(String submissionDocumentNumber) {
        this.submissionDocumentNumber = submissionDocumentNumber;
    }

    private String submissionTypeCode;

    public String getSubmissionTypeCode() {
        return submissionTypeCode;
    }

    public void setSubmissionTypeCode(String submissionTypeCode) {
        this.submissionTypeCode = submissionTypeCode;
    }

    private String submissionTypeDescription;

    public String getSubmissionTypeDescription() {
        return submissionTypeDescription;
    }

    public void setSubmissionTypeDescription(String submissionTypeDescription) {
        this.submissionTypeDescription = submissionTypeDescription;
    }

    private String documentTypeCode;

    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    public void setDocumentTypeCode(String documentTypeCode) {
        this.documentTypeCode = documentTypeCode;
    }

    private String documentTypeDescription;

    public String getDocumentTypeDescription() {
        return documentTypeDescription;
    }

    public void setDocumentTypeDescription(String documentTypeDescription) {
        this.documentTypeDescription = documentTypeDescription;
    }

    private String submissionStatus;

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    private String submissionStatusDescription;

    public String getSubmissionStatusDescription() {
        return submissionStatusDescription;
    }

    public void setSubmissionStatusDescription(String submissionStatusDescription) {
        this.submissionStatusDescription = submissionStatusDescription;
    }

    private Timestamp dataset;

    public Timestamp getDataset() {
        return dataset;
    }

    public void setDataset(Timestamp dataset) {
        this.dataset = dataset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayRoiDocuments that = (DuedilRayRoiDocuments) o;

        if (accountsDate != null ? !accountsDate.equals(that.accountsDate) : that.accountsDate != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (documentTypeCode != null ? !documentTypeCode.equals(that.documentTypeCode) : that.documentTypeCode != null)
            return false;
        if (documentTypeDescription != null ? !documentTypeDescription.equals(that.documentTypeDescription) : that.documentTypeDescription != null)
            return false;
        if (effectiveDate != null ? !effectiveDate.equals(that.effectiveDate) : that.effectiveDate != null)
            return false;
        if (filenetDocId != null ? !filenetDocId.equals(that.filenetDocId) : that.filenetDocId != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (submissionDate != null ? !submissionDate.equals(that.submissionDate) : that.submissionDate != null)
            return false;
        if (submissionDocumentNumber != null ? !submissionDocumentNumber.equals(that.submissionDocumentNumber) : that.submissionDocumentNumber != null)
            return false;
        if (submissionNumber != null ? !submissionNumber.equals(that.submissionNumber) : that.submissionNumber != null)
            return false;
        if (submissionStatus != null ? !submissionStatus.equals(that.submissionStatus) : that.submissionStatus != null)
            return false;
        if (submissionStatusDescription != null ? !submissionStatusDescription.equals(that.submissionStatusDescription) : that.submissionStatusDescription != null)
            return false;
        if (submissionTypeCode != null ? !submissionTypeCode.equals(that.submissionTypeCode) : that.submissionTypeCode != null)
            return false;
        if (submissionTypeDescription != null ? !submissionTypeDescription.equals(that.submissionTypeDescription) : that.submissionTypeDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (submissionDate != null ? submissionDate.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (accountsDate != null ? accountsDate.hashCode() : 0);
        result = 31 * result + (filenetDocId != null ? filenetDocId.hashCode() : 0);
        result = 31 * result + (submissionNumber != null ? submissionNumber.hashCode() : 0);
        result = 31 * result + (submissionDocumentNumber != null ? submissionDocumentNumber.hashCode() : 0);
        result = 31 * result + (submissionTypeCode != null ? submissionTypeCode.hashCode() : 0);
        result = 31 * result + (submissionTypeDescription != null ? submissionTypeDescription.hashCode() : 0);
        result = 31 * result + (documentTypeCode != null ? documentTypeCode.hashCode() : 0);
        result = 31 * result + (documentTypeDescription != null ? documentTypeDescription.hashCode() : 0);
        result = 31 * result + (submissionStatus != null ? submissionStatus.hashCode() : 0);
        result = 31 * result + (submissionStatusDescription != null ? submissionStatusDescription.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

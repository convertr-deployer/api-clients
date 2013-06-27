package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayDocumentCounts {
    private String companyId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    private String documentType;

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String documentDescription;

    public String getDocumentDescription() {
        return documentDescription;
    }

    public void setDocumentDescription(String documentDescription) {
        this.documentDescription = documentDescription;
    }

    private Timestamp latestDocument;

    public Timestamp getLatestDocument() {
        return latestDocument;
    }

    public void setLatestDocument(Timestamp latestDocument) {
        this.latestDocument = latestDocument;
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

        DuedilRayDocumentCounts that = (DuedilRayDocumentCounts) o;

        if (count != that.count) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (documentDescription != null ? !documentDescription.equals(that.documentDescription) : that.documentDescription != null)
            return false;
        if (documentType != null ? !documentType.equals(that.documentType) : that.documentType != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (latestDocument != null ? !latestDocument.equals(that.latestDocument) : that.latestDocument != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = companyId != null ? companyId.hashCode() : 0;
        result = 31 * result + (documentType != null ? documentType.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        result = 31 * result + (documentDescription != null ? documentDescription.hashCode() : 0);
        result = 31 * result + (latestDocument != null ? latestDocument.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

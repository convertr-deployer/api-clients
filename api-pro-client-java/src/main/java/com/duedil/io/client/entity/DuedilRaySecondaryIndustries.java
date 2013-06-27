package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRaySecondaryIndustries {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String sicCode;

    public String getSicCode() {
        return sicCode;
    }

    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    private String sicCodeDescription;

    public String getSicCodeDescription() {
        return sicCodeDescription;
    }

    public void setSicCodeDescription(String sicCodeDescription) {
        this.sicCodeDescription = sicCodeDescription;
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

        DuedilRaySecondaryIndustries that = (DuedilRaySecondaryIndustries) o;

        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sicCode != null ? !sicCode.equals(that.sicCode) : that.sicCode != null) return false;
        if (sicCodeDescription != null ? !sicCodeDescription.equals(that.sicCodeDescription) : that.sicCodeDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (sicCode != null ? sicCode.hashCode() : 0);
        result = 31 * result + (sicCodeDescription != null ? sicCodeDescription.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayCreditRatings {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private Timestamp date;

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    private int creditRating;

    public int getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(int creditRating) {
        this.creditRating = creditRating;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

        DuedilRayCreditRatings that = (DuedilRayCreditRatings) o;

        if (creditRating != that.creditRating) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + creditRating;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayDirectorFinancials {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private double totalCash;

    public double getTotalCash() {
        return totalCash;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    private double totalNetWorth;

    public double getTotalNetWorth() {
        return totalNetWorth;
    }

    public void setTotalNetWorth(double totalNetWorth) {
        this.totalNetWorth = totalNetWorth;
    }

    private double totalAssetsTotalCurrent;

    public double getTotalAssetsTotalCurrent() {
        return totalAssetsTotalCurrent;
    }

    public void setTotalAssetsTotalCurrent(double totalAssetsTotalCurrent) {
        this.totalAssetsTotalCurrent = totalAssetsTotalCurrent;
    }

    private double totalLiabilitiesCurrent;

    public double getTotalLiabilitiesCurrent() {
        return totalLiabilitiesCurrent;
    }

    public void setTotalLiabilitiesCurrent(double totalLiabilitiesCurrent) {
        this.totalLiabilitiesCurrent = totalLiabilitiesCurrent;
    }

    private double totalTurnover;

    public double getTotalTurnover() {
        return totalTurnover;
    }

    public void setTotalTurnover(double totalTurnover) {
        this.totalTurnover = totalTurnover;
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

        DuedilRayDirectorFinancials that = (DuedilRayDirectorFinancials) o;

        if (Double.compare(that.totalAssetsTotalCurrent, totalAssetsTotalCurrent) != 0) return false;
        if (Double.compare(that.totalCash, totalCash) != 0) return false;
        if (Double.compare(that.totalLiabilitiesCurrent, totalLiabilitiesCurrent) != 0) return false;
        if (Double.compare(that.totalNetWorth, totalNetWorth) != 0) return false;
        if (Double.compare(that.totalTurnover, totalTurnover) != 0) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id != null ? id.hashCode() : 0;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        temp = totalCash != +0.0d ? Double.doubleToLongBits(totalCash) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalNetWorth != +0.0d ? Double.doubleToLongBits(totalNetWorth) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalAssetsTotalCurrent != +0.0d ? Double.doubleToLongBits(totalAssetsTotalCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalLiabilitiesCurrent != +0.0d ? Double.doubleToLongBits(totalLiabilitiesCurrent) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = totalTurnover != +0.0d ? Double.doubleToLongBits(totalTurnover) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

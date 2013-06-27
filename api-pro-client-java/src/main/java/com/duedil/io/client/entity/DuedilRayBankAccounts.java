package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayBankAccounts {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String bank;

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    private String sortCode;

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
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

        DuedilRayBankAccounts that = (DuedilRayBankAccounts) o;

        if (count != that.count) return false;
        if (bank != null ? !bank.equals(that.bank) : that.bank != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (sortCode != null ? !sortCode.equals(that.sortCode) : that.sortCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bank != null ? bank.hashCode() : 0);
        result = 31 * result + (sortCode != null ? sortCode.hashCode() : 0);
        result = 31 * result + count;
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayUkTradingAddresses {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    private String tradingPhoneStd;

    public String getTradingPhoneStd() {
        return tradingPhoneStd;
    }

    public void setTradingPhoneStd(String tradingPhoneStd) {
        this.tradingPhoneStd = tradingPhoneStd;
    }

    private String tradingPhone;

    public String getTradingPhone() {
        return tradingPhone;
    }

    public void setTradingPhone(String tradingPhone) {
        this.tradingPhone = tradingPhone;
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

        DuedilRayUkTradingAddresses that = (DuedilRayUkTradingAddresses) o;

        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
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
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tradingAddress1 != null ? tradingAddress1.hashCode() : 0);
        result = 31 * result + (tradingAddress2 != null ? tradingAddress2.hashCode() : 0);
        result = 31 * result + (tradingAddress3 != null ? tradingAddress3.hashCode() : 0);
        result = 31 * result + (tradingAddress4 != null ? tradingAddress4.hashCode() : 0);
        result = 31 * result + (tradingAddressPostcode != null ? tradingAddressPostcode.hashCode() : 0);
        result = 31 * result + (tradingPhoneStd != null ? tradingPhoneStd.hashCode() : 0);
        result = 31 * result + (tradingPhone != null ? tradingPhone.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }
}

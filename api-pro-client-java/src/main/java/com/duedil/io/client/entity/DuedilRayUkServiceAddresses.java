package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayUkServiceAddresses {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String address1;

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    private String address2;

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    private String address3;

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    private String address4;

    public String getAddress4() {
        return address4;
    }

    public void setAddress4(String address4) {
        this.address4 = address4;
    }

    private String address5;

    public String getAddress5() {
        return address5;
    }

    public void setAddress5(String address5) {
        this.address5 = address5;
    }

    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private String postalArea;

    public String getPostalArea() {
        return postalArea;
    }

    public void setPostalArea(String postalArea) {
        this.postalArea = postalArea;
    }

    private String careOf;

    public String getCareOf() {
        return careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    private String poBox;

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
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

        DuedilRayUkServiceAddresses that = (DuedilRayUkServiceAddresses) o;

        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (address4 != null ? !address4.equals(that.address4) : that.address4 != null) return false;
        if (address5 != null ? !address5.equals(that.address5) : that.address5 != null) return false;
        if (careOf != null ? !careOf.equals(that.careOf) : that.careOf != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (poBox != null ? !poBox.equals(that.poBox) : that.poBox != null) return false;
        if (postalArea != null ? !postalArea.equals(that.postalArea) : that.postalArea != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (address4 != null ? address4.hashCode() : 0);
        result = 31 * result + (address5 != null ? address5.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (postalArea != null ? postalArea.hashCode() : 0);
        result = 31 * result + (careOf != null ? careOf.hashCode() : 0);
        result = 31 * result + (poBox != null ? poBox.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayUkServiceAddresses{" +
                "id='" + id + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address4='" + address4 + '\'' +
                ", address5='" + address5 + '\'' +
                ", postcode='" + postcode + '\'' +
                ", postalArea='" + postalArea + '\'' +
                ", careOf='" + careOf + '\'' +
                ", poBox='" + poBox + '\'' +
                ", dataset=" + dataset +
                '}';
    }
}

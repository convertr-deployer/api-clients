package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRayDirectors {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String forename;

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private Timestamp dateOfBirth;

    public Timestamp getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Timestamp dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String middleName;

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    private String postalTitle;

    public String getPostalTitle() {
        return postalTitle;
    }

    public void setPostalTitle(String postalTitle) {
        this.postalTitle = postalTitle;
    }

    private String suffix;

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    private String honours;

    public String getHonours() {
        return honours;
    }

    public void setHonours(String honours) {
        this.honours = honours;
    }

    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private String nationCode;

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
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

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayDirectors that = (DuedilRayDirectors) o;

        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (address4 != null ? !address4.equals(that.address4) : that.address4 != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (forename != null ? !forename.equals(that.forename) : that.forename != null) return false;
        if (honours != null ? !honours.equals(that.honours) : that.honours != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (nationCode != null ? !nationCode.equals(that.nationCode) : that.nationCode != null) return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (postalTitle != null ? !postalTitle.equals(that.postalTitle) : that.postalTitle != null) return false;
        if (suffix != null ? !suffix.equals(that.suffix) : that.suffix != null) return false;
        if (surname != null ? !surname.equals(that.surname) : that.surname != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (forename != null ? forename.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (postalTitle != null ? postalTitle.hashCode() : 0);
        result = 31 * result + (suffix != null ? suffix.hashCode() : 0);
        result = 31 * result + (honours != null ? honours.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (nationCode != null ? nationCode.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (address4 != null ? address4.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}

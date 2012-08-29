/**
 * DuedilApiClient
 * @copyright 2012 Duedil Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.entity
 */
public class DuedilRayForeignCompanies extends Entity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String org;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    private String foreignCompanyName;

    public String getForeignCompanyName() {
        return foreignCompanyName;
    }

    public void setForeignCompanyName(String foreignCompanyName) {
        this.foreignCompanyName = foreignCompanyName;
    }

    private String foreignCountryCode;

    public String getForeignCountryCode() {
        return foreignCountryCode;
    }

    public void setForeignCountryCode(String foreignCountryCode) {
        this.foreignCountryCode = foreignCountryCode;
    }

    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    private String nationDirector;

    public String getNationDirector() {
        return nationDirector;
    }

    public void setNationDirector(String nationDirector) {
        this.nationDirector = nationDirector;
    }

    private String locale;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
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

        DuedilRayForeignCompanies that = (DuedilRayForeignCompanies) o;

        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (foreignCompanyName != null ? !foreignCompanyName.equals(that.foreignCompanyName) : that.foreignCompanyName != null)
            return false;
        if (foreignCountryCode != null ? !foreignCountryCode.equals(that.foreignCountryCode) : that.foreignCountryCode != null)
            return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (nationDirector != null ? !nationDirector.equals(that.nationDirector) : that.nationDirector != null)
            return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (org != null ? !org.equals(that.org) : that.org != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (org != null ? org.hashCode() : 0);
        result = 31 * result + (foreignCompanyName != null ? foreignCompanyName.hashCode() : 0);
        result = 31 * result + (foreignCountryCode != null ? foreignCountryCode.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (nationDirector != null ? nationDirector.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayForeignCompanies{" +
                "id='" + id + '\'' +
                ", org='" + org + '\'' +
                ", foreignCompanyName='" + foreignCompanyName + '\'' +
                ", foreignCountryCode='" + foreignCountryCode + '\'' +
                ", nationality='" + nationality + '\'' +
                ", nationDirector='" + nationDirector + '\'' +
                ", locale='" + locale + '\'' +
                ", dataset=" + dataset +
                '}';
    }
}

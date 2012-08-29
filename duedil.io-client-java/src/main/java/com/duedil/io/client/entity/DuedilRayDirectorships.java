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
public class DuedilRayDirectorships extends Entity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private boolean secretary;

    public boolean isSecretary() {
        return secretary;
    }

    public void setSecretary(boolean secretary) {
        this.secretary = secretary;
    }

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private Timestamp appointmentDate;

    public Timestamp getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Timestamp appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    private Timestamp resignationDate;

    public Timestamp getResignationDate() {
        return resignationDate;
    }

    public void setResignationDate(Timestamp resignationDate) {
        this.resignationDate = resignationDate;
    }

    private String function;

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    private String functionCode;

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String positionCode;

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
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

    private String postalArea;

    public String getPostalArea() {
        return postalArea;
    }

    public void setPostalArea(String postalArea) {
        this.postalArea = postalArea;
    }

    private String postcode;

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private String poBox;

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    private String careOf;

    public String getCareOf() {
        return careOf;
    }

    public void setCareOf(String careOf) {
        this.careOf = careOf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRayDirectorships that = (DuedilRayDirectorships) o;

        if (active != that.active) return false;
        if (secretary != that.secretary) return false;
        if (address1 != null ? !address1.equals(that.address1) : that.address1 != null) return false;
        if (address2 != null ? !address2.equals(that.address2) : that.address2 != null) return false;
        if (address3 != null ? !address3.equals(that.address3) : that.address3 != null) return false;
        if (address4 != null ? !address4.equals(that.address4) : that.address4 != null) return false;
        if (address5 != null ? !address5.equals(that.address5) : that.address5 != null) return false;
        if (appointmentDate != null ? !appointmentDate.equals(that.appointmentDate) : that.appointmentDate != null)
            return false;
        if (careOf != null ? !careOf.equals(that.careOf) : that.careOf != null) return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (function != null ? !function.equals(that.function) : that.function != null) return false;
        if (functionCode != null ? !functionCode.equals(that.functionCode) : that.functionCode != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (locale != null ? !locale.equals(that.locale) : that.locale != null) return false;
        if (poBox != null ? !poBox.equals(that.poBox) : that.poBox != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (positionCode != null ? !positionCode.equals(that.positionCode) : that.positionCode != null) return false;
        if (postalArea != null ? !postalArea.equals(that.postalArea) : that.postalArea != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;
        if (resignationDate != null ? !resignationDate.equals(that.resignationDate) : that.resignationDate != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (secretary ? 1 : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (appointmentDate != null ? appointmentDate.hashCode() : 0);
        result = 31 * result + (resignationDate != null ? resignationDate.hashCode() : 0);
        result = 31 * result + (function != null ? function.hashCode() : 0);
        result = 31 * result + (functionCode != null ? functionCode.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (positionCode != null ? positionCode.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        result = 31 * result + (locale != null ? locale.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (address3 != null ? address3.hashCode() : 0);
        result = 31 * result + (address4 != null ? address4.hashCode() : 0);
        result = 31 * result + (address5 != null ? address5.hashCode() : 0);
        result = 31 * result + (postalArea != null ? postalArea.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (poBox != null ? poBox.hashCode() : 0);
        result = 31 * result + (careOf != null ? careOf.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayDirectorships{" +
                "id='" + id + '\'' +
                ", secretary=" + secretary +
                ", active=" + active +
                ", status='" + status + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", resignationDate=" + resignationDate +
                ", function='" + function + '\'' +
                ", functionCode='" + functionCode + '\'' +
                ", position='" + position + '\'' +
                ", positionCode='" + positionCode + '\'' +
                ", dataset=" + dataset +
                ", locale='" + locale + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", address3='" + address3 + '\'' +
                ", address4='" + address4 + '\'' +
                ", address5='" + address5 + '\'' +
                ", postalArea='" + postalArea + '\'' +
                ", postcode='" + postcode + '\'' +
                ", poBox='" + poBox + '\'' +
                ", careOf='" + careOf + '\'' +
                '}';
    }
}

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
public class DuedilRayUkMortgages extends Entity {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private Timestamp dateCreated;

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Timestamp dateRegistered;

    public Timestamp getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Timestamp dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    private String personsEntitled;

    public String getPersonsEntitled() {
        return personsEntitled;
    }

    public void setPersonsEntitled(String personsEntitled) {
        this.personsEntitled = personsEntitled;
    }

    private Timestamp dateSatisfied;

    public Timestamp getDateSatisfied() {
        return dateSatisfied;
    }

    public void setDateSatisfied(Timestamp dateSatisfied) {
        this.dateSatisfied = dateSatisfied;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String amountSecured;

    public String getAmountSecured() {
        return amountSecured;
    }

    public void setAmountSecured(String amountSecured) {
        this.amountSecured = amountSecured;
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

        DuedilRayUkMortgages that = (DuedilRayUkMortgages) o;

        if (number != that.number) return false;
        if (amountSecured != null ? !amountSecured.equals(that.amountSecured) : that.amountSecured != null)
            return false;
        if (dataset != null ? !dataset.equals(that.dataset) : that.dataset != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (dateRegistered != null ? !dateRegistered.equals(that.dateRegistered) : that.dateRegistered != null)
            return false;
        if (dateSatisfied != null ? !dateSatisfied.equals(that.dateSatisfied) : that.dateSatisfied != null)
            return false;
        if (details != null ? !details.equals(that.details) : that.details != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (personsEntitled != null ? !personsEntitled.equals(that.personsEntitled) : that.personsEntitled != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + number;
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (dateRegistered != null ? dateRegistered.hashCode() : 0);
        result = 31 * result + (personsEntitled != null ? personsEntitled.hashCode() : 0);
        result = 31 * result + (dateSatisfied != null ? dateSatisfied.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (details != null ? details.hashCode() : 0);
        result = 31 * result + (amountSecured != null ? amountSecured.hashCode() : 0);
        result = 31 * result + (dataset != null ? dataset.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRayUkMortgages{" +
                "id='" + id + '\'' +
                ", number=" + number +
                ", dateCreated=" + dateCreated +
                ", type='" + type + '\'' +
                ", dateRegistered=" + dateRegistered +
                ", personsEntitled='" + personsEntitled + '\'' +
                ", dateSatisfied=" + dateSatisfied +
                ", status='" + status + '\'' +
                ", details='" + details + '\'' +
                ", amountSecured='" + amountSecured + '\'' +
                ", dataset=" + dataset +
                '}';
    }
}

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
public class DuedilCompaniesSearch extends Entity {

    private String id;
    private String name;
    private Timestamp incorporationDate;
    private Timestamp latestAccountsDate;
    private Timestamp latestAnnualReturnDate;
    private Timestamp nextAnnualReturnDate;
    private double accountsTurnover;
    private String previousName;
    private String previousNameCount;


    public Timestamp getIncorporationDate() {
        return incorporationDate;
    }

    public void setIncorporationDate(Timestamp incorporationDate) {
        this.incorporationDate = incorporationDate;
    }

    public Timestamp getLatestAccountsDate() {
        return latestAccountsDate;
    }

    public void setLatestAccountsDate(Timestamp latestAccountsDate) {
        this.latestAccountsDate = latestAccountsDate;
    }

    public Timestamp getLatestAnnualReturnDate() {
        return latestAnnualReturnDate;
    }

    public void setLatestAnnualReturnDate(Timestamp latestAnnualReturnDate) {
        this.latestAnnualReturnDate = latestAnnualReturnDate;
    }

    public Timestamp getNextAnnualReturnDate() {
        return nextAnnualReturnDate;
    }

    public void setNextAnnualReturnDate(Timestamp nextAnnualReturnDate) {
        this.nextAnnualReturnDate = nextAnnualReturnDate;
    }

    public double getAccountsTurnover() {
        return accountsTurnover;
    }

    public void setAccountsTurnover(double accountsTurnover) {
        this.accountsTurnover = accountsTurnover;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public String getPreviousNameCount() {
        return previousNameCount;
    }

    public void setPreviousNameCount(String previousNameCount) {
        this.previousNameCount = previousNameCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DuedilCompaniesSearch{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", incorporationDate=" + incorporationDate +
                ", latestAccountsDate=" + latestAccountsDate +
                ", latestAnnualReturnDate=" + latestAnnualReturnDate +
                ", nextAnnualReturnDate=" + nextAnnualReturnDate +
                ", accountsTurnover=" + accountsTurnover +
                ", previousName='" + previousName + '\'' +
                ", previousNameCount='" + previousNameCount + '\'' +
                '}';
    }
}
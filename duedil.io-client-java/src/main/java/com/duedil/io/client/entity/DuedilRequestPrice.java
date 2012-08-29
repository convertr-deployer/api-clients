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
public class DuedilRequestPrice extends Entity {

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    private String agent;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    private Timestamp startTime;

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    private Timestamp endTime;

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private String entitiy;

    public String getEntitiy() {
        return entitiy;
    }

    public void setEntitiy(String entitiy) {
        this.entitiy = entitiy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRequestPrice price1 = (DuedilRequestPrice) o;

        if (price != price1.price) return false;
        if (agent != null ? !agent.equals(price1.agent) : price1.agent != null) return false;
        if (endTime != null ? !endTime.equals(price1.endTime) : price1.endTime != null) return false;
        if (entitiy != null ? !entitiy.equals(price1.entitiy) : price1.entitiy != null) return false;
        if (ip != null ? !ip.equals(price1.ip) : price1.ip != null) return false;
        if (requestId != null ? !requestId.equals(price1.requestId) : price1.requestId != null) return false;
        if (startTime != null ? !startTime.equals(price1.startTime) : price1.startTime != null) return false;
        if (url != null ? !url.equals(price1.url) : price1.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requestId != null ? requestId.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (entitiy != null ? entitiy.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DuedilRequestPrice{" +
                "requestId='" + requestId + '\'' +
                ", ip='" + ip + '\'' +
                ", agent='" + agent + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", url='" + url + '\'' +
                ", price=" + price +
                ", entitiy='" + entitiy + '\'' +
                '}';
    }
}

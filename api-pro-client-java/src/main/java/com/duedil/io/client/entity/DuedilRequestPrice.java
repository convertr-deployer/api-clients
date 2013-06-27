package com.duedil.io.client.entity;

import java.sql.Timestamp;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class DuedilRequestPrice {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
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

    private String entities;

    public String getEntities() {
        return entities;
    }

    public void setEntities(String entities) {
        this.entities = entities;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DuedilRequestPrice that = (DuedilRequestPrice) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (agent != null ? !agent.equals(that.agent) : that.agent != null) return false;
        if (apiKey != null ? !apiKey.equals(that.apiKey) : that.apiKey != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (entities != null ? !entities.equals(that.entities) : that.entities != null) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (requestId != null ? !requestId.equals(that.requestId) : that.requestId != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (requestId != null ? requestId.hashCode() : 0);
        result = 31 * result + (apiKey != null ? apiKey.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (entities != null ? entities.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }
}

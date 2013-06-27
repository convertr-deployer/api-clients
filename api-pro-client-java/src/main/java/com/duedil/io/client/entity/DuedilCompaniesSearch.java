package com.duedil.io.client.entity;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.entity
 */
public class DuedilCompaniesSearch extends Entity {

    private String id;
    private String name;
    private String uri;

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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "DuedilCompaniesSearch{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
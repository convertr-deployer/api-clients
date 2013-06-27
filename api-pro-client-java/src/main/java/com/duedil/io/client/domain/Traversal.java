package com.duedil.io.client.domain;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.traversal
 */
public class Traversal {

    private static final String GET_ALL = "get_all";
    
    private int limit;

    private int offset;

    private String get;

    private String fields;

    public Traversal(){

    }
    public Traversal limit(int limit) {
        this.limit = limit;
        return this;
    }

    public Traversal offset(int offset) {
        this.offset = offset;
        return this;
    }

    public Traversal get(TraversalEnum traversalEnum) {
        this.get = traversalEnum.toString();
        return this;
    }

    public Traversal fields(String fields) {
        this.fields = fields;
        return this;
    }

    public Traversal getAllFields() {
        this.fields = GET_ALL;
        return this;
    }

    public String getGet(){
        return get;
    }
}
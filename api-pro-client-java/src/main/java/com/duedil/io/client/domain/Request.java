package com.duedil.io.client.domain;

import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.utility.EndpointNamespace;
import com.duedil.io.client.utility.JsonTransformer;
import com.google.gson.Gson;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.domain
 */
public class Request {
    protected static final Logger logger = Logger.getLogger(Request.class);

    private String path;
    private String fields = null;
    private int limit = 0;
    private int offset = 0;
    private List<Traversal> traversals = null;
    private HashMap<String, String> params = new HashMap<String,String>();

    public Request()
    { }

    public Request addParams(String key, String value) {
        logger.debug("Endpoint Request Key: " + key + " Value: " + value);
        params.put(key,value);
        return this;
    }

    public HashMap<String,String> getParams() {
        return params;
    }

    public boolean hasExtraParams() {
        boolean value = false;
        if (params.size() > 0) {
            value = true;
        }
        return value;
    }

    public String getPath() {
        return path;
    }

    public Request setPath(String path) {
        logger.debug("Endpoint Request path: " + path);
        this.path = path;
        return this;
    }

    public String getFields() {
        return fields;
    }

    public Request setFields(String fields) {
        logger.debug("Endpoint Request fields: " + fields);
        this.fields = fields;
        return this;
    }

    public int getLimit() {
        return limit;
    }

    public Request setLimit(int limit) {
        logger.debug("Endpoint Request limit: " + limit);
        this.limit = limit;
        return this;
    }

    public int getOffset() {
        return offset;
    }

    public Request setOffset(int offset) {
        logger.debug("Endpoint Request offset: " + offset);
        this.offset = offset;
        return this;
    }

    public String getTraversals() throws DuedilClientException {
        String traversalJson = null;

        if ( traversals != null) {

            //only on company and director
            if ( (path.indexOf(EndpointNamespace.COMPANY) == -1) && (path.indexOf(EndpointNamespace.DIRECTOR) == -1)) {
                throw new DuedilClientException("Traversal are allow only on path /company and /director");
            }

            //set traversal "form" in JsonTransformer
            List<String> forms = new ArrayList<String>();
            for (Traversal traversal : traversals) {
                forms.add(traversal.getGet());
            }
            JsonTransformer.setTraversalFrom(forms);

            //set in path
            Gson gson = new Gson();
            traversalJson = gson.toJson(traversals);
            traversalJson = "&t=" + traversalJson;
        }

        return traversalJson;
    }

    public Request setTraversals(List<Traversal> traversals) {
        this.traversals = traversals;
        return this;
    }

    @Override
    public String toString() {
        return "Request{" +
                "offset=" + offset +
                ", limit=" + limit +
                ", fields=" + (fields == null ? null : Arrays.asList(fields)) +
                ", path='" + path + '\'' +
                '}';
    }

    public String getParam() {
        StringBuilder param = new StringBuilder();

        if ( limit != 0 ) {
            param.append("&limit=" + limit);
        }

        if ( offset != 0) {
            param.append("&offset=" + offset);
        }

        if ( fields != null ) {
            param.append("&fields=" + fields);
        }
        return param.toString();
    }
}

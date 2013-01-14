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
package com.duedil.io.client.domain;

import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.utility.EndpointNamespace;
import com.duedil.io.client.utility.JsonTransformer;
import com.google.gson.Gson;

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

    private String path;
    private String fields = null;
    private int limit = 0;
    private int offset = 0;
    private List<Traversal> traversals = null;
    private HashMap<String, String> params = new HashMap<String,String>();

    public Request(){
    }

    public Request(String path){
        this.path = path;
    }

    public void addParams(String key, String value) {
        params.put(key,value);
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

    public void setPath(String path) {
        this.path = path;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
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

    public void setTraversals(List<Traversal> traversals) {
        this.traversals = traversals;
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

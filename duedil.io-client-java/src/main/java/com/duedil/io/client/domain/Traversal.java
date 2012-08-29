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

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.traversal
 */
public class Traversal {

    private static final String GET_ALL = "get_all";
    private int limit;

    private int offset;

    private String from;

    private String join;

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

    public Traversal get(String get) {
        this.from = get;
        return this;
    }

    public Traversal join(String join) {
        this.join = join;
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

    public String getFrom(){
        return from;
    }
}
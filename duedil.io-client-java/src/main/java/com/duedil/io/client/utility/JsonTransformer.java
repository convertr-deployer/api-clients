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
package com.duedil.io.client.utility;

import com.duedil.io.client.domain.Pagination;
import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.utility
 */
public class JsonTransformer<T> {

    private static final String MAIN = "response";

    private static final String DATA = "data";

    private static final String REQUEST_ID = "request_id";

    private static final String ENTITIES = "entities";

    private static final String TRAVERSAL = "traversal";

    private static final String PAGINATION = "pagination";

    private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss+SSSS";

    private static List<String> traversalFrom = null;

    private static HashMap<String,List<Entity>> traversalObject;

    private static Gson gson = new GsonBuilder().setDateFormat(DATE_FORMAT).create();

    public T getSingleEntity(String json, Class<T> entity) {
        JsonElement jsonElement =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);

        String element = jsonElement.toString();
        if ( jsonElement.isJsonArray()) {
            element = element.substring(0, element.length()-1).substring(1);
        }

        return gson.fromJson(element, entity);
    }

    public static List<DuedilCompaniesSearch> getCompaniesSearch(String json, Type collectionType){
        List<DuedilCompaniesSearch> entities = JsonTransformer.search(json, collectionType);
        return entities;
    }

    public static List<DuedilDirectorsSearch> getDirectorsSearch(String json, Type collectionType){
        List<DuedilDirectorsSearch> entities = JsonTransformer.search(json, collectionType);
        return entities;
    }

    private static List search(String json, Type collectionType){
        JsonElement main =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);
        JsonObject jsonObject= new JsonParser().parse(main.toString()).getAsJsonObject();
        String data = jsonObject.get(DATA).toString();
        return gson.fromJson(data, collectionType);
    }

    public DuedilRequestPrice getRequestPrice(String json) {
        json = json.substring(0, json.length()-1).substring(1);
        String element  =  new JsonParser().parse(json).toString();
        DuedilRequestPrice price = gson.fromJson(element, DuedilRequestPrice.class);
        String entities =  new JsonParser().parse(json).getAsJsonObject().get(ENTITIES).toString();
        price.setEntitiy(entities);
        return price;
    }

    public static List getEntitiesCollection(String json, Type collectionType) {
        JsonElement main =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);
        JsonObject jsonObject= new JsonParser().parse(main.toString()).getAsJsonObject();
        String data = jsonObject.get(DATA).toString();

        return gson.fromJson(data, collectionType);
    }

    //Traversal
    public static void setTraversalFrom(List<String> from) {
        traversalObject = null;
        traversalFrom = from;
    }

    public static void setTraversal(String traversal) throws DuedilClientException {
        JsonElement jsonElement =  new JsonParser().parse(traversal).getAsJsonObject().get(TRAVERSAL);

        traversalObject = new HashMap<String,List<Entity>>();

        for (String from : traversalFrom) {
            JsonArray jsonArray = jsonElement.getAsJsonObject().getAsJsonArray(from);
            Type collectionType = FactoryTraversalTransformer.getCollectionTypeFromString(from);
            List<Entity> entities = gson.fromJson(jsonArray.toString(), collectionType);
            traversalObject.put(from, entities);
        }

        traversalFrom = null;
    }

    public static HashMap<String,List<Entity>> getTraversal(){
       return traversalObject;
    }

    public static String getRequestId(String response) {
        JsonElement jsonElement =  new JsonParser().parse(response).getAsJsonObject().get(REQUEST_ID);
        String element = jsonElement.toString();
        return element.substring(0, element.length()-1).substring(1);
    }

    public static Pagination getPagination(String response) {
        JsonElement jsonElement =  new JsonParser().parse(response).getAsJsonObject().get(PAGINATION);

        if ( jsonElement == null ) {
            jsonElement =  new JsonParser().parse(response).getAsJsonObject().get(MAIN).getAsJsonObject().get(PAGINATION);
        }

        String element = jsonElement.toString();
        String[] url = element.substring(0, element.length()-1).substring(1).split("\\?");

        Map<String,String> params = JsonTransformer.getQueryMap(url[1]);

        Pagination pagination = new Pagination();
        pagination.setLimit(Integer.parseInt(params.get("limit")));
        pagination.setTotal(Integer.parseInt(params.get("total_results")));

        //offset
        String offset = params.get("offset");
        if (offset != null) {
            pagination.setOffset(Integer.parseInt(offset));
        }

        //query param
        String query = params.get("query");
        if (query != null) {
            pagination.setQuery(query);
        }

        String last = params.get("last_result");
        if ( last != null ) {
            pagination.setLast(true);
        }

        return pagination;
    }

    private static Map<String, String> getQueryMap(String query) {
         String[] params = query.split("&");
         Map<String, String> map = new HashMap<String, String>();
         for (String param : params) {
             String[] single = param.split("=");
             map.put(single[0], single[1]);
         }
         return map;
     }
}
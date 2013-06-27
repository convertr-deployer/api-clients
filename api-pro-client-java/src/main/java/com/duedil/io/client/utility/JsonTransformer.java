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

    private static final String REQUEST_ID = "requestId";

    private static final String ENTITIES = "entities";

    private static final String TRAVERSALS = "traversals";

    private static final String PAGINATION = "pagination";

    private static final String DATE_FORMAT = "yyyy-MM-dd";

    private static List<String> traversalFrom = null;

    private static HashMap<String,List<Entity>> traversalsContainer;

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
        return JsonTransformer.search(json, collectionType);
    }

    public static List<DuedilDirectorsSearch> getDirectorsSearch(String json, Type collectionType){
        return JsonTransformer.search(json, collectionType);
    }

    private static List search(String json, Type collectionType){
        JsonElement main =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);
        JsonObject jsonObject= new JsonParser().parse(main.toString()).getAsJsonObject();
        return gson.fromJson(jsonObject.get(DATA).toString(), collectionType);
    }

    public DuedilRequestPrice getRequestPrice(String json) {
        json = json.substring(0, json.length()-1).substring(1);
        DuedilRequestPrice duedilRequestPrice =
                gson.fromJson(new JsonParser().parse(json).toString(), DuedilRequestPrice.class);
        String entities =  new JsonParser().parse(json).getAsJsonObject().get(ENTITIES).toString();
        duedilRequestPrice.setEntities(entities);
        return duedilRequestPrice;
    }

    public static List<DuedilRayUkServiceAddresses> getServiceAddressCollection(String json, Type collectionType) {
        return gson.fromJson(new JsonParser().parse(json).getAsJsonObject().get(MAIN), collectionType);
    }

    //GENERIC
    public static List getEntitiesCollection(String json, Type collectionType) {
        JsonElement main =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);
        JsonObject jsonObject= new JsonParser().parse(main.toString()).getAsJsonObject();
        return gson.fromJson(jsonObject.get(DATA).toString(), collectionType);
    }

    public static List getEntitiesCollectionAccounts(String json, Type collectionType) {
        JsonElement main =  new JsonParser().parse(json).getAsJsonObject().get(MAIN);
        return gson.fromJson("[" + main + "]", collectionType);
    }

    //Traversal
    public static void setTraversalFrom(List<String> from) {
        traversalsContainer = null;
        traversalFrom = from;
    }

    public static void setTraversal(String traversal) throws DuedilClientException {
        JsonElement jsonElement =  new JsonParser().parse(traversal).getAsJsonObject().get(TRAVERSALS);

        traversalsContainer = new HashMap<String,List<Entity>>();

        for (String from : traversalFrom) {
            JsonArray jsonArray = jsonElement.getAsJsonObject().getAsJsonArray(from);
            Type collectionType = FactoryTraversalTransformer.getCollectionTypeFromString(from);

            if ( jsonArray != null ) {
                List<Entity> entities = gson.fromJson(jsonArray.toString(), collectionType);
                traversalsContainer.put(from, entities);
            }
        }

        traversalFrom = null;
    }

    public static HashMap<String,List<Entity>> getTraversal(){
       return traversalsContainer;
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
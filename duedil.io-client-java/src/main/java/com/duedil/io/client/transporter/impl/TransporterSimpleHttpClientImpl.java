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
package com.duedil.io.client.transporter.impl;

import com.duedil.io.client.domain.Request;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.impl.DuedilApiClientImpl;
import com.duedil.io.client.transporter.Transporter;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.transporter.impl
 */
@Component("transporter")
public class TransporterSimpleHttpClientImpl implements Transporter {

    private static Logger logger = Logger.getLogger(TransporterSimpleHttpClientImpl.class);

    private static final int RESPONSE_CODE = 200;

    private static final String JSON = "application/json";

    private static final String API_KEY = "api_key";

    private static final String EQUALS = "=";

    private static final String AND = "&";

    private static final String QUESTION_MARK = "?";

    @Value("${api.url}")
    private String url;

    @Value("${api.key}")
    private String key;

    @Override
    public String getData(Request request) throws DuedilClientException {
        if ( key == null ) {
            throw new DuedilClientException("API KEY is required");
        }

        if ( url == null ) {
            throw new DuedilClientException("URL is required");
        }

        return openConnection(request);
    }

    /**
     * Open connection and execute the HTTP Call
     *
     * @param request The object that rappresent the User Request
     *
     * @return string The response (json format)
     *
     * @throws DuedilClientException
     */
    private String openConnection(Request request) throws DuedilClientException {
        try {
            //create path and URI
            String path = url + request.getPath() + QUESTION_MARK + API_KEY + EQUALS + key + request.getParam();
            String traversal = request.getTraversals();
            if ( traversal != null) path = path + traversal;
            logger.debug("Path: " + path);

            path = getExtraParams(request, path);

            URI uri = getUri(path);

            //call the API with http get
            DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
            defaultHttpClient.getParams().setParameter(CoreProtocolPNames.USER_AGENT, DuedilApiClientImpl.VERSION);
            HttpResponse httpResponse = execHttpGetFromUri(uri, defaultHttpClient);

            //get content
            StringBuilder json = getContentFromHttpResponse(httpResponse);

            if (httpResponse.getStatusLine().getStatusCode() != RESPONSE_CODE) {
                throw new DuedilClientException("[HTTP error code : " + httpResponse.getStatusLine().getStatusCode() + "] [Response: " + json + "]");
            }

            //close connection ant return content
            defaultHttpClient.getConnectionManager().shutdown();
            return json.toString();

        } catch (Exception e){
            throw new DuedilClientException(e.getMessage());
        }
    }

    private String getExtraParams(Request request, String path) {
        if ( request.hasExtraParams() ) {
            logger.debug("Add extra params to the request");
            Map<String,String> params = request.getParams();
            StringBuffer extra = new StringBuffer();
            for (Map.Entry<String,String> entry : params.entrySet()) {
                if ( extra != null) extra.append(AND);
                extra.append(entry.getKey() + EQUALS + entry.getValue());
            }

            path = path + extra;
        }
        return path;
    }

    private HttpResponse execHttpGetFromUri(URI uri, DefaultHttpClient defaultHttpClient) throws IOException {
        logger.debug("Execute the HTTP Call");
        HttpGet httpGet = new HttpGet(uri);
        httpGet.addHeader("accept", JSON);
        return defaultHttpClient.execute(httpGet);
    }

    private StringBuilder getContentFromHttpResponse(HttpResponse httpResponse) throws IOException {
        logger.debug("Read the response");

        //create the buffer
        BufferedReader br = new BufferedReader(new InputStreamReader((httpResponse.getEntity().getContent())));

        String output;
        StringBuilder json = new StringBuilder();
        while ((output = br.readLine()) != null) {
            json.append(output);
        }
        return json;
    }

    private URI getUri(String path) throws MalformedURLException, URISyntaxException {
        logger.debug("Get URI from path " + path);
        URL url = new URL(path);
        return new URI(url.getProtocol(), url.getAuthority(), url.getPath(), url.getQuery(), null);
    }
}
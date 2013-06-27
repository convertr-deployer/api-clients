package com.duedil.io.client.service.impl;

import com.duedil.io.client.domain.Pagination;
import com.duedil.io.client.domain.Request;
import com.duedil.io.client.domain.Traversal;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import com.duedil.io.client.transporter.Transporter;
import com.duedil.io.client.utility.EndpointNamespace;
import com.duedil.io.client.utility.JsonTransformer;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 31/05/2013
 */
abstract class AbstractDuedilApiClientImpl implements DuedilApiClient {

    public static final String VERSION = "duedil.api.client-java-2.0";

    protected static final Logger logger = Logger.getLogger(AbstractDuedilApiClientImpl.class);

    protected static final String SLASH = "/";

    protected static final String GET__ALL = "get_all";

    @Autowired
    protected Transporter transporter;

    protected Request request;

    protected List<Traversal> traversals = new ArrayList<Traversal>();

    protected String request_id;

    protected Pagination pagination = null;


    protected AbstractDuedilApiClientImpl() {
        request = new Request();
    }

    protected String run() throws DuedilClientException {
        logger.debug("Call method run");

        int size = traversals.size() ;

        if ( size > 0) {
            request.setTraversals(traversals);
        }

        String response = transporter.getData(request);

        if ( size > 0 ) {
            JsonTransformer.setTraversal(response);
        }

        if ( hasRequestId() ) {
            request_id = JsonTransformer.getRequestId(response);
        }

        if ( hasPagination(response) ) {
            pagination = JsonTransformer.getPagination(response);
        }

        reset();
        return response;
    }

    protected boolean hasPagination(String response) {
        return response.matches("(?i).*pagination.*");
    }

    protected boolean hasRequestId() {
        return request.getPath().indexOf(EndpointNamespace.REQUEST_DETAILS) == -1
                && request.getPath().indexOf(EndpointNamespace.SEARCH_COMPANIES) == -1
                && request.getPath().indexOf(EndpointNamespace.SEARCH_DIRECTORS) == -1;
    }

    protected void reset() {
        logger.debug("Reset init value");
        traversals =  new ArrayList<Traversal>();
        request = new Request();
    }

    @Autowired
    public boolean hasPagination() {
        boolean value = false;
        if ( pagination != null && !pagination.isLast()) value = true;
        return value;
    }

    @Autowired
    public Pagination getPagination(){
        return pagination;
    }

    @Override
    public String getRequestId() {
        return request_id;
    }
}
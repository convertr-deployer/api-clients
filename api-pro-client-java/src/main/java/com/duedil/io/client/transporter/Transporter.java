package com.duedil.io.client.transporter;

import com.duedil.io.client.domain.Request;
import com.duedil.io.client.exception.DuedilClientException;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.transporter
 */
public interface Transporter {

    /**
     * Call the RESTFull Endpoint
     *
     * @param request The object that rappresent the User Request
     *
     * @return string The response (json format)
     *
     * @throws DuedilClientException
     */
    public String getData(Request request) throws DuedilClientException;

}

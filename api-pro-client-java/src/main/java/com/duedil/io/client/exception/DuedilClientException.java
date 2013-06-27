package com.duedil.io.client.exception;

import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client.exception
 */
public class DuedilClientException extends Exception{

    private static Logger logger = Logger.getLogger(DuedilClientException.class);

    public DuedilClientException(String error){
        super(error);
        logger.error("Exception catch [" + error.getClass() + "] : " + error);
    }
}

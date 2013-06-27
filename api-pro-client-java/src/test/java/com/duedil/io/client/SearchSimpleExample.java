package com.duedil.io.client;

import com.duedil.io.client.domain.Pagination;
import com.duedil.io.client.entity.DuedilCompaniesSearch;
import com.duedil.io.client.entity.DuedilDirectorsSearch;
import com.duedil.io.client.exception.DuedilClientException;
import com.duedil.io.client.service.DuedilApiClient;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: com.duedil.io.client
 */
public class SearchSimpleExample {

    private static final String QUERY_COMPANY = "duedil";
    private static final String QUERY_DIRECTOR = "peter";

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        DuedilApiClient duedilApiClient = (DuedilApiClient) context.getBean("duedilApiClient");

        try {
            //Search Companies
            List<DuedilCompaniesSearch> companies = duedilApiClient.searchCompanies(QUERY_COMPANY);
            for (DuedilCompaniesSearch single : companies){
                System.out.println(single);
            }

            while (duedilApiClient.hasPagination()){
                Pagination pagination = duedilApiClient.getPagination();
                companies = duedilApiClient.setLimit(pagination.getLimit()).setOffset(pagination.getOffset()).searchCompanies(pagination.getQuery());
                for (DuedilCompaniesSearch single : companies) {
                    System.out.println(single);
                }
            }

            //Search Companies
            List<DuedilDirectorsSearch> directors = duedilApiClient.searchDirectors(QUERY_DIRECTOR);
            for (DuedilDirectorsSearch single : directors){
                System.out.println(single);
            }

        } catch (DuedilClientException e) {
            System.out.println(e.getMessage());
        }
    }
}

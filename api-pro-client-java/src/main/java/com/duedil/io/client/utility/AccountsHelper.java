package com.duedil.io.client.utility;

import com.duedil.io.client.domain.AccountsEnum;
import com.duedil.io.client.entity.*;
import com.duedil.io.client.exception.DuedilClientException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Date: 29/05/2013
 */
public class AccountsHelper {

    public static Type getAccountsEntityFromAccountType(String type) throws DuedilClientException {

        AccountsEnum accountsEnum = AccountsEnum.valueOf(type);

        switch (accountsEnum) {

            case statutory:
                return new TypeToken<List<DuedilRayStatutoryAccounts>>(){}.getType();
            case financial:
                return new TypeToken<List<DuedilRayFinancialAccounts>>(){}.getType();
            case gaap:
                return new TypeToken<List<DuedilRayGaapAccounts>>(){}.getType();
            case ifrs:
                return new TypeToken<List<DuedilRayIfrsAccounts>>(){}.getType();
            case insurance:
                return new TypeToken<List<DuedilRayInsuranceAccounts>>(){}.getType();

            default:
                throw new DuedilClientException("Can't find a collection for accounts type: " + type);            
        }

    }
}

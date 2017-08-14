package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Repository.AccountRepository;
import com.imtiyaaz.tpapppractical.Domain.Account;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
public class AccountRepositoryImpl implements AccountRepository{
    private static AccountRepositoryImpl repository = null;
    private Map<String, Account> accountTable;

    private AccountRepositoryImpl(){
        accountTable = new HashMap<String, Account>();
    }

    public static AccountRepositoryImpl getInstance(){
        if(repository == null)
            repository = new AccountRepositoryImpl();
        return repository;
    }

    public Account create(Account account){
        accountTable.put(account.getAccountNumber(), account);
        Account savedAccount = accountTable.get(account.getAccountNumber());
        return savedAccount;
    }

    public Account read(String accountNumber){
        Account account = accountTable.get(accountNumber);
        return account;
    }

    public Account update(Account account){
        accountTable.put(account.getAccountNumber(), account);
        Account savedAccount = accountTable.get(account.getAccountNumber());
        return savedAccount;
    }

    public void delete(String accountNumber){
        accountTable.remove(accountNumber);
    }




}

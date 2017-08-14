package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 14 Aug 2017.
 */
public class ClientRepositoryImpl implements ClientRepository {
    private static ClientRepositoryImpl repository = null;
    private Map<String, Client> clientTable;

    private ClientRepositoryImpl(){
        clientTable = new HashMap<String, Client>();
    }

    public static ClientRepositoryImpl getInstance(){
        if(repository == null)
            repository = new ClientRepositoryImpl();
        return repository;
    }

    public Client create(Client client){
        clientTable.put(client.getcName(), client);
        Client savedClient = clientTable.get(client.getcName());
        return savedClient;
    }

    public Client read(String cName){
        Client client = clientTable.get(cName);
        return client;
    }

    public Client update(Client client){
        clientTable.put(client.getcName(), client);
        Client savedClient = clientTable.get(client.getcName());
        return savedClient;
    }

    public void delete(String cName){
        clientTable.remove(cName);
    }
}

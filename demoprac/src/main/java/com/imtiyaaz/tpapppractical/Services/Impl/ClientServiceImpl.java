package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Repository.ClientRepository;
import com.imtiyaaz.tpapppractical.Repository.Impl.ClientRepositoryImpl;
import com.imtiyaaz.tpapppractical.Services.ClientService;

/**
 * Created by User on 14 Aug 2017.
 */
public class ClientServiceImpl implements ClientService {
    private static ClientServiceImpl service = null;

    ClientRepository repo = ClientRepositoryImpl.getInstance();

    public static ClientServiceImpl getInstance(){
        if(service == null)
            service = new ClientServiceImpl();
        return service;
    }

    public Client create(Client client){
        return repo.create(client);
    }

    public Client read(String cName){
        return repo.read(cName);

    }

    public Client update(Client client){
        return repo.update(client);
    }

    public void delete(String cName){
        repo.delete(cName);
    }
}

package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Repository.Impl.OperationsRepositoryImpl;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import com.imtiyaaz.tpapppractical.Services.OperationsService;

/**
 * Created by User on 14 Aug 2017.
 */
public class OperationsServiceImpl implements OperationsService {
    private static OperationsServiceImpl service = null;

    OperationsRepository repo = OperationsRepositoryImpl.getInstance();

    public static OperationsServiceImpl getInstance(){
        if(service == null)
            service = new OperationsServiceImpl();
        return service;
    }

    public Operations create(Operations operations){
        return repo.create(operations);
    }

    public Operations read(String operationName){
        return repo.read(operationName);

    }

    public Operations update(Operations operations){
        return repo.update(operations);
    }

    public void delete(String operationName){
        repo.delete(operationName);
    }
}

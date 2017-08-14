package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Repository.OperationsRepository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 14 Aug 2017.
 */
public class OperationsRepositoryImpl implements OperationsRepository {
    private static OperationsRepositoryImpl repository = null;
    private Map<String, Operations> operationTable;

    private OperationsRepositoryImpl(){
        operationTable = new HashMap<String, Operations>();
    }

    public static OperationsRepositoryImpl getInstance(){
        if(repository == null)
            repository = new OperationsRepositoryImpl();
        return repository;
    }

    public Operations create(Operations operations){
        operationTable.put(operations.getOperationName(), operations);
        Operations savedOp = operationTable.get(operations.getOperationName());
        return savedOp;
    }

    public Operations read(String operationName){
        Operations operations = operationTable.get(operationName);
        return operations;
    }

    public Operations update(Operations operations){
        operationTable.put(operations.getOperationName(), operations);
        Operations savedOp = operationTable.get(operations.getOperationName());
        return savedOp;
    }

    public void delete(String operationName){
        operationTable.remove(operationName);
    }

}

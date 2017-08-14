package com.imtiyaaz.tpapppractical.Repository.Impl;

import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 14 Aug 2017.
 */
public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl repository = null;
    private Map<String, User> userTable;

    private UserRepositoryImpl(){
        userTable = new HashMap<String, User>();
    }

    public static UserRepositoryImpl getInstance(){
        if(repository == null)
            repository = new UserRepositoryImpl();
        return repository;
    }

    public User create(User user){
        userTable.put(user.getEmployeeUsername(), user);
        User savedUser = userTable.get(user.getEmployeeUsername());
        return savedUser;
    }

    public User read(String EmployeeUsername){
        User user = userTable.get(EmployeeUsername);
        return user;
    }

    public User update(User user){
        userTable.put(user.getEmployeeUsername(), user);
        User savedUser = userTable.get(user.getEmployeeUsername());
        return savedUser;
    }

    public void delete(String EmployeeUser){
        userTable.remove(EmployeeUser);
    }
}

package com.imtiyaaz.tpapppractical.Services.Impl;

import com.imtiyaaz.tpapppractical.Domain.User;
import com.imtiyaaz.tpapppractical.Repository.Impl.UserRepositoryImpl;
import com.imtiyaaz.tpapppractical.Repository.UserRepository;
import com.imtiyaaz.tpapppractical.Services.UserService;

/**
 * Created by User on 14 Aug 2017.
 */
public class UserServiceImpl implements UserService {
    private static UserServiceImpl service = null;

    UserRepository repo = UserRepositoryImpl.getInstance();

    public static UserServiceImpl getInstance(){
        if(service == null)
            service = new UserServiceImpl();
        return service;
    }

    public User create(User user){
        return repo.create(user);
    }

    public User read(String employeeUsername){
        return repo.read(employeeUsername);

    }

    public User update(User user){
        return repo.update(user);
    }

    public void delete(String employeeUsername){
        repo.delete(employeeUsername);
    }
}

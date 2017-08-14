package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.User;

import java.util.Map;

/**
 * Created by Ameer on 2017/08/13.
 */
public class UserFactory {
    public static User getUser(Map<String, Object> values, int employeeId){
        User user = new User.Builder()
                .employeePassword(values.get("EmployeePassword"))
                .employeeUsername(values.get("EmployeeUsername"))
                .role(values.get("role"))
                .employeeId(employeeId)
                .Build();

        return user;

    }
}

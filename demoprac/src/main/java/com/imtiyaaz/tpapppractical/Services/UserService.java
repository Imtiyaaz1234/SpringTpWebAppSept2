package com.imtiyaaz.tpapppractical.Services;

import com.imtiyaaz.tpapppractical.Domain.User;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
public interface UserService {
    User create(User user);
    User read(String employeeUsername);
    User update(User user);
    void delete(String employeeUsername);
}

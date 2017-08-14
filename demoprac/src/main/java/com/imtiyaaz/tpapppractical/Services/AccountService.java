package com.imtiyaaz.tpapppractical.Services;

import com.imtiyaaz.tpapppractical.Domain.Account;

/**
 * Created by User on 14 Aug 2017.
 */
public interface AccountService {
    Account create(Account account);
    Account read(String accountNumber);
    Account update(Account account);
    void delete(String accountNumber);
}

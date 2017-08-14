package com.imtiyaaz.tpapppractical.Repository;

import com.imtiyaaz.tpapppractical.Domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by User on 14 Aug 2017.
 */
@Repository
public interface AccountRepository {//extends JpaRepository<Account, Long> {
    //Account findByAccountNumber(String accountNumber);

    Account create(Account account);
    Account read(String accountNumber);
    Account update(Account account);
    void delete(String accountNumber);
}

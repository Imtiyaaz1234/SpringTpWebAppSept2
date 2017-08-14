package com.imtiyaaz.tpapppractical.Repository;

import com.imtiyaaz.tpapppractical.Domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Imtiyaaz on 14 Aug 2017.
 */
@Repository
public interface ClientRepository {//extends JpaRepository<Client, Integer>{
    //Client findBycId(String cId);
    //Client findBycCnp(String cCnp);
    Client create(Client client);
    Client read(String cName);
    Client update(Client client);
    void delete(String cName);

}

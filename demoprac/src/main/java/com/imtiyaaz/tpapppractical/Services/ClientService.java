package com.imtiyaaz.tpapppractical.Services;

import com.imtiyaaz.tpapppractical.Domain.Client;

/**
 * Created by User on 14 Aug 2017.
 */
public interface ClientService {
    Client create(Client client);
    Client read(String cName);
    Client update(Client client);
    void delete(String cName);
}

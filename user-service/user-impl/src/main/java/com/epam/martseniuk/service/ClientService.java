package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.Client;

/**
 * @author Roman_Martseniuk
 */
public interface ClientService {

    Client createClient(Client client);

    Client getClientById(String id);
}

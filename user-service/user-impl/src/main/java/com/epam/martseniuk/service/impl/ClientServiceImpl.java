package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.Client;
import com.epam.martseniuk.repository.ClientRepository;
import com.epam.martseniuk.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client getClientById(String id) {
        return clientRepository.findOne(id);
    }
}

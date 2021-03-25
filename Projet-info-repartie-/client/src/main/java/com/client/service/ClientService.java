package com.client.service;

import com.client.bean.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public Client save(Client client);
    public Optional<Client> findByid(Long id);
    public List<Client> findAllClient();
    public void deleteClient(Client client);
    public Client updateClient(Client client);
}

package com.client.service.impl;

import com.client.bean.Client;
import com.client.repository.ClientRepository;
import com.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Optional<Client> findByid(Long id) {
        return clientRepository.findById(id);
    }

    @Override
    public List<Client> findAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Client client) {
        clientRepository.delete(client);

    }

    @Override
    public Client updateClient(Client client) {
        Client c=findByid(client.getId()).get();
        c.setAdresse(client.getAdresse());
        c.setNom(client.getNom());
        c.setPrenom(client.getPrenom());
        c.setEmail(client.getEmail());
        c.setTel(client.getTel());
        clientRepository.save(c);
        return c;
    }
}

package com.client.web;

import com.client.bean.Client;
import com.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ClientWeb {

    @Autowired
    ClientService clientService;

    @PostMapping("/client")
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }

    @GetMapping("/client/{id}")
    public Optional<Client> findByid(@PathVariable Long id) {
        return clientService.findByid(id);
    }

    @GetMapping("/clients")
    public List<Client> findAllClient() {
        return clientService.findAllClient();
    }

    @DeleteMapping("/client")
    public void deleteClient(@RequestBody Client client) {
        clientService.deleteClient(client);
    }

    @PutMapping("/client")
    public Client updateClient(@RequestBody Client client) {
        return clientService.updateClient(client);
    }
}

package com.commandeservice.web;

import com.commandeservice.beans.Commande;
import com.commandeservice.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CommandeWeb {
    @Autowired
    CommandeService commandeService;

    @PostMapping("/commande")
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }

    @GetMapping("/commande/{id}")
    public Optional<Commande> findById(@PathVariable int id) {
        return commandeService.findById(id);
    }

    @GetMapping("/commandes")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }

    @PutMapping("/produit")
    public Commande updateComande(@RequestBody Commande commande) {
        return commandeService.updateComande(commande);
    }

    @DeleteMapping("/commande")
    public void deleteComande(@RequestBody Commande commande) {
        commandeService.deleteComande(commande);
    }
}

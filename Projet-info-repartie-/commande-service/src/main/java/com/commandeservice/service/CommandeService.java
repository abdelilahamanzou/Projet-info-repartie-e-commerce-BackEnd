package com.commandeservice.service;

import com.commandeservice.beans.Commande;

import java.util.List;
import java.util.Optional;

public interface CommandeService {

    public Commande save(Commande commande);
    public Optional<Commande> findById(int id);
    public List<Commande> findAll();
    public Commande updateComande(Commande commande);
    public void deleteComande(Commande commande);

}

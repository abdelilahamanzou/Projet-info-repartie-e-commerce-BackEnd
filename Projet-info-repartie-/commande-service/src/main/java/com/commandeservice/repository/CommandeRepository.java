package com.commandeservice.repository;

import com.commandeservice.beans.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {

}

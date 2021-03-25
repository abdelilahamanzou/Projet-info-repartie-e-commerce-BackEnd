package com.commandeservice.service.impl;

import com.commandeservice.beans.Commande;
import com.commandeservice.repository.CommandeRepository;
import com.commandeservice.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {

    @Autowired
    CommandeRepository commandeRepository;
    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Optional<Commande> findById(int id) {
        return commandeRepository.findById(id);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande updateComande(Commande commande) {
        Commande c=findById(commande.getClientId()).get();
        c.setDatecom(commande.getDatecom());
        c.setMontant(commande.getMontant());
        c.setNumCom(commande.getNumCom());
        commandeRepository.save(c);
        return c;
    }

    @Override
    public void deleteComande(Commande commande) {
         commandeRepository.delete(commande);
    }
}

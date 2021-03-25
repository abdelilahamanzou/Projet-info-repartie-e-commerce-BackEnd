package com.commandeservice;

import com.commandeservice.beans.Commande;
import com.commandeservice.repository.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class CommandeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommandeServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CommandeRepository commandeRepository) {

        return args -> {
            commandeRepository.save(new Commande( 1, new Date(), 15));
            commandeRepository.save(new Commande(2, new Date(), 30));
            commandeRepository.save(new Commande(3, new Date(), 45));

        };

    }
}

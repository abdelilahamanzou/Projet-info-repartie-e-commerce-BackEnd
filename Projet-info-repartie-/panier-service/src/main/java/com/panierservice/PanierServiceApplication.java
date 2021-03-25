package com.panierservice;

import com.panierservice.beans.Panier;
import com.panierservice.repository.PanierRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class PanierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanierServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(PanierRepository panierRepository) {

		return args -> {
			panierRepository.save(new Panier( "commande 1 ", 20, 15));
			panierRepository.save(new Panier("commande 2 ", 80, 30));
			panierRepository.save(new Panier("commande 3 ",90, 45));

		};

	}
}

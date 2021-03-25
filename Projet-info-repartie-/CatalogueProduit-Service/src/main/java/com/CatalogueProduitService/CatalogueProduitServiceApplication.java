package com.CatalogueProduitService;

import com.CatalogueProduitService.beans.Produit;
import com.CatalogueProduitService.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class CatalogueProduitServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueProduitServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProduitRepository produitRepository) {

		return args -> {
			produitRepository.save(new Produit( "produit_1", 600, 10));
			produitRepository.save(new Produit("produit_2", 450, 12));
			produitRepository.save(new Produit("produit_3",300, 14));
			produitRepository.save(new Produit("produit_4",150, 16));


		};

	}
}

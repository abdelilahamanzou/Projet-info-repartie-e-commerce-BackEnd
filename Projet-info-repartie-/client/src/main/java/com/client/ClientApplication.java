package com.client;

import com.client.bean.Client;
import com.client.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository) {

        return args -> {
            clientRepository.save(new Client("sidi mohamed", "khercheve", "Rabat", 698430867, "sidimed.khercheve@gmail.com"));
            clientRepository.save(new Client("ghlana", "amara", "rabat", 699336749, "ghlanaamara3@gmail.com"));


        };
    }

}

package com.med.inventoryservice;

import com.med.inventoryservice.Entity.Product;
import com.med.inventoryservice.Repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().id("P01").name("Computer").price(2000).quantity(10).build());
            productRepository.save(Product.builder().id("P02").name("Printer").price(5000).quantity(10).build());
            productRepository.save(Product.builder().id("P03").name("Phone").price(5500).quantity(10).build());
        };
    }

    /*@Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            Product p = new Product(UUID.randomUUID().toString(),"Computer",5000.0,10);
            productRepository.save(p);
        };
    }*/
}

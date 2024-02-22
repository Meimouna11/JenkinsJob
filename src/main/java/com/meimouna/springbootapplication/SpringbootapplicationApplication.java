package com.meimouna.springbootapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringbootapplicationApplication implements CommandLineRunner {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootapplicationApplication.class);

    public static void main(String[] args) {
        logger.info("Integration job de meimouna");
        SpringApplication.run(SpringbootapplicationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Ajoutez vos logiques d'initialisation ici
        logger.info("L'application a démarré avec les arguments de ligne de commande : {}", (Object[]) args);

    }
}

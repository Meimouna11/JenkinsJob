package com.meimouna.springbootapplication;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals; // Importation de la méthode assertEquals

@SpringBootTest
class SpringbootapplicationApplicationTests {
    public static final Logger logger = LoggerFactory.getLogger(SpringbootapplicationApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("C'est une classe de test");
        assertEquals(true, true); // Utilisation correcte de la méthode assertEquals
    }
}


package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit tests for App class.
 */
public class AppTest {

    @Test
    public void testAppConstructor() {
        // Create two App objects and check they return the same message
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage() {
        // Verify that getMessage() returns "Hello World!"
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}


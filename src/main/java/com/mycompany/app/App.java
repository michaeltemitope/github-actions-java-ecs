package com.mycompany.app;

/**
 * Hello world application.
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    // Default constructor
    public App() { }

    // Main method to run the app
    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    // Getter method used in tests
    public String getMessage() {
        return MESSAGE;
    }
}


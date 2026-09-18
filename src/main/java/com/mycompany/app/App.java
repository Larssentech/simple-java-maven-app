package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {
    	
    	System.out.println(this.getMessage());
    	
    }

    public static void main(String[] args) {
        new App();
    }

    public String getMessage() {
        return MESSAGE;
    }
}

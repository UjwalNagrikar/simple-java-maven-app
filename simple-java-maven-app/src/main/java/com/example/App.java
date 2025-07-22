package com.example;

public class App {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // Create an instance of our utility class
        Calculator calc = new Calculator();
        
        // Demonstrate some basic operations
        int sum = calc.add(5, 3);
        int product = calc.multiply(4, 6);
        
        System.out.println("5 + 3 = " + sum);
        System.out.println("4 * 6 = " + product);
        
        // Show current timestamp
        System.out.println("Application started at: " + java.time.LocalDateTime.now());
    }
}

class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
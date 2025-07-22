package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    void testAddition() {
        assertEquals(8, calculator.add(5, 3));
        assertEquals(0, calculator.add(-5, 5));
        assertEquals(-8, calculator.add(-3, -5));
    }
    
    @Test
    void testMultiplication() {
        assertEquals(24, calculator.multiply(4, 6));
        assertEquals(0, calculator.multiply(0, 10));
        assertEquals(-15, calculator.multiply(-3, 5));
    }
    
    @Test
    void testDivision() {
        assertEquals(2.5, calculator.divide(5.0, 2.0), 0.001);
        assertEquals(1.0, calculator.divide(7.0, 7.0), 0.001);
    }
    
    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.0, 0.0);
        });
    }
}
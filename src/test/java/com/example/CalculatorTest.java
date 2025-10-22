package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Calculator to demonstrate JUnit 5 and JaCoCo coverage.
 */
public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void add_shouldSumTwoIntegers() {
        assertEquals(7, calc.add(3, 4));
        assertEquals(-1, calc.add(-3, 2));
        assertEquals(0, calc.add(0, 0));
    }

    @Test
    void subtract_shouldSubtractTwoIntegers() {
        assertEquals(1, calc.subtract(5, 4));
        assertEquals(-5, calc.subtract(-3, 2));
        assertEquals(0, calc.subtract(0, 0));
    }

    @Test
    void multiply_shouldMultiplyTwoIntegers() {
        assertEquals(20, calc.multiply(5, 4));
        assertEquals(-6, calc.multiply(-3, 2));
        assertEquals(0, calc.multiply(0, 100));
    }

    @Test
    void divide_shouldDivideTwoIntegers() {
        assertEquals(2, calc.divide(8, 4));
        assertEquals(-3, calc.divide(-9, 3));
    }

    @Test
    void divide_shouldThrowOnDivisionByZero() {
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> calc.divide(1, 0));
        assertEquals("Division by zero", ex.getMessage());
    }

    @Test
    void gcd_basicCases() {
        assertEquals(6, calc.gcd(54, 24));
        assertEquals(1, calc.gcd(17, 31));
    }

    @Test
    void gcd_zeroAndNegativeCases() {
        assertEquals(5, calc.gcd(0, 5));
        assertEquals(7, calc.gcd(7, 0));
        assertEquals(4, calc.gcd(-12, -8));
        assertEquals(4, calc.gcd(12, -8));
        assertEquals(0, calc.gcd(0, 0));
    }
}

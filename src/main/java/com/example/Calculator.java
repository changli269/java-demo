package com.example;

/**
 * A simple calculator with common operations to demonstrate unit testing and JaCoCo coverage.
 */
public class Calculator {

    /**
     * Adds two integers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts b from a.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides a by b.
     * Throws IllegalArgumentException if b == 0.
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
     * Computes the greatest common divisor (GCD) using the Euclidean algorithm.
     * Ensures non-negative result.
     */
    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}

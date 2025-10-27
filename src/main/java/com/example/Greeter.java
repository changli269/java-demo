package com.example;

/**
 * A simple class with multiple branches and an unchecked path.
 * No tests are provided for this class so it will reduce overall coverage.
 */
public class Greeter {

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, world!";
        }
        return "Hello, " + name + "!";
    }

    public String farewell(String name) {
        if (name == null) {
            return "Goodbye!";
        }
        if (name.isEmpty()) {
            return "Goodbye...";
        }
        return "Goodbye, " + name;
    }

    /**
     * Adds two positive integers, throws on negative input.
     */
    public int secretAddPositive(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        return a + b;
    }

    // Unused private helper to contribute uncovered lines/branches
    private String internalHelper() {
        return "internal";
    }
}

package com.example;

/**
 * Utility methods for working with strings.
 * Includes a few branches and error paths to make coverage interesting.
 */
public class StringUtils {

    /**
     * Reverse the input string. Null returns null.
     */
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Checks if the input is a palindrome (exact match, case sensitive).
     * Null is not considered a palindrome.
     */
    public boolean isPalindrome(String input) {
        if (input == null) return false;
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * Counts vowels (a, e, i, o, u) in both lower and upper case.
     * Null returns 0.
     */
    public int countVowels(String input) {
        if (input == null) return 0;
        int count = 0;
        for (char c : input.toCharArray()) {
            if (isVowel(c)) count++;
        }
        return count;
    }

    /**
     * Repeats the given string {@code times} times.
     * Throws IllegalArgumentException for negative times.
     * Null input is treated as the string "null".
     */
    public String repeat(String input, int times) {
        if (times < 0) {
            throw new IllegalArgumentException("times must be non-negative");
        }
        String s = String.valueOf(input);
        if (times == 0) return "";
        StringBuilder sb = new StringBuilder(s.length() * times);
        for (int i = 0; i < times; i++) {
            sb.append(s);
        }
        return sb.toString();
    }

    // Helper not covered by all tests on purpose
    private boolean isVowel(char c) {
        switch (Character.toLowerCase(c)) {
            case 'a': case 'e': case 'i': case 'o': case 'u':
                return true;
            default:
                return false;
        }
    }
}

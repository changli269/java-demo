package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    private final StringUtils utils = new StringUtils();

    @Test
    void reverse_returnsReversed_whenNormal() {
        assertEquals("cba", utils.reverse("abc"));
    }

    @Test
    void reverse_returnsNull_whenNull() {
        assertNull(utils.reverse(null));
    }

    @Test
    void isPalindrome_true_forPalindrome() {
        assertTrue(utils.isPalindrome("racecar"));
    }

    @Test
    void isPalindrome_false_forNonPalindrome() {
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void isPalindrome_false_forNull() {
        assertFalse(utils.isPalindrome((String) null));
    }

    @Test
    void countVowels_countsBothCases() {
        assertEquals(5, utils.countVowels("AeIoU"));
    }

    @Test
    void countVowels_zero_whenNull() {
        assertEquals(0, utils.countVowels(null));
    }

    @Test
    void repeat_zeroTimes_returnsEmpty() {
        assertEquals("", utils.repeat("ab", 0));
    }

    @Test
    void repeat_positiveTimes_concatenates() {
        assertEquals("ababab", utils.repeat("ab", 3));
    }

    @Test
    void repeat_negativeTimes_throws() {
        assertThrows(IllegalArgumentException.class, () -> utils.repeat("x", -1));
    }
}

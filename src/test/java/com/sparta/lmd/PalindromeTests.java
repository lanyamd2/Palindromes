package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTests {
    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic","There are no palindromes in this sentence."})
    @DisplayName("Test if user input is appropriately converted to an array of Strings.")
    void testInputArray(String str){
        Assertions.assertTrue(Palindrome.inputArray(str).getClass().isArray());
    }

    @ParameterizedTest
    @ValueSource(strings = {"There are no palindromes in this sentence.", "She has seashells"})
    @DisplayName("Test for what happens when no palindromes are found.")
    void testNoPalindrome(String str){
        Assertions.assertEquals("No palindromes were found in this sentence.",Palindrome.longestPalindrome(Palindrome.inputArray(str)));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    @DisplayName("Test if string is a palindrome in PalindromeStr.")
    void testIsPalindromeStr(String str){
        Assertions.assertTrue(PalindromeStr.isPalindromeStr(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    @DisplayName("Tests if string is a palindrome in PalindromeSB.")
    void testIsPalindromeSB(String str){
        Assertions.assertTrue(PalindromeSB.isPalindromeSB(str));
    }

    @Test
    @DisplayName("Tests for the longest palindrome in a sentence")
    void testLongestPalindrome(){
        Assertions.assertTrue("civic".equalsIgnoreCase(Palindrome.longestPalindrome(Palindrome.inputArray("Anna drives a Honda Civic."))));
    }
}

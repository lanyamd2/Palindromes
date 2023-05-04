package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTests {
    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    @DisplayName("Tests if string is a palindrome.")
    void testPalindromeCheckerSB(String str){
        Assertions.assertTrue(PalindromeSB.palindromeCheckerSB(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic"})
    @DisplayName("Tests for the longest palindrome in a sentence")
    void testIsLongestSB(String str){
        Assertions.assertEquals("civic",PalindromeSB.isLongest(str.split(" ")));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    @DisplayName("Tests if string is a palindrome.")
    void testPalindromeCheckerStr(String str){
        Assertions.assertTrue(PalindromeStr.palindromeCheckerStr(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic"})
    @DisplayName("Tests for the longest palindrome in a sentence")
    void testIsLongestStr(String str){
        Assertions.assertEquals("civic",PalindromeStr.isLongest(str.split(" ")));
    }
}

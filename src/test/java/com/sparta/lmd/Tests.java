package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {
    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    @DisplayName("Tests if string is a palindrome.")
    void testPalindromeCheckerSB(String str){
        Assertions.assertEquals(true,PalindromeSB.palindromeCheckerSB(str));
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
        Assertions.assertEquals(true,PalindromeStr.palindromeCheckerStr(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic"})
    @DisplayName("Tests for the longest palindrome in a sentence")
    void testIsLongestStr(String str){
        Assertions.assertEquals("civic",PalindromeStr.isLongest(str.split(" ")));
    }
}

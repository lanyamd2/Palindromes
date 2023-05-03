package com.sparta.lmd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Tests {
    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civc", "delEveled"})
    void testPalindromeCheckerSB(String str){
        Assertions.assertEquals(true,PalindromeSB.palindromeCheckerSB(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic"})
    void testIsLongestSB(String str){
        Assertions.assertEquals("civic",PalindromeSB.isLongest(str.split(" ")));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna", "civic", "delEveled"})
    void testPalindromeCheckerStr(String str){
        Assertions.assertEquals(true,PalindromeStr.palindromeCheckerStr(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anna drives a honda civic"})
    void testIsLongestStr(String str){
        Assertions.assertEquals("civic",PalindromeStr.isLongest(str.split(" ")));
    }
}

package com.sparta.lmd;

import java.util.Arrays;

public class DemoPalindrome {
    public static void main(String[] args) {
        //from scratch.java
        System.out.println(PalindromeSB.isPalindromeSB("Anna")); //using StringBuilder
        System.out.println(PalindromeStr.isPalindromeStr("Anna")); //using String
        System.out.println(Arrays.toString(Palindrome.inputArray("She?sells2seashells."))); //separate string into array
        System.out.println(Palindrome.longestPalindrome(new String[]{"Ma'am", "and","rotator", "are","palindromes"})); //test array input
        System.out.println(Palindrome.longestPalindrome(Palindrome.inputArray(Palindrome.userInput()))); //test user input
    }
}

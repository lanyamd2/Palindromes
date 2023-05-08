package com.sparta.lmd;

import java.util.Arrays;

public class DemoPalindrome {
    public static void main(String[] args) {
        //from scratch.java
        System.out.println(PalindromeSB.isPalindromeSB("Anna")); //using StringBuilder
        System.out.println(PalindromeStr.isPalindromeStr("Anna")); //using String
        System.out.println(Arrays.toString(Palindrome.inputArray("She?sells2seashells."))); //separate string into array
//        System.out.println(PalindromeSB.longestPalindrome(new String[]{"Ma'am", "and","rotator", "are","palindromes"})); //test array input for StringBuilder
//        System.out.println(PalindromeSB.longestPalindrome(Palindrome.inputArray(Palindrome.userInput()))); //test user input for StringBuilder
        System.out.println(PalindromeStr.longestPalindrome(new String[]{"Ma'am", "and","rotator", "are","palindromes"})); //test array input for String
        System.out.println(PalindromeStr.longestPalindrome(Palindrome.inputArray(Palindrome.userInput()))); //test user input for String
    }
}

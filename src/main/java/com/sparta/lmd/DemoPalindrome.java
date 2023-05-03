package com.sparta.lmd;

public class DemoPalindrome {
    public static void main(String[] args) {
        //Using StringBuilder
        //System.out.println(PalindromeSB.palindromeChecker("Anna"));
        //System.out.println(PalindromeSB.isLongest(new String[]{"Anna", "drives", "a", "Honda", "Civic"}));
        //System.out.println(PalindromeSB.isLongest(PalindromeSB.userInput()));

        //Without using StringBuilder
        //System.out.println(PalindromeStr.palindromeCheckerStr("Civic"));
        //System.out.println(PalindromeStr.isLongest(new String[]{"Ma'am", "and","rotator", "are","palindromes"}));
        System.out.println(PalindromeStr.isLongest(PalindromeStr.userInput()));
    }
}

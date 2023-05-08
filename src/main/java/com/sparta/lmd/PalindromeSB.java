package com.sparta.lmd;



public class PalindromeSB implements LongestPalindrome{//palindrome checker with StringBuilder
    public static boolean isPalindromeSB(String str){//checks if string is a palindrome
        StringBuilder strBuilder=new StringBuilder(str);
        strBuilder.reverse();
        return str.equalsIgnoreCase(strBuilder.toString());
    }


    public static String longestPalindrome(String[] strArray){//checks for longest palindrome
        String longest="";
        for(String i: strArray){
            if(Palindrome.isThreeChar(i) && PalindromeSB.isPalindromeSB(i) && i.length()>longest.length()){
                longest=i;
            }
        }
        if(longest.equals("")){
            longest="No palindromes were found in this sentence.";
        }
        return longest;
    }

}

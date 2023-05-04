package com.sparta.lmd;

public class PalindromeStr {//palindrome checker with String and for loop
    public static String reverseStr(String word){//reverses string
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+= word.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindromeStr(String word){//checks if string is a palindrome
        return word.equalsIgnoreCase(reverseStr(word));
    }

}

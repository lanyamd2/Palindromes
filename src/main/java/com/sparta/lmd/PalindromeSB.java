package com.sparta.lmd;



public class PalindromeSB{//palindrome checker with StringBuilder
    public static boolean isPalindromeSB(String str){//checks if string is a palindrome
        StringBuilder strBuilder=new StringBuilder(str);
        strBuilder.reverse();
        return str.equalsIgnoreCase(strBuilder.toString());
    }


}

package com.sparta.lmd;

import java.util.Scanner;

public class Palindrome {
    public static String userInput() { //takes user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }

    public static String[] inputArray(String str) {//takes users input and creates array of Strings
        return str.split("\\W");
    }
    public static boolean isThreeChar(String str){
        return str.length()>2;
    }//checks word length

    public static String longestPalindrome(String[] strArray){//checks for longest palindrome
        String longest="";
        for(String i: strArray){
            if(isThreeChar(i) && PalindromeSB.isPalindromeSB(i) && i.length()>longest.length()){
                longest=i;
            }
        }
        if(longest.equals("")){
            longest="No palindromes were found in this sentence.";
        }
        return longest;
    }
}

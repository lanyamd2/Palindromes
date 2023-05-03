package com.sparta.lmd;

import java.util.Scanner;

public class PalindromeStr {

    public static String[] userInput(){//takes users input, converts to String array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input.split(" ");
    }

    public static String reverseStr(String word){//reverses string
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse + word.charAt(i);
        }
        return reverse;
    }


    public static boolean palindromeCheckerStr(String word){//checks if string is a palindrome, must be 3 or more letters in length
        return word.equalsIgnoreCase(reverseStr(word))&&word.length()>2;
    }

    //checks for longest palindrome
    public static String isLongest(String[] strArray){
        String longest="";
        for(String i: strArray){
            if(palindromeCheckerStr(i)&&i.length()>longest.length()){
                longest=i;
            }
        }
        if(longest.equals("")){
            longest="No palindromes were found in this sentence.";
        }
        return longest;
    }
}

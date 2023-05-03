package com.sparta.lmd;

import java.util.Scanner;

public class PalindromeSB {//palindrome checker with stringbuilder
    public static boolean palindromeCheckerSB(String str){
        StringBuilder reverseStr=new StringBuilder(str.toLowerCase());
        reverseStr.reverse();
        return str.equalsIgnoreCase(reverseStr.toString())&&str.length()>2;
    }

    public static String[] userInput(){//takes users input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        return input.split(" ");
    }
    public static String isLongest(String[] strArray){

        String longest="";
        for(String i: strArray){
            if(palindromeCheckerSB(i)&&i.length()>longest.length()){
                longest=i;
            }
        }
        if(longest.equals("")){
            longest="No palindromes were found in this sentence.";
        }
        return longest;
    }

    public static String[] toArray(String str){
        return str.split(" ");
    }
}

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


}

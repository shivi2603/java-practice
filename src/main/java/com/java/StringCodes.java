package com.java;

import java.util.HashSet;

public class StringCodes {

    public static void main(String[] args) {

     //   String input = "A man a plan a canal PaNAMA";
        String input = "abcabcbb";
////*************************Reverse a String and find palindrome
        input = input.replace(" ", "");
        char[] carray = new char[input.length()];
        int index = 0;

        for (int i = input.length() - 1; i >= 0; i--) {
            carray[index] = input.charAt(i);
            index++;
        }

        if (String.valueOf(carray).equalsIgnoreCase(input)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

       // //*******************8





    }
}

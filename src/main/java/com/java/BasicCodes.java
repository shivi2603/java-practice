package com.java;

public class BasicCodes {

    public static void main(String[] args) {


        // TO FIND PRIME NUMBER
        System.out.println(" TO FIND PRIME NUMBER ");
        int num = 54, isprime = 0;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isprime = 1;
                break;
            }
        }
        if (isprime == 0) System.out.println(num + " is prime");
        else System.out.println(num + " not prime");

////PRIME NUMBERS UPTO 30
        System.out.println(" TO GET PRIME NUMBERS ");
        int tillnumber = 30;

        for (int i = 2; i <= tillnumber; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) System.out.println(i + " ");
        }
//SWAP NUMBERS WITHOUT USING THIRD VARIABLE
        System.out.println("  SWAP NUMBERS WITHOUT USING THIRD VARIABLE  ");
        int a = 545, b = 541;

        a = a + b;
        b = a - b;
        System.out.println(a + " " + b);
        a = a - b;
        System.out.println(a + " " + b);

        int number = 323, initialnum = number, reversed = 0;

        while (number > 0) {
            int temp = number % 10;
            reversed = (reversed * 10) + temp;
            number = number / 10;
        }
        if (initialnum == reversed)
            System.out.println("number is palindrome");
        else
            System.out.println("number is not palindrome");


        //*******************************

        int[] array = {2, 4, 1, 6, 8};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("max " + max);

        int secondmax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != max && secondmax < array[i]) {
                secondmax = array[i];
            }
        }
        System.out.println(secondmax);


        ////*******************

        String s1 = "ravi";
        String s2 = "varma";
        s1 = s1 + s2;
        s2 = s1.substring(0, s2.length()-1);
        s1 = s1.substring(s2.length(), s1.length());

//ravivarma
        System.out.println(s2);
        System.out.println(s1);

    }
}

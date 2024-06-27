package com.java;

import java.util.HashSet;

public class Arraycodes {


    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {2, 3, 4, 4};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < a1.length; i++) {
            set1.add(a1[i]);
        }


        for (int i = 0; i < a2.length; i++) {
            if (set1.contains(a2[i])) {
                set1.remove(a2[i]);
            } else {
                set2.add(a2[i]);
            }
        }
        System.out.println(set2);
        System.out.println(set1);
        set1.addAll(set2);
        System.out.println(set1);
    }

}

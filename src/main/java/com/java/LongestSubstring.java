package com.java;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {

//longest substring without any repeated characters
        String s = "substring";
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {

            int index = i;
            while (index < s.length() && set.add(s.charAt(index))) {
                index++;
            }
            max = Math.max(max, set.size());
            set.clear();

        }
        System.out.println(max);
//        int n = s.length();
//        int result = 0;
//        int left = 0;
//        HashSet<Character> set = new HashSet<>();
//        for (int right = 0; right < n; right++) {
//            while (set.contains(s.charAt(right))) {
//                set.remove(s.charAt(left));
//                left++;
//            }
//            set.add(s.charAt(right));
//            result = Math.max(result, right - left + 1);
//        }
//        System.out.println(result);
    }
}

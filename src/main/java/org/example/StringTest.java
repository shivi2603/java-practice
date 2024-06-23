package org.example;

import java.util.HashMap;
import java.util.Map;

public class StringTest {
	public static void main(String[] args) {

		/// String reversal
//		int a =1;
//		String name = "priyanka";
//		char[] reversed = new char[name.length()];
//		int length = name.length();
//		int index = 0;
//		for (int i = length - 1; i >= 0; i--) {
//			reversed[index] = name.charAt(i);
//			index++;
//		}
//		System.out.println(reversed);

		// using Stringbuilder

//		String name = "priyanka";
//		StringBuilder sb = new StringBuilder();
//		// System.out.println(sb.reverse());
//
//		for (int i = name.length() - 1; i >= 0; i--) {
//			sb.append(name.charAt(i));
//		}
//		System.out.println(sb.toString());

		// while loop

//		String name = "priyanka";
//		char[] reversed = new char[name.length()];
//		int i = 0, j = name.length() - 1;
//		while (j >= 0) {
//			reversed[i] = name.charAt(j);
//			i++;
//			j--;
//		}
//		System.out.println(reversed);

		// ####################### COUNT OF CHARS IN A STRING
//		String name = "priyanka";
//
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		char ch;
//		for (int i = 0; i < name.length(); i++) {
//			ch = name.charAt(i);
//			if (map.containsKey(ch)) {
//				map.put(ch, map.get(ch) + 1);
//			} else {
//				map.put(ch, 1);
//			}
//		}
//
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//#########################################  count of words
//		String sentence = "red color green color color";
//
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//
//		for (String str : sentence.split(" ")) {
//			if (map.containsKey(str)) {
//				map.put(str, map.get(str) + 1);
//			} else {
//				map.put(str, 1);
//			}
//		}
//
//		for (Map.Entry<String, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}

		// ############################### ANAGRAMS

//		String s1 = "ravib";
//		String s2 = "vira";
//
//		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
//		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
//
//		if (s1.length() != s2.length()) {
//			System.out.println("Not an anagram");
//			return;
//		} else {
//			for (int i = 0; i < s1.length(); i++) {
//				char ch = s1.charAt(i);
//
//				if (map1.containsKey(ch)) {
//					map1.put(ch, map1.get(ch) + 1);
//				} else {
//					map1.put(ch, 1);
//				}
//
//				char ch2 = s2.charAt(i);
//
//				if (map2.containsKey(ch2)) {
//					map2.put(ch2, map2.get(ch2) + 1);
//				} else {
//					map2.put(ch2, 1);
//				}
//
//			}
//		}
//
//		if (map1.equals(map2))
//			System.out.println("Is anagram");
//		else
//			System.out.println("not an anagram");

		// ######################################

//		String word = "This is string";
//
//		char[] reversedword = new char[word.length()];
//		int index = 0;
//
//		for (int i = word.length() - 1; i >= 0; i--) {
//			reversedword[index] = word.charAt(i);
//			index++;
//		}
//		System.out.println(reversedword);
//		String reverseString="";
//
//		String[] wordarray = word.split(" ");
//		for (int i = wordarray.length - 1; i >= 0; i--) {
//			reverseString = wordarray[i];
//			index++;
//		}
//		System.out.println(reverseString);

	}
}

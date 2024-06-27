package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SampleJavaTest {
	public static void main(String[] args) {
//https://magento.softwaretestingboard.com/checkout/#shipping
		// primenumbers up to 50
//		int num = 50;
//
//		for (int i = 2; i <= num; i++) {
//			boolean isprime = true;
//			for (int j = 2; j <= Math.sqrt(i); j++) {
//
//				if (i % j == 0) {
//					isprime = false;
//					break;
//				}
//
//			}
//			if (isprime) {
//				System.out.println(i);
//			}
//		}

		// swapping without usig 3rd variable

//		int num1 = 123;
//		int num2 = 234;
//
//		num1 = num1 + num2;
//		System.out.println(num1);
//		num2 = num1 - num2;
//		System.out.println("num2 " + num2);
//		num1 = num1 - num2;
//		System.out.println("num1 " + num1);

		// Array Initialition
		// int[] array = { 1, 2, 4, 0, 8, 4 };
		// Array initialization using new keyword
//		int[] arrayOne = new int[] { 2, 4, 5 };
//
//		int max = array[0];
//
//		for (int i = 0; i < array.length; i++) {
//
//			if (array[i] < max) {
//
//				max = array[i];
//
//			}
//
//		}
//		System.out.println(max);

		// To find prime number
//		int num = 29;
//		int isprime = 0;
//		if (num <= 1)
//			System.out.println("not prime");
//		for (int i = 2; i <= num / 2; i++) {
//			if (num % i == 0) {
//				isprime = 1;
//				break;
//			}
//
//		}
//		if (isprime == 0)
//			System.out.println(num + "is prime");
//		else
//			System.out.println("not a prime");

		// 2D array iteration

//		int[][] twodarray = { { 2, 4, 1 }, { 6, 4, 7 } };
//
//		for (int r1 = 0; r1 < twodarray.length; r1++) { // rows length ===2rows()2d array
//			for (int r2 = 0; r2 < twodarray[r1].length; r2++) { // number of columns ---3columns
//
//				if (r1 != r2)
//					System.out.println(twodarray[r1][r2]);
//			}
//
//		}

		// ###COMPARATOR AND COMPARABLE INTERFACES
//		List<Employee> empList = new ArrayList<>();
//		empList.add(new Employee(5, "ravi"));
//		empList.add(new Employee(1, "shivani"));
//		empList.add(new Employee(2, "priya"));
//
//		//Comparator<Employee> comparator = new CompImpl();
//		
//		Collections.sort(empList, (emp1, emp2) -> emp1.name.compareTo(emp2.name) );
//		
//		empList.forEach(System.out::println);

		// ##############NUmber PALINDROME

//		int num = 12356, result = 0;
//		int initial = num;
//		while (num > 0) {
//
//			int temp = num % 10;
//			result = (result * 10) + temp;
//			num = num / 10;
//		}
//
//		System.out.println(result);
//		if (initial == result)
//			System.out.println("palindrome");
//		else
//			System.out.println("not palindrome");



	}
}

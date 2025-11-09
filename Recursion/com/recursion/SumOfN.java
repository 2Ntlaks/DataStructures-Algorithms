package com.recursion;

import java.util.Scanner;

public class SumOfN {

	private static int sumOfN(int n) {
		if(n == 0)
			return 0;
		
		return n + sumOfN(n - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find sum of first N natural numbers:");
		int num = sc.nextInt();
		
		if(num < 0) {
			System.out.println("Please enter a positive number.");
		}
		else {
			int result = sumOfN(num);
			System.out.println("Sum of first " + num + " natural numbers is: " + result);
		}
	}
}

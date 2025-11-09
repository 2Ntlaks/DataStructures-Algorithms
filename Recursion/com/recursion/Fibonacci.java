package com.recursion;

import java.util.Scanner;

public class Fibonacci {

	private static int fibonacci(int n) {
		if(n <= 1)
			return n;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of terms in Fibonacci sequence:");
		int terms = sc.nextInt();
		
		if(terms <= 0) {
			System.out.println("Please enter a positive number.");
		}
		else {
			System.out.println("Fibonacci sequence:");
			for(int i = 0; i < terms; i++) {
				System.out.print(fibonacci(i) + " ");
			}
			System.out.println();
		}
	}
}

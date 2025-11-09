package com.recursion;

import java.util.Scanner;

public class ReverseString {

	private static String reverseString(String str) {
		if(str.isEmpty())
			return str;
		
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse:");
		String input = sc.nextLine();
		
		String reversed = reverseString(input);
		System.out.println("Reversed string: " + reversed);
	}
}

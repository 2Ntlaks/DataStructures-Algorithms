package com.recursion;

import java.util.Scanner;

public class ArraySum {

	private static int arraySum(int[] arr, int index) {
		if(index >= arr.length)
			return 0;
		
		return arr[index] + arraySum(arr, index + 1);
	}

	public static void main(String[] args) {
		int[] numbers = {5, 10, 15, 20, 25};
		
		System.out.println("Array elements:");
		for(int num : numbers) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		int sum = arraySum(numbers, 0);
		System.out.println("Sum of array elements: " + sum);
	}
}

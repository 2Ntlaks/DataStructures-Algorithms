package com.recursion;

import java.util.Scanner;

public class BinarySearchRecursive {

	private static int binarySearch(int[] arr, int key, int low, int high) {
		if(low > high)
			return -1;
		
		int mid = (low + high) / 2;
		
		if(arr[mid] == key)
			return mid;
		else if(arr[mid] > key)
			return binarySearch(arr, key, low, mid - 1);
		else
			return binarySearch(arr, key, mid + 1, high);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArray = {12, 24, 27, 35, 41, 60};
		
		System.out.println("Enter the element to be searched:");
		int key = sc.nextInt();
		
		int result = binarySearch(intArray, key, 0, intArray.length - 1);
		
		if(result == -1)
			System.out.println("Element not found.");
		else
			System.out.println("Element found at index " + result);
	}
}

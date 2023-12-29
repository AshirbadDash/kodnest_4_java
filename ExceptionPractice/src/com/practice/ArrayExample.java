package com.practice;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);

		// Ask the user to enter the size of the array
//		System.out.println("Enter the size of the array: ");
//		int size = scanner.nextInt();
		int size = 0;
		try {
			System.out.println("Enter the size of the array: ");
			size = scanner.nextInt();
		} catch (Exception e) {
			System.out.println("Error: InputMismatchException");
		}

		// Create an array of the specified size
		int[] numbers = new int[size];

		// Ask the user to enter the elements of the array
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Try to access an element at an index that is out of bounds
		try {
			System.out.println("Enter the index of the element you want to access: ");
			int index = scanner.nextInt();
			System.out.println("The element at index " + index + " is " + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds");
		}

		// Try to access an element at an index that is negative
		try {
			System.out.println("Enter the index of the element you want to access: ");
			int index = scanner.nextInt();
			System.out.println("The element at index " + index + " is " + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index out of bounds");
		}

		// Try to store a null element in the array
		try {
			System.out.println("Enter the element you want to store in the array: ");
			int element = scanner.nextInt();
			numbers[0] = element;
		} catch (NullPointerException e) {
			System.out.println("Error: NullPointerException");
		}

		// Try to access an element that has not been initialized
		try {
			System.out.println("Enter the index of the element you want to access: ");
			int index = scanner.nextInt();
			System.out.println("The element at index " + index + " is " + numbers[index]);
		} catch (NullPointerException e) {
			System.out.println("Error: NullPointerException");
		}
		scanner.close();
	}
}
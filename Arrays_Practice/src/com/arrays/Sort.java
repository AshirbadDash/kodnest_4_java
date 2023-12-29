package com.arrays;

import java.util.Scanner;

public class Sort {

	static boolean isSorted(int[] arr) {
		boolean check = true;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1]) {
				check = false;
				break;
			}
		}
		return check;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size = sc.nextInt();

		final int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("sorted array :" + isSorted(arr));

	}

}

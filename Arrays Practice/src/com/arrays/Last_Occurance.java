package com.arrays;

import java.util.Scanner;

public class Last_Occurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size = sc.nextInt();

		final int[] arr = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the element to be searched");
		final int x = sc.nextInt();
		System.out.println("LastOccurence of x :" + finder(arr, x));
		sc.close();

	}

	 public static int finder(int[] arr, int x) {
		int lastindex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				lastindex = i;

			}
		}
		return lastindex;

	}

}

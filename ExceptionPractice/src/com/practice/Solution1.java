package com.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution1 {
	public static void main(String[] args) {
		//** array declaration

		Scanner sc = new Scanner(System.in);
		
		//**
		try {
			System.out.println("Enter the size of array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("Enter the elements of array");
			for (int i = 0; i < size; i++) {
				arr[i] = sc.nextInt();
				System.out.println("Enter the index value to be displayed");
				int index = sc.nextInt();
				System.out.println("Element= " + arr[index]);

			}

		} catch (NegativeArraySizeException e1) {
			System.out.println("Enter the positive number for array size");

		} catch (InputMismatchException e2) {
			System.out.println("Enter only the digits");
		} catch (ArrayIndexOutOfBoundsException e3) {
			System.out.println("Enter the Index value in the range of 0 to size-1");
		} catch (Exception e) {

			e.printStackTrace();
		}

		sc.close();
	}

}

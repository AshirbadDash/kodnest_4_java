package com.practice;

import java.util.Scanner;

public class Shopnest {
	public static void main(String[] args) {
		try {
			
		} catch (Exception ex) {
			System.out.println("Enter money in Number");
			ex.printStackTrace();
		}

	}

	public static void shop() throws Exception {
		try {
			pay();
			System.out.println("Thank you for shopping");
		} catch (Exception ex) {
			System.out.println("Shopping not completed try again");
		}

	}

	public static void pay() {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter amount: ");
			int amt = scan.nextInt();
			System.out.println("Payment Sucessful - INR " + amt);
			scan.close();
		} catch (Exception ex) {
			System.out.println("Payment not completed!");
			throw ex;
		}

	}

}

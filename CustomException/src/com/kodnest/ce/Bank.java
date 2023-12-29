package com.kodnest.ce;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) { //3
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount for withdawl");
		int amount = sc.nextInt();
		try {
			withdraw(amount);
		} catch (MyException e) {
//			System.out.println(e);
			e.printStackTrace(); //Gives the complete info
		}
		sc.close();
	}

	 static void withdraw(int amount) throws MyException {// throws -->ducking ..... //2
//		throw-->re-throwing the exception
		int balance = 10000;
		if (amount > balance) {
			throw new MyException();//1
		}

		
	}

}

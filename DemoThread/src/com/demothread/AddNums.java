package com.demothread;

import java.util.Scanner;

public class AddNums extends Thread{

	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("The sum is " + sum);
		sc.close();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

}

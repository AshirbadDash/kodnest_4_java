package com.demothread;

public class MyMain {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd Numbers :"+i);
			}

		}
		
		Task1 task1 =new Task1();
		task1.start();

	}

}

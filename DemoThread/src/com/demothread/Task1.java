package com.demothread;

public class Task1 extends Thread {

	public void run() {
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("Even Numbers :" + i);
			}

		}
//		
//		Task1 task1 =new Task1();
//		task1.start();

	}

}

package com.kodnest.daemonthread;

public class Task1 extends Thread {

	Task1(String name) {
		super(name);

	}

	public void run() {

		for (int i = 0; i <= 10; i++) {
			System.out.println("typing....");
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}

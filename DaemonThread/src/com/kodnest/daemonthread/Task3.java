package com.kodnest.daemonthread;

public class Task3 extends Thread {
	Task3(String name) {
		super(name);

	}

	public void run() {
		for (;;) {
			System.out.println("Auto-Suggestion");
			try {
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
				

			}
		}
	}

}

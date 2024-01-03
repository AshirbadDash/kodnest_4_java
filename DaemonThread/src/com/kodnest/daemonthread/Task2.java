package com.kodnest.daemonthread;

public class Task2 extends Thread {
	Task2(String name) {
		super(name);

	}

	  public void run() {
		for (;;) {
			System.out.println("Auto-Correction");

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

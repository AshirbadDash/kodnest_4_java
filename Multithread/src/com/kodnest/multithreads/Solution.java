package com.kodnest.multithreads;

public class Solution extends Thread {

	public void run() {
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread());
		for (int i = 0; i <= 10; i++) {

			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

package com.kod.join_method;

public class Main {
	public static void main(String[] args) {
		System.out.println("main() start");
		Task1 task1 = new Task1();
		Thread thread = new Thread(task1);
		thread.start();
		try {
			thread.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main() stop");
	}

}

package com.kodnest.multithreads;

public class Program {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread.currentThread().setPriority(8);
		System.out.println("main() start");
		Solution solution = new Solution();
		solution.start();
		System.out.println("main() stop");

	}

}

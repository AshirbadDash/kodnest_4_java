package com.kodnest_prod_cons;

public class App {
	public static void main(String[] args) {
		Factory factory = new Factory();
		Producer producer = new Producer(factory);
		Consumer consumer = new Consumer(factory);
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		thread1.start();
		thread2.start();

	}

}

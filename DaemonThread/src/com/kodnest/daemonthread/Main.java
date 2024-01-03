package com.kodnest.daemonthread;

public class Main {
	public static void main(String[] args) {

		Task1 task1 = new Task1("typing");
		Task2 task2 = new Task2("autocorrection");
		Task3 task3 = new Task3("autosuggestion");

		task1.start();

		task2.setDaemon(true);
		task3.setDaemon(true);

		task2.setPriority(1);
		task3.setPriority(1);

		task2.start();
		task3.start();

	}

}

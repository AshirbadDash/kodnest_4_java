package com.demothread;

public class Threads {
	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);

////		using static 
//		PrintAlpha.run();
//		PrintNums.run();
//		AddNums.run();

//		using object 
//		
		PrintAlpha printAlpha = new PrintAlpha();
		printAlpha.setName("first-name");
		printAlpha.start();

		PrintNums printNums = new PrintNums();
		printNums.setName("second-name");
		printNums.start();

		AddNums addNums = new AddNums();
		addNums.start();

	}

}

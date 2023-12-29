package com.kodnest.ce;

public class MyException extends Exception {
	int a;
	public MyException() {
		super("Transaction failed due to insufficient balance");
	}

}

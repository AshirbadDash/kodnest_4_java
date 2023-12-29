package com.practice;

import java.io.IOException;

public class DuckingException {
	public static void main(String[] args) throws IOException {
		method1();

	}

	static void method1() throws IOException {
		method2();
	}

	static void method2() throws IOException {
		System.out.println(3 / 0);

	}
	// handling the exception using try-catch block ,Re-throwing the exception
	// ,ducking
	// the exception
	// exception always occour at runtimevgg
	// checked exception is a situation where compiler know there will be an
	// exception so it is giving alret before going to runtime/

}
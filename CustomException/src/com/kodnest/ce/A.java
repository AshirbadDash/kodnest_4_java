package com.kodnest.ce;

import java.io.IOException;

public class A {
	void display() throws IOException {
		System.out.println("Parent Class");
	}
}

class B extends A {
	void display() throws IOException {
		System.out.println("Child Class");
	}
}
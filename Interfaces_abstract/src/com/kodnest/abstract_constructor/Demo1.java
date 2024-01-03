package com.kodnest.abstract_constructor;
class Demo extends Solution {
	int z;

	void f3() {
	}

	void f2() {

	}

	@Override
	void f1() {
		// Implementation for f1 in Demo class
		z = 8;

	}

	Demo() {
		System.out.println("Child constructor");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(d1.x = 4);

	}
}

abstract class Solution {
	int x;
	int y;

	Solution() {
		// Constructor logic
		System.out.println("Parent constructor");
	}

	abstract void f1();

	void f2() {
		// Implementation for f2
		x = 5;
		y = 2;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
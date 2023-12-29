package com.kodnest.ce;

import java.io.IOException;

public class A {
	void display() {
		System.out.println("Parent Class");

	}
}
//checked exception are not premitted to be ducked by child as checked exception are already 
//checked by parent 

//unchecked exception can be ducked by overridden method

class B extends A {
	void display() throws IOException {
		System.out.println("Child Class");
`
	}

}

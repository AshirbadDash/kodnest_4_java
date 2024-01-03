package com.kod.interfaces;

public class Solution {

}

interface Demo {
	int x = 10; // by default it is public and static and final

	void f1();// by default it is public and abstract
	// we can define a function inside interface using static keyword
	// we can extend another interface to make it bigger
	// due to ambiguity multiple inheritance cannot be achieved by java but through
	// interface we can achieve.
	// constructor cannot be created in interface because the values needs to be
	// initialized instantly no need of constructor to initialize
	
	//static function cannot be inherited
	//so we can create a new function with same name 
	//static variables can be inherited
	
	

}
package com.pri.corejava.generics;
	
	/*
	 * Generic Example
	 * 
	 */

public class GenericExample<P> {

	public P p;
	
	// static constructor is not possible because the static is at class level and constructor is at object level
	// Hence static constructor does not make any sense.
	
	public GenericExample(P p) {
		this.p = p;
	}
	
	// Generic method
	public static <T> void testMethod(T max) {
		T s = max;
		System.out.println("Inside the test method "+s);
	}
	
	public static void main(String[] args) {

		// wrapper class 
		GenericExample<Integer> obj = new GenericExample<Integer>(34);
		System.out.println("variable "+obj.p);
		testMethod(3);
		
	}

}

package com.pri.corejava.collections;

	/*
	 * Immutable class example
	 * 
	 * write an immutable class.
	 * 1. Class should be declared final to stop inheritance
	 * 2. Methods need not be declared final since final class methods cannot be overridden
	 * 3. Variable are declared private and final and only initialized in the constructor
	 * 4. No need for setters since variables are final 
	 * 
	 */

public final class ImmutableClassExample {

	private final String w;
	private final int i;
	
	public void methodName() {
		System.out.println("update");
	}
	
	public ImmutableClassExample(int i, String w) {
		this.i = i;
		this.w = w;
	}
		
	public String getW() {
		return w;
	}

	public int getI() {
		return i;
	}
}

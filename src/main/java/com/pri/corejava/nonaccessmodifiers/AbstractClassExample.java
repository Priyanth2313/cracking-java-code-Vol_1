package com.pri.corejava.nonaccessmodifiers;

/*
 * Abstract class for implementing and displaying the shape and color
 * 
 */


public class AbstractClassExample extends AbstractClass{
	
	public AbstractClassExample(String color) {
		
		super(color);
		System.out.println("Inside non abstract class constructor");
	}
	
	public static void main(String[] args) {
		
		AbstractClass s1 = new AbstractClassExample("Green");
		System.out.println("shape: " + s1.shape());
		System.out.println("color: " + s1.color);
	}

	@Override
	public String shape() {
		String shape = "round";
		return shape;
	}
}

abstract class AbstractClass {

	String color;
	
	// abstract method
	public abstract String shape();

	// abstract class constructor
	public AbstractClass(String color) {
		System.out.println("Entered Abstract class Constructor");
		this.color = color;
	}
}

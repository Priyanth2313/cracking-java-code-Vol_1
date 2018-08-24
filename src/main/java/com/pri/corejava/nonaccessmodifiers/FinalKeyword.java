package com.pri.corejava.nonaccessmodifiers;

/* 
 * Non Access Modifier: Final 
 *  
 * Final Variable
 * 
 * The only difference between a normal variable and a final variable is that we can re-assign value to a normal variable 
 * but we cannot change the value of a final variable once assigned. 
 * Hence final variables must be used only for the values that we want to remain constant throughout the execution of program.
 * 
 * Final class cannot be extended hence used for blocking Inheritance
 * Final Method is used to stop the method overriding
 */

public class FinalKeyword {

	final static int i = 100;
	
	public static void main(String[] args) {
		final int a = 10;
		System.out.println("value of a " + a);
		System.out.println("value of i " + i);
	}	
}

package com.pri.corejava.variables;

/* Class/Static variables
 * These are declared with the static keyword in a class, but outside a method, constructor or block. 
 * Only a single copy of static variable can be created and can be re used in the class and its static methods.
 *
 * When declaring class variables as public static final, then variable names (constants) are all in upper case. 
 *
 */

public class StaticVariable {

	// salary  variable is a private static variable
	private static double salary;

	// DEPARTMENT is a constant
	public static final String DEPARTMENT = "Development ";

	public static void main(String args[]) {
		salary = 1000;
		System.out.println(DEPARTMENT + "average salary:" + salary);
	}
}
package com.pri.corejava.variables;

/**
 * Local variables: 
 * These are created when the method, constructor or block is entered and the variable 
 * will be destroyed once it exits the method, constructor, or block. 
 * No access modifiers and initial value should be assigned when declared.
 *
 */
public class LocalVariables 
{
	public void pupAge() {
		int age = 0; // Local variables
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		LocalVariables test = new LocalVariables();
		test.pupAge();
	}
}

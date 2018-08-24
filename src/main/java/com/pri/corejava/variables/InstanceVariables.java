package com.pri.corejava.variables;

/* Instance variables 
 * are declared in a class, but outside a method, constructor or any block. 
 * Created when 'new' is used.  Access modifiers can be used. 
 * These have default value and are declared in class level so can be accessed by the class members.
 */

public class InstanceVariables {

	// this instance variable is visible for any child class.
	public String name;

	
	// salary variable is visible in InstanceVariable class only.
	private double salary;

	
	// The name variable is assigned in the constructor.
	public InstanceVariables(String empName) {
		name = empName;
	}

	// The salary variable is assigned to a value.
	public void setSalary(double empSal) {
		salary = empSal;
	}

	// This method prints the employee details.
	public void printEmp() {
		System.out.println("name  : " + name );
		System.out.println("salary : $" + salary);
	}

	public static void main(String args[]) {
		InstanceVariables empOne = new InstanceVariables("Priyanth");
		empOne.setSalary(10000);
		empOne.printEmp();
	}
}

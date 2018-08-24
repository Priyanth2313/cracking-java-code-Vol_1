package com.pri.corejava.oopconcepts;

	/*
	 * Encapsulation: hiding the data
	 * 
	 * Sub concept for encapsulation is getters and setters; 
	 * this is used when the class variables are declared private but can flexibly reuse the variables again for various purposes
	 * 
	 */

public class encapsulation {

	private String name;
	private int Age;

	public static void main(String[] args) {
		encapsulation e = new encapsulation();
		e.Age = 25;
		e.name = "Priyanth";
		System.out.println(e.Age + e.name);

	}

	// Accessors
	public String getName() {
		return name;
	}

	// mutators
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
}

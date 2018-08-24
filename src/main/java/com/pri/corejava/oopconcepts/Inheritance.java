package com.pri.corejava.oopconcepts;

	/*
	 * Got to know and used in this program
	 * 
	 * - how to use encapsulated variables with specific access modifiers
	 * - Static methods and variables can only be accessed inside the static methods; static reference
	 * - super is used to initialize variables from the superclass and not its methods
	 * - we can initialize variable values in constructors but cannot use it in static method or driver class we have to initialize 
	 *   the superclass variable again
	 * 
	 */

public class Inheritance extends Exampleclass{

	int carAge;
	String carType;
	
	public Inheritance (int carAge, String carType) {
		super.carDisplacement = carDisplacement;
		super.carName = carName;
		this.carAge = carAge;
		this.carType = carType;
	}
	
	public static void main(String[] args) {
		Exampleclass carSelected = new Exampleclass();
		Exampleclass carHealth = new Inheritance(4, "Coupe");
		
		carHealth.carInsurance();
		carSelected.carInsurance();
		carSelected.carName = "Jaguar";
		System.out.println("The car we get is "+ carSelected.carName + " and the model is "+ Type() +" with insurance " +carHealth.carInsurance());
	}

	@Override
	public boolean carInsurance() {
		if (carAge > 5) return false;
		return true;
	}
	
	public static String Type() {
		return "F-type";
	}
}


package com.pri.corejava.oopconcepts;

	/*
	 * Polymorphism
	 * 
	 * Static Polymorphism: Method Overloading or compile time polymorphism contributes to the static polymorphism
	 * and Dynamic polymorphism: Method Overriding or run time polymorphism contributes to the dynamic polymorphism
	 * 
	 * 
	 */

public class Polymorphism extends Exampleclass{
	//method overloading example
	public void staticPoly(char c)
    {
         System.out.println(c);
    }
    public void staticPoly(char c, int num)  
    {
         System.out.println(c + " " +num);
    }
    
    // method overriding example
    public boolean carInsurance() {
    	return true;
    }

	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		Exampleclass obj2 = new Exampleclass();
		obj.staticPoly('f');
		obj.staticPoly('e', 3);
		System.out.println("Override output " + obj.carInsurance());
		System.out.println("Override output for exampleclass " +obj2.carInsurance());
	}
	
}

package com.pri.corejava.DatatypeClasses;

	/*
	 * Integer Class and its methods
	 */

public class IntegerExample {

	public static void main(String[] args) {
		// parseInt converts string to integer
		int decimalExample = Integer.parseInt("20");
		int signExample = Integer.parseInt("-200");
		// parses integer based on the radix
		int radixExample = Integer.parseInt("23", 20);
		// Converts integer to the string
		String stringConvert = Integer.toString(34);
		long longInt = Long.parseLong("2434308380320832434");
		
		System.out.println(decimalExample);
		System.out.println(signExample);
		System.out.println(radixExample);
		System.out.println(stringConvert);
		System.out.println(longInt);
	}
}

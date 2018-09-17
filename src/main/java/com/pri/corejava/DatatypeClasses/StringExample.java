package com.pri.corejava.DatatypeClasses;

	/*
	 * Various implementations of String class and its in built methods
	 * 
	 * 
	 */

public class StringExample {

	// Using ByteArray reverse a string
	public String reverseStr(String input) {
		byte[] byteArrayStr = input.getBytes();
		byte [] result = new byte [byteArrayStr.length];
			for (int i = 0; i<byteArrayStr.length; i++) {
				result[i] = byteArrayStr[byteArrayStr.length-i-1];
			}
			return new String(result);
	}
	
	// Using StringBuilder reverse a string
	public StringBuilder reverseStrbuild(String inputString) {
		StringBuilder input = new StringBuilder();
		input.append(inputString);
		input = input.reverse();
		return input;
	} 
	
	
	public static void main(String[] args) {
		String myStr = "Priyanth and Raveerna";
		
		StringExample objStr = new StringExample();
		System.out.println(objStr.reverseStr(myStr));
		System.out.println(objStr.reverseStrbuild(myStr));
	}

}

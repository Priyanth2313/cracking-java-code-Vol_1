package com.pri.corejava.exceptions;

import java.io.*;

public class ExceptionThrowsExample extends Exception{

	/**
	 * 
	 * Throws, throw keyword and custom exception
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	static int[] arr = {2, 3, 5};
	
	public static void newOne() throws ArrayIndexOutOfBoundsException{
		for(int i = 0; i <= arr.length; i++) {
			System.out.println("Display"+ arr[i]);
		}
	}
	
	public static void main(String[] args) {
		try {
			newOne();
			throw new IOException();
		}
		catch (IOException e) {
			System.out.println("caught IOException for throw");
		}
		
//		catch (ExceptionThrowsExample f) {
//			System.out.println("thrown exception"+f.getMessage());
//		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("caught Array exception");
		} 
		
		// for handling the thrown exception
		
	}
}

package com.pri.corejava.collections;

import java.util.Scanner;

	/*
	 * Array Example
	 */

public class Array {

	public int[] arr1;
	double[] arr2;
	float[] arr3;
	private char[] arr4 = new char[3];
	private short[] arr5 = new short[3];
	
	// constructor
	public Array() {
		this.arr1 = new int[4];
		this.arr2 = new double[3];
		this.arr3 = new float[2];
	}
	
	// method to add two arrays
	public void addArrays(int[] arr6, int[] arr7) {
		for(int i = 0; i < arr6.length; i++) {
			System.out.println("loop" +i);
		}
	}
	
	// to return an array always loop over the elements of the reference array object
	public void demo(int[] input) {
		System.out.println("Array values are : ");
		for(int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}
	
	// Main class
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		int[] customArray = new int[4];
		System.out.println("Enter the array values");
		for(int i = 0; i < 4; i++) {
			customArray[i] = myInput.nextInt();
		}
		System.out.println("Entered Array is " +customArray.length);
		
		// can be passed as parameters to the constructor
		Array arrObj = new Array();
		
		arrObj.demo(customArray);
		myInput.close();
	}

	public char[] getArr4() {
		return arr4;
	}

	public void setArr4(char[] arr4) {
		this.arr4 = arr4;
	}

	public short[] getArr5() {
		return arr5;
	}

	public void setArr5(short[] arr5) {
		this.arr5 = arr5;
	}
}

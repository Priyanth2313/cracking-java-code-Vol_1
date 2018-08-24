package com.pri.corejava.exceptions;

	/*
	 * Exceptional Handling
	 * 
	 * Swap two arrays and demonstrate exceptions with multiple try catch block
	 */

public class ExceptionHandlingExample {

	int[] arr = new int[] {1,2,3,4};
	int[] newarr = new int[] {5,6,7,8};
	int[][] newdimension = {{2,3},{2,5,7,},{9,3,6}};

	public int ArraySwap() {
		try {
			int[] buffer = arr;
			arr = newarr;
			newarr = buffer;
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(newarr[i]);
			}
			System.out.println("inside try");
		}
		catch(NullPointerException e) {
			System.out.println("Caught the Null Exception");
		}

		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught the Array Exception");
		}
		return 0;
	}

	public static void main (String[] args){
		ExceptionHandlingExample arrObj = new ExceptionHandlingExample();
		arrObj.ArraySwap();
	}
}

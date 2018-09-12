package com.pri.corejava.collections.list;

import java.util.ArrayList;

	/*
	 * ArrayList example 
	 */

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Tom");
		arrList.add("Rupert");
		arrList.add("Harry");
		arrList.add("Hermoine");
		arrList.add("Hagrid");
		
		// iterating using for each
		for(String i: arrList) {
			System.out.println(i);
		}
	}
}

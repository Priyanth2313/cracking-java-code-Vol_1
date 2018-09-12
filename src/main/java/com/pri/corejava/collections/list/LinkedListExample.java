package com.pri.corejava.collections.list;

import java.util.Collections;
import java.util.LinkedList;

	/*
	 * Linked List example
	 */

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> lList = new LinkedList<String>();
		lList.add("Tom");
		lList.add("Rupert");
		lList.add("Harry");
		lList.add("Hermoine");
		lList.add("Hagrid");
		// allows duplicates and null values
		lList.add("");
		lList.add("Hagrid");
		
		Collections.sort(lList, Collections.reverseOrder());
		
		// iterating using for each
		for(String i: lList) {
			System.out.println(i);
		}
	}
}

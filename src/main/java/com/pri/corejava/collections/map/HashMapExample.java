package com.pri.corejava.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

	/*
	 * HashMap example
	 */

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hashObj = new HashMap<String, Integer>();
		
		hashObj.put("P", 3);
		hashObj.put("A", 23);
		hashObj.put("R", 24);
		hashObj.put("M", 27);
		// no duplicate keys are considered
		hashObj.put("M", 27);
		// but duplicate values with different keys are considered
		hashObj.put("N", 27);
		// null values are entertained whereas only null key is accepted
		hashObj.put("", 55);
		hashObj.put("", null);
		hashObj.put("O", null);
		// same keys with different values inserted later into the map have overridden values
		hashObj.put("P", 32);
		
		Iterator<Map.Entry<String, Integer>> iter = hashObj.entrySet().iterator();
		System.out.println("Iteration using iterator method");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Iteration using for each method");
		for(Map.Entry<String, Integer> i: hashObj.entrySet()) {
			System.out.println(i);
		}
	}
}

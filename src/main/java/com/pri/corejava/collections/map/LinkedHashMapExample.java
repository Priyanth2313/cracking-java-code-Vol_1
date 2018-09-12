package com.pri.corejava.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

	/*
	 * LinkedHashMap example
	 */

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> objLink	= new LinkedHashMap<Integer, Integer>();
		objLink.put(23, 200000);
		objLink.put(22, 30000);
		objLink.put(12, null);
		objLink.put(null, null);
		// can accept only one null key value
		objLink.put(null, null);
		
		// maintains insertion order
		System.out.println("Traversal using foreach");
		for (Map.Entry<Integer, Integer> i : objLink.entrySet()) {
			System.out.println(i);
		}
		System.out.println("Traversal using iterator");
		Iterator<Map.Entry<Integer, Integer>> itr = objLink.entrySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

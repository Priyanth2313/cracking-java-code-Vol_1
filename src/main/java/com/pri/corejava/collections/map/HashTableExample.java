package com.pri.corejava.collections.map;

import java.util.Enumeration;
import java.util.Hashtable;

/*
	 * HashTable Example
	 */

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> obj = new Hashtable<Integer, String>();
		
		obj.put(23, "P");
		obj.put(45, "D");
		obj.put(40, "M");
		obj.put(21, "B");
		
		
		// enumeration used for hashtable
		Enumeration<String> eobj = obj.elements();
		while (eobj.hasMoreElements()) {
			System.out.println(eobj.nextElement());
		}
	}

}

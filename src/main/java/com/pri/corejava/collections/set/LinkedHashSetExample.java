package com.pri.corejava.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
	 * LinkedHashSet example
	 */

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> linkObj = new LinkedHashSet<String>();
		
		
		// linkedhashset preserves the insertion order
		linkObj.add("");
		linkObj.add("P");
		linkObj.add("S");
		linkObj.add("M");
		
		Iterator<String> itr = linkObj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

package com.pri.corejava.collections.set;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

	/*
	 * TreeSet example with some methods operations and also the tree set should be synchronized
	 */

public class TreeSetExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		TreeSet<String> tset = new TreeSet<String>();
		// synchronizing the treeset
		Set<String> syncSet = Collections.synchronizedSet(tset);
		
		syncSet.add("Shymala");
		syncSet.add("kaushal");
		syncSet.add("Geetha");
		// duplicates will not get inserted and null values are allowed
		syncSet.add("Sanjana");
		syncSet.add("Sanjana");
		syncSet.add("");
		
		System.out.println(syncSet);
		System.out.println("is the set empty? "+syncSet.isEmpty());
		
		for(String i: syncSet) {
			System.out.println(i);
		}
		
		// clone treeSet object and iterate over the treeset object
		TreeSet<String> clonedSet = new TreeSet<String>();
		clonedSet = (TreeSet<String>)tset.clone();
		
		Iterator<String> itr = clonedSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

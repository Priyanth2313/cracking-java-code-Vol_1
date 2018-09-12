package com.pri.corejava.collections.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

	/*
	 * Vector Example with Enumeration, ListIterator, advanced for/for loop
	 */

public class VectorExample {
	
	public static void main(String[] args) {
		
		// vector syntax
		Vector<String> vec = new Vector<String>();
		vec.addElement("GTS");
		vec.addElement("GTR");
		vec.addElement("GTB");
		vec.add("Priyanth");
		// allows duplicates and null
		vec.add("");
		vec.add("Priyanth");
		
		System.out.println("Size is "+vec.size());
		System.out.println("Size increment "+vec.capacity());
		
		// iterating over vector
		System.out.println("for loop iterator");
		for(String i: vec) {
			System.out.println(i);
		}
		// enumeration over vector
		Enumeration<String> en = vec.elements();
		System.out.println("Enumeration Iterator");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		// ListIterator over vector
		ListIterator<String> listVec = vec.listIterator();
		// correct order of insertion
		while(listVec.hasNext()) {
			System.out.println(listVec.next());
		}
		// reverse order of insertion
		System.out.println("Reverse insertion order using ListIterator");
		while(listVec.hasPrevious()) {
			System.out.println(listVec.previous());
		}
		
		// convert vector to arraylist
		ArrayList<String> arrList = new ArrayList<String>(vec);
		Iterator<String> arrIt = arrList.iterator();
		System.out.println("Print vector into Arraylist");
		while( arrIt.hasNext()) {
			System.out.println(arrIt.next());
		}
		
		// iterator over vector
		System.out.println("Print vector list after remove()");
		Iterator<String> listIt = vec.iterator();
		while(listIt.hasNext()) {
			String i = listIt.next();
			if (i == "Priyanth") {
				listIt.remove();
			}
			System.out.println(listIt.next());
		}
	}
}

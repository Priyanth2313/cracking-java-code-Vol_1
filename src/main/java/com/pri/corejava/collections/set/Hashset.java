package com.pri.corejava.collections.set;

import java.util.HashSet;

	/*
	 * HashSet
	 */

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> setHashObj = new HashSet<String>();
		setHashObj.add("");
		setHashObj.add("Priyanth");
		setHashObj.add("Raveer");
		setHashObj.add("Kankan");
		setHashObj.add("Kankan"); // duplicate values will be not repeated
		
		for(String i: setHashObj) {
			System.out.println(i);
		}
	}
}

package com.pri.corejava.collections.set;

import java.util.HashSet;

	/*
	 * HashSet
	 */

public class Hashset {

	public static void main(String[] args) {
		HashSet<String> setHashObj = new HashSet<String>();
		setHashObj.add("");
		setHashObj.add("P");
		setHashObj.add("R");
		setHashObj.add("K");
		setHashObj.add("K"); // duplicate values will be not repeated
		
		for(String i: setHashObj) {
			System.out.println(i);
		}
	}
}

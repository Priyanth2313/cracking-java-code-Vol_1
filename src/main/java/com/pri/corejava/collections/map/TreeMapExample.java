package com.pri.corejava.collections.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

	/*
	 * TreeMap Example
	 */

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> objTree = new TreeMap<String, Integer>();
		objTree.put("LM 550", 350000);
		objTree.put("Apollo", 1230000);
		objTree.put("350GT", 10030000);
		objTree.put("LanEvo", 55000);
		objTree.put("divo", 3000000);
		// treemap doesnot allow null keys as it compareTo() throws NullpointerException
//		 objTree.put(null, 23);

		Iterator<Map.Entry<String, Integer>> itr = objTree.entrySet().iterator();
		System.out.println("-------TreeMap Iterate Traversal------");
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		System.out.println("-------TreeMap For Traversal--------");	
		for(Map.Entry<String, Integer> i: objTree.entrySet()) {
			System.out.println(i);
		}
	}
}

package com.pri.corejava.otherTopics;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

	/*
	 * Exam 2 for second revision
	 */

public class Exam2 {
	
	// Immutable Class Example
	public final class Immune {
		final int i;
		final String y;
		
		public <K> void methodnew() {
			System.out.println();
		}
		
		public Immune (int i, String y) {
			this.i = i;
			this.y = y;
		}

		public int getI() {
			return i;
		}

		public String getY() {
			return y;
		}
	}
	
	// array declaration
	static int [] arr = { 1, 2, 3};
	

	public static void main(String[] args) {
		
		// traversing over a static array
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		// all collections
		// list (Arraylist, Array, LinkedArrayList, Vector)
		
		System.out.println("_______                             ___________       _____ ");
		System.out.println("___    |___________________ _____  ____  /___(_)________  /_");
		System.out.println("__  /| |_  ___/_  ___/  __ `/_  / / /_  / __  /__  ___/  __/");
		System.out.println("_  ___ |  /   _  /   / /_/ /_  /_/ /_  /___  / _(__  )/ /_  ");
		System.out.println("/_/  |_/_/    /_/    |__,_/|___,/ /_____/ /_/ |/____/|____/ ");
		System.out.println("                            /____/                          \n");
		
	// arraylist
		ArrayList<Integer> obj_arrlist = new ArrayList<Integer>();
		obj_arrlist.add(5);
		obj_arrlist.add(4);
		obj_arrlist.add(3);
		obj_arrlist.add(2);
		obj_arrlist.add(1);
		obj_arrlist.add(null);
		
		// looping over arraylist object
			// iterator
		Iterator<Integer> itr_arrlist = obj_arrlist.iterator();
		System.out.println("-------arraylist iterator looping");
		while(itr_arrlist.hasNext()) {
			System.out.println(itr_arrlist.next());
		}
			// foreach
		System.out.println("-------For each arraylist");
		for(Integer i: obj_arrlist) {
			System.out.println(i);
		}

		System.out.println("Y8b Y88888P                    d8                    ");
		System.out.println(" Y8b Y888P   ,e e,   e88'888  d88    e88 88e  88888  ");
		System.out.println("  Y8b Y8P   d88 88b d888  '8 d88888 d888 888b 888    ");
		System.out.println("   Y8b Y    888   , Y888   ,  888   Y888 888P 888    ");
		System.out.println("    Y8P      'YeeP'  '88',e8  888    '88 88'  888    \n");

	// Vector
		Vector<Integer> obj_vector = new Vector<Integer>();
		obj_vector.add(5);
		obj_vector.add(4);
		obj_vector.add(3);
		obj_vector.add(2);
		obj_vector.add(1);
		obj_vector.add(null);
		
		// looping over vector object
			// iterator
		Iterator<Integer> itr_vector = obj_vector.iterator();
		System.out.println("------Iterator vector");
		while(itr_vector.hasNext()) {
			System.out.println(itr_vector.next());
		}
			// enumeration
		Enumeration<Integer> enum_vector = obj_vector.elements();
		System.out.println("-------Enumeration vector");
		while(enum_vector.hasMoreElements()) {
			System.out.println(enum_vector.nextElement());
		}
			// for advanced
		System.out.println("-------For each vector");
		for(Integer i : obj_vector) {
			System.out.println(i);
		}
		
		System.out.println( " __    _     _ _______ _ __    _ ___ _   \r\n" +
							"|  |  |_|___| |_ ___ _| |  |  |_|___| |_ \r\n" + 
							"|  |__| |   | '_| -_| . |  |__| |_ -|  _|\r\n" + 
							"|_____|_|_|_|_,_|___|___|_____|_|___|_|  \n");

	// LinkedList
		LinkedList<Integer> obj_linkedList = new LinkedList<Integer>();
		obj_linkedList.add(5);
		obj_linkedList.add(4);
		obj_linkedList.add(3);
		obj_linkedList.add(2);
		obj_linkedList.add(1);
		obj_linkedList.add(null);
		
		// looping over linked list
			// iterator
		Iterator<Integer> itr_linkedList = obj_linkedList.iterator();
		System.out.println("-------Iterator linkedList");
		while(itr_linkedList.hasNext()) {
			System.out.println(itr_linkedList.next());
		}
			// for hashset
		System.out.println("-------for advacned linkedlist");
		for(Integer i : obj_linkedList) {
			System.out.println(i);
		}
		
		System.out.println("\r\n" + 
				"dP                         dP                           dP   \r\n" + 
				"88                         88                           88   \r\n" + 
				"88d888b. .d8888b. .d8888b. 88d888b. .d8888b. .d8888b. d8888P \r\n" + 
				"88'  `88 88'  `88 Y8ooooo. 88'  `88 Y8ooooo. 88ooood8   88   \r\n" + 
				"88    88 88.  .88       88 88    88       88 88.  ...   88   \r\n" + 
				"dP    dP `88888P8 `88888P' dP    dP `88888P' `88888P'   dP   \r\n");
		
	// Set (HashSet , TreeSet, LinkedHashSet, EnumSet)
	// HashSet
		HashSet<Integer> obj_hashset = new HashSet<Integer>();
		obj_hashset.add(5);
		obj_hashset.add(4);
		obj_hashset.add(3);
		obj_hashset.add(2);
		obj_hashset.add(4);
		obj_hashset.add(1);
		obj_hashset.add(null);
		
		// looping hashset
			// iterator
		Iterator<Integer> itr_hashset = obj_hashset.iterator();
		System.out.println("------iterator hashset");
		while(itr_hashset.hasNext()) {
			System.out.println(itr_hashset.next());
		}
			// foreach hashset
		System.out.println("-------for advanced hashset");
		for(Integer i : obj_hashset) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
					   + "  dP                                                  dP   \r\n" + 
						 "  88                                                  88   \r\n" + 
						 "d8888P 88d888b. .d8888b. .d8888b. .d8888b. .d8888b. d8888P \r\n" + 
						 "  88   88'  `88 88ooood8 88ooood8 Y8ooooo. 88ooood8   88   \r\n" + 
						 "  88   88       88.  ... 88.  ...       88 88.  ...   88   \r\n" + 
					     "  dP   dP       `88888P' `88888P' `88888P' `88888P'   dP   \r\n");
	// treeset
		TreeSet<Integer> obj_treeSet = new TreeSet<Integer>();
		obj_treeSet.add(5);
		obj_treeSet.add(4);
		obj_treeSet.add(3);
		obj_treeSet.add(2);
		obj_treeSet.add(3);
		obj_treeSet.add(1);
	//null values not allowed in treeset	
//		obj_treeSet.add(null);
	
	// looping treeSet	
		// iterator treeset
		Iterator<Integer> itr_treeset = obj_treeSet.iterator();
		System.out.println("------iterator treeset");
		while(itr_treeset.hasNext()) {
			System.out.println(itr_treeset.next());
		}
		
		// foreach treeset
		System.out.println("-------for advanced treeset");
		for(Integer i : obj_treeSet) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
			  + "dP oo          dP                      dP dP                         dP                           dP   \r\n" + 
				"88             88                      88 88                         88                           88   \r\n" + 
				"88 dP 88d888b. 88  .dP  .d8888b. .d888b88 88d888b. .d8888b. .d8888b. 88d888b. .d8888b. .d8888b. d8888P \r\n" + 
				"88 88 88'  `88 88888\"   88ooood8 88'  `88 88'  `88 88'  `88 Y8ooooo. 88'  `88 Y8ooooo. 88ooood8   88   \r\n" + 
				"88 88 88    88 88  `8b. 88.  ... 88.  .88 88    88 88.  .88       88 88    88       88 88.  ...   88   \r\n" + 
				"dP dP dP    dP dP   `YP `88888P' `88888P8 dP    dP `88888P8 `88888P' dP    dP `88888P' `88888P'   dP   \r\n");
		
		// Linkedhashset
		LinkedHashSet<Integer> obj_linkedHashset = new LinkedHashSet<Integer>();
		obj_linkedHashset.add(5);
		obj_linkedHashset.add(4);
		obj_linkedHashset.add(3);
		obj_linkedHashset.add(2);
		obj_linkedHashset.add(2);
		obj_linkedHashset.add(1);
		obj_linkedHashset.add(null);
		
	// looping linkedHashSet	
		// iterator linkedhashet
		Iterator<Integer> itr_linkedHashset = obj_linkedHashset.iterator();
		System.out.println("------iterator linkedHashset");
		while(itr_linkedHashset.hasNext()) {
			System.out.println(itr_linkedHashset.next());
		}
		
		// foreach linkedHashset
		System.out.println("-------for advanced linkedHashset");
		for(Integer i : obj_linkedHashset) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
			   +"dP                         dP                                    \r\n" + 
				"88                         88                                    \r\n" + 
				"88d888b. .d8888b. .d8888b. 88d888b. 88d8b.d8b. .d8888b. 88d888b. \r\n" + 
				"88'  `88 88'  `88 Y8ooooo. 88'  `88 88'`88'`88 88'  `88 88'  `88 \r\n" + 
				"88    88 88.  .88       88 88    88 88  88  88 88.  .88 88.  .88 \r\n" + 
				"dP    dP `88888P8 `88888P' dP    dP dP  dP  dP `88888P8 88Y888P' \r\n" + 
				"                                                        88       \r\n" + 
				"                                                        dP      \r\n");
		// hashmap
		HashMap<String, Integer> obj_hashmap = new HashMap<String, Integer>();
		obj_hashmap.put("E", 5);
		obj_hashmap.put("D", 4);
		obj_hashmap.put("C", 3);
		obj_hashmap.put("B", 2);
		obj_hashmap.put("A", 1);
		obj_hashmap.put("", null);
		obj_hashmap.put("$", 4);
		
		// looping hashmap	
		// iterator hashmap
		Iterator<Map.Entry<String, Integer>> itr_hashmap = obj_hashmap.entrySet().iterator();
		System.out.println("------iterator hashmap");
		while(itr_hashmap.hasNext() ) {
			System.out.println(itr_hashmap.next());
		}
		
		// foreach hashmap
		System.out.println("-------for advanced hashmap");
		for(Map.Entry<String, Integer> i: obj_hashmap.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
				+" dP                                                           \r\n" + 
				"  88                                                           \r\n" + 
				"d8888P 88d888b. .d8888b. .d8888b. 88d8b.d8b. .d8888b. 88d888b. \r\n" + 
				"  88   88'  `88 88ooood8 88ooood8 88'`88'`88 88'  `88 88'  `88 \r\n" + 
				"  88   88       88.  ... 88.  ... 88  88  88 88.  .88 88.  .88 \r\n" + 
				"  dP   dP       `88888P' `88888P' dP  dP  dP `88888P8 88Y888P' \r\n" + 
				"                                                      88       \r\n" + 
				"                                                      dP \r\n");
		
		// treemap
		TreeMap<String, Integer> obj_treemap = new TreeMap<String, Integer>();
		obj_treemap.put("E", 5);
		obj_treemap.put("D", 4);
		obj_treemap.put("C", 3);
		obj_treemap.put("B", 2);
		obj_treemap.put("A", 1);
		obj_treemap.put("", null);
		obj_treemap.put("$", 4);
		
		// looping over treemap
		// iterator on treemap
		Iterator<Map.Entry<String, Integer>> itr_treemap = obj_treemap.entrySet().iterator();
		System.out.println("-------Iterator on treemap");
		while(itr_treemap.hasNext()) {
			System.out.println(itr_treemap.next());
		}
		
		// advanced for treemap
		System.out.println("--------advanced for treemap");
		for(Map.Entry<String, Integer> i : obj_treemap.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
		+ 	"dP                         dP         dP            dP       dP          \r\n" + 
			"88                         88         88            88       88          \r\n" + 
			"88d888b. .d8888b. .d8888b. 88d888b. d8888P .d8888b. 88d888b. 88 .d8888b. \r\n" + 
			"88'  `88 88'  `88 Y8ooooo. 88'  `88   88   88'  `88 88'  `88 88 88ooood8 \r\n" + 
			"88    88 88.  .88       88 88    88   88   88.  .88 88.  .88 88 88.  ... \r\n" + 
			"dP    dP `88888P8 `88888P' dP    dP   dP   `88888P8 88Y8888' dP `88888P' \r\n" );
		
		// hashtable
		Hashtable<String, Integer> obj_hashtable = new Hashtable<String, Integer>();
		obj_hashtable.put("E", 5);
		obj_hashtable.put("D", 4);
		obj_hashtable.put("C", 3);
		obj_hashtable.put("B", 2);
		obj_hashtable.put("A", 1);
		// hashtable doesnot accept null values
//		obj_hashtable.put("", null);
		obj_hashtable.put("$", 4);
		
		// enumeration for hashtable
		System.out.println("--------Enumeration for hashtable");
		Enumeration<Integer> enumHash = obj_hashtable.elements();
		while(enumHash.hasMoreElements()) {
			System.out.println(enumHash.nextElement());
		}
		
		// iterator for hashtable
		System.out.println("--------Iterator for hashtable");
		Iterator<Entry<String, Integer>> itr_hash = obj_hashmap.entrySet().iterator();
		while(itr_hash.hasNext()) {
			System.out.println(itr_hash.next());
		}
		
		// for advanced for hashtable
		System.out.println("--------Advanced for loop");
		for(Entry<String, Integer> i : obj_hashtable.entrySet()) {
			System.out.println(i);
		}
		
		System.out.println("\r\n"
			+ 	"dP oo          dP                      dP dP     dP                    dP       8888ba.88ba                    \r\n" + 
				"88             88                      88 88     88                    88       88  `8b  `8b                   \r\n" + 
				"88 dP 88d888b. 88  .dP  .d8888b. .d888b88 88aaaaa88a .d8888b. .d8888b. 88d888b. 88   88   88 .d8888b. 88d888b. \r\n" + 
				"88 88 88'  `88 88888\"   88ooood8 88'  `88 88     88  88'  `88 Y8ooooo. 88'  `88 88   88   88 88'  `88 88'  `88 \r\n" + 
				"88 88 88    88 88  `8b. 88.  ... 88.  .88 88     88  88.  .88       88 88    88 88   88   88 88.  .88 88.  .88 \r\n" + 
				"dP dP dP    dP dP   `YP `88888P' `88888P8 dP     dP  `88888P8 `88888P' dP    dP dP   dP   dP `88888P8 88Y888P' \r\n" + 
				"                                                                                                      88       \r\n" + 
				"                                                                                                      dP  \r\n");
		
		// Linkedhashmap
		LinkedHashMap<String, Integer> obj_linkedHashMap = new LinkedHashMap<String, Integer>();
		obj_linkedHashMap.put("E", 5);
		obj_linkedHashMap.put("D", 4);
		obj_linkedHashMap.put("C", 3);
		obj_linkedHashMap.put("B", 2);
		obj_linkedHashMap.put("A", 1);
		obj_linkedHashMap.put("A", 1);
		obj_linkedHashMap.put("", null);
		
		// looping over linkedHashMap
		// Iterator on linkedHashMap
		System.out.println("--------Iterator on linkedHashmap");
		Iterator<Map.Entry<String, Integer>> itr_linkedHashMap = obj_linkedHashMap.entrySet().iterator();
		while(itr_linkedHashMap.hasNext()) {
			System.out.println(itr_linkedHashMap.next());
		}
		
		// for advanced on linkedHashMap
		System.out.println("-------for advanced on linkedhashmap");
		for(Entry<String, Integer> i : obj_linkedHashMap.entrySet()) {
			System.out.println(i);
		}
	}
}

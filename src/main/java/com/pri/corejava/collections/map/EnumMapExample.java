package com.pri.corejava.collections.map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

public class EnumMapExample {

	public enum Example {
		Priyanth ("boy"),
		Happy ("girl"),
		Excited ("girl");
		
		private final String name;
		
		Example(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
	
	public static void main(String[] args) {
		Example obj = Example.Priyanth;
		
		EnumMap<Example, String> objenum = new EnumMap<Example, String>(Example.class);
		objenum.put(obj, "Priyanth");
		objenum.put(Example.Happy, "Priyanth");
		objenum.put(Example.Excited, "Priyanth");

		
		Iterator<Map.Entry<Example, String>> itr = objenum.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}		
	}
}

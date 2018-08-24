package com.pri.corejava.otherTopics;

	/*
	 * Clone() method of object class implementation example
	 * 
	 */

public class CloneExample implements Cloneable {

	String lang;
	double version;
	
	public CloneExample(String lang, double version) {
		this.lang = lang;
		this.version = version;
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneExample obj = new CloneExample("Java", 1.12);
		System.out.println(obj.lang);
		try {
			CloneExample objClone = (CloneExample) obj.clone();
			System.out.println(objClone.lang + objClone.version);
		}
		finally {
			System.out.println("done");
		}

	}

}

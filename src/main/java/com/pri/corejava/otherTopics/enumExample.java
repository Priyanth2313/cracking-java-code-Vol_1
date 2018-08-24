package com.pri.corejava.otherTopics;

	/*
	 * Enum example
	 * 
	 */
	
public class enumExample {

	// enum class
	// enum class should either consist of fields or methods
	public enum HeavenlyBodies {
		stars ("*"),
		moon ("M"),
		sun ("S"),
		planet ("P");
		
		private final String code;
		
		HeavenlyBodies(String code) {
			this.code = code;
		}
		
		public String getCode() {
			return this.code;
		}	
	}
	
	public static void main(String[] args) {
		// enum object instantiation does not require a 'new' keyword
		HeavenlyBodies hb = HeavenlyBodies.moon;
		if ( hb == HeavenlyBodies.moon ) {
			System.out.println(hb.code);
		} else if ( hb == HeavenlyBodies.planet ) {
			System.out.println(hb.code);
		}
	}
}

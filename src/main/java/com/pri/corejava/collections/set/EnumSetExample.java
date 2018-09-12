package com.pri.corejava.collections.set;

import java.util.EnumSet;

public class EnumSetExample {

	// enum class
	enum Soccer {
		Messi,
		Ronaldo,
		Neymar,
		Pele,
		Rooney,
		Ozil,
		Modric
	}
	
	public static void main(String[] args) {
		
		// enum set object declaration and initialization
		EnumSet<Soccer> set1, set2, set3;
		
		set1 = EnumSet.of(Soccer.Messi, Soccer.Ronaldo, Soccer.Neymar);
		set2 = EnumSet.of(Soccer.Ronaldo, Soccer.Ozil, Soccer.Modric);
		set3 = EnumSet.of(Soccer.Rooney, Soccer.Pele);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}

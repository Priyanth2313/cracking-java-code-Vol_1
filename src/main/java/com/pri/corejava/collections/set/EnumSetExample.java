package com.pri.corejava.collections.set;

import java.util.EnumSet;

public class EnumSetExample {

	// enum class
	public enum Soccer {
		MESSI,
		RONALDO,
		NEYMAR,
		PELE,
		ROONEY,
		OZIL,
		MODRIC
	}
	
	public static void main(String[] args) {
		
		// enum set object declaration and initialization
		EnumSet<Soccer> set1, set2, set3;
		
		set1 = EnumSet.of(Soccer.MESSI, Soccer.RONALDO, Soccer.NEYMAR);
		set2 = EnumSet.of(Soccer.RONALDO, Soccer.OZIL, Soccer.MODRIC);
		set3 = EnumSet.of(Soccer.ROONEY, Soccer.PELE);
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}
}

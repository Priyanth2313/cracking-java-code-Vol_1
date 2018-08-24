package com.pri.corejava.oopconcepts;

import com.pri.corejava.oopconcepts.interfaceOriginal;

public class InterfaceExample implements interfaceOriginal {
	

	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		System.out.println("What kinda value is " + obj.value());
		System.out.println(obj.number());
	}

	public int number() {
		return 12;
	}

	public String value() {
		return "Extreme value";
	}
}

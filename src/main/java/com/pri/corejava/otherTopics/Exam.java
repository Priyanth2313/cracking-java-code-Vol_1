package com.pri.corejava.otherTopics;
	
	/*
	 * Exam class
	 * 
	 * Where all the knowledge is tested 
	 */
	
public class Exam{
	
	public static void main(String[] args) {
		ImmutableClassExample obj = new ImmutableClassExample(0, "Raks");
		obj.methodName();
		System.out.println(obj.getW() + obj.getI());	
	}
}

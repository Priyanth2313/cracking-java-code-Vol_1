package com.pri.corejava.reflections;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
	/*
	 * Reflections in java
	 * 
	 */

public class ReflectionExample {

	private String s;
	
	public ReflectionExample() {
		this.s = "Priyanth";
	}
	
	public void friend() {
		System.out.println("The string is "+ s);
	}
	
	public void visitor() {
		System.out.println("the visitor is "+s);
	}
	
	public static void main(String[] args) {

		ReflectionExample obj = new ReflectionExample();

		Class cls = obj.getClass();
		Method[] methods = cls.getMethods();
 
		for (Method myMethod: methods)
			System.out.println(myMethod.getName());
		
		// no exception handling will cause checked exceptions
		try {
			Method methodcall1 = cls.getDeclaredMethod("visitor");
			methodcall1.invoke(obj);
		}
		catch (Exception e) {
			System.out.println("Caught Exception");
		}
		try {
			Field fieldcall1 = cls.getDeclaredField("s");
			fieldcall1.setAccessible(true);
			fieldcall1.set(obj, "JAVA");
			
	        Method methodcall2 = cls.getDeclaredMethod("friend");
	        methodcall2.invoke(obj);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Caught second Exception");
		}
	}
}


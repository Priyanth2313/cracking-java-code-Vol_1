package com.pri.corejava.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

	/*
	 * Serialization example
	 * 
	 * serialization and deserialization of a text file
	 * 
	 */

public class SerializationExample implements Serializable{


	private static final long serialVersionUID = 41L;
	int a;
	String b;
	
	// constructor
	public SerializationExample(int a, String b) {
		this.a = a;
		this.b = b;
	}
	
	public static void main(String[] args) {
		
		FileOutputStream file = null;
		ObjectOutputStream objFile = null;
		FileInputStream infile = null;
		ObjectInputStream objInfile =null;
		
		try {
			SerializationExample obj  = new SerializationExample(26, "Priyanth");
			
			// serialize
			file = new FileOutputStream("T:/IOupstream.txt");
			objFile = new ObjectOutputStream(file);
			
			objFile.writeObject(obj);
			
			System.out.println("Object has been serialized");
			System.out.println(obj.a + obj.b);
			
			// deserialization
			infile = new FileInputStream("T:/IOupstream.txt");
			objInfile = new ObjectInputStream(infile);
			
			// needs to be cast with the subclass for deserialization
			SerializationExample obj1 = (SerializationExample)objInfile.readObject();
			
			System.out.println("Object has been deserialized");
			System.out.println(obj1.a + obj1.b);
		}
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		// close the streams is important as it saves memory leaks
		finally {
			try {
				if (file != null) {
					file.close();
					objFile.close();
					objInfile.close();
					infile.close();	
				}
			}
			catch (IOException ioe) {
				System.out.println("Error in closing the Stream");
			}
		}
	}
}

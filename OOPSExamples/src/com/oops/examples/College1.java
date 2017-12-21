package com.oops.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class College1 {

	public String name;
	public String email;
	public int contact;

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException,
			NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, IOException {

		// Object Creation using new Keyword

		College1 c1 = new College1();

		// Object Creation using Class Forname

		College1 c2 = (College1) Class.forName("com.oops.examples").newInstance();

		// Object Creation using Clone

		College1 c3 = (College1) c1.clone();

		// Object Creation using Class Constructor

		Constructor<College1> constructor = College1.class.getConstructor();

		College1 c4 = constructor.newInstance();

		// Object Creation using Serialization/Deserialization

		FileOutputStream fout = new FileOutputStream("Data.obj");

		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(c4);

		FileInputStream file = new FileInputStream("data.obj");

		ObjectInputStream in = new ObjectInputStream(file);

		College1 c5 = (College1) in.readObject();

	}

}
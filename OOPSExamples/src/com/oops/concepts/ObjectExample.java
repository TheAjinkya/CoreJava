package com.oops.concepts;

import java.lang.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectExample implements Serializable, Cloneable {

	public class Parent {

		String email;

		void displayEmail() {

			System.out.println("The Email is : " + email);

		}

	}

	public class Child extends Parent {

		public String gender;

		public void displayGender() {

			System.out.println("The Gender is: " + gender);
		}

	}

	public String name;
	public int contact;

	public void display(String name, int contact) {

		System.out.println("The Name is '" + name + "' and you can contact him on: " + contact);

	}

	public class ChildClass extends ObjectExample {

		public String ChildName;

		public int ChildContact;

		void displayChild(String ChildName, int ChildContact) {

			System.out.println("The Name is '" + ChildName + "' and you can contact him on: " + ChildContact);

		}

	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException,
			IOException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

		// Object Creation Using new Keyword

		ObjectExample obj1 = new ObjectExample();

		obj1.display("ajinkya", 999);

		// Object creation using Class For name

		ObjectExample obj2 = (ObjectExample) Class.forName("com.oops.concepts.ObjectExample").newInstance();

		obj2.display("Second Object", 989);

		// Object Creation using Clone

		ObjectExample obj3 = (ObjectExample) obj1.clone();

		obj3.display("Third Object", 1000);

		// Object Creation using Constructor

		Constructor<ObjectExample> constructor = ObjectExample.class.getDeclaredConstructor();

		ObjectExample obj4 = constructor.newInstance();

		obj4.display("Fourth Object", 5555);

		// Object Creation using Deserialization

		ObjectExample obj5 = new ObjectExample();

		FileOutputStream file = new FileOutputStream("abc.txt");

		ObjectOutputStream in = new ObjectOutputStream(file);

		in.writeObject(obj5);
		file.close();
		in.close();

		obj5.display("Fifth Object", 777);

	}

}

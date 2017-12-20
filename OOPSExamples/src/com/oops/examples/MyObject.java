package com.oops.examples;

class MainObject {

	public String name;
	public String email;
	public int contact;

	public MainObject() {

		this("a", "bc", 99);
		System.out.println("Inside the Default constructor");

	}

	public MainObject(String name, String email, int contact) {

		this.name = name;
		this.email = email;
		this.contact = contact;

		System.out.println("Inside the Parameterized Constructor");

	}

}

class MyObject extends MainObject {

	public String name = "Chintu";
	public String email = "Chintu@gmail.com";

	class YourObject extends MyObject {

		public String name = "Bantu";

	}

	public static void main(String[] args) {

		MyObject m1 = new MyObject();
		// m1.name="";

		MainObject m2 = new MainObject();

		MainObject m3 = new MyObject();

		// MyObject m4 = new MainObject();

		System.out.println("This is the My Object" + m1.name);

		System.out.println("This is the Main Object" + m2.name);

		System.out.println("This is the Cross Object with Base Chintu" + m3.name);

		show();

	}

	public static void show() {

		System.out.println("This is the Show Method");

	}

}
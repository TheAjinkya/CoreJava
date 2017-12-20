package com.oops.examples;

class NewClassExamples {

	static String name;

	static String email;

	void display() {

		System.out.print("This is the Display Method");

	}

	class Person {

		public Person(String name, String email) {
			this.name = name;
			this.email = email;
		}

		String name;
		String email;

	}

	public static void main(String[] args) {

		NewClassExamples abc = new NewClassExamples();

		abc.display();

	}

}
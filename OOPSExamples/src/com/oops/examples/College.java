package com.oops.examples;

import com.oops.examples.NewClassExamples.Person;

public class College {

	void display() {

		class Person {

			void personDisplay() {

				System.out.println("This is the Display of Person");
			}

		}

		Person p = new Person();
		p.personDisplay();

	}

	public class People {

		String name;
		String email;

	}

	public static void main(String[] args) {

		College clg = new College();

		clg.display();

	}

}
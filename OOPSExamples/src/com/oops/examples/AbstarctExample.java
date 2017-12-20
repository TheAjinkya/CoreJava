package com.oops.examples;

class AbstractExample {

	abstract class Base {

		abstract void fun();

	}

	class Child extends Base {

		void fun() {

			System.out.println("This is the Function");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Inside The Main");

	}
}
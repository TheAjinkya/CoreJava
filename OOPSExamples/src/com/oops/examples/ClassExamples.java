package com.oops.examples;

class Outer {

	class Inner {

		public void show() {

			System.out.println("This is from the nested inner class");
		}

	}

}

public class ClassExamples {

	public static void main(String[] args) {

		Outer.Inner out = new Outer().new Inner();

		out.show();

	}

}
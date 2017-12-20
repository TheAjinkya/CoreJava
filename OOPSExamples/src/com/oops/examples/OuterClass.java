package com.oops.examples;

public class OuterClass {

	void outerMethod() {

		class InnerClass {

			void display() {

				System.out.println("This is the Inner Method");

			}

		}

		InnerClass in = new InnerClass();
		in.display();

	}

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, CloneNotSupportedException {

		OuterClass out = new OuterClass();
		out.outerMethod();

		OuterClass abc = new OuterClass();

		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i : arr) {

			i = i + 89;
			System.out.println(i * 10);

		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(i);
		}

	}
}

package com.oops.examples;

class ForLoop {

	int i = 0;

	public static void main(String[] args) {

		System.out.println("The Star Triangle Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}
			System.out.println();

		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("The Inverted Star Triangle Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < (7 - i); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("The right handed Star Triangle Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 7; i++) {

			for (int j = 0; j < (7 - i); j++) {

				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {

				System.out.print("*");

			}

			System.out.println();

		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("The Pyramid Star Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k <= (5 - i); k++) {

				System.out.print(" ");

			}

			for (int l = 0; l <= i; l++) {

				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("The Odd Numbers Pyramid Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < (5 - i); k++) {
				System.out.print(" ");
			}

			for (int l = 0; l < (2 * i + 1); l++) {
				System.out.print("*");
			}

			System.out.println();

		}

		System.out.println("------------------------------------------------------------------------");
		System.out.println("The Inverted Odd Numbers Pyramid Pattern!!");
		System.out.println("------------------------------------------------------------------------");

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < (5 - i); k++) {

				for (int l = 0; l <= 5; l++) {

					System.out.println("*");
					
				}

			}
		}
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The Odd Numbers Pyramid Pattern!!");
		System.out.println("------------------------------------------------------------------------");
		
		

	}

}
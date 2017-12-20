package com.oops.examples;

class ForEachExample {

	public static void main(String[] args) {

		int array[] = { 22, 55, 33, 66, 44, 77, 88, 99 };

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println("*********************************************");

		for (int i : array) {
			System.out.println(i);
		}

	}

}
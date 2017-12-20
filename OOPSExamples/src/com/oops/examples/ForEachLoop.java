package com.oops.examples;

class ForEachLoop {

	public static void main(String[] args) {

		int[] marks = { 11, 22, 33, 44 };

		String names[] = { "abc", "bckja", "dhkacbka", "masb" };

		for (int i = 0; i < marks.length; i++) {

			System.out.println(marks[i]);
		}

		System.out.println("This is from the ForEach Loop");

		for (int i : marks) {

			System.out.println(i + 99);
		}

		System.out.println("The Name Array Elements");

		for (String string : names) {
			System.out.println(string);
		}
	}

}
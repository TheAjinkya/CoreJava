package com.oops.examples;

class GrandFather {

	public static int income;
	public static String property;

	public int riseUp(int income) {

		int total = 0;

		return total += income;
	}

	class Son extends GrandFather {

		int newIncome;
		String newProperty;

		public int newRise(int newIncome) {

			return newIncome += income;

		}

	}

	public static void main(String[] args) {

		GrandFather g1 = new GrandFather();

		int value = g1.riseUp(2500);

		System.out.println("The GrandFather's income is " + g1.riseUp(2500));

		GrandFather s1 = new GrandFather();

		System.out.println("The New Rise of Income by Son is: ");

	}

}
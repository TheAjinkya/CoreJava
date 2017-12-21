package com.oops.concepts;

class Test {

	public static void main(String[] args) {

		Bicycle b1 = new Bicycle(22, 22);

		System.out.println(b1.toString());

		MountainBike m1 = new MountainBike(5, 500, 3);

		System.out.println(m1.toString());

	}
}
package com.oops.examples;

class ArrayExamples {

	static int[] contact = { 12, 23, 55, 87, 98, 756, 48 };
	String[] names = { "abc", "ajinkya", "Hemant", "Prashant", "Rushi" };
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			contact[i] = contact[i]+ i; 
			System.out.println(contact[i]);
			
		}
		
		
	}

}
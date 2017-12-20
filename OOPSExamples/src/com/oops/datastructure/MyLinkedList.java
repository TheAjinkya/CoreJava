package com.oops.datastructure;

import java.util.*;

class MyLinkedList {

	public static void main(String[] args) {

		LinkedList<String> object = new LinkedList<String>();

		object.add("Ajinkya");
		object.add("Ajinkya2");
		object.add("Ajinkya");
		object.add("Ajinkya2");
		object.add("Ajinkya");
		object.addLast("Kya");
		object.addFirst("AAA");
		object.remove("Ajinkya");
		object.removeFirst();
		object.removeLast();
		object.set(2, "Chanshetty");

		System.out.println("The Object Content is: " + object);

	}

}
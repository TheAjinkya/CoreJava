package com.oops.examples;

class thisUses {

	private String name;
	private String contact;

	public thisUses(String string, String string2) {

		this.name = name;
		this.contact = contact;

	}

	thisUses get() {

		return this;

	}

	void letsGet() {

		displayAgain(this);

	}

	private void displayAgain(thisUses thisUses) {

		System.out.print("This is Print Again Method");

	}

	void display() {

		System.out.println("This is the Display Method");

	}

	public static void main(String[] args) {

		thisUses u1 = new thisUses("ajinkya", "Latur");

		u1.get().display();
		
		u1.letsGet();

	}

}
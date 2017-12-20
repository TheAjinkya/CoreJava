package com.oops.examples;

public class Demo {

	private String name;
	private String college;
	private int rollNo;
	private int contact;
	private String email;

	public Demo(String name, String college) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {

		System.out.println("THis is my First Java Program: HEllo World!");
		
		String s1 = "THis is my Name";
		String s2 = s1.substring(0);
		
		System.out.println(s2);

		
		
	}

}

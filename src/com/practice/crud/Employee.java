package com.practice.crud;

public class Employee {

	String firstName;
	String lastName;
	String phone;

	 

	public  Employee(String firstName, String lastName, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + "]";
	}
	
	

}

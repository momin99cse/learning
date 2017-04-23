package com.practice.misc;

public class MyOwnExceptionClass extends Exception {

	private int price ;
	
	public MyOwnExceptionClass(int price){
		this.price=price;
	}
	
	public String toString()
	{
		return "price should not be negative you entered : " + price;
	}
	
}

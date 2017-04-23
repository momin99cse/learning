package com.practice.misc;

public class MyZeroExecption extends Exception {
	
	private int price;
	
	public MyZeroExecption(int price)
	{
		this.price=price;
	}
	
	public String toString()
	{
		return "price cannot be zero, you entered : " + price;
	}

}

package com.practice.inheritence;

public class Calculation {
	
	int z;
	
	public void addition(int x, int y)
	{
		z=x+y;
		
		System.out.println( x+ "+"+ y + "=" + z);
	}
	
	public void subtraction(int x, int y)
	{
		z=x-y;
		System.out.println(x+ "-" +y+ "=" + z);
	}

}

package com.practice.program;

public class PrimitiveParameters {
	
	public static void main(String args[])
	{
		go();
	}

	
	public static void go()
	{
		int x=3;
		int y=2;
		
		System.out.println("before swap x= "+ x +" y= " + y);
		
		falseswap(x,y);
		
		System.out.println("after swap x= "+ x +" y= " + y);
		
		
	}
	
	public static void falseswap(int x,int y)
	{
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("in method falseSwap. x: " + x + " y: " + y);

		
	}
}

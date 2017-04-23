package com.practice.inheritence;

public class My_Calculation extends Calculation  {
	
	public void multiplication(int x, int y)
	{
		z=x*y;
		System.out.println(x+ "*"+y +"="+z);
	}
	
	public static void main(String args[])
	{
		My_Calculation mca=new My_Calculation();
		
		mca.addition(20, 10);
		
		mca.subtraction(20, 10);
		
		mca.multiplication(20, 10);
	}

}

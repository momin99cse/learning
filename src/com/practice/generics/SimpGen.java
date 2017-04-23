package com.practice.generics;

public class SimpGen {
	
	public static void main(String args[])
	{
		TwoGen<Integer, String> tgObj=new TwoGen<Integer, String>(88,"Two Gen example");
		
		tgObj.ShowTypes();
		
		
		int v=tgObj.getOb1();
		
		System.out.println("Value of v " + v);
		
		String str=tgObj.getOb2();
		
		System.out.println("Value of str :" + str);
		
		
	}

}

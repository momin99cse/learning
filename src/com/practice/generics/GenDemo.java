package com.practice.generics;

public class GenDemo {
	
	public static void main(String args[]) {
		
		 
		Gen<Integer> iOb=new Gen<Integer>(88);
		
		
		iOb.ShowType();
		
		
		int v=iOb.getOb();
		
		System.out.println("Value is" + v );
		
		Gen<String> strOb=new Gen<String>("test");
		
		String   str=strOb.getOb();
		
		System.out.println("Value of String  " + str);
		
		
	}
	

}

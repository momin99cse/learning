package com.practice.intface;

public class A6 implements printable {

 	public void print() {

       System.out.println("hello");
		
	}
 	
 	public static void main(String args[])
 	{
 		A6 obj=new A6();
 		
 		obj.print();
 	}

}

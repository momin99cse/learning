package com.practice.inheritence;

public class Programmer  extends Employee {
	
	int bonus=10000;
	
	public static void main(String args[])
		{
		
		
		Programmer p=new Programmer();
		
		System.out.println("Employee salary :" + p.salary);
		
		System.out.println("Employee bonus :" + p.bonus);
		
		}

}

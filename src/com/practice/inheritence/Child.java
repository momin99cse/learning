package com.practice.inheritence;

public class Child extends Parent {
	
	String name;
	
	public Child(String n1, String n2)
	{
		super(n1);
		name=n2;
	}
	
	public void details()
	{
		 
		
		System.out.println(super.name + "  " +  name);
	}
	
	public static void main(String args[])
	{
		Child c=new Child("parent","child");
		
		c.details();
		
		
	}

}

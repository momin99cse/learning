package com.practice.program;

public class JavaClassExample {
	
	private String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public static void main(String args[])
	{
		JavaClassExample ex=new JavaClassExample();
		
		ex.setName("momin");
		
		String d_name=ex.getName();
		
		System.out.println("The name is : " + d_name);
	}

}

package example.java.framework;


import java.util.*;


public class ArrayListDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> al=new ArrayList<String>();
		
		
		System.out.println("Initial size of arraylis : " + al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		
		System.out.println("Size after addition : " + al.size());
		
		System.out.println("Contents of arraylist : " + al);
		
		
	}

}

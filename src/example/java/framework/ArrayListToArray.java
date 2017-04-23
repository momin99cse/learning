package example.java.framework;

import java.util.ArrayList;

public class ArrayListToArray {
	
	public static void main(String args[])
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		
		
		System.out.println("Initial size : " + al.size());
		
		
		al.add(1);
		al.add(2);
		al.add(4);
		
		System.out.println("Size after addition : " + al.size());
		
		System.out.println("Contents of Array : " + al);
		
		Integer ia[]=new Integer[al.size()];
		
		ia=al.toArray(ia);
		
		int sum=0;
		
		for(int i : ia) 
		{
			sum=sum+i;
		}
			
		System.out.println("Total is : " + sum);
		
	}

}

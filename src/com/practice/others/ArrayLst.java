package com.practice.others;

import java.util.ArrayList;
import java.util.List;

public class ArrayLst {
	
	
	public static void main(String args[]) {
		
		
		ArrayList al=new ArrayList();
		
		al.add("java");
		al.add(12);
		al.add(12.87f);
		
		for(int i=0; i< al.size(); i++) 
		{
			Object o =al.get(i);
			
			 if(o instanceof String || o instanceof Float || o instanceof Integer)
		            System.out.println("Value is "+o.toString());    
			
		}
		
	}

}

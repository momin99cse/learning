package com.practice.crud;

import java.util.*;

public class MapInterfaceExample {
	
	public static void main(String args[])
	{
		Map<Integer, String> map=new HashMap<Integer,String>();
		
		map.put(1, "A");
		
		map.put(2,"B");
		
		map.put(3, "C");
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+"    "+ m.getValue());
		}
		
	}

}

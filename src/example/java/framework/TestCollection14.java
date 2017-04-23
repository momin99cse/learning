package example.java.framework;

import java.util.*;

public class TestCollection14 {
	
	public static void main(String args[])
	{
		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer,String>();
		
		hm.put(1, "mo");
		hm.put(2, "mi");
		hm.put(3, "mu");
		
		for(Map.Entry  m:hm.entrySet())
		{
			System.out.println(m.getKey() + "  " + m.getValue());
		}
	}

}

package example.java.framework;

import java.util.*;

public class MapInterfaceExample {

	public static void main(String args[])
	{
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "momin");
		map.put(101, "mithila");
		map.put(102, "mumit");
		
		for( Map.Entry m:map.entrySet())
		{
			System.out.println( m.getKey() + "  " + m.getValue()  );
		}
		
	}
	
	
	
}

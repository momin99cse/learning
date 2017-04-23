package example.java.framework;

import java.util.*;

public class TestCollection7 {
	
	public static void main(String args[])
	{
		
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add("momin");
		ll.add("mithila");
		ll.add("mumit");
		
		Iterator<String> itr=ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}

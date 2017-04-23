package example.java.framework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String args[])
	{
		ArrayList<String> al=new  ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.print("  " + al);
		
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			
			String element=itr.next();
			
			System.out.println("  " + element);
			
			
		}
	}

}

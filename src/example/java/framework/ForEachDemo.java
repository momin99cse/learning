package example.java.framework;

import java.util.*;

public class ForEachDemo {
	
	public static void main(String args[])
	{
		ArrayList<Integer> vals = new ArrayList<Integer>();
		
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		
		System.out.println("Values are" + vals);
		
		for(int v : vals)
			System.out.println(" " + v);
		
		int sum=0;
		
		for(int v: vals)
			sum=sum+v;
		
		System.out.print("Sum : " + sum);
		
		
		
	}

}

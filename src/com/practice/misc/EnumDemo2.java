package com.practice.misc;

enum Apple {
Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
	
	public static void main(String args[])
	{
		Apple ap;
		
		System.out.println("Here list of all apple");
		
		Apple allapples[]=Apple.values();
		
		for(Apple a : allapples)
		{
			System.out.println(a);
		}
		
		ap=Apple.valueOf("GoldenDel");
		
		System.out.println(ap);
	}

}

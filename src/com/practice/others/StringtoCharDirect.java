package com.practice.others;

public class StringtoCharDirect {
	
	public static void main(String args[])
	{
		
		String str="momin2mumit";
		
		char[] chArray=new char[str.length()];
		
		for(int i=0; i<str.length(); i++) 
		{
			chArray[i]=str.charAt(i);
		}
		
		for(char ch : chArray)
		{
			System.out.println(ch);
		}
		
		
	}

}

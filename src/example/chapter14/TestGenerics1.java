package example.chapter14;


import java.util.*;

class TestGenerics1 {
	
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("momin");
		
		list.add("mithila");
		
		list.add("mumit");
		
		String s=list.get(0);
		
		System.out.println("Value of s : " + s);
		
		Iterator<String> itr=list.iterator();  
		
		while(itr.hasNext() )
			
		{
			System.out.println(itr.next());
		}
		
	}
	
	

}

package example.chapter16;


import java.util.*;

public class TestCollection1 {
	
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("momin");
		
		list.add("mithila");
		
		list.add("mumit");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext() )
		{
			System.out.println(itr.next());
		}
		
		for(String obj:list)
		{
			System.out.println(obj);
		}
	}

}

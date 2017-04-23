package collection.framework.program;

import java.util.*;

public class MyArrayListNewCollection {
	
	public static void main(String args[]){
		
		ArrayList<String> arrl=new ArrayList<String>();
		
		arrl.add("A");
		arrl.add("B");
		arrl.add("C");
		arrl.add("D");
		
		System.out.println("Actual arrayList" + arrl);
		
		List<String> al=new ArrayList<String>();
		
		al.add("E");
	    al.add("F");
	    
	    arrl.addAll(al);
	    
	    System.out.println("After adding new arraylist will be : " + arrl);
	    
	    
		
		
		
	}

}

package collection.framework.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetInterfaceExample {

	public static void main(String args[]) {

		Set<Integer> numbers = new HashSet<>();

		Set<String> names = new LinkedHashSet<>();
		
		List<Integer> listNumbes=Arrays.asList(3,3,4,4,4,4,4,4,4,4,4,2,2);
		
		System.out.println(listNumbes);
		
		Set<Integer> uniqueNum=new HashSet<>(listNumbes);
		
		System.out.println(uniqueNum);
		
		
		Set<String> sname=new HashSet<>();
		
		sname.add("Tom");
		sname.add("peter");
		
		System.out.println(sname);
		
		if (sname.add("mery") ){
			System.out.println("Mery is  added");
		}
		
		System.out.println(sname);
		
		if (!sname.add("Tom") ){
			System.out.println("Tom is already added");
		}
		
		
		System.out.printf("The set has %d elements", sname.size());
		
		Iterator<String> itr=sname.iterator();
		
		while(itr.hasNext()) {
			
			String nn=itr.next();
			
			System.out.println(nn);
		}
		
		
		for(String name : names){
			 System.out.println(name);
		 }
	}
	
	 
	
	
}

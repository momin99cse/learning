package example.java.framework;

import java.util.*;

public class TestCollection3 {
	
	public static void main(String args[])
	{
		Student s1=new Student(100,"momin",35);
		
		Student s2=new Student(101,"mumit",26);
		
		Student s3=new Student(102,"mumit",3);
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		al.add(s1);
		
		al.add(s2);
		
		al.add(s3);
		
		 Iterator itr=al.iterator();
		 
		 while(itr.hasNext())
		 {
			  
			 
			 Student st=(Student)itr.next();
			 
			 System.out.println(st.roll+ " " + st.name + "  " + st.age);
			 
		 }
		 
	}

}

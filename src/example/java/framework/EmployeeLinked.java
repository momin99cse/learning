package example.java.framework;

import java.util.*;

public class EmployeeLinked {
	
	public static void main(String args[])
	{
		
		
		List<Employee> el=new LinkedList<Employee>();
		
		Employee e1=new Employee(101,"aaa");
		
		Employee e2=new Employee(102,"bbb");
		
		Employee e3=new Employee(103,"ccc");
		
		el.add(e1);
		el.add(e2);
		el.add(e3);
		
		for(Employee b:el)
		{
			System.out.println(b.id+ " " + b.name + " ");
			
		}
		
		
		
		
		
	}

}

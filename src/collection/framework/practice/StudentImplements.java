package collection.framework.practice;

import java.util.HashSet;
import java.util.Set;

public class StudentImplements {
	
	public static void main (String args[]) {
		
		
		 
		Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);
		
		Set<Student> setStudents = new HashSet<Student>();
		
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		
		//System.out.println(setStudents);
		setStudents.forEach(student -> System.out.println(student));
		
		Student searchStudent = new Student("456");
		 
		boolean found = setStudents.contains(searchStudent);
		 
		System.out.println("Found student: " + found);

		 
	}

}

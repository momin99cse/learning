package collection.framework.practice;

public class EqualMethod {
	
	public static void main(String args[]){
		
		String s1=new String("momin");
		String s2=new String("momin");
		
		boolean refEqual=(s1==s2);
		boolean secEqual=s1.equals(s2);
		
		System.out.println(refEqual);
		System.out.println(secEqual);
		 
	}

}

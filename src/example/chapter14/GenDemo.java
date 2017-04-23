package example.chapter14;

class GenDemo {
	
	public static void main(String args[])
	{
		Gen<Integer> iOb=new Gen<Integer>(88);
		
		//iOb= new Gen<Integer>(88);
		
		iOb.showType();
		
		int v=iOb.getob();
		
		System.out.println("Value of v: " + v);
		
		System.out.println();
		
		Gen<String> strOb=new Gen<String> ("Generics method");
		
		strOb.showType();
		
		String str= strOb.getob();
		
		System.out.println("Value of String  " + str);
	}

}

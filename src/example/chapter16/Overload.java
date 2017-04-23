package example.chapter16;

public class Overload {
	
	public static void main(String args[])
	{
		OverloadDemo ob=new OverloadDemo();
		
		double r;
		
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		r=ob.test(10.19);
		
		System.out.println(r);
	}

}

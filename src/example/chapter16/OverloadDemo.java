package example.chapter16;

public class OverloadDemo {
	
	void test()
	{
		System.out.println("no  parameter");
	}
	
	void test(int a)
	{
		System.out.println("A : " + a);
	}
	
	void test(int a, int b)
	{
		System.out.println(" a and b  :" +a +" " + b );
	}
	
	double test(double a)
	{
		System.out.println("a :" + a);
		return a*a;
	}

}

package example.chapter16;

public class BoxDemo {
	public static void main(String args[])
	{
		Box b1=new Box();
		
		 
		
		double vol;
		
		b1.setDim(10, 20, 30);
		
		vol=b1.display();
		
		System.out.println(vol);
	}

}

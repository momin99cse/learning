package example.chapter16;

public class Box {
	
	double width;
	double height;
	double depth;
	
	public double display()
	{
		 
		 return width*height*depth;
	}
	
	void setDim(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}

}

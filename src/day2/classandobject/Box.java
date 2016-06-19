package day2.classandobject;

public class Box {
	
	private int width;
	private int length;
	
	public Box(int wid, int len)
	{
		width = wid;
		length = len;
	}
	
	public Box()
	{
		width = 1;
		length = 1;
	}
	
	public int calculateArea()
	{
		return length * width;
	}

}

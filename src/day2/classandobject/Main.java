package day2.classandobject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//	Two methods of object declaration
		Box fedEx, ups, USPS;
		fedEx = new Box(5,10);
		ups = new Box();
		USPS = new Box();
		
		
		//	Alternate method of object declaration using default constructors
		//Box fedEx = new Box(5,10);
		//Box ups = new Box();
		//Box USPS = new Box();
		
		int area = fedEx.calculateArea();
		System.out.println("Area is " + area);
		
	}

}

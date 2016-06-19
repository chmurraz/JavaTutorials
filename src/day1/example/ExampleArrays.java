package day1.example;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		int a = 10;
		int b = 20;
		int c,d,e;
		c = 30;
		d = 40; e = 50;*/
		
		//	Highlight a block of code, then choose Source > Add Block Comment
		
		int[] a = {10, 20, 30, 40, 50};
		System.out.println("-------");
		
		//	Enchanced for statement (for each loop)
		for(int temp : a)
		{
			System.out.println(temp);
		}
		
		int[] x = new int[5];		//	 Declare an array of 5 elements (0 through 4) intialized to zero
		x[3] = 25;
		x[1] = -100;
		
		for(int temp : x)
		{
			System.out.println(temp);
		}
		
		System.out.println("-------");
		
		String[] stx = new String[5];
		stx[3] = "Mike";
		stx[0] = "Joe";
		
		//	String arrays are set to NULL by default
		
		for(String temp : stx)
		{
			System.out.println(temp);
		}
		
		

	}

}

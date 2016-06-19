package day1.example;

public class ExampleAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		x = 10;
		y = -10;
		
		/*
		 * 	There are both single and double & operators.
		 *	The double ampersand && will not compare the second
		 *	criteria if the first is false.  The single & will.
		 */
		
		if(x > 0 && y > 0)
		{
			System.out.println("Both numbers are positive");
		}else if(x > 0 || y > 0)
		{
			System.out.println("atleast one number is positive");
		}
		else
		{
			System.out.println("Both numbers are negative");
		}
	}

}

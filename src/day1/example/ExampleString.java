package day1.example;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "James Dean";
		
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());	//	Capitalize
		System.out.println(x.substring(2));		//	String starting at position 2
		System.out.println(x.charAt(3));		//	Char at position 3
		
		String age = "37";
		String salary = "78965.83";
		
		//Wrapper classes for primitive data types, to convert strings
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);
		
	}

}

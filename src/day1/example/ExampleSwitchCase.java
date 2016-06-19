package day1.example;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int j = 2;
		String j = "Two";
		
		/*
		 * After Java 7, you can use Strings in switch statements as well
		 */
		
		switch(j)
		{
		case "Zero":
			System.out.println("Value is 0");
			break;
		case "One":
			System.out.println("Value is 1");
			break;
		case "Two":
			System.out.println("Value is 2");
			break;
		default:
			System.out.println("Value is not covered by case/switch");
			
		}
	}

}

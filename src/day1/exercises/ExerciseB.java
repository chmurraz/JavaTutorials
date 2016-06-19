package day1.exercises;

public class ExerciseB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nums = {"10", "20", "30", "40"};
		
		int total = 0;
		for(String temp: nums)
		{
			//	Convert String data to integers
			total = total + Integer.parseInt(temp);
		}
		System.out.println(total);
		
	}

}

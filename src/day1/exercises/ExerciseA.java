package day1.exercises;

public class ExerciseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary = 78769.65;
		double tax = 0.0;
		
		if (salary <= 15000)
		{
			tax = salary * 0.10;
		}else if(salary <= 40000)
		{
			tax = salary * 0.20;
		}else
		{
			tax = salary * 0.30;
		}
		System.out.println("Tax = " + tax);
	}

}

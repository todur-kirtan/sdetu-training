package basics;

public class SalaryCalculator {
	
	public static void main(String[] args) {
		
		String career;
		System.out.println("Prgram has started");
		career = "Software Developer";
		
		System.out.println("My Career:" + career);
		
		
		int Hoursperweek = 40;
		int WeeksPerYear = 50;
		double Rate = 42.5;
		
		double Salary = Hoursperweek * WeeksPerYear * Rate;
		
		System.out.println("My salary as a " + career + "at the rate of " + Rate + "is $" + Salary);
		
	}

}

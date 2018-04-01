import java.util.*;

public class WklySalary
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		String firstName,lastName;
		double salary2017,salaryIncrement,percentSalary,totalSalary;
		
		System.out.print("Please enter your first name: ");
		firstName = console.nextLine();
		System.out.print("Please enter your last name: ");
		lastName = console.nextLine();
		System.out.print("Please enter your salary for 2017: ");
		salary2017 = console.nextDouble();
		System.out.print("Please enter your salary increment for 2018 (in %): ");
		salaryIncrement = console.nextDouble();
		
		percentSalary = (salary2017 / 100)*salaryIncrement;
		totalSalary = (salary2017 + percentSalary)/52;
		
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Weekly salary: $" + totalSalary);
	}
}
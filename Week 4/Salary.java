import java.util.*;

public class Salary
{

  public static void main (String[] args)
  {
		/* 
		 * 23/03/2018
		 * Sasa Aleksandar Malancuk
		 * 3304968
		*/
		
		Scanner console = new Scanner(System.in);
  		double normal,extra;
		double total = 0;
		int counter = 1;
		System.out.println("Please enter your full name: ");
		String sFullName = console.nextLine();
		System.out.println("Please enter number of weeks worked: ");
		int weeks = console.nextInt();
		
		while (counter <= weeks)
		{
			System.out.println("Please enter hours worked for Week " + counter + ": ");
			normal = console.nextDouble();
			if (normal < 0)
			{
				System.out.println("Please enter a valid number of hours: ");
				normal = console.nextDouble();
			}
			else if (normal <= 40)
			{
				total += normal * 10;
			}
			else
			{
				extra = normal - 40;
				normal -= extra;
				total += (normal * 10) + (extra * 15);
			}
			counter++;
		}
		
		if (total <= 1000)
		{
			total += total * 0.1;
			System.out.println("Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 10% bonus.");
		}
		else if (total <= 2000)
		{
			total += total * 0.05;
			System.out.println("Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 5% bonus.");
		}
		else if (total <= 3000)
		{
			total += total * 0.01;
			System.out.println("Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 1% bonus.");
		}
		else
			System.out.println("Salary of " + sFullName + " for " + weeks + " weeks is $" + total);
   }
}

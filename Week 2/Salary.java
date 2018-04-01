import java.util.*;

public class Salary
{

  public static void main (String[] args)
  {
		/*Salary.java - Lab 1
		 *Author: Regina Berretta
		 *Modified by: Aleksandar M
		 *Student No: 3304968
		 *Date: 09/03/2018
		 *Description:
		 *Program to calculate weekly salary from total number of hours worked
		 *Modified to include minimum retainer pay of 200 dollars per week.
		*/
		
		Scanner console = new Scanner(System.in); //Declares a variable to monitor user input
  		double normal,extra,total;
		System.out.println("Please enter standard hours worked: ");
		normal = console.nextDouble(); //Takes the next inputted number and assigns its value to 'normal'
	 	System.out.println("Please enter extra hours worked: ");
		extra = console.nextDouble(); //Takes the next inputted number and assigns its value to 'extra'
		total = 10*normal+15*extra; //Calculates total based on 'normal' and 'extra'
		
		if (total <= 200) //Ensures an employee is always paid a minimum of 200, regardless of hours worked
		{
			System.out.println("Your total salary is: 200.0\n");
		}
		else //Any hours beyond the retainer are displayed as an addition to the total
			System.out.println("Your total salary is: "+total+"\n");
   }
}

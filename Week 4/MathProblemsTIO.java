import java.util.*;
import java.lang.*;

public class MathProblemsTIO
{
 
  public static void main(String[] args) 
  {
		Scanner console = new Scanner(System.in);
		int iChoice;

		System.out.print("\n1. 2 + 4 + 6 + n\n2. (1/2)^2 + (2/3)^2 + (3/4)^2 + (n-1/n)^2" +
										 "\n3. 1*3 + 3*5 + 5*7 + n*(n+2)\n4. 1! - 3! + 5! - 7! + n!" +
										 "\n\nPlease enter a number corresponding with the problem you wish to run: ");
		iChoice = console.nextInt();
		Calculations(iChoice);
	}

	static void Calculations(int iC)
	{
		Scanner console = new Scanner(System.in);
		int n, iFact;
		double dResult = 0;

		System.out.print("Enter a value for n: ");
		n = console.nextInt();

		if (n >= 1 || n <= 5)
		{
			switch (iC)
			{
				case 1:
					dResult = 2+4+6+n;
					break;

				case 2:
					dResult = Math.pow((1/2D), 2) + Math.pow((2/3D), 2) + Math.pow((3/4D), 2) + Math.pow((n-1D/n), 2);
					break;

				case 3:
					dResult = 1*3 + 3*5 + 5*7 + n*(n+2D);
					break;

				case 4:
					iFact = 1;
					for (int i = 1; i <= n; i++)
					{
						iFact = iFact * i;
					}
					dResult = 1 - 6 + 120 - 5040 + iFact;
					break;
			}
			System.out.println("The result is " + dResult);
		}
	}
}
import java.util.*;

public class TriangleEvalTIO
{
 
  public static void main(String[] args) 
  {
		Scanner console = new Scanner(System.in);

		System.out.print("Enter three values to be tested as a valid triangle. \nPlease enter side one: ");
		double side1 = console.nextDouble();
		System.out.print("Please enter side two: ");
		double side2 = console.nextDouble();
		System.out.print("Please enter side three: ");
		double side3 = console.nextDouble();

		if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)
			System.out.println("\nNot a valid triangle.");
		else
		{
			if (side1 == side2 && side1 == side3)
				System.out.println("\nThis is an equilateral triangle.");
			else if (side1 == side2 || side2 == side3 || side3 == side1)
				System.out.println("\nThis is an isosceles triangle.");
			else
				System.out.println("\nThis is a scalene triangle.");
		}
  }
}
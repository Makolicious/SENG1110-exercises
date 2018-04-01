import java.util.*;

public class NameWorksTIO
{
 
  public static void main(String[] args) 
  {
		Scanner console = new Scanner(System.in);
	
		System.out.print("Please enter a firstname: ");
		String first1 = console.next();
		System.out.print("Please enter a second firstname: ");
		String first2 = console.next();
		System.out.print("Please enter a lastname: ");
		String last = console.next();

		String firstExample = first1.concat(" " + last) + ", " + first2.concat(" " + last);
		String secondExample = firstExample.toUpperCase();
		String thirdExample = firstExample.toLowerCase();

		System.out.println();
		System.out.println("Printed as is: " + firstExample);
		System.out.println("Printed in uppercase: " + secondExample);
		System.out.println("Printed in lowercase: " + thirdExample);
  }
}


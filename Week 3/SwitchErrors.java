import java.util.*;

public class SwitchErrors
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number;

		System.out.println("Key: 1 = Blue, 2 = Red, 3 = Green");
		System.out.print("Enter a number and I'll return the corresponding color. ");
		number = keyboard.nextInt();

		switch(number)
		{
			case 1:
				System.out.println("You chose blue!");
				break;
			case 2:
				System.out.println("You chose red!");
				break;
			case 3:
				System.out.println("You chose green!");
				break;
			default:
				System.out.println("Colour not available!");
				break;
		}
	}
}
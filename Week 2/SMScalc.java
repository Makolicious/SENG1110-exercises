import java.util.*;

public class SMScalc
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		int messageCount;
		double totalCost;
		double msgCost = 0.22;
		int setupCost = 10;
		
		System.out.print("Please enter # of messages: ");
		messageCount = console.nextInt();
		totalCost = setupCost + (messageCount * msgCost);
		System.out.println("Total price inc. setup fee is: $" + totalCost);
	}
}
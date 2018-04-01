import java.util.*;

public class Repayment
{
	public static void main (String[] args)
	{
		Scanner console = new Scanner(System.in);
		double prodPrice,intRate,initPayment,mRepay,totalPay;
		int nMonths,iCounter;
		System.out.print("Please enter the product price: ");
		prodPrice = console.nextDouble();
		
		System.out.print("Please enter the interest rate: ");
		intRate = console.nextDouble() / 100;
		
		System.out.print("Please enter the number of months you will pay off in: ");
		nMonths = console.nextInt();
		
		System.out.print("Please enter an initial payment (enter 0 if none): ");
		initPayment = console.nextDouble();
		
		prodPrice -= initPayment;
		mRepay = prodPrice / nMonths;
		totalPay = 0;
		iCounter = 1;
		System.out.println("\nMonthly payment breakdown as follows.");
		while (iCounter <= nMonths)
		{
			mRepay += mRepay * intRate;
			totalPay += mRepay;
			
			System.out.println("Month " + iCounter + "'s payment: $" + mRepay);
			iCounter++;
		}
		
		System.out.println("Payments total $" + totalPay + " including $"
						   + (totalPay - prodPrice) + " interest.");
	}
}
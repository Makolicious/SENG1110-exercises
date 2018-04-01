import javax.swing.*;

public class DivideTwoGUI
{
	public static void main(String[] args)
	{
		int numerator = Integer.parseInt(JOptionPane.showInputDialog("This program divides two numbers. \nEnter the numerator."));
		int denominator = Integer.parseInt(JOptionPane.showInputDialog("Enter the denominator."));

		if (denominator == 0)
			denominator = Integer.parseInt(JOptionPane.showInputDialog("Division by zero is not allowed. \nPlease enter a valid number."));

		JOptionPane.showMessageDialog(null, numerator + "/" + denominator + "\n= " + (double)numerator/denominator);
	}
}
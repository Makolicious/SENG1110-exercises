import javax.swing.*;

public class SalaryGUI
{

  public static void main (String[] args)
  {
		/* 
		 * 23/03/2018
		 * Sasa Aleksandar Malancuk
		 * 3304968
		*/
		
		double normal,extra;
		double total = 0;
		int counter = 1;
		String sFullName = JOptionPane.showInputDialog("Please enter your full name");
		int weeks = Integer.parseInt(JOptionPane.showInputDialog("Please enter number of weeks worked"));
		
		while (counter <= weeks)
		{
			normal = Double.parseDouble(JOptionPane.showInputDialog("Please enter hours worked for Week " + counter + ": "));
			if (normal < 0)
			{
				normal = Double.parseDouble(JOptionPane.showInputDialog("Please enter a valid number of hours"));
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
			JOptionPane.showMessageDialog(null,"Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 10% bonus.");
		}
		else if (total <= 2000)
		{
			total += total * 0.05;
			JOptionPane.showMessageDialog(null,"Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 5% bonus.");
		}
		else if (total <= 3000)
		{
			total += total * 0.01;
			JOptionPane.showMessageDialog(null,"Salary of " + sFullName + " for " + weeks
			+ " weeks is $" + total + ", which includes a 1% bonus.");
		}
		else
			JOptionPane.showMessageDialog(null,"Salary of " + sFullName + " for " + weeks + " weeks is $" + total);
   }
}

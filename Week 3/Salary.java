import java.util.*;
import javax.swing.*;

public class Salary
{

  public static void main (String[] args)
  {
		Scanner console = new Scanner(System.in);
  		double normal,extra,total;
		normal = Double.parseDouble(JOptionPane.showInputDialog("Please Enter number of normal hours for week 1"));
		extra = Double.parseDouble(JOptionPane.showInputDialog("Please Enter number of extra hours for week 1"));
		normal += Double.parseDouble(JOptionPane.showInputDialog("Please Enter number of normal hours for week 2"));
	 	extra += Double.parseDouble(JOptionPane.showInputDialog("Please Enter number of extra hours for week 2"));
		total = 10*normal+15*extra;

		if (total < 500)
		{
			total += total * 0.1;
		}
		else if (total < 1000)
		{
			total += total * 0.05;
		}
		JOptionPane.showMessageDialog(null, "Total salary is: " + total);
   }
}

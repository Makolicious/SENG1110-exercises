import javax.swing.*;
import java.lang.*;

public class MathProblemsGUI
{
  public static void main (String[] args)
  {
	  int iChoice = Integer.parseInt(JOptionPane.showInputDialog("1. 2 + 4 + 6 + n\n2. (1/2)^2 + (2/3)^2 + (3/4)^2 + (n-1/n)^2" +
                                                               "\n3. 1*3 + 3*5 + 5*7 + n*(n+2)\n4. 1! - 3! + 5! - 7! + n!" +
                                                               "\n\nPlease enter a number corresponding\nwith the problem you wish to run"));
    Calculations(iChoice);   
  }

  static void Calculations(int iC)
	{
		int n, iFact;
		double dResult = 0;

		n = Integer.parseInt(JOptionPane.showInputDialog("Enter a value for n"));

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
			JOptionPane.showMessageDialog(null,"The result is " + dResult);
		}
	}
}

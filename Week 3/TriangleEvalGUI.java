import javax.swing.*;

public class TriangleEvalGUI
{
 
  public static void main(String[] args) 
  {
		double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter three values to be tested as a valid triangle. \nPlease enter side one."));
		double side2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side two."));
		double side3 = Double.parseDouble(JOptionPane.showInputDialog("Please enter side three."));

		if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2)
			JOptionPane.showMessageDialog(null, "Not a valid triangle.");
		else
		{
			if (side1 == side2 && side1 == side3)
        JOptionPane.showMessageDialog(null, "This is an equilateral triangle.");
			else if (side1 == side2 || side2 == side3 || side3 == side1)
        JOptionPane.showMessageDialog(null, "This is an isosceles triangle.");
			else
        JOptionPane.showMessageDialog(null, "This is a scalene triangle.");
		}
  }
}
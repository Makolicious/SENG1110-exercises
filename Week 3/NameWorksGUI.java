import javax.swing.*;

public class NameWorksGUI
{
  public static void main (String[] args)
  {
    String first1 = JOptionPane.showInputDialog("Please enter a firstname");
    String first2 = JOptionPane.showInputDialog("Please enter a second firstname");
    String last = JOptionPane.showInputDialog("Please enter a lastname");

    String firstExample = first1.concat(" " + last) + ", " + first2.concat(" " + last);
		String secondExample = firstExample.toUpperCase();
    String thirdExample = firstExample.toLowerCase();
    
    JOptionPane.showMessageDialog(null, firstExample + "\n" + secondExample + "\n" + thirdExample); 
  }
}
package testers;
import javax.swing.*;
import ie.atu.hotel.Guest;

public class ExceptionHandlerDemo 
{
	public static void main(String args[])
	{
	 try
	 {
	  String numberAsString=JOptionPane.showInputDialog("Please enter an integer :",null);
	  int number=Integer.parseInt(numberAsString);
	  JOptionPane.showMessageDialog(null,"Number entered is "+number);
	 }
	 catch(NumberFormatException e)
	 {
	  JOptionPane.showMessageDialog(null,"An Integer is required!");
	 }
     
	 System.out.println("Continue with rest of program...");
	}
}
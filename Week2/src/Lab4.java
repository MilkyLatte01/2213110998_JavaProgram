import javax.swing.JOptionPane;
import java.text.*;

public class Lab4 
{

	public static void main(String[] args) 
	{
		
		
		String id;
		String idTitle;
		int cdQuantity;
		String strcdQuantity;
		double cdPrice;
		String strcdPrice;
		double cdSubtotal = 0;
		
		double cdTotal;
		final double TAXRATE=.0625;
		
		id=JOptionPane.showInputDialog("This program calculates the total cost of a CD order"+"\nPlease enter the ID of the CD");
		idTitle=JOptionPane.showInputDialog("Please enter the title of the CD");
		
		strcdPrice=JOptionPane.showInputDialog("Please enter the price of the CD in U.S dollars");
		cdPrice = Double.parseDouble(strcdPrice);
		
		strcdQuantity=JOptionPane.showInputDialog("Please enter the quantity to be purchased");
		cdQuantity=Integer.parseInt(strcdQuantity);
		
		cdSubtotal=cdPrice*cdQuantity;
		cdTotal=cdSubtotal+(cdSubtotal*TAXRATE);
		
		JOptionPane.showMessageDialog(null,"Summary of the transaction: "+"\n"+"CD ID: "+id+"\nCD Title: "+idTitle+
				"\nCD Unit Price: $"+cdPrice+"\nUnit Quantity: "+cdQuantity+"\n"+"\nSubtotal : %"+cdSubtotal+"\nTax rate: %"+TAXRATE*100+
				"\nTotal: $"+cdTotal+"\n\nEnd of Program");
	}

}

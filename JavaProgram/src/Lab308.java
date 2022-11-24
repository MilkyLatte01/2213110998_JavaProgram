import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;
public class Lab308 {
	final static double TAX_RATE_ABOVE_20K = 0.1;
	final static double TAX_RATE_ABOVE_40K = 0.2;
	final static double TAX_RATE_ABOVE_60K = 0.3;
	public static void main(String[] args)
	{
		DecimalFormat frm= new DecimalFormat("0.00");
		Scanner scan = new Scanner(System.in);
		double taxPayable = 0;
		
		System.out.print("How many time you want to put: ");
		int time = scan.nextInt();
		
		for(int i = 0;i<time;i++) {
		System.out.print("Enter the taxable income: $");
		int taxableIncome = scan.nextInt();
		if(taxableIncome<=20000) {
			taxPayable=taxableIncome*0;
			System.out.println("The income tax payable is: $"+frm.format(taxPayable));
		}
		else if (taxableIncome<=40000) {
			taxPayable=(taxableIncome-20000)*TAX_RATE_ABOVE_20K;
			System.out.println("The income tax payable is: $"+frm.format(taxPayable));
		}
		else if (taxableIncome<=60000) {
			taxPayable=20000*TAX_RATE_ABOVE_20K+(taxableIncome-40000)*TAX_RATE_ABOVE_40K;
			System.out.println("The income tax payable is: $"+frm.format(taxPayable));
		}
		else
		{
			taxPayable=20000*TAX_RATE_ABOVE_20K+
					20000*TAX_RATE_ABOVE_40K+
					(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
			System.out.println("The income tax payable is: $"+frm.format(taxPayable));
		}

	}
	}

}

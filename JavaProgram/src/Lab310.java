import java.util.Scanner;
import java.text.*;

public class Lab310 {
	static final double COMMISSION_RATE=0.15;
	static final int SENTINEL=-1;
	public static void main(String[] args) {
		DecimalFormat frm= new DecimalFormat("#,##0.00");
		Scanner scan=new Scanner(System.in);
		int sales;
		double salary=0;
		do {
			System.out.print("Enter sales in dollars (or-1 to end): ");
			sales = scan.nextInt();
			if( sales!=SENTINEL) {
				salary=1000+sales*COMMISSION_RATE;
				System.out.println("Salary is: $"+frm.format(salary));
			}
			else System.out.println("Bye");	
			}while(sales!=SENTINEL);
	}
}

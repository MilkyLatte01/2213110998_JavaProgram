import java.util.Scanner;
public class Lab2 
	{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");
		
		int Bnum = scan.nextInt();
		
		int hour= Bnum/60;
		
		int day= hour/24;
		
		int year=day/365;
		int dayCal= day-(365*year);
		
		System.out.println(Bnum+" minutes is approximately "+year+" years and "+dayCal+" days");	

	}

}

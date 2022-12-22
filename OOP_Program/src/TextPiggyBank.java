import java.util.*;

public class TextPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		/*
		 * PiggyBank pb=new PiggyBank();
		 * 
		 * pb.setPiggyBank(500); System.out.println("Money Total : "+pb.getTotal());
		 * 
		 * pb.addTwo(34); System.out.println("Add 2 Baht Money :"+34);
		 * System.out.println("Money Total : " +pb.getTotal());
		 * 
		 * pb.addFive(100); System.out.println("Add 5 Baht Money : "+100);
		 * System.out.println("Money Total : " +pb.getTotal());
		 * 
		 * pb.addTen(13); System.out.println("Add 10 Baht Money : "+13);
		 * System.out.println("Money Total : " +pb.getTotal());
		 */
		sizeOfPiggyBank();

	}// End of Main Method

	public static void sizeOfPiggyBank() {
		System.out.println("Money Total : " + pb.getTotal());
		System.out.print("Please define size of Piggy Bank: ");
		// int size = scan.nextInt();
		// pb.setPiggyBank(size);
		pb.setPiggyBank(scan.nextInt());
		System.out.println("Size of your Piggy Bank : " + pb.getPiggyBank());
		inputCoin();
	}// End of Size of Piggy Bank Method

	public static void inputCoin() {
		while (true) {
			System.out.println("\n=======================");
			System.out.println("Menu of PiggyBank");
			System.out.println("\n=======================");
			System.out.println("[1] One  Baht");
			System.out.println("[2] Two  Baht");
			System.out.println("[3] Five Baht");
			System.out.println("[4] Ten  Baht");
			System.out.println("[5] Exit");
			System.out.println("\n=======================");
			System.out.println("Please select choice: ");
			int choice = scan.nextInt();
			if (choice == 1) {
				System.out.print("Insert 1 baht : ");
				pb.addOne(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());
				
			} else if (choice == 2) {
				System.out.print("Insert 2 baht : ");
				pb.addTwo(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());
			
			} else if (choice == 3) {
				System.out.print("Insert 5 baht : ");
				pb.addFive(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());
			
			} else if (choice == 4) {
				System.out.print("Insert 10 baht : ");
				pb.addTen(scan.nextInt());
				System.out.print("Money Total : " + pb.getTotal());

			} else if (choice == 5) {
				System.out.print("Bye Bye");
				break;
			}
		}
	}
}

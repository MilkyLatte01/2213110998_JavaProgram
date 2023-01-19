import java.util.*;

public class TestBook {

	public static void main(String[] args) {
		Book book=new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title: ");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price: ");
		book.setPrice(scan.nextFloat());
		System.out.print("Input book publish year : ");
		book.setPublishYear(scan.nextInt());
		
		System.out.println(book);
	}

}

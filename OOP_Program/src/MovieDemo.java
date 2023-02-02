import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Input movie id		: ");
		String movieId=scan.nextLine();
		
		System.out.print("Input movie name		: ");
		String movieName=scan.nextLine();
		
		System.out.println();
		
		System.out.print("Input director name	: ");
		String directorName=scan.nextLine();	
		
		System.out.print("Input director email	: ");
		String directorEmail=scan.nextLine();	

		System.out.print("Input director gender	: ");
		char directorGender = scan.next().toLowerCase().charAt(0);
		
		while (directorGender!='m'||directorGender!='f') {
			System.out.print("Input director gender, again: ");
			directorGender=scan.next().toLowerCase().charAt(0);
		}
		
		System.out.println();
	
		System.out.print("Input movie theater no. : ");
		int theaterNo=scan.nextInt();
		
		while(theaterNo<1||theaterNo>15) {
			System.out.print("Please input 1 - 15 only : ");
			theaterNo = scan.nextInt();
		}
		Theater theater = new Theater(movieId,movieName,new Director(directorName,directorEmail,directorGender),theaterNo);
		System.out.println(theater);
		
	}

}

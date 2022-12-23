import java.util.*;
public class TestStudent {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		
		int student=scan.nextInt();
		Student[] std=new Student[student];//Define Array Object
		
		for(int i =0;i<std.length;i++) {
			std[i]=new Student();//Declare array object, call method Student()
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again");
				std[i].setScore(scan.nextInt());
			}//End while loop
			
			System.out.println("");
			
		}//End for loop

		//System.out.println("LIST OF PASS STUDENT(<=50)");
		System.out.println("-------------------------------------");
		for(Student STD:std) {
			if(STD.isPass()) {
				System.out.println(">> "+STD.getName()+" get grade "+STD.findGrade(STD.getScore()));
			}
		}
		

	}//End of main

}

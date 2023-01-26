
public class TestStudent2 {

	public static void main(String[] args) {
		student2 jirapat=new student2("Jirapat Anantasiri");
		System.out.println(jirapat);

		
		
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat);
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
		
		jirapat.addCourseGrade("INT107",25);
		jirapat.addCourseGrade("INT108",75);
		jirapat.addCourseGrade("MSC202",69);
		System.out.printf("The average grade is %.2fn",jirapat.getAverageGrade());
	}

}

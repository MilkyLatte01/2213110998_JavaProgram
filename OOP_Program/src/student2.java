
public class student2 {
	private String name;
	private String address;
	
	private String[] courses;
	private int[] grades;
	private int numCourses;
	
	private static final int MAX_COURSE=30;
	
	public student2(String name, String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades=new int [MAX_COURSE];
		numCourses=0;
	}
	
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
		
	}
	public String toString() {
		return getName()+" ("+ getAddress()+")";
	}
	
	public void addCourseGrade(String course,int grade) {
		courses[numCourses]=course;
		grades[numCourses]=grade;
		++numCourses;
	}
	
	public void printGrade() {
		System.out.print(name);
		for(int i=0;i<numCourses;i++) {
			System.out.print(" "+courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	
	public double getAverageGrade() {
		int sum =0;
		for(int i=0;i<numCourses;i++) {
			sum+=grades[i];
			
		}
		return (double)sum/numCourses;
	}
	
	
	
	
	
}

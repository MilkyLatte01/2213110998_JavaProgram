package Example;

public class TestPointD {

	public static void main(String[] args) {
		Point2d p1=new Point2d();
		System.out.println("Default x,y of Point2d = "+p1);
		p1.setXY(10,11);
		System.out.println("x,y of Point2d = "+p1);
		
		System.out.println("x of Point 2d is: "+p1.getXY()[0]);
		System.out.println("y of Point 2d is: "+p1.getXY()[1]);
		
		
		Point3d p2=new Point3d();
		System.out.println("Default x,y and zof Point3d = "+p2);
		p2.setXYZ(10,12,7);
		System.out.println("x,y and z of Point 3d = "+p2);
		
		System.out.println("x of Point 3d is: "+p2.getXYZ()[0]);
		System.out.println("y of Point 3d is: "+p2.getXYZ()[1]);
		System.out.println("z of Point 3d is: "+p2.getXYZ()[2]);
	}

}

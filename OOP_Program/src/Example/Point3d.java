package Example;

public class Point3d extends Point2d{
	private float z;
	
	
	//constructor method
	
	public Point3d() {
		super();
		this.z=0;
	}
	
	public Point3d(float x,float y,float z) {
		super(x,y);
		this.z=z;
	}
	//getter and setter method
	
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z=z;
	}
	public void setXYZ(float x,float y, float z) {
		//use setter in super class 
		super.setX(x);
		super.setY(y);
		this.z=z;
	}
	
	
	public float[] getXYZ() {
		float[] results=new float[3];
		results[0]=super.getX();
		results[1]=super.getY();
		results[2]=this.z;
		return results;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", and "+getZ();
	}
}

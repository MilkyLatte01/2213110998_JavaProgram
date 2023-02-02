package Example;

public class Point2d {
	private float x;
	private float y;
	
	//Constructor method
	public Point2d() {
		this.x=0;
		this.y=0;
	}
	
	//Construcor with parameter
	public Point2d(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	//Getter and setter method
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x=x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y=y;
	}
	public void setXY(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public float[] getXY() {
		float[] results=new float[2];
		results[0]=this.x;
		results[1]=this.y;
		return results;
	}
	
	//Return toString in the form of (x,y)
	
	public String toString() {
		return "("+getX()+","+getY()+")";
	}
	
}


public class Product 
{
	private String id;
	private int unit;
	private double price;
	
	//Method
	
	public void setId(String ID) 
	{
		 id=ID;
	}
	public String getId()
	{
		return id;
	}
	public void setUnit(int UNIT) 
	{
		unit=UNIT;
	}
	public int getUnit() 
	{
		return unit;
	}
	public void setPrice(double PRICE) 
	{
		price=PRICE;
	}
	public double getPrice() 
	{
		return price;
	}
	public double calculate() 
	{
		double total=unit*price;
		return total;
	}
	
	public String status(int unit,String id) {
		if (unit<5 && unit>=0) {
			return "Low";
		}else if (unit<50&&unit>=5) {
			return "Normal";
		}else {
			return "High";
		}
	}
	
	
}

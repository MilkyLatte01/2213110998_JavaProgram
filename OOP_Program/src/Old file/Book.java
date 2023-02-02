import java.time.Year;

public class Book {
	private String title;
	private float price;
	private int publishYear;
	
	
	public void setTitle(String title) {
		this.title=title;
	}
	public void setPrice(float price) {
		this.price=price;
	}
	public void setPublishYear(int year) {
		this.publishYear=year;
	}
	public String getTitle(){
		return title;
	}
	public float getPrice() {
		return price;
	}
	public int getPublishYear() {
		return publishYear;
	}
	
	public int getTotalYear() {
		return Year.now().getValue()-publishYear;
	}
	
	public String toString() {
		return ("Title: "+getTitle()+" published for "+getTotalYear()+" year ("+getPrice()+" baht).");
	}
}

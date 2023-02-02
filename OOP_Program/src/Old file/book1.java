
public class book1 {
	private String title;
	private Author1 author;
	private int page;
	
	public book1(String title,Author1 author,int page) {
		this.title=title;
		this.author=author;
		this.page=page;
		
		
	}
	
	public book1(String title,Author1 author) {
		this(title,author,0);
		
	}
	public book1() {
		this(null,null,0);
	}
	public String getTitle() {
		return this.title;
	}
	public Author1 getauthor() {
		return this.author;
	}
	public void setPage(int page) {
		this.page=page;
	}
	public int getPage() {
		return page;
		
	}
	public String toString() {
		return getTitle()+" has "+getPage()+ " pages write by "+author;
	}
}

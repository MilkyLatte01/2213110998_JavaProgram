
public class VideoStoreLauncher {

	public static void main(String[] args) {
		Video vid1=new Video();
		vid1.setTitle("The GodFather");
		
		vid1.addRating(3);
		vid1.addRating(2);
		vid1.addRating(5);
		
		
		System.out.println(vid1.getTitle()+": "+vid1.getRating());
		
		vid1.checkOut();

	}
	
	public static void getStatus(Video v) {
		if(v.isCheckedOut()) {
			System.out.println("\'"+v.getTitle()+"\' is checked out.");
		}else {
			System.out.println("\'"+v.getTitle()+"\' is on the shelves.");
		}
	}

}

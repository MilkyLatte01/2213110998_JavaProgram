import javax.swing.*;
public class bookdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("input author name : ");
		String email=JOptionPane.showInputDialog("input author email : ");
		String title=JOptionPane.showInputDialog("input book title : ");
		
		int page = Integer.parseInt(JOptionPane.showInputDialog("input book page : "));
		int ConfirmPage=JOptionPane.showConfirmDialog(null,"is the page correct?","Confirm",JOptionPane.YES_NO_OPTION);
		book1 book1=new book1(title,new Author(name,email),page);
		if(ConfirmPage==1) {
			page=Integer.parseInt(JOptionPane.showInputDialog("inpuut book page, again: "));
			book1.setPage(page);
			
		}
		JOptionPane.showMessageDialog(null,"Book Title"+title+"\nAuthor name : "+ book1.getauthor().getName()+"("+page+" Page"+"\nAuthor e-mail: "+book1.getauthor().getEmail());
	}

}

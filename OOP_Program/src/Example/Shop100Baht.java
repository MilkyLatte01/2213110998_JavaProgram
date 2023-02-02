package Example;
import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		
		
		Product arnupat=new Product();
		
		int button=JOptionPane.showConfirmDialog(null,"Pattanakarn");
		if(button==0) {
			arnupat=new PattanakarnBranch();
		}
		
		arnupat.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product: ")));
		
		JOptionPane.showMessageDialog(null,arnupat);

	}

}

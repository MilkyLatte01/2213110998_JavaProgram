import javax.swing.*;
public class Lab605 {	
	public static void main(String[] args) {
	int[] number= new int[5];
	for (int i=0;i<number.length;i++) {
		number[i]=Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
	}
	showEven(number);
	showOdd(number);
}//End of Main 

	public static void showEven(int[]num) {
		String text=" ";
		for(int i =0;i<num.length;i++) {
			if((num[i]%2)==0) {
				text=text+num[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number:\n"+text);
	}
	public static void showOdd(int[]num) {
		String text=" ";
		for(int i =0;i<num.length;i++) {
			if((num[i]%2)!=0) {
				text=text+num[i]+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number:\n"+text);
	}
}

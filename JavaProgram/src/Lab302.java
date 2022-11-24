import javax.swing.*;
import java.text.*;


public class Lab302 {

	public static void main(String[] args) 
	{
		DecimalFormat frm= new DecimalFormat("##.0");
		float weight = Float.parseFloat(JOptionPane.showInputDialog("Input Weight:"));
		int height = Integer.parseInt(JOptionPane.showInputDialog("Input Height:"));

		float heightCal=height/100.0f;
		float bmi=weight/(heightCal*heightCal);
		
		if (bmi<18.5) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Under-weight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi>=18.6&&bmi<24.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Normal-weight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi>=25&&bmi<=29.9) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Over-weight",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		else if (bmi>30.0) {
			JOptionPane.showMessageDialog(null, "BMI = "+frm.format(bmi)+"\nYou're Obesity",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
		
	}

}

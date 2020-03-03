package bütünleme;
import javax.swing.*;
public class Onbirinci_Bölüm_4 {

	
	public static void main(String argc[]) {
		JFrame enes=new JFrame("Bir elemanlı GUI");
		JButton ok=new JButton("OK");
		enes.add(ok);
		enes.setSize(400,300);
		enes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enes.setLocationRelativeTo(null);
		enes.setVisible(true);
		
	}
}

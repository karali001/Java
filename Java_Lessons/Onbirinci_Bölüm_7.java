package bütünleme;
import javax.swing.*;
import java.applet.*;
import java.awt.*;
public class Onbirinci_Bölüm_7 extends JFrame {

	Onbirinci_Bölüm_7(){
		JFrame deneme=new JFrame();
		deneme.setLayout(new GridLayout(4,3));
		for (int i=0;i<14;i++) {
			deneme.add(new JButton(" "+i));
		}
		deneme.setBounds(100, 100, 400, 400);
		deneme.setVisible(true);
		
	}
	
	
	
	
    public static void main(String argc[]) {
    	
    
    	Onbirinci_Bölüm_7 deneme=new Onbirinci_Bölüm_7();
    	deneme.setTitle("deneme");
    	deneme.setLocationRelativeTo(null);
    	deneme.setSize(400, 400);
    	deneme.setVisible(true);
    	
    }
}

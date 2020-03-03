package bütünleme;
import java.awt.*;
import javax.swing.*;
public class Onbirinci_Bölüm_5 extends JFrame{
    public Onbirinci_Bölüm_5() {
    	
    	JPanel panel=new JPanel();
    	panel.setLayout(new GridLayout(4,3));
    	
    	
    	for(int i=0;i<10;i++) {
    		
    		panel.add(new JButton(" "+i));
    	}
    	panel.add(new JButton(""+0));
    	panel.add(new JButton("Başlat"));
    	panel.add(new JButton("Durdur"));
    	
    	 JPanel pan=new JPanel(new BorderLayout());
    	 pan.add(new JTextField("     Zamanı seçiniz    "),
    	    		            BorderLayout.NORTH);
    	 pan.add(panel,BorderLayout.CENTER);
    	 
    	 add(pan,BorderLayout.EAST);
    	 add(new JButton("Yiyecekler Buraya"),BorderLayout.CENTER);
    	    
    }
   
	
	
	public static void main(String argc[]) {
		
		Onbirinci_Bölüm_5 enes=new Onbirinci_Bölüm_5();
		
		enes.setTitle("Mikrodalga Fırının Kapağı");
		enes.setLocationRelativeTo(null);
		enes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		enes.setSize(400, 200);
		enes.setVisible(true);
		
	}
}

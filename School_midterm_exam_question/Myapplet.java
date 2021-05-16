package tekrarlar;
import java.applet.*;
import java.awt.*;
import java.util.*;
import java.lang.NullPointerException;
public class Myapplet {
public  void paint(Graphics g) {
	int n=0;
	int R=20;
	int r=10;
	while(n<4000) {
		int a= R- new Random().nextInt(2*R);
		int b= R- new Random().nextInt(2*R);
		if ((a*a+b*b)>r*r&&(a*a+b*b)>R*R) {
			g.drawOval(a, b, 1, 1);
		}
	}
}
}
package tekrarlar;

public class tekrar3 {
public static void main(String args[]) {
	System.out.println(new sınav3().d());
	//sınav3 m=new sınav3();
	//System.out.println(m.x);
	System.out.println(new sınav3(new sınav3()).d());
	System.out.println(new sınav3(new sınav3(new sınav3())).d());
	//System.out.println(new sınav3(new sınav3(new sınav3(new sınav3()))).d());
}
}

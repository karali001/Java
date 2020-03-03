package javacalisma;

public class calısma10 {
public static void main(String args[ ]) {
	ders d1=new ders("java","enes",10);
	ders d2=new ders("c++","enes",15);
	ders d3=new ders("sql","enes",20);
	ogrenci d4 =new ogrenci("enes","karali", new ders[] {d1,d2,d3});
	System.out.println("Öğrenci not ortalamasi:");
	System.out.println(d4.notOrtlaması());
}

}

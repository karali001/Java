package javacalisma;
import java.util.*;
public class calısma16 {
	public static void main(String args[]) {
		Date d1=new Date();
		d1.setDate(17);
		d1.setMonth(11);
		d1.setYear(1998);
		insan insan1=new insan("enes","karali",d1);
		System.out.println(insan1.yasHesapla());
		Date d2=new Date();
		d2.setDate(14);
		d2.setMonth(11);
		d2.setYear(1998);
		isci isci1=new isci("aleyna","urun",d2,"ktü","1");
		System.out.println(isci1.yasHesapla());
	}

}

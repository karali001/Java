package bütünleme;

public class Üçüncü_Bölüm_5 {
   public static void main(String argc[]) {
	   //String basit veri tipi değildir.Türetilmiştir.
	   String a="Enes Karali";
	   System.out.println("isim:"+a);
	   System.out.println(a.length());
	   String b="Ayşegül Akman";
	   System.out.println(b.length());
	   System.out.println(b.contains("ş"));//içinde varsa true döner.
	   System.out.println(b.contains("i"));
	   String c="Metehan Çoşkun";
	   System.out.println(c.length());
	   System.out.println(c.contains("t"));
	   System.out.println(c.contains("i"));
	   System.out.println(c.indexOf("h"));
	   System.out.println(" \n \n \n");
	   
	   String Ad="ENES";
	   String SoyAd="KARALİ";
	   System.out.println(Ad+" " +SoyAd);
	   String Sayı1="70";
	   String Sayı2="30";
	   System.out.println(Sayı1+Sayı2);
	   System.out.println("Aritmetik toplama="+(70+30));
	   
	   
	   
	   
   }
}

package udemy;

public class Öğrenci {
int ÖğrenciNo;
String isim;
byte sinif;
boolean aktif;

public Öğrenci() {
	System.out.print("Nesne oluşturuldu\n");
	aktif=true;
	
}
public void dersal() {
	System.out.println(	"Öğrenci ders alıyor.");
}
public void ÖğrenciBilgileriYazdir() {
	if(aktif) {
		System.out.println("Adi:"+isim+" numara:"+ÖğrenciNo+"sınıf:"+sinif);
	}
	else {
		System.out.print("Bu öğrenci aktif değildir.");
	}
}
public static void main(String args[]) {
	Öğrenci o1=new Öğrenci();
	o1.ÖğrenciBilgileriYazdir();
	Öğrenci o2=new Öğrenci();
	o2.isim="şaban";
	o2.aktif=false;
	o2.ÖğrenciBilgileriYazdir();
}
}

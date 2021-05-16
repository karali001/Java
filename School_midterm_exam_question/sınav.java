
//2016-2017 güz 11.soru
package tekrarlar;

public class sınav {
int n;
public sınav(int x) {
	n=x;
}
public int getN() {
	return n;
}
public sınav add(int x) {
	return new sınav(n+x);
}
}

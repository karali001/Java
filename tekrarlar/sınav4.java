package tekrarlar;

public class sınav4 {
sınav4 s;
static int n=0;
public sınav4(sınav4 x) {
	s=x;
	while(x !=null ){
		n+=2;
		x=x.s;
	}
}
}

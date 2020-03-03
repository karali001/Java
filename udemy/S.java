package udemy;

public class S {
S s;
static int n=0;
public S(S x) {
	s=x;
	while(x !=null) {
		n+=2;
		x=x.s;
	}
}
public static void main(String args[]) {
	S s=new S(new S(new S(new S(null))));
	//S s=new S(new S(new S(null)));
	System.out.println(s.n);
}
}

package udemy;

public class T {
static int x=0;
public T() {
	this(null);
}
public T(T t) {
 x++;
}
public int d() {
	return x;
}

public static void main(String args[]) {
//	System.out.println(new T().d());
	//System.out.println(new T(new T()).d());
	System.out.println(new T(new T(new T())).d());
	
}
}

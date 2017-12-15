import java.util.Collection;


public class A {
	
	public int m(Collection<String> c) {
		return c.size();
	}
	
	public int teste() {
		C c = new C();
		return m(c);
	}
	
//	
//	public static void main(String[] args) {
//		System.out.println(new A().teste());
//	}
}
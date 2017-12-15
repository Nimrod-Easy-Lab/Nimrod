import static java.lang.String.*;
public class A {
	
	public static String valueOf(int i) {
		return "42";
	}
	
	public int k() {
		return Integer.parseInt(valueOf(23));
	}

}

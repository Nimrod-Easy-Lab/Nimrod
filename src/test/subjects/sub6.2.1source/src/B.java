
public class B extends A{
	
	public int k(int i) {
		return 20;
	}
	
	public int test() {
		return new A().k(2);
	}
}

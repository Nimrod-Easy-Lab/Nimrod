
public class B extends A{
	
	private int k(int l) {
		return 42;
	}

	public int m() {
		return new B().k(2);
	}
	public int test() {
		return m();
	}
}

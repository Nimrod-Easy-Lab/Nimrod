
public class B extends A{
	
	public int k(int l) {
		return 42;
	}
	public int m() {
		return k(2);
	}
	public int test() {
		return m();
	}
}

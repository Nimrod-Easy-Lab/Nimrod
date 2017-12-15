
public class B extends A{
	
	public int k() {
		return 2;
	}
	
	public int m() {
		return super.k();
	}
	
	public int test() {
		return m();
	}
}

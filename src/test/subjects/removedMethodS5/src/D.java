
public class D {
	
	public int teste1() {
		C c = new C();
		return c.m();
	}
	
	public int teste2() {
		return teste1();
	}
	
	public int teste3() {
		return teste2();
	}
}

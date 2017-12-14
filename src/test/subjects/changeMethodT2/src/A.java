
public class A {
	
	 public double m() {
		
		double var = 2.0;
		try {
		for (int i = 0; i < 10; i++) {
			var = var/i;
		}
		}catch(ArithmeticException  e) {
			return 0;
		}
		return var;
	}
	


	




	

}

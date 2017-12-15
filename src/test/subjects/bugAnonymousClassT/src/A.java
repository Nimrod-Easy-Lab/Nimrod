
public class A{

	 private Runnable runner;
	 
	 private int f  =1;
		
     public void m() {
     
    	 runner = new Runnable() {
               public void run() {
                 	 z();
               }
    	 };
    	 runner.run();
     }
    
	
	void z() {
		setF(0);
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
     
//     public static void main(String[] args) {
//    
//    	A a = new A();
//    	a.m();
//	 System.out.println(a.getF());
//	}
}

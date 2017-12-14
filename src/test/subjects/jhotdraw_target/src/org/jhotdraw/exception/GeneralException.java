package org.jhotdraw.exception;

import javax.swing.JApplet;

@ExceptionHandler
public class GeneralException {

	public Object abstractLocatorClone(){
		throw new InternalError();
	}
	
	public void errPrintln(Object o) {
		System.err.println(o);
	}
	
	public void printStackTraceException(Exception e){
		e.printStackTrace();
	}
	
	public void showStatusApplet(JApplet a, String msg){
		a.showStatus(msg);
	}
	
	public void emptyBlock(){
		//emptyblock
	}

}

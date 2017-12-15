package org.jhotdraw.contrib.html;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;

@ExceptionHandler
public class HtmlHandler extends GeneralException {

	
	public String resourceContentProducerGetContent(Exception ex) {
		super.printStackTraceException(ex);
		return ex.toString();
	}
	
	public boolean stopDisposing(boolean disposingActive){
		return disposingActive = false;
	}
}

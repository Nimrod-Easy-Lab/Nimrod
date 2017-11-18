package org.jhotdraw.util;

import java.io.IOException;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;
import org.jhotdraw.framework.JHotDrawRuntimeException;

@ExceptionHandler
public class UtilHandler extends GeneralException {
	
	public void createCollectionsFactoryHandler(Exception e){
			throw new JHotDrawRuntimeException(e);
	}
	
	public Object loadImageResourceHandler () {
		return null;
	}
	
	public void trowIOException (String msg) throws IOException {
		throw new IOException(msg);
	}
}

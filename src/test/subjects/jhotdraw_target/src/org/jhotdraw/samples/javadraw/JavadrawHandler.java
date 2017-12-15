package org.jhotdraw.samples.javadraw;

import java.io.IOException;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;
import org.jhotdraw.framework.Drawing;

@ExceptionHandler
public class JavadrawHandler extends GeneralException {

	public void javaDrawViewerLoadDrawing(Drawing fDrawing, JavaDrawViewer jDV,
			IOException e) {
		fDrawing = jDV.createDrawing();
		super.errPrintln("Error when Loading: " + e);
		jDV.showStatus("Error when Loading: " + e);
	}

}

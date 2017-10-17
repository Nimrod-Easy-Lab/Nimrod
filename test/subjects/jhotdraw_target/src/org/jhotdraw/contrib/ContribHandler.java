package org.jhotdraw.contrib;

import javax.swing.JInternalFrame;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;

@ExceptionHandler
public class ContribHandler extends GeneralException {

	public void mDIDesktopPaneAddToDesktop(JInternalFrame frame) {
		frame.toBack();
	}
}

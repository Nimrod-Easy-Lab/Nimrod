package org.jhotdraw.contrib.dnd;

import java.awt.dnd.DropTargetDropEvent;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;

@ExceptionHandler
public class DndHandler extends GeneralException {

	public void dNDHelperDrop(DropTargetDropEvent dtde, NullPointerException npe) {
		super.printStackTraceException(npe);
		dtde.dropComplete(false);
	}
	
	public void dNDCreateDropTarget(NullPointerException npe){
		super.errPrintln("View Failed to initialize to DND.");
		super.errPrintln("Container likely did not have peer before the DropTarget was added");
		super.errPrintln(npe);
		super.printStackTraceException(npe);
	}
}

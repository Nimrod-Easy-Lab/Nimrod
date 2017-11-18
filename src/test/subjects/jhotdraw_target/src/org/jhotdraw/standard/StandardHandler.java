package org.jhotdraw.standard;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JOptionPane;

import org.jhotdraw.exception.ExceptionHandler;
import org.jhotdraw.exception.GeneralException;

@ExceptionHandler
public class StandardHandler extends GeneralException {

	public void selectAreaTrackerDrawXORRect(Graphics g) {
		g.dispose(); // SF bugtracker id: #490663
	}
	// esse printStackTrace não pode ser reusado juntamente com os outros
	// devido ser um trowable
	public void handleMouseEventException(Throwable t, Object object) {
		JOptionPane.showMessageDialog((Component) object, t.getClass().getName() + " - "
				+ t.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		t.printStackTrace();
	}

}

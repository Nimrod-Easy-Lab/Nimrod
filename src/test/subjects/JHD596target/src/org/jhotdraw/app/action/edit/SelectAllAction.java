/*
 * @(#)SelectAllAction.java
 *
 * Copyright (c) 1996-2009 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and  
 * contributors of the JHotDraw project ("the copyright holders").  
 * You may not use, copy or modify this software, except in  
 * accordance with the license agreement you entered into with  
 * the copyright holders. For details see accompanying license terms. 
 */

package org.jhotdraw.app.action.edit;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;
import org.jhotdraw.util.*;
import org.jhotdraw.app.EditableComponent;

/**
 * Selects all items.
 * <p>
 * This action acts on the last {@link org.jhotdraw.app.EditableComponent} /
 * {@code JTextComponent} which had the focus when the {@code ActionEvent}
 * was generated.
 * <p>
 * This action is called when the user selects the Select All item in the
 * Edit menu. The menu item is automatically created by the application.
 * <p>
 * If you want this behavior in your application, you have to create an action
 * with this ID and put it in your {@code ApplicationModel} in method
 * {@link org.jhotdraw.app.ApplicationModel#initApplication}.
 *
 * @author Werner Randelshofer.
 * @version $Id: SelectAllAction.java 594 2009-12-21 23:32:52Z rawcoder $
 */
public class SelectAllAction extends AbstractAction {
    public final static String ID = "edit.selectAll";
    
    /** Creates a new instance. */
    public SelectAllAction() {
        ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.app.Labels");
        labels.configureAction(this, ID);
    }
    
    public void actionPerformed(ActionEvent evt) {
        Component focusOwner = KeyboardFocusManager.
                getCurrentKeyboardFocusManager().
                getPermanentFocusOwner();
        if (focusOwner != null) {
            if (focusOwner instanceof EditableComponent) {
                ((EditableComponent) focusOwner).selectAll();
            } else if (focusOwner instanceof JTextComponent) {
                ((JTextComponent) focusOwner).selectAll();
            } else {
                focusOwner.getToolkit().beep();
            }
        }
    }
}

/*
 * @(#)AbstractFindAction.java
 *
 * Copyright (c) 2005 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and
 * contributors of the JHotDraw project ("the copyright holders").
 * You may not use, copy or modify this software, except in
 * accordance with the license agreement you entered into with
 * the copyright holders. For details see accompanying license terms.
 */

package org.jhotdraw.samples.teddy.action;

import org.jhotdraw.app.*;
import org.jhotdraw.samples.teddy.*;
import org.jhotdraw.util.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * AbstractFindAction shows the find dialog.
 *
 * @author Werner Randelshofer
 * @version $Id: FindAction.java 595 2009-12-22 18:06:07Z rawcoder $
 */
public class FindAction extends AbstractAction {
    public final static String ID = org.jhotdraw.app.action.edit.AbstractFindAction.ID;
    private FindDialog findDialog;
    private Application app;
    private ResourceBundleUtil labels =
            ResourceBundleUtil.getBundle("org.jhotdraw.samples.teddy.Labels");
    
    /**
     * Creates a new instance.
     */
    public FindAction(Application app) {
        this.app = app;
        labels.configureAction(this, ID);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (findDialog == null) {
            findDialog = new FindDialog(app);
            if (app instanceof OSXApplication) {
                findDialog.addWindowListener(new WindowAdapter() {
                    @Override public void windowClosing(WindowEvent evt) {
                        if (findDialog != null) {
                            ((OSXApplication) app).removePalette(findDialog);
                            findDialog.setVisible(false);
                        }
                    }
                });
            }
        }
        findDialog.setVisible(true);
        if (app instanceof OSXApplication) {
            ((OSXApplication) app).addPalette(findDialog);
        }
    }
}

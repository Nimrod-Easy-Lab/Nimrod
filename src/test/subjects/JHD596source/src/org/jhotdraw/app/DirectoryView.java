/*
 * @(#)DirectoryView.java
 * 
 * Copyright (c) 2009 by the original authors of JHotDraw
 * and all its contributors.
 * All rights reserved.
 *
 * The copyright of this software is owned by the authors and
 * contributors of the JHotDraw project ("the copyright holders").
 * You may not use, copy or modify this software, except in
 * accordance with the license agreement you entered into with
 * the copyright holders. For details see accompanying license terms.
 */

package org.jhotdraw.app;

import org.jhotdraw.gui.URIChooser;

/**
 * The interface of a {@link View} which can open a directory.
 *
 * <hr>
 * <b>Design Patterns</b>
 *
 * <p><em>Framework</em><br>
 * The interfaces and classes listed below define together the contracts
 * of a smaller framework inside of the JHotDraw framework for document oriented
 * applications.<br>
 * Contract: {@link DirectoryView}, {@link org.jhotdraw.app.action.file.LoadDirectoryAction}.
 * <hr>
 *
 * @author Werner Randelshofer, Staldenmattweg 2, CH-6405 Immensee
 * @version $Id: DirectoryView.java 594 2009-12-21 23:32:52Z rawcoder $
 */
public interface DirectoryView extends View {
    /**
     * Gets the chooser for opening a directory for the view.
     */
    public URIChooser getOpenDirectoryChooser();
}

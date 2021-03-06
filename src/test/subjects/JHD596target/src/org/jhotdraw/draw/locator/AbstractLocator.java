/*
 * @(#)AbstractLocator.java
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

package org.jhotdraw.draw.locator;

import org.jhotdraw.draw.*;
import org.jhotdraw.draw.locator.Locator;
import java.awt.geom.*;
import java.io.Serializable;
import org.jhotdraw.xml.*;
/**
 * This abstract class can be extended to implement a {@link Locator}.
 *
 * @author Werner Randelshofer
 * @version $Id: AbstractLocator.java 592 2009-12-21 13:30:39Z rawcoder $
 */
public abstract class AbstractLocator implements Locator, DOMStorable, Serializable {
    
    /** Creates a new instance. */
    public AbstractLocator() {
    }
    
    public Point2D.Double locate(Figure owner, Figure dependent) {
        return locate(owner);
    }
    
    
}

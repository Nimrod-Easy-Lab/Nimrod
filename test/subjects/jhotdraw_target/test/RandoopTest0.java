
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(RandoopTest0.class);
  }

  public void test1() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();

  }

  public void test2() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();

  }

  public void test3() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test4() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);

  }

  public void test5() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var1 = var0.listener();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test6() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();

  }

  public void test7() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test8() throws Throwable {

    java.lang.String var0 = "hi!";
    java.lang.String var1 = org.jhotdraw.util.VersionManagement.normalizePackageName(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("hi!"));

  }

  public void test9() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));

  }

  public void test10() throws Throwable {

    int var0 = (-1);
    org.jhotdraw.figures.TextFigure.setCurrentFontStyle(var0);

  }

  public void test11() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);

  }

  public void test12() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    java.awt.Dimension var3 = var0.size();

  }

  public void test13() throws Throwable {

    org.jhotdraw.contrib.PolygonFigure var0 = new org.jhotdraw.contrib.PolygonFigure();

  }

  public void test14() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);

  }

  public void test15() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));

  }

  public void test16() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test17() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test18() throws Throwable {

    org.jhotdraw.figures.FigureAttributes var0 = new org.jhotdraw.figures.FigureAttributes();

  }

  public void test19() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);

  }

  public void test20() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test21() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();

  }

  public void test22() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    int var5 = var2.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test23() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test24() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test25() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    java.lang.String var5 = "";
    int var6 = (-1);
    int var7 = 0;
    var2.firePropertyChange(var5, var6, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test26() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();

  }

  public void test27() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Dimension var7 = var6.getMinimumSize();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test28() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.Figure var4 = var3.nextFigure();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }

  }

  public void test29() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    int var3 = var1.getZValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test30() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test31() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setGlassPane((java.awt.Component)var12);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test32() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test33() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);

  }

  public void test34() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test35() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test36() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();

  }

  public void test37() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));

  }

  public void test38() throws Throwable {

    org.jhotdraw.contrib.FloatingTextArea var0 = new org.jhotdraw.contrib.FloatingTextArea();

  }

  public void test39() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.freezeView();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test40() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);

  }

  public void test41() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();

  }

  public void test42() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    int var3 = 100;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.removePointAt(var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test43() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test44() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.framework.Handle var5 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var2);

  }

  public void test45() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test46() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();

  }

  public void test47() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    java.awt.peer.ComponentPeer var5 = var2.getPeer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test48() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    java.awt.Dimension var5 = var2.getSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test49() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.framework.Figure var2 = var1.owner();

  }

  public void test50() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test51() throws Throwable {

    org.jhotdraw.contrib.html.ResourceManagerNotSetException var0 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();

  }

  public void test52() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test53() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);

  }

  public void test54() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    java.awt.Color var8 = var6.getForeground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test55() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.standard.StandardDrawingView var13 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var11, var12);
    var13.clearSelection();
    java.awt.Color var15 = var13.getForeground();
    var6.setBackground(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test56() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    int var3 = var1.getZValue();
    java.lang.Object var4 = var1.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test57() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    int var3 = var1.getZValue();
    java.lang.Object var4 = var1.clone();
    org.jhotdraw.standard.TextHolder var5 = var1.getTextHolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test58() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test59() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    java.lang.String var5 = "";
    int var6 = (-1);
    int var7 = 0;
    var2.firePropertyChange(var5, var6, var7);
    int var9 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var10 = var2.areFocusTraversalKeysSet(var9);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test60() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    int var2 = 1;
    int var3 = (-1);
    boolean var4 = var0.containsPoint(var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test61() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JRootPane var8 = var6.getRootPane();
    javax.swing.JLayeredPane var9 = var6.getLayeredPane();
    int var10 = (-1);
    int var11 = 0;
    org.jhotdraw.standard.StandardDrawingView var12 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var6, var10, var11);
    var12.clearSelection();
    java.awt.Color var14 = var12.getForeground();
    var0.setFillColor(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test62() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    boolean var11 = var3.isDisplayable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test63() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var1 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var0);

  }

  public void test64() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    int var7 = var2.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test65() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);

  }

  public void test66() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    int var3 = var1.getZValue();
    java.lang.Object var4 = var1.clone();
    org.jhotdraw.standard.TextHolder var5 = var1.getTextHolder();
    java.lang.String var6 = "";
    java.lang.Object var7 = var1.getAttribute(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test67() throws Throwable {

    int var0 = 0;
    int var1 = 0;
    int var2 = 0;
    int var3 = 10;
    int var4 = 1;
    int var5 = 0;
    double var6 = org.jhotdraw.util.Geom.distanceFromLine(var0, var1, var2, var3, var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test68() throws Throwable {

    int var0 = 10;
    org.jhotdraw.figures.TextFigure.setCurrentFontSize(var0);

  }

  public void test69() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test70() throws Throwable {

    org.jhotdraw.contrib.ChopDiamondConnector var0 = new org.jhotdraw.contrib.ChopDiamondConnector();

  }

  public void test71() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test72() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test73() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test74() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test75() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var2 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var3 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var2);
    var0.addDependendFigure((org.jhotdraw.framework.Figure)var2);

  }

  public void test76() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test77() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JRootPane var8 = var6.getRootPane();
    javax.swing.JLayeredPane var9 = var6.getLayeredPane();
    int var10 = (-1);
    int var11 = 0;
    org.jhotdraw.standard.StandardDrawingView var12 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var6, var10, var11);
    var12.clearSelection();
    java.awt.Color var14 = var12.getForeground();
    var0.setFillColor(var14);
    java.awt.Rectangle var16 = var0.displayBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test78() throws Throwable {

    org.jhotdraw.contrib.ClippingUpdateStrategy var0 = new org.jhotdraw.contrib.ClippingUpdateStrategy();

  }

  public void test79() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var1 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var0);
    org.jhotdraw.contrib.html.ContentProducerRegistry var2 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    var0.setParent(var2);

  }

  public void test80() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);

  }

  public void test81() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test82() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var1 = var0.connectionInsets();

  }

  public void test83() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Container var9 = var6.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test84() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.awt.Graphics var4 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test85() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 100;
    int var13 = (-1);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.Figure var23 = var0.findFigureInsideWithout(var12, var13, (org.jhotdraw.framework.Figure)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test86() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    int var9 = 1;
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var9, var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test87() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    org.jhotdraw.standard.StandardDrawing var5 = new org.jhotdraw.standard.StandardDrawing();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    int var11 = 1;
    int var12 = 1;
    org.jhotdraw.contrib.PolygonFigure var13 = new org.jhotdraw.contrib.PolygonFigure(var11, var12);
    org.jhotdraw.framework.FigureEnumeration var14 = var13.figures();
    java.awt.Rectangle var15 = var13.displayBox();
    org.jhotdraw.framework.Figure var16 = var5.findFigure(var10, (org.jhotdraw.framework.Figure)var13);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.newWindow((org.jhotdraw.framework.Drawing)var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test88() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    boolean var12 = var10.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    int var16 = var14.getZValue();
    java.lang.Object var17 = var14.clone();
    org.jhotdraw.standard.CreationTool var18 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.Figure)var14);
    int var19 = 1;
    int var20 = 0;
    org.jhotdraw.standard.StandardDrawingView var21 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var19, var20);
    var6.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);

  }

  public void test89() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 100;
    int var13 = (-1);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.Figure var23 = var0.findFigureInsideWithout(var12, var13, (org.jhotdraw.framework.Figure)var22);
    java.util.Iterator var24 = var0.drawingChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);

  }

  public void test90() throws Throwable {

    int var0 = org.jhotdraw.util.ColorMap.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == 15);

  }

  public void test91() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    boolean var13 = var10.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test92() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test93() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test94() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var14 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var12, (org.jhotdraw.framework.FigureChangeListener)var13);
    java.awt.Dimension var15 = var12.size();
    var0.setPreferredSize(var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test95() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    java.awt.Color var8 = var6.getForeground();
    java.lang.String var9 = org.jhotdraw.contrib.html.HTMLColorContentProducer.getHTMLColorCode(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9.equals("#333333"));

  }

  public void test96() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.framework.Tool var12 = var10.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test97() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test98() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.awt.Graphics var4 = var0.getGraphics();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var0.setLocationByPlatform(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test99() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    boolean var9 = var6.isDoubleBuffered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test100() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();

  }

  public void test101() throws Throwable {

    int var0 = 100;
    int var1 = 100;
    org.jhotdraw.standard.GridConstrainer var2 = new org.jhotdraw.standard.GridConstrainer(var0, var1);

  }

  public void test102() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    int var11 = var3.highestLayer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-30000));

  }

  public void test103() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    boolean var12 = var10.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    int var16 = var14.getZValue();
    java.lang.Object var17 = var14.clone();
    org.jhotdraw.standard.CreationTool var18 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.Figure)var14);
    int var19 = 1;
    int var20 = 0;
    org.jhotdraw.standard.StandardDrawingView var21 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var19, var20);
    var6.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var23 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var24 = var23.isDoubleBuffered();
    javax.swing.JRootPane var25 = var23.getRootPane();
    javax.swing.JLayeredPane var26 = var23.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    java.awt.Component var34 = var23.add((java.awt.Component)var33);
    org.jhotdraw.framework.Tool var35 = var33.tool();
    org.jhotdraw.contrib.dnd.JHDDropTargetListener var36 = new org.jhotdraw.contrib.dnd.JHDDropTargetListener((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.DrawingView)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test104() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.figureSelectionChanged((org.jhotdraw.framework.DrawingView)var14);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test105() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test106() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);

  }

  public void test107() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test108() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    int var10 = 100;
    int var11 = 100;
    org.jhotdraw.standard.GridConstrainer var12 = new org.jhotdraw.standard.GridConstrainer(var10, var11);
    var6.setConstrainer((org.jhotdraw.framework.PointConstrainer)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test109() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();

  }

  public void test110() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    int var5 = (-1);
    int var6 = 0;
    org.jhotdraw.standard.StandardDrawingView var7 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var5, var6);
    var7.clearSelection();
    org.jhotdraw.util.UndoableAdapter var9 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var7);
    var0.removeDrawingChangeListener((org.jhotdraw.framework.DrawingChangeListener)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test111() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    java.awt.Dimension var5 = var2.getSize();
    boolean var6 = javax.swing.JComponent.isLightweightComponent((java.awt.Component)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test112() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    boolean var12 = var10.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    int var16 = var14.getZValue();
    java.lang.Object var17 = var14.clone();
    org.jhotdraw.standard.CreationTool var18 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.Figure)var14);
    int var19 = 1;
    int var20 = 0;
    org.jhotdraw.standard.StandardDrawingView var21 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var19, var20);
    var6.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var10);
    org.jhotdraw.standard.StandardDrawing var23 = new org.jhotdraw.standard.StandardDrawing();
    int var24 = 1;
    int var25 = 1;
    org.jhotdraw.contrib.PolygonFigure var26 = new org.jhotdraw.contrib.PolygonFigure(var24, var25);
    org.jhotdraw.framework.FigureEnumeration var27 = var26.figures();
    java.awt.Rectangle var28 = var26.displayBox();
    int var29 = 1;
    int var30 = 1;
    org.jhotdraw.contrib.PolygonFigure var31 = new org.jhotdraw.contrib.PolygonFigure(var29, var30);
    org.jhotdraw.framework.FigureEnumeration var32 = var31.figures();
    java.awt.Rectangle var33 = var31.displayBox();
    org.jhotdraw.framework.Figure var34 = var23.findFigure(var28, (org.jhotdraw.framework.Figure)var31);
    int var35 = 100;
    int var36 = (-1);
    java.lang.Double var37 = new java.lang.Double((-1.0d));
    java.lang.Double var38 = new java.lang.Double(100.0d);
    java.lang.Double var39 = new java.lang.Double(1.0d);
    java.awt.Point var40 = org.jhotdraw.util.Geom.polarToPoint(var37, var38, var39);
    java.lang.Double var41 = new java.lang.Double((-1.0d));
    java.lang.Double var42 = new java.lang.Double(100.0d);
    java.lang.Double var43 = new java.lang.Double(1.0d);
    java.awt.Point var44 = org.jhotdraw.util.Geom.polarToPoint(var41, var42, var43);
    org.jhotdraw.contrib.DiamondFigure var45 = new org.jhotdraw.contrib.DiamondFigure(var40, var44);
    org.jhotdraw.framework.Figure var46 = var23.findFigureInsideWithout(var35, var36, (org.jhotdraw.framework.Figure)var45);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.newWindow((org.jhotdraw.framework.Drawing)var23);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);

  }

  public void test113() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    boolean var9 = var6.isDoubleBuffered();
    int var10 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Component var11 = var6.getComponent(var10);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);

  }

  public void test114() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    org.jhotdraw.framework.DrawingView var11 = var8.getDrawingView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test115() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test116() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test117() throws Throwable {

    int var0 = 100;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.FigureAttributeConstant var1 = org.jhotdraw.framework.FigureAttributeConstant.getConstant(var0);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test118() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    java.awt.Color var1 = var0.getBorderColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test119() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    var2.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test120() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();

  }

  public void test121() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.standard.StandardDrawingView var13 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var11, var12);
    var13.clearSelection();
    java.awt.Color var15 = var13.getForeground();
    var6.setBackground(var15);
    org.jhotdraw.framework.FigureEnumeration var17 = var6.selectionZOrdered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test122() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test123() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = var2.getLabel();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4.equals("Look'n'Feel"));

  }

  public void test124() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    var0.basicDisplayBox(var4, var8);

  }

  public void test125() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();

  }

  public void test126() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test127() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();

  }

  public void test128() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.newView();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test129() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    java.awt.Rectangle var7 = var0.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test130() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.framework.Figure var2 = var1.owner();
    int var3 = (-1);
    int var4 = 100;
    boolean var5 = var1.containsPoint(var3, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test131() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var1 = var0.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var2 = var0.handles();

  }

  public void test132() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var1 = var0.handles();

  }

  public void test133() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    boolean var24 = var23.isActivated();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test134() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    boolean var11 = var8.undo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test135() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test136() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.undo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test137() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();

  }

  public void test138() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);

  }

  public void test139() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test140() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.standard.StandardDrawingView var13 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var11, var12);
    var13.clearSelection();
    java.awt.Color var15 = var13.getForeground();
    var6.setBackground(var15);
    org.jhotdraw.framework.FigureEnumeration var17 = var6.selectionZOrdered();
    var17.reset();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test141() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var1 = 1;
    int var2 = 0;
    boolean var3 = var0.containsPoint(var1, var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test142() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    var8.basicDisplayBox(var13, var17);

  }

  public void test143() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    var2.removeNotify();
    int var6 = 0;
    //gustavo//timeout exception

  }

  public void test144() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    int var7 = var2.getX();
    boolean var8 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test145() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();
    int var1 = var0.getZValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test146() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    int var11 = var3.highestLayer();
    var3.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == (-30000));

  }

  public void test147() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.standard.StandardDrawingView var13 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var11, var12);
    var13.clearSelection();
    java.awt.Color var15 = var13.getForeground();
    var6.setBackground(var15);
    org.jhotdraw.framework.FigureEnumeration var17 = var6.selectionZOrdered();
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    int var22 = (-1);
    int var23 = 0;
    org.jhotdraw.standard.StandardDrawingView var24 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var18, var22, var23);
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    javax.swing.JLayeredPane var28 = var25.getLayeredPane();
    int var29 = (-1);
    int var30 = 0;
    org.jhotdraw.standard.StandardDrawingView var31 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var25, var29, var30);
    var31.clearSelection();
    java.awt.Color var33 = var31.getForeground();
    var24.setBackground(var33);
    org.jhotdraw.framework.FigureEnumeration var35 = var24.selectionZOrdered();
    var6.addToSelectionAll(var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);

  }

  public void test148() throws Throwable {

    java.lang.Character var0 = new java.lang.Character(' ');
    org.jhotdraw.contrib.html.DisposableResourceHolder var1 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var0);

  }

  public void test149() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    java.awt.event.WindowListener[] var3 = var0.getWindowListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test150() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test151() throws Throwable {

    org.jhotdraw.contrib.html.ResourceManagerNotSetException var0 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    org.jhotdraw.contrib.html.ResourceManagerNotSetException var1 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    java.lang.Throwable var2 = var0.initCause((java.lang.Throwable)var1);

  }

  public void test152() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.Rectangle var15 = var3.getBounds();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test153() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var2.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test154() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.framework.Handle var5 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var2);
    int var6 = (-1);
    int var7 = (-1);
    boolean var8 = var5.containsPoint(var6, var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test155() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);

  }

  public void test156() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test157() throws Throwable {

    org.jhotdraw.contrib.Helper var0 = new org.jhotdraw.contrib.Helper();

  }

  public void test158() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.promptOpen();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test159() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test160() throws Throwable {

    org.jhotdraw.figures.ShortestDistanceConnector var0 = new org.jhotdraw.figures.ShortestDistanceConnector();

  }

  public void test161() throws Throwable {

    int var0 = 0;
    org.jhotdraw.util.PaletteLayout var1 = new org.jhotdraw.util.PaletteLayout(var0);

  }

  public void test162() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    var4.deactivate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test163() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    var0.doLayout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test164() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    java.awt.FocusTraversalPolicy var7 = var2.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test165() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    org.jhotdraw.contrib.GraphicalCompositeFigure var8 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var9 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var10 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var8, (org.jhotdraw.framework.FigureChangeListener)var9);
    java.awt.Dimension var11 = var8.size();
    java.awt.Dimension var12 = var0.getSize(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test166() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test167() throws Throwable {

    java.awt.Window[] var0 = java.awt.Window.getWindows();

  }

  public void test168() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    int var44 = javax.swing.JLayeredPane.getLayer((javax.swing.JComponent)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test169() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = var0.getFileDescription();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));

  }

  public void test170() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.awt.Graphics var4 = var0.getGraphics();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var0.setLocationByPlatform(var5);
    org.jhotdraw.standard.StandardDrawing var7 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    java.lang.Double var13 = new java.lang.Double(100.0d);
    java.lang.Double var14 = new java.lang.Double(1.0d);
    java.awt.Point var15 = org.jhotdraw.util.Geom.polarToPoint(var12, var13, var14);
    org.jhotdraw.contrib.DiamondFigure var16 = new org.jhotdraw.contrib.DiamondFigure(var11, var15);
    org.jhotdraw.framework.HandleEnumeration var17 = var16.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var19 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var20 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var18, (org.jhotdraw.framework.FigureChangeListener)var19);
    org.jhotdraw.framework.Figure var21 = var7.replace((org.jhotdraw.framework.Figure)var16, (org.jhotdraw.framework.Figure)var18);
    org.jhotdraw.framework.Handle var22 = org.jhotdraw.standard.BoxHandleKit.north(var21);
    org.jhotdraw.standard.HandleTracker var23 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var0, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test171() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.Rectangle var15 = var3.getBounds();
    boolean var16 = var3.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == true);

  }

  public void test172() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getPressedIcon();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test173() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test174() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    java.lang.String var8 = var7.getUIClassID();
    java.awt.Insets var9 = var7.getInsets();
    int var10 = (-1);
    var4.setPosition((java.awt.Component)var7, var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    int var14 = 0;
    var4.setLayer((java.awt.Component)var12, var14);
    org.jhotdraw.figures.UngroupCommand var16 = new org.jhotdraw.figures.UngroupCommand(var0, (org.jhotdraw.framework.DrawingEditor)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test175() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test176() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    boolean var13 = var10.requestDefaultFocus();
    java.lang.String var14 = "hi!";
    java.lang.Character var15 = new java.lang.Character(' ');
    java.lang.Character var16 = new java.lang.Character(' ');
    var10.firePropertyChange(var14, var15, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test177() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    boolean var11 = var3.isDisplayable();
    java.lang.Boolean var12 = new java.lang.Boolean(true);
    var3.enable(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test178() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Character var4 = new java.lang.Character('a');
    java.lang.Character var5 = new java.lang.Character(' ');
    var0.firePropertyChange(var3, var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test179() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test180() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    java.awt.Component var38 = var27.add((java.awt.Component)var37);
    boolean var39 = var37.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var42 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var40, (org.jhotdraw.framework.FigureChangeListener)var41);
    java.awt.Dimension var43 = var40.size();
    var37.removeFromSelection((org.jhotdraw.framework.Figure)var40);
    var40.layout();
    java.lang.Object var46 = var40.clone();
    int var47 = 1;
    int var48 = 1;
    org.jhotdraw.contrib.PolygonFigure var49 = new org.jhotdraw.contrib.PolygonFigure(var47, var48);
    org.jhotdraw.framework.FigureEnumeration var50 = var49.figures();
    java.awt.Rectangle var51 = var49.displayBox();
    org.jhotdraw.framework.Figure var52 = var17.replace((org.jhotdraw.framework.Figure)var40, (org.jhotdraw.framework.Figure)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test181() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    java.awt.Color var3 = var1.getForeground();
    var0.setBorderColor(var3);

  }

  public void test182() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);
    java.lang.Exception var2 = var1.getNestedException();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test183() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test184() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.framework.FigureChangeEvent var20 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test185() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    var4.deactivate();
    java.lang.Boolean var6 = new java.lang.Boolean(true);
    var4.setEnabled(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test186() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    int var10 = 100;
    int var11 = 100;
    org.jhotdraw.standard.GridConstrainer var12 = new org.jhotdraw.standard.GridConstrainer(var10, var11);
    var6.setConstrainer((org.jhotdraw.framework.PointConstrainer)var12);
    java.lang.Long var14 = new java.lang.Long(1L);
    int var15 = 10;
    int var16 = 1;
    int var17 = 10;
    int var18 = 0;
    var6.repaint(var14, var15, var16, var17, var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test187() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    var10.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test188() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test189() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test190() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getPressedIcon();
    boolean var4 = var2.isSelected();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test191() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test192() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    boolean var5 = var2.isContentAreaFilled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test193() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.setFocusCycleRoot(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test194() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    org.jhotdraw.framework.DrawingEditor var10 = var6.editor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test195() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var1 = var0.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var2 = var0.handles();
    var0.release();

  }

  public void test196() throws Throwable {

    java.lang.String var0 = "hi!";
    java.lang.Float var1 = new java.lang.Float(1.0f);
    org.jhotdraw.contrib.MDI_DrawApplication var2 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var3 = var2.isDoubleBuffered();
    java.awt.Container var4 = var2.getFocusCycleRootAncestor();
    org.jhotdraw.contrib.zoom.ZoomCommand var5 = new org.jhotdraw.contrib.zoom.ZoomCommand(var0, var1, (org.jhotdraw.framework.DrawingEditor)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test197() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.destroy();

  }

  public void test198() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    java.lang.String var13 = "";
    java.lang.Character var14 = new java.lang.Character(' ');
    org.jhotdraw.contrib.html.DisposableResourceHolder var15 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var14);
    var2.setAttribute(var13, (java.lang.Object)var15);

  }

  public void test199() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = "";
    int var5 = 100;
    var2.insert(var4, var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test200() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    java.lang.Boolean var13 = new java.lang.Boolean(true);
    var10.setEnabled(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test201() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    boolean var24 = var23.isActivated();
    var23.deactivate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test202() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    int var5 = var2.getX();
    var2.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test203() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    int var7 = var2.getX();
    java.awt.Container var8 = var2.getTopLevelAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test204() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    var2.revalidate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test205() throws Throwable {

    org.jhotdraw.figures.RectangleFigure var0 = new org.jhotdraw.figures.RectangleFigure();

  }

  public void test206() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    java.util.Iterator var15 = var0.drawingChangeListeners();

  }

  public void test207() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    boolean var2 = var0.isFocusTraversalPolicySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test208() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    boolean var12 = var10.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    int var16 = var14.getZValue();
    java.lang.Object var17 = var14.clone();
    org.jhotdraw.standard.CreationTool var18 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.Figure)var14);
    int var19 = 1;
    int var20 = 0;
    org.jhotdraw.standard.StandardDrawingView var21 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var19, var20);
    var6.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var23 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var24 = var23.isDoubleBuffered();
    javax.swing.JRootPane var25 = var23.getRootPane();
    javax.swing.JLayeredPane var26 = var23.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    java.awt.Component var34 = var23.add((java.awt.Component)var33);
    org.jhotdraw.framework.Tool var35 = var33.tool();
    org.jhotdraw.contrib.dnd.JHDDropTargetListener var36 = new org.jhotdraw.contrib.dnd.JHDDropTargetListener((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.DrawingView)var33);
    java.awt.Insets var37 = var33.getInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test209() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var2 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var3 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var2);
    var0.addDependendFigure((org.jhotdraw.framework.Figure)var2);
    org.jhotdraw.framework.Handle var5 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var2);

  }

  public void test210() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 100;
    int var13 = (-1);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.Figure var23 = var0.findFigureInsideWithout(var12, var13, (org.jhotdraw.framework.Figure)var22);
    java.util.Iterator var24 = var0.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    javax.swing.JLayeredPane var28 = var25.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    java.awt.Component var36 = var25.add((java.awt.Component)var35);
    boolean var37 = var35.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var39 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var40 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var38, (org.jhotdraw.framework.FigureChangeListener)var39);
    java.awt.Dimension var41 = var38.size();
    var35.removeFromSelection((org.jhotdraw.framework.Figure)var38);
    var38.layout();
    java.lang.Object var44 = var38.clone();
    org.jhotdraw.framework.FigureChangeEvent var45 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var38);
    var0.figureRequestUpdate(var45);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test211() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    int var5 = (-1);
    int var6 = 0;
    org.jhotdraw.standard.StandardDrawingView var7 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var5, var6);
    int var8 = 0;
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var8, var9);
    org.jhotdraw.util.RedoCommand var11 = new org.jhotdraw.util.RedoCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test212() throws Throwable {

    org.jhotdraw.contrib.html.URLContentProducer var0 = new org.jhotdraw.contrib.html.URLContentProducer();

  }

  public void test213() throws Throwable {

    org.jhotdraw.util.collections.jdk11.SetWrapper var0 = new org.jhotdraw.util.collections.jdk11.SetWrapper();

  }

  public void test214() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    var0.open();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test215() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var1 = var0.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var2 = var0.handles();
    org.jhotdraw.framework.HandleEnumeration var3 = var0.handles();

  }

  public void test216() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.layout();
    int var9 = var6.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);

  }

  public void test217() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    int var44 = javax.swing.JLayeredPane.getLayer((javax.swing.JComponent)var34);
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JMenu var47 = var45.createLookAndFeelMenu();
    java.lang.Character var48 = new java.lang.Character('a');
    var47.setMnemonic(var48);
    org.jhotdraw.contrib.MDI_DrawApplication var50 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var51 = var50.isDoubleBuffered();
    javax.swing.JRootPane var52 = var50.getRootPane();
    javax.swing.JLayeredPane var53 = var50.getLayeredPane();
    int var54 = (-1);
    int var55 = 0;
    org.jhotdraw.standard.StandardDrawingView var56 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var50, var54, var55);
    var56.clearSelection();
    var34.add((java.awt.Component)var47, (java.lang.Object)var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test218() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test219() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    boolean var11 = var3.isDisplayable();
    java.lang.Boolean var12 = new java.lang.Boolean(true);
    var3.enable(var12);
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    javax.swing.JLayeredPane var17 = var14.getLayeredPane();
    int var18 = (-1);
    int var19 = 0;
    org.jhotdraw.standard.StandardDrawingView var20 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var14, var18, var19);
    var20.clearSelection();
    var20.requestFocus();
    boolean var23 = var20.isDoubleBuffered();
    int var24 = var3.getLayer((java.awt.Component)var20);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == 0);

  }

  public void test220() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    java.lang.Boolean var24 = new java.lang.Boolean(true);
    var23.setEnabled(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test221() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);
    org.jhotdraw.framework.JHotDrawException var2 = new org.jhotdraw.framework.JHotDrawException((java.lang.Exception)var1);

  }

  public void test222() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.application.DrawApplication var1 = new org.jhotdraw.application.DrawApplication(var0);

  }

  public void test223() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.isRedoable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test224() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    var4.deactivate();
    var4.activate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test225() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.undo();
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var8.setUndoable(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test226() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var48 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var47);
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var50 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var49);
    var47.addDependendFigure((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.framework.Handle var52 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    org.jhotdraw.contrib.MDI_DrawApplication var60 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var61 = var60.isDoubleBuffered();
    javax.swing.JRootPane var62 = var60.getRootPane();
    javax.swing.JLayeredPane var63 = var60.getLayeredPane();
    int var64 = (-1);
    int var65 = 0;
    org.jhotdraw.standard.StandardDrawingView var66 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var60, var64, var65);
    var66.clearSelection();
    java.awt.Color var68 = var66.getForeground();
    var59.setBackground(var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var59.selectionZOrdered();
    org.jhotdraw.contrib.MDI_DrawApplication var71 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var72 = var71.isDoubleBuffered();
    javax.swing.JRootPane var73 = var71.getRootPane();
    javax.swing.JLayeredPane var74 = var71.getLayeredPane();
    int var75 = (-1);
    int var76 = 0;
    org.jhotdraw.standard.StandardDrawingView var77 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var71, var75, var76);
    org.jhotdraw.contrib.MDI_DrawApplication var78 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var79 = var78.isDoubleBuffered();
    javax.swing.JRootPane var80 = var78.getRootPane();
    javax.swing.JLayeredPane var81 = var78.getLayeredPane();
    int var82 = (-1);
    int var83 = 0;
    org.jhotdraw.standard.StandardDrawingView var84 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var78, var82, var83);
    var84.clearSelection();
    java.awt.Color var86 = var84.getForeground();
    var77.setBackground(var86);
    org.jhotdraw.framework.FigureEnumeration var88 = var77.selectionZOrdered();
    var59.addToSelectionAll(var88);
    boolean var90 = var22.figureExists((org.jhotdraw.framework.Figure)var49, var88);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test227() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    java.lang.Double var25 = new java.lang.Double((-1.0d));
    java.lang.Double var26 = new java.lang.Double(100.0d);
    java.lang.Double var27 = new java.lang.Double(1.0d);
    java.awt.Point var28 = org.jhotdraw.util.Geom.polarToPoint(var25, var26, var27);
    java.awt.Component var29 = var0.getComponentAt(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

  public void test228() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test229() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    java.awt.event.WindowListener[] var3 = var0.getWindowListeners();
    java.lang.String var4 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.showStatus(var4);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test230() throws Throwable {

    org.jhotdraw.contrib.FloatingTextArea var0 = new org.jhotdraw.contrib.FloatingTextArea();
    int var1 = 1;
    java.awt.Dimension var2 = var0.getPreferredSize(var1);

  }

  public void test231() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    var8.basicDisplayBox(var13, var17);
    org.jhotdraw.standard.TextHolder var19 = var8.getTextHolder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test232() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.figures.EllipseFigure var8 = new org.jhotdraw.figures.EllipseFigure(var3, var7);

  }

  public void test233() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var14 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var12, (org.jhotdraw.framework.FigureChangeListener)var13);
    java.awt.Dimension var15 = var12.size();
    var0.setPreferredSize(var15);
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var18 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var17);
    org.jhotdraw.contrib.GraphicalCompositeFigure var19 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var20 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var19);
    var17.addDependendFigure((org.jhotdraw.framework.Figure)var19);
    org.jhotdraw.framework.Handle var22 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var19);
    org.jhotdraw.standard.CreationTool var23 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test234() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.framework.Tool var12 = var10.tool();
    java.lang.String var13 = var10.getName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);

  }

  public void test235() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    java.lang.Double var25 = new java.lang.Double((-1.0d));
    java.lang.Double var26 = new java.lang.Double(100.0d);
    java.lang.Double var27 = new java.lang.Double(1.0d);
    java.awt.Point var28 = org.jhotdraw.util.Geom.polarToPoint(var25, var26, var27);
    java.awt.Component var29 = var0.getComponentAt(var28);
    java.lang.Boolean var30 = new java.lang.Boolean(false);
    var0.setFocusTraversalPolicyProvider(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

  public void test236() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.event.WindowStateListener[] var15 = var11.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test237() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    int var10 = 100;
    int var11 = (-1);
    int var12 = (-1);
    int var13 = (-1);
    var2.reshape(var10, var11, var12, var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test238() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();
    int var1 = var0.getZValue();
    org.jhotdraw.figures.ShortestDistanceConnector var2 = new org.jhotdraw.figures.ShortestDistanceConnector((org.jhotdraw.framework.Figure)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);

  }

  public void test239() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    boolean var8 = var7.isUsable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test240() throws Throwable {

    org.jhotdraw.figures.PolyLineConnector var0 = new org.jhotdraw.figures.PolyLineConnector();

  }

  public void test241() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    org.jhotdraw.framework.DrawingEditor var10 = var6.editor();
    int var11 = var6.getComponentCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test242() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test243() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();

  }

  public void test244() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.event.HierarchyListener[] var15 = var11.getHierarchyListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test245() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double(10.0d);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    org.jhotdraw.util.Bounds var54 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51, var52, var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test246() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.awt.Graphics var4 = var0.getGraphics();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var0.setLocationByPlatform(var5);
    org.jhotdraw.standard.StandardDrawing var7 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    java.lang.Double var13 = new java.lang.Double(100.0d);
    java.lang.Double var14 = new java.lang.Double(1.0d);
    java.awt.Point var15 = org.jhotdraw.util.Geom.polarToPoint(var12, var13, var14);
    org.jhotdraw.contrib.DiamondFigure var16 = new org.jhotdraw.contrib.DiamondFigure(var11, var15);
    org.jhotdraw.framework.HandleEnumeration var17 = var16.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var19 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var20 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var18, (org.jhotdraw.framework.FigureChangeListener)var19);
    org.jhotdraw.framework.Figure var21 = var7.replace((org.jhotdraw.framework.Figure)var16, (org.jhotdraw.framework.Figure)var18);
    org.jhotdraw.framework.Handle var22 = org.jhotdraw.standard.BoxHandleKit.north(var21);
    org.jhotdraw.standard.HandleTracker var23 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var0, var22);
    org.jhotdraw.framework.Cursor var24 = var22.getCursor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test247() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.destroy();

  }

  public void test248() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 100;
    int var13 = (-1);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.Figure var23 = var0.findFigureInsideWithout(var12, var13, (org.jhotdraw.framework.Figure)var22);
    java.util.Iterator var24 = var0.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    javax.swing.JLayeredPane var28 = var25.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    java.awt.Component var36 = var25.add((java.awt.Component)var35);
    boolean var37 = var35.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var39 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var40 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var38, (org.jhotdraw.framework.FigureChangeListener)var39);
    java.awt.Dimension var41 = var38.size();
    var35.removeFromSelection((org.jhotdraw.framework.Figure)var38);
    var38.layout();
    java.lang.Object var44 = var38.clone();
    org.jhotdraw.framework.FigureChangeEvent var45 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var38);
    var0.figureRequestUpdate(var45);
    java.awt.Rectangle var47 = var45.getInvalidatedRectangle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test249() throws Throwable {

    org.jhotdraw.contrib.PolygonFigure var0 = new org.jhotdraw.contrib.PolygonFigure();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var2 = new java.lang.Double((-1.0d));
    java.lang.Double var3 = new java.lang.Double(100.0d);
    java.lang.Double var4 = new java.lang.Double(1.0d);
    java.awt.Point var5 = org.jhotdraw.util.Geom.polarToPoint(var2, var3, var4);
    java.lang.Double var6 = new java.lang.Double((-1.0d));
    java.lang.Double var7 = new java.lang.Double(100.0d);
    java.lang.Double var8 = new java.lang.Double(1.0d);
    java.awt.Point var9 = org.jhotdraw.util.Geom.polarToPoint(var6, var7, var8);
    org.jhotdraw.contrib.DiamondFigure var10 = new org.jhotdraw.contrib.DiamondFigure(var5, var9);
    org.jhotdraw.framework.HandleEnumeration var11 = var10.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var14 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var12, (org.jhotdraw.framework.FigureChangeListener)var13);
    org.jhotdraw.framework.Figure var15 = var1.replace((org.jhotdraw.framework.Figure)var10, (org.jhotdraw.framework.Figure)var12);
    org.jhotdraw.framework.Handle var16 = org.jhotdraw.standard.BoxHandleKit.north(var15);
    org.jhotdraw.contrib.MDI_DrawApplication var17 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var18 = var17.isDoubleBuffered();
    javax.swing.JRootPane var19 = var17.getRootPane();
    javax.swing.JLayeredPane var20 = var17.getLayeredPane();
    int var21 = (-1);
    int var22 = 0;
    org.jhotdraw.standard.StandardDrawingView var23 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var17, var21, var22);
    var23.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var25 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var23.removeForeground((org.jhotdraw.framework.Painter)var25);
    org.jhotdraw.util.UndoableHandle var27 = new org.jhotdraw.util.UndoableHandle(var16, (org.jhotdraw.framework.DrawingView)var23);
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    int var32 = (-1);
    int var33 = 0;
    org.jhotdraw.standard.StandardDrawingView var34 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var28, var32, var33);
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    javax.swing.JLayeredPane var38 = var35.getLayeredPane();
    int var39 = (-1);
    int var40 = 0;
    org.jhotdraw.standard.StandardDrawingView var41 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var35, var39, var40);
    var41.clearSelection();
    java.awt.Color var43 = var41.getForeground();
    var34.setBackground(var43);
    org.jhotdraw.framework.FigureEnumeration var45 = var34.selectionZOrdered();
    var45.reset();
    var23.addToSelectionAll(var45);
    java.lang.Double var48 = new java.lang.Double((-1.0d));
    java.lang.Double var49 = new java.lang.Double(100.0d);
    java.lang.Double var50 = new java.lang.Double(1.0d);
    java.awt.Point var51 = org.jhotdraw.util.Geom.polarToPoint(var48, var49, var50);
    java.awt.Point var52 = var23.getLocation(var51);
    int var53 = 0;
    var0.setPointAt(var51, var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test250() throws Throwable {

    org.jhotdraw.contrib.html.TextHolderContentProducer var0 = new org.jhotdraw.contrib.html.TextHolderContentProducer();

  }

  public void test251() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.framework.FigureChangeEvent var20 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var13);
    java.lang.Object var21 = var20.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test252() throws Throwable {

    org.jhotdraw.contrib.html.ResourceManagerNotSetException var0 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    org.jhotdraw.contrib.html.ResourceManagerNotSetException var1 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    java.lang.Throwable var2 = var0.initCause((java.lang.Throwable)var1);
    java.lang.String var3 = var0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("org.jhotdraw.contrib.html.ResourceManagerNotSetException"));

  }

  public void test253() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getPressedIcon();
    int var4 = 1;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setHorizontalTextPosition(var4);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test254() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = "";
    int var5 = 100;
    var2.insert(var4, var5);
    boolean var7 = var2.isFocusPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test255() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();
    int var1 = var0.getZValue();
    org.jhotdraw.figures.LineDecoration var2 = var0.getStartDecoration();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test256() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.framework.Handle var5 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var2);
    int var6 = (-1);
    int var7 = (-1);
    boolean var8 = var5.containsPoint(var6, var7);
    org.jhotdraw.util.Undoable var9 = var5.getUndoActivity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test257() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    java.awt.FocusTraversalPolicy var7 = var2.getFocusTraversalPolicy();
    org.jhotdraw.contrib.GraphicalCompositeFigure var8 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var9 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var10 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var8, (org.jhotdraw.framework.FigureChangeListener)var9);
    java.awt.Dimension var11 = var8.size();
    java.awt.Dimension var12 = var2.getSize(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test258() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.awt.Graphics var4 = var0.getGraphics();
    org.jhotdraw.contrib.Desktop var5 = var0.getDesktop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test259() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    java.awt.Point var44 = var10.lastClick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test260() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.framework.Tool var12 = var10.tool();
    org.jhotdraw.contrib.MDI_DrawApplication var13 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var14 = var13.isDoubleBuffered();
    javax.swing.JRootPane var15 = var13.getRootPane();
    java.lang.String var16 = var15.getUIClassID();
    java.awt.Insets var17 = var15.getInsets();
    java.awt.Insets var18 = var10.getInsets(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16.equals("RootPaneUI"));

  }

  public void test261() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    var2.revalidate();
    int var5 = var2.getIconTextGap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);

  }

  public void test262() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    boolean var13 = var10.requestDefaultFocus();
    java.lang.String var14 = "hi!";
    java.lang.Character var15 = new java.lang.Character(' ');
    java.lang.Character var16 = new java.lang.Character(' ');
    var10.firePropertyChange(var14, var15, var16);
    boolean var18 = var10.isReadOnly();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test263() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    boolean var13 = var10.requestDefaultFocus();
    java.lang.String var14 = "hi!";
    java.lang.Character var15 = new java.lang.Character(' ');
    java.lang.Character var16 = new java.lang.Character(' ');
    var10.firePropertyChange(var14, var15, var16);
    boolean var18 = var10.isReadOnly();
    org.jhotdraw.contrib.MDI_DrawApplication var19 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var20 = var19.isDoubleBuffered();
    javax.swing.JRootPane var21 = var19.getRootPane();
    javax.swing.JLayeredPane var22 = var19.getLayeredPane();
    int var23 = (-1);
    int var24 = 0;
    org.jhotdraw.standard.StandardDrawingView var25 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var19, var23, var24);
    var25.clearSelection();
    org.jhotdraw.util.UndoableAdapter var27 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var25);
    java.awt.Dimension var28 = var25.getPreferredSize();
    java.awt.Dimension var29 = var10.getSize(var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);

  }

  public void test264() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    org.jhotdraw.contrib.DiamondFigure var12 = new org.jhotdraw.contrib.DiamondFigure(var7, var11);
    org.jhotdraw.framework.HandleEnumeration var13 = var12.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    org.jhotdraw.framework.Figure var17 = var3.replace((org.jhotdraw.framework.Figure)var12, (org.jhotdraw.framework.Figure)var14);
    org.jhotdraw.framework.Handle var18 = org.jhotdraw.standard.BoxHandleKit.north(var17);
    org.jhotdraw.contrib.MDI_DrawApplication var19 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var20 = var19.isDoubleBuffered();
    javax.swing.JRootPane var21 = var19.getRootPane();
    javax.swing.JLayeredPane var22 = var19.getLayeredPane();
    int var23 = (-1);
    int var24 = 0;
    org.jhotdraw.standard.StandardDrawingView var25 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var19, var23, var24);
    var25.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var27 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var25.removeForeground((org.jhotdraw.framework.Painter)var27);
    org.jhotdraw.util.UndoableHandle var29 = new org.jhotdraw.util.UndoableHandle(var18, (org.jhotdraw.framework.DrawingView)var25);
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    int var34 = (-1);
    int var35 = 0;
    org.jhotdraw.standard.StandardDrawingView var36 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var30, var34, var35);
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    var43.clearSelection();
    java.awt.Color var45 = var43.getForeground();
    var36.setBackground(var45);
    org.jhotdraw.framework.FigureEnumeration var47 = var36.selectionZOrdered();
    var47.reset();
    var25.addToSelectionAll(var47);
    var0.orphanAll(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test265() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    boolean var6 = var2.isLightweight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test266() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    javax.swing.InputVerifier var31 = var10.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);

  }

  public void test267() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    int var8 = 1;
    var0.setCursor(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test268() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Container var9 = var6.getFocusCycleRootAncestor();
    java.awt.Color var10 = var6.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test269() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    javax.swing.InputMap var13 = var10.getInputMap();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test270() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.createBufferStrategy(var8);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test271() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    java.lang.String var3 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = "hi!";
    java.lang.Long var8 = new java.lang.Long(100L);
    java.lang.Long var9 = new java.lang.Long(1L);
    var6.firePropertyChange(var7, var8, var9);
    int var11 = var6.getX();
    var2.setAttribute(var3, (java.lang.Object)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);

  }

  public void test272() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.Figure var25 = var17.figureAt(var24);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test273() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    int var5 = (-1);
    int var6 = 0;
    org.jhotdraw.standard.StandardDrawingView var7 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var5, var6);
    int var8 = 0;
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var8, var9);
    org.jhotdraw.util.RedoCommand var11 = new org.jhotdraw.util.RedoCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test274() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.destroy();
    java.lang.String var2 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getParameter(var2);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test275() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    org.jhotdraw.framework.HandleEnumeration var8 = var3.handles();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test276() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.util.Undoable var27 = var26.getUndoActivity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test277() throws Throwable {

    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var0 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();

  }

  public void test278() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    java.lang.String var13 = var12.getUIClassID();
    java.awt.Insets var14 = var12.getInsets();
    var7.setMargin(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13.equals("RootPaneUI"));

  }

  public void test279() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    int var7 = var2.getX();
    int var8 = 1;
    var2.setDebugGraphicsOptions(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test280() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    javax.swing.InputVerifier var31 = var10.getInputVerifier();
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JRootPane var38 = var36.getRootPane();
    java.lang.String var39 = var38.getUIClassID();
    java.awt.Insets var40 = var38.getInsets();
    int var41 = (-1);
    var35.setPosition((java.awt.Component)var38, var41);
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    int var45 = 0;
    var35.setLayer((java.awt.Component)var43, var45);
    java.awt.event.HierarchyListener[] var47 = var43.getHierarchyListeners();
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);

  }

  public void test281() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "hi!";
    java.lang.Long var4 = new java.lang.Long(100L);
    java.lang.Long var5 = new java.lang.Long(1L);
    var2.firePropertyChange(var3, var4, var5);
    int var7 = var2.getX();
    java.awt.Container var8 = var2.getTopLevelAncestor();
    java.awt.event.InputMethodListener[] var9 = var2.getInputMethodListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test282() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.standard.StandardDrawing var9 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    org.jhotdraw.contrib.DiamondFigure var18 = new org.jhotdraw.contrib.DiamondFigure(var13, var17);
    org.jhotdraw.framework.HandleEnumeration var19 = var18.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var20 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var21 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var22 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var20, (org.jhotdraw.framework.FigureChangeListener)var21);
    org.jhotdraw.framework.Figure var23 = var9.replace((org.jhotdraw.framework.Figure)var18, (org.jhotdraw.framework.Figure)var20);
    java.util.Iterator var24 = var9.drawingChangeListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var6.addToSelection((org.jhotdraw.framework.Figure)var9);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test283() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    java.lang.String var8 = var7.getUIClassID();
    java.awt.Insets var9 = var7.getInsets();
    int var10 = (-1);
    var4.setPosition((java.awt.Component)var7, var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    int var14 = 0;
    var4.setLayer((java.awt.Component)var12, var14);
    org.jhotdraw.figures.UngroupCommand var16 = new org.jhotdraw.figures.UngroupCommand(var0, (org.jhotdraw.framework.DrawingEditor)var12);
    org.jhotdraw.util.Undoable var17 = var16.getUndoActivity();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test284() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var24 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var25 = var24.isDoubleBuffered();
    javax.swing.JRootPane var26 = var24.getRootPane();
    javax.swing.JLayeredPane var27 = var24.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    int var32 = (-1);
    int var33 = 0;
    org.jhotdraw.standard.StandardDrawingView var34 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var28, var32, var33);
    java.awt.Component var35 = var24.add((java.awt.Component)var34);
    boolean var36 = var34.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var39 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var37, (org.jhotdraw.framework.FigureChangeListener)var38);
    java.awt.Dimension var40 = var37.size();
    var34.removeFromSelection((org.jhotdraw.framework.Figure)var37);
    var37.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var43 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var20, (org.jhotdraw.framework.Figure)var37);
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.framework.Figure var46 = var37.findFigureInside(var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var51 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var52 = var51.isDoubleBuffered();
    javax.swing.JRootPane var53 = var51.getRootPane();
    javax.swing.JLayeredPane var54 = var51.getLayeredPane();
    int var55 = (-1);
    int var56 = 0;
    org.jhotdraw.standard.StandardDrawingView var57 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var51, var55, var56);
    java.awt.Component var58 = var47.add((java.awt.Component)var57);
    boolean var59 = var57.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var60 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var61 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var62 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var60, (org.jhotdraw.framework.FigureChangeListener)var61);
    java.awt.Dimension var63 = var60.size();
    var57.removeFromSelection((org.jhotdraw.framework.Figure)var60);
    var60.layout();
    java.lang.Object var66 = var60.clone();
    int var67 = 1;
    int var68 = 1;
    org.jhotdraw.contrib.PolygonFigure var69 = new org.jhotdraw.contrib.PolygonFigure(var67, var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var69.figures();
    java.awt.Rectangle var71 = var69.displayBox();
    org.jhotdraw.framework.Figure var72 = var37.replace((org.jhotdraw.framework.Figure)var60, (org.jhotdraw.framework.Figure)var69);
    var13.bringToFront((org.jhotdraw.framework.Figure)var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test285() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var0.setUndecorated(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test286() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    java.awt.Dimension var6 = var3.size();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var7 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test287() throws Throwable {

    java.lang.Object var0 = new java.lang.Object();

  }

  public void test288() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);

  }

  public void test289() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test290() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var1 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var0);

  }

  public void test291() throws Throwable {

    java.lang.Double var0 = new java.lang.Double(0.0d);
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var2 = new org.jhotdraw.standard.RelativeLocator(var0, var1);

  }

  public void test292() throws Throwable {

    java.awt.Cursor var0 = java.awt.Cursor.getDefaultCursor();

  }

  public void test293() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var24 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var25 = var24.isDoubleBuffered();
    javax.swing.JRootPane var26 = var24.getRootPane();
    javax.swing.JLayeredPane var27 = var24.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    int var32 = (-1);
    int var33 = 0;
    org.jhotdraw.standard.StandardDrawingView var34 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var28, var32, var33);
    java.awt.Component var35 = var24.add((java.awt.Component)var34);
    boolean var36 = var34.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var39 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var37, (org.jhotdraw.framework.FigureChangeListener)var38);
    java.awt.Dimension var40 = var37.size();
    var34.removeFromSelection((org.jhotdraw.framework.Figure)var37);
    var37.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var43 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var20, (org.jhotdraw.framework.Figure)var37);
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.framework.Figure var46 = var37.findFigureInside(var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var51 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var52 = var51.isDoubleBuffered();
    javax.swing.JRootPane var53 = var51.getRootPane();
    javax.swing.JLayeredPane var54 = var51.getLayeredPane();
    int var55 = (-1);
    int var56 = 0;
    org.jhotdraw.standard.StandardDrawingView var57 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var51, var55, var56);
    java.awt.Component var58 = var47.add((java.awt.Component)var57);
    boolean var59 = var57.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var60 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var61 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var62 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var60, (org.jhotdraw.framework.FigureChangeListener)var61);
    java.awt.Dimension var63 = var60.size();
    var57.removeFromSelection((org.jhotdraw.framework.Figure)var60);
    var60.layout();
    java.lang.Object var66 = var60.clone();
    int var67 = 1;
    int var68 = 1;
    org.jhotdraw.contrib.PolygonFigure var69 = new org.jhotdraw.contrib.PolygonFigure(var67, var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var69.figures();
    java.awt.Rectangle var71 = var69.displayBox();
    org.jhotdraw.framework.Figure var72 = var37.replace((org.jhotdraw.framework.Figure)var60, (org.jhotdraw.framework.Figure)var69);
    var13.bringToFront((org.jhotdraw.framework.Figure)var60);
    java.awt.Insets var74 = var13.connectionInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test294() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    java.awt.event.MouseListener[] var7 = var0.getMouseListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test295() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    java.lang.Boolean var10 = new java.lang.Boolean(true);
    var2.setFocusTraversalPolicyProvider(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test296() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    int var13 = 0;
    int var14 = 10;
    int var15 = var2.findSegment(var13, var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test297() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double((-1.0d));
    java.lang.Double var53 = new java.lang.Double(100.0d);
    java.lang.Double var54 = new java.lang.Double(1.0d);
    java.awt.Point var55 = org.jhotdraw.util.Geom.polarToPoint(var52, var53, var54);
    org.jhotdraw.figures.EllipseFigure var56 = new org.jhotdraw.figures.EllipseFigure(var50, var55);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test298() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var1 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var2 = var1.handles();
    org.jhotdraw.framework.Figure var3 = var0.remove((org.jhotdraw.framework.Figure)var1);

  }

  public void test299() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var1 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var0);
    org.jhotdraw.contrib.html.ContentProducerRegistry var2 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var3 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var2);
    var1.setParent(var3);

  }

  public void test300() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    java.awt.event.WindowListener[] var3 = var0.getWindowListeners();
    java.awt.Window[] var4 = var0.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test301() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    javax.swing.plaf.PanelUI var47 = var22.getUI();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test302() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = "hi!";
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var3 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var4 = var3.handles();
    org.jhotdraw.framework.Figure var5 = var2.remove((org.jhotdraw.framework.Figure)var3);
    java.lang.String var6 = var0.store(var1, (org.jhotdraw.framework.Drawing)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6.equals("hi!.draw"));

  }

  public void test303() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    int var3 = var1.getZValue();
    java.lang.Object var4 = var1.clone();
    org.jhotdraw.standard.TextHolder var5 = var1.getTextHolder();
    var1.changed();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test304() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    org.jhotdraw.standard.StandardDrawing var27 = new org.jhotdraw.standard.StandardDrawing();
    int var28 = 1;
    int var29 = 1;
    org.jhotdraw.contrib.PolygonFigure var30 = new org.jhotdraw.contrib.PolygonFigure(var28, var29);
    org.jhotdraw.framework.FigureEnumeration var31 = var30.figures();
    java.awt.Rectangle var32 = var30.displayBox();
    int var33 = 1;
    int var34 = 1;
    org.jhotdraw.contrib.PolygonFigure var35 = new org.jhotdraw.contrib.PolygonFigure(var33, var34);
    org.jhotdraw.framework.FigureEnumeration var36 = var35.figures();
    java.awt.Rectangle var37 = var35.displayBox();
    org.jhotdraw.framework.Figure var38 = var27.findFigure(var32, (org.jhotdraw.framework.Figure)var35);
    int var39 = 100;
    int var40 = (-1);
    java.lang.Double var41 = new java.lang.Double((-1.0d));
    java.lang.Double var42 = new java.lang.Double(100.0d);
    java.lang.Double var43 = new java.lang.Double(1.0d);
    java.awt.Point var44 = org.jhotdraw.util.Geom.polarToPoint(var41, var42, var43);
    java.lang.Double var45 = new java.lang.Double((-1.0d));
    java.lang.Double var46 = new java.lang.Double(100.0d);
    java.lang.Double var47 = new java.lang.Double(1.0d);
    java.awt.Point var48 = org.jhotdraw.util.Geom.polarToPoint(var45, var46, var47);
    org.jhotdraw.contrib.DiamondFigure var49 = new org.jhotdraw.contrib.DiamondFigure(var44, var48);
    org.jhotdraw.framework.Figure var50 = var27.findFigureInsideWithout(var39, var40, (org.jhotdraw.framework.Figure)var49);
    int var51 = var17.getLayer((org.jhotdraw.framework.Figure)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));

  }

  public void test305() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.event.WindowStateListener[] var15 = var11.getWindowStateListeners();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.DrawingView[] var16 = var11.views();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test306() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    java.lang.String var15 = "";
    org.jhotdraw.standard.StandardDrawing var16 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var17 = new java.lang.Double((-1.0d));
    java.lang.Double var18 = new java.lang.Double(100.0d);
    java.lang.Double var19 = new java.lang.Double(1.0d);
    java.awt.Point var20 = org.jhotdraw.util.Geom.polarToPoint(var17, var18, var19);
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    java.lang.Double var22 = new java.lang.Double(100.0d);
    java.lang.Double var23 = new java.lang.Double(1.0d);
    java.awt.Point var24 = org.jhotdraw.util.Geom.polarToPoint(var21, var22, var23);
    org.jhotdraw.contrib.DiamondFigure var25 = new org.jhotdraw.contrib.DiamondFigure(var20, var24);
    org.jhotdraw.framework.HandleEnumeration var26 = var25.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var27 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var28 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var29 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var27, (org.jhotdraw.framework.FigureChangeListener)var28);
    org.jhotdraw.framework.Figure var30 = var16.replace((org.jhotdraw.framework.Figure)var25, (org.jhotdraw.framework.Figure)var27);
    org.jhotdraw.framework.Handle var31 = org.jhotdraw.standard.BoxHandleKit.north(var30);
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    int var36 = (-1);
    int var37 = 0;
    org.jhotdraw.standard.StandardDrawingView var38 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var36, var37);
    var38.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var40 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var38.removeForeground((org.jhotdraw.framework.Painter)var40);
    org.jhotdraw.util.UndoableHandle var42 = new org.jhotdraw.util.UndoableHandle(var31, (org.jhotdraw.framework.DrawingView)var38);
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    javax.swing.JRootPane var45 = var43.getRootPane();
    javax.swing.JLayeredPane var46 = var43.getLayeredPane();
    int var47 = (-1);
    int var48 = 0;
    org.jhotdraw.standard.StandardDrawingView var49 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var43, var47, var48);
    org.jhotdraw.contrib.MDI_DrawApplication var50 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var51 = var50.isDoubleBuffered();
    javax.swing.JRootPane var52 = var50.getRootPane();
    javax.swing.JLayeredPane var53 = var50.getLayeredPane();
    int var54 = (-1);
    int var55 = 0;
    org.jhotdraw.standard.StandardDrawingView var56 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var50, var54, var55);
    var56.clearSelection();
    java.awt.Color var58 = var56.getForeground();
    var49.setBackground(var58);
    org.jhotdraw.framework.FigureEnumeration var60 = var49.selectionZOrdered();
    var60.reset();
    var38.addToSelectionAll(var60);
    javax.swing.plaf.PanelUI var63 = var38.getUI();
    var14.setAttribute(var15, (java.lang.Object)var63);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test307() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.util.Bounds var5 = new org.jhotdraw.util.Bounds((java.awt.geom.Rectangle2D)var4);

  }

  public void test308() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();

  }

  public void test309() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    org.jhotdraw.framework.DrawingView var24 = var23.getActiveView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == null);

  }

  public void test310() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.framework.Handle var5 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var2);
    int var6 = (-1);
    int var7 = (-1);
    boolean var8 = var5.containsPoint(var6, var7);
    int var9 = 100;
    int var10 = 100;
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.contrib.MDI_DrawApplication var13 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var14 = var13.isDoubleBuffered();
    javax.swing.JRootPane var15 = var13.getRootPane();
    javax.swing.JLayeredPane var16 = var13.getLayeredPane();
    int var17 = (-1);
    int var18 = 0;
    org.jhotdraw.standard.StandardDrawingView var19 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var13, var17, var18);
    var19.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var21 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var19.removeForeground((org.jhotdraw.framework.Painter)var21);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.invokeEnd(var9, var10, var11, var12, (org.jhotdraw.framework.DrawingView)var19);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);

  }

  public void test311() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    var0.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test312() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    org.jhotdraw.samples.javadraw.JavaDrawApplet var3 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var3.start();
    var0.remove((java.awt.Component)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test313() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    java.awt.Component var38 = var27.add((java.awt.Component)var37);
    boolean var39 = var37.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var42 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var40, (org.jhotdraw.framework.FigureChangeListener)var41);
    java.awt.Dimension var43 = var40.size();
    var37.removeFromSelection((org.jhotdraw.framework.Figure)var40);
    var40.layout();
    java.lang.Object var46 = var40.clone();
    int var47 = 1;
    int var48 = 1;
    org.jhotdraw.contrib.PolygonFigure var49 = new org.jhotdraw.contrib.PolygonFigure(var47, var48);
    org.jhotdraw.framework.FigureEnumeration var50 = var49.figures();
    java.awt.Rectangle var51 = var49.displayBox();
    org.jhotdraw.framework.Figure var52 = var17.replace((org.jhotdraw.framework.Figure)var40, (org.jhotdraw.framework.Figure)var49);
    var17.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test314() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var1 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var2 = var1.handles();
    org.jhotdraw.framework.Figure var3 = var0.remove((org.jhotdraw.framework.Figure)var1);
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    int var15 = (-1);
    int var16 = 0;
    org.jhotdraw.standard.StandardDrawingView var17 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var11, var15, var16);
    var17.clearSelection();
    java.awt.Color var19 = var17.getForeground();
    var10.setBackground(var19);
    org.jhotdraw.framework.FigureEnumeration var21 = var10.selectionZOrdered();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    java.awt.Color var37 = var35.getForeground();
    var28.setBackground(var37);
    org.jhotdraw.framework.FigureEnumeration var39 = var28.selectionZOrdered();
    var10.addToSelectionAll(var39);
    var0.orphanAll(var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);

  }

  public void test315() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    int var10 = 100;
    int var11 = (-1);
    int var12 = (-1);
    int var13 = (-1);
    var2.reshape(var10, var11, var12, var13);
    boolean var15 = var2.isContentAreaFilled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);

  }

  public void test316() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    java.lang.String var13 = var12.getUIClassID();
    java.awt.Insets var14 = var12.getInsets();
    var7.setMargin(var14);
    boolean var16 = var7.isMinimumSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test317() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    java.awt.Rectangle var6 = var0.displayBox();

  }

  public void test318() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    java.awt.Color var12 = var10.getForeground();
    var2.setBackground(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test319() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    var0.open();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var26 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var27 = var26.isDoubleBuffered();
    javax.swing.JRootPane var28 = var26.getRootPane();
    javax.swing.JLayeredPane var29 = var26.getLayeredPane();
    int var30 = (-1);
    int var31 = 0;
    org.jhotdraw.standard.StandardDrawingView var32 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var26, var30, var31);
    java.awt.Component var33 = var22.add((java.awt.Component)var32);
    var14.setEditor((org.jhotdraw.framework.DrawingEditor)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    javax.swing.JLayeredPane var38 = var35.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var39 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var40 = var39.isDoubleBuffered();
    javax.swing.JRootPane var41 = var39.getRootPane();
    java.lang.String var42 = var41.getUIClassID();
    java.awt.Insets var43 = var41.getInsets();
    int var44 = (-1);
    var38.setPosition((java.awt.Component)var41, var44);
    boolean var46 = var38.isDisplayable();
    boolean var47 = var14.isFocusCycleRoot((java.awt.Container)var38);
    var0.setLayeredPane(var38);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);

  }

  public void test320() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    java.lang.String var11 = var10.getUIClassID();
    java.awt.Insets var12 = var10.getInsets();
    int var13 = (-1);
    var7.setPosition((java.awt.Component)var10, var13);
    int var15 = var7.highestLayer();
    var7.disable();
    var0.setLayeredPane(var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-30000));

  }

  public void test321() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JRootPane var8 = var6.getRootPane();
    javax.swing.JLayeredPane var9 = var6.getLayeredPane();
    int var10 = (-1);
    int var11 = 0;
    org.jhotdraw.standard.StandardDrawingView var12 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var6, var10, var11);
    var12.clearSelection();
    java.awt.Color var14 = var12.getForeground();
    var0.setFillColor(var14);
    java.awt.Rectangle var16 = var0.displayBox();
    java.awt.Point var17 = org.jhotdraw.util.Geom.topRightCorner(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test322() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.lang.Boolean var4 = new java.lang.Boolean(true);
    var3.setVerifyInputWhenFocusTarget(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test323() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    var2.revalidate();
    int var5 = var2.getIconTextGap();
    int var6 = 1;
    javax.swing.JMenuItem var7 = var2.getItem(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);

  }

  public void test324() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    boolean var5 = var2.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test325() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    var22.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test326() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    var10.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var12);
    boolean var15 = var10.requestFocusInWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test327() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    var8.basicDisplayBox(var13, var17);
    org.jhotdraw.framework.Handle var19 = org.jhotdraw.standard.BoxHandleKit.west((org.jhotdraw.framework.Figure)var8);

  }

  public void test328() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    boolean var13 = var10.requestDefaultFocus();
    java.lang.String var14 = "hi!";
    java.lang.Character var15 = new java.lang.Character(' ');
    java.lang.Character var16 = new java.lang.Character(' ');
    var10.firePropertyChange(var14, var15, var16);
    boolean var18 = var10.isReadOnly();
    boolean var19 = var10.isRequestFocusEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test329() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    org.jhotdraw.standard.StandardDrawing var27 = new org.jhotdraw.standard.StandardDrawing();
    int var28 = 1;
    int var29 = 1;
    org.jhotdraw.contrib.PolygonFigure var30 = new org.jhotdraw.contrib.PolygonFigure(var28, var29);
    org.jhotdraw.framework.FigureEnumeration var31 = var30.figures();
    java.awt.Rectangle var32 = var30.displayBox();
    int var33 = 1;
    int var34 = 1;
    org.jhotdraw.contrib.PolygonFigure var35 = new org.jhotdraw.contrib.PolygonFigure(var33, var34);
    org.jhotdraw.framework.FigureEnumeration var36 = var35.figures();
    java.awt.Rectangle var37 = var35.displayBox();
    org.jhotdraw.framework.Figure var38 = var27.findFigure(var32, (org.jhotdraw.framework.Figure)var35);
    int var39 = 100;
    int var40 = (-1);
    java.lang.Double var41 = new java.lang.Double((-1.0d));
    java.lang.Double var42 = new java.lang.Double(100.0d);
    java.lang.Double var43 = new java.lang.Double(1.0d);
    java.awt.Point var44 = org.jhotdraw.util.Geom.polarToPoint(var41, var42, var43);
    java.lang.Double var45 = new java.lang.Double((-1.0d));
    java.lang.Double var46 = new java.lang.Double(100.0d);
    java.lang.Double var47 = new java.lang.Double(1.0d);
    java.awt.Point var48 = org.jhotdraw.util.Geom.polarToPoint(var45, var46, var47);
    org.jhotdraw.contrib.DiamondFigure var49 = new org.jhotdraw.contrib.DiamondFigure(var44, var48);
    org.jhotdraw.framework.Figure var50 = var27.findFigureInsideWithout(var39, var40, (org.jhotdraw.framework.Figure)var49);
    int var51 = var17.getLayer((org.jhotdraw.framework.Figure)var49);
    int var52 = var17.figureCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test330() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = var0.getFileDescription();
    java.lang.String var2 = "hi!";
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    org.jhotdraw.contrib.DiamondFigure var12 = new org.jhotdraw.contrib.DiamondFigure(var7, var11);
    org.jhotdraw.framework.HandleEnumeration var13 = var12.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    org.jhotdraw.framework.Figure var17 = var3.replace((org.jhotdraw.framework.Figure)var12, (org.jhotdraw.framework.Figure)var14);
    java.lang.String var18 = var0.store(var2, (org.jhotdraw.framework.Drawing)var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18.equals("hi!.draw"));

  }

  public void test331() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    int var2 = 0;
    int var3 = 0;
    boolean var4 = var1.containsPoint(var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test332() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.util.Undoable var27 = var26.getUndoActivity();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var28 = var27.getAffectedFiguresCount();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test333() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var9 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var10 = var9.isDoubleBuffered();
    javax.swing.JRootPane var11 = var9.getRootPane();
    javax.swing.JLayeredPane var12 = var9.getLayeredPane();
    int var13 = (-1);
    int var14 = 0;
    org.jhotdraw.standard.StandardDrawingView var15 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var9, var13, var14);
    java.awt.Component var16 = var5.add((java.awt.Component)var15);
    boolean var17 = var15.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var19 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var20 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var18, (org.jhotdraw.framework.FigureChangeListener)var19);
    java.awt.Dimension var21 = var18.size();
    var15.removeFromSelection((org.jhotdraw.framework.Figure)var18);
    var18.layout();
    var2.addToContainer((org.jhotdraw.framework.FigureChangeListener)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test334() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.util.Bounds var5 = new org.jhotdraw.util.Bounds((java.awt.geom.Rectangle2D)var4);
    double var6 = var5.getWest();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 1.0d);

  }

  public void test335() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    java.lang.String var4 = var0.getApplicationName();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4.equals("JHotDraw"));

  }

  public void test336() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var15 = new org.jhotdraw.standard.RelativeLocator(var13, var14);
    int var16 = 0;
    org.jhotdraw.contrib.PolygonHandle var17 = new org.jhotdraw.contrib.PolygonHandle(var2, (org.jhotdraw.framework.Locator)var15, var16);

  }

  public void test337() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = 0;
    var0.remove(var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test338() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var0.setUndecorated(var10);
    int var12 = 10;
    var0.setExtendedState(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test339() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    int var5 = 100;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var2.setHorizontalTextPosition(var5);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test340() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    boolean var44 = var34.isOptimizedDrawingEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == true);

  }

  public void test341() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    var0.destroy();

  }

  public void test342() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var15 = new org.jhotdraw.standard.RelativeLocator(var13, var14);
    int var16 = 0;
    org.jhotdraw.contrib.PolygonHandle var17 = new org.jhotdraw.contrib.PolygonHandle(var2, (org.jhotdraw.framework.Locator)var15, var16);
    int var18 = 10;
    int var19 = 1;
    int var20 = 0;
    int var21 = (-1);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    var28.clearSelection();
    org.jhotdraw.util.UndoableAdapter var30 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var28);
    java.awt.Dimension var31 = var28.getPreferredSize();
    var17.invokeEnd(var18, var19, var20, var21, (org.jhotdraw.framework.DrawingView)var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);

  }

  public void test343() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var1 = 1;
    int var2 = 0;
    boolean var3 = var0.containsPoint(var1, var2);
    int var4 = var0.getZValue();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test344() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    int var2 = 10;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.get(var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test345() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    java.lang.String var3 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = "hi!";
    java.lang.Long var8 = new java.lang.Long(100L);
    java.lang.Long var9 = new java.lang.Long(1L);
    var6.firePropertyChange(var7, var8, var9);
    int var11 = var6.getX();
    var2.setAttribute(var3, (java.lang.Object)var11);
    org.jhotdraw.standard.StandardDrawing var13 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.HandleEnumeration var23 = var22.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    org.jhotdraw.framework.Figure var27 = var13.replace((org.jhotdraw.framework.Figure)var22, (org.jhotdraw.framework.Figure)var24);
    org.jhotdraw.framework.Handle var28 = org.jhotdraw.standard.BoxHandleKit.north(var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var37 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var35.removeForeground((org.jhotdraw.framework.Painter)var37);
    org.jhotdraw.util.UndoableHandle var39 = new org.jhotdraw.util.UndoableHandle(var28, (org.jhotdraw.framework.DrawingView)var35);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    java.awt.Color var55 = var53.getForeground();
    var46.setBackground(var55);
    org.jhotdraw.framework.FigureEnumeration var57 = var46.selectionZOrdered();
    var57.reset();
    var35.addToSelectionAll(var57);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.awt.Point var64 = var35.getLocation(var63);
    java.awt.Point var65 = var2.chop(var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test346() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var24 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var25 = var24.isDoubleBuffered();
    javax.swing.JRootPane var26 = var24.getRootPane();
    javax.swing.JLayeredPane var27 = var24.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    int var32 = (-1);
    int var33 = 0;
    org.jhotdraw.standard.StandardDrawingView var34 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var28, var32, var33);
    java.awt.Component var35 = var24.add((java.awt.Component)var34);
    boolean var36 = var34.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var39 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var37, (org.jhotdraw.framework.FigureChangeListener)var38);
    java.awt.Dimension var40 = var37.size();
    var34.removeFromSelection((org.jhotdraw.framework.Figure)var37);
    var37.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var43 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var20, (org.jhotdraw.framework.Figure)var37);
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.framework.Figure var46 = var37.findFigureInside(var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var51 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var52 = var51.isDoubleBuffered();
    javax.swing.JRootPane var53 = var51.getRootPane();
    javax.swing.JLayeredPane var54 = var51.getLayeredPane();
    int var55 = (-1);
    int var56 = 0;
    org.jhotdraw.standard.StandardDrawingView var57 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var51, var55, var56);
    java.awt.Component var58 = var47.add((java.awt.Component)var57);
    boolean var59 = var57.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var60 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var61 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var62 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var60, (org.jhotdraw.framework.FigureChangeListener)var61);
    java.awt.Dimension var63 = var60.size();
    var57.removeFromSelection((org.jhotdraw.framework.Figure)var60);
    var60.layout();
    java.lang.Object var66 = var60.clone();
    int var67 = 1;
    int var68 = 1;
    org.jhotdraw.contrib.PolygonFigure var69 = new org.jhotdraw.contrib.PolygonFigure(var67, var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var69.figures();
    java.awt.Rectangle var71 = var69.displayBox();
    org.jhotdraw.framework.Figure var72 = var37.replace((org.jhotdraw.framework.Figure)var60, (org.jhotdraw.framework.Figure)var69);
    var13.bringToFront((org.jhotdraw.framework.Figure)var60);
    java.awt.Dimension var74 = var60.size();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test347() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    java.lang.String var4 = var0.getAppletInfo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test348() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.undo();
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var8.setUndoable(var10);
    boolean var12 = var8.isUndoable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test349() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    org.jhotdraw.framework.DrawingView var11 = var8.getDrawingView();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.FigureEnumeration var12 = var8.getAffectedFiguresReversed();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test350() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    var0.doLayout();
    java.awt.event.WindowListener[] var26 = var0.getWindowListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test351() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.Drawing var9 = var8.drawing();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test352() throws Throwable {

    java.lang.String var0 = "hi!";
    java.lang.Float var1 = new java.lang.Float(1.0f);
    org.jhotdraw.contrib.MDI_DrawApplication var2 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var3 = var2.isDoubleBuffered();
    java.awt.Container var4 = var2.getFocusCycleRootAncestor();
    org.jhotdraw.contrib.zoom.ZoomCommand var5 = new org.jhotdraw.contrib.zoom.ZoomCommand(var0, var1, (org.jhotdraw.framework.DrawingEditor)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.contrib.zoom.ZoomDrawingView var6 = var5.zoomView();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test353() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double(10.0d);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    org.jhotdraw.util.Bounds var54 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51, var52, var53);
    double var55 = var54.getSouth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 0.5d);

  }

  public void test354() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    java.lang.String var3 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = "hi!";
    java.lang.Long var8 = new java.lang.Long(100L);
    java.lang.Long var9 = new java.lang.Long(1L);
    var6.firePropertyChange(var7, var8, var9);
    int var11 = var6.getX();
    var2.setAttribute(var3, (java.lang.Object)var11);
    org.jhotdraw.standard.StandardDrawing var13 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.HandleEnumeration var23 = var22.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    org.jhotdraw.framework.Figure var27 = var13.replace((org.jhotdraw.framework.Figure)var22, (org.jhotdraw.framework.Figure)var24);
    org.jhotdraw.framework.Handle var28 = org.jhotdraw.standard.BoxHandleKit.north(var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var37 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var35.removeForeground((org.jhotdraw.framework.Painter)var37);
    org.jhotdraw.util.UndoableHandle var39 = new org.jhotdraw.util.UndoableHandle(var28, (org.jhotdraw.framework.DrawingView)var35);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    java.awt.Color var55 = var53.getForeground();
    var46.setBackground(var55);
    org.jhotdraw.framework.FigureEnumeration var57 = var46.selectionZOrdered();
    var57.reset();
    var35.addToSelectionAll(var57);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.awt.Point var64 = var35.getLocation(var63);
    java.awt.Point var65 = var2.chop(var64);
    var2.willChange();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test355() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication(var0);

  }

  public void test356() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double(10.0d);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    org.jhotdraw.util.Bounds var54 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51, var52, var53);
    double var55 = var54.getWest();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == (-5.0d));

  }

  public void test357() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.activate();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test358() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    var0.doLayout();
    var0.pack();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test359() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    int var10 = 100;
    int var11 = 100;
    org.jhotdraw.standard.GridConstrainer var12 = new org.jhotdraw.standard.GridConstrainer(var10, var11);
    var6.setConstrainer((org.jhotdraw.framework.PointConstrainer)var12);
    int var14 = (-1);
    int var15 = 0;
    java.awt.Image var16 = var6.createImage(var14, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test360() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var1 = var0.textDisplayBox();

  }

  public void test361() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.framework.FigureChangeEvent var20 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.framework.FigureChangeEvent var21 = var20.getNestedEvent();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);

  }

  public void test362() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    org.jhotdraw.framework.DrawingView var11 = var8.getDrawingView();
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    var8.setRedoable(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test363() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    int var13 = 0;
    int var14 = 10;
    int var15 = var2.findSegment(var13, var14);
    java.awt.Point var16 = var2.center();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));

  }

  public void test364() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test365() throws Throwable {

    org.jhotdraw.framework.Locator var0 = org.jhotdraw.standard.RelativeLocator.east();

  }

  public void test366() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.net.URL var2 = var0.getCodeBase();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test367() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.util.Undoable var27 = var26.getUndoActivity();
    java.awt.Point var28 = var26.locate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test368() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    org.jhotdraw.util.Bounds var52 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test369() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    java.lang.Long var3 = new java.lang.Long((-1L));
    int var4 = 10;
    int var5 = 10;
    int var6 = 0;
    int var7 = (-1);
    var0.repaint(var3, var4, var5, var6, var7);

  }

  public void test370() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    int var2 = 1;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Object var3 = var1.get(var2);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test371() throws Throwable {

    java.lang.String var0 = "hi!";
    java.lang.Float var1 = new java.lang.Float(1.0f);
    org.jhotdraw.contrib.MDI_DrawApplication var2 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var3 = var2.isDoubleBuffered();
    java.awt.Container var4 = var2.getFocusCycleRootAncestor();
    org.jhotdraw.contrib.zoom.ZoomCommand var5 = new org.jhotdraw.contrib.zoom.ZoomCommand(var0, var1, (org.jhotdraw.framework.DrawingEditor)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var5.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test372() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var48 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var47);
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var50 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var49);
    var47.addDependendFigure((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.framework.Handle var52 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    org.jhotdraw.contrib.MDI_DrawApplication var60 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var61 = var60.isDoubleBuffered();
    javax.swing.JRootPane var62 = var60.getRootPane();
    javax.swing.JLayeredPane var63 = var60.getLayeredPane();
    int var64 = (-1);
    int var65 = 0;
    org.jhotdraw.standard.StandardDrawingView var66 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var60, var64, var65);
    var66.clearSelection();
    java.awt.Color var68 = var66.getForeground();
    var59.setBackground(var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var59.selectionZOrdered();
    org.jhotdraw.contrib.MDI_DrawApplication var71 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var72 = var71.isDoubleBuffered();
    javax.swing.JRootPane var73 = var71.getRootPane();
    javax.swing.JLayeredPane var74 = var71.getLayeredPane();
    int var75 = (-1);
    int var76 = 0;
    org.jhotdraw.standard.StandardDrawingView var77 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var71, var75, var76);
    org.jhotdraw.contrib.MDI_DrawApplication var78 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var79 = var78.isDoubleBuffered();
    javax.swing.JRootPane var80 = var78.getRootPane();
    javax.swing.JLayeredPane var81 = var78.getLayeredPane();
    int var82 = (-1);
    int var83 = 0;
    org.jhotdraw.standard.StandardDrawingView var84 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var78, var82, var83);
    var84.clearSelection();
    java.awt.Color var86 = var84.getForeground();
    var77.setBackground(var86);
    org.jhotdraw.framework.FigureEnumeration var88 = var77.selectionZOrdered();
    var59.addToSelectionAll(var88);
    boolean var90 = var22.figureExists((org.jhotdraw.framework.Figure)var49, var88);
    var49.layout();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test373() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var2 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var4 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var2, (org.jhotdraw.framework.FigureChangeListener)var3);
    boolean var5 = var1.remove((java.lang.Object)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test374() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var14 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var12, (org.jhotdraw.framework.FigureChangeListener)var13);
    java.awt.Dimension var15 = var12.size();
    var0.setPreferredSize(var15);
    org.jhotdraw.figures.PolyLineFigure var17 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.contrib.NestedCreationTool var18 = new org.jhotdraw.contrib.NestedCreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test375() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    org.jhotdraw.samples.javadraw.JavaDrawApplet var3 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var3.start();
    var0.remove((java.awt.Component)var3);
    org.jhotdraw.framework.DrawingView var6 = var0.view();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test376() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    int var10 = 100;
    int var11 = (-1);
    int var12 = (-1);
    int var13 = (-1);
    var2.reshape(var10, var11, var12, var13);
    boolean var15 = var2.isContentAreaFilled();
    javax.swing.InputVerifier var16 = var2.getInputVerifier();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test377() throws Throwable {

    java.awt.Font var0 = org.jhotdraw.figures.TextFigure.createCurrentFont();

  }

  public void test378() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    int var44 = javax.swing.JLayeredPane.getLayer((javax.swing.JComponent)var34);
    var34.disable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);

  }

  public void test379() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var10.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test380() throws Throwable {

    org.jhotdraw.util.VersionManagement var0 = new org.jhotdraw.util.VersionManagement();

  }

  public void test381() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double(10.0d);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    org.jhotdraw.util.Bounds var54 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51, var52, var53);
    int var55 = (-1);
    int var56 = 10;
    var54.shiftBy(var55, var56);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test382() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test383() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Figure var1 = var0.getObservedFigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test384() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 100;
    int var13 = (-1);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.Figure var23 = var0.findFigureInsideWithout(var12, var13, (org.jhotdraw.framework.Figure)var22);
    java.util.Iterator var24 = var0.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    javax.swing.JLayeredPane var28 = var25.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    java.awt.Component var36 = var25.add((java.awt.Component)var35);
    boolean var37 = var35.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var39 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var40 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var38, (org.jhotdraw.framework.FigureChangeListener)var39);
    java.awt.Dimension var41 = var38.size();
    var35.removeFromSelection((org.jhotdraw.framework.Figure)var38);
    var38.layout();
    java.lang.Object var44 = var38.clone();
    org.jhotdraw.framework.FigureChangeEvent var45 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var38);
    var0.figureRequestUpdate(var45);
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var48 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var49 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var47, (org.jhotdraw.framework.FigureChangeListener)var48);
    java.awt.Dimension var50 = var47.size();
    var0.sendToBack((org.jhotdraw.framework.Figure)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test385() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    java.lang.Double var9 = new java.lang.Double((-1.0d));
    java.lang.Double var10 = new java.lang.Double(100.0d);
    java.lang.Double var11 = new java.lang.Double(1.0d);
    java.awt.Point var12 = org.jhotdraw.util.Geom.polarToPoint(var9, var10, var11);
    java.awt.Point var13 = var8.chop(var12);

  }

  public void test386() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    boolean var9 = var6.isDoubleBuffered();
    org.jhotdraw.framework.Tool var10 = var6.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test387() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    java.awt.Dimension var6 = var3.size();
    var2.setPreferredSize(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test388() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.figures.EllipseFigure var8 = new org.jhotdraw.figures.EllipseFigure(var3, var7);
    java.awt.Rectangle var9 = var8.displayBox();

  }

  public void test389() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.figures.EllipseFigure var8 = new org.jhotdraw.figures.EllipseFigure(var3, var7);
    java.awt.Rectangle var9 = var8.displayBox();
    java.lang.String var10 = "hi!";
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var11 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var12 = var11.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var13 = var11.handles();
    var11.release();
    var8.setAttribute(var10, (java.lang.Object)var11);

  }

  public void test390() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    boolean var3 = var0.isFocusTraversalPolicyProvider();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test391() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    java.awt.event.MouseListener[] var7 = var0.getMouseListeners();
    java.lang.Boolean var8 = new java.lang.Boolean(false);
    var0.setFocusTraversalKeysEnabled(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test392() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    var4.deactivate();
    var4.activate();
    boolean var7 = var4.isUsable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test393() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.framework.Figure var26 = var17.findFigureInside(var24, var25);
    org.jhotdraw.standard.StandardDrawing var27 = new org.jhotdraw.standard.StandardDrawing();
    int var28 = 1;
    int var29 = 1;
    org.jhotdraw.contrib.PolygonFigure var30 = new org.jhotdraw.contrib.PolygonFigure(var28, var29);
    org.jhotdraw.framework.FigureEnumeration var31 = var30.figures();
    java.awt.Rectangle var32 = var30.displayBox();
    int var33 = 1;
    int var34 = 1;
    org.jhotdraw.contrib.PolygonFigure var35 = new org.jhotdraw.contrib.PolygonFigure(var33, var34);
    org.jhotdraw.framework.FigureEnumeration var36 = var35.figures();
    java.awt.Rectangle var37 = var35.displayBox();
    org.jhotdraw.framework.Figure var38 = var27.findFigure(var32, (org.jhotdraw.framework.Figure)var35);
    int var39 = 100;
    int var40 = (-1);
    java.lang.Double var41 = new java.lang.Double((-1.0d));
    java.lang.Double var42 = new java.lang.Double(100.0d);
    java.lang.Double var43 = new java.lang.Double(1.0d);
    java.awt.Point var44 = org.jhotdraw.util.Geom.polarToPoint(var41, var42, var43);
    java.lang.Double var45 = new java.lang.Double((-1.0d));
    java.lang.Double var46 = new java.lang.Double(100.0d);
    java.lang.Double var47 = new java.lang.Double(1.0d);
    java.awt.Point var48 = org.jhotdraw.util.Geom.polarToPoint(var45, var46, var47);
    org.jhotdraw.contrib.DiamondFigure var49 = new org.jhotdraw.contrib.DiamondFigure(var44, var48);
    org.jhotdraw.framework.Figure var50 = var27.findFigureInsideWithout(var39, var40, (org.jhotdraw.framework.Figure)var49);
    int var51 = var17.getLayer((org.jhotdraw.framework.Figure)var49);
    int var52 = var17.figureCount();
    var17.release();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == 0);

  }

  public void test394() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var7 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);

  }

  public void test395() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var0.setUndecorated(var10);
    int var12 = 10;
    var0.setExtendedState(var12);
    java.awt.Component[] var14 = var0.getComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test396() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    java.util.Iterator var2 = var1.iterator();

  }

  public void test397() throws Throwable {

    int var0 = (-1);
    org.jhotdraw.util.PaletteLayout var1 = new org.jhotdraw.util.PaletteLayout(var0);

  }

  public void test398() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    var0.open();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    org.jhotdraw.util.UndoableAdapter var12 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var10);
    java.awt.Dimension var13 = var10.getPreferredSize();
    var0.setMinimumSize(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test399() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    int var27 = (-1);
    int var28 = 0;
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var33 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var34 = var33.isDoubleBuffered();
    javax.swing.JRootPane var35 = var33.getRootPane();
    javax.swing.JLayeredPane var36 = var33.getLayeredPane();
    int var37 = (-1);
    int var38 = 0;
    org.jhotdraw.standard.StandardDrawingView var39 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var33, var37, var38);
    java.awt.Component var40 = var29.add((java.awt.Component)var39);
    boolean var41 = var39.getInheritsPopupMenu();
    javax.swing.InputMap var42 = var39.getInputMap();
    var26.invokeStart(var27, var28, (org.jhotdraw.framework.DrawingView)var39);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test400() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    int var25 = 0;
    var0.setDefaultCloseOperation(var25);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test401() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    java.lang.String var8 = var7.getUIClassID();
    java.awt.Insets var9 = var7.getInsets();
    int var10 = (-1);
    var4.setPosition((java.awt.Component)var7, var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    int var14 = 0;
    var4.setLayer((java.awt.Component)var12, var14);
    org.jhotdraw.figures.UngroupCommand var16 = new org.jhotdraw.figures.UngroupCommand(var0, (org.jhotdraw.framework.DrawingEditor)var12);
    org.jhotdraw.contrib.MDI_DrawApplication var17 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var18 = var17.isDoubleBuffered();
    javax.swing.JRootPane var19 = var17.getRootPane();
    javax.swing.JLayeredPane var20 = var17.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    javax.swing.JRootPane var23 = var21.getRootPane();
    javax.swing.JLayeredPane var24 = var21.getLayeredPane();
    int var25 = (-1);
    int var26 = 0;
    org.jhotdraw.standard.StandardDrawingView var27 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var21, var25, var26);
    java.awt.Component var28 = var17.add((java.awt.Component)var27);
    boolean var29 = var27.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var30 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var31 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var32 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var30, (org.jhotdraw.framework.FigureChangeListener)var31);
    java.awt.Dimension var33 = var30.size();
    var27.removeFromSelection((org.jhotdraw.framework.Figure)var30);
    var16.figureSelectionChanged((org.jhotdraw.framework.DrawingView)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);

  }

  public void test402() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    java.lang.String var8 = var7.getUIClassID();
    java.awt.Insets var9 = var7.getInsets();
    int var10 = (-1);
    var4.setPosition((java.awt.Component)var7, var10);
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    int var14 = 0;
    var4.setLayer((java.awt.Component)var12, var14);
    org.jhotdraw.figures.UngroupCommand var16 = new org.jhotdraw.figures.UngroupCommand(var0, (org.jhotdraw.framework.DrawingEditor)var12);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var17 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var17.start();
    java.awt.Color var19 = var17.getForeground();
    var17.endAnimation();
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    javax.swing.JRootPane var23 = var21.getRootPane();
    javax.swing.JLayeredPane var24 = var21.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    java.lang.String var28 = var27.getUIClassID();
    java.awt.Insets var29 = var27.getInsets();
    int var30 = (-1);
    var24.setPosition((java.awt.Component)var27, var30);
    int var32 = var24.highestLayer();
    var24.disable();
    var17.setLayeredPane(var24);
    var12.remove((java.awt.Component)var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == (-30000));

  }

  public void test403() throws Throwable {

    org.jhotdraw.contrib.html.HTMLContentProducer var0 = new org.jhotdraw.contrib.html.HTMLContentProducer();

  }

  public void test404() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    java.util.Iterator var2 = var1.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var3 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var4 = var3.isDoubleBuffered();
    boolean var5 = var3.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var6 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var7 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var8 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var6, (org.jhotdraw.framework.FigureChangeListener)var7);
    int var9 = var7.getZValue();
    java.lang.Object var10 = var7.clone();
    org.jhotdraw.standard.CreationTool var11 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var3, (org.jhotdraw.framework.Figure)var7);
    int var12 = 1;
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var3, var12, var13);
    boolean var15 = var1.contains((java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test405() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.undo();
    org.jhotdraw.framework.FigureEnumeration var10 = var8.getAffectedFigures();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test406() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    java.awt.Dimension var9 = var6.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    boolean var12 = var10.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    int var16 = var14.getZValue();
    java.lang.Object var17 = var14.clone();
    org.jhotdraw.standard.CreationTool var18 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.Figure)var14);
    int var19 = 1;
    int var20 = 0;
    org.jhotdraw.standard.StandardDrawingView var21 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var19, var20);
    var6.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var23 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var24 = var23.isDoubleBuffered();
    javax.swing.JRootPane var25 = var23.getRootPane();
    javax.swing.JLayeredPane var26 = var23.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    java.awt.Component var34 = var23.add((java.awt.Component)var33);
    org.jhotdraw.framework.Tool var35 = var33.tool();
    org.jhotdraw.contrib.dnd.JHDDropTargetListener var36 = new org.jhotdraw.contrib.dnd.JHDDropTargetListener((org.jhotdraw.framework.DrawingEditor)var10, (org.jhotdraw.framework.DrawingView)var33);
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var39 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var37, (org.jhotdraw.framework.FigureChangeListener)var38);
    java.awt.Dimension var40 = var37.size();
    var10.setMinimumSize(var40);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test407() throws Throwable {

    org.jhotdraw.standard.ChopBoxConnector var0 = new org.jhotdraw.standard.ChopBoxConnector();

  }

  public void test408() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    int var25 = 0;
    var0.setDefaultCloseOperation(var25);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    javax.swing.JLayeredPane var38 = var35.getLayeredPane();
    int var39 = (-1);
    int var40 = 0;
    org.jhotdraw.standard.StandardDrawingView var41 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var35, var39, var40);
    java.awt.Component var42 = var31.add((java.awt.Component)var41);
    boolean var43 = var41.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var44 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var45 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var46 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var44, (org.jhotdraw.framework.FigureChangeListener)var45);
    java.awt.Dimension var47 = var44.size();
    var41.removeFromSelection((org.jhotdraw.framework.Figure)var44);
    var44.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var50 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var27, (org.jhotdraw.framework.Figure)var44);
    var27.nextFocus();
    var27.doLayout();
    var0.remove((java.awt.Component)var27);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test409() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    java.awt.Color var8 = var6.getForeground();
    org.jhotdraw.framework.Tool var9 = var6.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test410() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    org.jhotdraw.util.Bounds var52 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51);
    org.jhotdraw.util.Bounds var53 = new org.jhotdraw.util.Bounds(var52);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test411() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var1 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var2 = var1.handles();
    org.jhotdraw.framework.Figure var3 = var0.remove((org.jhotdraw.framework.Figure)var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var5 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var4);
    int var6 = 1;
    int var7 = (-1);
    boolean var8 = var4.containsPoint(var6, var7);
    var1.addFigureChangeListener((org.jhotdraw.framework.FigureChangeListener)var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test412() throws Throwable {

    org.jhotdraw.figures.LineFigure var0 = new org.jhotdraw.figures.LineFigure();

  }

  public void test413() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    boolean var6 = var2.isLightweight();
    boolean var7 = var2.isPopupMenuVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test414() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    org.jhotdraw.contrib.MDI_DrawApplication var3 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var4 = var3.isDoubleBuffered();
    javax.swing.JRootPane var5 = var3.getRootPane();
    javax.swing.JLayeredPane var6 = var3.getLayeredPane();
    int var7 = (-1);
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var3, var7, var8);
    var9.clearSelection();
    var9.requestFocus();
    boolean var12 = var9.isDoubleBuffered();
    org.jhotdraw.standard.StandardDrawing var13 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.HandleEnumeration var23 = var22.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    org.jhotdraw.framework.Figure var27 = var13.replace((org.jhotdraw.framework.Figure)var22, (org.jhotdraw.framework.Figure)var24);
    org.jhotdraw.framework.Handle var28 = org.jhotdraw.standard.BoxHandleKit.north(var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var37 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var35.removeForeground((org.jhotdraw.framework.Painter)var37);
    org.jhotdraw.util.UndoableHandle var39 = new org.jhotdraw.util.UndoableHandle(var28, (org.jhotdraw.framework.DrawingView)var35);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    java.awt.Color var55 = var53.getForeground();
    var46.setBackground(var55);
    org.jhotdraw.framework.FigureEnumeration var57 = var46.selectionZOrdered();
    var57.reset();
    var35.addToSelectionAll(var57);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.awt.Point var64 = var35.getLocation(var63);
    var35.disable();
    var0.viewSelectionChanged((org.jhotdraw.framework.DrawingView)var9, (org.jhotdraw.framework.DrawingView)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test415() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    java.lang.Boolean var9 = new java.lang.Boolean(false);
    var6.setDoubleBuffered(var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test416() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    boolean var5 = var2.isContentAreaFilled();
    javax.swing.Action var6 = var2.getAction();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test417() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var1 = var0.textDisplayBox();
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = 1;
    int var4 = 1;
    org.jhotdraw.contrib.PolygonFigure var5 = new org.jhotdraw.contrib.PolygonFigure(var3, var4);
    org.jhotdraw.framework.FigureEnumeration var6 = var5.figures();
    java.awt.Rectangle var7 = var5.displayBox();
    int var8 = 1;
    int var9 = 1;
    org.jhotdraw.contrib.PolygonFigure var10 = new org.jhotdraw.contrib.PolygonFigure(var8, var9);
    org.jhotdraw.framework.FigureEnumeration var11 = var10.figures();
    java.awt.Rectangle var12 = var10.displayBox();
    org.jhotdraw.framework.Figure var13 = var2.findFigure(var7, (org.jhotdraw.framework.Figure)var10);
    int var14 = 100;
    int var15 = (-1);
    java.lang.Double var16 = new java.lang.Double((-1.0d));
    java.lang.Double var17 = new java.lang.Double(100.0d);
    java.lang.Double var18 = new java.lang.Double(1.0d);
    java.awt.Point var19 = org.jhotdraw.util.Geom.polarToPoint(var16, var17, var18);
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    java.lang.Double var21 = new java.lang.Double(100.0d);
    java.lang.Double var22 = new java.lang.Double(1.0d);
    java.awt.Point var23 = org.jhotdraw.util.Geom.polarToPoint(var20, var21, var22);
    org.jhotdraw.contrib.DiamondFigure var24 = new org.jhotdraw.contrib.DiamondFigure(var19, var23);
    org.jhotdraw.framework.Figure var25 = var2.findFigureInsideWithout(var14, var15, (org.jhotdraw.framework.Figure)var24);
    java.util.Iterator var26 = var2.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    java.awt.Component var38 = var27.add((java.awt.Component)var37);
    boolean var39 = var37.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var42 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var40, (org.jhotdraw.framework.FigureChangeListener)var41);
    java.awt.Dimension var43 = var40.size();
    var37.removeFromSelection((org.jhotdraw.framework.Figure)var40);
    var40.layout();
    java.lang.Object var46 = var40.clone();
    org.jhotdraw.framework.FigureChangeEvent var47 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var40);
    var2.figureRequestUpdate(var47);
    java.awt.Rectangle var49 = var47.getInvalidatedRectangle();
    var0.figureRequestUpdate(var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test418() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    java.lang.Double var52 = new java.lang.Double(1.0d);
    java.lang.Double var53 = new java.lang.Double(1.0d);
    org.jhotdraw.util.Bounds var54 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51, var52, var53);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test419() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    boolean var6 = var2.isLightweight();
    boolean var7 = var2.isPopupMenuVisible();
    boolean var8 = var2.isPaintingForPrint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test420() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    java.awt.Graphics var4 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test421() throws Throwable {

    java.lang.Double var0 = new java.lang.Double(1.0d);
    java.lang.Double var1 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var2 = new org.jhotdraw.standard.RelativeLocator(var0, var1);

  }

  public void test422() throws Throwable {

    org.jhotdraw.standard.RelativeLocator var0 = new org.jhotdraw.standard.RelativeLocator();

  }

  public void test423() throws Throwable {

    org.jhotdraw.figures.PolyLineFigure var0 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var1 = var0.handles();
    java.lang.String var2 = "hi!";
    java.lang.Object var3 = var0.getAttribute(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test424() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    boolean var4 = var2.isRequestFocusEnabled();
    java.awt.Dimension var5 = var2.getSize();
    boolean var6 = var2.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test425() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.util.Undoable var27 = var26.getUndoActivity();
    java.awt.Point var28 = var26.locate();
    org.jhotdraw.framework.DrawingView var29 = var26.getDrawingView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test426() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    int var10 = 100;
    int var11 = (-1);
    int var12 = (-1);
    int var13 = (-1);
    var2.reshape(var10, var11, var12, var13);
    boolean var15 = var2.isContentAreaFilled();
    int var16 = 1;
    //gustavo//timeout exception

  }

  public void test427() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    java.awt.Color var8 = var6.getForeground();
    boolean var9 = org.jhotdraw.util.ColorMap.isTransparent(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test428() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var0.setUndecorated(var10);
    var0.open();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test429() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    java.awt.Component var29 = var18.add((java.awt.Component)var28);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    java.lang.String var38 = var37.getUIClassID();
    java.awt.Insets var39 = var37.getInsets();
    int var40 = (-1);
    var34.setPosition((java.awt.Component)var37, var40);
    boolean var42 = var34.isDisplayable();
    boolean var43 = var10.isFocusCycleRoot((java.awt.Container)var34);
    int var44 = javax.swing.JLayeredPane.getLayer((javax.swing.JComponent)var34);
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JMenu var47 = var45.createLookAndFeelMenu();
    java.lang.Character var48 = new java.lang.Character('a');
    var47.setMnemonic(var48);
    org.jhotdraw.contrib.MDI_DrawApplication var50 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var51 = var50.isDoubleBuffered();
    javax.swing.JRootPane var52 = var50.getRootPane();
    javax.swing.JLayeredPane var53 = var50.getLayeredPane();
    int var54 = (-1);
    int var55 = 0;
    org.jhotdraw.standard.StandardDrawingView var56 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var50, var54, var55);
    var56.clearSelection();
    var34.add((java.awt.Component)var47, (java.lang.Object)var56);
    java.lang.String var59 = "hi!";
    java.lang.Character var60 = new java.lang.Character(' ');
    java.lang.Character var61 = new java.lang.Character('a');
    var56.firePropertyChange(var59, var60, var61);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == false);

  }

  public void test430() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JRootPane var8 = var6.getRootPane();
    javax.swing.JLayeredPane var9 = var6.getLayeredPane();
    int var10 = (-1);
    int var11 = 0;
    org.jhotdraw.standard.StandardDrawingView var12 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var6, var10, var11);
    var12.clearSelection();
    java.awt.Color var14 = var12.getForeground();
    var0.setFillColor(var14);
    java.awt.Color var16 = var0.getBorderColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);

  }

  public void test431() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.event.HierarchyListener[] var15 = var11.getHierarchyListeners();
    java.lang.String[] var16 = var11.getRequiredVersions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test432() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    int var6 = var0.getState();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);

  }

  public void test433() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.contrib.JPanelDesktop var2 = new org.jhotdraw.contrib.JPanelDesktop((org.jhotdraw.application.DrawApplication)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test434() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();

  }

  public void test435() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    java.lang.Boolean var24 = new java.lang.Boolean(true);
    var23.setEnabled(var24);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var23.activate();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test436() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);
    java.awt.Polygon var7 = var6.getPolygon();

  }

  public void test437() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var48 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var47);
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var50 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var49);
    var47.addDependendFigure((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.framework.Handle var52 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var49);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    org.jhotdraw.contrib.MDI_DrawApplication var60 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var61 = var60.isDoubleBuffered();
    javax.swing.JRootPane var62 = var60.getRootPane();
    javax.swing.JLayeredPane var63 = var60.getLayeredPane();
    int var64 = (-1);
    int var65 = 0;
    org.jhotdraw.standard.StandardDrawingView var66 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var60, var64, var65);
    var66.clearSelection();
    java.awt.Color var68 = var66.getForeground();
    var59.setBackground(var68);
    org.jhotdraw.framework.FigureEnumeration var70 = var59.selectionZOrdered();
    org.jhotdraw.contrib.MDI_DrawApplication var71 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var72 = var71.isDoubleBuffered();
    javax.swing.JRootPane var73 = var71.getRootPane();
    javax.swing.JLayeredPane var74 = var71.getLayeredPane();
    int var75 = (-1);
    int var76 = 0;
    org.jhotdraw.standard.StandardDrawingView var77 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var71, var75, var76);
    org.jhotdraw.contrib.MDI_DrawApplication var78 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var79 = var78.isDoubleBuffered();
    javax.swing.JRootPane var80 = var78.getRootPane();
    javax.swing.JLayeredPane var81 = var78.getLayeredPane();
    int var82 = (-1);
    int var83 = 0;
    org.jhotdraw.standard.StandardDrawingView var84 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var78, var82, var83);
    var84.clearSelection();
    java.awt.Color var86 = var84.getForeground();
    var77.setBackground(var86);
    org.jhotdraw.framework.FigureEnumeration var88 = var77.selectionZOrdered();
    var59.addToSelectionAll(var88);
    boolean var90 = var22.figureExists((org.jhotdraw.framework.Figure)var49, var88);
    boolean var91 = var88.hasNextFigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var91 == false);

  }

  public void test438() throws Throwable {

    org.jhotdraw.figures.ImageFigure var0 = new org.jhotdraw.figures.ImageFigure();

  }

  public void test439() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    var8.basicDisplayBox(var13, var17);
    org.jhotdraw.standard.StandardDrawing var19 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    java.lang.Double var21 = new java.lang.Double(100.0d);
    java.lang.Double var22 = new java.lang.Double(1.0d);
    java.awt.Point var23 = org.jhotdraw.util.Geom.polarToPoint(var20, var21, var22);
    java.lang.Double var24 = new java.lang.Double((-1.0d));
    java.lang.Double var25 = new java.lang.Double(100.0d);
    java.lang.Double var26 = new java.lang.Double(1.0d);
    java.awt.Point var27 = org.jhotdraw.util.Geom.polarToPoint(var24, var25, var26);
    org.jhotdraw.contrib.DiamondFigure var28 = new org.jhotdraw.contrib.DiamondFigure(var23, var27);
    org.jhotdraw.framework.HandleEnumeration var29 = var28.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var30 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var31 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var32 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var30, (org.jhotdraw.framework.FigureChangeListener)var31);
    org.jhotdraw.framework.Figure var33 = var19.replace((org.jhotdraw.framework.Figure)var28, (org.jhotdraw.framework.Figure)var30);
    org.jhotdraw.framework.Handle var34 = org.jhotdraw.standard.BoxHandleKit.north(var33);
    org.jhotdraw.contrib.MDI_DrawApplication var35 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var36 = var35.isDoubleBuffered();
    javax.swing.JRootPane var37 = var35.getRootPane();
    javax.swing.JLayeredPane var38 = var35.getLayeredPane();
    int var39 = (-1);
    int var40 = 0;
    org.jhotdraw.standard.StandardDrawingView var41 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var35, var39, var40);
    var41.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var43 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var41.removeForeground((org.jhotdraw.framework.Painter)var43);
    org.jhotdraw.util.UndoableHandle var45 = new org.jhotdraw.util.UndoableHandle(var34, (org.jhotdraw.framework.DrawingView)var41);
    org.jhotdraw.contrib.MDI_DrawApplication var46 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var47 = var46.isDoubleBuffered();
    javax.swing.JRootPane var48 = var46.getRootPane();
    javax.swing.JLayeredPane var49 = var46.getLayeredPane();
    int var50 = (-1);
    int var51 = 0;
    org.jhotdraw.standard.StandardDrawingView var52 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var46, var50, var51);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    var59.clearSelection();
    java.awt.Color var61 = var59.getForeground();
    var52.setBackground(var61);
    org.jhotdraw.framework.FigureEnumeration var63 = var52.selectionZOrdered();
    var63.reset();
    var41.addToSelectionAll(var63);
    java.lang.Double var66 = new java.lang.Double((-1.0d));
    java.lang.Double var67 = new java.lang.Double(100.0d);
    java.lang.Double var68 = new java.lang.Double(1.0d);
    java.awt.Point var69 = org.jhotdraw.util.Geom.polarToPoint(var66, var67, var68);
    java.awt.Point var70 = var41.getLocation(var69);
    java.lang.Double var71 = new java.lang.Double((-1.0d));
    java.lang.Double var72 = new java.lang.Double(100.0d);
    java.lang.Double var73 = new java.lang.Double(1.0d);
    java.awt.Point var74 = org.jhotdraw.util.Geom.polarToPoint(var71, var72, var73);
    var8.basicDisplayBox(var69, var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test440() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    int var5 = (-1);
    int var6 = 0;
    org.jhotdraw.standard.StandardDrawingView var7 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var5, var6);
    var7.clearSelection();
    org.jhotdraw.util.UndoableAdapter var9 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var7);
    var0.removeDrawingChangeListener((org.jhotdraw.framework.DrawingChangeListener)var7);
    int var11 = 10;
    int var12 = 1;
    int var13 = 1;
    int var14 = 1;
    org.jhotdraw.contrib.PolygonFigure var15 = new org.jhotdraw.contrib.PolygonFigure(var13, var14);
    org.jhotdraw.framework.FigureEnumeration var16 = var15.figures();
    java.lang.Double var17 = new java.lang.Double((-1.0d));
    java.lang.Double var18 = new java.lang.Double(100.0d);
    java.lang.Double var19 = new java.lang.Double(1.0d);
    java.awt.Point var20 = org.jhotdraw.util.Geom.polarToPoint(var17, var18, var19);
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    java.lang.Double var22 = new java.lang.Double(100.0d);
    java.lang.Double var23 = new java.lang.Double(1.0d);
    java.awt.Point var24 = org.jhotdraw.util.Geom.polarToPoint(var21, var22, var23);
    var15.basicDisplayBox(var20, var24);
    java.lang.Double var26 = new java.lang.Double(0.0d);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var28 = new org.jhotdraw.standard.RelativeLocator(var26, var27);
    int var29 = 0;
    org.jhotdraw.contrib.PolygonHandle var30 = new org.jhotdraw.contrib.PolygonHandle(var15, (org.jhotdraw.framework.Locator)var28, var29);
    org.jhotdraw.framework.Figure var31 = var0.findFigureInsideWithout(var11, var12, (org.jhotdraw.framework.Figure)var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);

  }

  public void test441() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    boolean var9 = var8.undo();
    org.jhotdraw.contrib.GraphicalCompositeFigure var10 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var12 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var10, (org.jhotdraw.framework.FigureChangeListener)var11);
    org.jhotdraw.standard.StandardDrawing var13 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.HandleEnumeration var23 = var22.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    org.jhotdraw.framework.Figure var27 = var13.replace((org.jhotdraw.framework.Figure)var22, (org.jhotdraw.framework.Figure)var24);
    org.jhotdraw.framework.Handle var28 = org.jhotdraw.standard.BoxHandleKit.north(var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var37 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var35.removeForeground((org.jhotdraw.framework.Painter)var37);
    org.jhotdraw.util.UndoableHandle var39 = new org.jhotdraw.util.UndoableHandle(var28, (org.jhotdraw.framework.DrawingView)var35);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    java.awt.Color var55 = var53.getForeground();
    var46.setBackground(var55);
    org.jhotdraw.framework.FigureEnumeration var57 = var46.selectionZOrdered();
    var57.reset();
    var35.addToSelectionAll(var57);
    var10.orphanAll(var57);
    var8.setAffectedFigures(var57);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test442() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.util.Bounds var5 = new org.jhotdraw.util.Bounds((java.awt.geom.Rectangle2D)var4);
    org.jhotdraw.standard.StandardDrawing var6 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var7 = new java.lang.Double((-1.0d));
    java.lang.Double var8 = new java.lang.Double(100.0d);
    java.lang.Double var9 = new java.lang.Double(1.0d);
    java.awt.Point var10 = org.jhotdraw.util.Geom.polarToPoint(var7, var8, var9);
    java.lang.Double var11 = new java.lang.Double((-1.0d));
    java.lang.Double var12 = new java.lang.Double(100.0d);
    java.lang.Double var13 = new java.lang.Double(1.0d);
    java.awt.Point var14 = org.jhotdraw.util.Geom.polarToPoint(var11, var12, var13);
    org.jhotdraw.contrib.DiamondFigure var15 = new org.jhotdraw.contrib.DiamondFigure(var10, var14);
    org.jhotdraw.framework.HandleEnumeration var16 = var15.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    org.jhotdraw.framework.Figure var20 = var6.replace((org.jhotdraw.framework.Figure)var15, (org.jhotdraw.framework.Figure)var17);
    org.jhotdraw.framework.Handle var21 = org.jhotdraw.standard.BoxHandleKit.north(var20);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    var28.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var30 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var28.removeForeground((org.jhotdraw.framework.Painter)var30);
    org.jhotdraw.util.UndoableHandle var32 = new org.jhotdraw.util.UndoableHandle(var21, (org.jhotdraw.framework.DrawingView)var28);
    org.jhotdraw.contrib.MDI_DrawApplication var33 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var34 = var33.isDoubleBuffered();
    javax.swing.JRootPane var35 = var33.getRootPane();
    javax.swing.JLayeredPane var36 = var33.getLayeredPane();
    int var37 = (-1);
    int var38 = 0;
    org.jhotdraw.standard.StandardDrawingView var39 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var33, var37, var38);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    var46.clearSelection();
    java.awt.Color var48 = var46.getForeground();
    var39.setBackground(var48);
    org.jhotdraw.framework.FigureEnumeration var50 = var39.selectionZOrdered();
    var50.reset();
    var28.addToSelectionAll(var50);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    java.lang.Double var54 = new java.lang.Double(100.0d);
    java.lang.Double var55 = new java.lang.Double(1.0d);
    java.awt.Point var56 = org.jhotdraw.util.Geom.polarToPoint(var53, var54, var55);
    java.awt.Point var57 = var28.getLocation(var56);
    org.jhotdraw.util.Bounds var58 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var57);
    var5.intersect(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test443() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    java.lang.String var13 = var12.getUIClassID();
    java.awt.Insets var14 = var12.getInsets();
    var7.setMargin(var14);
    java.lang.String var16 = "";
    var7.setLabel(var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13.equals("RootPaneUI"));

  }

  public void test444() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    java.lang.String var4 = var0.getAppletInfo();
    javax.swing.JRootPane var5 = var0.getRootPane();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test445() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.standard.AWTCursor var1 = new org.jhotdraw.standard.AWTCursor(var0);

  }

  public void test446() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    java.awt.Rectangle var4 = var2.displayBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));

  }

  public void test447() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var15 = new org.jhotdraw.standard.RelativeLocator(var13, var14);
    int var16 = 0;
    org.jhotdraw.contrib.PolygonHandle var17 = new org.jhotdraw.contrib.PolygonHandle(var2, (org.jhotdraw.framework.Locator)var15, var16);
    int var18 = 10;
    int var19 = 1;
    int var20 = 0;
    int var21 = (-1);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    var28.clearSelection();
    org.jhotdraw.util.UndoableAdapter var30 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var28);
    java.awt.Dimension var31 = var28.getPreferredSize();
    var17.invokeEnd(var18, var19, var20, var21, (org.jhotdraw.framework.DrawingView)var28);
    int var33 = 100;
    int var34 = 0;
    int var35 = 100;
    int var36 = 10;
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    var43.clearSelection();
    var43.requestFocus();
    java.lang.Boolean var46 = new java.lang.Boolean(false);
    var43.setDoubleBuffered(var46);
    var17.invokeEnd(var33, var34, var35, var36, (org.jhotdraw.framework.DrawingView)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test448() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var1 = new java.lang.Double((-1.0d));
    java.lang.Double var2 = new java.lang.Double(100.0d);
    java.lang.Double var3 = new java.lang.Double(1.0d);
    java.awt.Point var4 = org.jhotdraw.util.Geom.polarToPoint(var1, var2, var3);
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.contrib.DiamondFigure var9 = new org.jhotdraw.contrib.DiamondFigure(var4, var8);
    org.jhotdraw.framework.HandleEnumeration var10 = var9.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var11 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var13 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var11, (org.jhotdraw.framework.FigureChangeListener)var12);
    org.jhotdraw.framework.Figure var14 = var0.replace((org.jhotdraw.framework.Figure)var9, (org.jhotdraw.framework.Figure)var11);
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.north(var14);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    var22.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var24 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var22.removeForeground((org.jhotdraw.framework.Painter)var24);
    org.jhotdraw.util.UndoableHandle var26 = new org.jhotdraw.util.UndoableHandle(var15, (org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var33.setBackground(var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var33.selectionZOrdered();
    var44.reset();
    var22.addToSelectionAll(var44);
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.awt.Point var51 = var22.getLocation(var50);
    org.jhotdraw.util.Bounds var52 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var51);
    int var53 = 1;
    int var54 = 1;
    org.jhotdraw.contrib.PolygonFigure var55 = new org.jhotdraw.contrib.PolygonFigure(var53, var54);
    org.jhotdraw.framework.FigureEnumeration var56 = var55.figures();
    java.awt.Rectangle var57 = var55.displayBox();
    org.jhotdraw.util.Bounds var58 = new org.jhotdraw.util.Bounds((java.awt.geom.Rectangle2D)var57);
    var52.intersect(var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test449() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    int var13 = 0;
    var3.setLayer((java.awt.Component)var11, var13);
    java.awt.event.HierarchyListener[] var15 = var11.getHierarchyListeners();
    java.lang.String[] var16 = var11.getRequiredVersions();
    java.awt.Window[] var17 = var11.getOwnedWindows();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test450() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    org.jhotdraw.contrib.GraphicalCompositeFigure var12 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var14 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var12, (org.jhotdraw.framework.FigureChangeListener)var13);
    java.awt.Dimension var15 = var12.size();
    var0.setPreferredSize(var15);
    org.jhotdraw.figures.PolyLineFigure var17 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.contrib.NestedCreationTool var18 = new org.jhotdraw.contrib.NestedCreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    java.lang.Double var19 = new java.lang.Double(1.0d);
    java.lang.Double var20 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var21 = new org.jhotdraw.standard.RelativeLocator(var19, var20);
    int var22 = (-1);
    org.jhotdraw.figures.PolyLineHandle var23 = new org.jhotdraw.figures.PolyLineHandle(var17, (org.jhotdraw.framework.Locator)var21, var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test451() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    int var10 = 100;
    int var11 = (-1);
    int var12 = (-1);
    int var13 = (-1);
    var2.reshape(var10, var11, var12, var13);
    boolean var15 = var2.isContentAreaFilled();
    javax.swing.InputVerifier var16 = var2.getInputVerifier();
    javax.swing.KeyStroke var17 = var2.getAccelerator();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test452() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    var2.basicDisplayBox(var7, var11);
    java.lang.Double var13 = new java.lang.Double(0.0d);
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var15 = new org.jhotdraw.standard.RelativeLocator(var13, var14);
    int var16 = 0;
    org.jhotdraw.contrib.PolygonHandle var17 = new org.jhotdraw.contrib.PolygonHandle(var2, (org.jhotdraw.framework.Locator)var15, var16);
    int var18 = 10;
    int var19 = 1;
    int var20 = 0;
    int var21 = (-1);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    var28.clearSelection();
    org.jhotdraw.util.UndoableAdapter var30 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var28);
    java.awt.Dimension var31 = var28.getPreferredSize();
    var17.invokeEnd(var18, var19, var20, var21, (org.jhotdraw.framework.DrawingView)var28);
    int var33 = 0;
    int var34 = 1;
    org.jhotdraw.standard.StandardDrawing var35 = new org.jhotdraw.standard.StandardDrawing();
    int var36 = 1;
    int var37 = 1;
    org.jhotdraw.contrib.PolygonFigure var38 = new org.jhotdraw.contrib.PolygonFigure(var36, var37);
    org.jhotdraw.framework.FigureEnumeration var39 = var38.figures();
    java.awt.Rectangle var40 = var38.displayBox();
    int var41 = 1;
    int var42 = 1;
    org.jhotdraw.contrib.PolygonFigure var43 = new org.jhotdraw.contrib.PolygonFigure(var41, var42);
    org.jhotdraw.framework.FigureEnumeration var44 = var43.figures();
    java.awt.Rectangle var45 = var43.displayBox();
    org.jhotdraw.framework.Figure var46 = var35.findFigure(var40, (org.jhotdraw.framework.Figure)var43);
    var17.invokeEnd(var33, var34, (org.jhotdraw.framework.Drawing)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);

  }

  public void test453() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    java.lang.Boolean var3 = new java.lang.Boolean(false);
    var0.setFocusCycleRoot(var3);
    boolean var5 = var0.isFocusableWindow();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);

  }

  public void test454() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var1 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = 1;
    int var4 = 1;
    org.jhotdraw.contrib.PolygonFigure var5 = new org.jhotdraw.contrib.PolygonFigure(var3, var4);
    org.jhotdraw.framework.FigureEnumeration var6 = var5.figures();
    java.awt.Rectangle var7 = var5.displayBox();
    int var8 = 1;
    int var9 = 1;
    org.jhotdraw.contrib.PolygonFigure var10 = new org.jhotdraw.contrib.PolygonFigure(var8, var9);
    org.jhotdraw.framework.FigureEnumeration var11 = var10.figures();
    java.awt.Rectangle var12 = var10.displayBox();
    org.jhotdraw.framework.Figure var13 = var2.findFigure(var7, (org.jhotdraw.framework.Figure)var10);
    int var14 = 100;
    int var15 = (-1);
    java.lang.Double var16 = new java.lang.Double((-1.0d));
    java.lang.Double var17 = new java.lang.Double(100.0d);
    java.lang.Double var18 = new java.lang.Double(1.0d);
    java.awt.Point var19 = org.jhotdraw.util.Geom.polarToPoint(var16, var17, var18);
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    java.lang.Double var21 = new java.lang.Double(100.0d);
    java.lang.Double var22 = new java.lang.Double(1.0d);
    java.awt.Point var23 = org.jhotdraw.util.Geom.polarToPoint(var20, var21, var22);
    org.jhotdraw.contrib.DiamondFigure var24 = new org.jhotdraw.contrib.DiamondFigure(var19, var23);
    org.jhotdraw.framework.Figure var25 = var2.findFigureInsideWithout(var14, var15, (org.jhotdraw.framework.Figure)var24);
    java.util.Iterator var26 = var2.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    java.awt.Component var38 = var27.add((java.awt.Component)var37);
    boolean var39 = var37.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var42 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var40, (org.jhotdraw.framework.FigureChangeListener)var41);
    java.awt.Dimension var43 = var40.size();
    var37.removeFromSelection((org.jhotdraw.framework.Figure)var40);
    var40.layout();
    java.lang.Object var46 = var40.clone();
    org.jhotdraw.framework.FigureChangeEvent var47 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var40);
    var2.figureRequestUpdate(var47);
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var51 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var49, (org.jhotdraw.framework.FigureChangeListener)var50);
    java.awt.Dimension var52 = var49.size();
    var2.sendToBack((org.jhotdraw.framework.Figure)var49);
    var0.disconnect((org.jhotdraw.framework.Figure)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test455() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    org.jhotdraw.contrib.DiamondFigure var8 = new org.jhotdraw.contrib.DiamondFigure(var3, var7);
    org.jhotdraw.framework.HandleEnumeration var9 = var8.handles();
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    java.awt.Point var14 = var8.chop(var13);

  }

  public void test456() throws Throwable {

    org.jhotdraw.contrib.TextAreaFigure var0 = new org.jhotdraw.contrib.TextAreaFigure();

  }

  public void test457() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    var0.open();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    org.jhotdraw.util.UndoableAdapter var12 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var10);
    java.awt.Dimension var13 = var10.getPreferredSize();
    var0.setMinimumSize(var13);
    int var15 = 10;
    int var16 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var17 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var15, var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test458() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    var10.repaint();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test459() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var1 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var0);
    org.jhotdraw.contrib.html.ContentProducerRegistry var2 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var3 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var2);
    var1.setParent(var3);
    org.jhotdraw.contrib.html.ContentProducerRegistry var5 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var6 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var5);
    org.jhotdraw.contrib.html.ContentProducerRegistry var7 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    var5.setParent(var7);
    var1.setParent(var5);

  }

  public void test460() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    java.lang.Boolean var10 = new java.lang.Boolean(true);
    var7.setBorderPainted(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);

  }

  public void test461() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    java.lang.Object var23 = var17.clone();
    org.jhotdraw.framework.FigureChangeEvent var24 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var17);
    java.lang.Object var25 = var24.getSource();
    var2.figureInvalidated(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test462() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    java.lang.String var4 = "";
    int var5 = 100;
    var2.insert(var4, var5);
    boolean var7 = var2.isFocusPainted();
    java.lang.String var8 = "";
    var2.setLabel(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test463() throws Throwable {

    org.jhotdraw.contrib.ChopDiamondConnector var0 = new org.jhotdraw.contrib.ChopDiamondConnector();
    int var1 = 10;
    int var2 = 10;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.containsPoint(var1, var2);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test464() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    java.lang.String var9 = "hi!";
    java.lang.String var10 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    java.awt.Graphics var15 = var11.getGraphics();
    java.lang.Boolean var16 = new java.lang.Boolean(true);
    var11.setLocationByPlatform(var16);
    org.jhotdraw.standard.StandardDrawing var18 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var19 = new java.lang.Double((-1.0d));
    java.lang.Double var20 = new java.lang.Double(100.0d);
    java.lang.Double var21 = new java.lang.Double(1.0d);
    java.awt.Point var22 = org.jhotdraw.util.Geom.polarToPoint(var19, var20, var21);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    org.jhotdraw.contrib.DiamondFigure var27 = new org.jhotdraw.contrib.DiamondFigure(var22, var26);
    org.jhotdraw.framework.HandleEnumeration var28 = var27.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var29 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var30 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var31 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var29, (org.jhotdraw.framework.FigureChangeListener)var30);
    org.jhotdraw.framework.Figure var32 = var18.replace((org.jhotdraw.framework.Figure)var27, (org.jhotdraw.framework.Figure)var29);
    org.jhotdraw.framework.Handle var33 = org.jhotdraw.standard.BoxHandleKit.north(var32);
    org.jhotdraw.standard.HandleTracker var34 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var11, var33);
    org.jhotdraw.standard.ToolButton var35 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var0, var9, var10, (org.jhotdraw.framework.Tool)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test465() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    boolean var10 = var6.isEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test466() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);

  }

  public void test467() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    var0.doLayout();
    var0.pack();
    java.awt.Container var27 = var0.getFocusCycleRootAncestor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);

  }

  public void test468() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    int var7 = 0;
    int var8 = 0;
    org.jhotdraw.standard.StandardDrawingView var9 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var7, var8);
    java.awt.Color var10 = var0.getBackground();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test469() throws Throwable {

    org.jhotdraw.contrib.html.TriangleFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.TriangleFigureGeometricAdapter();

  }

  public void test470() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = var6.getUIClassID();
    java.awt.Insets var8 = var6.getInsets();
    int var9 = (-1);
    var3.setPosition((java.awt.Component)var6, var9);
    var6.resetKeyboardActions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));

  }

  public void test471() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = var0.getFileDescription();
    java.lang.String var2 = "hi!";
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    org.jhotdraw.contrib.DiamondFigure var12 = new org.jhotdraw.contrib.DiamondFigure(var7, var11);
    org.jhotdraw.framework.HandleEnumeration var13 = var12.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    org.jhotdraw.framework.Figure var17 = var3.replace((org.jhotdraw.framework.Figure)var12, (org.jhotdraw.framework.Figure)var14);
    java.lang.String var18 = var0.store(var2, (org.jhotdraw.framework.Drawing)var3);
    java.lang.String var19 = "";
    var0.setFileExtension(var19);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18.equals("hi!.draw"));

  }

  public void test472() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    java.lang.String var11 = var10.getUIClassID();
    java.awt.Insets var12 = var10.getInsets();
    int var13 = (-1);
    var7.setPosition((java.awt.Component)var10, var13);
    int var15 = var7.highestLayer();
    var7.disable();
    var0.setLayeredPane(var7);
    org.jhotdraw.contrib.html.DisposableResourceHolder var18 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-30000));

  }

  public void test473() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    var0.open();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    org.jhotdraw.util.UndoableAdapter var12 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var10);
    java.awt.Dimension var13 = var10.getPreferredSize();
    var0.setMinimumSize(var13);
    int var15 = 10;
    int var16 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var17 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var15, var16);
    //gustavo//timeout exception

  }

  public void test474() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    org.jhotdraw.framework.DrawingView var3 = org.jhotdraw.standard.NullDrawingView.getManagedDrawingView((org.jhotdraw.framework.DrawingEditor)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test475() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = var0.getFileDescription();
    java.lang.String var2 = "hi!";
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var4 = new java.lang.Double((-1.0d));
    java.lang.Double var5 = new java.lang.Double(100.0d);
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.awt.Point var7 = org.jhotdraw.util.Geom.polarToPoint(var4, var5, var6);
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    org.jhotdraw.contrib.DiamondFigure var12 = new org.jhotdraw.contrib.DiamondFigure(var7, var11);
    org.jhotdraw.framework.HandleEnumeration var13 = var12.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    org.jhotdraw.framework.Figure var17 = var3.replace((org.jhotdraw.framework.Figure)var12, (org.jhotdraw.framework.Figure)var14);
    java.lang.String var18 = var0.store(var2, (org.jhotdraw.framework.Drawing)var3);
    org.jhotdraw.framework.FigureEnumeration var19 = var3.figures();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18.equals("hi!.draw"));

  }

  public void test476() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    java.awt.Component var11 = var0.add((java.awt.Component)var10);
    boolean var12 = var10.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var13 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var15 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var13, (org.jhotdraw.framework.FigureChangeListener)var14);
    java.awt.Dimension var16 = var13.size();
    var10.removeFromSelection((org.jhotdraw.framework.Figure)var13);
    var13.layout();
    java.lang.Object var19 = var13.clone();
    org.jhotdraw.framework.FigureChangeEvent var20 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var13);
    org.jhotdraw.contrib.Layouter var21 = var13.getLayouter();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test477() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.Character var3 = new java.lang.Character('a');
    var2.setMnemonic(var3);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.String var8 = var7.getName();
    boolean var9 = var2.isMenuComponent((java.awt.Component)var7);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    java.lang.String var13 = var12.getUIClassID();
    java.awt.Insets var14 = var12.getInsets();
    var7.setMargin(var14);
    boolean var16 = var7.isMinimumSizeSet();
    var7.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test478() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    java.lang.String var6 = var0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test479() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    org.jhotdraw.framework.DrawingView var1 = var0.view();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test480() throws Throwable {

    org.jhotdraw.figures.NumberTextFigure var0 = new org.jhotdraw.figures.NumberTextFigure();

  }

  public void test481() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    org.jhotdraw.util.Bounds var5 = new org.jhotdraw.util.Bounds((java.awt.geom.Rectangle2D)var4);
    java.lang.Double var6 = new java.lang.Double((-1.0d));
    java.lang.Double var7 = new java.lang.Double(100.0d);
    java.lang.Double var8 = new java.lang.Double(1.0d);
    java.awt.Point var9 = org.jhotdraw.util.Geom.polarToPoint(var6, var7, var8);
    var5.setCenter((java.awt.geom.Point2D)var9);

  }

  public void test482() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    java.lang.String var3 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    java.lang.String var7 = "hi!";
    java.lang.Long var8 = new java.lang.Long(100L);
    java.lang.Long var9 = new java.lang.Long(1L);
    var6.firePropertyChange(var7, var8, var9);
    int var11 = var6.getX();
    var2.setAttribute(var3, (java.lang.Object)var11);
    org.jhotdraw.standard.StandardDrawing var13 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var14 = new java.lang.Double((-1.0d));
    java.lang.Double var15 = new java.lang.Double(100.0d);
    java.lang.Double var16 = new java.lang.Double(1.0d);
    java.awt.Point var17 = org.jhotdraw.util.Geom.polarToPoint(var14, var15, var16);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    java.lang.Double var19 = new java.lang.Double(100.0d);
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.awt.Point var21 = org.jhotdraw.util.Geom.polarToPoint(var18, var19, var20);
    org.jhotdraw.contrib.DiamondFigure var22 = new org.jhotdraw.contrib.DiamondFigure(var17, var21);
    org.jhotdraw.framework.HandleEnumeration var23 = var22.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    org.jhotdraw.framework.Figure var27 = var13.replace((org.jhotdraw.framework.Figure)var22, (org.jhotdraw.framework.Figure)var24);
    org.jhotdraw.framework.Handle var28 = org.jhotdraw.standard.BoxHandleKit.north(var27);
    org.jhotdraw.contrib.MDI_DrawApplication var29 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var30 = var29.isDoubleBuffered();
    javax.swing.JRootPane var31 = var29.getRootPane();
    javax.swing.JLayeredPane var32 = var29.getLayeredPane();
    int var33 = (-1);
    int var34 = 0;
    org.jhotdraw.standard.StandardDrawingView var35 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var29, var33, var34);
    var35.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var37 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var35.removeForeground((org.jhotdraw.framework.Painter)var37);
    org.jhotdraw.util.UndoableHandle var39 = new org.jhotdraw.util.UndoableHandle(var28, (org.jhotdraw.framework.DrawingView)var35);
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    java.awt.Color var55 = var53.getForeground();
    var46.setBackground(var55);
    org.jhotdraw.framework.FigureEnumeration var57 = var46.selectionZOrdered();
    var57.reset();
    var35.addToSelectionAll(var57);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.awt.Point var64 = var35.getLocation(var63);
    java.awt.Point var65 = var2.chop(var64);
    java.lang.Double var66 = new java.lang.Double((-1.0d));
    java.lang.Double var67 = new java.lang.Double(100.0d);
    java.lang.Double var68 = new java.lang.Double(1.0d);
    java.awt.Point var69 = org.jhotdraw.util.Geom.polarToPoint(var66, var67, var68);
    org.jhotdraw.util.Bounds var70 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var65, (java.awt.geom.Point2D)var69);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test483() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    java.lang.String var11 = var10.getUIClassID();
    java.awt.Insets var12 = var10.getInsets();
    int var13 = (-1);
    var7.setPosition((java.awt.Component)var10, var13);
    int var15 = var7.highestLayer();
    var7.disable();
    var0.setLayeredPane(var7);
    java.awt.Graphics var18 = var0.getGraphics();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-30000));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == null);

  }

  public void test484() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var23 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var17);
    var0.nextFocus();
    java.lang.Double var25 = new java.lang.Double((-1.0d));
    java.lang.Double var26 = new java.lang.Double(100.0d);
    java.lang.Double var27 = new java.lang.Double(1.0d);
    java.awt.Point var28 = org.jhotdraw.util.Geom.polarToPoint(var25, var26, var27);
    java.awt.Component var29 = var0.getComponentAt(var28);
    java.lang.Boolean var30 = new java.lang.Boolean(false);
    var0.setFocusTraversalPolicyProvider(var30);
    int var32 = 10;
    var0.setCursor(var32);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

  }

  public void test485() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    var0.toggleAnimation();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test486() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    int var12 = (-1);
    int var13 = 0;
    org.jhotdraw.standard.StandardDrawingView var14 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var8, var12, var13);
    java.awt.Component var15 = var4.add((java.awt.Component)var14);
    boolean var16 = var14.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var18 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var19 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var17, (org.jhotdraw.framework.FigureChangeListener)var18);
    java.awt.Dimension var20 = var17.size();
    var14.removeFromSelection((org.jhotdraw.framework.Figure)var17);
    var17.layout();
    java.lang.Object var23 = var17.clone();
    org.jhotdraw.framework.FigureChangeEvent var24 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var17);
    java.lang.Object var25 = var24.getSource();
    var2.figureInvalidated(var24);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    java.lang.Double var28 = new java.lang.Double(100.0d);
    java.lang.Double var29 = new java.lang.Double(1.0d);
    java.awt.Point var30 = org.jhotdraw.util.Geom.polarToPoint(var27, var28, var29);
    java.lang.Double var31 = new java.lang.Double((-1.0d));
    java.lang.Double var32 = new java.lang.Double(100.0d);
    java.lang.Double var33 = new java.lang.Double(1.0d);
    java.awt.Point var34 = org.jhotdraw.util.Geom.polarToPoint(var31, var32, var33);
    org.jhotdraw.figures.EllipseFigure var35 = new org.jhotdraw.figures.EllipseFigure(var30, var34);
    boolean var36 = var2.containsFigure((org.jhotdraw.framework.Figure)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);

  }

  public void test487() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var2 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var0, (org.jhotdraw.framework.FigureChangeListener)var1);
    org.jhotdraw.framework.Handle var3 = org.jhotdraw.standard.BoxHandleKit.south((org.jhotdraw.framework.Figure)var1);

  }

  public void test488() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var8 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var6.removeForeground((org.jhotdraw.framework.Painter)var8);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    javax.swing.JLayeredPane var13 = var10.getLayeredPane();
    int var14 = (-1);
    int var15 = 0;
    org.jhotdraw.standard.StandardDrawingView var16 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var10, var14, var15);
    var16.clearSelection();
    java.awt.Color var18 = var16.getForeground();
    var6.setBackground(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test489() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var1 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var0);
    java.lang.String var2 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var3 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var4 = var3.isDoubleBuffered();
    javax.swing.JMenu var5 = var3.createLookAndFeelMenu();
    java.lang.Character var6 = new java.lang.Character('a');
    var5.setMnemonic(var6);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JMenu var10 = var8.createLookAndFeelMenu();
    java.lang.String var11 = var10.getName();
    boolean var12 = var5.isMenuComponent((java.awt.Component)var10);
    java.lang.Boolean var13 = new java.lang.Boolean(true);
    var10.setBorderPainted(var13);
    var0.setAttribute(var2, (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test490() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    int var1 = 1;
    int var2 = 1;
    org.jhotdraw.contrib.PolygonFigure var3 = new org.jhotdraw.contrib.PolygonFigure(var1, var2);
    org.jhotdraw.framework.FigureEnumeration var4 = var3.figures();
    java.awt.Rectangle var5 = var3.displayBox();
    int var6 = 1;
    int var7 = 1;
    org.jhotdraw.contrib.PolygonFigure var8 = new org.jhotdraw.contrib.PolygonFigure(var6, var7);
    org.jhotdraw.framework.FigureEnumeration var9 = var8.figures();
    java.awt.Rectangle var10 = var8.displayBox();
    org.jhotdraw.framework.Figure var11 = var0.findFigure(var5, (org.jhotdraw.framework.Figure)var8);
    int var12 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var13 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var12);
    var0.orphanAll((java.util.List)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test491() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    int var6 = var4.getZValue();
    java.lang.Object var7 = var4.clone();
    org.jhotdraw.standard.CreationTool var8 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var4);
    java.lang.String var9 = "hi!";
    java.lang.String var10 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    java.awt.Graphics var15 = var11.getGraphics();
    java.lang.Boolean var16 = new java.lang.Boolean(true);
    var11.setLocationByPlatform(var16);
    org.jhotdraw.standard.StandardDrawing var18 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var19 = new java.lang.Double((-1.0d));
    java.lang.Double var20 = new java.lang.Double(100.0d);
    java.lang.Double var21 = new java.lang.Double(1.0d);
    java.awt.Point var22 = org.jhotdraw.util.Geom.polarToPoint(var19, var20, var21);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    org.jhotdraw.contrib.DiamondFigure var27 = new org.jhotdraw.contrib.DiamondFigure(var22, var26);
    org.jhotdraw.framework.HandleEnumeration var28 = var27.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var29 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var30 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var31 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var29, (org.jhotdraw.framework.FigureChangeListener)var30);
    org.jhotdraw.framework.Figure var32 = var18.replace((org.jhotdraw.framework.Figure)var27, (org.jhotdraw.framework.Figure)var29);
    org.jhotdraw.framework.Handle var33 = org.jhotdraw.standard.BoxHandleKit.north(var32);
    org.jhotdraw.standard.HandleTracker var34 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var11, var33);
    org.jhotdraw.standard.ToolButton var35 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var0, var9, var10, (org.jhotdraw.framework.Tool)var34);
    org.jhotdraw.figures.TextFigure var36 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var37 = var36.textDisplayBox();
    org.jhotdraw.standard.StandardDrawing var38 = new org.jhotdraw.standard.StandardDrawing();
    int var39 = 1;
    int var40 = 1;
    org.jhotdraw.contrib.PolygonFigure var41 = new org.jhotdraw.contrib.PolygonFigure(var39, var40);
    org.jhotdraw.framework.FigureEnumeration var42 = var41.figures();
    java.awt.Rectangle var43 = var41.displayBox();
    int var44 = 1;
    int var45 = 1;
    org.jhotdraw.contrib.PolygonFigure var46 = new org.jhotdraw.contrib.PolygonFigure(var44, var45);
    org.jhotdraw.framework.FigureEnumeration var47 = var46.figures();
    java.awt.Rectangle var48 = var46.displayBox();
    org.jhotdraw.framework.Figure var49 = var38.findFigure(var43, (org.jhotdraw.framework.Figure)var46);
    int var50 = 100;
    int var51 = (-1);
    java.lang.Double var52 = new java.lang.Double((-1.0d));
    java.lang.Double var53 = new java.lang.Double(100.0d);
    java.lang.Double var54 = new java.lang.Double(1.0d);
    java.awt.Point var55 = org.jhotdraw.util.Geom.polarToPoint(var52, var53, var54);
    java.lang.Double var56 = new java.lang.Double((-1.0d));
    java.lang.Double var57 = new java.lang.Double(100.0d);
    java.lang.Double var58 = new java.lang.Double(1.0d);
    java.awt.Point var59 = org.jhotdraw.util.Geom.polarToPoint(var56, var57, var58);
    org.jhotdraw.contrib.DiamondFigure var60 = new org.jhotdraw.contrib.DiamondFigure(var55, var59);
    org.jhotdraw.framework.Figure var61 = var38.findFigureInsideWithout(var50, var51, (org.jhotdraw.framework.Figure)var60);
    java.util.Iterator var62 = var38.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var63 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var64 = var63.isDoubleBuffered();
    javax.swing.JRootPane var65 = var63.getRootPane();
    javax.swing.JLayeredPane var66 = var63.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var67 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var68 = var67.isDoubleBuffered();
    javax.swing.JRootPane var69 = var67.getRootPane();
    javax.swing.JLayeredPane var70 = var67.getLayeredPane();
    int var71 = (-1);
    int var72 = 0;
    org.jhotdraw.standard.StandardDrawingView var73 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var67, var71, var72);
    java.awt.Component var74 = var63.add((java.awt.Component)var73);
    boolean var75 = var73.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var76 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var77 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var78 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var76, (org.jhotdraw.framework.FigureChangeListener)var77);
    java.awt.Dimension var79 = var76.size();
    var73.removeFromSelection((org.jhotdraw.framework.Figure)var76);
    var76.layout();
    java.lang.Object var82 = var76.clone();
    org.jhotdraw.framework.FigureChangeEvent var83 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var76);
    var38.figureRequestUpdate(var83);
    java.awt.Rectangle var85 = var83.getInvalidatedRectangle();
    var36.figureRequestUpdate(var83);
    var35.toolActivated((java.util.EventObject)var83);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);

  }

  public void test492() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    var6.requestFocus();
    java.lang.Boolean var9 = new java.lang.Boolean(false);
    var6.setDoubleBuffered(var9);
    org.jhotdraw.figures.PolyLineFigure var11 = new org.jhotdraw.figures.PolyLineFigure();
    boolean var12 = var6.isFigureSelected((org.jhotdraw.framework.Figure)var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test493() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    boolean var6 = var2.isLightweight();
    boolean var7 = var2.isPopupMenuVisible();
    boolean var8 = var2.isPaintingForPrint();
    org.jhotdraw.contrib.MDI_DrawApplication var9 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var10 = var9.isDoubleBuffered();
    javax.swing.JMenu var11 = var9.createLookAndFeelMenu();
    java.lang.Character var12 = new java.lang.Character('a');
    var11.setMnemonic(var12);
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JMenu var16 = var14.createLookAndFeelMenu();
    java.lang.String var17 = var16.getName();
    boolean var18 = var11.isMenuComponent((java.awt.Component)var16);
    java.lang.Boolean var19 = new java.lang.Boolean(true);
    var16.setBorderPainted(var19);
    javax.swing.JMenuItem var21 = var2.add((javax.swing.JMenuItem)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);

  }

  public void test494() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    java.lang.String var4 = "hi!";
    var2.setText(var4);
    boolean var6 = var2.isLightweight();
    org.jhotdraw.contrib.GraphicalCompositeFigure var7 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var8 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var9 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var7, (org.jhotdraw.framework.FigureChangeListener)var8);
    java.awt.Dimension var10 = var7.size();
    var2.setPreferredSize(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test495() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    java.lang.Boolean var5 = new java.lang.Boolean(true);
    var2.setSelected(var5);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test496() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    java.awt.Container var2 = var0.getFocusCycleRootAncestor();
    boolean var3 = var0.isResizable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test497() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var1 = var0.getDefaultDrawingTitle();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test498() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = var0.getFileDescription();
    java.lang.String var2 = "";
    org.jhotdraw.framework.Drawing var3 = var0.restore(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);

  }

  public void test499() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);

  }

  public void test500() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var6.clearSelection();
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    java.lang.Boolean var11 = new java.lang.Boolean(true);
    var8.setUndoable(var11);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

}

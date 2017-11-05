
import junit.framework.*;

public class RandoopTest4 extends TestCase {

  // Runs all the tests in this file.
  public static void main(String[] args) {
    junit.textui.TestRunner.run(RandoopTest4.class);
  }

  public void test1() throws Throwable {

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
    int var17 = 10;
    int var18 = 10;
    var2.addPoint(var17, var18);

  }

  public void test2() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    org.jhotdraw.figures.PolyLineFigure var4 = new org.jhotdraw.figures.PolyLineFigure();
    int var5 = var4.getZValue();
    java.lang.Double var6 = new java.lang.Double(1.0d);
    java.lang.Double var7 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var8 = new org.jhotdraw.standard.RelativeLocator(var6, var7);
    int var9 = 100;
    org.jhotdraw.figures.PolyLineHandle var10 = new org.jhotdraw.figures.PolyLineHandle(var4, (org.jhotdraw.framework.Locator)var8, var9);
    org.jhotdraw.standard.HandleTracker var11 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Handle)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 0);

  }

  public void test3() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    javax.swing.Action var1 = var0.getAction();
    javax.accessibility.AccessibleContext var2 = var0.getAccessibleContext();
    java.lang.String var3 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var4 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var4.start();
    org.jhotdraw.standard.CopyCommand var6 = new org.jhotdraw.standard.CopyCommand(var3, (org.jhotdraw.framework.DrawingEditor)var4);
    var6.dispose();
    java.lang.String var8 = "";
    org.jhotdraw.util.CommandMenu var9 = new org.jhotdraw.util.CommandMenu(var8);
    var6.addCommandListener((org.jhotdraw.util.CommandListener)var9);
    javax.swing.InputMap var11 = var9.getInputMap();
    java.awt.event.ActionListener var12 = java.awt.AWTEventMulticaster.add((java.awt.event.ActionListener)var0, (java.awt.event.ActionListener)var9);
    boolean var13 = var9.isVisible();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == true);

  }

  public void test4() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var1 = var0.textDisplayBox();
    java.awt.Point var2 = org.jhotdraw.util.Geom.center(var1);

  }

  public void test5() throws Throwable {

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
    org.jhotdraw.samples.javadraw.JavaDrawApplet var13 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var13.start();
    java.awt.Color var15 = var13.getForeground();
    org.jhotdraw.standard.SelectAreaTracker var16 = new org.jhotdraw.standard.SelectAreaTracker((org.jhotdraw.framework.DrawingEditor)var0, var15);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);

  }

  public void test6() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    java.awt.event.MouseMotionListener[] var1 = var0.getMouseMotionListeners();
    java.awt.im.InputContext var2 = var0.getInputContext();

  }

  public void test7() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    javax.swing.JMenuBar var4 = var0.getJMenuBar();
    java.awt.Graphics var5 = var0.getGraphics();
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JMenu var8 = var6.createLookAndFeelMenu();
    java.lang.String var9 = var8.getName();
    java.awt.Dimension var10 = var8.getPreferredSize();
    var0.setMaximumSize(var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == null);

  }

  public void test8() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawViewer var0 = new org.jhotdraw.samples.javadraw.JavaDrawViewer();
    org.jhotdraw.framework.Tool var1 = var0.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test9() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    int var1 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var2 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    boolean var6 = var2.remove((java.lang.Object)var3);
    org.jhotdraw.contrib.StandardLayouter var7 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var3);
    var0.removeItem((java.lang.Object)var3);
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
    var0.removeItem((java.lang.Object)var9);
    java.lang.String var25 = var0.getToolTipText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);

  }

  public void test10() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    java.awt.Dimension var4 = var0.getMaximumSize();
    org.jhotdraw.util.Bounds var5 = new org.jhotdraw.util.Bounds(var4);

  }

  public void test11() throws Throwable {

    org.jhotdraw.standard.StandardDrawing var0 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var1 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var2 = var1.handles();
    org.jhotdraw.framework.Figure var3 = var0.remove((org.jhotdraw.framework.Figure)var1);
    java.awt.Rectangle var4 = var1.displayBox();

  }

  public void test12() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    java.awt.Rectangle var36 = var0.displayBox();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var38 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var37);
    org.jhotdraw.standard.StandardDrawing var39 = new org.jhotdraw.standard.StandardDrawing();
    int var40 = var37.getLayer((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    javax.swing.JLayeredPane var48 = var45.getLayeredPane();
    int var49 = (-1);
    int var50 = 0;
    org.jhotdraw.standard.StandardDrawingView var51 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var45, var49, var50);
    java.awt.Component var52 = var41.add((java.awt.Component)var51);
    boolean var53 = var51.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var54 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var55 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var56 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var54, (org.jhotdraw.framework.FigureChangeListener)var55);
    java.awt.Dimension var57 = var54.size();
    var51.removeFromSelection((org.jhotdraw.framework.Figure)var54);
    var54.layout();
    java.lang.Object var60 = var54.clone();
    org.jhotdraw.framework.FigureChangeEvent var61 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var54);
    java.lang.Object var62 = var61.getSource();
    var39.figureInvalidated(var61);
    int var64 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var65 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var64);
    java.util.Iterator var66 = var65.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var67 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var68 = var67.isDoubleBuffered();
    boolean var69 = var67.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    int var73 = var71.getZValue();
    java.lang.Object var74 = var71.clone();
    org.jhotdraw.standard.CreationTool var75 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var67, (org.jhotdraw.framework.Figure)var71);
    int var76 = 1;
    int var77 = 0;
    org.jhotdraw.standard.StandardDrawingView var78 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var67, var76, var77);
    boolean var79 = var65.contains((java.lang.Object)var77);
    var39.orphanAll((java.util.List)var65);
    int var81 = 1;
    int var82 = 100;
    boolean var83 = var39.containsPoint(var81, var82);
    var0.addDependendFigure((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.framework.FigureEnumeration var85 = var0.decompose();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test13() throws Throwable {

    org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12 var0 = new org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12();
    int var1 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var2 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    boolean var6 = var2.remove((java.lang.Object)var3);
    org.jhotdraw.util.collections.jdk11.ListWrapper var7 = new org.jhotdraw.util.collections.jdk11.ListWrapper((java.util.Collection)var2);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JMenu var10 = var8.createLookAndFeelMenu();
    var8.open();
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    javax.swing.JLayeredPane var15 = var12.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    java.awt.Component var23 = var12.add((java.awt.Component)var22);
    boolean var24 = var22.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var26 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var27 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var25, (org.jhotdraw.framework.FigureChangeListener)var26);
    java.awt.Dimension var28 = var25.size();
    var22.removeFromSelection((org.jhotdraw.framework.Figure)var25);
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    java.awt.Component var41 = var30.add((java.awt.Component)var40);
    var22.setEditor((org.jhotdraw.framework.DrawingEditor)var30);
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    javax.swing.JRootPane var45 = var43.getRootPane();
    javax.swing.JLayeredPane var46 = var43.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    java.lang.String var50 = var49.getUIClassID();
    java.awt.Insets var51 = var49.getInsets();
    int var52 = (-1);
    var46.setPosition((java.awt.Component)var49, var52);
    boolean var54 = var46.isDisplayable();
    boolean var55 = var22.isFocusCycleRoot((java.awt.Container)var46);
    var8.setLayeredPane(var46);
    boolean var57 = var7.remove((java.lang.Object)var46);
    java.util.List var58 = var0.createList((java.util.Collection)var7);
    java.util.Set var59 = var0.createSet();
    java.util.Set var60 = var0.createSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test14() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JMenu var3 = var1.createLookAndFeelMenu();
    org.jhotdraw.standard.SelectAllCommand var4 = new org.jhotdraw.standard.SelectAllCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test15() throws Throwable {

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
    var19.update();
    org.jhotdraw.contrib.TextAreaFigure var25 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var26 = "";
    var25.setText(var26);
    org.jhotdraw.contrib.html.TextHolderContentProducer var28 = new org.jhotdraw.contrib.html.TextHolderContentProducer((org.jhotdraw.standard.TextHolder)var25);
    org.jhotdraw.framework.Figure var29 = var19.remove((org.jhotdraw.framework.Figure)var25);
    java.lang.Boolean var30 = new java.lang.Boolean(true);
    var25.setReadOnly(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test16() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var42 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var40.removeForeground((org.jhotdraw.framework.Painter)var42);
    org.jhotdraw.util.UndoableHandle var44 = new org.jhotdraw.util.UndoableHandle(var33, (org.jhotdraw.framework.DrawingView)var40);
    org.jhotdraw.util.Undoable var45 = var44.getUndoActivity();
    java.awt.Point var46 = var44.locate();
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    org.jhotdraw.util.UndoableAdapter var55 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var53);
    org.jhotdraw.contrib.html.DisposableResourceHolder var56 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var55);
    boolean var57 = var55.undo();
    java.lang.Boolean var58 = new java.lang.Boolean(true);
    var55.setUndoable(var58);
    var44.setUndoActivity((org.jhotdraw.util.Undoable)var55);
    var16.setUndoActivity((org.jhotdraw.util.Undoable)var55);
    org.jhotdraw.framework.DrawingView var62 = var55.getDrawingView();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test17() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    javax.swing.JLayeredPane var17 = var14.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    int var22 = (-1);
    int var23 = 0;
    org.jhotdraw.standard.StandardDrawingView var24 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var18, var22, var23);
    java.awt.Component var25 = var14.add((java.awt.Component)var24);
    org.jhotdraw.framework.Tool var26 = var24.tool();
    java.lang.Boolean var27 = new java.lang.Boolean(false);
    var24.setVisible(var27);
    org.jhotdraw.contrib.dnd.JHDDragSourceListener var29 = new org.jhotdraw.contrib.dnd.JHDDragSourceListener((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.DrawingView)var24);
    org.jhotdraw.contrib.zoom.ZoomAreaTracker var30 = new org.jhotdraw.contrib.zoom.ZoomAreaTracker((org.jhotdraw.framework.DrawingEditor)var0);
    java.lang.String var31 = var0.getWarningString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);

  }

  public void test18() throws Throwable {

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
    java.lang.String var15 = var0.getTitle();
    int var16 = 1;
    int var17 = 100;
    org.jhotdraw.figures.NumberTextFigure var18 = new org.jhotdraw.figures.NumberTextFigure();
    java.lang.String var19 = var18.getText();
    int var20 = var18.overlayColumns();
    int var21 = var18.getValue();
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var26 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var27 = var26.isDoubleBuffered();
    javax.swing.JRootPane var28 = var26.getRootPane();
    javax.swing.JLayeredPane var29 = var26.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    int var34 = (-1);
    int var35 = 0;
    org.jhotdraw.standard.StandardDrawingView var36 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var30, var34, var35);
    java.awt.Component var37 = var26.add((java.awt.Component)var36);
    boolean var38 = var36.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var39 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var41 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var39, (org.jhotdraw.framework.FigureChangeListener)var40);
    java.awt.Dimension var42 = var39.size();
    var36.removeFromSelection((org.jhotdraw.framework.Figure)var39);
    var39.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var45 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var22, (org.jhotdraw.framework.Figure)var39);
    int var46 = (-1);
    int var47 = 0;
    org.jhotdraw.framework.Figure var48 = var39.findFigureInside(var46, var47);
    org.jhotdraw.contrib.MDI_DrawApplication var49 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var50 = var49.isDoubleBuffered();
    javax.swing.JRootPane var51 = var49.getRootPane();
    javax.swing.JLayeredPane var52 = var49.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    java.awt.Component var60 = var49.add((java.awt.Component)var59);
    boolean var61 = var59.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var62 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var63 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var64 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var62, (org.jhotdraw.framework.FigureChangeListener)var63);
    java.awt.Dimension var65 = var62.size();
    var59.removeFromSelection((org.jhotdraw.framework.Figure)var62);
    var62.layout();
    java.lang.Object var68 = var62.clone();
    int var69 = 1;
    int var70 = 1;
    org.jhotdraw.contrib.PolygonFigure var71 = new org.jhotdraw.contrib.PolygonFigure(var69, var70);
    org.jhotdraw.framework.FigureEnumeration var72 = var71.figures();
    java.awt.Rectangle var73 = var71.displayBox();
    org.jhotdraw.framework.Figure var74 = var39.replace((org.jhotdraw.framework.Figure)var62, (org.jhotdraw.framework.Figure)var71);
    var18.addDependendFigure((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.framework.Figure var76 = var0.findFigureWithout(var16, var17, (org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.contrib.MDI_DrawApplication var77 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var78 = var77.isDoubleBuffered();
    javax.swing.JRootPane var79 = var77.getRootPane();
    javax.swing.JLayeredPane var80 = var77.getLayeredPane();
    int var81 = (-1);
    int var82 = 0;
    org.jhotdraw.standard.StandardDrawingView var83 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var77, var81, var82);
    var83.clearSelection();
    var83.requestFocus();
    boolean var86 = var83.isDoubleBuffered();
    var0.removeDrawingChangeListener((org.jhotdraw.framework.DrawingChangeListener)var83);
    java.lang.Boolean var88 = new java.lang.Boolean(false);
    var83.enable(var88);
    java.awt.Point var90 = var83.lastClick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);

  }

  public void test19() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    int var1 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var2 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    boolean var6 = var2.remove((java.lang.Object)var3);
    org.jhotdraw.contrib.StandardLayouter var7 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var3);
    var0.removeItem((java.lang.Object)var3);
    java.lang.Boolean var9 = new java.lang.Boolean(true);
    var0.setEnabled(var9);
    org.jhotdraw.util.CommandChoice var11 = new org.jhotdraw.util.CommandChoice();
    int var12 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var13 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var12);
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    boolean var17 = var13.remove((java.lang.Object)var14);
    org.jhotdraw.contrib.StandardLayouter var18 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var14);
    var11.removeItem((java.lang.Object)var14);
    org.jhotdraw.standard.StandardDrawing var20 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    java.lang.Double var22 = new java.lang.Double(100.0d);
    java.lang.Double var23 = new java.lang.Double(1.0d);
    java.awt.Point var24 = org.jhotdraw.util.Geom.polarToPoint(var21, var22, var23);
    java.lang.Double var25 = new java.lang.Double((-1.0d));
    java.lang.Double var26 = new java.lang.Double(100.0d);
    java.lang.Double var27 = new java.lang.Double(1.0d);
    java.awt.Point var28 = org.jhotdraw.util.Geom.polarToPoint(var25, var26, var27);
    org.jhotdraw.contrib.DiamondFigure var29 = new org.jhotdraw.contrib.DiamondFigure(var24, var28);
    org.jhotdraw.framework.HandleEnumeration var30 = var29.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var31 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var33 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var31, (org.jhotdraw.framework.FigureChangeListener)var32);
    org.jhotdraw.framework.Figure var34 = var20.replace((org.jhotdraw.framework.Figure)var29, (org.jhotdraw.framework.Figure)var31);
    var11.removeItem((java.lang.Object)var20);
    java.awt.event.ItemListener var36 = java.awt.AWTEventMulticaster.remove((java.awt.event.ItemListener)var0, (java.awt.event.ItemListener)var11);
    int var37 = (-1);
    java.lang.Object var38 = var0.getItemAt(var37);
    int var39 = var0.getY();
    java.lang.Object[] var40 = var0.getSelectedObjects();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == 0);

  }

  public void test20() throws Throwable {

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
    var17.repairDamage();
    int var19 = (-1);
    int var20 = 100;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var17.deZoom(var19, var20);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test21() throws Throwable {

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
    java.awt.Container var36 = var0.getFocusCycleRootAncestor();
    
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
    assertTrue(var36 == null);

  }

  public void test22() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    boolean var2 = var0.isBackgroundSet();
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var3 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var4 = 1;
    int var5 = 0;
    boolean var6 = var3.containsPoint(var4, var5);
    org.jhotdraw.contrib.TextAreaTool var7 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    org.jhotdraw.framework.DrawingEditor var8 = var7.editor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test23() throws Throwable {

    org.jhotdraw.figures.LineConnection var0 = new org.jhotdraw.figures.LineConnection();
    java.lang.String var1 = "hi!";
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    org.jhotdraw.framework.Handle var7 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var4);
    var4.changed();
    int var9 = 100;
    int var10 = 1;
    org.jhotdraw.framework.Connector var11 = var4.connectorAt(var9, var10);
    var0.setAttribute(var1, (java.lang.Object)var10);
    int var13 = var0.pointCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);

  }

  public void test24() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    java.lang.String var6 = var0.getWarningString();
    java.lang.Boolean var7 = new java.lang.Boolean(false);
    var0.setFocusableWindowState(var7);
    var0.toFront();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test25() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    java.awt.Cursor var1 = var0.getCursor();

  }

  public void test26() throws Throwable {

    org.jhotdraw.figures.ArrowTip var0 = new org.jhotdraw.figures.ArrowTip();
    int var1 = 1;
    int var2 = 1;
    int var3 = 10;
    int var4 = 0;
    java.awt.Polygon var5 = var0.outline(var1, var2, var3, var4);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);
    org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter var7 = new org.jhotdraw.contrib.html.PolygonFigureGeometricAdapter(var5);
    java.lang.String var8 = "";
    java.lang.Object var9 = var7.getAttribute(var8);
    var7.changed();

  }

  public void test27() throws Throwable {

    org.jhotdraw.figures.LineFigure var0 = new org.jhotdraw.figures.LineFigure();
    int var1 = (-1);
    int var2 = 10;
    var0.startPoint(var1, var2);
    org.jhotdraw.figures.ArrowTip var4 = new org.jhotdraw.figures.ArrowTip();
    var0.setStartDecoration((org.jhotdraw.figures.LineDecoration)var4);

  }

  public void test28() throws Throwable {

    org.jhotdraw.util.StandardStorageFormat var0 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var1 = "hi!";
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    org.jhotdraw.figures.PolyLineFigure var3 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.framework.HandleEnumeration var4 = var3.handles();
    org.jhotdraw.framework.Figure var5 = var2.remove((org.jhotdraw.framework.Figure)var3);
    java.lang.String var6 = var0.store(var1, (org.jhotdraw.framework.Drawing)var2);
    java.util.Iterator var7 = var2.drawingChangeListeners();
    org.jhotdraw.standard.InsertIntoDrawingVisitor var8 = new org.jhotdraw.standard.InsertIntoDrawingVisitor((org.jhotdraw.framework.Drawing)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6.equals("hi!.draw"));

  }

  public void test29() throws Throwable {

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
    java.awt.event.WindowFocusListener[] var24 = var0.getWindowFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);

  }

  public void test30() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    org.jhotdraw.contrib.TextAreaFigure var4 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var5 = "";
    var4.setText(var5);
    org.jhotdraw.figures.TextFigure var7 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var8 = var7.textDisplayBox();
    org.jhotdraw.standard.StandardDrawing var9 = new org.jhotdraw.standard.StandardDrawing();
    int var10 = 1;
    int var11 = 1;
    org.jhotdraw.contrib.PolygonFigure var12 = new org.jhotdraw.contrib.PolygonFigure(var10, var11);
    org.jhotdraw.framework.FigureEnumeration var13 = var12.figures();
    java.awt.Rectangle var14 = var12.displayBox();
    int var15 = 1;
    int var16 = 1;
    org.jhotdraw.contrib.PolygonFigure var17 = new org.jhotdraw.contrib.PolygonFigure(var15, var16);
    org.jhotdraw.framework.FigureEnumeration var18 = var17.figures();
    java.awt.Rectangle var19 = var17.displayBox();
    org.jhotdraw.framework.Figure var20 = var9.findFigure(var14, (org.jhotdraw.framework.Figure)var17);
    int var21 = 100;
    int var22 = (-1);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    java.lang.Double var28 = new java.lang.Double(100.0d);
    java.lang.Double var29 = new java.lang.Double(1.0d);
    java.awt.Point var30 = org.jhotdraw.util.Geom.polarToPoint(var27, var28, var29);
    org.jhotdraw.contrib.DiamondFigure var31 = new org.jhotdraw.contrib.DiamondFigure(var26, var30);
    org.jhotdraw.framework.Figure var32 = var9.findFigureInsideWithout(var21, var22, (org.jhotdraw.framework.Figure)var31);
    java.util.Iterator var33 = var9.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    java.awt.Component var45 = var34.add((java.awt.Component)var44);
    boolean var46 = var44.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var48 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var49 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var47, (org.jhotdraw.framework.FigureChangeListener)var48);
    java.awt.Dimension var50 = var47.size();
    var44.removeFromSelection((org.jhotdraw.framework.Figure)var47);
    var47.layout();
    java.lang.Object var53 = var47.clone();
    org.jhotdraw.framework.FigureChangeEvent var54 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var47);
    var9.figureRequestUpdate(var54);
    java.awt.Rectangle var56 = var54.getInvalidatedRectangle();
    var7.figureRequestUpdate(var54);
    var4.figureRequestUpdate(var54);
    var2.removeDependendFigure((org.jhotdraw.framework.Figure)var4);
    boolean var60 = var4.acceptsTyping();
    org.jhotdraw.framework.Figure var61 = var4.getRepresentingFigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);

  }

  public void test31() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    org.jhotdraw.framework.DrawingView var3 = org.jhotdraw.standard.NullDrawingView.getManagedDrawingView((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.standard.StandardDrawing var4 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    java.lang.Double var9 = new java.lang.Double((-1.0d));
    java.lang.Double var10 = new java.lang.Double(100.0d);
    java.lang.Double var11 = new java.lang.Double(1.0d);
    java.awt.Point var12 = org.jhotdraw.util.Geom.polarToPoint(var9, var10, var11);
    org.jhotdraw.contrib.DiamondFigure var13 = new org.jhotdraw.contrib.DiamondFigure(var8, var12);
    org.jhotdraw.framework.HandleEnumeration var14 = var13.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var17 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var15, (org.jhotdraw.framework.FigureChangeListener)var16);
    org.jhotdraw.framework.Figure var18 = var4.replace((org.jhotdraw.framework.Figure)var13, (org.jhotdraw.framework.Figure)var15);
    org.jhotdraw.framework.Handle var19 = org.jhotdraw.standard.BoxHandleKit.north(var18);
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.standard.StandardDrawingView var26 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var20, var24, var25);
    var26.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var28 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var26.removeForeground((org.jhotdraw.framework.Painter)var28);
    org.jhotdraw.util.UndoableHandle var30 = new org.jhotdraw.util.UndoableHandle(var19, (org.jhotdraw.framework.DrawingView)var26);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    var44.clearSelection();
    java.awt.Color var46 = var44.getForeground();
    var37.setBackground(var46);
    org.jhotdraw.framework.FigureEnumeration var48 = var37.selectionZOrdered();
    var48.reset();
    var26.addToSelectionAll(var48);
    java.lang.Double var51 = new java.lang.Double((-1.0d));
    java.lang.Double var52 = new java.lang.Double(100.0d);
    java.lang.Double var53 = new java.lang.Double(1.0d);
    java.awt.Point var54 = org.jhotdraw.util.Geom.polarToPoint(var51, var52, var53);
    java.awt.Point var55 = var26.getLocation(var54);
    var26.disable();
    var0.setLocationRelativeTo((java.awt.Component)var26);
    java.lang.Float var58 = new java.lang.Float(10.0f);
    var26.setAlignmentY(var58);
    org.jhotdraw.framework.FigureEnumeration var60 = var26.selectionZOrdered();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test32() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    java.awt.peer.ComponentPeer var5 = var2.getPeer();
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JMenu var8 = var6.createLookAndFeelMenu();
    java.lang.Character var9 = new java.lang.Character('a');
    var8.setMnemonic(var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JMenu var13 = var11.createLookAndFeelMenu();
    java.lang.String var14 = var13.getName();
    boolean var15 = var8.isMenuComponent((java.awt.Component)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    java.lang.String var19 = var18.getUIClassID();
    java.awt.Insets var20 = var18.getInsets();
    var13.setMargin(var20);
    var2.remove((java.awt.Component)var13);
    java.lang.String var23 = var13.getUIClassID();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23.equals("MenuUI"));

  }

  public void test33() throws Throwable {

    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    int var1 = 1;
    int var2 = 0;
    boolean var3 = var0.containsPoint(var1, var2);
    int var4 = var0.getZValue();
    org.jhotdraw.framework.HandleEnumeration var5 = var0.handles();
    java.awt.Shape var6 = var0.getShape();
    java.awt.Insets var7 = var0.connectionInsets();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test34() throws Throwable {

    org.jhotdraw.figures.LineConnection var0 = new org.jhotdraw.figures.LineConnection();
    boolean var1 = var0.canConnect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test35() throws Throwable {

    org.jhotdraw.standard.FigureChangeAdapter var0 = new org.jhotdraw.standard.FigureChangeAdapter();
    org.jhotdraw.figures.TextFigure var1 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var2 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var1);
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    int var4 = 1;
    int var5 = 1;
    org.jhotdraw.contrib.PolygonFigure var6 = new org.jhotdraw.contrib.PolygonFigure(var4, var5);
    org.jhotdraw.framework.FigureEnumeration var7 = var6.figures();
    java.awt.Rectangle var8 = var6.displayBox();
    int var9 = 1;
    int var10 = 1;
    org.jhotdraw.contrib.PolygonFigure var11 = new org.jhotdraw.contrib.PolygonFigure(var9, var10);
    org.jhotdraw.framework.FigureEnumeration var12 = var11.figures();
    java.awt.Rectangle var13 = var11.displayBox();
    org.jhotdraw.framework.Figure var14 = var3.findFigure(var8, (org.jhotdraw.framework.Figure)var11);
    int var15 = 100;
    int var16 = (-1);
    java.lang.Double var17 = new java.lang.Double((-1.0d));
    java.lang.Double var18 = new java.lang.Double(100.0d);
    java.lang.Double var19 = new java.lang.Double(1.0d);
    java.awt.Point var20 = org.jhotdraw.util.Geom.polarToPoint(var17, var18, var19);
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    java.lang.Double var22 = new java.lang.Double(100.0d);
    java.lang.Double var23 = new java.lang.Double(1.0d);
    java.awt.Point var24 = org.jhotdraw.util.Geom.polarToPoint(var21, var22, var23);
    org.jhotdraw.contrib.DiamondFigure var25 = new org.jhotdraw.contrib.DiamondFigure(var20, var24);
    org.jhotdraw.framework.Figure var26 = var3.findFigureInsideWithout(var15, var16, (org.jhotdraw.framework.Figure)var25);
    java.util.Iterator var27 = var3.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    int var36 = (-1);
    int var37 = 0;
    org.jhotdraw.standard.StandardDrawingView var38 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var36, var37);
    java.awt.Component var39 = var28.add((java.awt.Component)var38);
    boolean var40 = var38.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var42 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var43 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var41, (org.jhotdraw.framework.FigureChangeListener)var42);
    java.awt.Dimension var44 = var41.size();
    var38.removeFromSelection((org.jhotdraw.framework.Figure)var41);
    var41.layout();
    java.lang.Object var47 = var41.clone();
    org.jhotdraw.framework.FigureChangeEvent var48 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var41);
    var3.figureRequestUpdate(var48);
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var51 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var52 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var50, (org.jhotdraw.framework.FigureChangeListener)var51);
    java.awt.Dimension var53 = var50.size();
    var3.sendToBack((org.jhotdraw.framework.Figure)var50);
    var1.disconnect((org.jhotdraw.framework.Figure)var50);
    org.jhotdraw.figures.GroupFigure var56 = new org.jhotdraw.figures.GroupFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var57 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var58 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var57);
    org.jhotdraw.standard.StandardDrawing var59 = new org.jhotdraw.standard.StandardDrawing();
    int var60 = var57.getLayer((org.jhotdraw.framework.Figure)var59);
    org.jhotdraw.contrib.MDI_DrawApplication var61 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var62 = var61.isDoubleBuffered();
    javax.swing.JRootPane var63 = var61.getRootPane();
    javax.swing.JLayeredPane var64 = var61.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var65 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var66 = var65.isDoubleBuffered();
    javax.swing.JRootPane var67 = var65.getRootPane();
    javax.swing.JLayeredPane var68 = var65.getLayeredPane();
    int var69 = (-1);
    int var70 = 0;
    org.jhotdraw.standard.StandardDrawingView var71 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var65, var69, var70);
    java.awt.Component var72 = var61.add((java.awt.Component)var71);
    boolean var73 = var71.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var74 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var75 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var76 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var74, (org.jhotdraw.framework.FigureChangeListener)var75);
    java.awt.Dimension var77 = var74.size();
    var71.removeFromSelection((org.jhotdraw.framework.Figure)var74);
    var74.layout();
    java.lang.Object var80 = var74.clone();
    org.jhotdraw.framework.FigureChangeEvent var81 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var74);
    java.lang.Object var82 = var81.getSource();
    var59.figureInvalidated(var81);
    var56.figureChanged(var81);
    var1.figureRequestUpdate(var81);
    var0.figureRequestUpdate(var81);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test36() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    int var36 = 1;
    int var37 = 0;
    var0.moveBy(var36, var37);
    java.awt.Rectangle var39 = var0.displayBox();
    org.jhotdraw.framework.Figure var40 = var0.getDecoratedFigure();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);

  }

  public void test37() throws Throwable {

    java.lang.String var0 = org.jhotdraw.util.VersionManagement.getJHotDrawVersion();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var0 == null);

  }

  public void test38() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    javax.swing.Action var1 = var0.getAction();
    java.lang.Boolean var2 = new java.lang.Boolean(false);
    var0.setEnabled(var2);
    org.jhotdraw.util.CommandChoice var4 = new org.jhotdraw.util.CommandChoice();
    javax.swing.Action var5 = var4.getAction();
    var4.updateUI();
    var0.removeItemListener((java.awt.event.ItemListener)var4);
    org.jhotdraw.util.CommandChoice var8 = new org.jhotdraw.util.CommandChoice();
    java.lang.String var9 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    javax.swing.JLayeredPane var13 = var10.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    javax.swing.JLayeredPane var17 = var14.getLayeredPane();
    int var18 = (-1);
    int var19 = 0;
    org.jhotdraw.standard.StandardDrawingView var20 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var14, var18, var19);
    java.awt.Component var21 = var10.add((java.awt.Component)var20);
    boolean var22 = var20.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var23 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var25 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var23, (org.jhotdraw.framework.FigureChangeListener)var24);
    java.awt.Dimension var26 = var23.size();
    var20.removeFromSelection((org.jhotdraw.framework.Figure)var23);
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    int var36 = (-1);
    int var37 = 0;
    org.jhotdraw.standard.StandardDrawingView var38 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var36, var37);
    java.awt.Component var39 = var28.add((java.awt.Component)var38);
    var20.setEditor((org.jhotdraw.framework.DrawingEditor)var28);
    javax.swing.InputVerifier var41 = var20.getInputVerifier();
    org.jhotdraw.contrib.MDI_DrawApplication var42 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var43 = var42.isDoubleBuffered();
    javax.swing.JRootPane var44 = var42.getRootPane();
    javax.swing.JLayeredPane var45 = var42.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var46 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var47 = var46.isDoubleBuffered();
    javax.swing.JRootPane var48 = var46.getRootPane();
    java.lang.String var49 = var48.getUIClassID();
    java.awt.Insets var50 = var48.getInsets();
    int var51 = (-1);
    var45.setPosition((java.awt.Component)var48, var51);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    int var55 = 0;
    var45.setLayer((java.awt.Component)var53, var55);
    java.awt.event.HierarchyListener[] var57 = var53.getHierarchyListeners();
    var20.setEditor((org.jhotdraw.framework.DrawingEditor)var53);
    org.jhotdraw.standard.SendToBackCommand var59 = new org.jhotdraw.standard.SendToBackCommand(var9, (org.jhotdraw.framework.DrawingEditor)var53);
    var8.addItem((org.jhotdraw.util.Command)var59);
    var4.addItem((org.jhotdraw.util.Command)var59);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);

  }

  public void test39() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var3 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var1);
    boolean var4 = var1.isCursorSet();
    org.jhotdraw.standard.SendToBackCommand var5 = new org.jhotdraw.standard.SendToBackCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    java.lang.String var6 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var7 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var7.start();
    org.jhotdraw.standard.CopyCommand var9 = new org.jhotdraw.standard.CopyCommand(var6, (org.jhotdraw.framework.DrawingEditor)var7);
    var9.dispose();
    java.lang.String var11 = "";
    org.jhotdraw.util.CommandMenu var12 = new org.jhotdraw.util.CommandMenu(var11);
    var9.addCommandListener((org.jhotdraw.util.CommandListener)var12);
    javax.swing.InputMap var14 = var12.getInputMap();
    var5.addCommandListener((org.jhotdraw.util.CommandListener)var12);
    java.lang.String var16 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var17 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var18 = var17.isDoubleBuffered();
    javax.swing.JRootPane var19 = var17.getRootPane();
    org.jhotdraw.framework.DrawingView var20 = org.jhotdraw.standard.NullDrawingView.getManagedDrawingView((org.jhotdraw.framework.DrawingEditor)var17);
    org.jhotdraw.standard.StandardDrawing var21 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var22 = new java.lang.Double((-1.0d));
    java.lang.Double var23 = new java.lang.Double(100.0d);
    java.lang.Double var24 = new java.lang.Double(1.0d);
    java.awt.Point var25 = org.jhotdraw.util.Geom.polarToPoint(var22, var23, var24);
    java.lang.Double var26 = new java.lang.Double((-1.0d));
    java.lang.Double var27 = new java.lang.Double(100.0d);
    java.lang.Double var28 = new java.lang.Double(1.0d);
    java.awt.Point var29 = org.jhotdraw.util.Geom.polarToPoint(var26, var27, var28);
    org.jhotdraw.contrib.DiamondFigure var30 = new org.jhotdraw.contrib.DiamondFigure(var25, var29);
    org.jhotdraw.framework.HandleEnumeration var31 = var30.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var34 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var32, (org.jhotdraw.framework.FigureChangeListener)var33);
    org.jhotdraw.framework.Figure var35 = var21.replace((org.jhotdraw.framework.Figure)var30, (org.jhotdraw.framework.Figure)var32);
    org.jhotdraw.framework.Handle var36 = org.jhotdraw.standard.BoxHandleKit.north(var35);
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    var43.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var45 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var43.removeForeground((org.jhotdraw.framework.Painter)var45);
    org.jhotdraw.util.UndoableHandle var47 = new org.jhotdraw.util.UndoableHandle(var36, (org.jhotdraw.framework.DrawingView)var43);
    org.jhotdraw.contrib.MDI_DrawApplication var48 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var49 = var48.isDoubleBuffered();
    javax.swing.JRootPane var50 = var48.getRootPane();
    javax.swing.JLayeredPane var51 = var48.getLayeredPane();
    int var52 = (-1);
    int var53 = 0;
    org.jhotdraw.standard.StandardDrawingView var54 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var48, var52, var53);
    org.jhotdraw.contrib.MDI_DrawApplication var55 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var56 = var55.isDoubleBuffered();
    javax.swing.JRootPane var57 = var55.getRootPane();
    javax.swing.JLayeredPane var58 = var55.getLayeredPane();
    int var59 = (-1);
    int var60 = 0;
    org.jhotdraw.standard.StandardDrawingView var61 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var55, var59, var60);
    var61.clearSelection();
    java.awt.Color var63 = var61.getForeground();
    var54.setBackground(var63);
    org.jhotdraw.framework.FigureEnumeration var65 = var54.selectionZOrdered();
    var65.reset();
    var43.addToSelectionAll(var65);
    java.lang.Double var68 = new java.lang.Double((-1.0d));
    java.lang.Double var69 = new java.lang.Double(100.0d);
    java.lang.Double var70 = new java.lang.Double(1.0d);
    java.awt.Point var71 = org.jhotdraw.util.Geom.polarToPoint(var68, var69, var70);
    java.awt.Point var72 = var43.getLocation(var71);
    var43.disable();
    var17.setLocationRelativeTo((java.awt.Component)var43);
    org.jhotdraw.util.StorageFormatManager var75 = var17.getStorageFormatManager();
    org.jhotdraw.standard.BringToFrontCommand var76 = new org.jhotdraw.standard.BringToFrontCommand(var16, (org.jhotdraw.framework.DrawingEditor)var17);
    var12.add((org.jhotdraw.util.Command)var76);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var76.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == null);

  }

  public void test40() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    int var1 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var2 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    boolean var6 = var2.remove((java.lang.Object)var3);
    org.jhotdraw.contrib.StandardLayouter var7 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var3);
    var0.removeItem((java.lang.Object)var3);
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
    var0.removeItem((java.lang.Object)var9);
    org.jhotdraw.util.CommandChoice var25 = new org.jhotdraw.util.CommandChoice();
    int var26 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var27 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var26);
    org.jhotdraw.contrib.GraphicalCompositeFigure var28 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var29 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var30 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var28, (org.jhotdraw.framework.FigureChangeListener)var29);
    boolean var31 = var27.remove((java.lang.Object)var28);
    org.jhotdraw.contrib.StandardLayouter var32 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var28);
    var25.removeItem((java.lang.Object)var28);
    var0.removeItemListener((java.awt.event.ItemListener)var25);
    org.jhotdraw.util.CommandChoice var35 = new org.jhotdraw.util.CommandChoice();
    int var36 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var37 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var36);
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var39 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var40 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var38, (org.jhotdraw.framework.FigureChangeListener)var39);
    boolean var41 = var37.remove((java.lang.Object)var38);
    org.jhotdraw.contrib.StandardLayouter var42 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var38);
    var35.removeItem((java.lang.Object)var38);
    java.lang.Boolean var44 = new java.lang.Boolean(true);
    var35.setEnabled(var44);
    org.jhotdraw.util.CommandChoice var46 = new org.jhotdraw.util.CommandChoice();
    int var47 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var48 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var47);
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var51 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var49, (org.jhotdraw.framework.FigureChangeListener)var50);
    boolean var52 = var48.remove((java.lang.Object)var49);
    org.jhotdraw.contrib.StandardLayouter var53 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var49);
    var46.removeItem((java.lang.Object)var49);
    org.jhotdraw.standard.StandardDrawing var55 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var56 = new java.lang.Double((-1.0d));
    java.lang.Double var57 = new java.lang.Double(100.0d);
    java.lang.Double var58 = new java.lang.Double(1.0d);
    java.awt.Point var59 = org.jhotdraw.util.Geom.polarToPoint(var56, var57, var58);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    org.jhotdraw.contrib.DiamondFigure var64 = new org.jhotdraw.contrib.DiamondFigure(var59, var63);
    org.jhotdraw.framework.HandleEnumeration var65 = var64.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var66 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var67 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var68 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var66, (org.jhotdraw.framework.FigureChangeListener)var67);
    org.jhotdraw.framework.Figure var69 = var55.replace((org.jhotdraw.framework.Figure)var64, (org.jhotdraw.framework.Figure)var66);
    var46.removeItem((java.lang.Object)var55);
    java.awt.event.ItemListener var71 = java.awt.AWTEventMulticaster.remove((java.awt.event.ItemListener)var35, (java.awt.event.ItemListener)var46);
    int var72 = (-1);
    java.lang.Object var73 = var35.getItemAt(var72);
    int var74 = var35.getY();
    java.awt.event.ItemListener var75 = java.awt.AWTEventMulticaster.add((java.awt.event.ItemListener)var0, (java.awt.event.ItemListener)var35);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == 0);

  }

  public void test41() throws Throwable {

    int var0 = 100;
    org.jhotdraw.framework.Locator var1 = org.jhotdraw.figures.PolyLineFigure.locator(var0);
    org.jhotdraw.standard.OffsetLocator var2 = new org.jhotdraw.standard.OffsetLocator(var1);
    int var3 = 100;
    int var4 = (-1);
    var2.moveBy(var3, var4);

  }

  public void test42() throws Throwable {

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
    org.jhotdraw.contrib.Desktop var10 = var0.getDesktop();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);

  }

  public void test43() throws Throwable {

    org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12 var0 = new org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12();
    int var1 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var2 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    boolean var6 = var2.remove((java.lang.Object)var3);
    org.jhotdraw.util.collections.jdk11.ListWrapper var7 = new org.jhotdraw.util.collections.jdk11.ListWrapper((java.util.Collection)var2);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JMenu var10 = var8.createLookAndFeelMenu();
    var8.open();
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    javax.swing.JLayeredPane var15 = var12.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    java.awt.Component var23 = var12.add((java.awt.Component)var22);
    boolean var24 = var22.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var26 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var27 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var25, (org.jhotdraw.framework.FigureChangeListener)var26);
    java.awt.Dimension var28 = var25.size();
    var22.removeFromSelection((org.jhotdraw.framework.Figure)var25);
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    java.awt.Component var41 = var30.add((java.awt.Component)var40);
    var22.setEditor((org.jhotdraw.framework.DrawingEditor)var30);
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    javax.swing.JRootPane var45 = var43.getRootPane();
    javax.swing.JLayeredPane var46 = var43.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    java.lang.String var50 = var49.getUIClassID();
    java.awt.Insets var51 = var49.getInsets();
    int var52 = (-1);
    var46.setPosition((java.awt.Component)var49, var52);
    boolean var54 = var46.isDisplayable();
    boolean var55 = var22.isFocusCycleRoot((java.awt.Container)var46);
    var8.setLayeredPane(var46);
    boolean var57 = var7.remove((java.lang.Object)var46);
    java.util.List var58 = var0.createList((java.util.Collection)var7);
    org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12 var59 = new org.jhotdraw.util.collections.jdk12.CollectionsFactoryJDK12();
    java.util.Map var60 = var59.createMap();
    java.util.Map var61 = var0.createMap(var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test44() throws Throwable {

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
    java.lang.Double var55 = new java.lang.Double(0.0d);
    java.lang.Double var56 = new java.lang.Double(100.0d);
    java.lang.Double var57 = new java.lang.Double(100.0d);
    java.lang.Double var58 = new java.lang.Double(0.0d);
    boolean var59 = var54.completelyContainsLine(var55, var56, var57, var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test45() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    int var1 = 100;
    java.awt.Component var2 = var0.getComponentAtIndex(var1);
    var0.updateUI();
    javax.swing.plaf.ToolBarUI var4 = var0.getUI();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    int var9 = (-1);
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var5, var9, var10);
    var11.clearSelection();
    org.jhotdraw.util.UndoableAdapter var13 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var11);
    java.awt.Dimension var14 = var11.getPreferredSize();
    var0.addSeparator(var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);

  }

  public void test46() throws Throwable {

    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var0 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();
    var0.resetDelay();
    org.jhotdraw.figures.TextFigure var2 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var3 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var2);
    var0.setResource((java.lang.Object)var2);
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
    int var17 = 100;
    int var18 = (-1);
    java.lang.Double var19 = new java.lang.Double((-1.0d));
    java.lang.Double var20 = new java.lang.Double(100.0d);
    java.lang.Double var21 = new java.lang.Double(1.0d);
    java.awt.Point var22 = org.jhotdraw.util.Geom.polarToPoint(var19, var20, var21);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    org.jhotdraw.contrib.DiamondFigure var27 = new org.jhotdraw.contrib.DiamondFigure(var22, var26);
    org.jhotdraw.framework.Figure var28 = var5.findFigureInsideWithout(var17, var18, (org.jhotdraw.framework.Figure)var27);
    java.util.Iterator var29 = var5.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    java.awt.Component var41 = var30.add((java.awt.Component)var40);
    boolean var42 = var40.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var43 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var44 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var45 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var43, (org.jhotdraw.framework.FigureChangeListener)var44);
    java.awt.Dimension var46 = var43.size();
    var40.removeFromSelection((org.jhotdraw.framework.Figure)var43);
    var43.layout();
    java.lang.Object var49 = var43.clone();
    org.jhotdraw.framework.FigureChangeEvent var50 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var43);
    var5.figureRequestUpdate(var50);
    java.awt.Rectangle var52 = var50.getInvalidatedRectangle();
    var2.figureRemoved(var50);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test47() throws Throwable {

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
    var0.willChange();
    org.jhotdraw.standard.SingleFigureEnumerator var52 = new org.jhotdraw.standard.SingleFigureEnumerator((org.jhotdraw.framework.Figure)var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);

  }

  public void test48() throws Throwable {

    org.jhotdraw.contrib.html.ResourceManagerNotSetException var0 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    org.jhotdraw.contrib.html.ResourceManagerNotSetException var1 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    org.jhotdraw.contrib.html.ResourceManagerNotSetException var2 = new org.jhotdraw.contrib.html.ResourceManagerNotSetException();
    java.lang.Throwable var3 = var1.initCause((java.lang.Throwable)var2);
    java.lang.StackTraceElement[] var4 = var1.getStackTrace();
    var0.setStackTrace(var4);
    java.lang.String var6 = var0.getMessage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test49() throws Throwable {

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
    javax.swing.MenuElement[] var18 = var2.getSubElements();
    javax.swing.JPopupMenu var19 = var2.getPopupMenu();
    
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

  public void test50() throws Throwable {

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
    org.jhotdraw.figures.ScribbleTool var18 = new org.jhotdraw.figures.ScribbleTool((org.jhotdraw.framework.DrawingEditor)var0);
    var18.deactivate();
    org.jhotdraw.framework.DrawingEditor var20 = var18.editor();
    var18.activate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test51() throws Throwable {

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
    var10.show();
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    boolean var40 = var38.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var42 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var43 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var41, (org.jhotdraw.framework.FigureChangeListener)var42);
    int var44 = var42.getZValue();
    java.lang.Object var45 = var42.clone();
    org.jhotdraw.standard.CreationTool var46 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var38, (org.jhotdraw.framework.Figure)var42);
    java.lang.String var47 = "hi!";
    java.lang.String var48 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var49 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var50 = var49.isDoubleBuffered();
    javax.swing.JRootPane var51 = var49.getRootPane();
    javax.swing.JLayeredPane var52 = var49.getLayeredPane();
    java.awt.Graphics var53 = var49.getGraphics();
    java.lang.Boolean var54 = new java.lang.Boolean(true);
    var49.setLocationByPlatform(var54);
    org.jhotdraw.standard.StandardDrawing var56 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var57 = new java.lang.Double((-1.0d));
    java.lang.Double var58 = new java.lang.Double(100.0d);
    java.lang.Double var59 = new java.lang.Double(1.0d);
    java.awt.Point var60 = org.jhotdraw.util.Geom.polarToPoint(var57, var58, var59);
    java.lang.Double var61 = new java.lang.Double((-1.0d));
    java.lang.Double var62 = new java.lang.Double(100.0d);
    java.lang.Double var63 = new java.lang.Double(1.0d);
    java.awt.Point var64 = org.jhotdraw.util.Geom.polarToPoint(var61, var62, var63);
    org.jhotdraw.contrib.DiamondFigure var65 = new org.jhotdraw.contrib.DiamondFigure(var60, var64);
    org.jhotdraw.framework.HandleEnumeration var66 = var65.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var67 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var68 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var69 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var67, (org.jhotdraw.framework.FigureChangeListener)var68);
    org.jhotdraw.framework.Figure var70 = var56.replace((org.jhotdraw.framework.Figure)var65, (org.jhotdraw.framework.Figure)var67);
    org.jhotdraw.framework.Handle var71 = org.jhotdraw.standard.BoxHandleKit.north(var70);
    org.jhotdraw.standard.HandleTracker var72 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var49, var71);
    org.jhotdraw.standard.ToolButton var73 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var38, var47, var48, (org.jhotdraw.framework.Tool)var72);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var74 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var74.start();
    org.jhotdraw.framework.Tool var76 = var74.tool();
    java.awt.FocusTraversalPolicy var77 = var74.getFocusTraversalPolicy();
    var73.setFocusTraversalPolicy(var77);
    var10.setFocusTraversalPolicy(var77);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);

  }

  public void test52() throws Throwable {

    org.jhotdraw.contrib.TextAreaFigure var0 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var1 = "";
    var0.setText(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var4 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var3);
    org.jhotdraw.standard.StandardDrawing var5 = new org.jhotdraw.standard.StandardDrawing();
    int var6 = var3.getLayer((org.jhotdraw.framework.Figure)var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    int var15 = (-1);
    int var16 = 0;
    org.jhotdraw.standard.StandardDrawingView var17 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var11, var15, var16);
    java.awt.Component var18 = var7.add((java.awt.Component)var17);
    boolean var19 = var17.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var20 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var21 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var22 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var20, (org.jhotdraw.framework.FigureChangeListener)var21);
    java.awt.Dimension var23 = var20.size();
    var17.removeFromSelection((org.jhotdraw.framework.Figure)var20);
    var20.layout();
    java.lang.Object var26 = var20.clone();
    org.jhotdraw.framework.FigureChangeEvent var27 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var20);
    java.lang.Object var28 = var27.getSource();
    var5.figureInvalidated(var27);
    var0.figureChanged(var27);
    boolean var31 = var0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == true);

  }

  public void test53() throws Throwable {

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
    java.awt.Rectangle var30 = var26.displayBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test54() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var33 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var32);
    org.jhotdraw.standard.StandardDrawing var34 = new org.jhotdraw.standard.StandardDrawing();
    int var35 = var32.getLayer((org.jhotdraw.framework.Figure)var34);
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JRootPane var38 = var36.getRootPane();
    javax.swing.JLayeredPane var39 = var36.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    java.awt.Component var47 = var36.add((java.awt.Component)var46);
    boolean var48 = var46.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var51 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var49, (org.jhotdraw.framework.FigureChangeListener)var50);
    java.awt.Dimension var52 = var49.size();
    var46.removeFromSelection((org.jhotdraw.framework.Figure)var49);
    var49.layout();
    java.lang.Object var55 = var49.clone();
    org.jhotdraw.framework.FigureChangeEvent var56 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var49);
    java.lang.Object var57 = var56.getSource();
    var34.figureInvalidated(var56);
    var34.release();
    var0.removeFigureChangeListener((org.jhotdraw.framework.FigureChangeListener)var34);
    java.lang.Double var61 = new java.lang.Double(1.0d);
    java.lang.Double var62 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var63 = new org.jhotdraw.standard.RelativeLocator(var61, var62);
    org.jhotdraw.figures.LineConnection var64 = new org.jhotdraw.figures.LineConnection();
    org.jhotdraw.standard.StandardDrawing var65 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var66 = new java.lang.Double((-1.0d));
    java.lang.Double var67 = new java.lang.Double(100.0d);
    java.lang.Double var68 = new java.lang.Double(1.0d);
    java.awt.Point var69 = org.jhotdraw.util.Geom.polarToPoint(var66, var67, var68);
    java.lang.Double var70 = new java.lang.Double((-1.0d));
    java.lang.Double var71 = new java.lang.Double(100.0d);
    java.lang.Double var72 = new java.lang.Double(1.0d);
    java.awt.Point var73 = org.jhotdraw.util.Geom.polarToPoint(var70, var71, var72);
    org.jhotdraw.contrib.DiamondFigure var74 = new org.jhotdraw.contrib.DiamondFigure(var69, var73);
    org.jhotdraw.framework.HandleEnumeration var75 = var74.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var76 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var77 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var78 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var76, (org.jhotdraw.framework.FigureChangeListener)var77);
    org.jhotdraw.framework.Figure var79 = var65.replace((org.jhotdraw.framework.Figure)var74, (org.jhotdraw.framework.Figure)var76);
    java.util.Iterator var80 = var65.drawingChangeListeners();
    org.jhotdraw.contrib.GraphicalCompositeFigure var81 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var82 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var83 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var81, (org.jhotdraw.framework.FigureChangeListener)var82);
    java.awt.Dimension var84 = var81.size();
    var65.addToContainer((org.jhotdraw.framework.FigureChangeListener)var81);
    org.jhotdraw.figures.NullConnector var86 = new org.jhotdraw.figures.NullConnector((org.jhotdraw.framework.Figure)var81);
    var64.connectEnd((org.jhotdraw.framework.Connector)var86);
    org.jhotdraw.standard.ConnectionHandle var88 = new org.jhotdraw.standard.ConnectionHandle((org.jhotdraw.framework.Figure)var34, (org.jhotdraw.framework.Locator)var63, (org.jhotdraw.framework.ConnectionFigure)var64);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test55() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    int var1 = 100;
    java.awt.Component var2 = var0.getComponentAtIndex(var1);
    var0.updateUI();
    var0.switchToEditTools();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test56() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    boolean var1 = var0.isBorderPainted();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == true);

  }

  public void test57() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    org.jhotdraw.samples.javadraw.JavaDrawApplet var3 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var3.start();
    var0.remove((java.awt.Component)var3);
    org.jhotdraw.framework.DrawingView var6 = var0.view();
    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var7 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();
    var7.resetDelay();
    org.jhotdraw.figures.TextFigure var9 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var10 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var9);
    var7.setResource((java.lang.Object)var9);
    org.jhotdraw.standard.SingleFigureEnumerator var12 = new org.jhotdraw.standard.SingleFigureEnumerator((org.jhotdraw.framework.Figure)var9);
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
    java.lang.Double var65 = new java.lang.Double((-1.0d));
    java.lang.Double var66 = new java.lang.Double(100.0d);
    java.lang.Double var67 = new java.lang.Double(1.0d);
    java.awt.Point var68 = org.jhotdraw.util.Geom.polarToPoint(var65, var66, var67);
    var9.basicDisplayBox(var64, var68);
    org.jhotdraw.contrib.html.TextHolderContentProducer var70 = new org.jhotdraw.contrib.html.TextHolderContentProducer((org.jhotdraw.standard.TextHolder)var9);
    org.jhotdraw.standard.CreationTool var71 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var9);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test58() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.framework.Tool var3 = var1.tool();
    javax.swing.TransferHandler var4 = var1.getTransferHandler();
    java.awt.Graphics var5 = var1.getGraphics();
    var1.disable();
    org.jhotdraw.standard.DuplicateCommand var7 = new org.jhotdraw.standard.DuplicateCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test59() throws Throwable {

    int var0 = (-1);
    int var1 = (-1);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var2 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var2.start();
    java.awt.Color var4 = var2.getForeground();
    org.jhotdraw.util.Filler var5 = new org.jhotdraw.util.Filler(var0, var1, var4);

  }

  public void test60() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    java.awt.Rectangle var36 = var0.displayBox();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var38 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var37);
    org.jhotdraw.standard.StandardDrawing var39 = new org.jhotdraw.standard.StandardDrawing();
    int var40 = var37.getLayer((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    javax.swing.JLayeredPane var48 = var45.getLayeredPane();
    int var49 = (-1);
    int var50 = 0;
    org.jhotdraw.standard.StandardDrawingView var51 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var45, var49, var50);
    java.awt.Component var52 = var41.add((java.awt.Component)var51);
    boolean var53 = var51.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var54 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var55 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var56 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var54, (org.jhotdraw.framework.FigureChangeListener)var55);
    java.awt.Dimension var57 = var54.size();
    var51.removeFromSelection((org.jhotdraw.framework.Figure)var54);
    var54.layout();
    java.lang.Object var60 = var54.clone();
    org.jhotdraw.framework.FigureChangeEvent var61 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var54);
    java.lang.Object var62 = var61.getSource();
    var39.figureInvalidated(var61);
    int var64 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var65 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var64);
    java.util.Iterator var66 = var65.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var67 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var68 = var67.isDoubleBuffered();
    boolean var69 = var67.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    int var73 = var71.getZValue();
    java.lang.Object var74 = var71.clone();
    org.jhotdraw.standard.CreationTool var75 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var67, (org.jhotdraw.framework.Figure)var71);
    int var76 = 1;
    int var77 = 0;
    org.jhotdraw.standard.StandardDrawingView var78 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var67, var76, var77);
    boolean var79 = var65.contains((java.lang.Object)var77);
    var39.orphanAll((java.util.List)var65);
    int var81 = 1;
    int var82 = 100;
    boolean var83 = var39.containsPoint(var81, var82);
    var0.addDependendFigure((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.framework.FigureEnumeration var85 = var0.decompose();
    int var86 = 100;
    int var87 = (-1);
    int var88 = 10;
    int var89 = 0;
    int var90 = 100;
    int var91 = (-1);
    int var92 = 1;
    int var93 = 1;
    java.awt.Point var94 = org.jhotdraw.util.Geom.intersect(var86, var87, var88, var89, var90, var91, var92, var93);
    org.jhotdraw.contrib.dnd.DNDFigures var95 = new org.jhotdraw.contrib.dnd.DNDFigures(var85, var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test61() throws Throwable {

    org.jhotdraw.figures.NumberTextFigure var0 = new org.jhotdraw.figures.NumberTextFigure();
    java.lang.String var1 = var0.getText();
    int var2 = var0.overlayColumns();
    int var3 = var0.getValue();
    java.awt.Rectangle var4 = var0.displayBox();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == 0);

  }

  public void test62() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var9 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var0);
    var9.tileFramesVertically();
    javax.swing.JInternalFrame[] var11 = var9.getAllFrames();
    javax.accessibility.AccessibleContext var12 = var9.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test63() throws Throwable {

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
    org.jhotdraw.contrib.ChopPolygonConnector var27 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var2);
    int var28 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var29 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var28);
    org.jhotdraw.contrib.GraphicalCompositeFigure var30 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var31 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var32 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var30, (org.jhotdraw.framework.FigureChangeListener)var31);
    boolean var33 = var29.remove((java.lang.Object)var30);
    var2.orphanAll((java.util.List)var29);
    int var35 = 0;
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JMenu var38 = var36.createLookAndFeelMenu();
    java.lang.String var39 = var38.getName();
    java.lang.String var40 = "";
    int var41 = 100;
    var38.insert(var40, var41);
    boolean var43 = var38.isFocusPainted();
    java.lang.String var44 = "";
    var38.setLabel(var44);
    javax.swing.ButtonModel var46 = var38.getModel();
    var29.add(var35, (java.lang.Object)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

  }

  public void test64() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Figure var1 = var0.getObservedFigure();
    org.jhotdraw.framework.Figure var2 = var0.getRepresentingFigure();
    org.jhotdraw.framework.HandleEnumeration var3 = var0.handles();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test65() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    int var15 = (-1);
    int var16 = 0;
    org.jhotdraw.standard.StandardDrawingView var17 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var11, var15, var16);
    var17.clearSelection();
    org.jhotdraw.util.UndoableAdapter var19 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var17);
    java.awt.Dimension var20 = var17.getPreferredSize();
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    javax.swing.JRootPane var23 = var21.getRootPane();
    javax.swing.JLayeredPane var24 = var21.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JRootPane var27 = var25.getRootPane();
    javax.swing.JLayeredPane var28 = var25.getLayeredPane();
    int var29 = (-1);
    int var30 = 0;
    org.jhotdraw.standard.StandardDrawingView var31 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var25, var29, var30);
    java.awt.Component var32 = var21.add((java.awt.Component)var31);
    boolean var33 = var31.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var34 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var35 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var36 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var34, (org.jhotdraw.framework.FigureChangeListener)var35);
    java.awt.Dimension var37 = var34.size();
    var31.removeFromSelection((org.jhotdraw.framework.Figure)var34);
    org.jhotdraw.contrib.MDI_DrawApplication var39 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var40 = var39.isDoubleBuffered();
    javax.swing.JRootPane var41 = var39.getRootPane();
    javax.swing.JLayeredPane var42 = var39.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    javax.swing.JRootPane var45 = var43.getRootPane();
    javax.swing.JLayeredPane var46 = var43.getLayeredPane();
    int var47 = (-1);
    int var48 = 0;
    org.jhotdraw.standard.StandardDrawingView var49 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var43, var47, var48);
    java.awt.Component var50 = var39.add((java.awt.Component)var49);
    var31.setEditor((org.jhotdraw.framework.DrawingEditor)var39);
    org.jhotdraw.contrib.MDI_DrawApplication var52 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var53 = var52.isDoubleBuffered();
    javax.swing.JRootPane var54 = var52.getRootPane();
    javax.swing.JLayeredPane var55 = var52.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var56 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var57 = var56.isDoubleBuffered();
    javax.swing.JRootPane var58 = var56.getRootPane();
    java.lang.String var59 = var58.getUIClassID();
    java.awt.Insets var60 = var58.getInsets();
    int var61 = (-1);
    var55.setPosition((java.awt.Component)var58, var61);
    boolean var63 = var55.isDisplayable();
    boolean var64 = var31.isFocusCycleRoot((java.awt.Container)var55);
    java.awt.Point var65 = var31.lastClick();
    org.jhotdraw.contrib.MDI_DrawApplication var66 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var67 = var66.isDoubleBuffered();
    javax.swing.JRootPane var68 = var66.getRootPane();
    javax.swing.JLayeredPane var69 = var66.getLayeredPane();
    int var70 = (-1);
    int var71 = 0;
    org.jhotdraw.standard.StandardDrawingView var72 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var66, var70, var71);
    var72.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var74 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var72.removeForeground((org.jhotdraw.framework.Painter)var74);
    var31.removeBackground((org.jhotdraw.framework.Painter)var74);
    var17.setDisplayUpdate((org.jhotdraw.framework.Painter)var74);
    var6.removeBackground((org.jhotdraw.framework.Painter)var74);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67 == false);

  }

  public void test66() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    var0.toolDone();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test67() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    java.awt.Rectangle var36 = var0.displayBox();
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    boolean var39 = var37.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var40 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var42 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var40, (org.jhotdraw.framework.FigureChangeListener)var41);
    int var43 = var41.getZValue();
    java.lang.Object var44 = var41.clone();
    org.jhotdraw.standard.CreationTool var45 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var37, (org.jhotdraw.framework.Figure)var41);
    java.lang.String var46 = "hi!";
    java.lang.String var47 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var48 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var49 = var48.isDoubleBuffered();
    javax.swing.JRootPane var50 = var48.getRootPane();
    javax.swing.JLayeredPane var51 = var48.getLayeredPane();
    java.awt.Graphics var52 = var48.getGraphics();
    java.lang.Boolean var53 = new java.lang.Boolean(true);
    var48.setLocationByPlatform(var53);
    org.jhotdraw.standard.StandardDrawing var55 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var56 = new java.lang.Double((-1.0d));
    java.lang.Double var57 = new java.lang.Double(100.0d);
    java.lang.Double var58 = new java.lang.Double(1.0d);
    java.awt.Point var59 = org.jhotdraw.util.Geom.polarToPoint(var56, var57, var58);
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    org.jhotdraw.contrib.DiamondFigure var64 = new org.jhotdraw.contrib.DiamondFigure(var59, var63);
    org.jhotdraw.framework.HandleEnumeration var65 = var64.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var66 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var67 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var68 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var66, (org.jhotdraw.framework.FigureChangeListener)var67);
    org.jhotdraw.framework.Figure var69 = var55.replace((org.jhotdraw.framework.Figure)var64, (org.jhotdraw.framework.Figure)var66);
    org.jhotdraw.framework.Handle var70 = org.jhotdraw.standard.BoxHandleKit.north(var69);
    org.jhotdraw.standard.HandleTracker var71 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var48, var70);
    org.jhotdraw.standard.ToolButton var72 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var37, var46, var47, (org.jhotdraw.framework.Tool)var71);
    org.jhotdraw.contrib.MDI_DrawApplication var73 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var74 = var73.isDoubleBuffered();
    javax.swing.JRootPane var75 = var73.getRootPane();
    javax.swing.JLayeredPane var76 = var73.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var77 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var78 = var77.isDoubleBuffered();
    javax.swing.JRootPane var79 = var77.getRootPane();
    javax.swing.JLayeredPane var80 = var77.getLayeredPane();
    int var81 = (-1);
    int var82 = 0;
    org.jhotdraw.standard.StandardDrawingView var83 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var77, var81, var82);
    java.awt.Component var84 = var73.add((java.awt.Component)var83);
    boolean var85 = var83.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var86 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var87 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var88 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var86, (org.jhotdraw.framework.FigureChangeListener)var87);
    java.awt.Dimension var89 = var86.size();
    var83.removeFromSelection((org.jhotdraw.framework.Figure)var86);
    var86.layout();
    java.lang.Object var92 = var86.clone();
    org.jhotdraw.framework.FigureChangeEvent var93 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var86);
    var72.toolDisabled((java.util.EventObject)var93);
    var0.figureInvalidated(var93);
    java.lang.Object var96 = var93.getSource();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var74 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var78 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var85 == false);

  }

  public void test68() throws Throwable {

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
    var2.willChange();
    
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

  public void test69() throws Throwable {

    org.jhotdraw.contrib.html.ETSLADisposalStrategy var0 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    org.jhotdraw.contrib.html.StandardDisposableResourceManager var1 = new org.jhotdraw.contrib.html.StandardDisposableResourceManager((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var0);
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.lang.Double var6 = new java.lang.Double((-1.0d));
    java.lang.Double var7 = new java.lang.Double(100.0d);
    java.lang.Double var8 = new java.lang.Double(1.0d);
    java.awt.Point var9 = org.jhotdraw.util.Geom.polarToPoint(var6, var7, var8);
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    var4.basicDisplayBox(var9, var13);
    java.lang.String var15 = "";
    java.lang.Character var16 = new java.lang.Character(' ');
    org.jhotdraw.contrib.html.DisposableResourceHolder var17 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var16);
    var4.setAttribute(var15, (java.lang.Object)var17);
    var1.unregisterResource(var17);
    java.util.Iterator var20 = var1.getResources();

  }

  public void test70() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.framework.Tool var3 = var1.tool();
    javax.swing.TransferHandler var4 = var1.getTransferHandler();
    java.awt.Graphics var5 = var1.getGraphics();
    var1.disable();
    org.jhotdraw.standard.DuplicateCommand var7 = new org.jhotdraw.standard.DuplicateCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JRootPane var10 = var8.getRootPane();
    javax.swing.JLayeredPane var11 = var8.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    javax.swing.JLayeredPane var15 = var12.getLayeredPane();
    int var16 = (-1);
    int var17 = 0;
    org.jhotdraw.standard.StandardDrawingView var18 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var12, var16, var17);
    java.awt.Component var19 = var8.add((java.awt.Component)var18);
    boolean var20 = var18.getInheritsPopupMenu();
    boolean var21 = var18.requestDefaultFocus();
    java.lang.String var22 = "hi!";
    java.lang.Character var23 = new java.lang.Character(' ');
    java.lang.Character var24 = new java.lang.Character(' ');
    var18.firePropertyChange(var22, var23, var24);
    boolean var26 = var18.isReadOnly();
    org.jhotdraw.contrib.MDI_DrawApplication var27 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var28 = var27.isDoubleBuffered();
    javax.swing.JRootPane var29 = var27.getRootPane();
    javax.swing.JLayeredPane var30 = var27.getLayeredPane();
    int var31 = (-1);
    int var32 = 0;
    org.jhotdraw.standard.StandardDrawingView var33 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var27, var31, var32);
    var33.clearSelection();
    org.jhotdraw.util.UndoableAdapter var35 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var33);
    java.awt.Dimension var36 = var33.getPreferredSize();
    java.awt.Dimension var37 = var18.getSize(var36);
    var1.remove((java.awt.Component)var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);

  }

  public void test71() throws Throwable {

    org.jhotdraw.framework.HandleEnumeration var0 = org.jhotdraw.standard.HandleEnumerator.getEmptyEnumeration();

  }

  public void test72() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    int var36 = 1;
    int var37 = 0;
    var0.moveBy(var36, var37);
    org.jhotdraw.contrib.TextAreaFigure var39 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.Boolean var40 = new java.lang.Boolean(false);
    var39.setReadOnly(var40);
    java.lang.String var42 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var43 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var44 = var43.isDoubleBuffered();
    javax.swing.JRootPane var45 = var43.getRootPane();
    javax.swing.JLayeredPane var46 = var43.getLayeredPane();
    int var47 = (-1);
    int var48 = 0;
    org.jhotdraw.standard.StandardDrawingView var49 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var43, var47, var48);
    var49.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var51 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var49.removeForeground((org.jhotdraw.framework.Painter)var51);
    boolean var53 = var49.isEnabled();
    float var54 = var49.getAlignmentX();
    var39.setAttribute(var42, (java.lang.Object)var49);
    int var56 = 1;
    int var57 = 1;
    org.jhotdraw.contrib.PolygonFigure var58 = new org.jhotdraw.contrib.PolygonFigure(var56, var57);
    org.jhotdraw.framework.FigureEnumeration var59 = var58.figures();
    java.awt.Rectangle var60 = var58.displayBox();
    org.jhotdraw.framework.Handle var61 = org.jhotdraw.standard.BoxHandleKit.east((org.jhotdraw.framework.Figure)var58);
    int var62 = 0;
    java.awt.Point var63 = var58.pointAt(var62);
    boolean var64 = var58.isEmpty();
    var39.connect((org.jhotdraw.framework.Figure)var58);
    var0.setDecoratedFigure((org.jhotdraw.framework.Figure)var58);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == true);

  }

  public void test73() throws Throwable {

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
    org.jhotdraw.contrib.CommandCheckBoxMenuItem var18 = new org.jhotdraw.contrib.CommandCheckBoxMenuItem((org.jhotdraw.util.Command)var16);
    java.lang.String var19 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var20 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var20.start();
    org.jhotdraw.standard.CopyCommand var22 = new org.jhotdraw.standard.CopyCommand(var19, (org.jhotdraw.framework.DrawingEditor)var20);
    var22.dispose();
    var18.setCommand((org.jhotdraw.util.Command)var22);
    org.jhotdraw.util.Command var25 = var18.getCommand();
    float var26 = var18.getAlignmentY();
    int var27 = 1;
    int var28 = 10;
    int var29 = 10;
    int var30 = (-1);
    var18.reshape(var27, var28, var29, var30);
    int var32 = var18.getHorizontalTextPosition();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0.5f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == 11);

  }

  public void test74() throws Throwable {

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
    double var53 = var52.getHeight();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == 0.0d);

  }

  public void test75() throws Throwable {

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
    int var10 = var6.selectionCount();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == 0);

  }

  public void test76() throws Throwable {

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
    java.lang.Object var19 = var10.getTreeLock();
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
    org.jhotdraw.util.StandardStorageFormat var44 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var45 = var44.getFileDescription();
    java.lang.String var46 = "hi!";
    org.jhotdraw.standard.StandardDrawing var47 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var48 = new java.lang.Double((-1.0d));
    java.lang.Double var49 = new java.lang.Double(100.0d);
    java.lang.Double var50 = new java.lang.Double(1.0d);
    java.awt.Point var51 = org.jhotdraw.util.Geom.polarToPoint(var48, var49, var50);
    java.lang.Double var52 = new java.lang.Double((-1.0d));
    java.lang.Double var53 = new java.lang.Double(100.0d);
    java.lang.Double var54 = new java.lang.Double(1.0d);
    java.awt.Point var55 = org.jhotdraw.util.Geom.polarToPoint(var52, var53, var54);
    org.jhotdraw.contrib.DiamondFigure var56 = new org.jhotdraw.contrib.DiamondFigure(var51, var55);
    org.jhotdraw.framework.HandleEnumeration var57 = var56.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var58 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var59 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var60 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var58, (org.jhotdraw.framework.FigureChangeListener)var59);
    org.jhotdraw.framework.Figure var61 = var47.replace((org.jhotdraw.framework.Figure)var56, (org.jhotdraw.framework.Figure)var58);
    java.lang.String var62 = var44.store(var46, (org.jhotdraw.framework.Drawing)var47);
    org.jhotdraw.framework.FigureEnumeration var63 = var47.figures();
    var37.orphanAll(var63);
    org.jhotdraw.framework.FigureEnumeration var65 = var37.figures();
    int var66 = 10;
    int var67 = 10;
    java.lang.Boolean var68 = new java.lang.Boolean(false);
    org.jhotdraw.framework.FigureEnumeration var69 = var10.insertFigures(var65, var66, var67, var68);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var70 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var70.start();
    java.awt.Color var72 = var70.getForeground();
    var70.endAnimation();
    java.awt.Dimension var74 = var70.getMaximumSize();
    var10.setMinimumSize(var74);
    java.awt.Dimension var76 = var10.getSize();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62.equals("hi!.draw"));

  }

  public void test77() throws Throwable {

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
    org.jhotdraw.figures.ArrowTip var12 = new org.jhotdraw.figures.ArrowTip();
    int var13 = 1;
    int var14 = 1;
    int var15 = 10;
    int var16 = 0;
    java.awt.Polygon var17 = var12.outline(var13, var14, var15, var16);
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    int var22 = (-1);
    int var23 = 0;
    org.jhotdraw.standard.StandardDrawingView var24 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var18, var22, var23);
    var24.clearSelection();
    java.awt.Color var26 = var24.getForeground();
    var12.setFillColor(var26);
    java.awt.Rectangle var28 = var12.displayBox();
    org.jhotdraw.framework.DrawingChangeEvent var29 = new org.jhotdraw.framework.DrawingChangeEvent((org.jhotdraw.framework.Drawing)var0, var28);
    int var30 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var31 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var30);
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var34 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var32, (org.jhotdraw.framework.FigureChangeListener)var33);
    boolean var35 = var31.remove((java.lang.Object)var32);
    org.jhotdraw.util.collections.jdk11.ListWrapper var36 = new org.jhotdraw.util.collections.jdk11.ListWrapper((java.util.Collection)var31);
    var31.clear();
    var0.orphanAll((java.util.List)var31);
    org.jhotdraw.framework.FigureEnumeration var39 = var0.figures();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test78() throws Throwable {

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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.samples.javadraw.JavaDrawApp.main(var16);
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

  public void test79() throws Throwable {

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
    boolean var10 = var8.isRedoable();
    boolean var11 = var8.isUndoable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test80() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    var3.dispose();
    java.lang.String var5 = "";
    org.jhotdraw.util.CommandMenu var6 = new org.jhotdraw.util.CommandMenu(var5);
    var3.addCommandListener((org.jhotdraw.util.CommandListener)var6);
    javax.swing.InputMap var8 = var6.getInputMap();
    java.lang.String var9 = "";
    var6.setLabel(var9);
    javax.swing.event.MenuDragMouseListener[] var11 = var6.getMenuDragMouseListeners();

  }

  public void test81() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    int var4 = (-1);
    int var5 = 10;
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var7 = var6.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var8 = var6.handles();
    org.jhotdraw.contrib.MDI_DrawApplication var9 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var10 = var9.isDoubleBuffered();
    javax.swing.JMenu var11 = var9.createLookAndFeelMenu();
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = "";
    int var14 = 100;
    var11.insert(var13, var14);
    int var16 = 100;
    int var17 = 0;
    int var18 = 0;
    int var19 = 10;
    var11.reshape(var16, var17, var18, var19);
    org.jhotdraw.standard.StandardDrawing var21 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var22 = new java.lang.Double((-1.0d));
    java.lang.Double var23 = new java.lang.Double(100.0d);
    java.lang.Double var24 = new java.lang.Double(1.0d);
    java.awt.Point var25 = org.jhotdraw.util.Geom.polarToPoint(var22, var23, var24);
    java.lang.Double var26 = new java.lang.Double((-1.0d));
    java.lang.Double var27 = new java.lang.Double(100.0d);
    java.lang.Double var28 = new java.lang.Double(1.0d);
    java.awt.Point var29 = org.jhotdraw.util.Geom.polarToPoint(var26, var27, var28);
    org.jhotdraw.contrib.DiamondFigure var30 = new org.jhotdraw.contrib.DiamondFigure(var25, var29);
    org.jhotdraw.framework.HandleEnumeration var31 = var30.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var34 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var32, (org.jhotdraw.framework.FigureChangeListener)var33);
    org.jhotdraw.framework.Figure var35 = var21.replace((org.jhotdraw.framework.Figure)var30, (org.jhotdraw.framework.Figure)var32);
    org.jhotdraw.framework.Handle var36 = org.jhotdraw.standard.BoxHandleKit.north(var35);
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    var43.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var45 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var43.removeForeground((org.jhotdraw.framework.Painter)var45);
    org.jhotdraw.util.UndoableHandle var47 = new org.jhotdraw.util.UndoableHandle(var36, (org.jhotdraw.framework.DrawingView)var43);
    org.jhotdraw.util.Undoable var48 = var47.getUndoActivity();
    java.awt.Rectangle var49 = var47.displayBox();
    var11.computeVisibleRect(var49);
    java.lang.Double var51 = new java.lang.Double(10.0d);
    java.awt.Point var52 = org.jhotdraw.util.Geom.angleToPoint(var49, var51);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    java.lang.Double var54 = new java.lang.Double(100.0d);
    java.lang.Double var55 = new java.lang.Double(1.0d);
    java.awt.Point var56 = org.jhotdraw.util.Geom.polarToPoint(var53, var54, var55);
    var6.basicDisplayBox(var52, var56);
    org.jhotdraw.framework.Figure var58 = var2.findFigureWithout(var4, var5, (org.jhotdraw.framework.Figure)var6);
    org.jhotdraw.contrib.MDI_DrawApplication var59 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var60 = var59.isDoubleBuffered();
    javax.swing.JRootPane var61 = var59.getRootPane();
    javax.swing.JLayeredPane var62 = var59.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var63 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var64 = var63.isDoubleBuffered();
    javax.swing.JRootPane var65 = var63.getRootPane();
    java.lang.String var66 = var65.getUIClassID();
    java.awt.Insets var67 = var65.getInsets();
    int var68 = (-1);
    var62.setPosition((java.awt.Component)var65, var68);
    org.jhotdraw.contrib.MDI_DrawApplication var70 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var71 = var70.isDoubleBuffered();
    int var72 = 0;
    var62.setLayer((java.awt.Component)var70, var72);
    java.awt.event.HierarchyListener[] var74 = var70.getHierarchyListeners();
    java.lang.String[] var75 = var70.getRequiredVersions();
    java.awt.Window[] var76 = var70.getOwnedWindows();
    int var77 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var78 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var77);
    org.jhotdraw.contrib.GraphicalCompositeFigure var79 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var80 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var81 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var79, (org.jhotdraw.framework.FigureChangeListener)var80);
    boolean var82 = var78.remove((java.lang.Object)var79);
    org.jhotdraw.contrib.MDI_DrawApplication var83 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var84 = var83.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var85 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var83);
    boolean var86 = var83.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var87 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var83);
    var87.deactivate();
    int var89 = var78.indexOf((java.lang.Object)var87);
    var70.setIconImages((java.util.List)var78);
    var2.orphanAll((java.util.List)var78);
    org.jhotdraw.standard.FigureEnumerator var92 = new org.jhotdraw.standard.FigureEnumerator((java.util.Collection)var78);
    int var93 = 100;
    org.jhotdraw.standard.StandardFigureSelection var94 = new org.jhotdraw.standard.StandardFigureSelection((org.jhotdraw.framework.FigureEnumeration)var92, var93);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));

  }

  public void test82() throws Throwable {

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
    java.awt.dnd.DragSourceListener var14 = var10.getDragSourceListener();
    boolean var15 = var10.isReadOnly();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Dimension var16 = var10.getMinimumSize();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test83() throws Throwable {

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
    var16.removeNotify();
    java.lang.Boolean var23 = new java.lang.Boolean(false);
    var16.setEnabled(var23);
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JMenu var27 = var25.createLookAndFeelMenu();
    java.lang.String var28 = var27.getName();
    java.lang.String var29 = "";
    int var30 = 100;
    var27.insert(var29, var30);
    javax.swing.JMenuItem var32 = var16.add((javax.swing.JMenuItem)var27);
    java.lang.Boolean var33 = new java.lang.Boolean(true);
    var16.setFocusPainted(var33);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

  }

  public void test84() throws Throwable {

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
    boolean var59 = var47.getHideActionText();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);

  }

  public void test85() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JMenu var20 = var18.createLookAndFeelMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var21 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var22 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var23 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var21, (org.jhotdraw.framework.FigureChangeListener)var22);
    java.awt.Dimension var24 = var21.size();
    var20.setPreferredSize(var24);
    int var26 = var7.getLayer((java.awt.Component)var20);
    int var27 = var7.getX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-30000));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 0);

  }

  public void test86() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    java.awt.FocusTraversalPolicy var3 = var0.getFocusTraversalPolicy();
    javax.accessibility.AccessibleContext var4 = var0.getAccessibleContext();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test87() throws Throwable {

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
    org.jhotdraw.framework.DrawingView var24 = var23.view();
    
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

  public void test88() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    var2.revalidate();
    int var5 = var2.getIconTextGap();
    int var6 = 1;
    javax.swing.JMenuItem var7 = var2.getItem(var6);
    java.awt.Toolkit var8 = var7.getToolkit();
    org.jhotdraw.contrib.MDI_DrawApplication var9 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var10 = var9.isDoubleBuffered();
    javax.swing.JMenu var11 = var9.createLookAndFeelMenu();
    java.lang.Character var12 = new java.lang.Character('a');
    var11.setMnemonic(var12);
    boolean var14 = var11.isContentAreaFilled();
    javax.swing.Action var15 = var11.getAction();
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JMenu var18 = var16.createLookAndFeelMenu();
    var16.open();
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.standard.StandardDrawingView var26 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var20, var24, var25);
    var26.clearSelection();
    org.jhotdraw.util.UndoableAdapter var28 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var26);
    java.awt.Dimension var29 = var26.getPreferredSize();
    var16.setMinimumSize(var29);
    int var31 = 10;
    int var32 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var33 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var31, var32);
    org.jhotdraw.figures.ScribbleTool var34 = new org.jhotdraw.figures.ScribbleTool((org.jhotdraw.framework.DrawingEditor)var16);
    var7.add((java.awt.Component)var11, (java.lang.Object)var16);
    var16.show();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test89() throws Throwable {

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
    org.jhotdraw.figures.ArrowTip var16 = new org.jhotdraw.figures.ArrowTip();
    int var17 = 1;
    int var18 = 1;
    int var19 = 10;
    int var20 = 0;
    java.awt.Polygon var21 = var16.outline(var17, var18, var19, var20);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JRootPane var24 = var22.getRootPane();
    javax.swing.JLayeredPane var25 = var22.getLayeredPane();
    int var26 = (-1);
    int var27 = 0;
    org.jhotdraw.standard.StandardDrawingView var28 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var22, var26, var27);
    var28.clearSelection();
    java.awt.Color var30 = var28.getForeground();
    var16.setFillColor(var30);
    java.awt.Rectangle var32 = var16.displayBox();
    var0.init(var32);
    java.lang.String var34 = "hi!";
    var0.setTitle(var34);
    org.jhotdraw.figures.LineFigure var36 = new org.jhotdraw.figures.LineFigure();
    int var37 = 100;
    int var38 = 1;
    boolean var39 = var36.joinSegments(var37, var38);
    int var40 = 100;
    var0.sendToLayer((org.jhotdraw.framework.Figure)var36, var40);
    org.jhotdraw.contrib.MDI_DrawApplication var42 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var43 = var42.isDoubleBuffered();
    javax.swing.JRootPane var44 = var42.getRootPane();
    javax.swing.JLayeredPane var45 = var42.getLayeredPane();
    int var46 = (-1);
    int var47 = 0;
    org.jhotdraw.standard.StandardDrawingView var48 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var42, var46, var47);
    var48.clearSelection();
    var48.requestFocus();
    var48.repairDamage();
    var0.addDrawingChangeListener((org.jhotdraw.framework.DrawingChangeListener)var48);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var57 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var58 = var57.isDoubleBuffered();
    javax.swing.JRootPane var59 = var57.getRootPane();
    javax.swing.JLayeredPane var60 = var57.getLayeredPane();
    int var61 = (-1);
    int var62 = 0;
    org.jhotdraw.standard.StandardDrawingView var63 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var57, var61, var62);
    java.awt.Component var64 = var53.add((java.awt.Component)var63);
    boolean var65 = var63.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var66 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var67 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var68 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var66, (org.jhotdraw.framework.FigureChangeListener)var67);
    java.awt.Dimension var69 = var66.size();
    var63.removeFromSelection((org.jhotdraw.framework.Figure)var66);
    org.jhotdraw.contrib.MDI_DrawApplication var71 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var72 = var71.isDoubleBuffered();
    javax.swing.JRootPane var73 = var71.getRootPane();
    javax.swing.JLayeredPane var74 = var71.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var75 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var76 = var75.isDoubleBuffered();
    javax.swing.JRootPane var77 = var75.getRootPane();
    javax.swing.JLayeredPane var78 = var75.getLayeredPane();
    int var79 = (-1);
    int var80 = 0;
    org.jhotdraw.standard.StandardDrawingView var81 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var75, var79, var80);
    java.awt.Component var82 = var71.add((java.awt.Component)var81);
    var63.setEditor((org.jhotdraw.framework.DrawingEditor)var71);
    java.awt.Dimension var84 = var63.minimumSize();
    var48.setSize(var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == false);

  }

  public void test90() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    javax.swing.Action var1 = var0.getAction();
    javax.accessibility.AccessibleContext var2 = var0.getAccessibleContext();
    java.lang.String var3 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var4 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var4.start();
    org.jhotdraw.standard.CopyCommand var6 = new org.jhotdraw.standard.CopyCommand(var3, (org.jhotdraw.framework.DrawingEditor)var4);
    var6.dispose();
    java.lang.String var8 = "";
    org.jhotdraw.util.CommandMenu var9 = new org.jhotdraw.util.CommandMenu(var8);
    var6.addCommandListener((org.jhotdraw.util.CommandListener)var9);
    javax.swing.InputMap var11 = var9.getInputMap();
    java.awt.event.ActionListener var12 = java.awt.AWTEventMulticaster.add((java.awt.event.ActionListener)var0, (java.awt.event.ActionListener)var9);
    java.lang.String var13 = "";
    var0.setActionCommand(var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);

  }

  public void test91() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);
    org.jhotdraw.framework.JHotDrawException var2 = new org.jhotdraw.framework.JHotDrawException((java.lang.Exception)var1);
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("org.jhotdraw.framework.JHotDrawRuntimeException: hi!"));

  }

  public void test92() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    boolean var4 = var0.isFocusTraversalPolicyProvider();
    java.lang.String[] var5 = var0.getRequiredVersions();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test93() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    java.awt.Rectangle var7 = var0.getBounds();
    var0.transferFocusUpCycle();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test94() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    int var4 = 100;
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    org.jhotdraw.util.PaletteLayout var9 = new org.jhotdraw.util.PaletteLayout(var4, var8);
    var1.setLayout((java.awt.LayoutManager)var9);
    java.lang.String var11 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var12 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var12.start();
    org.jhotdraw.standard.CopyCommand var14 = new org.jhotdraw.standard.CopyCommand(var11, (org.jhotdraw.framework.DrawingEditor)var12);
    var14.dispose();
    java.lang.String var16 = "";
    org.jhotdraw.util.CommandMenu var17 = new org.jhotdraw.util.CommandMenu(var16);
    var14.addCommandListener((org.jhotdraw.util.CommandListener)var17);
    javax.swing.InputMap var19 = var17.getInputMap();
    java.lang.String var20 = "";
    var17.setLabel(var20);
    javax.swing.event.MenuDragMouseListener[] var22 = var17.getMenuDragMouseListeners();
    var9.layoutContainer((java.awt.Container)var17);

  }

  public void test95() throws Throwable {

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
    int var14 = var10.getWidth();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var17 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var15, (org.jhotdraw.framework.FigureChangeListener)var16);
    java.awt.Dimension var18 = var15.size();
    var10.setPreferredSize(var18);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == 0);

  }

  public void test96() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.figures.TextFigure.setCurrentFontName(var0);

  }

  public void test97() throws Throwable {

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
    int var24 = 1;
    int var25 = 10;
    int var26 = 10;
    int var27 = 0;
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    int var32 = (-1);
    int var33 = 0;
    org.jhotdraw.standard.StandardDrawingView var34 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var28, var32, var33);
    var34.clearSelection();
    var34.layout();
    int var37 = var34.getHeight();
    var34.clearSelection();
    var23.invokeEnd(var24, var25, var26, var27, (org.jhotdraw.framework.DrawingView)var34);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test98() throws Throwable {

    org.jhotdraw.contrib.html.ContentProducerRegistry var0 = new org.jhotdraw.contrib.html.ContentProducerRegistry();
    org.jhotdraw.contrib.html.ContentProducerRegistry var1 = new org.jhotdraw.contrib.html.ContentProducerRegistry(var0);
    org.jhotdraw.contrib.html.ContentProducerRegistry var2 = var0.getParent();

  }

  public void test99() throws Throwable {

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
    org.jhotdraw.samples.javadraw.JavaDrawApplet var36 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var36.start();
    org.jhotdraw.framework.Tool var38 = var36.tool();
    java.awt.FocusTraversalPolicy var39 = var36.getFocusTraversalPolicy();
    var35.setFocusTraversalPolicy(var39);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    boolean var43 = var41.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var44 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var45 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var46 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var44, (org.jhotdraw.framework.FigureChangeListener)var45);
    int var47 = var45.getZValue();
    java.lang.Object var48 = var45.clone();
    org.jhotdraw.standard.CreationTool var49 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var41, (org.jhotdraw.framework.Figure)var45);
    java.lang.String var50 = "hi!";
    java.lang.String var51 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var52 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var53 = var52.isDoubleBuffered();
    javax.swing.JRootPane var54 = var52.getRootPane();
    javax.swing.JLayeredPane var55 = var52.getLayeredPane();
    java.awt.Graphics var56 = var52.getGraphics();
    java.lang.Boolean var57 = new java.lang.Boolean(true);
    var52.setLocationByPlatform(var57);
    org.jhotdraw.standard.StandardDrawing var59 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.lang.Double var64 = new java.lang.Double((-1.0d));
    java.lang.Double var65 = new java.lang.Double(100.0d);
    java.lang.Double var66 = new java.lang.Double(1.0d);
    java.awt.Point var67 = org.jhotdraw.util.Geom.polarToPoint(var64, var65, var66);
    org.jhotdraw.contrib.DiamondFigure var68 = new org.jhotdraw.contrib.DiamondFigure(var63, var67);
    org.jhotdraw.framework.HandleEnumeration var69 = var68.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    org.jhotdraw.framework.Figure var73 = var59.replace((org.jhotdraw.framework.Figure)var68, (org.jhotdraw.framework.Figure)var70);
    org.jhotdraw.framework.Handle var74 = org.jhotdraw.standard.BoxHandleKit.north(var73);
    org.jhotdraw.standard.HandleTracker var75 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var52, var74);
    org.jhotdraw.standard.ToolButton var76 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var41, var50, var51, (org.jhotdraw.framework.Tool)var75);
    int var77 = var76.getVerticalAlignment();
    java.lang.Long var78 = new java.lang.Long(10L);
    int var79 = 10;
    int var80 = (-1);
    int var81 = 100;
    int var82 = 100;
    var76.repaint(var78, var79, var80, var81, var82);
    java.awt.event.MouseMotionListener var84 = java.awt.AWTEventMulticaster.remove((java.awt.event.MouseMotionListener)var35, (java.awt.event.MouseMotionListener)var76);
    
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
    assertTrue(var38 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var77 == 0);

  }

  public void test100() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    int var4 = (-1);
    int var5 = 0;
    org.jhotdraw.standard.StandardDrawingView var6 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var0, var4, var5);
    java.awt.Rectangle var7 = var0.getBounds();
    org.jhotdraw.contrib.zoom.ZoomAreaTracker var8 = new org.jhotdraw.contrib.zoom.ZoomAreaTracker((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.JPanelDesktop var9 = new org.jhotdraw.contrib.JPanelDesktop((org.jhotdraw.application.DrawApplication)var0);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JRootPane var12 = var10.getRootPane();
    javax.swing.JLayeredPane var13 = var10.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    java.lang.String var17 = var16.getUIClassID();
    java.awt.Insets var18 = var16.getInsets();
    int var19 = (-1);
    var13.setPosition((java.awt.Component)var16, var19);
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    int var23 = 0;
    var13.setLayer((java.awt.Component)var21, var23);
    java.awt.Rectangle var25 = var13.getBounds();
    org.jhotdraw.contrib.DesktopEventService var26 = new org.jhotdraw.contrib.DesktopEventService((org.jhotdraw.contrib.Desktop)var9, (java.awt.Container)var13);
    org.jhotdraw.framework.DrawingView var27 = var26.getActiveDrawingView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == null);

  }

  public void test101() throws Throwable {

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
    org.jhotdraw.util.UndoableAdapter var47 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var22);
    org.jhotdraw.framework.FigureEnumeration var48 = var47.getAffectedFigures();
    var47.release();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);

  }

  public void test102() throws Throwable {

    org.jhotdraw.contrib.TextAreaFigure var0 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var1 = "";
    var0.setText(var1);
    org.jhotdraw.figures.TextFigure var3 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var4 = var3.textDisplayBox();
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
    int var17 = 100;
    int var18 = (-1);
    java.lang.Double var19 = new java.lang.Double((-1.0d));
    java.lang.Double var20 = new java.lang.Double(100.0d);
    java.lang.Double var21 = new java.lang.Double(1.0d);
    java.awt.Point var22 = org.jhotdraw.util.Geom.polarToPoint(var19, var20, var21);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    org.jhotdraw.contrib.DiamondFigure var27 = new org.jhotdraw.contrib.DiamondFigure(var22, var26);
    org.jhotdraw.framework.Figure var28 = var5.findFigureInsideWithout(var17, var18, (org.jhotdraw.framework.Figure)var27);
    java.util.Iterator var29 = var5.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    java.awt.Component var41 = var30.add((java.awt.Component)var40);
    boolean var42 = var40.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var43 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var44 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var45 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var43, (org.jhotdraw.framework.FigureChangeListener)var44);
    java.awt.Dimension var46 = var43.size();
    var40.removeFromSelection((org.jhotdraw.framework.Figure)var43);
    var43.layout();
    java.lang.Object var49 = var43.clone();
    org.jhotdraw.framework.FigureChangeEvent var50 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var43);
    var5.figureRequestUpdate(var50);
    java.awt.Rectangle var52 = var50.getInvalidatedRectangle();
    var3.figureRequestUpdate(var50);
    var0.figureRequestUpdate(var50);
    java.lang.String var55 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var56 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var56.start();
    org.jhotdraw.standard.CopyCommand var58 = new org.jhotdraw.standard.CopyCommand(var55, (org.jhotdraw.framework.DrawingEditor)var56);
    var58.dispose();
    java.lang.String var60 = "";
    org.jhotdraw.util.CommandMenu var61 = new org.jhotdraw.util.CommandMenu(var60);
    var58.addCommandListener((org.jhotdraw.util.CommandListener)var61);
    javax.swing.InputMap var63 = var61.getInputMap();
    java.lang.String var64 = "";
    var61.setLabel(var64);
    org.jhotdraw.figures.NumberTextFigure var66 = new org.jhotdraw.figures.NumberTextFigure();
    java.lang.String var67 = var66.getText();
    int var68 = var66.overlayColumns();
    int var69 = var66.getValue();
    org.jhotdraw.contrib.html.TextHolderContentProducer var70 = new org.jhotdraw.contrib.html.TextHolderContentProducer((org.jhotdraw.standard.TextHolder)var66);
    java.awt.Rectangle var71 = var66.textDisplayBox();
    java.lang.Boolean var72 = new java.lang.Boolean(false);
    var66.setReadOnly(var72);
    org.jhotdraw.contrib.MDI_DrawApplication var74 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var75 = var74.isDoubleBuffered();
    javax.swing.JRootPane var76 = var74.getRootPane();
    javax.swing.JLayeredPane var77 = var74.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var78 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var79 = var78.isDoubleBuffered();
    javax.swing.JRootPane var80 = var78.getRootPane();
    javax.swing.JLayeredPane var81 = var78.getLayeredPane();
    int var82 = (-1);
    int var83 = 0;
    org.jhotdraw.standard.StandardDrawingView var84 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var78, var82, var83);
    java.awt.Component var85 = var74.add((java.awt.Component)var84);
    boolean var86 = var84.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var87 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var88 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var89 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var87, (org.jhotdraw.framework.FigureChangeListener)var88);
    java.awt.Dimension var90 = var87.size();
    var84.removeFromSelection((org.jhotdraw.framework.Figure)var87);
    var87.layout();
    java.lang.Object var93 = var87.clone();
    org.jhotdraw.framework.FigureChangeEvent var94 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var87);
    java.lang.Object var95 = var94.getSource();
    var66.figureChanged(var94);
    var61.commandExecutable((java.util.EventObject)var94);
    var0.figureRemoved(var94);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var67.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == false);

  }

  public void test103() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    int var36 = 1;
    int var37 = 0;
    var0.moveBy(var36, var37);
    boolean var39 = var0.canConnect();
    java.lang.Boolean var40 = new java.lang.Boolean(true);
    org.jhotdraw.figures.LineConnection var41 = new org.jhotdraw.figures.LineConnection();
    boolean var42 = var41.canConnect();
    var0.connectorVisibility(var40, (org.jhotdraw.framework.ConnectionFigure)var41);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test104() throws Throwable {

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
    int var30 = (-1);
    int var31 = 100;
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JMenu var34 = var32.createLookAndFeelMenu();
    var32.open();
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JRootPane var38 = var36.getRootPane();
    javax.swing.JLayeredPane var39 = var36.getLayeredPane();
    int var40 = (-1);
    int var41 = 0;
    org.jhotdraw.standard.StandardDrawingView var42 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var36, var40, var41);
    var42.clearSelection();
    org.jhotdraw.util.UndoableAdapter var44 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var42);
    java.awt.Dimension var45 = var42.getPreferredSize();
    var32.setMinimumSize(var45);
    int var47 = 10;
    int var48 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var49 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var47, var48);
    var49.repairDamage();
    var26.invokeStart(var30, var31, (org.jhotdraw.framework.DrawingView)var49);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test105() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    int var9 = (-1);
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var5, var9, var10);
    var11.clearSelection();
    org.jhotdraw.util.UndoableAdapter var13 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var11);
    org.jhotdraw.contrib.html.DisposableResourceHolder var14 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var13);
    boolean var15 = var13.undo();
    var4.setUndoActivity((org.jhotdraw.util.Undoable)var13);
    boolean var17 = var13.redo();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test106() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var9 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var0);
    var9.tileFramesVertically();
    javax.swing.JInternalFrame[] var11 = var9.getAllFrames();
    int var12 = (-1);
    org.jhotdraw.framework.DrawingView[] var13 = var9.getAllFromDesktop(var12);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test107() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var19 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var20 = var19.isDoubleBuffered();
    javax.swing.JRootPane var21 = var19.getRootPane();
    javax.swing.JLayeredPane var22 = var19.getLayeredPane();
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
    boolean var35 = var33.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var36 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var38 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var36, (org.jhotdraw.framework.FigureChangeListener)var37);
    java.awt.Dimension var39 = var36.size();
    var33.removeFromSelection((org.jhotdraw.framework.Figure)var36);
    var36.layout();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var42 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var19, (org.jhotdraw.framework.Figure)var36);
    org.jhotdraw.util.StandardStorageFormat var43 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var44 = var43.getFileDescription();
    java.lang.String var45 = "hi!";
    org.jhotdraw.standard.StandardDrawing var46 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var47 = new java.lang.Double((-1.0d));
    java.lang.Double var48 = new java.lang.Double(100.0d);
    java.lang.Double var49 = new java.lang.Double(1.0d);
    java.awt.Point var50 = org.jhotdraw.util.Geom.polarToPoint(var47, var48, var49);
    java.lang.Double var51 = new java.lang.Double((-1.0d));
    java.lang.Double var52 = new java.lang.Double(100.0d);
    java.lang.Double var53 = new java.lang.Double(1.0d);
    java.awt.Point var54 = org.jhotdraw.util.Geom.polarToPoint(var51, var52, var53);
    org.jhotdraw.contrib.DiamondFigure var55 = new org.jhotdraw.contrib.DiamondFigure(var50, var54);
    org.jhotdraw.framework.HandleEnumeration var56 = var55.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var57 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var58 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var59 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var57, (org.jhotdraw.framework.FigureChangeListener)var58);
    org.jhotdraw.framework.Figure var60 = var46.replace((org.jhotdraw.framework.Figure)var55, (org.jhotdraw.framework.Figure)var57);
    java.lang.String var61 = var43.store(var45, (org.jhotdraw.framework.Drawing)var46);
    org.jhotdraw.framework.FigureEnumeration var62 = var46.figures();
    var36.orphanAll(var62);
    org.jhotdraw.framework.FigureEnumeration var64 = var36.figures();
    org.jhotdraw.framework.Locator var65 = org.jhotdraw.standard.RelativeLocator.center();
    org.jhotdraw.standard.LocatorHandle var66 = new org.jhotdraw.standard.LocatorHandle((org.jhotdraw.framework.Figure)var36, var65);
    var36.changed();
    org.jhotdraw.contrib.TextAreaTool var68 = new org.jhotdraw.contrib.TextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var36);
    java.awt.Component var69 = var0.getGlassPane();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var44.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61.equals("hi!.draw"));

  }

  public void test108() throws Throwable {

    org.jhotdraw.contrib.html.TriangleFigureGeometricAdapter var0 = new org.jhotdraw.contrib.html.TriangleFigureGeometricAdapter();
    org.jhotdraw.framework.HandleEnumeration var1 = var0.handles();
    java.awt.Polygon var2 = var0.getPolygon();

  }

  public void test109() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    var4.deactivate();
    var4.deactivate();
    var4.activate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);

  }

  public void test110() throws Throwable {

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
    org.jhotdraw.samples.javadraw.BouncingDrawing var20 = new org.jhotdraw.samples.javadraw.BouncingDrawing();
    var20.animationStep();
    var8.addDependendFigure((org.jhotdraw.framework.Figure)var20);
    int var23 = (-1);
    int var24 = 0;
    org.jhotdraw.framework.Connector var25 = var20.connectorAt(var23, var24);
    var20.release();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test111() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    java.lang.String var15 = var14.getUIClassID();
    java.awt.Insets var16 = var14.getInsets();
    int var17 = var14.getX();
    var2.setNextFocusableComponent((java.awt.Component)var14);
    boolean var19 = var14.requestDefaultFocus();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test112() throws Throwable {

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
    int var36 = var35.getVerticalAlignment();
    java.lang.Boolean var37 = new java.lang.Boolean(true);
    var35.setHideActionText(var37);
    
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
    assertTrue(var36 == 0);

  }

  public void test113() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    int var36 = 1;
    int var37 = 0;
    var0.moveBy(var36, var37);
    boolean var39 = var0.canConnect();
    java.lang.Boolean var40 = new java.lang.Boolean(true);
    org.jhotdraw.figures.LineConnection var41 = new org.jhotdraw.figures.LineConnection();
    boolean var42 = var41.canConnect();
    var0.connectorVisibility(var40, (org.jhotdraw.framework.ConnectionFigure)var41);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var41.disconnectEnd();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);

  }

  public void test114() throws Throwable {

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
    boolean var16 = var7.isMaximumSizeSet();
    org.jhotdraw.framework.DrawingView var17 = org.jhotdraw.contrib.Helper.getDrawingView((java.awt.Component)var7);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test115() throws Throwable {

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
    java.awt.Cursor var16 = var11.getCursor();
    int var17 = var11.getCursorType();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test116() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.framework.Tool var3 = var1.tool();
    javax.swing.TransferHandler var4 = var1.getTransferHandler();
    java.lang.String var5 = var1.getAppletInfo();
    org.jhotdraw.util.UndoCommand var6 = new org.jhotdraw.util.UndoCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test117() throws Throwable {

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
    int var12 = 10;
    int var13 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var14 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var12, var13);
    java.awt.Dimension var15 = var14.getUserSize();
    double var16 = var14.getZoomSpeed();
    java.awt.Dimension var17 = var14.getPreferredSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2.0d);

  }

  public void test118() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    int var9 = (-1);
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var5, var9, var10);
    var11.clearSelection();
    org.jhotdraw.util.UndoableAdapter var13 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var11);
    org.jhotdraw.contrib.html.DisposableResourceHolder var14 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var13);
    boolean var15 = var13.undo();
    var4.setUndoActivity((org.jhotdraw.util.Undoable)var13);
    org.jhotdraw.framework.FigureEnumeration var17 = var13.getAffectedFigures();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test119() throws Throwable {

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
    boolean var22 = var16.getInheritsPopupMenu();
    int var23 = 1;
    var16.setIconTextGap(var23);
    int var25 = 10;
    var16.setHorizontalAlignment(var25);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);

  }

  public void test120() throws Throwable {

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
    var47.resetKeyboardActions();
    
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

  public void test121() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    int var3 = 10;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Point var4 = var2.pointAt(var3);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test122() throws Throwable {

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
    int var17 = 0;
    org.jhotdraw.util.PaletteLayout var18 = new org.jhotdraw.util.PaletteLayout(var17);
    var2.setLayout((java.awt.LayoutManager)var18);
    javax.swing.JRootPane var20 = var2.getRootPane();
    java.lang.Boolean var21 = new java.lang.Boolean(true);
    var2.setEnabled(var21);
    java.awt.Toolkit var23 = var2.getToolkit();
    int var24 = 1;
    int var25 = 1;
    org.jhotdraw.contrib.PolygonFigure var26 = new org.jhotdraw.contrib.PolygonFigure(var24, var25);
    java.lang.String var27 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    java.lang.String var31 = "hi!";
    java.lang.Long var32 = new java.lang.Long(100L);
    java.lang.Long var33 = new java.lang.Long(1L);
    var30.firePropertyChange(var31, var32, var33);
    int var35 = var30.getX();
    var26.setAttribute(var27, (java.lang.Object)var35);
    org.jhotdraw.standard.StandardDrawing var37 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var38 = new java.lang.Double((-1.0d));
    java.lang.Double var39 = new java.lang.Double(100.0d);
    java.lang.Double var40 = new java.lang.Double(1.0d);
    java.awt.Point var41 = org.jhotdraw.util.Geom.polarToPoint(var38, var39, var40);
    java.lang.Double var42 = new java.lang.Double((-1.0d));
    java.lang.Double var43 = new java.lang.Double(100.0d);
    java.lang.Double var44 = new java.lang.Double(1.0d);
    java.awt.Point var45 = org.jhotdraw.util.Geom.polarToPoint(var42, var43, var44);
    org.jhotdraw.contrib.DiamondFigure var46 = new org.jhotdraw.contrib.DiamondFigure(var41, var45);
    org.jhotdraw.framework.HandleEnumeration var47 = var46.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var48 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var50 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var48, (org.jhotdraw.framework.FigureChangeListener)var49);
    org.jhotdraw.framework.Figure var51 = var37.replace((org.jhotdraw.framework.Figure)var46, (org.jhotdraw.framework.Figure)var48);
    org.jhotdraw.framework.Handle var52 = org.jhotdraw.standard.BoxHandleKit.north(var51);
    org.jhotdraw.contrib.MDI_DrawApplication var53 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var54 = var53.isDoubleBuffered();
    javax.swing.JRootPane var55 = var53.getRootPane();
    javax.swing.JLayeredPane var56 = var53.getLayeredPane();
    int var57 = (-1);
    int var58 = 0;
    org.jhotdraw.standard.StandardDrawingView var59 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var53, var57, var58);
    var59.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var61 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var59.removeForeground((org.jhotdraw.framework.Painter)var61);
    org.jhotdraw.util.UndoableHandle var63 = new org.jhotdraw.util.UndoableHandle(var52, (org.jhotdraw.framework.DrawingView)var59);
    org.jhotdraw.contrib.MDI_DrawApplication var64 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var65 = var64.isDoubleBuffered();
    javax.swing.JRootPane var66 = var64.getRootPane();
    javax.swing.JLayeredPane var67 = var64.getLayeredPane();
    int var68 = (-1);
    int var69 = 0;
    org.jhotdraw.standard.StandardDrawingView var70 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var64, var68, var69);
    org.jhotdraw.contrib.MDI_DrawApplication var71 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var72 = var71.isDoubleBuffered();
    javax.swing.JRootPane var73 = var71.getRootPane();
    javax.swing.JLayeredPane var74 = var71.getLayeredPane();
    int var75 = (-1);
    int var76 = 0;
    org.jhotdraw.standard.StandardDrawingView var77 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var71, var75, var76);
    var77.clearSelection();
    java.awt.Color var79 = var77.getForeground();
    var70.setBackground(var79);
    org.jhotdraw.framework.FigureEnumeration var81 = var70.selectionZOrdered();
    var81.reset();
    var59.addToSelectionAll(var81);
    java.lang.Double var84 = new java.lang.Double((-1.0d));
    java.lang.Double var85 = new java.lang.Double(100.0d);
    java.lang.Double var86 = new java.lang.Double(1.0d);
    java.awt.Point var87 = org.jhotdraw.util.Geom.polarToPoint(var84, var85, var86);
    java.awt.Point var88 = var59.getLocation(var87);
    java.awt.Point var89 = var26.chop(var88);
    boolean var90 = var2.contains(var89);
    java.lang.String var91 = "hi!";
    int var92 = 0;
    var2.insert(var91, var92);
    
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
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var90 == false);

  }

  public void test123() throws Throwable {

    org.jhotdraw.contrib.FloatingTextArea var0 = new org.jhotdraw.contrib.FloatingTextArea();
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    int var9 = (-1);
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var5, var9, var10);
    java.awt.Component var12 = var1.add((java.awt.Component)var11);
    boolean var13 = var11.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var14 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var16 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var14, (org.jhotdraw.framework.FigureChangeListener)var15);
    java.awt.Dimension var17 = var14.size();
    var11.removeFromSelection((org.jhotdraw.framework.Figure)var14);
    org.jhotdraw.contrib.MDI_DrawApplication var19 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var20 = var19.isDoubleBuffered();
    javax.swing.JRootPane var21 = var19.getRootPane();
    javax.swing.JLayeredPane var22 = var19.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var23 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var24 = var23.isDoubleBuffered();
    javax.swing.JRootPane var25 = var23.getRootPane();
    javax.swing.JLayeredPane var26 = var23.getLayeredPane();
    int var27 = (-1);
    int var28 = 0;
    org.jhotdraw.standard.StandardDrawingView var29 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var23, var27, var28);
    java.awt.Component var30 = var19.add((java.awt.Component)var29);
    var11.setEditor((org.jhotdraw.framework.DrawingEditor)var19);
    java.awt.Dimension var32 = var11.minimumSize();
    java.awt.Font var33 = org.jhotdraw.figures.TextFigure.createCurrentFont();
    var0.createOverlay((java.awt.Container)var11, var33);
    java.awt.Point var35 = var11.lastClick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var24 == false);

  }

  public void test124() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var13 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var14 = var13.isDoubleBuffered();
    boolean var15 = var13.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var18 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var16, (org.jhotdraw.framework.FigureChangeListener)var17);
    int var19 = var17.getZValue();
    java.lang.Object var20 = var17.clone();
    org.jhotdraw.standard.CreationTool var21 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var13, (org.jhotdraw.framework.Figure)var17);
    java.lang.String var22 = "hi!";
    java.lang.String var23 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var24 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var25 = var24.isDoubleBuffered();
    javax.swing.JRootPane var26 = var24.getRootPane();
    javax.swing.JLayeredPane var27 = var24.getLayeredPane();
    java.awt.Graphics var28 = var24.getGraphics();
    java.lang.Boolean var29 = new java.lang.Boolean(true);
    var24.setLocationByPlatform(var29);
    org.jhotdraw.standard.StandardDrawing var31 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var32 = new java.lang.Double((-1.0d));
    java.lang.Double var33 = new java.lang.Double(100.0d);
    java.lang.Double var34 = new java.lang.Double(1.0d);
    java.awt.Point var35 = org.jhotdraw.util.Geom.polarToPoint(var32, var33, var34);
    java.lang.Double var36 = new java.lang.Double((-1.0d));
    java.lang.Double var37 = new java.lang.Double(100.0d);
    java.lang.Double var38 = new java.lang.Double(1.0d);
    java.awt.Point var39 = org.jhotdraw.util.Geom.polarToPoint(var36, var37, var38);
    org.jhotdraw.contrib.DiamondFigure var40 = new org.jhotdraw.contrib.DiamondFigure(var35, var39);
    org.jhotdraw.framework.HandleEnumeration var41 = var40.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var42 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var43 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var44 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var42, (org.jhotdraw.framework.FigureChangeListener)var43);
    org.jhotdraw.framework.Figure var45 = var31.replace((org.jhotdraw.framework.Figure)var40, (org.jhotdraw.framework.Figure)var42);
    org.jhotdraw.framework.Handle var46 = org.jhotdraw.standard.BoxHandleKit.north(var45);
    org.jhotdraw.standard.HandleTracker var47 = new org.jhotdraw.standard.HandleTracker((org.jhotdraw.framework.DrawingEditor)var24, var46);
    org.jhotdraw.standard.ToolButton var48 = new org.jhotdraw.standard.ToolButton((org.jhotdraw.util.PaletteListener)var13, var22, var23, (org.jhotdraw.framework.Tool)var47);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var49 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var49.start();
    org.jhotdraw.framework.Tool var51 = var49.tool();
    java.awt.FocusTraversalPolicy var52 = var49.getFocusTraversalPolicy();
    var48.setFocusTraversalPolicy(var52);
    var10.removeMouseMotionListener((java.awt.event.MouseMotionListener)var48);
    var48.select();
    var48.validate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == null);

  }

  public void test125() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var34 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var32, (org.jhotdraw.framework.FigureChangeListener)var33);
    org.jhotdraw.framework.Handle var35 = org.jhotdraw.standard.BoxHandleKit.south((org.jhotdraw.framework.Figure)var33);
    org.jhotdraw.standard.StandardDrawing var36 = new org.jhotdraw.standard.StandardDrawing();
    int var37 = 1;
    int var38 = 1;
    org.jhotdraw.contrib.PolygonFigure var39 = new org.jhotdraw.contrib.PolygonFigure(var37, var38);
    org.jhotdraw.framework.FigureEnumeration var40 = var39.figures();
    java.awt.Rectangle var41 = var39.displayBox();
    int var42 = 1;
    int var43 = 1;
    org.jhotdraw.contrib.PolygonFigure var44 = new org.jhotdraw.contrib.PolygonFigure(var42, var43);
    org.jhotdraw.framework.FigureEnumeration var45 = var44.figures();
    java.awt.Rectangle var46 = var44.displayBox();
    org.jhotdraw.framework.Figure var47 = var36.findFigure(var41, (org.jhotdraw.framework.Figure)var44);
    int var48 = 100;
    int var49 = (-1);
    java.lang.Double var50 = new java.lang.Double((-1.0d));
    java.lang.Double var51 = new java.lang.Double(100.0d);
    java.lang.Double var52 = new java.lang.Double(1.0d);
    java.awt.Point var53 = org.jhotdraw.util.Geom.polarToPoint(var50, var51, var52);
    java.lang.Double var54 = new java.lang.Double((-1.0d));
    java.lang.Double var55 = new java.lang.Double(100.0d);
    java.lang.Double var56 = new java.lang.Double(1.0d);
    java.awt.Point var57 = org.jhotdraw.util.Geom.polarToPoint(var54, var55, var56);
    org.jhotdraw.contrib.DiamondFigure var58 = new org.jhotdraw.contrib.DiamondFigure(var53, var57);
    org.jhotdraw.framework.Figure var59 = var36.findFigureInsideWithout(var48, var49, (org.jhotdraw.framework.Figure)var58);
    java.util.Iterator var60 = var36.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var61 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var62 = var61.isDoubleBuffered();
    javax.swing.JRootPane var63 = var61.getRootPane();
    javax.swing.JLayeredPane var64 = var61.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var65 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var66 = var65.isDoubleBuffered();
    javax.swing.JRootPane var67 = var65.getRootPane();
    javax.swing.JLayeredPane var68 = var65.getLayeredPane();
    int var69 = (-1);
    int var70 = 0;
    org.jhotdraw.standard.StandardDrawingView var71 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var65, var69, var70);
    java.awt.Component var72 = var61.add((java.awt.Component)var71);
    boolean var73 = var71.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var74 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var75 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var76 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var74, (org.jhotdraw.framework.FigureChangeListener)var75);
    java.awt.Dimension var77 = var74.size();
    var71.removeFromSelection((org.jhotdraw.framework.Figure)var74);
    var74.layout();
    java.lang.Object var80 = var74.clone();
    org.jhotdraw.framework.FigureChangeEvent var81 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var74);
    var36.figureRequestUpdate(var81);
    java.awt.Rectangle var83 = var81.getInvalidatedRectangle();
    var33.figureInvalidated(var81);
    var15.addToContainer((org.jhotdraw.framework.FigureChangeListener)var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == false);

  }

  public void test126() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var9 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var0);
    int var10 = 10;
    org.jhotdraw.framework.DrawingView[] var11 = var9.getAllFromDesktop(var10);
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      javax.swing.JInternalFrame var13 = var9.selectFrame(var12);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);

  }

  public void test127() throws Throwable {

    org.jhotdraw.contrib.zoom.ZoomUpdateStrategy var0 = new org.jhotdraw.contrib.zoom.ZoomUpdateStrategy();

  }

  public void test128() throws Throwable {

    java.lang.String var0 = "hi!";
    java.lang.String var1 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var2 = new org.jhotdraw.contrib.MDI_DrawApplication(var1);
    org.jhotdraw.util.RedoCommand var3 = new org.jhotdraw.util.RedoCommand(var0, (org.jhotdraw.framework.DrawingEditor)var2);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }

  }

  public void test129() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var9 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var0);
    var9.tileFramesVertically();
    javax.swing.JInternalFrame[] var11 = var9.getAllFrames();
    int var12 = var9.lowestLayer();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == 0);

  }

  public void test130() throws Throwable {

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
    java.awt.Dimension var10 = var2.getMinimumSize();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test131() throws Throwable {

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
    int var24 = 1;
    int var25 = 1;
    int var26 = 0;
    int var27 = 0;
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    int var36 = (-1);
    int var37 = 0;
    org.jhotdraw.standard.StandardDrawingView var38 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var36, var37);
    java.awt.Component var39 = var28.add((java.awt.Component)var38);
    boolean var40 = var38.getInheritsPopupMenu();
    boolean var41 = var38.requestDefaultFocus();
    java.lang.String var42 = "hi!";
    java.lang.Character var43 = new java.lang.Character(' ');
    java.lang.Character var44 = new java.lang.Character(' ');
    var38.firePropertyChange(var42, var43, var44);
    boolean var46 = var38.isReadOnly();
    org.jhotdraw.contrib.ClippingUpdateStrategy var47 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var38.removeBackground((org.jhotdraw.framework.Painter)var47);
    var23.invokeEnd(var24, var25, var26, var27, (org.jhotdraw.framework.DrawingView)var38);
    java.awt.Point var50 = var23.locate();
    int var51 = 1;
    int var52 = 1;
    org.jhotdraw.contrib.GraphicalCompositeFigure var53 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var54 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var53);
    org.jhotdraw.standard.StandardDrawing var55 = new org.jhotdraw.standard.StandardDrawing();
    int var56 = var53.getLayer((org.jhotdraw.framework.Figure)var55);
    java.awt.Rectangle var57 = var55.displayBox();
    var23.invokeEnd(var51, var52, (org.jhotdraw.framework.Drawing)var55);
    org.jhotdraw.contrib.TriangleFigure var59 = new org.jhotdraw.contrib.TriangleFigure();
    int var60 = 0;
    var55.sendToLayer((org.jhotdraw.framework.Figure)var59, var60);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == (-1));

  }

  public void test132() throws Throwable {

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
    java.lang.String var16 = "hi!";
    java.lang.Float var17 = new java.lang.Float(1.0f);
    java.lang.Float var18 = new java.lang.Float((-1.0f));
    var7.firePropertyChange(var16, var17, var18);
    
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

  public void test133() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    java.awt.Color var2 = var0.getForeground();
    var0.endAnimation();
    javax.swing.JMenuBar var4 = var0.getJMenuBar();
    java.lang.String var5 = "hi!";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.showStatus(var5);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test134() throws Throwable {

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
    int var17 = 0;
    org.jhotdraw.util.PaletteLayout var18 = new org.jhotdraw.util.PaletteLayout(var17);
    var7.setLayout((java.awt.LayoutManager)var18);
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JMenu var22 = var20.createLookAndFeelMenu();
    java.lang.Character var23 = new java.lang.Character('a');
    var22.setMnemonic(var23);
    org.jhotdraw.contrib.MDI_DrawApplication var25 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var26 = var25.isDoubleBuffered();
    javax.swing.JMenu var27 = var25.createLookAndFeelMenu();
    java.lang.String var28 = var27.getName();
    boolean var29 = var22.isMenuComponent((java.awt.Component)var27);
    int var30 = 100;
    int var31 = (-1);
    int var32 = (-1);
    int var33 = (-1);
    var22.reshape(var30, var31, var32, var33);
    boolean var35 = var22.isContentAreaFilled();
    javax.swing.InputVerifier var36 = var22.getInputVerifier();
    javax.swing.KeyStroke var37 = var22.getAccelerator();
    int var38 = var22.getMnemonic();
    var7.remove((javax.swing.JMenuItem)var22);
    java.lang.Boolean var40 = new java.lang.Boolean(false);
    var7.setContentAreaFilled(var40);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == 65);

  }

  public void test135() throws Throwable {

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
    javax.swing.JRootPane var49 = var43.getRootPane();
    boolean var50 = var43.isUndecorated();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test136() throws Throwable {

    org.jhotdraw.figures.NullFigure var0 = new org.jhotdraw.figures.NullFigure();
    java.lang.Object var1 = var0.clone();
    int var2 = 10;
    org.jhotdraw.framework.FigureAttributeConstant var3 = org.jhotdraw.framework.FigureAttributeConstant.getConstant(var2);
    java.lang.Object var4 = var0.getAttribute(var3);
    int var5 = 1;
    int var6 = 1;
    org.jhotdraw.contrib.PolygonFigure var7 = new org.jhotdraw.contrib.PolygonFigure(var5, var6);
    org.jhotdraw.framework.FigureEnumeration var8 = var7.figures();
    java.lang.Double var9 = new java.lang.Double((-1.0d));
    java.lang.Double var10 = new java.lang.Double(100.0d);
    java.lang.Double var11 = new java.lang.Double(1.0d);
    java.awt.Point var12 = org.jhotdraw.util.Geom.polarToPoint(var9, var10, var11);
    java.lang.Double var13 = new java.lang.Double((-1.0d));
    java.lang.Double var14 = new java.lang.Double(100.0d);
    java.lang.Double var15 = new java.lang.Double(1.0d);
    java.awt.Point var16 = org.jhotdraw.util.Geom.polarToPoint(var13, var14, var15);
    var7.basicDisplayBox(var12, var16);
    int var18 = 0;
    int var19 = 10;
    int var20 = var7.findSegment(var18, var19);
    boolean var21 = var0.includes((org.jhotdraw.framework.Figure)var7);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);

  }

  public void test137() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.framework.Tool var3 = var1.tool();
    org.jhotdraw.samples.javadraw.JavaDrawApplet var4 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var4.start();
    var1.remove((java.awt.Component)var4);
    org.jhotdraw.framework.DrawingView var7 = var1.view();
    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var8 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();
    var8.resetDelay();
    org.jhotdraw.figures.TextFigure var10 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var11 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var10);
    var8.setResource((java.lang.Object)var10);
    org.jhotdraw.standard.SingleFigureEnumerator var13 = new org.jhotdraw.standard.SingleFigureEnumerator((org.jhotdraw.framework.Figure)var10);
    org.jhotdraw.standard.StandardDrawing var14 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var15 = new java.lang.Double((-1.0d));
    java.lang.Double var16 = new java.lang.Double(100.0d);
    java.lang.Double var17 = new java.lang.Double(1.0d);
    java.awt.Point var18 = org.jhotdraw.util.Geom.polarToPoint(var15, var16, var17);
    java.lang.Double var19 = new java.lang.Double((-1.0d));
    java.lang.Double var20 = new java.lang.Double(100.0d);
    java.lang.Double var21 = new java.lang.Double(1.0d);
    java.awt.Point var22 = org.jhotdraw.util.Geom.polarToPoint(var19, var20, var21);
    org.jhotdraw.contrib.DiamondFigure var23 = new org.jhotdraw.contrib.DiamondFigure(var18, var22);
    org.jhotdraw.framework.HandleEnumeration var24 = var23.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var26 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var27 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var25, (org.jhotdraw.framework.FigureChangeListener)var26);
    org.jhotdraw.framework.Figure var28 = var14.replace((org.jhotdraw.framework.Figure)var23, (org.jhotdraw.framework.Figure)var25);
    org.jhotdraw.framework.Handle var29 = org.jhotdraw.standard.BoxHandleKit.north(var28);
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    javax.swing.JRootPane var32 = var30.getRootPane();
    javax.swing.JLayeredPane var33 = var30.getLayeredPane();
    int var34 = (-1);
    int var35 = 0;
    org.jhotdraw.standard.StandardDrawingView var36 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var30, var34, var35);
    var36.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var38 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var36.removeForeground((org.jhotdraw.framework.Painter)var38);
    org.jhotdraw.util.UndoableHandle var40 = new org.jhotdraw.util.UndoableHandle(var29, (org.jhotdraw.framework.DrawingView)var36);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    int var45 = (-1);
    int var46 = 0;
    org.jhotdraw.standard.StandardDrawingView var47 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var41, var45, var46);
    org.jhotdraw.contrib.MDI_DrawApplication var48 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var49 = var48.isDoubleBuffered();
    javax.swing.JRootPane var50 = var48.getRootPane();
    javax.swing.JLayeredPane var51 = var48.getLayeredPane();
    int var52 = (-1);
    int var53 = 0;
    org.jhotdraw.standard.StandardDrawingView var54 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var48, var52, var53);
    var54.clearSelection();
    java.awt.Color var56 = var54.getForeground();
    var47.setBackground(var56);
    org.jhotdraw.framework.FigureEnumeration var58 = var47.selectionZOrdered();
    var58.reset();
    var36.addToSelectionAll(var58);
    java.lang.Double var61 = new java.lang.Double((-1.0d));
    java.lang.Double var62 = new java.lang.Double(100.0d);
    java.lang.Double var63 = new java.lang.Double(1.0d);
    java.awt.Point var64 = org.jhotdraw.util.Geom.polarToPoint(var61, var62, var63);
    java.awt.Point var65 = var36.getLocation(var64);
    java.lang.Double var66 = new java.lang.Double((-1.0d));
    java.lang.Double var67 = new java.lang.Double(100.0d);
    java.lang.Double var68 = new java.lang.Double(1.0d);
    java.awt.Point var69 = org.jhotdraw.util.Geom.polarToPoint(var66, var67, var68);
    var10.basicDisplayBox(var65, var69);
    org.jhotdraw.contrib.html.TextHolderContentProducer var71 = new org.jhotdraw.contrib.html.TextHolderContentProducer((org.jhotdraw.standard.TextHolder)var10);
    org.jhotdraw.standard.CreationTool var72 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var1, (org.jhotdraw.framework.Figure)var10);
    org.jhotdraw.figures.LineFigure var73 = new org.jhotdraw.figures.LineFigure();
    int var74 = (-1);
    int var75 = 10;
    var73.startPoint(var74, var75);
    java.awt.Point var77 = var73.startPoint();
    org.jhotdraw.standard.ToggleGridCommand var78 = new org.jhotdraw.standard.ToggleGridCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1, var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);

  }

  public void test138() throws Throwable {

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
    var2.repaint();
    boolean var13 = var2.isRolloverEnabled();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);

  }

  public void test139() throws Throwable {

    java.lang.Double var0 = new java.lang.Double(10.0d);
    java.lang.Double var1 = new java.lang.Double(1.0d);
    java.lang.Double var2 = new java.lang.Double(10.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);

  }

  public void test140() throws Throwable {

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
    org.jhotdraw.framework.Tool var31 = var18.getDefaultTool();
    java.util.Locale var32 = var18.getLocale();
    
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

  public void test141() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.framework.JHotDrawRuntimeException var1 = new org.jhotdraw.framework.JHotDrawRuntimeException(var0);
    java.lang.Exception var2 = var1.getNestedException();
    java.lang.String var3 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("org.jhotdraw.framework.JHotDrawRuntimeException: hi!"));

  }

  public void test142() throws Throwable {

    org.jhotdraw.figures.LineFigure var0 = new org.jhotdraw.figures.LineFigure();
    java.lang.String var1 = "";
    java.lang.Object var2 = var0.getAttribute(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test143() throws Throwable {

    int var0 = (-1);
    org.jhotdraw.util.PaletteLayout var1 = new org.jhotdraw.util.PaletteLayout(var0);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var2 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var2.start();
    boolean var4 = var2.isFocusTraversalPolicySet();
    var2.destroy();
    javax.swing.TransferHandler var6 = var2.getTransferHandler();
    java.awt.Dimension var7 = var1.preferredLayoutSize((java.awt.Container)var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test144() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    java.lang.String var15 = var14.getUIClassID();
    java.awt.Insets var16 = var14.getInsets();
    int var17 = var14.getX();
    var2.setNextFocusableComponent((java.awt.Component)var14);
    java.awt.Rectangle var19 = var14.getVisibleRect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);

  }

  public void test145() throws Throwable {

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
    java.lang.String var37 = "";
    org.jhotdraw.framework.FigureAttributeConstant var38 = new org.jhotdraw.framework.FigureAttributeConstant(var37);
    org.jhotdraw.contrib.MDI_DrawApplication var39 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var40 = var39.isDoubleBuffered();
    javax.swing.JRootPane var41 = var39.getRootPane();
    java.lang.Double var42 = new java.lang.Double((-1.0d));
    java.lang.Double var43 = new java.lang.Double(100.0d);
    java.lang.Double var44 = new java.lang.Double(1.0d);
    java.awt.Point var45 = org.jhotdraw.util.Geom.polarToPoint(var42, var43, var44);
    java.awt.Component var46 = var39.getComponentAt(var45);
    int var47 = var39.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var48 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var39);
    javax.swing.JInternalFrame var49 = var48.getSelectedFrame();
    javax.swing.plaf.DesktopPaneUI var50 = var48.getUI();
    var35.setAttribute(var38, (java.lang.Object)var48);
    org.jhotdraw.framework.DrawingView var52 = var48.getActiveDrawingView();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);

  }

  public void test146() throws Throwable {

    org.jhotdraw.figures.TextFigure var0 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Figure var1 = var0.getObservedFigure();
    org.jhotdraw.framework.Figure var2 = var0.getRepresentingFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    org.jhotdraw.standard.StandardDrawing var6 = new org.jhotdraw.standard.StandardDrawing();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    int var12 = 1;
    int var13 = 1;
    org.jhotdraw.contrib.PolygonFigure var14 = new org.jhotdraw.contrib.PolygonFigure(var12, var13);
    org.jhotdraw.framework.FigureEnumeration var15 = var14.figures();
    java.awt.Rectangle var16 = var14.displayBox();
    org.jhotdraw.framework.Figure var17 = var6.findFigure(var11, (org.jhotdraw.framework.Figure)var14);
    int var18 = 100;
    int var19 = (-1);
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    java.lang.Double var21 = new java.lang.Double(100.0d);
    java.lang.Double var22 = new java.lang.Double(1.0d);
    java.awt.Point var23 = org.jhotdraw.util.Geom.polarToPoint(var20, var21, var22);
    java.lang.Double var24 = new java.lang.Double((-1.0d));
    java.lang.Double var25 = new java.lang.Double(100.0d);
    java.lang.Double var26 = new java.lang.Double(1.0d);
    java.awt.Point var27 = org.jhotdraw.util.Geom.polarToPoint(var24, var25, var26);
    org.jhotdraw.contrib.DiamondFigure var28 = new org.jhotdraw.contrib.DiamondFigure(var23, var27);
    org.jhotdraw.framework.Figure var29 = var6.findFigureInsideWithout(var18, var19, (org.jhotdraw.framework.Figure)var28);
    java.util.Iterator var30 = var6.drawingChangeListeners();
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
    java.lang.Object var50 = var44.clone();
    org.jhotdraw.framework.FigureChangeEvent var51 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var44);
    var6.figureRequestUpdate(var51);
    var4.figureInvalidated(var51);
    var0.figureChanged(var51);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);

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
    int var17 = var6.getX();
    float var18 = var6.getAlignmentY();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == 0.5f);

  }

  public void test148() throws Throwable {

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
    org.jhotdraw.figures.ScribbleTool var18 = new org.jhotdraw.figures.ScribbleTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.framework.Tool var19 = var0.tool();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test149() throws Throwable {

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
    float var11 = var6.getAlignmentX();
    var6.repairDamage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0.5f);

  }

  public void test150() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    org.jhotdraw.framework.Tool var2 = var0.tool();
    javax.swing.TransferHandler var3 = var0.getTransferHandler();
    java.lang.String var4 = var0.getAppletInfo();
    javax.swing.JRootPane var5 = var0.getRootPane();
    java.lang.Boolean var6 = new java.lang.Boolean(false);
    var5.setRequestFocusEnabled(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);

  }

  public void test151() throws Throwable {

    int var0 = 1;
    int var1 = 100;
    int var2 = (-1);
    int var3 = 10;
    int var4 = 0;
    int var5 = 100;
    int var6 = (-1);
    int var7 = 1;
    int var8 = 1;
    java.awt.Point var9 = org.jhotdraw.util.Geom.intersect(var1, var2, var3, var4, var5, var6, var7, var8);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    org.jhotdraw.util.PaletteLayout var11 = new org.jhotdraw.util.PaletteLayout(var0, var9, var10);

  }

  public void test152() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    int var5 = (-1);
    int var6 = 0;
    org.jhotdraw.standard.StandardDrawingView var7 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var5, var6);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JMenu var10 = var8.createLookAndFeelMenu();
    java.lang.String var11 = var10.getName();
    java.lang.String var12 = "";
    int var13 = 100;
    var10.insert(var12, var13);
    int var15 = 100;
    int var16 = 0;
    int var17 = 0;
    int var18 = 10;
    var10.reshape(var15, var16, var17, var18);
    org.jhotdraw.standard.StandardDrawing var20 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var21 = new java.lang.Double((-1.0d));
    java.lang.Double var22 = new java.lang.Double(100.0d);
    java.lang.Double var23 = new java.lang.Double(1.0d);
    java.awt.Point var24 = org.jhotdraw.util.Geom.polarToPoint(var21, var22, var23);
    java.lang.Double var25 = new java.lang.Double((-1.0d));
    java.lang.Double var26 = new java.lang.Double(100.0d);
    java.lang.Double var27 = new java.lang.Double(1.0d);
    java.awt.Point var28 = org.jhotdraw.util.Geom.polarToPoint(var25, var26, var27);
    org.jhotdraw.contrib.DiamondFigure var29 = new org.jhotdraw.contrib.DiamondFigure(var24, var28);
    org.jhotdraw.framework.HandleEnumeration var30 = var29.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var31 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var33 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var31, (org.jhotdraw.framework.FigureChangeListener)var32);
    org.jhotdraw.framework.Figure var34 = var20.replace((org.jhotdraw.framework.Figure)var29, (org.jhotdraw.framework.Figure)var31);
    org.jhotdraw.framework.Handle var35 = org.jhotdraw.standard.BoxHandleKit.north(var34);
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JRootPane var38 = var36.getRootPane();
    javax.swing.JLayeredPane var39 = var36.getLayeredPane();
    int var40 = (-1);
    int var41 = 0;
    org.jhotdraw.standard.StandardDrawingView var42 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var36, var40, var41);
    var42.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var44 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var42.removeForeground((org.jhotdraw.framework.Painter)var44);
    org.jhotdraw.util.UndoableHandle var46 = new org.jhotdraw.util.UndoableHandle(var35, (org.jhotdraw.framework.DrawingView)var42);
    org.jhotdraw.util.Undoable var47 = var46.getUndoActivity();
    java.awt.Rectangle var48 = var46.displayBox();
    var10.computeVisibleRect(var48);
    java.lang.Double var50 = new java.lang.Double(10.0d);
    java.awt.Point var51 = org.jhotdraw.util.Geom.angleToPoint(var48, var50);
    org.jhotdraw.standard.ToggleGridCommand var52 = new org.jhotdraw.standard.ToggleGridCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1, var51);
    java.lang.String var53 = "";
    var52.setName(var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var52.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);

  }

  public void test153() throws Throwable {

    java.lang.Boolean var0 = new java.lang.Boolean(false);
    javax.swing.JFrame.setDefaultLookAndFeelDecorated(var0);

  }

  public void test154() throws Throwable {

    org.jhotdraw.samples.javadraw.JavaDrawApplet var0 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var0.start();
    boolean var2 = var0.isFocusTraversalPolicySet();
    var0.destroy();
    javax.swing.TransferHandler var4 = var0.getTransferHandler();
    org.jhotdraw.util.UndoManager var5 = var0.getUndoManager();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test155() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JMenu var12 = var10.createLookAndFeelMenu();
    java.lang.String var13 = var12.getName();
    java.lang.String var14 = "";
    int var15 = 100;
    var12.insert(var14, var15);
    int var17 = 100;
    int var18 = 0;
    int var19 = 0;
    int var20 = 10;
    var12.reshape(var17, var18, var19, var20);
    org.jhotdraw.standard.StandardDrawing var22 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    java.lang.Double var28 = new java.lang.Double(100.0d);
    java.lang.Double var29 = new java.lang.Double(1.0d);
    java.awt.Point var30 = org.jhotdraw.util.Geom.polarToPoint(var27, var28, var29);
    org.jhotdraw.contrib.DiamondFigure var31 = new org.jhotdraw.contrib.DiamondFigure(var26, var30);
    org.jhotdraw.framework.HandleEnumeration var32 = var31.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var34 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var35 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var33, (org.jhotdraw.framework.FigureChangeListener)var34);
    org.jhotdraw.framework.Figure var36 = var22.replace((org.jhotdraw.framework.Figure)var31, (org.jhotdraw.framework.Figure)var33);
    org.jhotdraw.framework.Handle var37 = org.jhotdraw.standard.BoxHandleKit.north(var36);
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    var44.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var46 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var44.removeForeground((org.jhotdraw.framework.Painter)var46);
    org.jhotdraw.util.UndoableHandle var48 = new org.jhotdraw.util.UndoableHandle(var37, (org.jhotdraw.framework.DrawingView)var44);
    org.jhotdraw.util.Undoable var49 = var48.getUndoActivity();
    java.awt.Rectangle var50 = var48.displayBox();
    var12.computeVisibleRect(var50);
    java.lang.Double var52 = new java.lang.Double(10.0d);
    java.awt.Point var53 = org.jhotdraw.util.Geom.angleToPoint(var50, var52);
    int var54 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var1.setPointAt(var53, var54);
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);

  }

  public void test156() throws Throwable {

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
    javax.swing.JRootPane var12 = var10.getRootPane();
    javax.swing.JLayeredPane var13 = var10.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    javax.swing.JLayeredPane var17 = var14.getLayeredPane();
    int var18 = (-1);
    int var19 = 0;
    org.jhotdraw.standard.StandardDrawingView var20 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var14, var18, var19);
    java.awt.Component var21 = var10.add((java.awt.Component)var20);
    boolean var22 = var20.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var23 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var25 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var23, (org.jhotdraw.framework.FigureChangeListener)var24);
    java.awt.Dimension var26 = var23.size();
    var20.removeFromSelection((org.jhotdraw.framework.Figure)var23);
    org.jhotdraw.contrib.MDI_DrawApplication var28 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var29 = var28.isDoubleBuffered();
    javax.swing.JRootPane var30 = var28.getRootPane();
    javax.swing.JLayeredPane var31 = var28.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var32 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var33 = var32.isDoubleBuffered();
    javax.swing.JRootPane var34 = var32.getRootPane();
    javax.swing.JLayeredPane var35 = var32.getLayeredPane();
    int var36 = (-1);
    int var37 = 0;
    org.jhotdraw.standard.StandardDrawingView var38 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var32, var36, var37);
    java.awt.Component var39 = var28.add((java.awt.Component)var38);
    var20.setEditor((org.jhotdraw.framework.DrawingEditor)var28);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    java.lang.String var48 = var47.getUIClassID();
    java.awt.Insets var49 = var47.getInsets();
    int var50 = (-1);
    var44.setPosition((java.awt.Component)var47, var50);
    boolean var52 = var44.isDisplayable();
    boolean var53 = var20.isFocusCycleRoot((java.awt.Container)var44);
    java.awt.Point var54 = var20.lastClick();
    org.jhotdraw.contrib.MDI_DrawApplication var55 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var56 = var55.isDoubleBuffered();
    javax.swing.JRootPane var57 = var55.getRootPane();
    javax.swing.JLayeredPane var58 = var55.getLayeredPane();
    int var59 = (-1);
    int var60 = 0;
    org.jhotdraw.standard.StandardDrawingView var61 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var55, var59, var60);
    var61.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var63 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var61.removeForeground((org.jhotdraw.framework.Painter)var63);
    var20.removeBackground((org.jhotdraw.framework.Painter)var63);
    var6.setDisplayUpdate((org.jhotdraw.framework.Painter)var63);
    java.awt.Point var67 = var6.lastClick();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test157() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var5 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var3, (org.jhotdraw.framework.FigureChangeListener)var4);
    java.awt.Dimension var6 = var3.size();
    org.jhotdraw.contrib.html.HTMLTextAreaTool var7 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var3);
    java.lang.Boolean var8 = new java.lang.Boolean(false);
    var7.setEnabled(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);

  }

  public void test158() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.framework.Tool var3 = var1.tool();
    javax.swing.TransferHandler var4 = var1.getTransferHandler();
    java.awt.Graphics var5 = var1.getGraphics();
    var1.disable();
    org.jhotdraw.standard.DuplicateCommand var7 = new org.jhotdraw.standard.DuplicateCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    java.awt.event.HierarchyBoundsListener[] var8 = var1.getHierarchyBoundsListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);

  }

  public void test159() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    java.awt.MenuBar var6 = var0.getMenuBar();
    java.awt.event.WindowFocusListener[] var7 = var0.getWindowFocusListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);

  }

  public void test160() throws Throwable {

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
    java.awt.Rectangle var28 = var26.displayBox();
    int var29 = 10;
    int var30 = 10;
    int var31 = (-1);
    int var32 = 10;
    org.jhotdraw.contrib.MDI_DrawApplication var33 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var34 = var33.isDoubleBuffered();
    javax.swing.JRootPane var35 = var33.getRootPane();
    javax.swing.JLayeredPane var36 = var33.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    java.awt.Component var44 = var33.add((java.awt.Component)var43);
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    var43.removeFigureSelectionListener((org.jhotdraw.framework.FigureSelectionListener)var45);
    var26.invokeStep(var29, var30, var31, var32, (org.jhotdraw.framework.DrawingView)var43);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);

  }

  public void test161() throws Throwable {

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
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.awt.Dimension var11 = var6.getMinimumSize();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == true);

  }

  public void test162() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    java.awt.Rectangle var36 = var0.displayBox();
    org.jhotdraw.contrib.GraphicalCompositeFigure var37 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var38 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var37);
    org.jhotdraw.standard.StandardDrawing var39 = new org.jhotdraw.standard.StandardDrawing();
    int var40 = var37.getLayer((org.jhotdraw.framework.Figure)var39);
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    javax.swing.JLayeredPane var48 = var45.getLayeredPane();
    int var49 = (-1);
    int var50 = 0;
    org.jhotdraw.standard.StandardDrawingView var51 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var45, var49, var50);
    java.awt.Component var52 = var41.add((java.awt.Component)var51);
    boolean var53 = var51.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var54 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var55 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var56 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var54, (org.jhotdraw.framework.FigureChangeListener)var55);
    java.awt.Dimension var57 = var54.size();
    var51.removeFromSelection((org.jhotdraw.framework.Figure)var54);
    var54.layout();
    java.lang.Object var60 = var54.clone();
    org.jhotdraw.framework.FigureChangeEvent var61 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var54);
    java.lang.Object var62 = var61.getSource();
    var39.figureInvalidated(var61);
    int var64 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var65 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var64);
    java.util.Iterator var66 = var65.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var67 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var68 = var67.isDoubleBuffered();
    boolean var69 = var67.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    int var73 = var71.getZValue();
    java.lang.Object var74 = var71.clone();
    org.jhotdraw.standard.CreationTool var75 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var67, (org.jhotdraw.framework.Figure)var71);
    int var76 = 1;
    int var77 = 0;
    org.jhotdraw.standard.StandardDrawingView var78 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var67, var76, var77);
    boolean var79 = var65.contains((java.lang.Object)var77);
    var39.orphanAll((java.util.List)var65);
    int var81 = 1;
    int var82 = 100;
    boolean var83 = var39.containsPoint(var81, var82);
    var0.addDependendFigure((org.jhotdraw.framework.Figure)var39);
    var39.release();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

  }

  public void test163() throws Throwable {

    org.jhotdraw.contrib.html.ETSLADisposalStrategy var0 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    org.jhotdraw.contrib.html.StandardDisposableResourceManager var1 = new org.jhotdraw.contrib.html.StandardDisposableResourceManager((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var0);
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.lang.Double var6 = new java.lang.Double((-1.0d));
    java.lang.Double var7 = new java.lang.Double(100.0d);
    java.lang.Double var8 = new java.lang.Double(1.0d);
    java.awt.Point var9 = org.jhotdraw.util.Geom.polarToPoint(var6, var7, var8);
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    var4.basicDisplayBox(var9, var13);
    java.lang.String var15 = "";
    java.lang.Character var16 = new java.lang.Character(' ');
    org.jhotdraw.contrib.html.DisposableResourceHolder var17 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var16);
    var4.setAttribute(var15, (java.lang.Object)var17);
    var1.unregisterResource(var17);
    org.jhotdraw.contrib.html.ETSLADisposalStrategy var20 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    java.lang.Long var21 = new java.lang.Long(100L);
    var20.stopDisposing(var21);
    var1.setStrategy((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var20);
    org.jhotdraw.contrib.html.ResourceDisposabilityStrategy var24 = var1.getStrategy();

  }

  public void test164() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    javax.swing.JLayeredPane var48 = var45.getLayeredPane();
    int var49 = (-1);
    int var50 = 0;
    org.jhotdraw.standard.StandardDrawingView var51 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var45, var49, var50);
    var51.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var53 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var51.removeForeground((org.jhotdraw.framework.Painter)var53);
    var10.removeBackground((org.jhotdraw.framework.Painter)var53);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.freezeView();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
    assertTrue(var46 == false);

  }

  public void test165() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(100.0d);
    java.lang.Double var2 = new java.lang.Double(1.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JMenu var6 = var4.createLookAndFeelMenu();
    java.lang.String var7 = var6.getName();
    java.lang.String var8 = "";
    int var9 = 100;
    var6.insert(var8, var9);
    int var11 = 100;
    int var12 = 0;
    int var13 = 0;
    int var14 = 10;
    var6.reshape(var11, var12, var13, var14);
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
    org.jhotdraw.util.Undoable var43 = var42.getUndoActivity();
    java.awt.Rectangle var44 = var42.displayBox();
    var6.computeVisibleRect(var44);
    java.lang.Double var46 = new java.lang.Double(10.0d);
    java.awt.Point var47 = org.jhotdraw.util.Geom.angleToPoint(var44, var46);
    org.jhotdraw.util.Bounds var48 = new org.jhotdraw.util.Bounds((java.awt.geom.Point2D)var3, (java.awt.geom.Point2D)var47);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var33 == false);

  }

  public void test166() throws Throwable {

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
    java.lang.Boolean var12 = new java.lang.Boolean(false);
    var2.setEnabled(var12);
    org.jhotdraw.figures.TextFigure var14 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var15 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var14);
    java.lang.String var16 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var17 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var18 = var17.isDoubleBuffered();
    javax.swing.JMenu var19 = var17.createLookAndFeelMenu();
    java.lang.Character var20 = new java.lang.Character('a');
    var19.setMnemonic(var20);
    org.jhotdraw.contrib.MDI_DrawApplication var22 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var23 = var22.isDoubleBuffered();
    javax.swing.JMenu var24 = var22.createLookAndFeelMenu();
    java.lang.String var25 = var24.getName();
    boolean var26 = var19.isMenuComponent((java.awt.Component)var24);
    java.lang.Boolean var27 = new java.lang.Boolean(true);
    var24.setBorderPainted(var27);
    var14.setAttribute(var16, (java.lang.Object)var27);
    org.jhotdraw.framework.Figure var30 = var14.getObservedFigure();
    java.lang.String var31 = "hi!";
    var14.setText(var31);
    java.awt.Rectangle var33 = var14.displayBox();
    var2.setBounds(var33);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);

  }

  public void test167() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = var2.getUIClassID();
    java.awt.Insets var4 = var2.getInsets();
    java.awt.peer.ComponentPeer var5 = var2.getPeer();
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JMenu var8 = var6.createLookAndFeelMenu();
    java.lang.Character var9 = new java.lang.Character('a');
    var8.setMnemonic(var9);
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JMenu var13 = var11.createLookAndFeelMenu();
    java.lang.String var14 = var13.getName();
    boolean var15 = var8.isMenuComponent((java.awt.Component)var13);
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    java.lang.String var19 = var18.getUIClassID();
    java.awt.Insets var20 = var18.getInsets();
    var13.setMargin(var20);
    var2.remove((java.awt.Component)var13);
    java.lang.String var23 = var13.getUIClassID();
    java.lang.Long var24 = new java.lang.Long(100L);
    var13.setMultiClickThreshhold(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23.equals("MenuUI"));

  }

  public void test168() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var42 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var40.removeForeground((org.jhotdraw.framework.Painter)var42);
    org.jhotdraw.util.UndoableHandle var44 = new org.jhotdraw.util.UndoableHandle(var33, (org.jhotdraw.framework.DrawingView)var40);
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JRootPane var47 = var45.getRootPane();
    javax.swing.JLayeredPane var48 = var45.getLayeredPane();
    int var49 = (-1);
    int var50 = 0;
    org.jhotdraw.standard.StandardDrawingView var51 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var45, var49, var50);
    org.jhotdraw.contrib.MDI_DrawApplication var52 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var53 = var52.isDoubleBuffered();
    javax.swing.JRootPane var54 = var52.getRootPane();
    javax.swing.JLayeredPane var55 = var52.getLayeredPane();
    int var56 = (-1);
    int var57 = 0;
    org.jhotdraw.standard.StandardDrawingView var58 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var52, var56, var57);
    var58.clearSelection();
    java.awt.Color var60 = var58.getForeground();
    var51.setBackground(var60);
    org.jhotdraw.framework.FigureEnumeration var62 = var51.selectionZOrdered();
    var62.reset();
    var40.addToSelectionAll(var62);
    java.lang.Double var65 = new java.lang.Double((-1.0d));
    java.lang.Double var66 = new java.lang.Double(100.0d);
    java.lang.Double var67 = new java.lang.Double(1.0d);
    java.awt.Point var68 = org.jhotdraw.util.Geom.polarToPoint(var65, var66, var67);
    java.awt.Point var69 = var40.getLocation(var68);
    var40.disable();
    var16.figureSelectionChanged((org.jhotdraw.framework.DrawingView)var40);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var16.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);

  }

  public void test169() throws Throwable {

    int var0 = 1;
    int var1 = 1;
    org.jhotdraw.contrib.PolygonFigure var2 = new org.jhotdraw.contrib.PolygonFigure(var0, var1);
    org.jhotdraw.framework.FigureEnumeration var3 = var2.figures();
    java.awt.Rectangle var4 = var2.displayBox();
    int var5 = 100;
    int var6 = 100;
    org.jhotdraw.framework.Connector var7 = var2.connectorAt(var5, var6);

  }

  public void test170() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var18 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var16, (org.jhotdraw.framework.FigureChangeListener)var17);
    java.awt.Dimension var19 = var16.size();
    var0.addToContainer((org.jhotdraw.framework.FigureChangeListener)var16);
    org.jhotdraw.figures.NullConnector var21 = new org.jhotdraw.figures.NullConnector((org.jhotdraw.framework.Figure)var16);
    int var22 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var23 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var22);
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    boolean var27 = var23.remove((java.lang.Object)var24);
    org.jhotdraw.contrib.StandardLayouter var28 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var24);
    var16.setLayouter((org.jhotdraw.contrib.Layouter)var28);
    org.jhotdraw.util.StandardStorageFormat var30 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var31 = var30.getFileDescription();
    java.lang.String var32 = "hi!";
    org.jhotdraw.standard.StandardDrawing var33 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var34 = new java.lang.Double((-1.0d));
    java.lang.Double var35 = new java.lang.Double(100.0d);
    java.lang.Double var36 = new java.lang.Double(1.0d);
    java.awt.Point var37 = org.jhotdraw.util.Geom.polarToPoint(var34, var35, var36);
    java.lang.Double var38 = new java.lang.Double((-1.0d));
    java.lang.Double var39 = new java.lang.Double(100.0d);
    java.lang.Double var40 = new java.lang.Double(1.0d);
    java.awt.Point var41 = org.jhotdraw.util.Geom.polarToPoint(var38, var39, var40);
    org.jhotdraw.contrib.DiamondFigure var42 = new org.jhotdraw.contrib.DiamondFigure(var37, var41);
    org.jhotdraw.framework.HandleEnumeration var43 = var42.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var44 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var45 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var46 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var44, (org.jhotdraw.framework.FigureChangeListener)var45);
    org.jhotdraw.framework.Figure var47 = var33.replace((org.jhotdraw.framework.Figure)var42, (org.jhotdraw.framework.Figure)var44);
    java.lang.String var48 = var30.store(var32, (org.jhotdraw.framework.Drawing)var33);
    org.jhotdraw.framework.FigureEnumeration var49 = var33.figures();
    org.jhotdraw.standard.InsertIntoDrawingVisitor var50 = new org.jhotdraw.standard.InsertIntoDrawingVisitor((org.jhotdraw.framework.Drawing)var33);
    int var51 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var52 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var51);
    org.jhotdraw.contrib.GraphicalCompositeFigure var53 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var54 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var55 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var53, (org.jhotdraw.framework.FigureChangeListener)var54);
    boolean var56 = var52.remove((java.lang.Object)var53);
    var50.visitFigure((org.jhotdraw.framework.Figure)var53);
    org.jhotdraw.contrib.Layouter var58 = var28.create((org.jhotdraw.contrib.Layoutable)var53);
    org.jhotdraw.standard.StandardDrawing var59 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var60 = new java.lang.Double((-1.0d));
    java.lang.Double var61 = new java.lang.Double(100.0d);
    java.lang.Double var62 = new java.lang.Double(1.0d);
    java.awt.Point var63 = org.jhotdraw.util.Geom.polarToPoint(var60, var61, var62);
    java.lang.Double var64 = new java.lang.Double((-1.0d));
    java.lang.Double var65 = new java.lang.Double(100.0d);
    java.lang.Double var66 = new java.lang.Double(1.0d);
    java.awt.Point var67 = org.jhotdraw.util.Geom.polarToPoint(var64, var65, var66);
    org.jhotdraw.contrib.DiamondFigure var68 = new org.jhotdraw.contrib.DiamondFigure(var63, var67);
    org.jhotdraw.framework.HandleEnumeration var69 = var68.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    org.jhotdraw.framework.Figure var73 = var59.replace((org.jhotdraw.framework.Figure)var68, (org.jhotdraw.framework.Figure)var70);
    var70.layout();
    var28.setLayoutable((org.jhotdraw.contrib.Layoutable)var70);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48.equals("hi!.draw"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);

  }

  public void test171() throws Throwable {

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
    int var17 = (-1);
    org.jhotdraw.contrib.CommandMenuItem var18 = new org.jhotdraw.contrib.CommandMenuItem((org.jhotdraw.util.Command)var16, var17);
    java.lang.String var19 = "hi!";
    java.lang.Float var20 = new java.lang.Float(1.0f);
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    java.awt.Container var23 = var21.getFocusCycleRootAncestor();
    org.jhotdraw.contrib.zoom.ZoomCommand var24 = new org.jhotdraw.contrib.zoom.ZoomCommand(var19, var20, (org.jhotdraw.framework.DrawingEditor)var21);
    float var25 = var24.getScale();
    float var26 = var24.getScale();
    float var27 = var24.getScale();
    java.lang.String var28 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var29 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var29.start();
    org.jhotdraw.standard.CopyCommand var31 = new org.jhotdraw.standard.CopyCommand(var28, (org.jhotdraw.framework.DrawingEditor)var29);
    var31.dispose();
    java.lang.String var33 = "";
    org.jhotdraw.util.CommandMenu var34 = new org.jhotdraw.util.CommandMenu(var33);
    var31.addCommandListener((org.jhotdraw.util.CommandListener)var34);
    javax.swing.InputMap var36 = var34.getInputMap();
    java.awt.Point var37 = var34.getMousePosition();
    var24.addCommandListener((org.jhotdraw.util.CommandListener)var34);
    var18.setCommand((org.jhotdraw.util.Command)var24);
    
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
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == 1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);

  }

  public void test172() throws Throwable {

    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var0 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();
    var0.resetDelay();
    boolean var2 = var0.isAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);

  }

  public void test173() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var33 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var32);
    org.jhotdraw.standard.StandardDrawing var34 = new org.jhotdraw.standard.StandardDrawing();
    int var35 = var32.getLayer((org.jhotdraw.framework.Figure)var34);
    org.jhotdraw.contrib.MDI_DrawApplication var36 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var37 = var36.isDoubleBuffered();
    javax.swing.JRootPane var38 = var36.getRootPane();
    javax.swing.JLayeredPane var39 = var36.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var40 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var41 = var40.isDoubleBuffered();
    javax.swing.JRootPane var42 = var40.getRootPane();
    javax.swing.JLayeredPane var43 = var40.getLayeredPane();
    int var44 = (-1);
    int var45 = 0;
    org.jhotdraw.standard.StandardDrawingView var46 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var40, var44, var45);
    java.awt.Component var47 = var36.add((java.awt.Component)var46);
    boolean var48 = var46.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var49 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var51 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var49, (org.jhotdraw.framework.FigureChangeListener)var50);
    java.awt.Dimension var52 = var49.size();
    var46.removeFromSelection((org.jhotdraw.framework.Figure)var49);
    var49.layout();
    java.lang.Object var55 = var49.clone();
    org.jhotdraw.framework.FigureChangeEvent var56 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var49);
    java.lang.Object var57 = var56.getSource();
    var34.figureInvalidated(var56);
    var34.release();
    var0.removeFigureChangeListener((org.jhotdraw.framework.FigureChangeListener)var34);
    java.lang.Double var61 = new java.lang.Double(1.0d);
    java.lang.Double var62 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var63 = new org.jhotdraw.standard.RelativeLocator(var61, var62);
    org.jhotdraw.figures.LineConnection var64 = new org.jhotdraw.figures.LineConnection();
    org.jhotdraw.standard.StandardDrawing var65 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var66 = new java.lang.Double((-1.0d));
    java.lang.Double var67 = new java.lang.Double(100.0d);
    java.lang.Double var68 = new java.lang.Double(1.0d);
    java.awt.Point var69 = org.jhotdraw.util.Geom.polarToPoint(var66, var67, var68);
    java.lang.Double var70 = new java.lang.Double((-1.0d));
    java.lang.Double var71 = new java.lang.Double(100.0d);
    java.lang.Double var72 = new java.lang.Double(1.0d);
    java.awt.Point var73 = org.jhotdraw.util.Geom.polarToPoint(var70, var71, var72);
    org.jhotdraw.contrib.DiamondFigure var74 = new org.jhotdraw.contrib.DiamondFigure(var69, var73);
    org.jhotdraw.framework.HandleEnumeration var75 = var74.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var76 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var77 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var78 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var76, (org.jhotdraw.framework.FigureChangeListener)var77);
    org.jhotdraw.framework.Figure var79 = var65.replace((org.jhotdraw.framework.Figure)var74, (org.jhotdraw.framework.Figure)var76);
    java.util.Iterator var80 = var65.drawingChangeListeners();
    org.jhotdraw.contrib.GraphicalCompositeFigure var81 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var82 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var83 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var81, (org.jhotdraw.framework.FigureChangeListener)var82);
    java.awt.Dimension var84 = var81.size();
    var65.addToContainer((org.jhotdraw.framework.FigureChangeListener)var81);
    org.jhotdraw.figures.NullConnector var86 = new org.jhotdraw.figures.NullConnector((org.jhotdraw.framework.Figure)var81);
    var64.connectEnd((org.jhotdraw.framework.Connector)var86);
    org.jhotdraw.standard.ConnectionHandle var88 = new org.jhotdraw.standard.ConnectionHandle((org.jhotdraw.framework.Figure)var34, (org.jhotdraw.framework.Locator)var63, (org.jhotdraw.framework.ConnectionFigure)var64);
    var64.disconnectEnd();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);

  }

  public void test174() throws Throwable {

    org.jhotdraw.contrib.html.ETSLADisposalStrategy var0 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    org.jhotdraw.contrib.html.StandardDisposableResourceManager var1 = new org.jhotdraw.contrib.html.StandardDisposableResourceManager((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var0);
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.lang.Double var6 = new java.lang.Double((-1.0d));
    java.lang.Double var7 = new java.lang.Double(100.0d);
    java.lang.Double var8 = new java.lang.Double(1.0d);
    java.awt.Point var9 = org.jhotdraw.util.Geom.polarToPoint(var6, var7, var8);
    java.lang.Double var10 = new java.lang.Double((-1.0d));
    java.lang.Double var11 = new java.lang.Double(100.0d);
    java.lang.Double var12 = new java.lang.Double(1.0d);
    java.awt.Point var13 = org.jhotdraw.util.Geom.polarToPoint(var10, var11, var12);
    var4.basicDisplayBox(var9, var13);
    java.lang.String var15 = "";
    java.lang.Character var16 = new java.lang.Character(' ');
    org.jhotdraw.contrib.html.DisposableResourceHolder var17 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var16);
    var4.setAttribute(var15, (java.lang.Object)var17);
    var1.unregisterResource(var17);
    org.jhotdraw.contrib.html.ETSLADisposalStrategy var20 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    java.lang.Long var21 = new java.lang.Long(100L);
    var20.stopDisposing(var21);
    var1.setStrategy((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var20);
    org.jhotdraw.contrib.html.ResourceDisposabilityStrategy var24 = var1.getStrategy();
    org.jhotdraw.contrib.html.ETSLADisposalStrategy var25 = new org.jhotdraw.contrib.html.ETSLADisposalStrategy();
    var1.setStrategy((org.jhotdraw.contrib.html.ResourceDisposabilityStrategy)var25);

  }

  public void test175() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.Double var3 = new java.lang.Double((-1.0d));
    java.lang.Double var4 = new java.lang.Double(100.0d);
    java.lang.Double var5 = new java.lang.Double(1.0d);
    java.awt.Point var6 = org.jhotdraw.util.Geom.polarToPoint(var3, var4, var5);
    java.awt.Component var7 = var0.getComponentAt(var6);
    int var8 = var0.getDefaultCloseOperation();
    org.jhotdraw.contrib.MDIDesktopPane var9 = new org.jhotdraw.contrib.MDIDesktopPane((org.jhotdraw.application.DrawApplication)var0);
    javax.swing.JInternalFrame var10 = var9.getSelectedFrame();
    org.jhotdraw.framework.DrawingView var11 = var9.getActiveDrawingView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);

  }

  public void test176() throws Throwable {

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
    org.jhotdraw.framework.Figure var16 = var0.getObservedFigure();
    java.lang.String var17 = "hi!";
    var0.setText(var17);
    java.awt.Rectangle var19 = var0.displayBox();
    org.jhotdraw.contrib.html.TextHolderContentProducer var20 = new org.jhotdraw.contrib.html.TextHolderContentProducer((org.jhotdraw.standard.TextHolder)var0);
    org.jhotdraw.contrib.html.StandardDisposableResourceHolder var21 = new org.jhotdraw.contrib.html.StandardDisposableResourceHolder();
    var21.resetDelay();
    org.jhotdraw.figures.TextFigure var23 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var24 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var23);
    var21.setResource((java.lang.Object)var23);
    org.jhotdraw.standard.StandardDrawing var26 = new org.jhotdraw.standard.StandardDrawing();
    int var27 = 1;
    int var28 = 1;
    org.jhotdraw.contrib.PolygonFigure var29 = new org.jhotdraw.contrib.PolygonFigure(var27, var28);
    org.jhotdraw.framework.FigureEnumeration var30 = var29.figures();
    java.awt.Rectangle var31 = var29.displayBox();
    int var32 = 1;
    int var33 = 1;
    org.jhotdraw.contrib.PolygonFigure var34 = new org.jhotdraw.contrib.PolygonFigure(var32, var33);
    org.jhotdraw.framework.FigureEnumeration var35 = var34.figures();
    java.awt.Rectangle var36 = var34.displayBox();
    org.jhotdraw.framework.Figure var37 = var26.findFigure(var31, (org.jhotdraw.framework.Figure)var34);
    int var38 = 100;
    int var39 = (-1);
    java.lang.Double var40 = new java.lang.Double((-1.0d));
    java.lang.Double var41 = new java.lang.Double(100.0d);
    java.lang.Double var42 = new java.lang.Double(1.0d);
    java.awt.Point var43 = org.jhotdraw.util.Geom.polarToPoint(var40, var41, var42);
    java.lang.Double var44 = new java.lang.Double((-1.0d));
    java.lang.Double var45 = new java.lang.Double(100.0d);
    java.lang.Double var46 = new java.lang.Double(1.0d);
    java.awt.Point var47 = org.jhotdraw.util.Geom.polarToPoint(var44, var45, var46);
    org.jhotdraw.contrib.DiamondFigure var48 = new org.jhotdraw.contrib.DiamondFigure(var43, var47);
    org.jhotdraw.framework.Figure var49 = var26.findFigureInsideWithout(var38, var39, (org.jhotdraw.framework.Figure)var48);
    java.util.Iterator var50 = var26.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var51 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var52 = var51.isDoubleBuffered();
    javax.swing.JRootPane var53 = var51.getRootPane();
    javax.swing.JLayeredPane var54 = var51.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var55 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var56 = var55.isDoubleBuffered();
    javax.swing.JRootPane var57 = var55.getRootPane();
    javax.swing.JLayeredPane var58 = var55.getLayeredPane();
    int var59 = (-1);
    int var60 = 0;
    org.jhotdraw.standard.StandardDrawingView var61 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var55, var59, var60);
    java.awt.Component var62 = var51.add((java.awt.Component)var61);
    boolean var63 = var61.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var64 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var65 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var66 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var64, (org.jhotdraw.framework.FigureChangeListener)var65);
    java.awt.Dimension var67 = var64.size();
    var61.removeFromSelection((org.jhotdraw.framework.Figure)var64);
    var64.layout();
    java.lang.Object var70 = var64.clone();
    org.jhotdraw.framework.FigureChangeEvent var71 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var64);
    var26.figureRequestUpdate(var71);
    java.awt.Rectangle var73 = var71.getInvalidatedRectangle();
    var23.figureRemoved(var71);
    var0.figureRemoved(var71);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);

  }

  public void test177() throws Throwable {

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
    org.jhotdraw.framework.Painter var20 = var10.getDisplayUpdate();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var10.unfreezeView();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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

  public void test178() throws Throwable {

    org.jhotdraw.figures.BorderDecorator var0 = new org.jhotdraw.figures.BorderDecorator();
    org.jhotdraw.standard.StandardDrawing var1 = new org.jhotdraw.standard.StandardDrawing();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    org.jhotdraw.framework.FigureEnumeration var5 = var4.figures();
    java.awt.Rectangle var6 = var4.displayBox();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    org.jhotdraw.framework.Figure var12 = var1.findFigure(var6, (org.jhotdraw.framework.Figure)var9);
    int var13 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var14 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var13);
    var1.orphanAll((java.util.List)var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    int var25 = 100;
    int var26 = (-1);
    int var27 = 10;
    int var28 = 0;
    int var29 = 100;
    int var30 = (-1);
    int var31 = 1;
    int var32 = 1;
    java.awt.Point var33 = org.jhotdraw.util.Geom.intersect(var25, var26, var27, var28, var29, var30, var31, var32);
    var1.basicDisplayBox(var24, var33);
    var0.decorate((org.jhotdraw.framework.Figure)var1);
    int var36 = 1;
    int var37 = 0;
    var0.moveBy(var36, var37);
    org.jhotdraw.framework.Locator var39 = org.jhotdraw.standard.RelativeLocator.north();
    org.jhotdraw.standard.LocatorHandle var40 = new org.jhotdraw.standard.LocatorHandle((org.jhotdraw.framework.Figure)var0, var39);
    java.awt.Rectangle var41 = var0.displayBox();
    org.jhotdraw.framework.Figure var42 = var0.peelDecoration();
    boolean var43 = var0.canConnect();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == true);

  }

  public void test179() throws Throwable {

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
    java.lang.Boolean var42 = new java.lang.Boolean(true);
    var10.setLocationByPlatform(var42);
    java.awt.Toolkit var44 = var10.getToolkit();
    
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

  public void test180() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    var3.dispose();
    java.lang.String var5 = "";
    org.jhotdraw.util.CommandMenu var6 = new org.jhotdraw.util.CommandMenu(var5);
    var3.addCommandListener((org.jhotdraw.util.CommandListener)var6);
    javax.swing.event.MenuListener[] var8 = var6.getMenuListeners();
    java.awt.Component var9 = var6.getComponent();
    javax.swing.MenuElement[] var10 = var6.getSubElements();

  }

  public void test181() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();

  }

  public void test182() throws Throwable {

    org.jhotdraw.contrib.TextAreaFigure var0 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var1 = "";
    var0.setText(var1);
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var4 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var3);
    org.jhotdraw.standard.StandardDrawing var5 = new org.jhotdraw.standard.StandardDrawing();
    int var6 = var3.getLayer((org.jhotdraw.framework.Figure)var5);
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var11 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var12 = var11.isDoubleBuffered();
    javax.swing.JRootPane var13 = var11.getRootPane();
    javax.swing.JLayeredPane var14 = var11.getLayeredPane();
    int var15 = (-1);
    int var16 = 0;
    org.jhotdraw.standard.StandardDrawingView var17 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var11, var15, var16);
    java.awt.Component var18 = var7.add((java.awt.Component)var17);
    boolean var19 = var17.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var20 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var21 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var22 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var20, (org.jhotdraw.framework.FigureChangeListener)var21);
    java.awt.Dimension var23 = var20.size();
    var17.removeFromSelection((org.jhotdraw.framework.Figure)var20);
    var20.layout();
    java.lang.Object var26 = var20.clone();
    org.jhotdraw.framework.FigureChangeEvent var27 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var20);
    java.lang.Object var28 = var27.getSource();
    var5.figureInvalidated(var27);
    var0.figureChanged(var27);
    org.jhotdraw.framework.Handle var31 = org.jhotdraw.standard.BoxHandleKit.southEast((org.jhotdraw.framework.Figure)var0);
    java.lang.String var32 = var0.getText();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32.equals(""));

  }

  public void test183() throws Throwable {

    org.jhotdraw.util.CommandChoice var0 = new org.jhotdraw.util.CommandChoice();
    javax.swing.ComboBoxEditor var1 = var0.getEditor();

  }

  public void test184() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var36 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var37 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var36);
    org.jhotdraw.contrib.GraphicalCompositeFigure var38 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var39 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var38);
    var36.addDependendFigure((org.jhotdraw.framework.Figure)var38);
    org.jhotdraw.framework.Handle var41 = org.jhotdraw.standard.BoxHandleKit.northWest((org.jhotdraw.framework.Figure)var38);
    org.jhotdraw.contrib.CompositeFigureCreationTool var42 = new org.jhotdraw.contrib.CompositeFigureCreationTool((org.jhotdraw.framework.DrawingEditor)var12, (org.jhotdraw.framework.Figure)var38);
    var42.activate();
    
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

  public void test185() throws Throwable {

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
    org.jhotdraw.contrib.CommandCheckBoxMenuItem var18 = new org.jhotdraw.contrib.CommandCheckBoxMenuItem((org.jhotdraw.util.Command)var16);
    org.jhotdraw.util.Undoable var19 = var16.getUndoActivity();
    org.jhotdraw.framework.DrawingEditor var20 = var16.getDrawingEditor();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == null);

  }

  public void test186() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.contrib.JPanelDesktop var2 = new org.jhotdraw.contrib.JPanelDesktop((org.jhotdraw.application.DrawApplication)var0);
    boolean var3 = var0.isForegroundSet();
    boolean var4 = var0.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == true);

  }

  public void test187() throws Throwable {

    org.jhotdraw.contrib.PolygonFigure var0 = new org.jhotdraw.contrib.PolygonFigure();
    org.jhotdraw.framework.Locator var1 = org.jhotdraw.standard.RelativeLocator.center();
    int var2 = 0;
    org.jhotdraw.contrib.PolygonHandle var3 = new org.jhotdraw.contrib.PolygonHandle(var0, var1, var2);
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    org.jhotdraw.util.UndoableAdapter var12 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var10);
    org.jhotdraw.util.UndoableHandle var13 = new org.jhotdraw.util.UndoableHandle((org.jhotdraw.framework.Handle)var3, (org.jhotdraw.framework.DrawingView)var10);
    org.jhotdraw.contrib.MDI_DrawApplication var14 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var15 = var14.isDoubleBuffered();
    javax.swing.JRootPane var16 = var14.getRootPane();
    javax.swing.JLayeredPane var17 = var14.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var18 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var19 = var18.isDoubleBuffered();
    javax.swing.JRootPane var20 = var18.getRootPane();
    javax.swing.JLayeredPane var21 = var18.getLayeredPane();
    int var22 = (-1);
    int var23 = 0;
    org.jhotdraw.standard.StandardDrawingView var24 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var18, var22, var23);
    java.awt.Component var25 = var14.add((java.awt.Component)var24);
    org.jhotdraw.contrib.GraphicalCompositeFigure var26 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var27 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var28 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var26, (org.jhotdraw.framework.FigureChangeListener)var27);
    java.awt.Dimension var29 = var26.size();
    var14.setPreferredSize(var29);
    org.jhotdraw.figures.PolyLineFigure var31 = new org.jhotdraw.figures.PolyLineFigure();
    org.jhotdraw.contrib.NestedCreationTool var32 = new org.jhotdraw.contrib.NestedCreationTool((org.jhotdraw.framework.DrawingEditor)var14, (org.jhotdraw.framework.Figure)var31);
    var10.setEditor((org.jhotdraw.framework.DrawingEditor)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);

  }

  public void test188() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var42 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var40.removeForeground((org.jhotdraw.framework.Painter)var42);
    org.jhotdraw.util.UndoableHandle var44 = new org.jhotdraw.util.UndoableHandle(var33, (org.jhotdraw.framework.DrawingView)var40);
    org.jhotdraw.util.Undoable var45 = var44.getUndoActivity();
    java.awt.Point var46 = var44.locate();
    org.jhotdraw.contrib.MDI_DrawApplication var47 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var48 = var47.isDoubleBuffered();
    javax.swing.JRootPane var49 = var47.getRootPane();
    javax.swing.JLayeredPane var50 = var47.getLayeredPane();
    int var51 = (-1);
    int var52 = 0;
    org.jhotdraw.standard.StandardDrawingView var53 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var47, var51, var52);
    var53.clearSelection();
    org.jhotdraw.util.UndoableAdapter var55 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var53);
    org.jhotdraw.contrib.html.DisposableResourceHolder var56 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var55);
    boolean var57 = var55.undo();
    java.lang.Boolean var58 = new java.lang.Boolean(true);
    var55.setUndoable(var58);
    var44.setUndoActivity((org.jhotdraw.util.Undoable)var55);
    var16.setUndoActivity((org.jhotdraw.util.Undoable)var55);
    org.jhotdraw.framework.DrawingView var62 = var55.getDrawingView();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.FigureEnumeration var63 = var55.getAffectedFiguresReversed();
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test189() throws Throwable {

    int var0 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test190() throws Throwable {

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
    int var27 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var28 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var27);
    java.util.Iterator var29 = var28.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var30 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var31 = var30.isDoubleBuffered();
    boolean var32 = var30.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var34 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var35 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var33, (org.jhotdraw.framework.FigureChangeListener)var34);
    int var36 = var34.getZValue();
    java.lang.Object var37 = var34.clone();
    org.jhotdraw.standard.CreationTool var38 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var30, (org.jhotdraw.framework.Figure)var34);
    int var39 = 1;
    int var40 = 0;
    org.jhotdraw.standard.StandardDrawingView var41 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var30, var39, var40);
    boolean var42 = var28.contains((java.lang.Object)var40);
    var2.orphanAll((java.util.List)var28);
    int var44 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var45 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var44);
    boolean var46 = var28.removeAll((java.util.Collection)var45);
    java.lang.Object[] var47 = var45.toArray();
    org.jhotdraw.contrib.GraphicalCompositeFigure var48 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var49 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var48);
    org.jhotdraw.standard.StandardDrawing var50 = new org.jhotdraw.standard.StandardDrawing();
    int var51 = var48.getLayer((org.jhotdraw.framework.Figure)var50);
    org.jhotdraw.contrib.MDI_DrawApplication var52 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var53 = var52.isDoubleBuffered();
    javax.swing.JRootPane var54 = var52.getRootPane();
    javax.swing.JLayeredPane var55 = var52.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var56 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var57 = var56.isDoubleBuffered();
    javax.swing.JRootPane var58 = var56.getRootPane();
    javax.swing.JLayeredPane var59 = var56.getLayeredPane();
    int var60 = (-1);
    int var61 = 0;
    org.jhotdraw.standard.StandardDrawingView var62 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var56, var60, var61);
    java.awt.Component var63 = var52.add((java.awt.Component)var62);
    boolean var64 = var62.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var65 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var66 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var67 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var65, (org.jhotdraw.framework.FigureChangeListener)var66);
    java.awt.Dimension var68 = var65.size();
    var62.removeFromSelection((org.jhotdraw.framework.Figure)var65);
    var65.layout();
    java.lang.Object var71 = var65.clone();
    org.jhotdraw.framework.FigureChangeEvent var72 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var65);
    java.lang.Object var73 = var72.getSource();
    var50.figureInvalidated(var72);
    org.jhotdraw.contrib.ChopPolygonConnector var75 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var50);
    int var76 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var77 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var76);
    org.jhotdraw.contrib.GraphicalCompositeFigure var78 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var79 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var80 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var78, (org.jhotdraw.framework.FigureChangeListener)var79);
    boolean var81 = var77.remove((java.lang.Object)var78);
    var50.orphanAll((java.util.List)var77);
    boolean var83 = var45.removeAll((java.util.Collection)var77);
    org.jhotdraw.standard.FigureEnumerator var84 = new org.jhotdraw.standard.FigureEnumerator((java.util.Collection)var77);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var51 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var83 == false);

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var8 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var9 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var8);
    int var10 = 1;
    int var11 = (-1);
    boolean var12 = var8.containsPoint(var10, var11);
    org.jhotdraw.contrib.html.HTMLTextAreaTool var13 = new org.jhotdraw.contrib.html.HTMLTextAreaTool((org.jhotdraw.framework.DrawingEditor)var0, (org.jhotdraw.framework.Figure)var8);
    java.awt.image.BufferStrategy var14 = var0.getBufferStrategy();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == null);

  }

  public void test192() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    java.lang.String var3 = "";
    var0.setApplicationName(var3);
    boolean var5 = var0.isActive();
    java.awt.MenuBar var6 = var0.getMenuBar();
    org.jhotdraw.contrib.MDI_DrawApplication var7 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var8 = var7.isDoubleBuffered();
    javax.swing.JRootPane var9 = var7.getRootPane();
    javax.swing.JLayeredPane var10 = var7.getLayeredPane();
    int var11 = (-1);
    int var12 = 0;
    org.jhotdraw.standard.StandardDrawingView var13 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var11, var12);
    int var14 = 0;
    int var15 = 0;
    org.jhotdraw.standard.StandardDrawingView var16 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var7, var14, var15);
    java.awt.Color var17 = var7.getBackground();
    var0.setForeground(var17);
    org.jhotdraw.contrib.GraphicalCompositeFigure var19 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var20 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var21 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var19, (org.jhotdraw.framework.FigureChangeListener)var20);
    java.awt.Dimension var22 = var19.size();
    var0.setSize(var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == false);

  }

  public void test193() throws Throwable {

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
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var17 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var18 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var16, (org.jhotdraw.framework.FigureChangeListener)var17);
    java.awt.Dimension var19 = var16.size();
    var0.addToContainer((org.jhotdraw.framework.FigureChangeListener)var16);
    org.jhotdraw.figures.NullConnector var21 = new org.jhotdraw.figures.NullConnector((org.jhotdraw.framework.Figure)var16);
    int var22 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var23 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var22);
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    boolean var27 = var23.remove((java.lang.Object)var24);
    org.jhotdraw.contrib.StandardLayouter var28 = new org.jhotdraw.contrib.StandardLayouter((org.jhotdraw.contrib.Layoutable)var24);
    var16.setLayouter((org.jhotdraw.contrib.Layouter)var28);
    org.jhotdraw.standard.StandardDrawing var30 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var31 = new java.lang.Double((-1.0d));
    java.lang.Double var32 = new java.lang.Double(100.0d);
    java.lang.Double var33 = new java.lang.Double(1.0d);
    java.awt.Point var34 = org.jhotdraw.util.Geom.polarToPoint(var31, var32, var33);
    java.lang.Double var35 = new java.lang.Double((-1.0d));
    java.lang.Double var36 = new java.lang.Double(100.0d);
    java.lang.Double var37 = new java.lang.Double(1.0d);
    java.awt.Point var38 = org.jhotdraw.util.Geom.polarToPoint(var35, var36, var37);
    org.jhotdraw.contrib.DiamondFigure var39 = new org.jhotdraw.contrib.DiamondFigure(var34, var38);
    org.jhotdraw.framework.HandleEnumeration var40 = var39.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var41 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var42 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var43 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var41, (org.jhotdraw.framework.FigureChangeListener)var42);
    org.jhotdraw.framework.Figure var44 = var30.replace((org.jhotdraw.framework.Figure)var39, (org.jhotdraw.framework.Figure)var41);
    java.util.Iterator var45 = var30.drawingChangeListeners();
    org.jhotdraw.contrib.GraphicalCompositeFigure var46 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var48 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var46, (org.jhotdraw.framework.FigureChangeListener)var47);
    java.awt.Dimension var49 = var46.size();
    var30.addToContainer((org.jhotdraw.framework.FigureChangeListener)var46);
    org.jhotdraw.figures.NullConnector var51 = new org.jhotdraw.figures.NullConnector((org.jhotdraw.framework.Figure)var46);
    org.jhotdraw.framework.FigureChangeListener var52 = var46.listener();
    var28.setLayoutable((org.jhotdraw.contrib.Layoutable)var46);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == null);

  }

  public void test194() throws Throwable {

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
    var2.release();
    org.jhotdraw.figures.ArrowTip var28 = new org.jhotdraw.figures.ArrowTip();
    int var29 = 1;
    int var30 = 1;
    int var31 = 10;
    int var32 = 0;
    java.awt.Polygon var33 = var28.outline(var29, var30, var31, var32);
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    int var38 = (-1);
    int var39 = 0;
    org.jhotdraw.standard.StandardDrawingView var40 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var34, var38, var39);
    var40.clearSelection();
    java.awt.Color var42 = var40.getForeground();
    var28.setFillColor(var42);
    java.awt.Rectangle var44 = var28.displayBox();
    var2.init(var44);
    org.jhotdraw.figures.TextFigure var46 = new org.jhotdraw.figures.TextFigure();
    org.jhotdraw.framework.Handle var47 = org.jhotdraw.standard.BoxHandleKit.northEast((org.jhotdraw.framework.Figure)var46);
    java.lang.String var48 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var49 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var50 = var49.isDoubleBuffered();
    javax.swing.JMenu var51 = var49.createLookAndFeelMenu();
    java.lang.Character var52 = new java.lang.Character('a');
    var51.setMnemonic(var52);
    org.jhotdraw.contrib.MDI_DrawApplication var54 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var55 = var54.isDoubleBuffered();
    javax.swing.JMenu var56 = var54.createLookAndFeelMenu();
    java.lang.String var57 = var56.getName();
    boolean var58 = var51.isMenuComponent((java.awt.Component)var56);
    java.lang.Boolean var59 = new java.lang.Boolean(true);
    var56.setBorderPainted(var59);
    var46.setAttribute(var48, (java.lang.Object)var59);
    org.jhotdraw.framework.Figure var62 = var46.getObservedFigure();
    java.lang.String var63 = "hi!";
    var46.setText(var63);
    java.awt.Rectangle var65 = var46.displayBox();
    org.jhotdraw.contrib.PolygonFigure var66 = new org.jhotdraw.contrib.PolygonFigure();
    org.jhotdraw.framework.Locator var67 = org.jhotdraw.standard.RelativeLocator.center();
    int var68 = 0;
    org.jhotdraw.contrib.PolygonHandle var69 = new org.jhotdraw.contrib.PolygonHandle(var66, var67, var68);
    int var70 = var66.pointCount();
    org.jhotdraw.framework.Figure var71 = var2.findFigure(var65, (org.jhotdraw.framework.Figure)var66);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == null);

  }

  public void test195() throws Throwable {

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
    java.awt.event.ComponentListener[] var44 = var39.getComponentListeners();
    java.beans.VetoableChangeListener[] var45 = var39.getVetoableChangeListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var41 == false);

  }

  public void test196() throws Throwable {

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
    java.lang.Object var19 = var10.getTreeLock();
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
    org.jhotdraw.util.StandardStorageFormat var44 = new org.jhotdraw.util.StandardStorageFormat();
    java.lang.String var45 = var44.getFileDescription();
    java.lang.String var46 = "hi!";
    org.jhotdraw.standard.StandardDrawing var47 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var48 = new java.lang.Double((-1.0d));
    java.lang.Double var49 = new java.lang.Double(100.0d);
    java.lang.Double var50 = new java.lang.Double(1.0d);
    java.awt.Point var51 = org.jhotdraw.util.Geom.polarToPoint(var48, var49, var50);
    java.lang.Double var52 = new java.lang.Double((-1.0d));
    java.lang.Double var53 = new java.lang.Double(100.0d);
    java.lang.Double var54 = new java.lang.Double(1.0d);
    java.awt.Point var55 = org.jhotdraw.util.Geom.polarToPoint(var52, var53, var54);
    org.jhotdraw.contrib.DiamondFigure var56 = new org.jhotdraw.contrib.DiamondFigure(var51, var55);
    org.jhotdraw.framework.HandleEnumeration var57 = var56.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var58 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var59 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var60 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var58, (org.jhotdraw.framework.FigureChangeListener)var59);
    org.jhotdraw.framework.Figure var61 = var47.replace((org.jhotdraw.framework.Figure)var56, (org.jhotdraw.framework.Figure)var58);
    java.lang.String var62 = var44.store(var46, (org.jhotdraw.framework.Drawing)var47);
    org.jhotdraw.framework.FigureEnumeration var63 = var47.figures();
    var37.orphanAll(var63);
    org.jhotdraw.framework.FigureEnumeration var65 = var37.figures();
    int var66 = 10;
    int var67 = 10;
    java.lang.Boolean var68 = new java.lang.Boolean(false);
    org.jhotdraw.framework.FigureEnumeration var69 = var10.insertFigures(var65, var66, var67, var68);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var70 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var70.start();
    java.awt.Color var72 = var70.getForeground();
    var70.endAnimation();
    java.awt.Dimension var74 = var70.getMaximumSize();
    var10.setMinimumSize(var74);
    java.awt.Dimension var76 = var10.getSize();
    java.lang.String var77 = "";
    var10.setToolTipText(var77);
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var45.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62.equals("hi!.draw"));

  }

  public void test197() throws Throwable {

    org.jhotdraw.contrib.TextAreaFigure var0 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.Boolean var1 = new java.lang.Boolean(false);
    var0.setReadOnly(var1);
    java.lang.String var3 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var4 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var5 = var4.isDoubleBuffered();
    javax.swing.JRootPane var6 = var4.getRootPane();
    javax.swing.JLayeredPane var7 = var4.getLayeredPane();
    int var8 = (-1);
    int var9 = 0;
    org.jhotdraw.standard.StandardDrawingView var10 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var4, var8, var9);
    var10.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var12 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var10.removeForeground((org.jhotdraw.framework.Painter)var12);
    boolean var14 = var10.isEnabled();
    float var15 = var10.getAlignmentX();
    var0.setAttribute(var3, (java.lang.Object)var10);
    java.awt.Color var17 = var0.getFrameColor();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0.5f);

  }

  public void test198() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    javax.swing.Icon var3 = var2.getRolloverIcon();
    javax.swing.JPopupMenu var4 = var2.getComponentPopupMenu();
    boolean var5 = var2.isBorderPainted();
    javax.swing.event.AncestorListener[] var6 = var2.getAncestorListeners();
    boolean var7 = var2.isPreferredSizeSet();
    int var8 = (-1);
    var2.setDisplayedMnemonicIndex(var8);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);

  }

  public void test199() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    org.jhotdraw.framework.DrawingView var3 = org.jhotdraw.standard.NullDrawingView.getManagedDrawingView((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.standard.StandardDrawing var4 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var5 = new java.lang.Double((-1.0d));
    java.lang.Double var6 = new java.lang.Double(100.0d);
    java.lang.Double var7 = new java.lang.Double(1.0d);
    java.awt.Point var8 = org.jhotdraw.util.Geom.polarToPoint(var5, var6, var7);
    java.lang.Double var9 = new java.lang.Double((-1.0d));
    java.lang.Double var10 = new java.lang.Double(100.0d);
    java.lang.Double var11 = new java.lang.Double(1.0d);
    java.awt.Point var12 = org.jhotdraw.util.Geom.polarToPoint(var9, var10, var11);
    org.jhotdraw.contrib.DiamondFigure var13 = new org.jhotdraw.contrib.DiamondFigure(var8, var12);
    org.jhotdraw.framework.HandleEnumeration var14 = var13.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var15 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var16 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var17 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var15, (org.jhotdraw.framework.FigureChangeListener)var16);
    org.jhotdraw.framework.Figure var18 = var4.replace((org.jhotdraw.framework.Figure)var13, (org.jhotdraw.framework.Figure)var15);
    org.jhotdraw.framework.Handle var19 = org.jhotdraw.standard.BoxHandleKit.north(var18);
    org.jhotdraw.contrib.MDI_DrawApplication var20 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var21 = var20.isDoubleBuffered();
    javax.swing.JRootPane var22 = var20.getRootPane();
    javax.swing.JLayeredPane var23 = var20.getLayeredPane();
    int var24 = (-1);
    int var25 = 0;
    org.jhotdraw.standard.StandardDrawingView var26 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var20, var24, var25);
    var26.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var28 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var26.removeForeground((org.jhotdraw.framework.Painter)var28);
    org.jhotdraw.util.UndoableHandle var30 = new org.jhotdraw.util.UndoableHandle(var19, (org.jhotdraw.framework.DrawingView)var26);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    var44.clearSelection();
    java.awt.Color var46 = var44.getForeground();
    var37.setBackground(var46);
    org.jhotdraw.framework.FigureEnumeration var48 = var37.selectionZOrdered();
    var48.reset();
    var26.addToSelectionAll(var48);
    java.lang.Double var51 = new java.lang.Double((-1.0d));
    java.lang.Double var52 = new java.lang.Double(100.0d);
    java.lang.Double var53 = new java.lang.Double(1.0d);
    java.awt.Point var54 = org.jhotdraw.util.Geom.polarToPoint(var51, var52, var53);
    java.awt.Point var55 = var26.getLocation(var54);
    var26.disable();
    var0.setLocationRelativeTo((java.awt.Component)var26);
    org.jhotdraw.contrib.MDI_DrawApplication var58 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var59 = var58.isDoubleBuffered();
    javax.swing.JRootPane var60 = var58.getRootPane();
    javax.swing.JLayeredPane var61 = var58.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var62 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var63 = var62.isDoubleBuffered();
    javax.swing.JRootPane var64 = var62.getRootPane();
    javax.swing.JLayeredPane var65 = var62.getLayeredPane();
    int var66 = (-1);
    int var67 = 0;
    org.jhotdraw.standard.StandardDrawingView var68 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var62, var66, var67);
    java.awt.Component var69 = var58.add((java.awt.Component)var68);
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    java.awt.Dimension var73 = var70.size();
    var58.setPreferredSize(var73);
    org.jhotdraw.samples.javadraw.URLTool var75 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var58);
    java.awt.image.BufferStrategy var76 = var58.getBufferStrategy();
    org.jhotdraw.contrib.CustomSelectionTool var77 = new org.jhotdraw.contrib.CustomSelectionTool((org.jhotdraw.framework.DrawingEditor)var58);
    java.lang.String var78 = "";
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setTool((org.jhotdraw.framework.Tool)var77, var78);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var76 == null);

  }

  public void test200() throws Throwable {

    int var0 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var1 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var0);
    org.jhotdraw.contrib.GraphicalCompositeFigure var2 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var3 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var4 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var2, (org.jhotdraw.framework.FigureChangeListener)var3);
    boolean var5 = var1.remove((java.lang.Object)var2);
    org.jhotdraw.contrib.GraphicalCompositeFigure var6 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var7 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var8 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var6, (org.jhotdraw.framework.FigureChangeListener)var7);
    int var9 = var7.getZValue();
    java.lang.Object var10 = var7.clone();
    org.jhotdraw.framework.FigureChangeListener var11 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var2, (org.jhotdraw.framework.FigureChangeListener)var7);
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    java.lang.Double var13 = new java.lang.Double(100.0d);
    java.lang.Double var14 = new java.lang.Double(1.0d);
    java.awt.Point var15 = org.jhotdraw.util.Geom.polarToPoint(var12, var13, var14);
    int var16 = 100;
    int var17 = (-1);
    int var18 = 10;
    int var19 = 0;
    int var20 = 100;
    int var21 = (-1);
    int var22 = 1;
    int var23 = 1;
    java.awt.Point var24 = org.jhotdraw.util.Geom.intersect(var16, var17, var18, var19, var20, var21, var22, var23);
    var2.displayBox(var15, var24);
    int var26 = var2.figureCount();
    int var27 = 10;
    int var28 = (-1);
    org.jhotdraw.framework.Figure var29 = var2.findFigure(var27, var28);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);

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
    var13.update();
    java.lang.Double var20 = new java.lang.Double(1.0d);
    java.lang.Double var21 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var22 = new org.jhotdraw.standard.RelativeLocator(var20, var21);
    org.jhotdraw.figures.FontSizeHandle var23 = new org.jhotdraw.figures.FontSizeHandle((org.jhotdraw.framework.Figure)var13, (org.jhotdraw.framework.Locator)var22);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);

  }

  public void test202() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JRootPane var14 = var12.getRootPane();
    javax.swing.JLayeredPane var15 = var12.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var16 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var17 = var16.isDoubleBuffered();
    javax.swing.JRootPane var18 = var16.getRootPane();
    javax.swing.JLayeredPane var19 = var16.getLayeredPane();
    int var20 = (-1);
    int var21 = 0;
    org.jhotdraw.standard.StandardDrawingView var22 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var16, var20, var21);
    java.awt.Component var23 = var12.add((java.awt.Component)var22);
    org.jhotdraw.contrib.GraphicalCompositeFigure var24 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var25 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var26 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var24, (org.jhotdraw.framework.FigureChangeListener)var25);
    java.awt.Dimension var27 = var24.size();
    var12.setPreferredSize(var27);
    var6.setEditor((org.jhotdraw.framework.DrawingEditor)var12);
    java.awt.Image var30 = var12.getIconImage();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == null);

  }

  public void test203() throws Throwable {

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
    org.jhotdraw.standard.InsertIntoDrawingVisitor var20 = new org.jhotdraw.standard.InsertIntoDrawingVisitor((org.jhotdraw.framework.Drawing)var3);
    org.jhotdraw.contrib.GraphicalCompositeFigure var21 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var22 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var23 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var21, (org.jhotdraw.framework.FigureChangeListener)var22);
    var20.visitFigureChangeListener(var23);
    org.jhotdraw.framework.FigureEnumeration var25 = var20.getInsertedFigures();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1.equals("Internal Format (draw)"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18.equals("hi!.draw"));

  }

  public void test204() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    org.jhotdraw.util.CommandButton var4 = new org.jhotdraw.util.CommandButton((org.jhotdraw.util.Command)var3);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var3.execute();
      fail("Expected exception of type org.jhotdraw.framework.JHotDrawRuntimeException");
    } catch (org.jhotdraw.framework.JHotDrawRuntimeException e) {
      // Expected exception.
    }

  }

  public void test205() throws Throwable {

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
    int var13 = 100;
    int var14 = 10;
    int var15 = var11.findSegment(var13, var14);
    org.jhotdraw.figures.ArrowTip var16 = new org.jhotdraw.figures.ArrowTip();
    int var17 = 1;
    int var18 = 1;
    int var19 = 10;
    int var20 = 0;
    java.awt.Polygon var21 = var16.outline(var17, var18, var19, var20);
    org.jhotdraw.standard.StandardDrawing var22 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    java.lang.Double var28 = new java.lang.Double(100.0d);
    java.lang.Double var29 = new java.lang.Double(1.0d);
    java.awt.Point var30 = org.jhotdraw.util.Geom.polarToPoint(var27, var28, var29);
    org.jhotdraw.contrib.DiamondFigure var31 = new org.jhotdraw.contrib.DiamondFigure(var26, var30);
    org.jhotdraw.framework.HandleEnumeration var32 = var31.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var34 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var35 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var33, (org.jhotdraw.framework.FigureChangeListener)var34);
    org.jhotdraw.framework.Figure var36 = var22.replace((org.jhotdraw.framework.Figure)var31, (org.jhotdraw.framework.Figure)var33);
    org.jhotdraw.framework.Handle var37 = org.jhotdraw.standard.BoxHandleKit.north(var36);
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    var44.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var46 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var44.removeForeground((org.jhotdraw.framework.Painter)var46);
    org.jhotdraw.util.UndoableHandle var48 = new org.jhotdraw.util.UndoableHandle(var37, (org.jhotdraw.framework.DrawingView)var44);
    org.jhotdraw.contrib.MDI_DrawApplication var49 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var50 = var49.isDoubleBuffered();
    javax.swing.JRootPane var51 = var49.getRootPane();
    javax.swing.JLayeredPane var52 = var49.getLayeredPane();
    int var53 = (-1);
    int var54 = 0;
    org.jhotdraw.standard.StandardDrawingView var55 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var49, var53, var54);
    org.jhotdraw.contrib.MDI_DrawApplication var56 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var57 = var56.isDoubleBuffered();
    javax.swing.JRootPane var58 = var56.getRootPane();
    javax.swing.JLayeredPane var59 = var56.getLayeredPane();
    int var60 = (-1);
    int var61 = 0;
    org.jhotdraw.standard.StandardDrawingView var62 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var56, var60, var61);
    var62.clearSelection();
    java.awt.Color var64 = var62.getForeground();
    var55.setBackground(var64);
    org.jhotdraw.framework.FigureEnumeration var66 = var55.selectionZOrdered();
    var66.reset();
    var44.addToSelectionAll(var66);
    java.lang.Double var69 = new java.lang.Double((-1.0d));
    java.lang.Double var70 = new java.lang.Double(100.0d);
    java.lang.Double var71 = new java.lang.Double(1.0d);
    java.awt.Point var72 = org.jhotdraw.util.Geom.polarToPoint(var69, var70, var71);
    java.awt.Point var73 = var44.getLocation(var72);
    java.awt.Point var74 = org.jhotdraw.contrib.PolygonFigure.chop(var21, var72);
    java.lang.Double var75 = new java.lang.Double((-1.0d));
    java.lang.Double var76 = new java.lang.Double(100.0d);
    java.lang.Double var77 = new java.lang.Double(1.0d);
    java.awt.Point var78 = org.jhotdraw.util.Geom.polarToPoint(var75, var76, var77);
    java.awt.Point var79 = org.jhotdraw.contrib.PolygonFigure.chop(var21, var78);
    int var80 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var11.setPointAt(var78, var80);
      fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var57 == false);

  }

  public void test206() throws Throwable {

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
    org.jhotdraw.figures.ScribbleTool var18 = new org.jhotdraw.figures.ScribbleTool((org.jhotdraw.framework.DrawingEditor)var0);
    var18.deactivate();
    org.jhotdraw.framework.DrawingEditor var20 = var18.editor();
    var18.activate();
    var18.deactivate();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

  public void test207() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    int var4 = (-1);
    int var5 = 10;
    org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter var6 = new org.jhotdraw.contrib.html.EllipseFigureGeometricAdapter();
    java.awt.Insets var7 = var6.connectionInsets();
    org.jhotdraw.framework.HandleEnumeration var8 = var6.handles();
    org.jhotdraw.contrib.MDI_DrawApplication var9 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var10 = var9.isDoubleBuffered();
    javax.swing.JMenu var11 = var9.createLookAndFeelMenu();
    java.lang.String var12 = var11.getName();
    java.lang.String var13 = "";
    int var14 = 100;
    var11.insert(var13, var14);
    int var16 = 100;
    int var17 = 0;
    int var18 = 0;
    int var19 = 10;
    var11.reshape(var16, var17, var18, var19);
    org.jhotdraw.standard.StandardDrawing var21 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var22 = new java.lang.Double((-1.0d));
    java.lang.Double var23 = new java.lang.Double(100.0d);
    java.lang.Double var24 = new java.lang.Double(1.0d);
    java.awt.Point var25 = org.jhotdraw.util.Geom.polarToPoint(var22, var23, var24);
    java.lang.Double var26 = new java.lang.Double((-1.0d));
    java.lang.Double var27 = new java.lang.Double(100.0d);
    java.lang.Double var28 = new java.lang.Double(1.0d);
    java.awt.Point var29 = org.jhotdraw.util.Geom.polarToPoint(var26, var27, var28);
    org.jhotdraw.contrib.DiamondFigure var30 = new org.jhotdraw.contrib.DiamondFigure(var25, var29);
    org.jhotdraw.framework.HandleEnumeration var31 = var30.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var32 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var33 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var34 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var32, (org.jhotdraw.framework.FigureChangeListener)var33);
    org.jhotdraw.framework.Figure var35 = var21.replace((org.jhotdraw.framework.Figure)var30, (org.jhotdraw.framework.Figure)var32);
    org.jhotdraw.framework.Handle var36 = org.jhotdraw.standard.BoxHandleKit.north(var35);
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    int var41 = (-1);
    int var42 = 0;
    org.jhotdraw.standard.StandardDrawingView var43 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var37, var41, var42);
    var43.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var45 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var43.removeForeground((org.jhotdraw.framework.Painter)var45);
    org.jhotdraw.util.UndoableHandle var47 = new org.jhotdraw.util.UndoableHandle(var36, (org.jhotdraw.framework.DrawingView)var43);
    org.jhotdraw.util.Undoable var48 = var47.getUndoActivity();
    java.awt.Rectangle var49 = var47.displayBox();
    var11.computeVisibleRect(var49);
    java.lang.Double var51 = new java.lang.Double(10.0d);
    java.awt.Point var52 = org.jhotdraw.util.Geom.angleToPoint(var49, var51);
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    java.lang.Double var54 = new java.lang.Double(100.0d);
    java.lang.Double var55 = new java.lang.Double(1.0d);
    java.awt.Point var56 = org.jhotdraw.util.Geom.polarToPoint(var53, var54, var55);
    var6.basicDisplayBox(var52, var56);
    org.jhotdraw.framework.Figure var58 = var2.findFigureWithout(var4, var5, (org.jhotdraw.framework.Figure)var6);
    org.jhotdraw.contrib.MDI_DrawApplication var59 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var60 = var59.isDoubleBuffered();
    javax.swing.JRootPane var61 = var59.getRootPane();
    javax.swing.JLayeredPane var62 = var59.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var63 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var64 = var63.isDoubleBuffered();
    javax.swing.JRootPane var65 = var63.getRootPane();
    java.lang.String var66 = var65.getUIClassID();
    java.awt.Insets var67 = var65.getInsets();
    int var68 = (-1);
    var62.setPosition((java.awt.Component)var65, var68);
    org.jhotdraw.contrib.MDI_DrawApplication var70 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var71 = var70.isDoubleBuffered();
    int var72 = 0;
    var62.setLayer((java.awt.Component)var70, var72);
    java.awt.event.HierarchyListener[] var74 = var70.getHierarchyListeners();
    java.lang.String[] var75 = var70.getRequiredVersions();
    java.awt.Window[] var76 = var70.getOwnedWindows();
    int var77 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var78 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var77);
    org.jhotdraw.contrib.GraphicalCompositeFigure var79 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var80 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var81 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var79, (org.jhotdraw.framework.FigureChangeListener)var80);
    boolean var82 = var78.remove((java.lang.Object)var79);
    org.jhotdraw.contrib.MDI_DrawApplication var83 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var84 = var83.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var85 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var83);
    boolean var86 = var83.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var87 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var83);
    var87.deactivate();
    int var89 = var78.indexOf((java.lang.Object)var87);
    var70.setIconImages((java.util.List)var78);
    var2.orphanAll((java.util.List)var78);
    org.jhotdraw.standard.FigureEnumerator var92 = new org.jhotdraw.standard.FigureEnumerator((java.util.Collection)var78);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.framework.Figure var93 = var92.nextFigure();
      fail("Expected exception of type java.util.NoSuchElementException");
    } catch (java.util.NoSuchElementException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var12 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var58 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var66.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var84 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var89 == (-1));

  }

  public void test208() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var1 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var0);
    org.jhotdraw.standard.StandardDrawing var2 = new org.jhotdraw.standard.StandardDrawing();
    int var3 = var0.getLayer((org.jhotdraw.framework.Figure)var2);
    org.jhotdraw.contrib.TextAreaFigure var4 = new org.jhotdraw.contrib.TextAreaFigure();
    java.lang.String var5 = "";
    var4.setText(var5);
    org.jhotdraw.figures.TextFigure var7 = new org.jhotdraw.figures.TextFigure();
    java.awt.Rectangle var8 = var7.textDisplayBox();
    org.jhotdraw.standard.StandardDrawing var9 = new org.jhotdraw.standard.StandardDrawing();
    int var10 = 1;
    int var11 = 1;
    org.jhotdraw.contrib.PolygonFigure var12 = new org.jhotdraw.contrib.PolygonFigure(var10, var11);
    org.jhotdraw.framework.FigureEnumeration var13 = var12.figures();
    java.awt.Rectangle var14 = var12.displayBox();
    int var15 = 1;
    int var16 = 1;
    org.jhotdraw.contrib.PolygonFigure var17 = new org.jhotdraw.contrib.PolygonFigure(var15, var16);
    org.jhotdraw.framework.FigureEnumeration var18 = var17.figures();
    java.awt.Rectangle var19 = var17.displayBox();
    org.jhotdraw.framework.Figure var20 = var9.findFigure(var14, (org.jhotdraw.framework.Figure)var17);
    int var21 = 100;
    int var22 = (-1);
    java.lang.Double var23 = new java.lang.Double((-1.0d));
    java.lang.Double var24 = new java.lang.Double(100.0d);
    java.lang.Double var25 = new java.lang.Double(1.0d);
    java.awt.Point var26 = org.jhotdraw.util.Geom.polarToPoint(var23, var24, var25);
    java.lang.Double var27 = new java.lang.Double((-1.0d));
    java.lang.Double var28 = new java.lang.Double(100.0d);
    java.lang.Double var29 = new java.lang.Double(1.0d);
    java.awt.Point var30 = org.jhotdraw.util.Geom.polarToPoint(var27, var28, var29);
    org.jhotdraw.contrib.DiamondFigure var31 = new org.jhotdraw.contrib.DiamondFigure(var26, var30);
    org.jhotdraw.framework.Figure var32 = var9.findFigureInsideWithout(var21, var22, (org.jhotdraw.framework.Figure)var31);
    java.util.Iterator var33 = var9.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var34 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var35 = var34.isDoubleBuffered();
    javax.swing.JRootPane var36 = var34.getRootPane();
    javax.swing.JLayeredPane var37 = var34.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var38 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var39 = var38.isDoubleBuffered();
    javax.swing.JRootPane var40 = var38.getRootPane();
    javax.swing.JLayeredPane var41 = var38.getLayeredPane();
    int var42 = (-1);
    int var43 = 0;
    org.jhotdraw.standard.StandardDrawingView var44 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var38, var42, var43);
    java.awt.Component var45 = var34.add((java.awt.Component)var44);
    boolean var46 = var44.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var47 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var48 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var49 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var47, (org.jhotdraw.framework.FigureChangeListener)var48);
    java.awt.Dimension var50 = var47.size();
    var44.removeFromSelection((org.jhotdraw.framework.Figure)var47);
    var47.layout();
    java.lang.Object var53 = var47.clone();
    org.jhotdraw.framework.FigureChangeEvent var54 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var47);
    var9.figureRequestUpdate(var54);
    java.awt.Rectangle var56 = var54.getInvalidatedRectangle();
    var7.figureRequestUpdate(var54);
    var4.figureRequestUpdate(var54);
    var2.removeDependendFigure((org.jhotdraw.framework.Figure)var4);
    boolean var60 = var4.acceptsTyping();
    java.lang.String var61 = var4.getText();
    boolean var62 = var4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var61.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var62 == true);

  }

  public void test209() throws Throwable {

    int var0 = 0;
    int var1 = 10;
    int var2 = 10;
    int var3 = 100;
    long var4 = org.jhotdraw.util.Geom.length(var0, var1, var2, var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 90L);

  }

  public void test210() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();
    javax.swing.JScrollBar var1 = var0.getHorizontalScrollBar();

  }

  public void test211() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();
    javax.swing.JScrollBar var1 = var0.getHorizontalScrollBar();
    int var2 = 10;
    var0.removeAllFromDesktop(var2);

  }

  public void test212() throws Throwable {

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
    java.awt.dnd.DragSourceListener var15 = var10.getDragSourceListener();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);

  }

  public void test213() throws Throwable {

    int var0 = (-1);
    int var1 = (-1);
    org.jhotdraw.samples.javadraw.JavaDrawApplet var2 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var2.start();
    java.awt.Color var4 = var2.getForeground();
    org.jhotdraw.util.Filler var5 = new org.jhotdraw.util.Filler(var0, var1, var4);
    java.awt.Dimension var6 = var5.getMinimumSize();

  }

  public void test214() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JMenu var2 = var0.createLookAndFeelMenu();
    java.lang.String var3 = var2.getName();
    var2.revalidate();
    int var5 = var2.getIconTextGap();
    int var6 = 1;
    javax.swing.JMenuItem var7 = var2.getItem(var6);
    org.jhotdraw.contrib.MDI_DrawApplication var8 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var9 = var8.isDoubleBuffered();
    javax.swing.JMenu var10 = var8.createLookAndFeelMenu();
    javax.swing.Icon var11 = var10.getRolloverIcon();
    java.lang.String var12 = "hi!";
    var10.setText(var12);
    boolean var14 = var10.isLightweight();
    boolean var15 = var10.isPopupMenuVisible();
    javax.swing.plaf.ButtonUI var16 = var10.getUI();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var7.setUI(var16);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test215() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    int var1 = 100;
    java.awt.Component var2 = var0.getComponentAtIndex(var1);
    var0.updateUI();
    var0.switchToEditTools();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.Character var8 = new java.lang.Character('a');
    var7.setMnemonic(var8);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JMenu var12 = var10.createLookAndFeelMenu();
    java.lang.String var13 = var12.getName();
    boolean var14 = var7.isMenuComponent((java.awt.Component)var12);
    int var15 = 100;
    int var16 = (-1);
    int var17 = (-1);
    int var18 = (-1);
    var7.reshape(var15, var16, var17, var18);
    boolean var20 = var7.isContentAreaFilled();
    javax.swing.InputVerifier var21 = var7.getInputVerifier();
    javax.swing.KeyStroke var22 = var7.getAccelerator();
    javax.swing.MenuElement[] var23 = var7.getSubElements();
    javax.swing.JPopupMenu var24 = var7.getPopupMenu();
    var0.setComponentPopupMenu(var24);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);

  }

  public void test216() throws Throwable {

    java.lang.Double var0 = new java.lang.Double(10.0d);
    java.lang.Double var1 = new java.lang.Double(1.0d);
    java.lang.Double var2 = new java.lang.Double(10.0d);
    java.awt.Point var3 = org.jhotdraw.util.Geom.polarToPoint(var0, var1, var2);
    int var4 = 1;
    int var5 = 1;
    org.jhotdraw.contrib.PolygonFigure var6 = new org.jhotdraw.contrib.PolygonFigure(var4, var5);
    org.jhotdraw.framework.FigureEnumeration var7 = var6.figures();
    java.lang.Double var8 = new java.lang.Double((-1.0d));
    java.lang.Double var9 = new java.lang.Double(100.0d);
    java.lang.Double var10 = new java.lang.Double(1.0d);
    java.awt.Point var11 = org.jhotdraw.util.Geom.polarToPoint(var8, var9, var10);
    java.lang.Double var12 = new java.lang.Double((-1.0d));
    java.lang.Double var13 = new java.lang.Double(100.0d);
    java.lang.Double var14 = new java.lang.Double(1.0d);
    java.awt.Point var15 = org.jhotdraw.util.Geom.polarToPoint(var12, var13, var14);
    var6.basicDisplayBox(var11, var15);
    java.lang.Double var17 = new java.lang.Double(0.0d);
    java.lang.Double var18 = new java.lang.Double((-1.0d));
    org.jhotdraw.standard.RelativeLocator var19 = new org.jhotdraw.standard.RelativeLocator(var17, var18);
    int var20 = 0;
    org.jhotdraw.contrib.PolygonHandle var21 = new org.jhotdraw.contrib.PolygonHandle(var6, (org.jhotdraw.framework.Locator)var19, var20);
    int var22 = 10;
    int var23 = 1;
    int var24 = 0;
    int var25 = (-1);
    org.jhotdraw.contrib.MDI_DrawApplication var26 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var27 = var26.isDoubleBuffered();
    javax.swing.JRootPane var28 = var26.getRootPane();
    javax.swing.JLayeredPane var29 = var26.getLayeredPane();
    int var30 = (-1);
    int var31 = 0;
    org.jhotdraw.standard.StandardDrawingView var32 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var26, var30, var31);
    var32.clearSelection();
    org.jhotdraw.util.UndoableAdapter var34 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var32);
    java.awt.Dimension var35 = var32.getPreferredSize();
    var21.invokeEnd(var22, var23, var24, var25, (org.jhotdraw.framework.DrawingView)var32);
    int var37 = 0;
    int var38 = 1;
    org.jhotdraw.standard.StandardDrawing var39 = new org.jhotdraw.standard.StandardDrawing();
    int var40 = 1;
    int var41 = 1;
    org.jhotdraw.contrib.PolygonFigure var42 = new org.jhotdraw.contrib.PolygonFigure(var40, var41);
    org.jhotdraw.framework.FigureEnumeration var43 = var42.figures();
    java.awt.Rectangle var44 = var42.displayBox();
    int var45 = 1;
    int var46 = 1;
    org.jhotdraw.contrib.PolygonFigure var47 = new org.jhotdraw.contrib.PolygonFigure(var45, var46);
    org.jhotdraw.framework.FigureEnumeration var48 = var47.figures();
    java.awt.Rectangle var49 = var47.displayBox();
    org.jhotdraw.framework.Figure var50 = var39.findFigure(var44, (org.jhotdraw.framework.Figure)var47);
    var21.invokeEnd(var37, var38, (org.jhotdraw.framework.Drawing)var39);
    java.awt.Rectangle var52 = var21.displayBox();
    java.lang.Double var53 = new java.lang.Double((-1.0d));
    java.awt.Point var54 = org.jhotdraw.util.Geom.angleToPoint(var52, var53);
    org.jhotdraw.contrib.html.RoundRectangleGeometricAdapter var55 = new org.jhotdraw.contrib.html.RoundRectangleGeometricAdapter(var3, var54);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == null);

  }

  public void test217() throws Throwable {

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
    double var55 = var54.getGreaterX();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var55 == 5.0d);

  }

  public void test218() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    javax.swing.JRootPane var3 = var1.getRootPane();
    javax.swing.JLayeredPane var4 = var1.getLayeredPane();
    org.jhotdraw.standard.PasteCommand var5 = new org.jhotdraw.standard.PasteCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    int var6 = var1.getExtendedState();
    boolean var7 = var1.isFocusCycleRoot();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == true);

  }

  public void test219() throws Throwable {

    org.jhotdraw.contrib.PolygonFigure var0 = new org.jhotdraw.contrib.PolygonFigure();
    org.jhotdraw.framework.Locator var1 = org.jhotdraw.standard.RelativeLocator.center();
    int var2 = 0;
    org.jhotdraw.contrib.PolygonHandle var3 = new org.jhotdraw.contrib.PolygonHandle(var0, var1, var2);
    int var4 = var0.pointCount();
    java.lang.String var5 = "hi!";
    org.jhotdraw.framework.FigureAttributeConstant var6 = new org.jhotdraw.framework.FigureAttributeConstant(var5);
    org.jhotdraw.contrib.GraphicalCompositeFigure var7 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var8 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var9 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var7, (org.jhotdraw.framework.FigureChangeListener)var8);
    java.awt.Dimension var10 = var7.size();
    org.jhotdraw.framework.Locator var11 = org.jhotdraw.standard.RelativeLocator.east();
    org.jhotdraw.standard.LocatorConnector var12 = new org.jhotdraw.standard.LocatorConnector((org.jhotdraw.framework.Figure)var7, var11);
    java.awt.Rectangle var13 = var12.displayBox();
    var0.setAttribute(var6, (java.lang.Object)var13);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == 0);

  }

  public void test220() throws Throwable {

    org.jhotdraw.figures.GroupFigure var0 = new org.jhotdraw.figures.GroupFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var1 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.ChopPolygonConnector var2 = new org.jhotdraw.contrib.ChopPolygonConnector((org.jhotdraw.framework.Figure)var1);
    org.jhotdraw.standard.StandardDrawing var3 = new org.jhotdraw.standard.StandardDrawing();
    int var4 = var1.getLayer((org.jhotdraw.framework.Figure)var3);
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
    java.lang.Object var24 = var18.clone();
    org.jhotdraw.framework.FigureChangeEvent var25 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var18);
    java.lang.Object var26 = var25.getSource();
    var3.figureInvalidated(var25);
    var0.figureChanged(var25);
    org.jhotdraw.framework.HandleEnumeration var29 = var0.handles();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == false);

  }

  public void test221() throws Throwable {

    org.jhotdraw.standard.NullPainter var0 = new org.jhotdraw.standard.NullPainter();

  }

  public void test222() throws Throwable {

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
    boolean var11 = var6.isPreferredSizeSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);

  }

  public void test223() throws Throwable {

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
    int var12 = 10;
    int var13 = 10;
    org.jhotdraw.contrib.zoom.ZoomDrawingView var14 = new org.jhotdraw.contrib.zoom.ZoomDrawingView((org.jhotdraw.framework.DrawingEditor)var1, var12, var13);
    java.awt.Dimension var15 = var14.getUserSize();
    double var16 = var14.getZoomSpeed();
    int var17 = 0;
    int var18 = (-1);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var14.zoomIn(var17, var18);
      fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == 2.0d);

  }

  public void test224() throws Throwable {

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
    boolean var19 = var0.isBackgroundSet();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == (-30000));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == true);

  }

  public void test225() throws Throwable {

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
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JMenu var14 = var12.createLookAndFeelMenu();
    javax.swing.Icon var15 = var14.getRolloverIcon();
    javax.swing.JPopupMenu var16 = var14.getComponentPopupMenu();
    java.lang.Boolean var17 = new java.lang.Boolean(true);
    var14.setSelected(var17);
    int var19 = var14.getItemCount();
    var3.moveToFront((java.awt.Component)var14);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7.equals("RootPaneUI"));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var16 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 4);

  }

  public void test226() throws Throwable {

    java.lang.String var0 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var1 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var2 = var1.isDoubleBuffered();
    boolean var3 = var1.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var4 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var5 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var6 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var4, (org.jhotdraw.framework.FigureChangeListener)var5);
    int var7 = var5.getZValue();
    java.lang.Object var8 = var5.clone();
    org.jhotdraw.standard.CreationTool var9 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var1, (org.jhotdraw.framework.Figure)var5);
    java.lang.Boolean var10 = new java.lang.Boolean(false);
    var1.setFocusTraversalPolicyProvider(var10);
    org.jhotdraw.standard.CutCommand var12 = new org.jhotdraw.standard.CutCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    java.awt.event.WindowStateListener[] var13 = var1.getWindowStateListeners();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == 0);

  }

  public void test227() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    javax.swing.JRootPane var2 = var0.getRootPane();
    javax.swing.JLayeredPane var3 = var0.getLayeredPane();
    var0.toFront();
    var0.repaint();
    org.jhotdraw.standard.StandardDrawing var6 = new org.jhotdraw.standard.StandardDrawing();
    int var7 = 1;
    int var8 = 1;
    org.jhotdraw.contrib.PolygonFigure var9 = new org.jhotdraw.contrib.PolygonFigure(var7, var8);
    org.jhotdraw.framework.FigureEnumeration var10 = var9.figures();
    java.awt.Rectangle var11 = var9.displayBox();
    int var12 = 1;
    int var13 = 1;
    org.jhotdraw.contrib.PolygonFigure var14 = new org.jhotdraw.contrib.PolygonFigure(var12, var13);
    org.jhotdraw.framework.FigureEnumeration var15 = var14.figures();
    java.awt.Rectangle var16 = var14.displayBox();
    org.jhotdraw.framework.Figure var17 = var6.findFigure(var11, (org.jhotdraw.framework.Figure)var14);
    int var18 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var19 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var18);
    var6.orphanAll((java.util.List)var19);
    int var21 = 100;
    int var22 = (-1);
    int var23 = 10;
    int var24 = 0;
    int var25 = 100;
    int var26 = (-1);
    int var27 = 1;
    int var28 = 1;
    java.awt.Point var29 = org.jhotdraw.util.Geom.intersect(var21, var22, var23, var24, var25, var26, var27, var28);
    int var30 = 100;
    int var31 = (-1);
    int var32 = 10;
    int var33 = 0;
    int var34 = 100;
    int var35 = (-1);
    int var36 = 1;
    int var37 = 1;
    java.awt.Point var38 = org.jhotdraw.util.Geom.intersect(var30, var31, var32, var33, var34, var35, var36, var37);
    var6.basicDisplayBox(var29, var38);
    var6.release();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.newWindow((org.jhotdraw.framework.Drawing)var6);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == null);

  }

  public void test228() throws Throwable {

    java.lang.Double var0 = new java.lang.Double(1.0d);
    java.lang.Double var1 = new java.lang.Double(100.0d);
    org.jhotdraw.standard.RelativeLocator var2 = new org.jhotdraw.standard.RelativeLocator(var0, var1);
    java.lang.Object var3 = var2.clone();

  }

  public void test229() throws Throwable {

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
    javax.swing.ButtonModel var10 = var2.getModel();
    java.awt.Dimension var11 = var2.getMinimumSize();
    org.jhotdraw.contrib.MDI_DrawApplication var12 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var13 = var12.isDoubleBuffered();
    javax.swing.JMenu var14 = var12.createLookAndFeelMenu();
    javax.swing.Icon var15 = var14.getRolloverIcon();
    java.lang.String var16 = "hi!";
    var14.setText(var16);
    boolean var18 = var14.isLightweight();
    boolean var19 = var14.isPopupMenuVisible();
    boolean var20 = var14.isPaintingForPrint();
    org.jhotdraw.contrib.MDI_DrawApplication var21 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var22 = var21.isDoubleBuffered();
    javax.swing.JMenu var23 = var21.createLookAndFeelMenu();
    java.lang.Character var24 = new java.lang.Character('a');
    var23.setMnemonic(var24);
    org.jhotdraw.contrib.MDI_DrawApplication var26 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var27 = var26.isDoubleBuffered();
    javax.swing.JMenu var28 = var26.createLookAndFeelMenu();
    java.lang.String var29 = var28.getName();
    boolean var30 = var23.isMenuComponent((java.awt.Component)var28);
    java.lang.Boolean var31 = new java.lang.Boolean(true);
    var28.setBorderPainted(var31);
    javax.swing.JMenuItem var33 = var14.add((javax.swing.JMenuItem)var28);
    var28.removeNotify();
    java.lang.Boolean var35 = new java.lang.Boolean(false);
    var28.setEnabled(var35);
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JMenu var39 = var37.createLookAndFeelMenu();
    java.lang.String var40 = var39.getName();
    var39.revalidate();
    int var42 = var39.getIconTextGap();
    int var43 = 1;
    javax.swing.JMenuItem var44 = var39.getItem(var43);
    org.jhotdraw.contrib.MDI_DrawApplication var45 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var46 = var45.isDoubleBuffered();
    javax.swing.JMenu var47 = var45.createLookAndFeelMenu();
    java.lang.String var48 = var47.getName();
    java.lang.String var49 = "";
    int var50 = 100;
    var47.insert(var49, var50);
    boolean var52 = var47.isFocusPainted();
    java.lang.String var53 = "";
    var47.setLabel(var53);
    javax.swing.ButtonModel var55 = var47.getModel();
    var39.setModel(var55);
    var28.setModel(var55);
    var2.setModel(var55);
    java.awt.Component[] var59 = var2.getMenuComponents();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var29 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var40 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var48 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var52 == false);

  }

  public void test230() throws Throwable {

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
    java.lang.Boolean var42 = new java.lang.Boolean(true);
    var10.setLocationByPlatform(var42);
    java.lang.String[] var44 = var10.getRequiredVersions();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      org.jhotdraw.samples.javadraw.JavaDrawApp.main(var44);
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
    assertTrue(var24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);

  }

  public void test231() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();
    javax.swing.JScrollBar var1 = var0.getHorizontalScrollBar();
    int var2 = 10;
    var0.removeAllFromDesktop(var2);
    java.lang.String var4 = "hi!";
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var7 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var5);
    boolean var8 = var5.isCursorSet();
    org.jhotdraw.standard.SendToBackCommand var9 = new org.jhotdraw.standard.SendToBackCommand(var4, (org.jhotdraw.framework.DrawingEditor)var5);
    java.lang.String var10 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var11 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var11.start();
    org.jhotdraw.standard.CopyCommand var13 = new org.jhotdraw.standard.CopyCommand(var10, (org.jhotdraw.framework.DrawingEditor)var11);
    var13.dispose();
    java.lang.String var15 = "";
    org.jhotdraw.util.CommandMenu var16 = new org.jhotdraw.util.CommandMenu(var15);
    var13.addCommandListener((org.jhotdraw.util.CommandListener)var16);
    javax.swing.InputMap var18 = var16.getInputMap();
    var9.addCommandListener((org.jhotdraw.util.CommandListener)var16);
    var0.setViewportView((java.awt.Component)var16);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var8 == true);

  }

  public void test232() throws Throwable {

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
    boolean var16 = var11.isFocusCycleRoot();
    boolean var17 = var11.getFocusableWindowState();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var17 == true);

  }

  public void test233() throws Throwable {

    org.jhotdraw.contrib.GraphicalCompositeFigure var0 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var1 = var0.listener();
    int var2 = 1;
    int var3 = 1;
    org.jhotdraw.contrib.PolygonFigure var4 = new org.jhotdraw.contrib.PolygonFigure(var2, var3);
    java.lang.String var5 = "";
    org.jhotdraw.contrib.MDI_DrawApplication var6 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var7 = var6.isDoubleBuffered();
    javax.swing.JRootPane var8 = var6.getRootPane();
    java.lang.String var9 = "hi!";
    java.lang.Long var10 = new java.lang.Long(100L);
    java.lang.Long var11 = new java.lang.Long(1L);
    var8.firePropertyChange(var9, var10, var11);
    int var13 = var8.getX();
    var4.setAttribute(var5, (java.lang.Object)var13);
    org.jhotdraw.standard.StandardDrawing var15 = new org.jhotdraw.standard.StandardDrawing();
    java.lang.Double var16 = new java.lang.Double((-1.0d));
    java.lang.Double var17 = new java.lang.Double(100.0d);
    java.lang.Double var18 = new java.lang.Double(1.0d);
    java.awt.Point var19 = org.jhotdraw.util.Geom.polarToPoint(var16, var17, var18);
    java.lang.Double var20 = new java.lang.Double((-1.0d));
    java.lang.Double var21 = new java.lang.Double(100.0d);
    java.lang.Double var22 = new java.lang.Double(1.0d);
    java.awt.Point var23 = org.jhotdraw.util.Geom.polarToPoint(var20, var21, var22);
    org.jhotdraw.contrib.DiamondFigure var24 = new org.jhotdraw.contrib.DiamondFigure(var19, var23);
    org.jhotdraw.framework.HandleEnumeration var25 = var24.handles();
    org.jhotdraw.contrib.GraphicalCompositeFigure var26 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var27 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var28 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var26, (org.jhotdraw.framework.FigureChangeListener)var27);
    org.jhotdraw.framework.Figure var29 = var15.replace((org.jhotdraw.framework.Figure)var24, (org.jhotdraw.framework.Figure)var26);
    org.jhotdraw.framework.Handle var30 = org.jhotdraw.standard.BoxHandleKit.north(var29);
    org.jhotdraw.contrib.MDI_DrawApplication var31 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var32 = var31.isDoubleBuffered();
    javax.swing.JRootPane var33 = var31.getRootPane();
    javax.swing.JLayeredPane var34 = var31.getLayeredPane();
    int var35 = (-1);
    int var36 = 0;
    org.jhotdraw.standard.StandardDrawingView var37 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var31, var35, var36);
    var37.clearSelection();
    org.jhotdraw.contrib.ClippingUpdateStrategy var39 = new org.jhotdraw.contrib.ClippingUpdateStrategy();
    var37.removeForeground((org.jhotdraw.framework.Painter)var39);
    org.jhotdraw.util.UndoableHandle var41 = new org.jhotdraw.util.UndoableHandle(var30, (org.jhotdraw.framework.DrawingView)var37);
    org.jhotdraw.contrib.MDI_DrawApplication var42 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var43 = var42.isDoubleBuffered();
    javax.swing.JRootPane var44 = var42.getRootPane();
    javax.swing.JLayeredPane var45 = var42.getLayeredPane();
    int var46 = (-1);
    int var47 = 0;
    org.jhotdraw.standard.StandardDrawingView var48 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var42, var46, var47);
    org.jhotdraw.contrib.MDI_DrawApplication var49 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var50 = var49.isDoubleBuffered();
    javax.swing.JRootPane var51 = var49.getRootPane();
    javax.swing.JLayeredPane var52 = var49.getLayeredPane();
    int var53 = (-1);
    int var54 = 0;
    org.jhotdraw.standard.StandardDrawingView var55 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var49, var53, var54);
    var55.clearSelection();
    java.awt.Color var57 = var55.getForeground();
    var48.setBackground(var57);
    org.jhotdraw.framework.FigureEnumeration var59 = var48.selectionZOrdered();
    var59.reset();
    var37.addToSelectionAll(var59);
    java.lang.Double var62 = new java.lang.Double((-1.0d));
    java.lang.Double var63 = new java.lang.Double(100.0d);
    java.lang.Double var64 = new java.lang.Double(1.0d);
    java.awt.Point var65 = org.jhotdraw.util.Geom.polarToPoint(var62, var63, var64);
    java.awt.Point var66 = var37.getLocation(var65);
    java.awt.Point var67 = var4.chop(var66);
    var4.willChange();
    java.lang.Double var69 = new java.lang.Double((-1.0d));
    java.lang.Double var70 = new java.lang.Double(100.0d);
    java.lang.Double var71 = new java.lang.Double(1.0d);
    java.awt.Point var72 = org.jhotdraw.util.Geom.polarToPoint(var69, var70, var71);
    java.lang.Double var73 = new java.lang.Double((-1.0d));
    java.lang.Double var74 = new java.lang.Double(100.0d);
    java.lang.Double var75 = new java.lang.Double(1.0d);
    java.awt.Point var76 = org.jhotdraw.util.Geom.polarToPoint(var73, var74, var75);
    org.jhotdraw.figures.EllipseFigure var77 = new org.jhotdraw.figures.EllipseFigure(var72, var76);
    java.awt.Rectangle var78 = var77.displayBox();
    org.jhotdraw.framework.FigureChangeEvent var79 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var4, var78);
    var0.figureRequestRemove(var79);
    int var81 = (-1);
    int var82 = 10;
    org.jhotdraw.framework.Connector var83 = var0.connectorAt(var81, var82);
    org.jhotdraw.framework.Locator var84 = org.jhotdraw.standard.RelativeLocator.north();
    org.jhotdraw.standard.LocatorHandle var85 = new org.jhotdraw.standard.LocatorHandle((org.jhotdraw.framework.Figure)var0, var84);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var50 == false);

  }

  public void test234() throws Throwable {

    org.jhotdraw.contrib.MDI_DrawApplication var0 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var1 = var0.isDoubleBuffered();
    org.jhotdraw.samples.javadraw.URLTool var2 = new org.jhotdraw.samples.javadraw.URLTool((org.jhotdraw.framework.DrawingEditor)var0);
    boolean var3 = var0.isCursorSet();
    org.jhotdraw.contrib.dnd.DragNDropTool var4 = new org.jhotdraw.contrib.dnd.DragNDropTool((org.jhotdraw.framework.DrawingEditor)var0);
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JRootPane var7 = var5.getRootPane();
    javax.swing.JLayeredPane var8 = var5.getLayeredPane();
    int var9 = (-1);
    int var10 = 0;
    org.jhotdraw.standard.StandardDrawingView var11 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var5, var9, var10);
    var11.clearSelection();
    org.jhotdraw.util.UndoableAdapter var13 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var11);
    org.jhotdraw.contrib.html.DisposableResourceHolder var14 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var13);
    boolean var15 = var13.undo();
    var4.setUndoActivity((org.jhotdraw.util.Undoable)var13);
    java.lang.Boolean var17 = new java.lang.Boolean(false);
    var13.setRedoable(var17);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == false);

  }

  public void test235() throws Throwable {

    org.jhotdraw.standard.ChopBoxConnector var0 = new org.jhotdraw.standard.ChopBoxConnector();
    int var1 = 0;
    int var2 = 0;
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      boolean var3 = var0.containsPoint(var1, var2);
      fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  public void test236() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();
    javax.swing.JScrollBar var1 = var0.getHorizontalScrollBar();
    java.lang.String var2 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var3 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var3.start();
    org.jhotdraw.standard.CopyCommand var5 = new org.jhotdraw.standard.CopyCommand(var2, (org.jhotdraw.framework.DrawingEditor)var3);
    int var6 = 100;
    java.lang.Double var7 = new java.lang.Double((-1.0d));
    java.lang.Double var8 = new java.lang.Double(100.0d);
    java.lang.Double var9 = new java.lang.Double(1.0d);
    java.awt.Point var10 = org.jhotdraw.util.Geom.polarToPoint(var7, var8, var9);
    org.jhotdraw.util.PaletteLayout var11 = new org.jhotdraw.util.PaletteLayout(var6, var10);
    var3.setLayout((java.awt.LayoutManager)var11);
    java.lang.String var13 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var14 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var14.start();
    org.jhotdraw.standard.CopyCommand var16 = new org.jhotdraw.standard.CopyCommand(var13, (org.jhotdraw.framework.DrawingEditor)var14);
    var16.dispose();
    java.lang.String var18 = "";
    org.jhotdraw.util.CommandMenu var19 = new org.jhotdraw.util.CommandMenu(var18);
    var16.addCommandListener((org.jhotdraw.util.CommandListener)var19);
    javax.swing.InputMap var21 = var19.getInputMap();
    java.lang.String var22 = "";
    var19.setLabel(var22);
    javax.swing.event.MenuDragMouseListener[] var24 = var19.getMenuDragMouseListeners();
    var11.layoutContainer((java.awt.Container)var19);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.setLayout((java.awt.LayoutManager)var11);
      fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }

  }

  public void test237() throws Throwable {

    org.jhotdraw.contrib.JScrollPaneDesktop var0 = new org.jhotdraw.contrib.JScrollPaneDesktop();
    javax.swing.JScrollBar var1 = var0.getHorizontalScrollBar();
    javax.swing.border.Border var2 = var0.getViewportBorder();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);

  }

  public void test238() throws Throwable {

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
    org.jhotdraw.util.collections.jdk11.SetWrapper var10 = new org.jhotdraw.util.collections.jdk11.SetWrapper();
    org.jhotdraw.util.collections.jdk11.SetWrapper var11 = new org.jhotdraw.util.collections.jdk11.SetWrapper((java.util.Set)var10);
    org.jhotdraw.standard.StandardDrawing var12 = new org.jhotdraw.standard.StandardDrawing();
    int var13 = 1;
    int var14 = 1;
    org.jhotdraw.contrib.PolygonFigure var15 = new org.jhotdraw.contrib.PolygonFigure(var13, var14);
    org.jhotdraw.framework.FigureEnumeration var16 = var15.figures();
    java.awt.Rectangle var17 = var15.displayBox();
    int var18 = 1;
    int var19 = 1;
    org.jhotdraw.contrib.PolygonFigure var20 = new org.jhotdraw.contrib.PolygonFigure(var18, var19);
    org.jhotdraw.framework.FigureEnumeration var21 = var20.figures();
    java.awt.Rectangle var22 = var20.displayBox();
    org.jhotdraw.framework.Figure var23 = var12.findFigure(var17, (org.jhotdraw.framework.Figure)var20);
    int var24 = 100;
    int var25 = (-1);
    java.lang.Double var26 = new java.lang.Double((-1.0d));
    java.lang.Double var27 = new java.lang.Double(100.0d);
    java.lang.Double var28 = new java.lang.Double(1.0d);
    java.awt.Point var29 = org.jhotdraw.util.Geom.polarToPoint(var26, var27, var28);
    java.lang.Double var30 = new java.lang.Double((-1.0d));
    java.lang.Double var31 = new java.lang.Double(100.0d);
    java.lang.Double var32 = new java.lang.Double(1.0d);
    java.awt.Point var33 = org.jhotdraw.util.Geom.polarToPoint(var30, var31, var32);
    org.jhotdraw.contrib.DiamondFigure var34 = new org.jhotdraw.contrib.DiamondFigure(var29, var33);
    org.jhotdraw.framework.Figure var35 = var12.findFigureInsideWithout(var24, var25, (org.jhotdraw.framework.Figure)var34);
    java.util.Iterator var36 = var12.drawingChangeListeners();
    org.jhotdraw.contrib.MDI_DrawApplication var37 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var38 = var37.isDoubleBuffered();
    javax.swing.JRootPane var39 = var37.getRootPane();
    javax.swing.JLayeredPane var40 = var37.getLayeredPane();
    org.jhotdraw.contrib.MDI_DrawApplication var41 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var42 = var41.isDoubleBuffered();
    javax.swing.JRootPane var43 = var41.getRootPane();
    javax.swing.JLayeredPane var44 = var41.getLayeredPane();
    int var45 = (-1);
    int var46 = 0;
    org.jhotdraw.standard.StandardDrawingView var47 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var41, var45, var46);
    java.awt.Component var48 = var37.add((java.awt.Component)var47);
    boolean var49 = var47.getInheritsPopupMenu();
    org.jhotdraw.contrib.GraphicalCompositeFigure var50 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var51 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var52 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var50, (org.jhotdraw.framework.FigureChangeListener)var51);
    java.awt.Dimension var53 = var50.size();
    var47.removeFromSelection((org.jhotdraw.framework.Figure)var50);
    var50.layout();
    java.lang.Object var56 = var50.clone();
    org.jhotdraw.framework.FigureChangeEvent var57 = new org.jhotdraw.framework.FigureChangeEvent((org.jhotdraw.framework.Figure)var50);
    var12.figureRequestUpdate(var57);
    org.jhotdraw.contrib.GraphicalCompositeFigure var59 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var60 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var61 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var59, (org.jhotdraw.framework.FigureChangeListener)var60);
    java.awt.Dimension var62 = var59.size();
    var12.sendToBack((org.jhotdraw.framework.Figure)var59);
    int var64 = 10;
    org.jhotdraw.util.collections.jdk11.ListWrapper var65 = new org.jhotdraw.util.collections.jdk11.ListWrapper(var64);
    java.util.Iterator var66 = var65.iterator();
    org.jhotdraw.contrib.MDI_DrawApplication var67 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var68 = var67.isDoubleBuffered();
    boolean var69 = var67.isBackgroundSet();
    org.jhotdraw.contrib.GraphicalCompositeFigure var70 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.contrib.GraphicalCompositeFigure var71 = new org.jhotdraw.contrib.GraphicalCompositeFigure();
    org.jhotdraw.framework.FigureChangeListener var72 = org.jhotdraw.standard.FigureChangeEventMulticaster.add((org.jhotdraw.framework.FigureChangeListener)var70, (org.jhotdraw.framework.FigureChangeListener)var71);
    int var73 = var71.getZValue();
    java.lang.Object var74 = var71.clone();
    org.jhotdraw.standard.CreationTool var75 = new org.jhotdraw.standard.CreationTool((org.jhotdraw.framework.DrawingEditor)var67, (org.jhotdraw.framework.Figure)var71);
    int var76 = 1;
    int var77 = 0;
    org.jhotdraw.standard.StandardDrawingView var78 = new org.jhotdraw.standard.StandardDrawingView((org.jhotdraw.framework.DrawingEditor)var67, var76, var77);
    boolean var79 = var65.contains((java.lang.Object)var77);
    var59.addAll((java.util.List)var65);
    boolean var81 = var10.containsAll((java.util.Collection)var65);
    var6.addAll((java.util.Collection)var10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var23 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var35 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var68 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var79 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var81 == false);

  }

  public void test239() throws Throwable {

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
    int var37 = var10.getCursorType();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var37 == 0);

  }

  public void test240() throws Throwable {

    org.jhotdraw.contrib.CustomToolBar var0 = new org.jhotdraw.contrib.CustomToolBar();
    int var1 = 100;
    java.awt.Component var2 = var0.getComponentAtIndex(var1);
    var0.updateUI();
    var0.switchToEditTools();
    org.jhotdraw.contrib.MDI_DrawApplication var5 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var6 = var5.isDoubleBuffered();
    javax.swing.JMenu var7 = var5.createLookAndFeelMenu();
    java.lang.Character var8 = new java.lang.Character('a');
    var7.setMnemonic(var8);
    org.jhotdraw.contrib.MDI_DrawApplication var10 = new org.jhotdraw.contrib.MDI_DrawApplication();
    boolean var11 = var10.isDoubleBuffered();
    javax.swing.JMenu var12 = var10.createLookAndFeelMenu();
    java.lang.String var13 = var12.getName();
    boolean var14 = var7.isMenuComponent((java.awt.Component)var12);
    int var15 = 100;
    int var16 = (-1);
    int var17 = (-1);
    int var18 = (-1);
    var7.reshape(var15, var16, var17, var18);
    boolean var20 = var7.isContentAreaFilled();
    javax.swing.InputVerifier var21 = var7.getInputVerifier();
    javax.swing.KeyStroke var22 = var7.getAccelerator();
    javax.swing.MenuElement[] var23 = var7.getSubElements();
    javax.swing.JPopupMenu var24 = var7.getPopupMenu();
    var0.setComponentPopupMenu(var24);
    org.jhotdraw.contrib.CustomToolBar var26 = new org.jhotdraw.contrib.CustomToolBar();
    int var27 = 100;
    java.awt.Component var28 = var26.getComponentAtIndex(var27);
    var26.updateUI();
    javax.swing.plaf.ToolBarUI var30 = var26.getUI();
    var0.setUI(var30);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var13 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var21 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var22 == null);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var28 == null);

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
    org.jhotdraw.util.UndoableAdapter var8 = new org.jhotdraw.util.UndoableAdapter((org.jhotdraw.framework.DrawingView)var6);
    org.jhotdraw.contrib.html.DisposableResourceHolder var9 = org.jhotdraw.contrib.html.DisposableResourceManagerFactory.createStandardHolder((java.lang.Object)var8);
    boolean var10 = var8.undo();
    org.jhotdraw.framework.FigureEnumeration var11 = var8.getAffectedFigures();
    java.lang.Boolean var12 = new java.lang.Boolean(true);
    var8.setUndoable(var12);
    org.jhotdraw.framework.DrawingView var14 = var8.getDrawingView();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var10 == false);

  }

  public void test242() throws Throwable {

    java.lang.String var0 = "";
    org.jhotdraw.samples.javadraw.JavaDrawApplet var1 = new org.jhotdraw.samples.javadraw.JavaDrawApplet();
    var1.start();
    org.jhotdraw.standard.CopyCommand var3 = new org.jhotdraw.standard.CopyCommand(var0, (org.jhotdraw.framework.DrawingEditor)var1);
    var3.dispose();
    java.lang.String var5 = "";
    org.jhotdraw.util.CommandMenu var6 = new org.jhotdraw.util.CommandMenu(var5);
    var3.addCommandListener((org.jhotdraw.util.CommandListener)var6);
    var6.checkEnabled();
    java.awt.event.ContainerListener[] var9 = var6.getContainerListeners();

  }

  public void test243() throws Throwable {

    java.lang.Double var0 = new java.lang.Double((-1.0d));
    java.lang.Double var1 = new java.lang.Double(10.0d);
    java.lang.Double var2 = new java.lang.Double(10.0d);
    java.lang.Double var3 = new java.lang.Double(0.0d);
    org.jhotdraw.util.Bounds var4 = new org.jhotdraw.util.Bounds(var0, var1, var2, var3);
    double var5 = var4.getWidth();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == 11.0d);

  }

  public void test244() throws Throwable {

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
    int var36 = var35.getVerticalAlignment();
    java.lang.Long var37 = new java.lang.Long(10L);
    int var38 = 10;
    int var39 = (-1);
    int var40 = 100;
    int var41 = 100;
    var35.repaint(var37, var38, var39, var40, var41);
    var35.reset();
    
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
    assertTrue(var36 == 0);

  }

  public void test245() throws Throwable {

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
    org.jhotdraw.figures.ScribbleTool var18 = new org.jhotdraw.figures.ScribbleTool((org.jhotdraw.framework.DrawingEditor)var0);
    var0.removeNotify();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var5 == false);

  }

}

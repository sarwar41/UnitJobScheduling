import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.io.PrintWriter printWriter5 = null;
        // The following exception was thrown during execution in test generation
        try {
            home2.list(printWriter5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component6 = home2.getComponent((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = java.awt.Frame.WAIT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Home home0 = new Home();
        Home home1 = new Home();
        java.awt.Cursor cursor2 = home1.getCursor();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component3 = home0.add((java.awt.Component) home1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = javax.swing.WindowConstants.EXIT_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        float float0 = java.awt.Component.CENTER_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior4 = home0.getBaselineResizeBehavior();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior4 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior4.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.repaint(1L);
        Home home5 = new Home();
        boolean boolean6 = home5.isMaximumSizeSet();
        java.awt.Event event7 = null;
        boolean boolean10 = home5.mouseUp(event7, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component11 = home0.add("hi!", (java.awt.Component) home5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.Rectangle rectangle7 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setBounds(rectangle7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        boolean boolean8 = home4.isActive();
        // The following exception was thrown during execution in test generation
        try {
            home0.setComponentZOrder((java.awt.Component) home4, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Home home0 = new Home();
        javax.swing.JLayeredPane jLayeredPane1 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setLayeredPane(jLayeredPane1);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: layeredPane cannot be set to null.");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        home0.setFocusTraversalPolicy(focusTraversalPolicy5);
        java.io.PrintWriter printWriter7 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.list(printWriter7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        Home home5 = new Home();
        boolean boolean6 = home5.isMaximumSizeSet();
        home5.setResizable(false);
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLabel jLabel12 = home9.taskTypeLabel;
        jLabel12.invalidate();
        home5.priority = jLabel12;
        // The following exception was thrown during execution in test generation
        try {
            home2.setGlassPane((java.awt.Component) home5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLabel12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        javax.swing.JLabel jLabel10 = home0.taskEndLabel;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jLabel10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        home0.setFocusTraversalPolicy(focusTraversalPolicy5);
        boolean boolean7 = home0.isActive();
        java.io.PrintStream printStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.list(printStream8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        float float0 = java.awt.Component.RIGHT_ALIGNMENT;
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        java.awt.Cursor cursor5 = home4.getCursor();
        home4.removeNotify();
        javax.swing.JLabel jLabel7 = home4.taskTypeLabel;
        jLabel7.invalidate();
        home0.priority = jLabel7;
        java.awt.event.MouseMotionListener mouseMotionListener10 = null;
        jLabel7.removeMouseMotionListener(mouseMotionListener10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor5);
        org.junit.Assert.assertNotNull(jLabel7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Home home0 = new Home();
        java.awt.Point point1 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setLocation(point1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"p\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int0 = java.awt.Frame.ICONIFIED;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        home0.deleteJob();
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point10 = home0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        jDateChooser4.addInputMethodListener(inputMethodListener5);
        boolean boolean7 = jDateChooser4.isForegroundSet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        org.junit.Assert.assertNotNull(frameArray0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        jLabel5.invalidate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.lang.Class<?> wildcardClass3 = home0.getClass();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.Event event2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = home0.postEvent(event2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        java.util.Locale locale5 = null;
        home0.setLocale(locale5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        java.awt.event.ActionEvent actionEvent6 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = jLabel3.isEnabled();
        jLabel3.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = container6.getY();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        boolean boolean6 = home0.isLightweight();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        java.awt.Event event9 = null;
        boolean boolean12 = home7.mouseUp(event9, 0, (int) ' ');
        java.awt.Cursor cursor13 = null;
        home7.setCursor(cursor13);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component15 = home0.add((java.awt.Component) home7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        java.awt.Graphics graphics5 = null;
        home0.print(graphics5);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        java.awt.Image image10 = jTable7.createImage(16, (int) '4');
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNull(image10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        java.awt.Component[] componentArray9 = home6.getComponents();
        Home home10 = new Home();
        java.awt.image.BufferStrategy bufferStrategy11 = home10.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        home10.addHierarchyBoundsListener(hierarchyBoundsListener12);
        boolean boolean14 = home10.isResizable();
        java.awt.Dimension dimension15 = null;
        home10.setMinimumSize(dimension15);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        boolean boolean21 = home17.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser22 = home17.enDate;
        home10.stDate = jDateChooser22;
        home6.stDate = jDateChooser22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(componentArray9);
        org.junit.Assert.assertNull(bufferStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jDateChooser22);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser8 = home4.stDate;
        home0.stDate = jDateChooser8;
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType13 = null;
        home10.setModalExclusionType(modalExclusionType13);
        // The following exception was thrown during execution in test generation
        try {
            home0.setComponentZOrder((java.awt.Component) home10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jDateChooser8);
        org.junit.Assert.assertNotNull(cursor11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        java.io.PrintStream printStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.list(printStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        home0.deleteJob();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.lblScheduledBy;
        home0.deleteJob();
        boolean boolean3 = home0.isEnabled();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int0 = java.awt.Frame.MOVE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        javax.swing.JMenuBar jMenuBar6 = home2.getJMenuBar();
        int int7 = home2.getHeight();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNull(jMenuBar6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 800 + "'", int7 == 800);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Home home0 = new Home();
        home0.repaint(0L, (int) (short) 1, 0, (int) (short) 100, (int) '#');
        home0.clearAllInput();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        home8.setResizable(false);
        boolean boolean12 = home8.isActive();
        UserProfile userProfile13 = null;
        home8.userProfile = userProfile13;
        com.toedter.calendar.JDateChooser jDateChooser15 = home8.enDate;
        java.awt.image.ImageProducer imageProducer16 = null;
        java.awt.Image image17 = home8.createImage(imageProducer16);
        java.awt.image.ImageObserver imageObserver20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = home0.prepareImage(image17, 10, (int) '4', imageObserver20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jDateChooser15);
        org.junit.Assert.assertNotNull(image17);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        boolean boolean7 = jDateChooser4.contains(16, 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.util.Locale locale8 = null;
        home0.setLocale(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component11 = home0.getComponent((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        java.awt.im.InputContext inputContext5 = home0.getInputContext();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(inputContext5);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        java.awt.event.InputMethodListener inputMethodListener5 = null;
        jDateChooser4.addInputMethodListener(inputMethodListener5);
        java.awt.event.KeyListener[] keyListenerArray7 = jDateChooser4.getKeyListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertNotNull(keyListenerArray7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        java.awt.Window.Type type10 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setType(type10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        boolean boolean3 = home0.getIgnoreRepaint();
        float float4 = home0.getOpacity();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        boolean boolean10 = home0.isMinimumSizeSet();
        int int11 = home0.sel_task_id;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        java.awt.AWTEvent aWTEvent9 = null;
        // The following exception was thrown during execution in test generation
        try {
            home6.dispatchEvent(aWTEvent9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        java.awt.Component[] componentArray9 = home6.getComponents();
        boolean boolean10 = home6.isValidateRoot();
        java.awt.event.WindowFocusListener windowFocusListener11 = null;
        home6.addWindowFocusListener(windowFocusListener11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(componentArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.Dimension dimension7 = home0.getSize();
        java.awt.Window.Type type8 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setType(type8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        boolean boolean6 = home0.isLightweight();
        java.awt.event.MouseListener[] mouseListenerArray7 = home0.getMouseListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(mouseListenerArray7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        home0.addWindowFocusListener(windowFocusListener3);
        Home home5 = new Home();
        java.awt.Cursor cursor6 = home5.getCursor();
        home5.removeNotify();
        javax.swing.JLabel jLabel8 = home5.taskTypeLabel;
        boolean boolean9 = jLabel8.isEnabled();
        home0.taskNameLabel = jLabel8;
        java.awt.PopupMenu popupMenu11 = null;
        // The following exception was thrown during execution in test generation
        try {
            jLabel8.add(popupMenu11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(cursor6);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int0 = java.awt.Frame.HAND_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        // The following exception was thrown during execution in test generation
        try {
            home0.createBufferStrategy(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        jLabel9.setIgnoreRepaint(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLayeredPane jLayeredPane14 = home11.getLayeredPane();
        boolean boolean15 = jLayeredPane14.isForegroundSet();
        home0.setLayeredPane(jLayeredPane14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLayeredPane14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        java.awt.event.FocusEvent.Cause cause9 = null;
        home0.requestFocus(cause9);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        java.lang.Object obj5 = home0.getTreeLock();
        home0.enable();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(obj5);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        boolean boolean6 = home0.isFocusableWindow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        java.awt.event.WindowStateListener windowStateListener7 = null;
        home0.addWindowStateListener(windowStateListener7);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray9 = home0.getWindowFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(windowFocusListenerArray9);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        boolean boolean10 = home0.isOpaque();
        java.awt.Color color11 = home0.getBackground();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(color11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        java.awt.Component[] componentArray9 = home6.getComponents();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        Home home12 = new Home();
        boolean boolean13 = home12.isMaximumSizeSet();
        int int14 = home10.getComponentZOrder((java.awt.Component) home12);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home10.addHierarchyBoundsListener(hierarchyBoundsListener15);
        java.awt.Dimension dimension17 = home10.getSize();
        home6.setSize(dimension17);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(componentArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        javax.swing.JTable jTable9 = null;
        home0.table = jTable9;
        boolean boolean11 = home0.isLocationByPlatform();
        java.awt.Rectangle rectangle12 = null;
        home0.setMaximizedBounds(rectangle12);
        java.awt.Graphics graphics14 = null;
        home0.print(graphics14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners("");
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        home7.setResizable(false);
        boolean boolean11 = home7.isActive();
        UserProfile userProfile12 = null;
        home7.userProfile = userProfile12;
        // The following exception was thrown during execution in test generation
        try {
            home0.setGlassPane((java.awt.Component) userProfile12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: glassPane cannot be set to null.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        home0.addJob();
        Home home5 = new Home();
        boolean boolean6 = home5.isMaximumSizeSet();
        home5.setResizable(false);
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLayeredPane jLayeredPane12 = home9.getLayeredPane();
        home5.setLayeredPane(jLayeredPane12);
        // The following exception was thrown during execution in test generation
        try {
            home0.setContentPane((java.awt.Container) home5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLayeredPane12);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        boolean boolean10 = home0.isMinimumSizeSet();
        java.awt.Container container11 = home0.getParent();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(container11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        java.util.Date date9 = home2.stringToDate("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNull(date9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        home0.setUndecorated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        boolean boolean7 = home0.isResizable();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        int int12 = home8.getComponentZOrder((java.awt.Component) home10);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener13 = null;
        home8.addHierarchyBoundsListener(hierarchyBoundsListener13);
        java.awt.Dimension dimension15 = home8.getSize();
        home0.resize(dimension15);
        javax.swing.JMenuBar jMenuBar17 = home0.getJMenuBar();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(dimension15);
        org.junit.Assert.assertNull(jMenuBar17);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        home0.clearAllInput();
        int int5 = home0.getWidth();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        home0.deleteJob();
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name hi!, locale en_GB");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        java.util.Locale locale6 = null;
        home0.setLocale(locale6);
        javax.swing.JTextField jTextField8 = home0.taskNameField;
        boolean boolean9 = home0.isDoubleBuffered();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTextField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        home7.setResizable(false);
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLabel jLabel14 = home11.taskTypeLabel;
        jLabel14.invalidate();
        home7.priority = jLabel14;
        java.awt.Component component17 = home0.add("", (java.awt.Component) jLabel14);
        java.lang.String str18 = component17.getName();
        java.lang.String str19 = component17.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]" + "'", str19, "javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        Home home6 = new Home();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        int int11 = home7.getComponentZOrder((java.awt.Component) home9);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        home7.setFocusTraversalPolicy(focusTraversalPolicy12);
        boolean boolean14 = home6.isAncestorOf((java.awt.Component) home7);
        home7.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray19 = home7.getOwnedWindows();
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = null;
        home20.setFocusTraversalPolicy(focusTraversalPolicy25);
        boolean boolean27 = home20.isActive();
        Home home28 = new Home();
        boolean boolean29 = home28.isMaximumSizeSet();
        home28.setResizable(false);
        home28.invalidate();
        home28.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton35 = home28.deleteJob;
        home20.addJob = jButton35;
        home7.addJob = jButton35;
        home0.deleteJob = jButton35;
        jButton35.show(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(windowArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jButton35);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.setVisible(true);
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        boolean boolean4 = home0.isDisplayable();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener6 = null;
        jRootPane5.addHierarchyBoundsListener(hierarchyBoundsListener6);
        boolean boolean8 = jRootPane5.isVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.BufferCapabilities bufferCapabilities3 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.createBufferStrategy(16, bufferCapabilities3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.Shape shape7 = null;
        home0.setShape(shape7);
        home0.revalidate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        boolean boolean5 = home0.isFocusTraversalPolicySet();
        java.awt.event.WindowFocusListener windowFocusListener6 = null;
        home0.addWindowFocusListener(windowFocusListener6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        java.awt.AWTEvent aWTEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.dispatchEvent(aWTEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser8 = home4.stDate;
        home0.stDate = jDateChooser8;
        java.awt.Event event10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = home0.handleEvent(event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jDateChooser8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        Home home5 = new Home();
        boolean boolean6 = home5.isMaximumSizeSet();
        java.awt.Event event7 = null;
        boolean boolean10 = home5.mouseUp(event7, 0, (int) ' ');
        Home home11 = new Home();
        java.awt.image.BufferStrategy bufferStrategy12 = home11.getBufferStrategy();
        home5.setLocationRelativeTo((java.awt.Component) home11);
        boolean boolean16 = home5.inside(0, 3);
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        boolean boolean21 = home17.isActive();
        UserProfile userProfile22 = null;
        home17.userProfile = userProfile22;
        com.toedter.calendar.JDateChooser jDateChooser24 = home17.enDate;
        Home home25 = new Home();
        boolean boolean26 = home25.isMaximumSizeSet();
        Home home27 = new Home();
        boolean boolean28 = home27.isMaximumSizeSet();
        int int29 = home25.getComponentZOrder((java.awt.Component) home27);
        java.awt.FocusTraversalPolicy focusTraversalPolicy30 = null;
        home25.setFocusTraversalPolicy(focusTraversalPolicy30);
        boolean boolean32 = home25.isActive();
        java.awt.Point point33 = home25.location();
        java.awt.Component component34 = home17.getComponentAt(point33);
        java.awt.Component component35 = home5.getComponentAt(point33);
        home0.setLocation(point33);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(bufferStrategy12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jDateChooser24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(point33);
        org.junit.Assert.assertNotNull(component34);
        org.junit.Assert.assertNotNull(component35);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = null;
        home9.setModalExclusionType(modalExclusionType12);
        java.awt.LayoutManager layoutManager14 = home9.getLayout();
        home0.setLayout(layoutManager14);
        boolean boolean16 = home0.isShowing();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        Home home5 = new Home();
        java.awt.image.BufferStrategy bufferStrategy6 = home5.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        home5.addHierarchyBoundsListener(hierarchyBoundsListener7);
        boolean boolean9 = home5.isResizable();
        home5.removeAll();
        boolean boolean11 = home5.isLightweight();
        Home home12 = new Home();
        boolean boolean13 = home12.isMaximumSizeSet();
        home12.setResizable(false);
        boolean boolean16 = home12.isActive();
        UserProfile userProfile17 = null;
        home12.userProfile = userProfile17;
        com.toedter.calendar.JDateChooser jDateChooser19 = home12.enDate;
        java.awt.image.ImageProducer imageProducer20 = null;
        java.awt.Image image21 = home12.createImage(imageProducer20);
        home5.setIconImage(image21);
        Home home25 = new Home();
        boolean boolean26 = home25.isMaximumSizeSet();
        java.awt.Event event27 = null;
        boolean boolean30 = home25.mouseUp(event27, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = home25.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage34 = home25.createVolatileImage(0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = home0.prepareImage(image21, (-1), 12, (java.awt.image.ImageObserver) home25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(bufferStrategy6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jDateChooser19);
        org.junit.Assert.assertNotNull(image21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray31);
        org.junit.Assert.assertNull(volatileImage34);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        home0.removeNotify();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        int int5 = home0.getExtendedState();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        java.util.ResourceBundle resourceBundle10 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle(resourceBundle10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        home0.addMouseWheelListener(mouseWheelListener4);
        int int6 = home0.getComponentCount();
        java.awt.Point point8 = home0.getMousePosition(false);
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(point8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.Dimension dimension4 = home0.getMaximumSize();
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(dimension4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        home0.setFocusTraversalPolicy(focusTraversalPolicy5);
        boolean boolean7 = home0.isActive();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        home8.setResizable(false);
        home8.invalidate();
        home8.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton15 = home8.deleteJob;
        home0.addJob = jButton15;
        home0.transferFocusDownCycle();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jButton15);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        boolean boolean3 = home0.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox4 = home0.priorityDropdown;
        java.lang.Class<?> wildcardClass5 = jComboBox4.getClass();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        Home home5 = new Home();
        java.awt.image.BufferStrategy bufferStrategy6 = home5.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        home5.addHierarchyBoundsListener(hierarchyBoundsListener7);
        java.awt.event.FocusEvent.Cause cause9 = null;
        boolean boolean10 = home5.requestFocusInWindow(cause9);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = home5.getFocusTraversalPolicy();
        home0.setFocusTraversalPolicy(focusTraversalPolicy11);
        int int13 = home0.getState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(bufferStrategy6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        int int10 = home0.getX();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 460 + "'", int10 == 460);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        home0.rsp = "hi!";
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        int int13 = home9.getComponentZOrder((java.awt.Component) home11);
        javax.swing.JRootPane jRootPane14 = home11.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType15 = null;
        home11.setModalExclusionType(modalExclusionType15);
        float float17 = home11.getAlignmentY();
        java.awt.Dimension dimension18 = home11.size();
        home0.resize(dimension18);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jRootPane14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.5f + "'", float17 == 0.5f);
        org.junit.Assert.assertNotNull(dimension18);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        boolean boolean6 = home0.isLightweight();
        boolean boolean7 = home0.isValid();
        java.awt.Dimension dimension8 = home0.minimumSize();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dimension8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home14.isActive();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        home22.invalidate();
        home22.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton29 = home22.deleteJob;
        home14.addJob = jButton29;
        home1.addJob = jButton29;
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        Home home34 = new Home();
        boolean boolean35 = home34.isMaximumSizeSet();
        int int36 = home32.getComponentZOrder((java.awt.Component) home34);
        javax.swing.JRootPane jRootPane37 = home32.getRootPane();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener38 = null;
        jRootPane37.addHierarchyBoundsListener(hierarchyBoundsListener38);
        int int40 = jButton29.getComponentZOrder((java.awt.Component) jRootPane37);
        java.awt.event.KeyListener keyListener41 = null;
        jButton29.addKeyListener(keyListener41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(jRootPane37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.setUndecorated(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Home home0 = new Home();
        home0.repaint(0L, (int) (short) 1, 0, (int) (short) 100, (int) '#');
        java.awt.Rectangle rectangle7 = home0.getMaximizedBounds();
        org.junit.Assert.assertNull(rectangle7);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        home0.clearAllInput();
        boolean boolean5 = home0.isActive();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        java.awt.Event event6 = null;
        boolean boolean8 = jRootPane5.keyDown(event6, (int) (byte) 100);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = jRootPane5.handleEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        javax.swing.JTextField jTextField4 = home0.taskEndField;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertNull(jTextField4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        boolean boolean11 = home0.inside(0, 3);
        Home home12 = new Home();
        boolean boolean13 = home12.isMaximumSizeSet();
        home12.setResizable(false);
        boolean boolean16 = home12.isActive();
        UserProfile userProfile17 = null;
        home12.userProfile = userProfile17;
        com.toedter.calendar.JDateChooser jDateChooser19 = home12.enDate;
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = null;
        home20.setFocusTraversalPolicy(focusTraversalPolicy25);
        boolean boolean27 = home20.isActive();
        java.awt.Point point28 = home20.location();
        java.awt.Component component29 = home12.getComponentAt(point28);
        java.awt.Component component30 = home0.getComponentAt(point28);
        java.awt.Window.Type type31 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.setType(type31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jDateChooser19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertNotNull(component30);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        boolean boolean7 = home0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        java.awt.event.MouseListener[] mouseListenerArray6 = home0.getMouseListeners();
        float float7 = home0.getAlignmentY();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component9 = home0.getComponent(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        javax.swing.JTable jTable9 = null;
        home0.table = jTable9;
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.setResizable(false);
        boolean boolean15 = home11.isActive();
        UserProfile userProfile16 = null;
        home11.userProfile = userProfile16;
        Home home18 = new Home();
        java.awt.image.BufferStrategy bufferStrategy19 = home18.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener20 = null;
        home18.addHierarchyBoundsListener(hierarchyBoundsListener20);
        boolean boolean22 = home18.isResizable();
        java.awt.Dimension dimension23 = null;
        home18.setMinimumSize(dimension23);
        Home home25 = new Home();
        java.awt.Cursor cursor26 = home25.getCursor();
        home25.removeNotify();
        javax.swing.JLabel jLabel28 = home25.taskTypeLabel;
        boolean boolean29 = home25.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser30 = home25.enDate;
        home18.stDate = jDateChooser30;
        javax.swing.JTextArea jTextArea32 = home18.taskDescField;
        home11.setLocationRelativeTo((java.awt.Component) jTextArea32);
        home0.taskDescField = jTextArea32;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bufferStrategy19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cursor26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jDateChooser30);
        org.junit.Assert.assertNotNull(jTextArea32);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        boolean boolean8 = home4.isActive();
        UserProfile userProfile9 = null;
        home4.userProfile = userProfile9;
        com.toedter.calendar.JDateChooser jDateChooser11 = home4.enDate;
        java.awt.image.ImageProducer imageProducer12 = null;
        java.awt.Image image13 = home4.createImage(imageProducer12);
        boolean boolean19 = home0.imageUpdate(image13, 2, 112, 8, (int) ' ', (int) (short) 0);
        java.awt.Container container20 = home0.getContentPane();
        boolean boolean21 = home0.isVisible();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jDateChooser11);
        org.junit.Assert.assertNotNull(image13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = null;
        home9.setModalExclusionType(modalExclusionType12);
        java.awt.LayoutManager layoutManager14 = home9.getLayout();
        home0.setLayout(layoutManager14);
        java.util.ResourceBundle resourceBundle16 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle(resourceBundle16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(layoutManager14);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        home9.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser13 = home9.stDate;
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        jDateChooser13.addInputMethodListener(inputMethodListener14);
        boolean boolean16 = jDateChooser13.isDisplayable();
        home1.panel = jDateChooser13;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jDateChooser13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        java.util.Locale locale6 = null;
        home0.setLocale(locale6);
        int int8 = home0.getDefaultCloseOperation();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Graphics graphics6 = null;
        home0.paint(graphics6);
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        home0.addMouseMotionListener(mouseMotionListener8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        Home home7 = new Home();
        java.awt.Cursor cursor8 = home7.getCursor();
        home7.removeNotify();
        javax.swing.JLabel jLabel10 = home7.taskTypeLabel;
        boolean boolean11 = home7.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser12 = home7.enDate;
        home0.stDate = jDateChooser12;
        java.awt.Event event14 = null;
        boolean boolean17 = home0.mouseUp(event14, 1000, 0);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cursor8);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jDateChooser12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        home0.repaint((long) (short) 1, 800, (int) '4', (int) '4', (int) (short) 0);
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = home13.lblScheduledBy;
        home0.taskTypeLabel = jLabel14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel14);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        boolean boolean8 = home4.isActive();
        UserProfile userProfile9 = null;
        home4.userProfile = userProfile9;
        com.toedter.calendar.JDateChooser jDateChooser11 = home4.enDate;
        java.awt.image.ImageProducer imageProducer12 = null;
        java.awt.Image image13 = home4.createImage(imageProducer12);
        boolean boolean19 = home0.imageUpdate(image13, 2, 112, 8, (int) ' ', (int) (short) 0);
        java.awt.Container container20 = home0.getContentPane();
        java.awt.Dimension dimension21 = home0.minimumSize();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jDateChooser11);
        org.junit.Assert.assertNotNull(image13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(container20);
        org.junit.Assert.assertNotNull(dimension21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        home0.toFront();
        java.awt.event.FocusListener focusListener8 = null;
        home0.removeFocusListener(focusListener8);
        java.awt.event.MouseListener[] mouseListenerArray10 = home0.getMouseListeners();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        int int15 = home11.getComponentZOrder((java.awt.Component) home13);
        javax.swing.JRootPane jRootPane16 = home13.getRootPane();
        javax.swing.JMenuBar jMenuBar17 = home13.getJMenuBar();
        java.awt.Graphics graphics18 = home13.getGraphics();
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        home19.setResizable(false);
        Home home23 = new Home();
        boolean boolean24 = home23.isMaximumSizeSet();
        home23.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser27 = home23.stDate;
        home19.stDate = jDateChooser27;
        javax.swing.JButton jButton29 = home19.deleteJob;
        home13.updateJob = jButton29;
        home0.deleteJob = jButton29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(mouseListenerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jRootPane16);
        org.junit.Assert.assertNull(jMenuBar17);
        org.junit.Assert.assertNull(graphics18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jDateChooser27);
        org.junit.Assert.assertNotNull(jButton29);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        home0.enable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        home0.toFront();
        java.awt.event.FocusListener focusListener8 = null;
        home0.removeFocusListener(focusListener8);
        java.awt.event.FocusListener[] focusListenerArray10 = home0.getFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(focusListenerArray10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        home0.nextFocus();
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        home0.deleteJob();
        java.lang.String str7 = home0.rsp;
        java.awt.event.ActionEvent actionEvent8 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Please select a task first to delete" + "'", str7, "Please select a task first to delete");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point8 = home0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        home7.setResizable(false);
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLabel jLabel14 = home11.taskTypeLabel;
        jLabel14.invalidate();
        home7.priority = jLabel14;
        java.awt.Component component17 = home0.add("", (java.awt.Component) jLabel14);
        Home home18 = new Home();
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        home19.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser23 = home19.stDate;
        home18.enDate = jDateChooser23;
        home0.stDate = jDateChooser23;
        java.awt.Graphics graphics26 = null;
        jDateChooser23.paintAll(graphics26);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jDateChooser23);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.lang.String str3 = home0.toString();
        org.junit.Assert.assertNotNull(cursor1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str3, "Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        Home home0 = new Home();
        java.awt.BufferCapabilities bufferCapabilities2 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.createBufferStrategy((int) 'a', bufferCapabilities2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.event.FocusListener[] focusListenerArray7 = home0.getFocusListeners();
        int int8 = home0.getCursorType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(focusListenerArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        java.awt.event.WindowStateListener windowStateListener7 = null;
        home0.addWindowStateListener(windowStateListener7);
        java.awt.Component component9 = home0.getMostRecentFocusOwner();
        boolean boolean10 = home0.getFocusableWindowState();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        boolean boolean3 = home0.getIgnoreRepaint();
        java.awt.image.BufferStrategy bufferStrategy4 = home0.getBufferStrategy();
        home0.setResizable(true);
        Home home7 = new Home();
        java.awt.image.BufferStrategy bufferStrategy8 = home7.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        home7.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = home7.requestFocusInWindow(cause11);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = home7.getFocusTraversalPolicy();
        home0.setFocusTraversalPolicy(focusTraversalPolicy13);
        home0.setName("Please select a task first to delete");
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferStrategy4);
        org.junit.Assert.assertNull(bufferStrategy8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        java.awt.Cursor cursor5 = home4.getCursor();
        home4.removeNotify();
        javax.swing.JLabel jLabel7 = home4.taskTypeLabel;
        jLabel7.invalidate();
        home0.priority = jLabel7;
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        java.awt.Event event12 = null;
        boolean boolean15 = home10.mouseUp(event12, 0, (int) ' ');
        Home home16 = new Home();
        java.awt.image.BufferStrategy bufferStrategy17 = home16.getBufferStrategy();
        home10.setLocationRelativeTo((java.awt.Component) home16);
        java.awt.Component[] componentArray19 = home16.getComponents();
        // The following exception was thrown during execution in test generation
        try {
            home0.setGlassPane((java.awt.Component) home16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor5);
        org.junit.Assert.assertNotNull(jLabel7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertNotNull(componentArray19);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        home0.removeAll();
        java.util.ResourceBundle resourceBundle5 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle(resourceBundle5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.lblScheduledBy;
        java.awt.event.MouseMotionListener mouseMotionListener2 = null;
        home0.removeMouseMotionListener(mouseMotionListener2);
        org.junit.Assert.assertNotNull(jLabel1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        home0.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home0.setLocationByPlatform(true);
        java.awt.Event event18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = home0.handleEvent(event18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        home0.addWindowFocusListener(windowFocusListener3);
        Home home5 = new Home();
        java.awt.Cursor cursor6 = home5.getCursor();
        home5.removeNotify();
        javax.swing.JLabel jLabel8 = home5.taskTypeLabel;
        boolean boolean9 = jLabel8.isEnabled();
        home0.taskNameLabel = jLabel8;
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.repaint(1L);
        // The following exception was thrown during execution in test generation
        try {
            jLabel8.setComponentZOrder((java.awt.Component) home11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(cursor6);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.Dimension dimension7 = home0.getSize();
        boolean boolean8 = home0.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        boolean boolean3 = home0.getIgnoreRepaint();
        java.awt.Event event4 = null;
        boolean boolean7 = home0.mouseExit(event4, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.Toolkit toolkit4 = home0.getToolkit();
        Home home5 = new Home();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        int int10 = home6.getComponentZOrder((java.awt.Component) home8);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
        home6.setFocusTraversalPolicy(focusTraversalPolicy11);
        boolean boolean13 = home5.isAncestorOf((java.awt.Component) home6);
        home6.clearAllInput();
        Home home15 = new Home();
        java.awt.image.BufferStrategy bufferStrategy16 = home15.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        home15.addHierarchyBoundsListener(hierarchyBoundsListener17);
        boolean boolean19 = home15.isResizable();
        home15.removeAll();
        boolean boolean21 = home15.isLightweight();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        boolean boolean26 = home22.isActive();
        UserProfile userProfile27 = null;
        home22.userProfile = userProfile27;
        com.toedter.calendar.JDateChooser jDateChooser29 = home22.enDate;
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = home22.createImage(imageProducer30);
        home15.setIconImage(image31);
        Home home33 = new Home();
        java.awt.image.BufferStrategy bufferStrategy34 = home33.getBufferStrategy();
        int int35 = home33.getY();
        java.awt.image.BufferStrategy bufferStrategy36 = home33.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener37 = null;
        home33.addMouseWheelListener(mouseWheelListener37);
        int int39 = home33.getComponentCount();
        int int40 = home6.checkImage(image31, (java.awt.image.ImageObserver) home33);
        Home home43 = new Home();
        java.awt.image.BufferStrategy bufferStrategy44 = home43.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
        home43.addHierarchyBoundsListener(hierarchyBoundsListener45);
        boolean boolean47 = home43.isResizable();
        java.awt.Dimension dimension48 = null;
        home43.setMinimumSize(dimension48);
        int int50 = home0.checkImage(image31, 12, 0, (java.awt.image.ImageObserver) home43);
        java.awt.Event event51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = home0.handleEvent(event51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(toolkit4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bufferStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jDateChooser29);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertNull(bufferStrategy34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNull(bufferStrategy36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(bufferStrategy44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component7 = home0.getComponent(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home14.isActive();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        home22.invalidate();
        home22.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton29 = home22.deleteJob;
        home14.addJob = jButton29;
        home1.addJob = jButton29;
        javax.swing.JTextArea jTextArea32 = home1.taskDescField;
        Home home33 = new Home();
        java.awt.Cursor cursor34 = home33.getCursor();
        home33.removeNotify();
        javax.swing.JLayeredPane jLayeredPane36 = home33.getLayeredPane();
        Home home37 = new Home();
        boolean boolean38 = home37.isMaximumSizeSet();
        Home home39 = new Home();
        boolean boolean40 = home39.isMaximumSizeSet();
        int int41 = home37.getComponentZOrder((java.awt.Component) home39);
        java.awt.FocusTraversalPolicy focusTraversalPolicy42 = null;
        home37.setFocusTraversalPolicy(focusTraversalPolicy42);
        boolean boolean44 = home37.isActive();
        java.awt.Point point45 = home37.location();
        home33.setLocation(point45);
        java.awt.Shape shape47 = null;
        home33.setShape(shape47);
        home33.move(10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            jTextArea32.setComponentZOrder((java.awt.Component) home33, 800);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton29);
        org.junit.Assert.assertNotNull(jTextArea32);
        org.junit.Assert.assertNotNull(cursor34);
        org.junit.Assert.assertNotNull(jLayeredPane36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(point45);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        Home home7 = new Home();
        java.awt.image.BufferStrategy bufferStrategy8 = home7.getBufferStrategy();
        int int9 = home7.getY();
        java.awt.image.BufferStrategy bufferStrategy10 = home7.getBufferStrategy();
        home7.setFocusableWindowState(false);
        java.awt.Window.Type type13 = home7.getType();
        home0.setType(type13);
        javax.swing.TransferHandler transferHandler15 = null;
        home0.setTransferHandler(transferHandler15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(bufferStrategy8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 112 + "'", int9 == 112);
        org.junit.Assert.assertNull(bufferStrategy10);
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + java.awt.Window.Type.NORMAL + "'", type13.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        Home home13 = new Home();
        java.awt.image.BufferStrategy bufferStrategy14 = home13.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home13.addHierarchyBoundsListener(hierarchyBoundsListener15);
        boolean boolean17 = home13.isResizable();
        home13.removeAll();
        boolean boolean19 = home13.isLightweight();
        home0.setLocationRelativeTo((java.awt.Component) home13);
        home0.clearAllInput();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(bufferStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        home0.firePropertyChange("", (float) ' ', (float) '4');
        java.awt.Graphics graphics13 = home0.getGraphics();
        java.util.ResourceBundle resourceBundle14 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle(resourceBundle14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ResourceBundle.getLocale()\" because \"bdl\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNull(graphics13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.event.FocusListener[] focusListenerArray7 = home0.getFocusListeners();
        javax.swing.JButton jButton8 = home0.addJob;
        java.awt.Component component9 = home0.getGlassPane();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(focusListenerArray7);
        org.junit.Assert.assertNotNull(jButton8);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        home0.lblScheduledBy = jLabel20;
        javax.swing.JPanel jPanel25 = home0.panel;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        java.awt.Event event12 = null;
        boolean boolean15 = home10.mouseUp(event12, 0, (int) ' ');
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        Home home21 = new Home();
        java.awt.Cursor cursor22 = home21.getCursor();
        home21.removeNotify();
        javax.swing.JLabel jLabel24 = home21.taskTypeLabel;
        jLabel24.invalidate();
        home17.priority = jLabel24;
        java.awt.Component component27 = home10.add("", (java.awt.Component) jLabel24);
        home0.taskTypeLabel = jLabel24;
        java.awt.Color color29 = jLabel24.getForeground();
        java.awt.event.MouseListener[] mouseListenerArray30 = jLabel24.getMouseListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cursor22);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertNotNull(mouseListenerArray30);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        Home home13 = new Home();
        java.awt.image.BufferStrategy bufferStrategy14 = home13.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home13.addHierarchyBoundsListener(hierarchyBoundsListener15);
        boolean boolean17 = home13.isResizable();
        home13.removeAll();
        boolean boolean19 = home13.isLightweight();
        home0.setLocationRelativeTo((java.awt.Component) home13);
        java.lang.Object obj21 = home0.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(bufferStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray9 = home0.getHierarchyBoundsListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        java.awt.dnd.DropTarget dropTarget10 = home0.getDropTarget();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        int int15 = home11.getComponentZOrder((java.awt.Component) home13);
        javax.swing.JRootPane jRootPane16 = home13.getRootPane();
        javax.swing.JMenuBar jMenuBar17 = home13.getJMenuBar();
        java.awt.Graphics graphics18 = home13.getGraphics();
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        home19.setResizable(false);
        Home home23 = new Home();
        boolean boolean24 = home23.isMaximumSizeSet();
        home23.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser27 = home23.stDate;
        home19.stDate = jDateChooser27;
        javax.swing.JButton jButton29 = home19.deleteJob;
        home13.updateJob = jButton29;
        home0.deleteJob = jButton29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertNull(dropTarget10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jRootPane16);
        org.junit.Assert.assertNull(jMenuBar17);
        org.junit.Assert.assertNull(graphics18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jDateChooser27);
        org.junit.Assert.assertNotNull(jButton29);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        java.util.Date date7 = home0.stringToDate("javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]");
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(date7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isBackgroundSet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component5 = home0.getComponent(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        boolean boolean11 = home0.inside(0, 3);
        Home home12 = new Home();
        java.awt.Cursor cursor13 = home12.getCursor();
        java.awt.ImageCapabilities imageCapabilities16 = null;
        java.awt.image.VolatileImage volatileImage17 = home12.createVolatileImage(10, (int) '4', imageCapabilities16);
        java.awt.Container container18 = home12.getParent();
        javax.swing.JButton jButton19 = null;
        home12.updateJob = jButton19;
        Home home21 = new Home();
        java.awt.Cursor cursor22 = home21.getCursor();
        home21.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType24 = null;
        home21.setModalExclusionType(modalExclusionType24);
        java.awt.LayoutManager layoutManager26 = home21.getLayout();
        home12.setLayout(layoutManager26);
        home0.setLayout(layoutManager26);
        home0.setCursor(6);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cursor13);
        org.junit.Assert.assertNull(volatileImage17);
        org.junit.Assert.assertNull(container18);
        org.junit.Assert.assertNotNull(cursor22);
        org.junit.Assert.assertNotNull(layoutManager26);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        javax.swing.TransferHandler transferHandler2 = home0.getTransferHandler();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNull(transferHandler2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        javax.swing.JMenuBar jMenuBar6 = home2.getJMenuBar();
        java.awt.Graphics graphics7 = home2.getGraphics();
        home2.repaint(100L, 32, 1000, 6, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNull(jMenuBar6);
        org.junit.Assert.assertNull(graphics7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        java.awt.Event event16 = null;
        boolean boolean19 = home14.mouseUp(event16, 0, (int) ' ');
        Home home21 = new Home();
        boolean boolean22 = home21.isMaximumSizeSet();
        home21.setResizable(false);
        Home home25 = new Home();
        java.awt.Cursor cursor26 = home25.getCursor();
        home25.removeNotify();
        javax.swing.JLabel jLabel28 = home25.taskTypeLabel;
        jLabel28.invalidate();
        home21.priority = jLabel28;
        java.awt.Component component31 = home14.add("", (java.awt.Component) jLabel28);
        Home home32 = new Home();
        Home home33 = new Home();
        boolean boolean34 = home33.isMaximumSizeSet();
        home33.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser37 = home33.stDate;
        home32.enDate = jDateChooser37;
        home14.stDate = jDateChooser37;
        java.awt.Dimension dimension40 = jDateChooser37.getSize();
        home1.setPreferredSize(dimension40);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cursor26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(component31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jDateChooser37);
        org.junit.Assert.assertNotNull(dimension40);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        home0.firePropertyChange("hi!", (float) (byte) 1, (float) (byte) 1);
        java.awt.Event event7 = null;
        boolean boolean10 = home0.mouseEnter(event7, 6, (int) (byte) 0);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.invalidate();
        home0.setFocusTraversalKeysEnabled(false);
        java.awt.ComponentOrientation componentOrientation7 = home0.getComponentOrientation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(componentOrientation7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType3 = null;
        home0.setModalExclusionType(modalExclusionType3);
        java.awt.LayoutManager layoutManager5 = home0.getLayout();
        javax.swing.JLabel jLabel6 = home0.taskStartLabel;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertNotNull(jLabel6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.Dimension dimension7 = home0.getMinimumSize();
        java.awt.Event event8 = null;
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLayeredPane jLayeredPane12 = home9.getLayeredPane();
        boolean boolean13 = home0.gotFocus(event8, (java.lang.Object) jLayeredPane12);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLayeredPane12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        javax.swing.JComboBox jComboBox10 = home0.scheduleDropdown;
        boolean boolean13 = home0.contains(2, 16);
        boolean boolean14 = home0.getFocusableWindowState();
        java.awt.Graphics graphics15 = null;
        home0.print(graphics15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jComboBox10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        Home home10 = new Home();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser15 = home11.stDate;
        home10.enDate = jDateChooser15;
        home0.enDate = jDateChooser15;
        java.awt.event.FocusListener[] focusListenerArray18 = jDateChooser15.getFocusListeners();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        jDateChooser15.removeHierarchyBoundsListener(hierarchyBoundsListener19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jDateChooser15);
        org.junit.Assert.assertNotNull(focusListenerArray18);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.MenuBar menuBar7 = null;
        home0.setMenuBar(menuBar7);
        javax.swing.JTable jTable9 = home0.table;
        java.awt.Event event10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = home0.handleEvent(event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jTable9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        home0.toFront();
        javax.swing.JTextField jTextField8 = null;
        home0.taskTypeField = jTextField8;
        int int10 = home0.getY();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener9 = null;
        home7.addMouseListener(mouseListener9);
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        home7.addInputMethodListener(inputMethodListener11);
        home7.transferFocusBackward();
        java.lang.Object obj14 = home7.getTreeLock();
        // The following exception was thrown during execution in test generation
        try {
            home0.setGlassPane((java.awt.Component) home7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = home0.requestFocusInWindow(cause4);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = home0.getFocusTraversalPolicy();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        int int11 = home7.getComponentZOrder((java.awt.Component) home9);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        home7.addHierarchyBoundsListener(hierarchyBoundsListener12);
        java.awt.MenuBar menuBar14 = null;
        home7.setMenuBar(menuBar14);
        int int16 = home7.getHeight();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component17 = home0.add((java.awt.Component) home7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 800 + "'", int16 == 800);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        home0.setFocusableWindowState(false);
        java.awt.event.KeyListener[] keyListenerArray6 = home0.getKeyListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(keyListenerArray6);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        home0.firePropertyChange("", (float) ' ', (float) '4');
        java.awt.Graphics graphics13 = home0.getGraphics();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home14.isActive();
        java.awt.Point point22 = home14.location();
        home0.setLocation(point22);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNull(graphics13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(point22);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        boolean boolean5 = home0.isFocusTraversalPolicySet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener8 = null;
        home6.addMouseListener(mouseListener8);
        javax.swing.table.DefaultTableModel defaultTableModel10 = home6.tableModel;
        home0.tableModel = defaultTableModel10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(defaultTableModel10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        Home home10 = new Home();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser15 = home11.stDate;
        home10.enDate = jDateChooser15;
        home0.addPropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jDateChooser15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.FocusTraversalPolicy focusTraversalPolicy5 = null;
        home0.setFocusTraversalPolicy(focusTraversalPolicy5);
        home0.invalidate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.util.Locale locale8 = null;
        home0.setLocale(locale8);
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        java.awt.ComponentOrientation componentOrientation15 = home10.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation15);
        int int17 = home0.getWidth();
        home0.toBack();
        home0.firePropertyChange("", '4', '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.lblScheduledBy;
        home0.deleteJob();
        java.awt.Image image3 = home0.getIconImage();
        java.awt.event.InputMethodListener[] inputMethodListenerArray4 = home0.getInputMethodListeners();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(inputMethodListenerArray4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        java.awt.Cursor cursor5 = home4.getCursor();
        home4.removeNotify();
        javax.swing.JLayeredPane jLayeredPane7 = home4.getLayeredPane();
        home0.setLayeredPane(jLayeredPane7);
        java.lang.String str9 = home0.rsp;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor5);
        org.junit.Assert.assertNotNull(jLayeredPane7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        java.awt.Graphics graphics10 = null;
        home0.print(graphics10);
        java.awt.Component component12 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.remove(component12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        java.awt.Image image5 = null;
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        java.awt.Event event10 = null;
        boolean boolean13 = home8.mouseUp(event10, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray14 = home8.getHierarchyBoundsListeners();
        boolean boolean15 = home0.prepareImage(image5, (int) (byte) 0, (int) (short) 0, (java.awt.image.ImageObserver) home8);
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        Home home18 = new Home();
        boolean boolean19 = home18.isMaximumSizeSet();
        int int20 = home16.getComponentZOrder((java.awt.Component) home18);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener21 = null;
        home16.addHierarchyBoundsListener(hierarchyBoundsListener21);
        java.awt.MenuBar menuBar23 = null;
        home16.setMenuBar(menuBar23);
        javax.swing.JTable jTable25 = home16.table;
        home0.table = jTable25;
        javax.swing.JRootPane jRootPane27 = home0.getRootPane();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jTable25);
        org.junit.Assert.assertNotNull(jRootPane27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        home0.clearAllInput();
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLabel jLabel12 = home9.taskTypeLabel;
        boolean boolean13 = jLabel12.isEnabled();
        boolean boolean14 = jLabel12.isFontSet();
        boolean boolean15 = jLabel12.isFontSet();
        home0.taskEndLabel = jLabel12;
        boolean boolean17 = home0.isFocusTraversalPolicySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLabel12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        javax.swing.JTable jTable9 = null;
        home0.table = jTable9;
        java.awt.BufferCapabilities bufferCapabilities12 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.createBufferStrategy((int) (byte) 100, bufferCapabilities12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No capabilities specified");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = home0.requestFocusInWindow(cause4);
        java.lang.String str6 = home0.getWarningString();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        Home home6 = new Home();
        java.awt.Cursor cursor7 = home6.getCursor();
        home6.removeNotify();
        javax.swing.JLabel jLabel9 = home6.taskTypeLabel;
        boolean boolean10 = jLabel9.isEnabled();
        java.awt.ImageCapabilities imageCapabilities13 = null;
        java.awt.image.VolatileImage volatileImage14 = jLabel9.createVolatileImage((int) ' ', (int) (short) 10, imageCapabilities13);
        int int15 = home0.getComponentZOrder((java.awt.Component) jLabel9);
        boolean boolean16 = home0.isAutoRequestFocus();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertNotNull(cursor7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(volatileImage14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        home0.clearAllInput();
        home0.show(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        boolean boolean3 = home0.getIgnoreRepaint();
        java.awt.image.BufferStrategy bufferStrategy4 = home0.getBufferStrategy();
        boolean boolean5 = home0.isEnabled();
        java.awt.Component component6 = home0.getFocusOwner();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = home0.postEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(bufferStrategy4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(component6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.clearAllInput();
        Home home10 = new Home();
        java.awt.image.BufferStrategy bufferStrategy11 = home10.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        home10.addHierarchyBoundsListener(hierarchyBoundsListener12);
        boolean boolean14 = home10.isResizable();
        home10.removeAll();
        boolean boolean16 = home10.isLightweight();
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        boolean boolean21 = home17.isActive();
        UserProfile userProfile22 = null;
        home17.userProfile = userProfile22;
        com.toedter.calendar.JDateChooser jDateChooser24 = home17.enDate;
        java.awt.image.ImageProducer imageProducer25 = null;
        java.awt.Image image26 = home17.createImage(imageProducer25);
        home10.setIconImage(image26);
        Home home28 = new Home();
        java.awt.image.BufferStrategy bufferStrategy29 = home28.getBufferStrategy();
        int int30 = home28.getY();
        java.awt.image.BufferStrategy bufferStrategy31 = home28.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener32 = null;
        home28.addMouseWheelListener(mouseWheelListener32);
        int int34 = home28.getComponentCount();
        int int35 = home1.checkImage(image26, (java.awt.image.ImageObserver) home28);
        home28.setFocusableWindowState(true);
        java.io.PrintWriter printWriter38 = null;
        // The following exception was thrown during execution in test generation
        try {
            home28.list(printWriter38, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bufferStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jDateChooser24);
        org.junit.Assert.assertNotNull(image26);
        org.junit.Assert.assertNull(bufferStrategy29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 112 + "'", int30 == 112);
        org.junit.Assert.assertNull(bufferStrategy31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        home0.lblScheduledBy = jLabel20;
        java.awt.image.ImageProducer imageProducer25 = null;
        java.awt.Image image26 = home0.createImage(imageProducer25);
        home0.setCursor(0);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNotNull(image26);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.util.Locale locale8 = null;
        home0.setLocale(locale8);
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        java.awt.ComponentOrientation componentOrientation15 = home10.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation15);
        java.awt.Event event17 = null;
        java.lang.Object obj18 = null;
        boolean boolean19 = home0.gotFocus(event17, obj18);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        float float9 = home6.getAlignmentX();
        home6.enableInputMethods(true);
        boolean boolean14 = home6.inside((int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point15 = home6.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        java.awt.event.WindowFocusListener windowFocusListener8 = null;
        home0.addWindowFocusListener(windowFocusListener8);
        int int10 = home0.getY();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 112 + "'", int10 == 112);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.event.FocusListener[] focusListenerArray7 = home0.getFocusListeners();
        java.awt.Window window8 = home0.getOwner();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(focusListenerArray7);
        org.junit.Assert.assertNull(window8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.clearAllInput();
        home1.dispose();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.awt.Window[] windowArray9 = home0.getOwnedWindows();
        java.awt.event.WindowStateListener[] windowStateListenerArray10 = home0.getWindowStateListeners();
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLabel jLabel14 = home11.taskTypeLabel;
        boolean boolean15 = home11.isDisplayable();
        java.awt.ComponentOrientation componentOrientation16 = home11.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation16);
        java.awt.Window window18 = home0.getOwner();
        // The following exception was thrown during execution in test generation
        try {
            window18.setFocusCycleRoot(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray9);
        org.junit.Assert.assertNotNull(windowStateListenerArray10);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(componentOrientation16);
        org.junit.Assert.assertNull(window18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.list();
        boolean boolean10 = home1.isBackgroundSet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        int int7 = home0.getDefaultCloseOperation();
        java.awt.event.ContainerListener containerListener8 = null;
        home0.removeContainerListener(containerListener8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        home0.firePropertyChange("", (float) ' ', (float) '4');
        java.awt.Graphics graphics13 = home0.getGraphics();
        java.awt.Cursor cursor14 = home0.getCursor();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNull(graphics13);
        org.junit.Assert.assertNotNull(cursor14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        // The following exception was thrown during execution in test generation
        try {
            home1.setOpacity((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is decorated");
        } catch (java.awt.IllegalComponentStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        java.awt.Cursor cursor5 = home4.getCursor();
        home4.removeNotify();
        javax.swing.JLabel jLabel7 = home4.taskTypeLabel;
        jLabel7.invalidate();
        home0.priority = jLabel7;
        boolean boolean10 = jLabel7.getFocusTraversalKeysEnabled();
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        java.awt.ImageCapabilities imageCapabilities15 = null;
        java.awt.image.VolatileImage volatileImage16 = home11.createVolatileImage(10, (int) '4', imageCapabilities15);
        java.awt.Container container17 = home11.getParent();
        javax.swing.JButton jButton18 = null;
        home11.updateJob = jButton18;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component21 = jLabel7.add((java.awt.Component) jButton18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor5);
        org.junit.Assert.assertNotNull(jLabel7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNull(volatileImage16);
        org.junit.Assert.assertNull(container17);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        int int10 = home0.getComponentCount();
        java.awt.event.HierarchyListener[] hierarchyListenerArray11 = home0.getHierarchyListeners();
        boolean boolean12 = home0.hasFocus();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(hierarchyListenerArray11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        javax.swing.JLabel jLabel9 = home0.priority;
        javax.swing.JComboBox jComboBox10 = home0.scheduleDropdown;
        boolean boolean13 = home0.contains(2, 16);
        boolean boolean14 = home0.getFocusableWindowState();
        java.util.Locale locale15 = null;
        home0.setLocale(locale15);
        java.awt.Event event17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = home0.postEvent(event17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jComboBox10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        Home home5 = new Home();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        home6.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        home5.enDate = jDateChooser10;
        jDateChooser10.list();
        home0.removePropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser10);
        java.awt.event.ContainerListener[] containerListenerArray14 = home0.getContainerListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jDateChooser10);
        org.junit.Assert.assertNotNull(containerListenerArray14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener3 = null;
        home0.addWindowFocusListener(windowFocusListener3);
        boolean boolean5 = home0.isShowing();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.util.Locale locale8 = null;
        home0.setLocale(locale8);
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        java.awt.ComponentOrientation componentOrientation15 = home10.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation15);
        int int17 = home0.getWidth();
        home0.toBack();
        java.awt.MenuBar menuBar19 = null;
        home0.setMenuBar(menuBar19);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        home0.addJob();
        java.awt.Component component9 = home0.getGlassPane();
        boolean boolean10 = home0.isValid();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = home1.getFocusTraversalPolicy();
        java.lang.String str14 = home1.rsp;
        Home home15 = new Home();
        java.awt.Cursor cursor16 = home15.getCursor();
        home1.setCursor(cursor16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(cursor16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        java.awt.Event event12 = null;
        boolean boolean15 = home10.mouseUp(event12, 0, (int) ' ');
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        Home home21 = new Home();
        java.awt.Cursor cursor22 = home21.getCursor();
        home21.removeNotify();
        javax.swing.JLabel jLabel24 = home21.taskTypeLabel;
        jLabel24.invalidate();
        home17.priority = jLabel24;
        java.awt.Component component27 = home10.add("", (java.awt.Component) jLabel24);
        home0.taskTypeLabel = jLabel24;
        java.lang.String str29 = home0.rsp;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cursor22);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        java.awt.Event event4 = null;
        boolean boolean7 = home2.mouseUp(event4, 0, (int) ' ');
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        home9.setResizable(false);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        home13.removeNotify();
        javax.swing.JLabel jLabel16 = home13.taskTypeLabel;
        jLabel16.invalidate();
        home9.priority = jLabel16;
        java.awt.Component component19 = home2.add("", (java.awt.Component) jLabel16);
        Home home20 = new Home();
        Home home21 = new Home();
        boolean boolean22 = home21.isMaximumSizeSet();
        home21.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser25 = home21.stDate;
        home20.enDate = jDateChooser25;
        home2.stDate = jDateChooser25;
        Home home28 = new Home();
        boolean boolean29 = home28.isMaximumSizeSet();
        java.awt.Event event30 = null;
        boolean boolean33 = home28.mouseUp(event30, 0, (int) ' ');
        Home home35 = new Home();
        boolean boolean36 = home35.isMaximumSizeSet();
        home35.setResizable(false);
        Home home39 = new Home();
        java.awt.Cursor cursor40 = home39.getCursor();
        home39.removeNotify();
        javax.swing.JLabel jLabel42 = home39.taskTypeLabel;
        jLabel42.invalidate();
        home35.priority = jLabel42;
        java.awt.Component component45 = home28.add("", (java.awt.Component) jLabel42);
        int int46 = home2.getComponentZOrder((java.awt.Component) jLabel42);
        Home home48 = new Home();
        java.awt.image.BufferStrategy bufferStrategy49 = home48.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener50 = null;
        home48.addHierarchyBoundsListener(hierarchyBoundsListener50);
        boolean boolean52 = home48.isResizable();
        java.awt.Dimension dimension53 = null;
        home48.setMinimumSize(dimension53);
        Home home55 = new Home();
        java.awt.Cursor cursor56 = home55.getCursor();
        home55.removeNotify();
        javax.swing.JLabel jLabel58 = home55.taskTypeLabel;
        boolean boolean59 = home55.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser60 = home55.enDate;
        home48.stDate = jDateChooser60;
        jLabel42.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener) jDateChooser60);
        home0.remove((java.awt.Component) jLabel42);
        java.awt.Color color64 = home0.getForeground();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertNotNull(jLabel16);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jDateChooser25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cursor40);
        org.junit.Assert.assertNotNull(jLabel42);
        org.junit.Assert.assertNotNull(component45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNull(bufferStrategy49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(cursor56);
        org.junit.Assert.assertNotNull(jLabel58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jDateChooser60);
        org.junit.Assert.assertNull(color64);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Component[] componentArray6 = home0.getComponents();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertNotNull(componentArray6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        java.awt.event.WindowListener[] windowListenerArray4 = home0.getWindowListeners();
        boolean boolean5 = home0.isAlwaysOnTopSupported();
        home0.repaint((long) (byte) -1, 3, 32, (int) (short) 1, 12);
        java.awt.Event event12 = null;
        Home home13 = new Home();
        java.awt.image.BufferStrategy bufferStrategy14 = home13.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home13.addHierarchyBoundsListener(hierarchyBoundsListener15);
        java.awt.event.FocusEvent.Cause cause17 = null;
        boolean boolean18 = home13.requestFocusInWindow(cause17);
        java.util.Date date20 = home13.stringToDate("hi!");
        boolean boolean21 = home0.action(event12, (java.lang.Object) "hi!");
        javax.swing.JScrollPane jScrollPane22 = null;
        home0.scrollPane = jScrollPane22;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(windowListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bufferStrategy14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(date20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        home0.setFocusable(true);
        javax.swing.JMenuBar jMenuBar9 = home0.getJMenuBar();
        java.awt.event.KeyListener keyListener10 = null;
        home0.addKeyListener(keyListener10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(jMenuBar9);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = null;
        home9.setModalExclusionType(modalExclusionType12);
        java.awt.LayoutManager layoutManager14 = home9.getLayout();
        home0.setLayout(layoutManager14);
        java.awt.Event event16 = null;
        boolean boolean18 = home0.keyUp(event16, 13);
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        home0.removeMouseMotionListener(mouseMotionListener19);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = jLabel3.isEnabled();
        java.awt.Event event5 = null;
        boolean boolean8 = jLabel3.mouseEnter(event5, (int) '4', 10);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.util.Locale locale8 = null;
        home0.setLocale(locale8);
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        java.awt.ComponentOrientation componentOrientation15 = home10.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation15);
        int int17 = home0.getWidth();
        java.awt.event.ActionEvent actionEvent18 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1000 + "'", int17 == 1000);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        Home home15 = new Home();
        boolean boolean16 = home15.isMaximumSizeSet();
        home15.setResizable(false);
        boolean boolean19 = home15.isActive();
        java.awt.Rectangle rectangle20 = home15.bounds();
        java.awt.Rectangle rectangle21 = home13.getBounds(rectangle20);
        home1.setMaximizedBounds(rectangle20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(rectangle20);
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser8 = home4.stDate;
        home0.stDate = jDateChooser8;
        javax.swing.JButton jButton10 = home0.deleteJob;
        jButton10.firePropertyChange("Job Scheduler", (byte) 10, (byte) -1);
        java.awt.Color color15 = jButton10.getForeground();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jDateChooser8);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(color15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Graphics graphics6 = null;
        home0.paint(graphics6);
        boolean boolean8 = home0.isFocusCycleRoot();
        Home home10 = new Home();
        java.awt.image.BufferStrategy bufferStrategy11 = home10.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        home10.addHierarchyBoundsListener(hierarchyBoundsListener12);
        boolean boolean14 = home10.isResizable();
        home10.removeAll();
        boolean boolean16 = home10.isLightweight();
        boolean boolean17 = home10.isValid();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component18 = home0.add("javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]", (java.awt.Component) home10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(bufferStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.MenuBar menuBar7 = null;
        home0.setMenuBar(menuBar7);
        javax.swing.JTable jTable9 = home0.table;
        java.awt.dnd.DropTarget dropTarget10 = jTable9.getDropTarget();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jTable9);
        org.junit.Assert.assertNull(dropTarget10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        boolean boolean6 = jRootPane5.getFocusTraversalKeysEnabled();
        jRootPane5.validate();
        java.util.Locale locale8 = null;
        jRootPane5.setLocale(locale8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        java.awt.Cursor cursor5 = home4.getCursor();
        home4.removeNotify();
        javax.swing.JLayeredPane jLayeredPane7 = home4.getLayeredPane();
        home0.setLayeredPane(jLayeredPane7);
        java.awt.Component component9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component10 = jLayeredPane7.add(component9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor5);
        org.junit.Assert.assertNotNull(jLayeredPane7);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.event.HierarchyListener[] hierarchyListenerArray3 = home0.getHierarchyListeners();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        java.awt.Event event6 = null;
        boolean boolean9 = home4.mouseUp(event6, 0, (int) ' ');
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.setResizable(false);
        Home home15 = new Home();
        java.awt.Cursor cursor16 = home15.getCursor();
        home15.removeNotify();
        javax.swing.JLabel jLabel18 = home15.taskTypeLabel;
        jLabel18.invalidate();
        home11.priority = jLabel18;
        java.awt.Component component21 = home4.add("", (java.awt.Component) jLabel18);
        Home home22 = new Home();
        Home home23 = new Home();
        boolean boolean24 = home23.isMaximumSizeSet();
        home23.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser27 = home23.stDate;
        home22.enDate = jDateChooser27;
        home4.stDate = jDateChooser27;
        java.awt.Dimension dimension30 = jDateChooser27.getSize();
        java.awt.Dimension dimension31 = home0.getSize(dimension30);
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNotNull(hierarchyListenerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cursor16);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(component21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jDateChooser27);
        org.junit.Assert.assertNotNull(dimension30);
        org.junit.Assert.assertNotNull(dimension31);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        home0.repaint((long) (short) 1, 800, (int) '4', (int) '4', (int) (short) 0);
        home0.invalidate();
        javax.swing.JScrollPane jScrollPane14 = null;
        home0.scrollPane = jScrollPane14;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        Home home10 = new Home();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        home11.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser15 = home11.stDate;
        home10.enDate = jDateChooser15;
        home0.enDate = jDateChooser15;
        Home home18 = new Home();
        java.awt.Cursor cursor19 = home18.getCursor();
        home18.removeNotify();
        javax.swing.JLayeredPane jLayeredPane21 = home18.getLayeredPane();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        home22.invalidate();
        home22.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton29 = home22.deleteJob;
        javax.swing.table.DefaultTableModel defaultTableModel30 = home22.tableModel;
        home18.tableModel = defaultTableModel30;
        home0.tableModel = defaultTableModel30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jDateChooser15);
        org.junit.Assert.assertNotNull(cursor19);
        org.junit.Assert.assertNotNull(jLayeredPane21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton29);
        org.junit.Assert.assertNotNull(defaultTableModel30);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        boolean boolean11 = home0.inside(0, 3);
        Home home12 = new Home();
        boolean boolean13 = home12.isMaximumSizeSet();
        home12.setResizable(false);
        boolean boolean16 = home12.isActive();
        UserProfile userProfile17 = null;
        home12.userProfile = userProfile17;
        com.toedter.calendar.JDateChooser jDateChooser19 = home12.enDate;
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = null;
        home20.setFocusTraversalPolicy(focusTraversalPolicy25);
        boolean boolean27 = home20.isActive();
        java.awt.Point point28 = home20.location();
        java.awt.Component component29 = home12.getComponentAt(point28);
        java.awt.Component component30 = home0.getComponentAt(point28);
        boolean boolean31 = home0.isFocusableWindow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jDateChooser19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNotNull(component29);
        org.junit.Assert.assertNotNull(component30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.Toolkit toolkit4 = home0.getToolkit();
        Home home5 = new Home();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        int int10 = home6.getComponentZOrder((java.awt.Component) home8);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
        home6.setFocusTraversalPolicy(focusTraversalPolicy11);
        boolean boolean13 = home5.isAncestorOf((java.awt.Component) home6);
        home6.clearAllInput();
        Home home15 = new Home();
        java.awt.image.BufferStrategy bufferStrategy16 = home15.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        home15.addHierarchyBoundsListener(hierarchyBoundsListener17);
        boolean boolean19 = home15.isResizable();
        home15.removeAll();
        boolean boolean21 = home15.isLightweight();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        boolean boolean26 = home22.isActive();
        UserProfile userProfile27 = null;
        home22.userProfile = userProfile27;
        com.toedter.calendar.JDateChooser jDateChooser29 = home22.enDate;
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = home22.createImage(imageProducer30);
        home15.setIconImage(image31);
        Home home33 = new Home();
        java.awt.image.BufferStrategy bufferStrategy34 = home33.getBufferStrategy();
        int int35 = home33.getY();
        java.awt.image.BufferStrategy bufferStrategy36 = home33.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener37 = null;
        home33.addMouseWheelListener(mouseWheelListener37);
        int int39 = home33.getComponentCount();
        int int40 = home6.checkImage(image31, (java.awt.image.ImageObserver) home33);
        Home home43 = new Home();
        java.awt.image.BufferStrategy bufferStrategy44 = home43.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
        home43.addHierarchyBoundsListener(hierarchyBoundsListener45);
        boolean boolean47 = home43.isResizable();
        java.awt.Dimension dimension48 = null;
        home43.setMinimumSize(dimension48);
        int int50 = home0.checkImage(image31, 12, 0, (java.awt.image.ImageObserver) home43);
        Home home51 = new Home();
        java.awt.Cursor cursor52 = home51.getCursor();
        home51.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener54 = null;
        home51.addWindowFocusListener(windowFocusListener54);
        Home home56 = new Home();
        java.awt.Cursor cursor57 = home56.getCursor();
        home56.removeNotify();
        javax.swing.JLabel jLabel59 = home56.taskTypeLabel;
        boolean boolean60 = jLabel59.isEnabled();
        home51.taskNameLabel = jLabel59;
        java.awt.Component component62 = home0.add((java.awt.Component) jLabel59);
        java.awt.Point point63 = jLabel59.getMousePosition();
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(toolkit4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bufferStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jDateChooser29);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertNull(bufferStrategy34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNull(bufferStrategy36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(bufferStrategy44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(cursor52);
        org.junit.Assert.assertNotNull(cursor57);
        org.junit.Assert.assertNotNull(jLabel59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertNull(point63);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        javax.swing.JLabel jLabel4 = home0.taskEndLabel;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(jLabel4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        home2.setResizable(false);
        boolean boolean6 = home2.isActive();
        UserProfile userProfile7 = null;
        home2.userProfile = userProfile7;
        com.toedter.calendar.JDateChooser jDateChooser9 = home2.enDate;
        java.util.Locale locale10 = null;
        home2.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            home0.setContentPane((java.awt.Container) home2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jDateChooser9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = home1.getFocusTraversalPolicy();
        int int14 = home1.getState();
        java.awt.event.WindowStateListener windowStateListener15 = null;
        home1.addWindowStateListener(windowStateListener15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        java.awt.Event event10 = null;
        boolean boolean12 = home0.keyUp(event10, 5);
        javax.swing.JPanel jPanel13 = home0.panel;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jPanel13);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home6.addHierarchyBoundsListener(hierarchyBoundsListener8);
        boolean boolean10 = home6.isResizable();
        home6.removeAll();
        java.util.Locale locale12 = null;
        home6.setLocale(locale12);
        javax.swing.JTextField jTextField14 = home6.taskNameField;
        home0.taskNameField = jTextField14;
        Home home16 = new Home();
        java.awt.image.BufferStrategy bufferStrategy17 = home16.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener18 = null;
        home16.addHierarchyBoundsListener(hierarchyBoundsListener18);
        boolean boolean20 = home16.isResizable();
        java.awt.Dimension dimension21 = null;
        home16.setMinimumSize(dimension21);
        javax.swing.JTable jTable23 = home16.table;
        home16.addJob();
        java.awt.Component component25 = home16.getGlassPane();
        Home home26 = new Home();
        java.awt.Cursor cursor27 = home26.getCursor();
        home26.removeNotify();
        javax.swing.JLabel jLabel29 = home26.taskTypeLabel;
        boolean boolean30 = home26.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser31 = home26.enDate;
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        java.awt.Event event34 = null;
        boolean boolean37 = home32.mouseUp(event34, 0, (int) ' ');
        Home home39 = new Home();
        boolean boolean40 = home39.isMaximumSizeSet();
        home39.setResizable(false);
        Home home43 = new Home();
        java.awt.Cursor cursor44 = home43.getCursor();
        home43.removeNotify();
        javax.swing.JLabel jLabel46 = home43.taskTypeLabel;
        jLabel46.invalidate();
        home39.priority = jLabel46;
        java.awt.Component component49 = home32.add("", (java.awt.Component) jLabel46);
        home26.lblScheduledBy = jLabel46;
        java.awt.image.ImageProducer imageProducer51 = null;
        java.awt.Image image52 = home26.createImage(imageProducer51);
        home16.setIconImage(image52);
        Home home56 = new Home();
        Home home57 = new Home();
        boolean boolean58 = home57.isMaximumSizeSet();
        Home home59 = new Home();
        boolean boolean60 = home59.isMaximumSizeSet();
        int int61 = home57.getComponentZOrder((java.awt.Component) home59);
        java.awt.FocusTraversalPolicy focusTraversalPolicy62 = null;
        home57.setFocusTraversalPolicy(focusTraversalPolicy62);
        boolean boolean64 = home56.isAncestorOf((java.awt.Component) home57);
        home57.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray69 = home57.getOwnedWindows();
        Home home70 = new Home();
        boolean boolean71 = home70.isMaximumSizeSet();
        Home home72 = new Home();
        boolean boolean73 = home72.isMaximumSizeSet();
        int int74 = home70.getComponentZOrder((java.awt.Component) home72);
        java.awt.FocusTraversalPolicy focusTraversalPolicy75 = null;
        home70.setFocusTraversalPolicy(focusTraversalPolicy75);
        boolean boolean77 = home70.isActive();
        Home home78 = new Home();
        boolean boolean79 = home78.isMaximumSizeSet();
        home78.setResizable(false);
        home78.invalidate();
        home78.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton85 = home78.deleteJob;
        home70.addJob = jButton85;
        home57.addJob = jButton85;
        javax.swing.JTextArea jTextArea88 = home57.taskDescField;
        boolean boolean89 = home0.prepareImage(image52, (int) (short) 0, 1, (java.awt.image.ImageObserver) home57);
        javax.swing.JLabel jLabel90 = null;
        home57.status = jLabel90;
        java.awt.Graphics graphics92 = home57.getGraphics();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTable23);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(cursor27);
        org.junit.Assert.assertNotNull(jLabel29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jDateChooser31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cursor44);
        org.junit.Assert.assertNotNull(jLabel46);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(image52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(windowArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jButton85);
        org.junit.Assert.assertNotNull(jTextArea88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNull(graphics92);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        float float9 = home6.getAlignmentX();
        home6.firePropertyChange("javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]", 'a', 'a');
        java.lang.String str14 = home6.getTitle();
        Home home15 = new Home();
        java.awt.image.BufferStrategy bufferStrategy16 = home15.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        home15.addHierarchyBoundsListener(hierarchyBoundsListener17);
        boolean boolean19 = home15.isResizable();
        java.awt.Dimension dimension20 = null;
        home15.setMinimumSize(dimension20);
        javax.swing.JTable jTable22 = home15.table;
        jTable22.firePropertyChange("", '#', '4');
        home6.table = jTable22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Job Scheduler" + "'", str14, "Job Scheduler");
        org.junit.Assert.assertNull(bufferStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jTable22);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = jLabel3.isEnabled();
        java.awt.event.HierarchyListener hierarchyListener5 = null;
        jLabel3.addHierarchyListener(hierarchyListener5);
        Home home7 = new Home();
        java.awt.image.BufferStrategy bufferStrategy8 = home7.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener9 = null;
        home7.addHierarchyBoundsListener(hierarchyBoundsListener9);
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = home7.requestFocusInWindow(cause11);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = home7.getFocusTraversalPolicy();
        jLabel3.setFocusTraversalPolicy(focusTraversalPolicy13);
        jLabel3.setEnabled(true);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(bufferStrategy8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        java.awt.event.WindowFocusListener windowFocusListener8 = null;
        home0.addWindowFocusListener(windowFocusListener8);
        float float10 = home0.getOpacity();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.Dimension dimension7 = home0.getSize();
        java.awt.Event event8 = null;
        boolean boolean11 = home0.mouseEnter(event8, 0, 8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.MouseMotionListener mouseMotionListener5 = null;
        home0.addMouseMotionListener(mouseMotionListener5);
        home0.setTitle("javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]");
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.deliverEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.MenuBar menuBar7 = null;
        home0.setMenuBar(menuBar7);
        javax.swing.JTable jTable9 = home0.table;
        int int10 = home0.countComponents();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jTable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        Home home7 = new Home();
        java.awt.Cursor cursor8 = home7.getCursor();
        home7.removeNotify();
        javax.swing.JLabel jLabel10 = home7.taskTypeLabel;
        boolean boolean11 = home7.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser12 = home7.enDate;
        home0.stDate = jDateChooser12;
        javax.swing.JTextArea jTextArea14 = home0.taskDescField;
        Home home15 = new Home();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        Home home18 = new Home();
        boolean boolean19 = home18.isMaximumSizeSet();
        int int20 = home16.getComponentZOrder((java.awt.Component) home18);
        java.awt.FocusTraversalPolicy focusTraversalPolicy21 = null;
        home16.setFocusTraversalPolicy(focusTraversalPolicy21);
        boolean boolean23 = home15.isAncestorOf((java.awt.Component) home16);
        home16.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray28 = home16.getOwnedWindows();
        Home home29 = new Home();
        boolean boolean30 = home29.isMaximumSizeSet();
        Home home31 = new Home();
        boolean boolean32 = home31.isMaximumSizeSet();
        int int33 = home29.getComponentZOrder((java.awt.Component) home31);
        java.awt.FocusTraversalPolicy focusTraversalPolicy34 = null;
        home29.setFocusTraversalPolicy(focusTraversalPolicy34);
        boolean boolean36 = home29.isActive();
        Home home37 = new Home();
        boolean boolean38 = home37.isMaximumSizeSet();
        home37.setResizable(false);
        home37.invalidate();
        home37.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton44 = home37.deleteJob;
        home29.addJob = jButton44;
        home16.addJob = jButton44;
        home0.deleteJob = jButton44;
        boolean boolean48 = home0.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cursor8);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jDateChooser12);
        org.junit.Assert.assertNotNull(jTextArea14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(windowArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jButton44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        home0.lblScheduledBy = jLabel20;
        Home home25 = new Home();
        java.awt.image.BufferStrategy bufferStrategy26 = home25.getBufferStrategy();
        java.awt.LayoutManager layoutManager27 = null;
        home25.setLayout(layoutManager27);
        Home home29 = new Home();
        java.awt.Cursor cursor30 = home29.getCursor();
        home29.removeNotify();
        javax.swing.JLayeredPane jLayeredPane32 = home29.getLayeredPane();
        Home home33 = new Home();
        boolean boolean34 = home33.isMaximumSizeSet();
        Home home35 = new Home();
        boolean boolean36 = home35.isMaximumSizeSet();
        int int37 = home33.getComponentZOrder((java.awt.Component) home35);
        java.awt.FocusTraversalPolicy focusTraversalPolicy38 = null;
        home33.setFocusTraversalPolicy(focusTraversalPolicy38);
        boolean boolean40 = home33.isActive();
        java.awt.Point point41 = home33.location();
        home29.setLocation(point41);
        boolean boolean43 = home25.contains(point41);
        boolean boolean44 = jLabel20.contains(point41);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNull(bufferStrategy26);
        org.junit.Assert.assertNotNull(cursor30);
        org.junit.Assert.assertNotNull(jLayeredPane32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(point41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        home0.rsp = "hi!";
        boolean boolean9 = home0.isAlwaysOnTop();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        home0.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home0.setLocationByPlatform(true);
        home0.validate();
        boolean boolean19 = home0.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        java.awt.Event event12 = null;
        boolean boolean15 = home10.mouseUp(event12, 0, (int) ' ');
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        Home home21 = new Home();
        java.awt.Cursor cursor22 = home21.getCursor();
        home21.removeNotify();
        javax.swing.JLabel jLabel24 = home21.taskTypeLabel;
        jLabel24.invalidate();
        home17.priority = jLabel24;
        java.awt.Component component27 = home10.add("", (java.awt.Component) jLabel24);
        home0.taskTypeLabel = jLabel24;
        java.awt.Color color29 = jLabel24.getForeground();
        java.awt.Event event30 = null;
        Home home31 = new Home();
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        Home home34 = new Home();
        boolean boolean35 = home34.isMaximumSizeSet();
        int int36 = home32.getComponentZOrder((java.awt.Component) home34);
        java.awt.FocusTraversalPolicy focusTraversalPolicy37 = null;
        home32.setFocusTraversalPolicy(focusTraversalPolicy37);
        boolean boolean39 = home31.isAncestorOf((java.awt.Component) home32);
        java.lang.String str40 = home31.rsp;
        java.lang.Object obj41 = home31.getTreeLock();
        java.awt.Graphics graphics42 = null;
        home31.update(graphics42);
        Home home44 = new Home();
        java.awt.image.BufferStrategy bufferStrategy45 = home44.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener46 = null;
        home44.addHierarchyBoundsListener(hierarchyBoundsListener46);
        boolean boolean48 = home44.isResizable();
        home44.removeAll();
        boolean boolean50 = home44.isLightweight();
        home31.setLocationRelativeTo((java.awt.Component) home44);
        boolean boolean52 = jLabel24.gotFocus(event30, (java.lang.Object) home31);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cursor22);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertNotNull(color29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertNull(bufferStrategy45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.invalidate();
        home0.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton7 = home0.deleteJob;
        java.lang.Object obj8 = jButton7.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jButton7);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        boolean boolean10 = home0.isMinimumSizeSet();
        java.awt.event.ContainerListener containerListener11 = null;
        home0.addContainerListener(containerListener11);
        java.awt.event.ComponentListener[] componentListenerArray13 = home0.getComponentListeners();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(componentListenerArray13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        home0.show(false);
        java.awt.ImageCapabilities imageCapabilities14 = null;
        java.awt.image.VolatileImage volatileImage15 = home0.createVolatileImage(4, (int) '#', imageCapabilities14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertNull(volatileImage15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        javax.swing.TransferHandler transferHandler6 = home2.getTransferHandler();
        java.awt.Graphics graphics7 = null;
        home2.print(graphics7);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNull(transferHandler6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        int int10 = home6.getComponentZOrder((java.awt.Component) home8);
        javax.swing.JRootPane jRootPane11 = home8.getRootPane();
        javax.swing.JMenuBar jMenuBar12 = home8.getJMenuBar();
        java.awt.Graphics graphics13 = home8.getGraphics();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        home14.setResizable(false);
        Home home18 = new Home();
        boolean boolean19 = home18.isMaximumSizeSet();
        home18.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser22 = home18.stDate;
        home14.stDate = jDateChooser22;
        javax.swing.JButton jButton24 = home14.deleteJob;
        home8.updateJob = jButton24;
        java.awt.Component component26 = jRootPane5.add((java.awt.Component) jButton24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(jRootPane11);
        org.junit.Assert.assertNull(jMenuBar12);
        org.junit.Assert.assertNull(graphics13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jDateChooser22);
        org.junit.Assert.assertNotNull(jButton24);
        org.junit.Assert.assertNotNull(component26);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        Home home13 = new Home();
        java.awt.image.BufferStrategy bufferStrategy14 = home13.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home13.addHierarchyBoundsListener(hierarchyBoundsListener15);
        boolean boolean17 = home13.isResizable();
        home13.removeAll();
        boolean boolean19 = home13.isLightweight();
        home0.setLocationRelativeTo((java.awt.Component) home13);
        java.awt.Dialog.ModalExclusionType modalExclusionType21 = null;
        home13.setModalExclusionType(modalExclusionType21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(bufferStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        home0.removeAll();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        org.junit.Assert.assertNull(bufferStrategy1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        javax.swing.JTable jTable7 = home0.table;
        int int8 = home0.sel_task_id;
        boolean boolean9 = home0.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.Graphics graphics2 = null;
        home0.paintAll(graphics2);
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home14.isActive();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        home22.invalidate();
        home22.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton29 = home22.deleteJob;
        home14.addJob = jButton29;
        home1.addJob = jButton29;
        java.io.PrintWriter printWriter32 = null;
        // The following exception was thrown during execution in test generation
        try {
            jButton29.list(printWriter32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton29);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray7 = home0.getMouseWheelListeners();
        java.awt.Shape shape8 = null;
        home0.setShape(shape8);
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        java.awt.Event event12 = null;
        boolean boolean15 = home10.mouseUp(event12, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray16 = home10.getHierarchyBoundsListeners();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray17 = home10.getMouseWheelListeners();
        java.awt.Shape shape18 = null;
        home10.setShape(shape18);
        Home home20 = new Home();
        java.awt.Cursor cursor21 = home20.getCursor();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        boolean boolean26 = home22.isActive();
        java.awt.Rectangle rectangle27 = home22.bounds();
        java.awt.Rectangle rectangle28 = home20.getBounds(rectangle27);
        home10.setMaximizedBounds(rectangle28);
        home0.setBounds(rectangle28);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray16);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray17);
        org.junit.Assert.assertNotNull(cursor21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(rectangle27);
        org.junit.Assert.assertNotNull(rectangle28);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        home0.transferFocusBackward();
        javax.swing.JComboBox jComboBox7 = home0.statusDropdown;
        boolean boolean8 = home0.isFocusable();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jComboBox7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.invalidate();
        java.awt.Color color5 = home0.getBackground();
        home0.repaint(4, 0, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(color5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        Home home13 = new Home();
        java.awt.image.BufferStrategy bufferStrategy14 = home13.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener15 = null;
        home13.addHierarchyBoundsListener(hierarchyBoundsListener15);
        boolean boolean17 = home13.isResizable();
        home13.removeAll();
        boolean boolean19 = home13.isLightweight();
        home0.setLocationRelativeTo((java.awt.Component) home13);
        java.awt.event.KeyListener keyListener21 = null;
        home13.removeKeyListener(keyListener21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(bufferStrategy14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        Home home0 = new Home();
        home0.repaint(0L, (int) (short) 1, 0, (int) (short) 100, (int) '#');
        home0.clearAllInput();
        home0.transferFocus();
        boolean boolean9 = home0.getFocusableWindowState();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        boolean boolean7 = home0.contains((int) (byte) -1, 16);
        boolean boolean8 = home0.isVisible();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        int int7 = home0.getDefaultCloseOperation();
        java.awt.Font font8 = null;
        home0.setFont(font8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        home0.transferFocusBackward();
        home0.transferFocusDownCycle();
        home0.layout();
        home0.setIgnoreRepaint(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        home0.transferFocusBackward();
        home0.transferFocusDownCycle();
        java.awt.event.FocusEvent.Cause cause8 = null;
        boolean boolean9 = home0.requestFocusInWindow(cause8);
        java.awt.PopupMenu popupMenu10 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.add(popupMenu10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        boolean boolean6 = home0.isVisible();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.deliverEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        float float8 = home2.getAlignmentY();
        java.awt.Dimension dimension9 = home2.size();
        java.awt.image.VolatileImage volatileImage12 = home2.createVolatileImage(112, 0);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        home13.removeNotify();
        javax.swing.JLabel jLabel16 = home13.taskTypeLabel;
        boolean boolean17 = home13.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser18 = home13.enDate;
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        java.awt.Event event21 = null;
        boolean boolean24 = home19.mouseUp(event21, 0, (int) ' ');
        Home home26 = new Home();
        boolean boolean27 = home26.isMaximumSizeSet();
        home26.setResizable(false);
        Home home30 = new Home();
        java.awt.Cursor cursor31 = home30.getCursor();
        home30.removeNotify();
        javax.swing.JLabel jLabel33 = home30.taskTypeLabel;
        jLabel33.invalidate();
        home26.priority = jLabel33;
        java.awt.Component component36 = home19.add("", (java.awt.Component) jLabel33);
        home13.lblScheduledBy = jLabel33;
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = home13.createImage(imageProducer38);
        Home home40 = new Home();
        java.awt.image.BufferStrategy bufferStrategy41 = home40.getBufferStrategy();
        int int42 = home40.getY();
        java.awt.image.BufferStrategy bufferStrategy43 = home40.getBufferStrategy();
        java.awt.Toolkit toolkit44 = home40.getToolkit();
        int int45 = home2.checkImage(image39, (java.awt.image.ImageObserver) home40);
        Home home46 = new Home();
        boolean boolean47 = home46.isMaximumSizeSet();
        home46.setResizable(false);
        home46.invalidate();
        home46.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton53 = home46.deleteJob;
        javax.swing.JTextField jTextField54 = home46.taskNameField;
        home40.taskTypeField = jTextField54;
        home40.sel_task_id = 0;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertNotNull(jLabel16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cursor31);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNull(bufferStrategy41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 112 + "'", int42 == 112);
        org.junit.Assert.assertNull(bufferStrategy43);
        org.junit.Assert.assertNotNull(toolkit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jButton53);
        org.junit.Assert.assertNotNull(jTextField54);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        home0.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home0.setLocationByPlatform(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray19 = home0.getPropertyChangeListeners("");
        Home home20 = new Home();
        java.awt.image.BufferStrategy bufferStrategy21 = home20.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        home20.addHierarchyBoundsListener(hierarchyBoundsListener22);
        boolean boolean24 = home20.isResizable();
        Home home25 = new Home();
        java.awt.Cursor cursor26 = home25.getCursor();
        home25.removeNotify();
        javax.swing.JLabel jLabel28 = home25.taskTypeLabel;
        boolean boolean29 = jLabel28.isEnabled();
        home20.taskTypeLabel = jLabel28;
        home0.taskDescLabel = jLabel28;
        home0.rsp = "javax.swing.JLabel[,764,112,100x30,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=8388608,maximumSize=,minimumSize=,preferredSize=,defaultIcon=,disabledIcon=,horizontalAlignment=LEADING,horizontalTextPosition=TRAILING,iconTextGap=4,labelFor=,text=Task Type,verticalAlignment=CENTER,verticalTextPosition=CENTER]";
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray19);
        org.junit.Assert.assertNull(bufferStrategy21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cursor26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        home0.addJob();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = home0.getBaselineResizeBehavior();
        home0.sel_task_id = 1000;
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray12 = home0.getMouseWheelListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertNotNull(mouseWheelListenerArray12);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        boolean boolean5 = home0.isFocusTraversalPolicySet();
        Home home6 = new Home();
        java.awt.Cursor cursor7 = home6.getCursor();
        home6.removeNotify();
        javax.swing.JLabel jLabel9 = home6.taskTypeLabel;
        home0.taskEndLabel = jLabel9;
        java.awt.Dimension dimension11 = home0.preferredSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cursor7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        boolean boolean8 = home0.isVisible();
        java.awt.im.InputMethodRequests inputMethodRequests9 = home0.getInputMethodRequests();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(inputMethodRequests9);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        java.awt.Shape shape14 = null;
        home0.setShape(shape14);
        javax.accessibility.AccessibleContext accessibleContext16 = home0.getAccessibleContext();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(accessibleContext16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        java.awt.MenuBar menuBar7 = home0.getMenuBar();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNull(menuBar7);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        Home home6 = new Home();
        java.awt.Cursor cursor7 = home6.getCursor();
        home6.removeNotify();
        javax.swing.JLabel jLabel9 = home6.taskTypeLabel;
        boolean boolean10 = jLabel9.isEnabled();
        java.awt.ImageCapabilities imageCapabilities13 = null;
        java.awt.image.VolatileImage volatileImage14 = jLabel9.createVolatileImage((int) ' ', (int) (short) 10, imageCapabilities13);
        int int15 = home0.getComponentZOrder((java.awt.Component) jLabel9);
        javax.swing.JRootPane jRootPane16 = home0.getRootPane();
        java.awt.Container container17 = home0.getParent();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertNotNull(cursor7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(volatileImage14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(jRootPane16);
        org.junit.Assert.assertNull(container17);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home6.addHierarchyBoundsListener(hierarchyBoundsListener8);
        boolean boolean10 = home6.isResizable();
        home6.removeAll();
        java.util.Locale locale12 = null;
        home6.setLocale(locale12);
        javax.swing.JTextField jTextField14 = home6.taskNameField;
        home0.taskNameField = jTextField14;
        Home home16 = new Home();
        java.awt.image.BufferStrategy bufferStrategy17 = home16.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener18 = null;
        home16.addHierarchyBoundsListener(hierarchyBoundsListener18);
        boolean boolean20 = home16.isResizable();
        java.awt.Dimension dimension21 = null;
        home16.setMinimumSize(dimension21);
        javax.swing.JTable jTable23 = home16.table;
        home16.addJob();
        java.awt.Component component25 = home16.getGlassPane();
        Home home26 = new Home();
        java.awt.Cursor cursor27 = home26.getCursor();
        home26.removeNotify();
        javax.swing.JLabel jLabel29 = home26.taskTypeLabel;
        boolean boolean30 = home26.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser31 = home26.enDate;
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        java.awt.Event event34 = null;
        boolean boolean37 = home32.mouseUp(event34, 0, (int) ' ');
        Home home39 = new Home();
        boolean boolean40 = home39.isMaximumSizeSet();
        home39.setResizable(false);
        Home home43 = new Home();
        java.awt.Cursor cursor44 = home43.getCursor();
        home43.removeNotify();
        javax.swing.JLabel jLabel46 = home43.taskTypeLabel;
        jLabel46.invalidate();
        home39.priority = jLabel46;
        java.awt.Component component49 = home32.add("", (java.awt.Component) jLabel46);
        home26.lblScheduledBy = jLabel46;
        java.awt.image.ImageProducer imageProducer51 = null;
        java.awt.Image image52 = home26.createImage(imageProducer51);
        home16.setIconImage(image52);
        Home home56 = new Home();
        Home home57 = new Home();
        boolean boolean58 = home57.isMaximumSizeSet();
        Home home59 = new Home();
        boolean boolean60 = home59.isMaximumSizeSet();
        int int61 = home57.getComponentZOrder((java.awt.Component) home59);
        java.awt.FocusTraversalPolicy focusTraversalPolicy62 = null;
        home57.setFocusTraversalPolicy(focusTraversalPolicy62);
        boolean boolean64 = home56.isAncestorOf((java.awt.Component) home57);
        home57.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray69 = home57.getOwnedWindows();
        Home home70 = new Home();
        boolean boolean71 = home70.isMaximumSizeSet();
        Home home72 = new Home();
        boolean boolean73 = home72.isMaximumSizeSet();
        int int74 = home70.getComponentZOrder((java.awt.Component) home72);
        java.awt.FocusTraversalPolicy focusTraversalPolicy75 = null;
        home70.setFocusTraversalPolicy(focusTraversalPolicy75);
        boolean boolean77 = home70.isActive();
        Home home78 = new Home();
        boolean boolean79 = home78.isMaximumSizeSet();
        home78.setResizable(false);
        home78.invalidate();
        home78.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton85 = home78.deleteJob;
        home70.addJob = jButton85;
        home57.addJob = jButton85;
        javax.swing.JTextArea jTextArea88 = home57.taskDescField;
        boolean boolean89 = home0.prepareImage(image52, (int) (short) 0, 1, (java.awt.image.ImageObserver) home57);
        home57.setTitle("");
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTable23);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(cursor27);
        org.junit.Assert.assertNotNull(jLabel29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jDateChooser31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cursor44);
        org.junit.Assert.assertNotNull(jLabel46);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(image52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(windowArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jButton85);
        org.junit.Assert.assertNotNull(jTextArea88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        java.awt.Component component9 = jDateChooser5.findComponentAt(2, (int) (byte) 0);
        java.awt.Container container10 = jDateChooser5.getParent();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(container10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        java.awt.Shape shape14 = null;
        home0.setShape(shape14);
        home0.move(10, (int) '4');
        java.awt.MenuBar menuBar19 = home0.getMenuBar();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNull(menuBar19);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        float float9 = home6.getAlignmentX();
        home6.enableInputMethods(true);
        boolean boolean14 = home6.inside((int) (byte) 10, (-1));
        javax.swing.table.DefaultTableModel defaultTableModel15 = home6.tableModel;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(defaultTableModel15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        home0.setFocusableWindowState(false);
        java.awt.Image image6 = home0.getIconImage();
        java.awt.Event event7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = home0.handleEvent(event7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNull(image6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        home4.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser8 = home4.stDate;
        home0.stDate = jDateChooser8;
        javax.swing.JButton jButton10 = home0.deleteJob;
        java.awt.Point point11 = jButton10.location();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jDateChooser8);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(point11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        java.awt.MenuBar menuBar8 = null;
        home0.setMenuBar(menuBar8);
        javax.swing.JLabel jLabel10 = home0.lblScheduledBy;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
        org.junit.Assert.assertNotNull(jLabel10);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        Home home6 = new Home();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        int int11 = home7.getComponentZOrder((java.awt.Component) home9);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        home7.setFocusTraversalPolicy(focusTraversalPolicy12);
        boolean boolean14 = home6.isAncestorOf((java.awt.Component) home7);
        home7.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray19 = home7.getOwnedWindows();
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = null;
        home20.setFocusTraversalPolicy(focusTraversalPolicy25);
        boolean boolean27 = home20.isActive();
        Home home28 = new Home();
        boolean boolean29 = home28.isMaximumSizeSet();
        home28.setResizable(false);
        home28.invalidate();
        home28.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton35 = home28.deleteJob;
        home20.addJob = jButton35;
        home7.addJob = jButton35;
        home0.deleteJob = jButton35;
        boolean boolean41 = home0.contains(12, 800);
        java.awt.event.WindowStateListener windowStateListener42 = null;
        home0.removeWindowStateListener(windowStateListener42);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(windowArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jButton35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        home0.deleteJob();
        java.lang.String str7 = home0.rsp;
        java.awt.Event event8 = null;
        boolean boolean10 = home0.keyDown(event8, (int) (short) 100);
        boolean boolean12 = home0.areFocusTraversalKeysSet(0);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Please select a task first to delete" + "'", str7, "Please select a task first to delete");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        boolean boolean10 = home0.isOpaque();
        java.awt.Dimension dimension11 = home0.getMaximumSize();
        java.awt.event.ActionEvent actionEvent12 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        home0.setFocusable(true);
        java.awt.Rectangle rectangle9 = home0.getMaximizedBounds();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(rectangle9);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Graphics graphics6 = null;
        home0.paint(graphics6);
        // The following exception was thrown during execution in test generation
        try {
            home0.setOpacity((float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = jLabel3.isEnabled();
        java.awt.ImageCapabilities imageCapabilities7 = null;
        java.awt.image.VolatileImage volatileImage8 = jLabel3.createVolatileImage((int) ' ', (int) (short) 10, imageCapabilities7);
        java.awt.Event event9 = null;
        boolean boolean12 = jLabel3.mouseDown(event9, (int) (short) -1, 12);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(volatileImage8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        Home home7 = new Home();
        java.awt.Cursor cursor8 = home7.getCursor();
        home7.removeNotify();
        javax.swing.JLabel jLabel10 = home7.taskTypeLabel;
        boolean boolean11 = home7.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser12 = home7.enDate;
        home0.stDate = jDateChooser12;
        javax.swing.JTextArea jTextArea14 = home0.taskDescField;
        java.lang.Object obj15 = home0.getTreeLock();
        boolean boolean16 = home0.isFontSet();
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        boolean boolean21 = home17.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser22 = home17.enDate;
        home0.enDate = jDateChooser22;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cursor8);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jDateChooser12);
        org.junit.Assert.assertNotNull(jTextArea14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jDateChooser22);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int int0 = java.awt.image.ImageObserver.ABORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        home0.firePropertyChange("", (float) ' ', (float) '4');
        Home home13 = new Home();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home13.isAncestorOf((java.awt.Component) home14);
        java.lang.String str22 = home13.rsp;
        java.lang.Object obj23 = home13.getTreeLock();
        home13.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home13.setLocationByPlatform(true);
        Home home31 = new Home();
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        Home home34 = new Home();
        boolean boolean35 = home34.isMaximumSizeSet();
        int int36 = home32.getComponentZOrder((java.awt.Component) home34);
        java.awt.FocusTraversalPolicy focusTraversalPolicy37 = null;
        home32.setFocusTraversalPolicy(focusTraversalPolicy37);
        boolean boolean39 = home31.isAncestorOf((java.awt.Component) home32);
        home32.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray44 = home32.getOwnedWindows();
        Home home45 = new Home();
        boolean boolean46 = home45.isMaximumSizeSet();
        Home home47 = new Home();
        boolean boolean48 = home47.isMaximumSizeSet();
        int int49 = home45.getComponentZOrder((java.awt.Component) home47);
        java.awt.FocusTraversalPolicy focusTraversalPolicy50 = null;
        home45.setFocusTraversalPolicy(focusTraversalPolicy50);
        boolean boolean52 = home45.isActive();
        Home home53 = new Home();
        boolean boolean54 = home53.isMaximumSizeSet();
        home53.setResizable(false);
        home53.invalidate();
        home53.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton60 = home53.deleteJob;
        home45.addJob = jButton60;
        home32.addJob = jButton60;
        home13.addJob = jButton60;
        home0.remove((java.awt.Component) home13);
        home0.transferFocusBackward();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(windowArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jButton60);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.awt.Window[] windowArray9 = home0.getOwnedWindows();
        java.awt.event.WindowStateListener[] windowStateListenerArray10 = home0.getWindowStateListeners();
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLabel jLabel14 = home11.taskTypeLabel;
        boolean boolean15 = home11.isDisplayable();
        java.awt.ComponentOrientation componentOrientation16 = home11.getComponentOrientation();
        home0.setComponentOrientation(componentOrientation16);
        java.awt.Rectangle rectangle18 = home0.getBounds();
        java.io.PrintWriter printWriter19 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.list(printWriter19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray9);
        org.junit.Assert.assertNotNull(windowStateListenerArray10);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(componentOrientation16);
        org.junit.Assert.assertNotNull(rectangle18);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        java.awt.event.WindowListener[] windowListenerArray8 = home0.getWindowListeners();
        javax.swing.JTextField jTextField9 = home0.taskEndField;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
        org.junit.Assert.assertNotNull(windowListenerArray8);
        org.junit.Assert.assertNull(jTextField9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        boolean boolean7 = home0.isResizable();
        Home home8 = new Home();
        java.awt.Cursor cursor9 = home8.getCursor();
        home8.removeNotify();
        javax.swing.JLabel jLabel11 = home8.taskTypeLabel;
        jLabel11.invalidate();
        home0.taskDescLabel = jLabel11;
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        home14.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser18 = home14.stDate;
        boolean boolean19 = home14.isFocusTraversalPolicySet();
        // The following exception was thrown during execution in test generation
        try {
            home0.setComponentZOrder((java.awt.Component) home14, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cursor9);
        org.junit.Assert.assertNotNull(jLabel11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        float float8 = home2.getAlignmentY();
        java.awt.Dimension dimension9 = home2.size();
        java.awt.image.VolatileImage volatileImage12 = home2.createVolatileImage(112, 0);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        home13.removeNotify();
        javax.swing.JLabel jLabel16 = home13.taskTypeLabel;
        boolean boolean17 = home13.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser18 = home13.enDate;
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        java.awt.Event event21 = null;
        boolean boolean24 = home19.mouseUp(event21, 0, (int) ' ');
        Home home26 = new Home();
        boolean boolean27 = home26.isMaximumSizeSet();
        home26.setResizable(false);
        Home home30 = new Home();
        java.awt.Cursor cursor31 = home30.getCursor();
        home30.removeNotify();
        javax.swing.JLabel jLabel33 = home30.taskTypeLabel;
        jLabel33.invalidate();
        home26.priority = jLabel33;
        java.awt.Component component36 = home19.add("", (java.awt.Component) jLabel33);
        home13.lblScheduledBy = jLabel33;
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = home13.createImage(imageProducer38);
        Home home40 = new Home();
        java.awt.image.BufferStrategy bufferStrategy41 = home40.getBufferStrategy();
        int int42 = home40.getY();
        java.awt.image.BufferStrategy bufferStrategy43 = home40.getBufferStrategy();
        java.awt.Toolkit toolkit44 = home40.getToolkit();
        int int45 = home2.checkImage(image39, (java.awt.image.ImageObserver) home40);
        javax.swing.JLabel jLabel46 = home2.taskEndLabel;
        java.awt.event.MouseListener mouseListener47 = null;
        jLabel46.addMouseListener(mouseListener47);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertNotNull(jLabel16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cursor31);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNull(bufferStrategy41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 112 + "'", int42 == 112);
        org.junit.Assert.assertNull(bufferStrategy43);
        org.junit.Assert.assertNotNull(toolkit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(jLabel46);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        java.awt.event.ContainerListener containerListener14 = null;
        home0.addContainerListener(containerListener14);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.lblScheduledBy;
        home0.deleteJob();
        boolean boolean3 = home0.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        home0.clearAllInput();
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLabel jLabel12 = home9.taskTypeLabel;
        boolean boolean13 = jLabel12.isEnabled();
        boolean boolean14 = jLabel12.isFontSet();
        boolean boolean15 = jLabel12.isFontSet();
        home0.taskEndLabel = jLabel12;
        home0.repaint(16, 12, 16, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLabel12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        javax.swing.JTextField jTextField13 = home1.taskTypeField;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jTextField13);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = home1.getFocusTraversalPolicy();
        java.lang.String str14 = home1.rsp;
        javax.swing.JLabel jLabel15 = home1.taskNameLabel;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(jLabel15);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        home0.firePropertyChange("", (float) ' ', (float) '4');
        java.awt.Graphics graphics13 = home0.getGraphics();
        home0.setFocusTraversalPolicyProvider(true);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNull(graphics13);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        float float9 = home6.getAlignmentX();
        home6.enableInputMethods(true);
        boolean boolean14 = home6.inside((int) (byte) 10, (-1));
        Home home15 = new Home();
        boolean boolean16 = home15.isMaximumSizeSet();
        home15.setResizable(false);
        boolean boolean19 = home15.isActive();
        UserProfile userProfile20 = null;
        home15.userProfile = userProfile20;
        com.toedter.calendar.JDateChooser jDateChooser22 = home15.enDate;
        java.awt.image.ImageProducer imageProducer23 = null;
        java.awt.Image image24 = home15.createImage(imageProducer23);
        Home home25 = new Home();
        boolean boolean26 = home25.isMaximumSizeSet();
        java.awt.Event event27 = null;
        boolean boolean30 = home25.mouseUp(event27, 0, (int) ' ');
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        home32.setResizable(false);
        Home home36 = new Home();
        java.awt.Cursor cursor37 = home36.getCursor();
        home36.removeNotify();
        javax.swing.JLabel jLabel39 = home36.taskTypeLabel;
        jLabel39.invalidate();
        home32.priority = jLabel39;
        java.awt.Component component42 = home25.add("", (java.awt.Component) jLabel39);
        home15.taskTypeLabel = jLabel39;
        java.awt.Shape shape44 = home15.getShape();
        javax.swing.JLabel jLabel45 = home15.taskNameLabel;
        home6.status = jLabel45;
        java.awt.Dialog.ModalExclusionType modalExclusionType47 = home6.getModalExclusionType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jDateChooser22);
        org.junit.Assert.assertNotNull(image24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cursor37);
        org.junit.Assert.assertNotNull(jLabel39);
        org.junit.Assert.assertNotNull(component42);
        org.junit.Assert.assertNull(shape44);
        org.junit.Assert.assertNotNull(jLabel45);
        org.junit.Assert.assertTrue("'" + modalExclusionType47 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType47.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        int int7 = home0.getDefaultCloseOperation();
        home0.resize(2, 112);
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        boolean boolean14 = home11.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox15 = home11.priorityDropdown;
        javax.swing.JTextField jTextField16 = home11.taskTypeField;
        home0.taskNameField = jTextField16;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jComboBox15);
        org.junit.Assert.assertNotNull(jTextField16);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        java.awt.Event event10 = null;
        boolean boolean12 = home0.keyUp(event10, 5);
        java.lang.Object obj13 = home0.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.clearAllInput();
        Home home10 = new Home();
        java.awt.image.BufferStrategy bufferStrategy11 = home10.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener12 = null;
        home10.addHierarchyBoundsListener(hierarchyBoundsListener12);
        boolean boolean14 = home10.isResizable();
        home10.removeAll();
        boolean boolean16 = home10.isLightweight();
        Home home17 = new Home();
        boolean boolean18 = home17.isMaximumSizeSet();
        home17.setResizable(false);
        boolean boolean21 = home17.isActive();
        UserProfile userProfile22 = null;
        home17.userProfile = userProfile22;
        com.toedter.calendar.JDateChooser jDateChooser24 = home17.enDate;
        java.awt.image.ImageProducer imageProducer25 = null;
        java.awt.Image image26 = home17.createImage(imageProducer25);
        home10.setIconImage(image26);
        Home home28 = new Home();
        java.awt.image.BufferStrategy bufferStrategy29 = home28.getBufferStrategy();
        int int30 = home28.getY();
        java.awt.image.BufferStrategy bufferStrategy31 = home28.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener32 = null;
        home28.addMouseWheelListener(mouseWheelListener32);
        int int34 = home28.getComponentCount();
        int int35 = home1.checkImage(image26, (java.awt.image.ImageObserver) home28);
        home28.setFocusableWindowState(true);
        home28.user_id = "Please select a task first to delete";
        java.awt.Event event40 = null;
        boolean boolean43 = home28.mouseExit(event40, (int) (byte) 100, 128);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(bufferStrategy11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jDateChooser24);
        org.junit.Assert.assertNotNull(image26);
        org.junit.Assert.assertNull(bufferStrategy29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 112 + "'", int30 == 112);
        org.junit.Assert.assertNull(bufferStrategy31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        home7.setResizable(false);
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLabel jLabel14 = home11.taskTypeLabel;
        jLabel14.invalidate();
        home7.priority = jLabel14;
        java.awt.Component component17 = home0.add("", (java.awt.Component) jLabel14);
        Home home18 = new Home();
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        home19.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser23 = home19.stDate;
        home18.enDate = jDateChooser23;
        home0.stDate = jDateChooser23;
        java.awt.Dimension dimension26 = jDateChooser23.getSize();
        java.awt.Point point27 = jDateChooser23.getLocation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jDateChooser23);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(point27);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        java.awt.Shape shape14 = null;
        home0.setShape(shape14);
        home0.move(10, (int) '4');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray19 = home0.getHierarchyBoundsListeners();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component21 = home0.getComponent((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray19);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.Dimension dimension7 = home0.getMaximumSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(dimension7);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        javax.swing.JTable jTable7 = home0.table;
        java.awt.event.WindowListener windowListener8 = null;
        home0.removeWindowListener(windowListener8);
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        java.awt.ComponentOrientation componentOrientation15 = home10.getComponentOrientation();
        javax.accessibility.AccessibleContext accessibleContext16 = home10.getAccessibleContext();
        home0.setLocationRelativeTo((java.awt.Component) home10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertNotNull(accessibleContext16);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        home0.transferFocusBackward();
        Home home7 = new Home();
        java.awt.Cursor cursor8 = home7.getCursor();
        java.awt.ImageCapabilities imageCapabilities11 = null;
        java.awt.image.VolatileImage volatileImage12 = home7.createVolatileImage(10, (int) '4', imageCapabilities11);
        java.awt.Container container13 = home7.getParent();
        home7.setTitle("hi!");
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        Home home18 = new Home();
        boolean boolean19 = home18.isMaximumSizeSet();
        int int20 = home16.getComponentZOrder((java.awt.Component) home18);
        javax.swing.JRootPane jRootPane21 = home18.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType22 = null;
        home18.setModalExclusionType(modalExclusionType22);
        Home home24 = new Home();
        java.awt.Cursor cursor25 = home24.getCursor();
        home24.removeNotify();
        boolean boolean27 = home24.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox28 = home24.priorityDropdown;
        home18.priorityDropdown = jComboBox28;
        home7.priorityDropdown = jComboBox28;
        home0.priorityDropdown = jComboBox28;
        java.awt.Graphics graphics32 = null;
        // The following exception was thrown during execution in test generation
        try {
            jComboBox28.print(graphics32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"componentGraphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(cursor8);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNull(container13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(jRootPane21);
        org.junit.Assert.assertNotNull(cursor25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jComboBox28);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        javax.swing.table.DefaultTableModel defaultTableModel4 = home0.tableModel;
        home0.setAlwaysOnTop(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(defaultTableModel4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = home0.requestFocusInWindow(cause4);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = home0.getFocusTraversalPolicy();
        boolean boolean7 = home0.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        home0.addInputMethodListener(inputMethodListener4);
        home0.transferFocusBackward();
        home0.transferFocusDownCycle();
        home0.layout();
        java.awt.Dimension dimension9 = home0.getSize();
        javax.swing.JMenuBar jMenuBar10 = home0.getJMenuBar();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(jMenuBar10);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray13 = home1.getOwnedWindows();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home14.isActive();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        home22.invalidate();
        home22.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton29 = home22.deleteJob;
        home14.addJob = jButton29;
        home1.addJob = jButton29;
        javax.swing.JTextArea jTextArea32 = home1.taskDescField;
        int int33 = home1.sel_task_id;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(windowArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton29);
        org.junit.Assert.assertNotNull(jTextArea32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = home0.createImage(imageProducer8);
        home0.show(false);
        home0.setLocation((int) (byte) 100, 11);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(image9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        java.awt.Component component8 = home0.getComponentAt(1000, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(component8);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        java.awt.ComponentOrientation componentOrientation5 = home0.getComponentOrientation();
        Home home6 = new Home();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        int int11 = home7.getComponentZOrder((java.awt.Component) home9);
        java.awt.FocusTraversalPolicy focusTraversalPolicy12 = null;
        home7.setFocusTraversalPolicy(focusTraversalPolicy12);
        boolean boolean14 = home6.isAncestorOf((java.awt.Component) home7);
        java.lang.String str15 = home6.rsp;
        java.lang.Object obj16 = home6.getTreeLock();
        home6.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home6.setLocationByPlatform(true);
        Home home24 = new Home();
        Home home25 = new Home();
        boolean boolean26 = home25.isMaximumSizeSet();
        Home home27 = new Home();
        boolean boolean28 = home27.isMaximumSizeSet();
        int int29 = home25.getComponentZOrder((java.awt.Component) home27);
        java.awt.FocusTraversalPolicy focusTraversalPolicy30 = null;
        home25.setFocusTraversalPolicy(focusTraversalPolicy30);
        boolean boolean32 = home24.isAncestorOf((java.awt.Component) home25);
        home25.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray37 = home25.getOwnedWindows();
        Home home38 = new Home();
        boolean boolean39 = home38.isMaximumSizeSet();
        Home home40 = new Home();
        boolean boolean41 = home40.isMaximumSizeSet();
        int int42 = home38.getComponentZOrder((java.awt.Component) home40);
        java.awt.FocusTraversalPolicy focusTraversalPolicy43 = null;
        home38.setFocusTraversalPolicy(focusTraversalPolicy43);
        boolean boolean45 = home38.isActive();
        Home home46 = new Home();
        boolean boolean47 = home46.isMaximumSizeSet();
        home46.setResizable(false);
        home46.invalidate();
        home46.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton53 = home46.deleteJob;
        home38.addJob = jButton53;
        home25.addJob = jButton53;
        home6.addJob = jButton53;
        home0.profileBtn = jButton53;
        jButton53.firePropertyChange("", (byte) 1, (byte) 0);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(componentOrientation5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(windowArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jButton53);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.MenuBar menuBar7 = null;
        home0.setMenuBar(menuBar7);
        int int9 = home0.getHeight();
        java.awt.Event event10 = null;
        boolean boolean13 = home0.mouseDown(event10, (int) (short) 10, 3);
        com.toedter.calendar.JDateChooser jDateChooser14 = home0.stDate;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 800 + "'", int9 == 800);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jDateChooser14);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.MouseMotionListener mouseMotionListener5 = null;
        home0.addMouseMotionListener(mouseMotionListener5);
        home0.setFocusCycleRoot(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        boolean boolean5 = home0.isFocusTraversalPolicySet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        Home home24 = new Home();
        Home home25 = new Home();
        boolean boolean26 = home25.isMaximumSizeSet();
        home25.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser29 = home25.stDate;
        home24.enDate = jDateChooser29;
        home6.stDate = jDateChooser29;
        java.awt.Dimension dimension32 = jDateChooser29.getSize();
        java.awt.event.MouseListener[] mouseListenerArray33 = jDateChooser29.getMouseListeners();
        home0.stDate = jDateChooser29;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jDateChooser29);
        org.junit.Assert.assertNotNull(dimension32);
        org.junit.Assert.assertNotNull(mouseListenerArray33);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        javax.swing.JButton jButton2 = home0.deleteJob;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(jButton2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        home0.addMouseWheelListener(mouseWheelListener4);
        Home home6 = new Home();
        java.awt.Cursor cursor7 = home6.getCursor();
        home6.removeNotify();
        javax.swing.JLayeredPane jLayeredPane9 = home6.getLayeredPane();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        Home home12 = new Home();
        boolean boolean13 = home12.isMaximumSizeSet();
        int int14 = home10.getComponentZOrder((java.awt.Component) home12);
        java.awt.FocusTraversalPolicy focusTraversalPolicy15 = null;
        home10.setFocusTraversalPolicy(focusTraversalPolicy15);
        boolean boolean17 = home10.isActive();
        java.awt.Point point18 = home10.location();
        home6.setLocation(point18);
        boolean boolean20 = home0.contains(point18);
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(cursor7);
        org.junit.Assert.assertNotNull(jLayeredPane9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(point18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        javax.swing.JRootPane jRootPane6 = home0.getRootPane();
        java.awt.event.KeyListener[] keyListenerArray7 = home0.getKeyListeners();
        java.awt.event.HierarchyListener[] hierarchyListenerArray8 = home0.getHierarchyListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertNotNull(keyListenerArray7);
        org.junit.Assert.assertNotNull(hierarchyListenerArray8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        boolean boolean13 = home0.hasFocus();
        home0.clearAllInput();
        java.awt.dnd.DropTarget dropTarget15 = home0.getDropTarget();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet17 = home0.getFocusTraversalKeys((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(dropTarget15);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = home0.requestFocusInWindow(cause4);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = home0.getFocusTraversalPolicy();
        javax.swing.JTable jTable7 = home0.table;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy6);
        org.junit.Assert.assertNotNull(jTable7);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLayeredPane jLayeredPane3 = home0.getLayeredPane();
        Home home4 = new Home();
        boolean boolean5 = home4.isMaximumSizeSet();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        int int8 = home4.getComponentZOrder((java.awt.Component) home6);
        java.awt.FocusTraversalPolicy focusTraversalPolicy9 = null;
        home4.setFocusTraversalPolicy(focusTraversalPolicy9);
        boolean boolean11 = home4.isActive();
        java.awt.Point point12 = home4.location();
        home0.setLocation(point12);
        java.awt.Shape shape14 = null;
        home0.setShape(shape14);
        // The following exception was thrown during execution in test generation
        try {
            home0.setDefaultCloseOperation((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLayeredPane3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(point12);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Graphics graphics6 = null;
        home0.paint(graphics6);
        int int10 = home0.getBaseline(4, 2);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = jLabel3.isEnabled();
        java.awt.ImageCapabilities imageCapabilities7 = null;
        java.awt.image.VolatileImage volatileImage8 = jLabel3.createVolatileImage((int) ' ', (int) (short) 10, imageCapabilities7);
        java.awt.event.FocusListener focusListener9 = null;
        jLabel3.removeFocusListener(focusListener9);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(volatileImage8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        float float8 = home2.getAlignmentY();
        java.awt.Dimension dimension9 = home2.size();
        java.awt.image.VolatileImage volatileImage12 = home2.createVolatileImage(112, 0);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        home13.removeNotify();
        javax.swing.JLabel jLabel16 = home13.taskTypeLabel;
        boolean boolean17 = home13.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser18 = home13.enDate;
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        java.awt.Event event21 = null;
        boolean boolean24 = home19.mouseUp(event21, 0, (int) ' ');
        Home home26 = new Home();
        boolean boolean27 = home26.isMaximumSizeSet();
        home26.setResizable(false);
        Home home30 = new Home();
        java.awt.Cursor cursor31 = home30.getCursor();
        home30.removeNotify();
        javax.swing.JLabel jLabel33 = home30.taskTypeLabel;
        jLabel33.invalidate();
        home26.priority = jLabel33;
        java.awt.Component component36 = home19.add("", (java.awt.Component) jLabel33);
        home13.lblScheduledBy = jLabel33;
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = home13.createImage(imageProducer38);
        Home home40 = new Home();
        java.awt.image.BufferStrategy bufferStrategy41 = home40.getBufferStrategy();
        int int42 = home40.getY();
        java.awt.image.BufferStrategy bufferStrategy43 = home40.getBufferStrategy();
        java.awt.Toolkit toolkit44 = home40.getToolkit();
        int int45 = home2.checkImage(image39, (java.awt.image.ImageObserver) home40);
        home40.doLayout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertNotNull(jLabel16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cursor31);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNull(bufferStrategy41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 112 + "'", int42 == 112);
        org.junit.Assert.assertNull(bufferStrategy43);
        org.junit.Assert.assertNotNull(toolkit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        Home home5 = new Home();
        boolean boolean6 = home5.isMaximumSizeSet();
        home5.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser9 = home5.stDate;
        boolean boolean10 = jDateChooser9.isValid();
        home0.removePropertyChangeListener("hi!", (java.beans.PropertyChangeListener) jDateChooser9);
        java.awt.event.ContainerListener[] containerListenerArray12 = home0.getContainerListeners();
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        java.awt.Event event15 = null;
        boolean boolean18 = home13.mouseUp(event15, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray19 = home13.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage22 = home13.createVolatileImage(0, (int) (short) 1);
        boolean boolean23 = home13.isOpaque();
        java.awt.Dimension dimension24 = home13.minimumSize();
        home0.setMinimumSize(dimension24);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jDateChooser9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(containerListenerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray19);
        org.junit.Assert.assertNull(volatileImage22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dimension24);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.util.Locale locale11 = null;
        home0.setLocale(locale11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        boolean boolean7 = home0.hasFocus();
        home0.clearAllInput();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray7 = home0.getMouseWheelListeners();
        java.awt.event.FocusListener[] focusListenerArray8 = home0.getFocusListeners();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = home0.getPropertyChangeListeners("Please select a task first to delete");
        int int11 = home0.getWidth();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray7);
        org.junit.Assert.assertNotNull(focusListenerArray8);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1000 + "'", int11 == 1000);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        home0.setFocusable(true);
        javax.swing.JMenuBar jMenuBar9 = home0.getJMenuBar();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        home10.setResizable(false);
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        home14.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser18 = home14.stDate;
        home10.stDate = jDateChooser18;
        javax.swing.JButton jButton20 = home10.deleteJob;
        home0.deleteJob = jButton20;
        javax.swing.JButton jButton22 = home0.profileBtn;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(jMenuBar9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertNotNull(jButton22);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        java.awt.event.WindowListener[] windowListenerArray4 = home0.getWindowListeners();
        boolean boolean5 = home0.isAlwaysOnTopSupported();
        home0.repaint((long) (byte) -1, 3, 32, (int) (short) 1, 12);
        home0.hide();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(windowListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.invalidate();
        home0.setFocusTraversalKeysEnabled(false);
        java.awt.ImageCapabilities imageCapabilities9 = null;
        java.awt.image.VolatileImage volatileImage10 = home0.createVolatileImage(112, 4, imageCapabilities9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(volatileImage10);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        int int0 = java.awt.Frame.NORMAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        float float8 = home2.getAlignmentY();
        java.awt.Dimension dimension9 = home2.size();
        java.awt.image.VolatileImage volatileImage12 = home2.createVolatileImage(112, 0);
        java.awt.Container container13 = home2.getFocusCycleRootAncestor();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNull(container13);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        java.awt.Component component9 = jDateChooser5.findComponentAt(2, (int) (byte) 0);
        java.awt.Dimension dimension10 = jDateChooser5.getMinimumSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertNull(component9);
        org.junit.Assert.assertNotNull(dimension10);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener4 = null;
        home0.addMouseWheelListener(mouseWheelListener4);
        home0.repaint((long) 13);
        // The following exception was thrown during execution in test generation
        try {
            home0.applyResourceBundle("");
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Can't find bundle for base name , locale en_GB");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        java.awt.Dimension dimension7 = home0.getMinimumSize();
        java.awt.Event event8 = null;
        boolean boolean11 = home0.mouseMove(event8, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        javax.swing.JRootPane jRootPane6 = home0.getRootPane();
        home0.validate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(jRootPane6);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        javax.swing.JTable jTable7 = home0.table;
        java.awt.event.WindowListener windowListener8 = null;
        home0.removeWindowListener(windowListener8);
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        home10.setResizable(false);
        Home home14 = new Home();
        java.awt.Cursor cursor15 = home14.getCursor();
        home14.removeNotify();
        javax.swing.JLabel jLabel17 = home14.taskTypeLabel;
        jLabel17.invalidate();
        home10.priority = jLabel17;
        boolean boolean20 = jLabel17.getFocusTraversalKeysEnabled();
        home0.status = jLabel17;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cursor15);
        org.junit.Assert.assertNotNull(jLabel17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        javax.swing.TransferHandler transferHandler6 = null;
        home0.setTransferHandler(transferHandler6);
        home0.move((int) (byte) 10, 460);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        home0.lblScheduledBy = jLabel20;
        java.awt.image.ImageProducer imageProducer25 = null;
        java.awt.Image image26 = home0.createImage(imageProducer25);
        java.awt.event.MouseListener[] mouseListenerArray27 = home0.getMouseListeners();
        java.awt.Color color28 = home0.getForeground();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
        org.junit.Assert.assertNotNull(image26);
        org.junit.Assert.assertNotNull(mouseListenerArray27);
        org.junit.Assert.assertNull(color28);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        java.awt.event.WindowListener[] windowListenerArray4 = home0.getWindowListeners();
        boolean boolean5 = home0.isAlwaysOnTopSupported();
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home6.addHierarchyBoundsListener(hierarchyBoundsListener8);
        boolean boolean10 = home6.isResizable();
        home6.removeAll();
        java.util.Locale locale12 = null;
        home6.setLocale(locale12);
        javax.swing.JTextField jTextField14 = home6.taskNameField;
        home0.taskStartField = jTextField14;
        java.awt.Component component16 = home0.getGlassPane();
        Home home17 = new Home();
        java.awt.image.BufferStrategy bufferStrategy18 = home17.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener19 = null;
        home17.addHierarchyBoundsListener(hierarchyBoundsListener19);
        boolean boolean21 = home17.isResizable();
        java.awt.Dimension dimension22 = null;
        home17.setMinimumSize(dimension22);
        Home home24 = new Home();
        java.awt.Cursor cursor25 = home24.getCursor();
        home24.removeNotify();
        javax.swing.JLabel jLabel27 = home24.taskTypeLabel;
        boolean boolean28 = home24.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser29 = home24.enDate;
        home17.stDate = jDateChooser29;
        javax.swing.JTextArea jTextArea31 = home17.taskDescField;
        home0.taskDescField = jTextArea31;
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(windowListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertNull(bufferStrategy18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cursor25);
        org.junit.Assert.assertNotNull(jLabel27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jDateChooser29);
        org.junit.Assert.assertNotNull(jTextArea31);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home6.addHierarchyBoundsListener(hierarchyBoundsListener8);
        boolean boolean10 = home6.isResizable();
        home6.removeAll();
        java.util.Locale locale12 = null;
        home6.setLocale(locale12);
        javax.swing.JTextField jTextField14 = home6.taskNameField;
        home0.taskNameField = jTextField14;
        boolean boolean16 = home0.isVisible();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        home0.addJob();
        java.awt.Component component9 = home0.getGlassPane();
        home0.enableInputMethods(false);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        java.awt.ComponentOrientation componentOrientation5 = home0.getComponentOrientation();
        javax.accessibility.AccessibleContext accessibleContext6 = home0.getAccessibleContext();
        boolean boolean7 = home0.isFocusableWindow();
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(componentOrientation5);
        org.junit.Assert.assertNotNull(accessibleContext6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        home0.clearAllInput();
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        javax.swing.JLabel jLabel12 = home9.taskTypeLabel;
        boolean boolean13 = jLabel12.isEnabled();
        boolean boolean14 = jLabel12.isFontSet();
        boolean boolean15 = jLabel12.isFontSet();
        home0.taskEndLabel = jLabel12;
        java.awt.Color color17 = jLabel12.getForeground();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(jLabel12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(color17);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        javax.swing.TransferHandler transferHandler6 = home2.getTransferHandler();
        javax.swing.JButton jButton7 = home2.profileBtn;
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray8 = home2.getMouseWheelListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNull(transferHandler6);
        org.junit.Assert.assertNotNull(jButton7);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray8);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        home6.addHierarchyBoundsListener(hierarchyBoundsListener8);
        boolean boolean10 = home6.isResizable();
        home6.removeAll();
        java.util.Locale locale12 = null;
        home6.setLocale(locale12);
        javax.swing.JTextField jTextField14 = home6.taskNameField;
        home0.taskNameField = jTextField14;
        Home home16 = new Home();
        java.awt.image.BufferStrategy bufferStrategy17 = home16.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener18 = null;
        home16.addHierarchyBoundsListener(hierarchyBoundsListener18);
        boolean boolean20 = home16.isResizable();
        java.awt.Dimension dimension21 = null;
        home16.setMinimumSize(dimension21);
        javax.swing.JTable jTable23 = home16.table;
        home16.addJob();
        java.awt.Component component25 = home16.getGlassPane();
        Home home26 = new Home();
        java.awt.Cursor cursor27 = home26.getCursor();
        home26.removeNotify();
        javax.swing.JLabel jLabel29 = home26.taskTypeLabel;
        boolean boolean30 = home26.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser31 = home26.enDate;
        Home home32 = new Home();
        boolean boolean33 = home32.isMaximumSizeSet();
        java.awt.Event event34 = null;
        boolean boolean37 = home32.mouseUp(event34, 0, (int) ' ');
        Home home39 = new Home();
        boolean boolean40 = home39.isMaximumSizeSet();
        home39.setResizable(false);
        Home home43 = new Home();
        java.awt.Cursor cursor44 = home43.getCursor();
        home43.removeNotify();
        javax.swing.JLabel jLabel46 = home43.taskTypeLabel;
        jLabel46.invalidate();
        home39.priority = jLabel46;
        java.awt.Component component49 = home32.add("", (java.awt.Component) jLabel46);
        home26.lblScheduledBy = jLabel46;
        java.awt.image.ImageProducer imageProducer51 = null;
        java.awt.Image image52 = home26.createImage(imageProducer51);
        home16.setIconImage(image52);
        Home home56 = new Home();
        Home home57 = new Home();
        boolean boolean58 = home57.isMaximumSizeSet();
        Home home59 = new Home();
        boolean boolean60 = home59.isMaximumSizeSet();
        int int61 = home57.getComponentZOrder((java.awt.Component) home59);
        java.awt.FocusTraversalPolicy focusTraversalPolicy62 = null;
        home57.setFocusTraversalPolicy(focusTraversalPolicy62);
        boolean boolean64 = home56.isAncestorOf((java.awt.Component) home57);
        home57.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        java.awt.Window[] windowArray69 = home57.getOwnedWindows();
        Home home70 = new Home();
        boolean boolean71 = home70.isMaximumSizeSet();
        Home home72 = new Home();
        boolean boolean73 = home72.isMaximumSizeSet();
        int int74 = home70.getComponentZOrder((java.awt.Component) home72);
        java.awt.FocusTraversalPolicy focusTraversalPolicy75 = null;
        home70.setFocusTraversalPolicy(focusTraversalPolicy75);
        boolean boolean77 = home70.isActive();
        Home home78 = new Home();
        boolean boolean79 = home78.isMaximumSizeSet();
        home78.setResizable(false);
        home78.invalidate();
        home78.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton85 = home78.deleteJob;
        home70.addJob = jButton85;
        home57.addJob = jButton85;
        javax.swing.JTextArea jTextArea88 = home57.taskDescField;
        boolean boolean89 = home0.prepareImage(image52, (int) (short) 0, 1, (java.awt.image.ImageObserver) home57);
        java.awt.Event event90 = null;
        boolean boolean92 = home57.keyDown(event90, 3);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jTextField14);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jTable23);
        org.junit.Assert.assertNotNull(component25);
        org.junit.Assert.assertNotNull(cursor27);
        org.junit.Assert.assertNotNull(jLabel29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jDateChooser31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cursor44);
        org.junit.Assert.assertNotNull(jLabel46);
        org.junit.Assert.assertNotNull(component49);
        org.junit.Assert.assertNotNull(image52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(windowArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jButton85);
        org.junit.Assert.assertNotNull(jTextArea88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        int int12 = home8.getComponentZOrder((java.awt.Component) home10);
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = null;
        home8.setFocusTraversalPolicy(focusTraversalPolicy13);
        boolean boolean15 = home8.isActive();
        java.awt.Point point16 = home8.location();
        java.awt.Component component17 = home0.getComponentAt(point16);
        home0.removeAll();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(point16);
        org.junit.Assert.assertNotNull(component17);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        Home home9 = new Home();
        java.awt.Cursor cursor10 = home9.getCursor();
        home9.removeNotify();
        java.awt.Dialog.ModalExclusionType modalExclusionType12 = null;
        home9.setModalExclusionType(modalExclusionType12);
        java.awt.LayoutManager layoutManager14 = home9.getLayout();
        home0.setLayout(layoutManager14);
        java.awt.event.WindowStateListener windowStateListener16 = null;
        home0.addWindowStateListener(windowStateListener16);
        java.awt.event.MouseWheelListener mouseWheelListener18 = null;
        home0.addMouseWheelListener(mouseWheelListener18);
        home0.setFocusableWindowState(false);
        javax.swing.JTextArea jTextArea22 = home0.taskDescField;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertNotNull(cursor10);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertNotNull(jTextArea22);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        javax.swing.JLabel jLabel3 = home0.taskTypeLabel;
        boolean boolean4 = home0.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser5 = home0.enDate;
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        java.awt.Event event8 = null;
        boolean boolean11 = home6.mouseUp(event8, 0, (int) ' ');
        Home home13 = new Home();
        boolean boolean14 = home13.isMaximumSizeSet();
        home13.setResizable(false);
        Home home17 = new Home();
        java.awt.Cursor cursor18 = home17.getCursor();
        home17.removeNotify();
        javax.swing.JLabel jLabel20 = home17.taskTypeLabel;
        jLabel20.invalidate();
        home13.priority = jLabel20;
        java.awt.Component component23 = home6.add("", (java.awt.Component) jLabel20);
        home0.lblScheduledBy = jLabel20;
        java.awt.event.ComponentListener componentListener25 = null;
        home0.removeComponentListener(componentListener25);
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jLabel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cursor18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(component23);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        Home home8 = new Home();
        java.awt.Cursor cursor9 = home8.getCursor();
        home8.removeNotify();
        boolean boolean11 = home8.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox12 = home8.priorityDropdown;
        home2.priorityDropdown = jComboBox12;
        java.awt.event.WindowFocusListener[] windowFocusListenerArray14 = home2.getWindowFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(cursor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jComboBox12);
        org.junit.Assert.assertNotNull(windowFocusListenerArray14);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        boolean boolean7 = home0.isResizable();
        Home home8 = new Home();
        java.awt.Cursor cursor9 = home8.getCursor();
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = home8.createVolatileImage(10, (int) '4', imageCapabilities12);
        java.awt.Container container14 = home8.getParent();
        home8.rsp = "hi!";
        boolean boolean19 = home8.contains((int) (byte) 1, (int) (byte) 100);
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        java.awt.Event event22 = null;
        boolean boolean25 = home20.mouseUp(event22, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray26 = home20.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage29 = home20.createVolatileImage(0, (int) (short) 1);
        java.awt.Window[] windowArray30 = home20.getOwnedWindows();
        javax.swing.JComboBox jComboBox31 = home20.statusDropdown;
        home8.priorityDropdown = jComboBox31;
        home0.scheduleDropdown = jComboBox31;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cursor9);
        org.junit.Assert.assertNull(volatileImage13);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray26);
        org.junit.Assert.assertNull(volatileImage29);
        org.junit.Assert.assertNotNull(windowArray30);
        org.junit.Assert.assertNotNull(jComboBox31);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        home0.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home0.setLocationByPlatform(true);
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        home0.addInputMethodListener(inputMethodListener18);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        java.util.Locale locale6 = null;
        home0.setLocale(locale6);
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        Home home10 = new Home();
        boolean boolean11 = home10.isMaximumSizeSet();
        int int12 = home8.getComponentZOrder((java.awt.Component) home10);
        javax.swing.JRootPane jRootPane13 = home10.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType14 = null;
        home10.setModalExclusionType(modalExclusionType14);
        float float16 = home10.getAlignmentY();
        java.awt.Dimension dimension17 = home10.size();
        java.awt.image.VolatileImage volatileImage20 = home10.createVolatileImage(112, 0);
        Home home21 = new Home();
        java.awt.Cursor cursor22 = home21.getCursor();
        home21.removeNotify();
        javax.swing.JLabel jLabel24 = home21.taskTypeLabel;
        boolean boolean25 = home21.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser26 = home21.enDate;
        Home home27 = new Home();
        boolean boolean28 = home27.isMaximumSizeSet();
        java.awt.Event event29 = null;
        boolean boolean32 = home27.mouseUp(event29, 0, (int) ' ');
        Home home34 = new Home();
        boolean boolean35 = home34.isMaximumSizeSet();
        home34.setResizable(false);
        Home home38 = new Home();
        java.awt.Cursor cursor39 = home38.getCursor();
        home38.removeNotify();
        javax.swing.JLabel jLabel41 = home38.taskTypeLabel;
        jLabel41.invalidate();
        home34.priority = jLabel41;
        java.awt.Component component44 = home27.add("", (java.awt.Component) jLabel41);
        home21.lblScheduledBy = jLabel41;
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = home21.createImage(imageProducer46);
        Home home48 = new Home();
        java.awt.image.BufferStrategy bufferStrategy49 = home48.getBufferStrategy();
        int int50 = home48.getY();
        java.awt.image.BufferStrategy bufferStrategy51 = home48.getBufferStrategy();
        java.awt.Toolkit toolkit52 = home48.getToolkit();
        int int53 = home10.checkImage(image47, (java.awt.image.ImageObserver) home48);
        javax.swing.JLabel jLabel54 = home10.taskEndLabel;
        home0.taskNameLabel = jLabel54;
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray56 = home0.getHierarchyBoundsListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(jRootPane13);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNull(volatileImage20);
        org.junit.Assert.assertNotNull(cursor22);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jDateChooser26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cursor39);
        org.junit.Assert.assertNotNull(jLabel41);
        org.junit.Assert.assertNotNull(component44);
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertNull(bufferStrategy49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 112 + "'", int50 == 112);
        org.junit.Assert.assertNull(bufferStrategy51);
        org.junit.Assert.assertNotNull(toolkit52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(jLabel54);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray56);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        int int7 = home0.getDefaultCloseOperation();
        boolean boolean8 = home0.isVisible();
        home0.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.lblScheduledBy;
        home0.deleteJob();
        java.awt.Image image3 = home0.getIconImage();
        home0.rsp = "hi!";
        java.awt.Dimension dimension6 = home0.preferredSize();
        java.lang.String str7 = home0.getTitle();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNull(image3);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Job Scheduler" + "'", str7, "Job Scheduler");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home2.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        home2.setModalExclusionType(modalExclusionType6);
        float float8 = home2.getAlignmentY();
        java.awt.Dimension dimension9 = home2.size();
        java.awt.image.VolatileImage volatileImage12 = home2.createVolatileImage(112, 0);
        Home home13 = new Home();
        java.awt.Cursor cursor14 = home13.getCursor();
        home13.removeNotify();
        javax.swing.JLabel jLabel16 = home13.taskTypeLabel;
        boolean boolean17 = home13.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser18 = home13.enDate;
        Home home19 = new Home();
        boolean boolean20 = home19.isMaximumSizeSet();
        java.awt.Event event21 = null;
        boolean boolean24 = home19.mouseUp(event21, 0, (int) ' ');
        Home home26 = new Home();
        boolean boolean27 = home26.isMaximumSizeSet();
        home26.setResizable(false);
        Home home30 = new Home();
        java.awt.Cursor cursor31 = home30.getCursor();
        home30.removeNotify();
        javax.swing.JLabel jLabel33 = home30.taskTypeLabel;
        jLabel33.invalidate();
        home26.priority = jLabel33;
        java.awt.Component component36 = home19.add("", (java.awt.Component) jLabel33);
        home13.lblScheduledBy = jLabel33;
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = home13.createImage(imageProducer38);
        Home home40 = new Home();
        java.awt.image.BufferStrategy bufferStrategy41 = home40.getBufferStrategy();
        int int42 = home40.getY();
        java.awt.image.BufferStrategy bufferStrategy43 = home40.getBufferStrategy();
        java.awt.Toolkit toolkit44 = home40.getToolkit();
        int int45 = home2.checkImage(image39, (java.awt.image.ImageObserver) home40);
        java.io.PrintStream printStream46 = null;
        // The following exception was thrown during execution in test generation
        try {
            home40.list(printStream46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertNull(volatileImage12);
        org.junit.Assert.assertNotNull(cursor14);
        org.junit.Assert.assertNotNull(jLabel16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jDateChooser18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cursor31);
        org.junit.Assert.assertNotNull(jLabel33);
        org.junit.Assert.assertNotNull(component36);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertNull(bufferStrategy41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 112 + "'", int42 == 112);
        org.junit.Assert.assertNull(bufferStrategy43);
        org.junit.Assert.assertNotNull(toolkit44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        home0.addJob();
        java.awt.Component component9 = home0.getGlassPane();
        java.awt.event.ComponentListener componentListener10 = null;
        component9.removeComponentListener(componentListener10);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(component9);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Toolkit toolkit5 = home0.getToolkit();
        Home home6 = new Home();
        java.awt.Cursor cursor7 = home6.getCursor();
        home6.removeNotify();
        javax.swing.JLabel jLabel9 = home6.taskTypeLabel;
        boolean boolean10 = jLabel9.isEnabled();
        java.awt.ImageCapabilities imageCapabilities13 = null;
        java.awt.image.VolatileImage volatileImage14 = jLabel9.createVolatileImage((int) ' ', (int) (short) 10, imageCapabilities13);
        int int15 = home0.getComponentZOrder((java.awt.Component) jLabel9);
        home0.deleteJob();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(toolkit5);
        org.junit.Assert.assertNotNull(cursor7);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(volatileImage14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        javax.swing.JComboBox jComboBox7 = home0.priorityDropdown;
        jComboBox7.invalidate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jComboBox7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        home0.firePropertyChange("hi!", (float) (byte) 1, (float) (byte) 1);
        javax.swing.JButton jButton7 = home0.deleteJob;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNotNull(jButton7);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        int int9 = home0.getComponentCount();
        int int10 = home0.getComponentCount();
        UserProfile userProfile11 = home0.userProfile;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(userProfile11);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        home0.removeAll();
        boolean boolean6 = home0.isLightweight();
        Home home7 = new Home();
        boolean boolean8 = home7.isMaximumSizeSet();
        home7.setResizable(false);
        boolean boolean11 = home7.isActive();
        UserProfile userProfile12 = null;
        home7.userProfile = userProfile12;
        com.toedter.calendar.JDateChooser jDateChooser14 = home7.enDate;
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = home7.createImage(imageProducer15);
        home0.setIconImage(image16);
        Home home18 = new Home();
        boolean boolean19 = home18.isMaximumSizeSet();
        javax.swing.JButton jButton20 = null;
        home18.deleteJob = jButton20;
        home18.updateJob();
        Home home23 = new Home();
        java.awt.image.BufferStrategy bufferStrategy24 = home23.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener25 = null;
        home23.addHierarchyBoundsListener(hierarchyBoundsListener25);
        java.awt.event.FocusEvent.Cause cause27 = null;
        boolean boolean28 = home23.requestFocusInWindow(cause27);
        java.awt.FocusTraversalPolicy focusTraversalPolicy29 = home23.getFocusTraversalPolicy();
        home18.setFocusTraversalPolicy(focusTraversalPolicy29);
        home0.setFocusTraversalPolicy(focusTraversalPolicy29);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jDateChooser14);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(bufferStrategy24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy29);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        home0.setFocusableWindowState(false);
        java.awt.Image image6 = home0.getIconImage();
        java.awt.Event event7 = null;
        boolean boolean10 = home0.mouseExit(event7, 13, (int) '#');
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNull(image6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        home0.repaint((long) (short) 1, 800, (int) '4', (int) '4', (int) (short) 0);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        home0.addHierarchyListener(hierarchyListener13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        home0.setFocusTraversalKeysEnabled(false);
        int int7 = home0.getCursorType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        java.awt.Toolkit toolkit4 = home0.getToolkit();
        Home home5 = new Home();
        Home home6 = new Home();
        boolean boolean7 = home6.isMaximumSizeSet();
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        int int10 = home6.getComponentZOrder((java.awt.Component) home8);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = null;
        home6.setFocusTraversalPolicy(focusTraversalPolicy11);
        boolean boolean13 = home5.isAncestorOf((java.awt.Component) home6);
        home6.clearAllInput();
        Home home15 = new Home();
        java.awt.image.BufferStrategy bufferStrategy16 = home15.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        home15.addHierarchyBoundsListener(hierarchyBoundsListener17);
        boolean boolean19 = home15.isResizable();
        home15.removeAll();
        boolean boolean21 = home15.isLightweight();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        home22.setResizable(false);
        boolean boolean26 = home22.isActive();
        UserProfile userProfile27 = null;
        home22.userProfile = userProfile27;
        com.toedter.calendar.JDateChooser jDateChooser29 = home22.enDate;
        java.awt.image.ImageProducer imageProducer30 = null;
        java.awt.Image image31 = home22.createImage(imageProducer30);
        home15.setIconImage(image31);
        Home home33 = new Home();
        java.awt.image.BufferStrategy bufferStrategy34 = home33.getBufferStrategy();
        int int35 = home33.getY();
        java.awt.image.BufferStrategy bufferStrategy36 = home33.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener37 = null;
        home33.addMouseWheelListener(mouseWheelListener37);
        int int39 = home33.getComponentCount();
        int int40 = home6.checkImage(image31, (java.awt.image.ImageObserver) home33);
        Home home43 = new Home();
        java.awt.image.BufferStrategy bufferStrategy44 = home43.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener45 = null;
        home43.addHierarchyBoundsListener(hierarchyBoundsListener45);
        boolean boolean47 = home43.isResizable();
        java.awt.Dimension dimension48 = null;
        home43.setMinimumSize(dimension48);
        int int50 = home0.checkImage(image31, 12, 0, (java.awt.image.ImageObserver) home43);
        Home home51 = new Home();
        java.awt.Cursor cursor52 = home51.getCursor();
        home51.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener54 = null;
        home51.addWindowFocusListener(windowFocusListener54);
        Home home56 = new Home();
        java.awt.Cursor cursor57 = home56.getCursor();
        home56.removeNotify();
        javax.swing.JLabel jLabel59 = home56.taskTypeLabel;
        boolean boolean60 = jLabel59.isEnabled();
        home51.taskNameLabel = jLabel59;
        java.awt.Component component62 = home0.add((java.awt.Component) jLabel59);
        java.awt.Component component65 = jLabel59.getComponentAt(11, (int) (short) 100);
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(toolkit4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(bufferStrategy16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jDateChooser29);
        org.junit.Assert.assertNotNull(image31);
        org.junit.Assert.assertNull(bufferStrategy34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNull(bufferStrategy36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(bufferStrategy44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 32 + "'", int50 == 32);
        org.junit.Assert.assertNotNull(cursor52);
        org.junit.Assert.assertNotNull(cursor57);
        org.junit.Assert.assertNotNull(jLabel59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(component62);
        org.junit.Assert.assertNull(component65);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        home0.layout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        boolean boolean5 = home0.isAlwaysOnTop();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        home0.invalidate();
        home0.setFocusTraversalKeysEnabled(false);
        javax.swing.JButton jButton7 = home0.deleteJob;
        javax.swing.table.DefaultTableModel defaultTableModel8 = home0.tableModel;
        home0.setEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jButton7);
        org.junit.Assert.assertNotNull(defaultTableModel8);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        java.awt.Graphics graphics11 = null;
        home0.update(graphics11);
        boolean boolean13 = home0.hasFocus();
        home0.revalidate();
        java.awt.event.HierarchyListener[] hierarchyListenerArray15 = home0.getHierarchyListeners();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray15);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        home0.toFront();
        home0.setUndecorated(true);
        java.awt.Graphics graphics10 = null;
        home0.printComponents(graphics10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener5 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener5);
        java.awt.Dimension dimension7 = home0.getSize();
        Home home8 = new Home();
        java.awt.Cursor cursor9 = home8.getCursor();
        home8.removeNotify();
        boolean boolean11 = home8.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox12 = home8.priorityDropdown;
        javax.swing.JTextField jTextField13 = home8.taskTypeField;
        home0.taskStartField = jTextField13;
        java.awt.event.KeyListener keyListener15 = null;
        home0.removeKeyListener(keyListener15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertNotNull(cursor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jComboBox12);
        org.junit.Assert.assertNotNull(jTextField13);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        Home home5 = new Home();
        java.awt.Cursor cursor6 = home5.getCursor();
        home5.removeNotify();
        javax.swing.JLabel jLabel8 = home5.taskTypeLabel;
        boolean boolean9 = jLabel8.isEnabled();
        home0.taskTypeLabel = jLabel8;
        java.awt.event.FocusListener focusListener11 = null;
        jLabel8.addFocusListener(focusListener11);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cursor6);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        home0.toFront();
        home0.setUndecorated(true);
        java.awt.event.WindowFocusListener windowFocusListener10 = null;
        home0.addWindowFocusListener(windowFocusListener10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        home1.firePropertyChange("hi!", (short) 100, (short) (byte) 1);
        boolean boolean13 = home1.isFocusTraversable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        home1.setResizable(false);
        com.toedter.calendar.JDateChooser jDateChooser5 = home1.stDate;
        home0.enDate = jDateChooser5;
        home0.setFocusable(true);
        Home home9 = new Home();
        boolean boolean10 = home9.isMaximumSizeSet();
        Home home11 = new Home();
        boolean boolean12 = home11.isMaximumSizeSet();
        int int13 = home9.getComponentZOrder((java.awt.Component) home11);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener14 = null;
        home9.addHierarchyBoundsListener(hierarchyBoundsListener14);
        java.awt.MenuBar menuBar16 = null;
        home9.setMenuBar(menuBar16);
        javax.swing.JTable jTable18 = home9.table;
        home0.table = jTable18;
        javax.swing.JLabel jLabel20 = home0.taskStartLabel;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(jDateChooser5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(jTable18);
        org.junit.Assert.assertNotNull(jLabel20);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        Home home0 = new Home();
        Home home1 = new Home();
        boolean boolean2 = home1.isMaximumSizeSet();
        Home home3 = new Home();
        boolean boolean4 = home3.isMaximumSizeSet();
        int int5 = home1.getComponentZOrder((java.awt.Component) home3);
        java.awt.FocusTraversalPolicy focusTraversalPolicy6 = null;
        home1.setFocusTraversalPolicy(focusTraversalPolicy6);
        boolean boolean8 = home0.isAncestorOf((java.awt.Component) home1);
        java.lang.String str9 = home0.rsp;
        java.lang.Object obj10 = home0.getTreeLock();
        home0.repaint((int) (byte) 10, 5, (int) (byte) -1, (-1));
        home0.setLocationByPlatform(true);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray19 = home0.getPropertyChangeListeners("");
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        javax.swing.JRootPane jRootPane25 = home22.getRootPane();
        java.awt.Dialog.ModalExclusionType modalExclusionType26 = null;
        home22.setModalExclusionType(modalExclusionType26);
        float float28 = home22.getAlignmentY();
        java.awt.Dimension dimension29 = home22.size();
        home0.resize(dimension29);
        Home home31 = new Home();
        boolean boolean32 = home31.isMaximumSizeSet();
        Home home33 = new Home();
        boolean boolean34 = home33.isMaximumSizeSet();
        int int35 = home31.getComponentZOrder((java.awt.Component) home33);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener36 = null;
        home31.addHierarchyBoundsListener(hierarchyBoundsListener36);
        java.awt.Dimension dimension38 = home31.getSize();
        Home home39 = new Home();
        java.awt.Cursor cursor40 = home39.getCursor();
        home39.removeNotify();
        boolean boolean42 = home39.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox43 = home39.priorityDropdown;
        javax.swing.JTextField jTextField44 = home39.taskTypeField;
        home31.taskStartField = jTextField44;
        home0.taskStartField = jTextField44;
        Home home47 = new Home();
        java.awt.image.BufferStrategy bufferStrategy48 = home47.getBufferStrategy();
        int int49 = home47.getY();
        java.awt.event.HierarchyListener[] hierarchyListenerArray50 = home47.getHierarchyListeners();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component52 = home0.add((java.awt.Component) home47, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(jRootPane25);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.5f + "'", float28 == 0.5f);
        org.junit.Assert.assertNotNull(dimension29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNotNull(cursor40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jComboBox43);
        org.junit.Assert.assertNotNull(jTextField44);
        org.junit.Assert.assertNull(bufferStrategy48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 112 + "'", int49 == 112);
        org.junit.Assert.assertNotNull(hierarchyListenerArray50);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        java.awt.ImageCapabilities imageCapabilities4 = null;
        java.awt.image.VolatileImage volatileImage5 = home0.createVolatileImage(10, (int) '4', imageCapabilities4);
        java.awt.Container container6 = home0.getParent();
        javax.swing.JButton jButton7 = null;
        home0.updateJob = jButton7;
        java.awt.Event event9 = null;
        java.lang.Object obj10 = null;
        boolean boolean11 = home0.lostFocus(event9, obj10);
        home0.setAlwaysOnTop(false);
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        home14.setResizable(false);
        boolean boolean18 = home14.isActive();
        UserProfile userProfile19 = null;
        home14.userProfile = userProfile19;
        Home home21 = new Home();
        java.awt.image.BufferStrategy bufferStrategy22 = home21.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener23 = null;
        home21.addHierarchyBoundsListener(hierarchyBoundsListener23);
        boolean boolean25 = home21.isResizable();
        java.awt.Dimension dimension26 = null;
        home21.setMinimumSize(dimension26);
        Home home28 = new Home();
        java.awt.Cursor cursor29 = home28.getCursor();
        home28.removeNotify();
        javax.swing.JLabel jLabel31 = home28.taskTypeLabel;
        boolean boolean32 = home28.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser33 = home28.enDate;
        home21.stDate = jDateChooser33;
        javax.swing.JTextArea jTextArea35 = home21.taskDescField;
        home14.setLocationRelativeTo((java.awt.Component) jTextArea35);
        home0.taskDescField = jTextArea35;
        org.junit.Assert.assertNotNull(cursor1);
        org.junit.Assert.assertNull(volatileImage5);
        org.junit.Assert.assertNull(container6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(bufferStrategy22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cursor29);
        org.junit.Assert.assertNotNull(jLabel31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jDateChooser33);
        org.junit.Assert.assertNotNull(jTextArea35);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        javax.swing.JButton jButton2 = null;
        home0.deleteJob = jButton2;
        home0.updateJob();
        javax.swing.JLabel jLabel5 = home0.taskStartLabel;
        java.awt.Graphics graphics6 = null;
        home0.paint(graphics6);
        boolean boolean8 = home0.isFocusCycleRoot();
        java.util.Locale locale9 = null;
        home0.setLocale(locale9);
        Home home11 = new Home();
        java.awt.Cursor cursor12 = home11.getCursor();
        home11.removeNotify();
        javax.swing.JLayeredPane jLayeredPane14 = home11.getLayeredPane();
        home0.setLayeredPane(jLayeredPane14);
        boolean boolean16 = home0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cursor12);
        org.junit.Assert.assertNotNull(jLayeredPane14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.event.MouseListener mouseListener2 = null;
        home0.addMouseListener(mouseListener2);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener4 = null;
        home0.removeHierarchyBoundsListener(hierarchyBoundsListener4);
        home0.dispose();
        javax.swing.JTable jTable7 = home0.table;
        java.awt.Graphics graphics8 = null;
        jTable7.printAll(graphics8);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(jTable7);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        Home home7 = new Home();
        java.awt.Cursor cursor8 = home7.getCursor();
        home7.removeNotify();
        javax.swing.JLabel jLabel10 = home7.taskTypeLabel;
        boolean boolean11 = home7.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser12 = home7.enDate;
        home0.stDate = jDateChooser12;
        Home home14 = new Home();
        java.awt.image.BufferStrategy bufferStrategy15 = home14.getBufferStrategy();
        int int16 = home14.getY();
        java.awt.image.BufferStrategy bufferStrategy17 = home14.getBufferStrategy();
        java.awt.Toolkit toolkit18 = home14.getToolkit();
        Home home19 = new Home();
        Home home20 = new Home();
        boolean boolean21 = home20.isMaximumSizeSet();
        Home home22 = new Home();
        boolean boolean23 = home22.isMaximumSizeSet();
        int int24 = home20.getComponentZOrder((java.awt.Component) home22);
        java.awt.FocusTraversalPolicy focusTraversalPolicy25 = null;
        home20.setFocusTraversalPolicy(focusTraversalPolicy25);
        boolean boolean27 = home19.isAncestorOf((java.awt.Component) home20);
        home20.clearAllInput();
        Home home29 = new Home();
        java.awt.image.BufferStrategy bufferStrategy30 = home29.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener31 = null;
        home29.addHierarchyBoundsListener(hierarchyBoundsListener31);
        boolean boolean33 = home29.isResizable();
        home29.removeAll();
        boolean boolean35 = home29.isLightweight();
        Home home36 = new Home();
        boolean boolean37 = home36.isMaximumSizeSet();
        home36.setResizable(false);
        boolean boolean40 = home36.isActive();
        UserProfile userProfile41 = null;
        home36.userProfile = userProfile41;
        com.toedter.calendar.JDateChooser jDateChooser43 = home36.enDate;
        java.awt.image.ImageProducer imageProducer44 = null;
        java.awt.Image image45 = home36.createImage(imageProducer44);
        home29.setIconImage(image45);
        Home home47 = new Home();
        java.awt.image.BufferStrategy bufferStrategy48 = home47.getBufferStrategy();
        int int49 = home47.getY();
        java.awt.image.BufferStrategy bufferStrategy50 = home47.getBufferStrategy();
        java.awt.event.MouseWheelListener mouseWheelListener51 = null;
        home47.addMouseWheelListener(mouseWheelListener51);
        int int53 = home47.getComponentCount();
        int int54 = home20.checkImage(image45, (java.awt.image.ImageObserver) home47);
        Home home57 = new Home();
        java.awt.image.BufferStrategy bufferStrategy58 = home57.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener59 = null;
        home57.addHierarchyBoundsListener(hierarchyBoundsListener59);
        boolean boolean61 = home57.isResizable();
        java.awt.Dimension dimension62 = null;
        home57.setMinimumSize(dimension62);
        int int64 = home14.checkImage(image45, 12, 0, (java.awt.image.ImageObserver) home57);
        Home home65 = new Home();
        java.awt.Cursor cursor66 = home65.getCursor();
        home65.removeNotify();
        java.awt.event.WindowFocusListener windowFocusListener68 = null;
        home65.addWindowFocusListener(windowFocusListener68);
        Home home70 = new Home();
        java.awt.Cursor cursor71 = home70.getCursor();
        home70.removeNotify();
        javax.swing.JLabel jLabel73 = home70.taskTypeLabel;
        boolean boolean74 = jLabel73.isEnabled();
        home65.taskNameLabel = jLabel73;
        java.awt.Component component76 = home14.add((java.awt.Component) jLabel73);
        home0.taskEndLabel = jLabel73;
        java.beans.PropertyChangeListener[] propertyChangeListenerArray78 = home0.getPropertyChangeListeners();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cursor8);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jDateChooser12);
        org.junit.Assert.assertNull(bufferStrategy15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 112 + "'", int16 == 112);
        org.junit.Assert.assertNull(bufferStrategy17);
        org.junit.Assert.assertNotNull(toolkit18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(bufferStrategy30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jDateChooser43);
        org.junit.Assert.assertNotNull(image45);
        org.junit.Assert.assertNull(bufferStrategy48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 112 + "'", int49 == 112);
        org.junit.Assert.assertNull(bufferStrategy50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(bufferStrategy58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 32 + "'", int64 == 32);
        org.junit.Assert.assertNotNull(cursor66);
        org.junit.Assert.assertNotNull(cursor71);
        org.junit.Assert.assertNotNull(jLabel73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(component76);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray78);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        Home home0 = new Home();
        java.awt.Cursor cursor1 = home0.getCursor();
        home0.removeNotify();
        home0.firePropertyChange("hi!", (float) (byte) 1, (float) (byte) 1);
        java.awt.MenuComponent menuComponent7 = null;
        home0.remove(menuComponent7);
        org.junit.Assert.assertNotNull(cursor1);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        boolean boolean10 = home0.isOpaque();
        java.awt.Dimension dimension11 = home0.minimumSize();
        java.awt.event.WindowFocusListener windowFocusListener12 = null;
        home0.removeWindowFocusListener(windowFocusListener12);
        java.awt.Graphics graphics14 = null;
        home0.update(graphics14);
        home0.setUndecorated(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        java.awt.Component[] componentArray9 = home6.getComponents();
        java.awt.Container container10 = home6.getContentPane();
        java.awt.dnd.DropTarget dropTarget11 = container10.getDropTarget();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNotNull(componentArray9);
        org.junit.Assert.assertNotNull(container10);
        org.junit.Assert.assertNull(dropTarget11);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        home0.setResizable(false);
        boolean boolean4 = home0.isActive();
        UserProfile userProfile5 = null;
        home0.userProfile = userProfile5;
        com.toedter.calendar.JDateChooser jDateChooser7 = home0.enDate;
        Home home8 = new Home();
        boolean boolean9 = home8.isMaximumSizeSet();
        home8.setResizable(false);
        home8.invalidate();
        Home home13 = new Home();
        Home home14 = new Home();
        boolean boolean15 = home14.isMaximumSizeSet();
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        int int18 = home14.getComponentZOrder((java.awt.Component) home16);
        java.awt.FocusTraversalPolicy focusTraversalPolicy19 = null;
        home14.setFocusTraversalPolicy(focusTraversalPolicy19);
        boolean boolean21 = home13.isAncestorOf((java.awt.Component) home14);
        java.awt.Window[] windowArray22 = home13.getOwnedWindows();
        java.awt.event.WindowStateListener[] windowStateListenerArray23 = home13.getWindowStateListeners();
        Home home24 = new Home();
        java.awt.Cursor cursor25 = home24.getCursor();
        home24.removeNotify();
        javax.swing.JLabel jLabel27 = home24.taskTypeLabel;
        boolean boolean28 = home24.isDisplayable();
        java.awt.ComponentOrientation componentOrientation29 = home24.getComponentOrientation();
        home13.setComponentOrientation(componentOrientation29);
        java.awt.Rectangle rectangle31 = home13.getBounds();
        java.awt.Rectangle rectangle32 = home8.getBounds(rectangle31);
        home0.setMixingCutoutShape((java.awt.Shape) rectangle32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jDateChooser7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(windowArray22);
        org.junit.Assert.assertNotNull(windowStateListenerArray23);
        org.junit.Assert.assertNotNull(cursor25);
        org.junit.Assert.assertNotNull(jLabel27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(componentOrientation29);
        org.junit.Assert.assertNotNull(rectangle31);
        org.junit.Assert.assertNotNull(rectangle32);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.LayoutManager layoutManager2 = null;
        home0.setLayout(layoutManager2);
        java.awt.event.WindowListener[] windowListenerArray4 = home0.getWindowListeners();
        boolean boolean5 = home0.isAlwaysOnTopSupported();
        home0.setFocusCycleRoot(false);
        home0.show(false);
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertNotNull(windowListenerArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = home0.getPropertyChangeListeners();
        java.awt.image.VolatileImage volatileImage9 = home0.createVolatileImage(0, (int) (short) 1);
        java.awt.Window[] windowArray10 = home0.getOwnedWindows();
        javax.swing.JComboBox jComboBox11 = home0.statusDropdown;
        java.awt.event.ContainerListener[] containerListenerArray12 = jComboBox11.getContainerListeners();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertNotNull(windowArray10);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(containerListenerArray12);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener2 = null;
        home0.addHierarchyBoundsListener(hierarchyBoundsListener2);
        boolean boolean4 = home0.isResizable();
        java.awt.Dimension dimension5 = null;
        home0.setMinimumSize(dimension5);
        javax.swing.JTable jTable7 = home0.table;
        home0.addJob();
        java.awt.Component component9 = home0.getGlassPane();
        Home home10 = new Home();
        java.awt.Cursor cursor11 = home10.getCursor();
        home10.removeNotify();
        javax.swing.JLabel jLabel13 = home10.taskTypeLabel;
        boolean boolean14 = home10.isDisplayable();
        com.toedter.calendar.JDateChooser jDateChooser15 = home10.enDate;
        Home home16 = new Home();
        boolean boolean17 = home16.isMaximumSizeSet();
        java.awt.Event event18 = null;
        boolean boolean21 = home16.mouseUp(event18, 0, (int) ' ');
        Home home23 = new Home();
        boolean boolean24 = home23.isMaximumSizeSet();
        home23.setResizable(false);
        Home home27 = new Home();
        java.awt.Cursor cursor28 = home27.getCursor();
        home27.removeNotify();
        javax.swing.JLabel jLabel30 = home27.taskTypeLabel;
        jLabel30.invalidate();
        home23.priority = jLabel30;
        java.awt.Component component33 = home16.add("", (java.awt.Component) jLabel30);
        home10.lblScheduledBy = jLabel30;
        java.awt.image.ImageProducer imageProducer35 = null;
        java.awt.Image image36 = home10.createImage(imageProducer35);
        home0.setIconImage(image36);
        java.awt.Insets insets38 = home0.getInsets();
        java.awt.Component component39 = home0.getGlassPane();
        org.junit.Assert.assertNull(bufferStrategy1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(component9);
        org.junit.Assert.assertNotNull(cursor11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jDateChooser15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cursor28);
        org.junit.Assert.assertNotNull(jLabel30);
        org.junit.Assert.assertNotNull(component33);
        org.junit.Assert.assertNotNull(image36);
        org.junit.Assert.assertNotNull(insets38);
        org.junit.Assert.assertNotNull(component39);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        java.awt.event.MouseListener[] mouseListenerArray6 = home0.getMouseListeners();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray7 = home0.getMouseMotionListeners();
        javax.swing.JPanel jPanel8 = home0.panel;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(mouseListenerArray6);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray7);
        org.junit.Assert.assertNotNull(jPanel8);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        int int0 = java.awt.image.ImageObserver.ERROR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        java.awt.Event event2 = null;
        boolean boolean5 = home0.mouseUp(event2, 0, (int) ' ');
        Home home6 = new Home();
        java.awt.image.BufferStrategy bufferStrategy7 = home6.getBufferStrategy();
        home0.setLocationRelativeTo((java.awt.Component) home6);
        float float9 = home6.getAlignmentX();
        java.awt.event.MouseWheelListener mouseWheelListener10 = null;
        home6.addMouseWheelListener(mouseWheelListener10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.5f + "'", float9 == 0.5f);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        Home home0 = new Home();
        boolean boolean1 = home0.isMaximumSizeSet();
        Home home2 = new Home();
        boolean boolean3 = home2.isMaximumSizeSet();
        int int4 = home0.getComponentZOrder((java.awt.Component) home2);
        javax.swing.JRootPane jRootPane5 = home0.getRootPane();
        javax.swing.TransferHandler transferHandler6 = null;
        home0.setTransferHandler(transferHandler6);
        Home home8 = new Home();
        java.awt.Cursor cursor9 = home8.getCursor();
        home8.removeNotify();
        boolean boolean11 = home8.getIgnoreRepaint();
        javax.swing.JComboBox jComboBox12 = home8.priorityDropdown;
        javax.swing.JTextField jTextField13 = home8.taskTypeField;
        home0.taskNameField = jTextField13;
        java.awt.Component component17 = home0.getComponentAt(0, 64);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(jRootPane5);
        org.junit.Assert.assertNotNull(cursor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jComboBox12);
        org.junit.Assert.assertNotNull(jTextField13);
        org.junit.Assert.assertNotNull(component17);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        Home home0 = new Home();
        java.awt.image.BufferStrategy bufferStrategy1 = home0.getBufferStrategy();
        int int2 = home0.getY();
        java.awt.image.BufferStrategy bufferStrategy3 = home0.getBufferStrategy();
        home0.setFocusableWindowState(false);
        javax.swing.table.DefaultTableModel defaultTableModel6 = home0.tableModel;
        org.junit.Assert.assertNull(bufferStrategy1);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 112 + "'", int2 == 112);
        org.junit.Assert.assertNull(bufferStrategy3);
        org.junit.Assert.assertNotNull(defaultTableModel6);
    }
}

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        SignIn signIn19 = new SignIn();
        int int20 = signIn19.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray22 = signIn19.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField23 = signIn19.textPassword;
        signUp0.textUsername = jPasswordField23;
        SignIn signIn25 = null;
        signUp0.signIn = signIn25;
        javax.swing.JPasswordField jPasswordField27 = signUp0.textPassword;
        jPasswordField27.firePropertyChange("", (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray22);
        org.junit.Assert.assertNotNull(jPasswordField23);
        org.junit.Assert.assertNotNull(jPasswordField27);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = signIn0.getGraphicsConfiguration();
        java.awt.Font font3 = signIn0.getFont();
        javax.swing.JTextField jTextField4 = signIn0.textUsername;
        java.awt.Graphics graphics5 = null;
        // The following exception was thrown during execution in test generation
        try {
            jTextField4.printAll(graphics5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"componentGraphics\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration2);
        org.junit.Assert.assertNull(font3);
        org.junit.Assert.assertNotNull(jTextField4);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        java.awt.event.ActionEvent actionEvent3 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        javax.swing.TransferHandler transferHandler21 = signUp0.getTransferHandler();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = signUp0.getPropertyChangeListeners("Home[frame10,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.image.ImageProducer imageProducer3 = null;
        java.awt.Image image4 = signIn0.createImage(imageProducer3);
        java.awt.event.MouseListener mouseListener5 = null;
        signIn0.removeMouseListener(mouseListener5);
        java.awt.event.WindowStateListener[] windowStateListenerArray7 = signIn0.getWindowStateListeners();
        Home home8 = new Home();
        javax.swing.JScrollPane jScrollPane9 = null;
        home8.scrollPane = jScrollPane9;
        javax.swing.JPanel jPanel11 = home8.panel;
        SignIn signIn12 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        signIn12.removeInputMethodListener(inputMethodListener13);
        boolean boolean15 = signIn12.isDisplayable();
        java.awt.LayoutManager layoutManager16 = signIn12.getLayout();
        signIn12.setIgnoreRepaint(true);
        java.awt.Component component19 = signIn12.getGlassPane();
        int int20 = jPanel11.getComponentZOrder((java.awt.Component) signIn12);
        java.awt.Font font21 = jPanel11.getFont();
        signIn0.setFont(font21);
        signIn0.addNotify();
        signIn0.pack();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNotNull(image4);
        org.junit.Assert.assertNotNull(windowStateListenerArray7);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(layoutManager16);
        org.junit.Assert.assertNotNull(component19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(font21);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        boolean boolean19 = jTextField18.requestFocusInWindow();
        jTextField18.enableInputMethods(true);
        java.awt.event.HierarchyListener[] hierarchyListenerArray22 = jTextField18.getHierarchyListeners();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(hierarchyListenerArray22);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Dimension dimension6 = signIn0.preferredSize();
        boolean boolean7 = signIn0.getFocusableWindowState();
        DataAccess dataAccess8 = signIn0.api;
        SignUp signUp9 = new SignUp();
        SignIn signIn10 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        signIn10.removeInputMethodListener(inputMethodListener11);
        boolean boolean13 = signIn10.isDisplayable();
        java.awt.LayoutManager layoutManager14 = signIn10.getLayout();
        signIn10.setIgnoreRepaint(true);
        SignIn signIn17 = new SignIn();
        java.awt.Event event18 = null;
        boolean boolean21 = signIn17.mouseDrag(event18, 10, (int) (byte) -1);
        boolean boolean22 = signIn17.isForegroundSet();
        java.awt.Window window23 = signIn17.getOwner();
        boolean boolean24 = signIn10.isFocusCycleRoot((java.awt.Container) signIn17);
        boolean boolean25 = signIn17.isPreferredSizeSet();
        signUp9.signIn = signIn17;
        javax.swing.JTextField jTextField27 = signUp9.textUsername;
        SignIn signIn28 = new SignIn();
        int int29 = signIn28.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = signIn28.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField32 = signIn28.textPassword;
        signUp9.textUsername = jPasswordField32;
        SignIn signIn34 = null;
        signUp9.signIn = signIn34;
        java.awt.Shape shape36 = signUp9.getShape();
        int int37 = signIn0.getComponentZOrder((java.awt.Component) signUp9);
        SignUp signUp38 = new SignUp();
        javax.swing.JButton jButton39 = signUp38.buttonSignup;
        java.awt.Dimension dimension40 = jButton39.getMaximumSize();
        signIn0.buttonLogin = jButton39;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dimension6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(dataAccess8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(layoutManager14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(window23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jTextField27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray31);
        org.junit.Assert.assertNotNull(jPasswordField32);
        org.junit.Assert.assertNull(shape36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(jButton39);
        org.junit.Assert.assertNotNull(dimension40);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        signIn0.setSize(100, (int) (short) 100);
        signIn0.show();
        java.awt.ComponentOrientation componentOrientation9 = signIn0.getComponentOrientation();
        boolean boolean10 = signIn0.requestFocusInWindow();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertNotNull(componentOrientation9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JScrollPane jScrollPane5 = null;
        home4.scrollPane = jScrollPane5;
        javax.swing.table.DefaultTableModel defaultTableModel7 = home4.tableModel;
        home0.tableModel = defaultTableModel7;
        Home home9 = new Home();
        javax.swing.JLabel jLabel10 = home9.taskDescLabel;
        home9.rsp = "hi!";
        javax.swing.JComboBox jComboBox13 = home9.statusDropdown;
        Home home14 = new Home();
        javax.swing.JLabel jLabel15 = home14.taskDescLabel;
        home9.taskStartLabel = jLabel15;
        home0.lblScheduledBy = jLabel15;
        javax.swing.JLabel jLabel18 = home0.taskTypeLabel;
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNotNull(defaultTableModel7);
        org.junit.Assert.assertNotNull(jLabel10);
        org.junit.Assert.assertNotNull(jComboBox13);
        org.junit.Assert.assertNotNull(jLabel15);
        org.junit.Assert.assertNotNull(jLabel18);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        UserProfile userProfile0 = new UserProfile();
        java.lang.String str1 = userProfile0.rsp;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "No Complete" + "'", str1, "No Complete");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        SignIn signIn0 = new SignIn();
        float float1 = signIn0.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = signIn0.getPropertyChangeListeners();
        SignIn signIn3 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        signIn3.removeInputMethodListener(inputMethodListener4);
        boolean boolean6 = signIn3.isDisplayable();
        java.awt.LayoutManager layoutManager7 = signIn3.getLayout();
        signIn3.setIgnoreRepaint(true);
        SignIn signIn10 = new SignIn();
        java.awt.Event event11 = null;
        boolean boolean14 = signIn10.mouseDrag(event11, 10, (int) (byte) -1);
        boolean boolean15 = signIn10.isForegroundSet();
        java.awt.Window window16 = signIn10.getOwner();
        boolean boolean17 = signIn3.isFocusCycleRoot((java.awt.Container) signIn10);
        signIn3.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType20 = signIn3.getModalExclusionType();
        signIn0.setModalExclusionType(modalExclusionType20);
        signIn0.addNotify();
        java.awt.dnd.DropTarget dropTarget23 = null;
        signIn0.setDropTarget(dropTarget23);
        signIn0.setEnabled(true);
        javax.swing.JRootPane jRootPane27 = signIn0.getRootPane();
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(window16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(jRootPane27);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        javax.swing.TransferHandler transferHandler21 = signUp0.getTransferHandler();
        Home home22 = new Home();
        javax.swing.JLabel jLabel23 = home22.taskDescLabel;
        home22.rsp = "hi!";
        javax.swing.JComboBox jComboBox26 = home22.statusDropdown;
        Home home27 = new Home();
        javax.swing.JLabel jLabel28 = home27.taskDescLabel;
        home22.taskStartLabel = jLabel28;
        javax.swing.JLabel jLabel30 = home22.taskStartLabel;
        signUp0.setContentPane((java.awt.Container) jLabel30);
        java.awt.event.InputMethodListener inputMethodListener32 = null;
        signUp0.removeInputMethodListener(inputMethodListener32);
        java.awt.event.ActionEvent actionEvent34 = null;
        // The following exception was thrown during execution in test generation
        try {
            signUp0.actionPerformed(actionEvent34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertNotNull(jLabel23);
        org.junit.Assert.assertNotNull(jComboBox26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jLabel30);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        signIn0.show();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray16 = signIn0.getMouseMotionListeners();
        SignUp signUp17 = new SignUp();
        javax.swing.JButton jButton18 = signUp17.buttonSignup;
        javax.swing.JButton jButton19 = signUp17.buttonCancel;
        java.awt.FocusTraversalPolicy focusTraversalPolicy20 = signUp17.getFocusTraversalPolicy();
        boolean boolean21 = signUp17.isFocused();
        javax.swing.JTextField jTextField22 = signUp17.profileNameTextField;
        SignIn signIn23 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        signIn23.removeInputMethodListener(inputMethodListener24);
        boolean boolean26 = signIn23.isDisplayable();
        java.awt.Container container27 = signIn23.getParent();
        SignIn signIn28 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        signIn28.removeInputMethodListener(inputMethodListener29);
        boolean boolean31 = signIn28.isDisplayable();
        java.awt.Event event32 = null;
        boolean boolean34 = signIn28.keyDown(event32, (int) '4');
        java.awt.Color color35 = signIn28.getBackground();
        signIn23.setBackground(color35);
        java.awt.dnd.DropTarget dropTarget37 = null;
        signIn23.setDropTarget(dropTarget37);
        Home home39 = new Home();
        javax.swing.JLabel jLabel40 = null;
        home39.taskEndLabel = jLabel40;
        Home home42 = new Home();
        javax.swing.JLabel jLabel43 = home42.taskStartLabel;
        home39.taskTypeLabel = jLabel43;
        java.awt.Point point45 = home39.getLocation();
        java.awt.Component component46 = signIn23.findComponentAt(point45);
        java.awt.Cursor cursor47 = signIn23.getCursor();
        signUp17.setCursor(cursor47);
        signIn0.setCursor(cursor47);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray16);
        org.junit.Assert.assertNotNull(jButton18);
        org.junit.Assert.assertNotNull(jButton19);
        org.junit.Assert.assertNotNull(focusTraversalPolicy20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(container27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(color35);
        org.junit.Assert.assertNotNull(jLabel43);
        org.junit.Assert.assertNotNull(point45);
        org.junit.Assert.assertNull(component46);
        org.junit.Assert.assertNotNull(cursor47);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        boolean boolean2 = jPasswordField1.getIgnoreRepaint();
        jPasswordField1.enableInputMethods(true);
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        java.awt.Insets insets18 = signIn8.getInsets();
        SignIn signIn19 = new SignIn();
        java.awt.event.ComponentListener componentListener20 = null;
        signIn19.removeComponentListener(componentListener20);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener22 = null;
        signIn19.removeHierarchyBoundsListener(hierarchyBoundsListener22);
        Home home24 = new Home();
        javax.swing.JScrollPane jScrollPane25 = null;
        home24.scrollPane = jScrollPane25;
        javax.swing.JPanel jPanel27 = home24.panel;
        boolean boolean28 = home24.isOpaque();
        home24.clearAllInput();
        java.awt.dnd.DropTarget dropTarget30 = null;
        home24.setDropTarget(dropTarget30);
        java.awt.Rectangle rectangle32 = home24.getBounds();
        signIn19.setMixingCutoutShape((java.awt.Shape) rectangle32);
        signIn8.setMixingCutoutShape((java.awt.Shape) rectangle32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(rectangle32);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = signIn0.getGraphicsConfiguration();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn0.addInputMethodListener(inputMethodListener3);
        signIn0.pack();
        signIn0.enable();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration2);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        javax.swing.JRootPane jRootPane6 = signIn0.getRootPane();
        java.awt.event.HierarchyListener hierarchyListener7 = null;
        signIn0.removeHierarchyListener(hierarchyListener7);
        boolean boolean9 = signIn0.isFocused();
        boolean boolean10 = signIn0.isCursorSet();
        java.lang.Object obj11 = signIn0.getTreeLock();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        SignIn signIn16 = new SignIn();
        int int17 = signIn16.getState();
        java.util.List<java.awt.Image> imageList18 = signIn16.getIconImages();
        java.awt.image.ImageProducer imageProducer19 = null;
        java.awt.Image image20 = signIn16.createImage(imageProducer19);
        boolean boolean26 = signIn8.imageUpdate(image20, 9, 0, 212, 3, (int) (short) 0);
        userProfile0.setIconImage(image20);
        SignUp signUp28 = new SignUp();
        SignIn signIn29 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener30 = null;
        signIn29.removeInputMethodListener(inputMethodListener30);
        boolean boolean32 = signIn29.isDisplayable();
        java.awt.LayoutManager layoutManager33 = signIn29.getLayout();
        signIn29.setIgnoreRepaint(true);
        SignIn signIn36 = new SignIn();
        java.awt.Event event37 = null;
        boolean boolean40 = signIn36.mouseDrag(event37, 10, (int) (byte) -1);
        boolean boolean41 = signIn36.isForegroundSet();
        java.awt.Window window42 = signIn36.getOwner();
        boolean boolean43 = signIn29.isFocusCycleRoot((java.awt.Container) signIn36);
        boolean boolean44 = signIn36.isPreferredSizeSet();
        signUp28.signIn = signIn36;
        javax.swing.JTextField jTextField46 = signUp28.textUsername;
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener47 = null;
        jTextField46.addHierarchyBoundsListener(hierarchyBoundsListener47);
        userProfile0.emailTextField = jTextField46;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(imageList18);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(layoutManager33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(window42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jTextField46);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        signIn0.setSize(100, (int) (short) 100);
        signIn0.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.image.ImageProducer imageProducer3 = null;
        java.awt.Image image4 = signIn0.createImage(imageProducer3);
        java.awt.Font font5 = null;
        signIn0.setFont(font5);
        java.awt.Component component7 = signIn0.getMostRecentFocusOwner();
        java.awt.event.MouseListener[] mouseListenerArray8 = component7.getMouseListeners();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNotNull(image4);
        org.junit.Assert.assertNotNull(component7);
        org.junit.Assert.assertNotNull(mouseListenerArray8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        Home home0 = new Home();
        javax.swing.JTable jTable1 = home0.table;
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        signIn2.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = signIn2.getModalExclusionType();
        home0.setModalExclusionType(modalExclusionType19);
        Home home21 = new Home();
        javax.swing.JScrollPane jScrollPane22 = null;
        home21.scrollPane = jScrollPane22;
        javax.swing.JPanel jPanel24 = home21.panel;
        boolean boolean25 = home21.isOpaque();
        javax.swing.JTextField jTextField26 = home21.taskStartField;
        SignIn signIn27 = new SignIn();
        int int28 = signIn27.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = signIn27.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField31 = signIn27.textUsername;
        home21.taskStartField = jTextField31;
        Home home33 = new Home();
        javax.swing.JLabel jLabel34 = home33.taskDescLabel;
        home33.rsp = "hi!";
        javax.swing.JComboBox jComboBox37 = home33.statusDropdown;
        Home home38 = new Home();
        javax.swing.JLabel jLabel39 = home38.taskDescLabel;
        home33.taskStartLabel = jLabel39;
        home21.taskTypeLabel = jLabel39;
        home0.taskEndLabel = jLabel39;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = null;
        home43.taskEndLabel = jLabel44;
        home43.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JLabel jLabel48 = home43.taskTypeLabel;
        home0.taskDescLabel = jLabel48;
        javax.swing.JPanel jPanel50 = home0.panel;
        SignUp signUp51 = new SignUp();
        SignUp signUp52 = new SignUp();
        SignIn signIn53 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener54 = null;
        signIn53.removeInputMethodListener(inputMethodListener54);
        boolean boolean56 = signIn53.isDisplayable();
        java.awt.LayoutManager layoutManager57 = signIn53.getLayout();
        signIn53.setIgnoreRepaint(true);
        SignIn signIn60 = new SignIn();
        java.awt.Event event61 = null;
        boolean boolean64 = signIn60.mouseDrag(event61, 10, (int) (byte) -1);
        boolean boolean65 = signIn60.isForegroundSet();
        java.awt.Window window66 = signIn60.getOwner();
        boolean boolean67 = signIn53.isFocusCycleRoot((java.awt.Container) signIn60);
        boolean boolean68 = signIn60.isPreferredSizeSet();
        signUp52.signIn = signIn60;
        javax.swing.JTextField jTextField70 = signUp52.textUsername;
        signUp51.profileNameTextField = jTextField70;
        java.lang.Object obj72 = null;
        // The following exception was thrown during execution in test generation
        try {
            jPanel50.add((java.awt.Component) signUp51, obj72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTable1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType19 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType19.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertNotNull(jTextField31);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(jComboBox37);
        org.junit.Assert.assertNotNull(jLabel39);
        org.junit.Assert.assertNotNull(jLabel48);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(layoutManager57);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(window66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jTextField70);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        javax.swing.JPanel jPanel5 = home0.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home0.stDate;
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        SignIn signIn19 = new SignIn();
        int int20 = signIn19.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray22 = signIn19.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField23 = signIn19.textPassword;
        signUp0.textUsername = jPasswordField23;
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.Container container29 = signIn25.getParent();
        signIn25.setSize(100, (int) (short) 100);
        signIn25.show();
        javax.swing.JLayeredPane jLayeredPane34 = signIn25.getLayeredPane();
        signUp0.setLayeredPane(jLayeredPane34);
        signUp0.setVisible(false);
        javax.swing.JPasswordField jPasswordField38 = signUp0.textPassword;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray22);
        org.junit.Assert.assertNotNull(jPasswordField23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(container29);
        org.junit.Assert.assertNotNull(jLayeredPane34);
        org.junit.Assert.assertNotNull(jPasswordField38);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JTextField jTextField5 = home4.taskStartField;
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        home4.enDate = jDateChooser10;
        home4.revalidate();
        home4.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str17 = home4.user_id;
        javax.swing.JScrollPane jScrollPane18 = home4.scrollPane;
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        jScrollPane18.addMouseMotionListener(mouseMotionListener19);
        home0.scrollPane = jScrollPane18;
        Home home22 = new Home();
        javax.swing.JScrollPane jScrollPane23 = null;
        home22.scrollPane = jScrollPane23;
        javax.swing.JPanel jPanel25 = home22.panel;
        javax.swing.JTextField jTextField26 = home22.taskStartField;
        Home home27 = new Home();
        javax.swing.JLabel jLabel28 = home27.taskDescLabel;
        home27.rsp = "hi!";
        javax.swing.JComboBox jComboBox31 = home27.statusDropdown;
        Home home32 = new Home();
        javax.swing.JLabel jLabel33 = home32.taskDescLabel;
        home27.taskStartLabel = jLabel33;
        home22.lblScheduledBy = jLabel33;
        home0.taskNameLabel = jLabel33;
        java.awt.event.ComponentListener componentListener37 = null;
        jLabel33.addComponentListener(componentListener37);
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User Signup" + "'", str17, "User Signup");
        org.junit.Assert.assertNotNull(jScrollPane18);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jComboBox31);
        org.junit.Assert.assertNotNull(jLabel33);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JButton jButton3 = home0.updateJob;
        java.awt.im.InputMethodRequests inputMethodRequests4 = home0.getInputMethodRequests();
        SignUp signUp5 = new SignUp();
        javax.swing.JPasswordField jPasswordField6 = signUp5.textPassword;
        boolean boolean7 = jPasswordField6.getIgnoreRepaint();
        home0.taskNameField = jPasswordField6;
        java.awt.Event event9 = null;
        SignUp signUp10 = new SignUp();
        SignIn signIn11 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        signIn11.removeInputMethodListener(inputMethodListener12);
        boolean boolean14 = signIn11.isDisplayable();
        java.awt.LayoutManager layoutManager15 = signIn11.getLayout();
        signIn11.setIgnoreRepaint(true);
        SignIn signIn18 = new SignIn();
        java.awt.Event event19 = null;
        boolean boolean22 = signIn18.mouseDrag(event19, 10, (int) (byte) -1);
        boolean boolean23 = signIn18.isForegroundSet();
        java.awt.Window window24 = signIn18.getOwner();
        boolean boolean25 = signIn11.isFocusCycleRoot((java.awt.Container) signIn18);
        boolean boolean26 = signIn18.isPreferredSizeSet();
        signUp10.signIn = signIn18;
        javax.swing.JTextField jTextField28 = signUp10.textUsername;
        signUp10.setTitle("User Signup");
        javax.swing.JButton jButton31 = signUp10.buttonCancel;
        java.awt.Event event32 = null;
        SignIn signIn33 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener34 = null;
        signIn33.removeInputMethodListener(inputMethodListener34);
        boolean boolean36 = signIn33.isDisplayable();
        java.awt.event.FocusEvent.Cause cause37 = null;
        boolean boolean38 = signIn33.requestFocusInWindow(cause37);
        javax.swing.JRootPane jRootPane39 = signIn33.getRootPane();
        java.awt.event.HierarchyListener hierarchyListener40 = null;
        signIn33.removeHierarchyListener(hierarchyListener40);
        boolean boolean42 = signIn33.isFocused();
        boolean boolean43 = signUp10.lostFocus(event32, (java.lang.Object) signIn33);
        boolean boolean44 = jPasswordField6.action(event9, (java.lang.Object) event32);
        boolean boolean45 = jPasswordField6.isFocusTraversalPolicySet();
        jPasswordField6.firePropertyChange("Home[frame3,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double) 13, (double) 6);
        org.junit.Assert.assertNotNull(jButton3);
        org.junit.Assert.assertNull(inputMethodRequests4);
        org.junit.Assert.assertNotNull(jPasswordField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(layoutManager15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(window24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jTextField28);
        org.junit.Assert.assertNotNull(jButton31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jRootPane39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.FocusListener focusListener13 = null;
        signIn0.addFocusListener(focusListener13);
        java.util.List<java.awt.Image> imageList15 = signIn0.getIconImages();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(imageList15);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        boolean boolean15 = signIn7.isPreferredSizeSet();
        java.awt.Color color16 = signIn7.getForeground();
        java.awt.Component component19 = signIn7.findComponentAt((int) (byte) -1, (int) 'a');
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JPanel jPanel23 = home20.panel;
        javax.swing.JTextField jTextField24 = home20.taskStartField;
        Home home25 = new Home();
        javax.swing.JLabel jLabel26 = home25.taskDescLabel;
        home25.rsp = "hi!";
        javax.swing.JComboBox jComboBox29 = home25.statusDropdown;
        Home home30 = new Home();
        javax.swing.JLabel jLabel31 = home30.taskDescLabel;
        home25.taskStartLabel = jLabel31;
        home20.lblScheduledBy = jLabel31;
        Home home34 = new Home();
        javax.swing.JScrollPane jScrollPane35 = null;
        home34.scrollPane = jScrollPane35;
        javax.swing.table.DefaultTableModel defaultTableModel37 = home34.tableModel;
        home20.tableModel = defaultTableModel37;
        signIn7.home = home20;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(color16);
        org.junit.Assert.assertNull(component19);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertNull(jTextField24);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertNotNull(jComboBox29);
        org.junit.Assert.assertNotNull(jLabel31);
        org.junit.Assert.assertNotNull(defaultTableModel37);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JScrollPane jScrollPane5 = null;
        home4.scrollPane = jScrollPane5;
        javax.swing.table.DefaultTableModel defaultTableModel7 = home4.tableModel;
        home0.tableModel = defaultTableModel7;
        java.awt.Dimension dimension9 = home0.getMaximumSize();
        boolean boolean10 = home0.isVisible();
        javax.swing.JLabel jLabel11 = home0.taskStartLabel;
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNotNull(defaultTableModel7);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jLabel11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        Home home3 = new Home();
        javax.swing.JLabel jLabel4 = home3.taskStartLabel;
        home0.taskTypeLabel = jLabel4;
        home0.deleteJob();
        home0.sel_task_id = 1;
        java.awt.Rectangle rectangle9 = home0.getMaximizedBounds();
        org.junit.Assert.assertNotNull(jLabel4);
        org.junit.Assert.assertNull(rectangle9);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JButton jButton3 = home0.profileBtn;
        java.awt.MenuBar menuBar4 = null;
        home0.setMenuBar(menuBar4);
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jButton3);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JLabel jLabel6 = home5.taskDescLabel;
        home0.taskStartLabel = jLabel6;
        home0.refreshTable();
        Home home9 = new Home();
        javax.swing.JScrollPane jScrollPane10 = null;
        home9.scrollPane = jScrollPane10;
        javax.swing.JPanel jPanel12 = home9.panel;
        SignIn signIn13 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        signIn13.removeInputMethodListener(inputMethodListener14);
        boolean boolean16 = signIn13.isDisplayable();
        java.awt.LayoutManager layoutManager17 = signIn13.getLayout();
        signIn13.setIgnoreRepaint(true);
        java.awt.Component component20 = signIn13.getGlassPane();
        int int21 = jPanel12.getComponentZOrder((java.awt.Component) signIn13);
        java.awt.Font font22 = jPanel12.getFont();
        home0.setFont(font22);
        javax.swing.JButton jButton24 = home0.addJob;
        javax.swing.JTextField jTextField25 = home0.taskNameField;
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jLabel6);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(layoutManager17);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNotNull(jButton24);
        org.junit.Assert.assertNotNull(jTextField25);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField4 = signIn0.textPassword;
        boolean boolean5 = signIn0.isPreferredSizeSet();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn0.mouseDrag(event6, 100, 6);
        signIn0.setUndecorated(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jPasswordField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        javax.swing.JLabel jLabel8 = home0.status;
        boolean boolean9 = home0.isCursorSet();
        SignUp signUp10 = new SignUp();
        javax.swing.JButton jButton11 = signUp10.buttonSignup;
        java.awt.event.MouseListener[] mouseListenerArray12 = jButton11.getMouseListeners();
        home0.updateJob = jButton11;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jButton11);
        org.junit.Assert.assertNotNull(mouseListenerArray12);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        SignIn signIn0 = new SignIn();
        float float1 = signIn0.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = signIn0.getPropertyChangeListeners();
        SignIn signIn3 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        signIn3.removeInputMethodListener(inputMethodListener4);
        boolean boolean6 = signIn3.isDisplayable();
        java.awt.LayoutManager layoutManager7 = signIn3.getLayout();
        signIn3.setIgnoreRepaint(true);
        SignIn signIn10 = new SignIn();
        java.awt.Event event11 = null;
        boolean boolean14 = signIn10.mouseDrag(event11, 10, (int) (byte) -1);
        boolean boolean15 = signIn10.isForegroundSet();
        java.awt.Window window16 = signIn10.getOwner();
        boolean boolean17 = signIn3.isFocusCycleRoot((java.awt.Container) signIn10);
        signIn3.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType20 = signIn3.getModalExclusionType();
        signIn0.setModalExclusionType(modalExclusionType20);
        signIn0.addNotify();
        java.awt.dnd.DropTarget dropTarget23 = null;
        signIn0.setDropTarget(dropTarget23);
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.LayoutManager layoutManager29 = signIn25.getLayout();
        Home home30 = new Home();
        javax.swing.JScrollPane jScrollPane31 = null;
        home30.scrollPane = jScrollPane31;
        javax.swing.JPanel jPanel33 = home30.panel;
        boolean boolean34 = home30.isOpaque();
        javax.swing.JTextField jTextField35 = home30.taskStartField;
        SignIn signIn36 = new SignIn();
        int int37 = signIn36.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray39 = signIn36.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField40 = signIn36.textUsername;
        home30.taskStartField = jTextField40;
        Home home42 = new Home();
        javax.swing.JLabel jLabel43 = home42.taskStartLabel;
        home30.lblScheduledBy = jLabel43;
        java.awt.ComponentOrientation componentOrientation45 = home30.getComponentOrientation();
        signIn25.setComponentOrientation(componentOrientation45);
        signIn0.setComponentOrientation(componentOrientation45);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(window16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(layoutManager29);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(jTextField35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray39);
        org.junit.Assert.assertNotNull(jTextField40);
        org.junit.Assert.assertNotNull(jLabel43);
        org.junit.Assert.assertNotNull(componentOrientation45);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNotNull(jDateChooser4);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        javax.swing.JPanel jPanel5 = home0.panel;
        java.awt.event.FocusEvent.Cause cause6 = null;
        boolean boolean7 = home0.requestFocusInWindow(cause6);
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        java.awt.Point point7 = signIn0.getMousePosition();
        signIn0.requestFocus();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertNull(point7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        int int2 = home0.sel_task_id;
        javax.swing.JComboBox jComboBox3 = home0.priorityDropdown;
        Home home4 = new Home();
        javax.swing.JScrollPane jScrollPane5 = null;
        home4.scrollPane = jScrollPane5;
        javax.swing.JPanel jPanel7 = home4.panel;
        javax.swing.JTextField jTextField8 = home4.taskStartField;
        java.lang.String str9 = home4.rsp;
        javax.swing.JComboBox jComboBox10 = home4.priorityDropdown;
        home0.scheduleDropdown = jComboBox10;
        java.awt.event.MouseListener mouseListener12 = null;
        jComboBox10.addMouseListener(mouseListener12);
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jComboBox3);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertNull(jTextField8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(jComboBox10);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        SignIn signIn2 = signUp0.signIn;
        java.awt.event.KeyListener[] keyListenerArray3 = signUp0.getKeyListeners();
        SignIn signIn4 = new SignIn();
        int int5 = signIn4.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration6 = signIn4.getGraphicsConfiguration();
        java.awt.Font font7 = signIn4.getFont();
        javax.swing.JTextField jTextField8 = signIn4.textUsername;
        signUp0.profileNameTextField = jTextField8;
        javax.swing.JButton jButton10 = signUp0.buttonSignup;
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertNull(signIn2);
        org.junit.Assert.assertNotNull(keyListenerArray3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration6);
        org.junit.Assert.assertNull(font7);
        org.junit.Assert.assertNotNull(jTextField8);
        org.junit.Assert.assertNotNull(jButton10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        SignIn signIn0 = new SignIn();
        java.awt.event.ComponentListener componentListener1 = null;
        signIn0.removeComponentListener(componentListener1);
        javax.swing.JButton jButton3 = signIn0.buttonSignup;
        org.junit.Assert.assertNotNull(jButton3);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        boolean boolean19 = jTextField18.requestFocusInWindow();
        SignIn signIn20 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        signIn20.removeInputMethodListener(inputMethodListener21);
        boolean boolean23 = signIn20.isDisplayable();
        java.awt.LayoutManager layoutManager24 = signIn20.getLayout();
        signIn20.setIgnoreRepaint(true);
        SignIn signIn27 = new SignIn();
        java.awt.Event event28 = null;
        boolean boolean31 = signIn27.mouseDrag(event28, 10, (int) (byte) -1);
        boolean boolean32 = signIn27.isForegroundSet();
        java.awt.Window window33 = signIn27.getOwner();
        boolean boolean34 = signIn20.isFocusCycleRoot((java.awt.Container) signIn27);
        SignIn signIn35 = new SignIn();
        int int36 = signIn35.getState();
        java.util.List<java.awt.Image> imageList37 = signIn35.getIconImages();
        java.awt.image.ImageProducer imageProducer38 = null;
        java.awt.Image image39 = signIn35.createImage(imageProducer38);
        boolean boolean45 = signIn27.imageUpdate(image39, 9, 0, 212, 3, (int) (short) 0);
        Home home48 = new Home();
        javax.swing.JScrollPane jScrollPane49 = null;
        home48.scrollPane = jScrollPane49;
        javax.swing.JPanel jPanel51 = home48.panel;
        javax.swing.JTextField jTextField52 = home48.taskStartField;
        java.lang.String str53 = home48.rsp;
        javax.swing.JComboBox jComboBox54 = home48.priorityDropdown;
        int int55 = jTextField18.checkImage(image39, 10, 600, (java.awt.image.ImageObserver) home48);
        javax.swing.JTextField jTextField56 = home48.taskStartField;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(layoutManager24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(window33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(imageList37);
        org.junit.Assert.assertNotNull(image39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNull(jTextField52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(jComboBox54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(jTextField56);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        userProfile0.updateProfilePassword();
        java.lang.String str5 = userProfile0.respN;
        boolean boolean8 = userProfile0.contains(600, 212);
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Please enter your old and new password" + "'", str5, "Please enter your old and new password");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.Container container21 = signIn17.getParent();
        SignIn signIn22 = new SignIn();
        java.awt.Event event23 = null;
        boolean boolean26 = signIn22.mouseDrag(event23, 10, (int) (byte) -1);
        boolean boolean27 = signIn22.isForegroundSet();
        java.awt.Dimension dimension28 = signIn22.preferredSize();
        signIn17.setMinimumSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener30 = null;
        signIn17.addHierarchyListener(hierarchyListener30);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn17.setLayout(layoutManager36);
        java.awt.Rectangle rectangle38 = signIn17.getMaximizedBounds();
        boolean boolean39 = signIn0.isFocusCycleRoot((java.awt.Container) signIn17);
        boolean boolean40 = signIn0.isBackgroundSet();
        SignIn signIn41 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        signIn41.removeInputMethodListener(inputMethodListener42);
        boolean boolean44 = signIn41.isDisplayable();
        java.awt.LayoutManager layoutManager45 = signIn41.getLayout();
        signIn41.setIgnoreRepaint(true);
        SignIn signIn48 = new SignIn();
        java.awt.Event event49 = null;
        boolean boolean52 = signIn48.mouseDrag(event49, 10, (int) (byte) -1);
        boolean boolean53 = signIn48.isForegroundSet();
        java.awt.Window window54 = signIn48.getOwner();
        boolean boolean55 = signIn41.isFocusCycleRoot((java.awt.Container) signIn48);
        signIn41.repaint((long) (short) 1);
        SignIn signIn58 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener59 = null;
        signIn58.removeInputMethodListener(inputMethodListener59);
        boolean boolean61 = signIn58.isDisplayable();
        java.awt.Container container62 = signIn58.getParent();
        SignIn signIn63 = new SignIn();
        java.awt.Event event64 = null;
        boolean boolean67 = signIn63.mouseDrag(event64, 10, (int) (byte) -1);
        boolean boolean68 = signIn63.isForegroundSet();
        java.awt.Dimension dimension69 = signIn63.preferredSize();
        signIn58.setMinimumSize(dimension69);
        java.awt.event.HierarchyListener hierarchyListener71 = null;
        signIn58.addHierarchyListener(hierarchyListener71);
        SignIn signIn73 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener74 = null;
        signIn73.removeInputMethodListener(inputMethodListener74);
        boolean boolean76 = signIn73.isDisplayable();
        java.awt.LayoutManager layoutManager77 = signIn73.getLayout();
        signIn58.setLayout(layoutManager77);
        java.awt.Rectangle rectangle79 = signIn58.getMaximizedBounds();
        boolean boolean80 = signIn41.isFocusCycleRoot((java.awt.Container) signIn58);
        SignIn signIn81 = new SignIn();
        int int82 = signIn81.getState();
        java.util.List<java.awt.Image> imageList83 = signIn81.getIconImages();
        java.awt.image.ImageProducer imageProducer84 = null;
        java.awt.Image image85 = signIn81.createImage(imageProducer84);
        boolean boolean91 = signIn58.imageUpdate(image85, 10, 0, 32, 100, 5);
        java.awt.image.ImageObserver imageObserver92 = null;
        int int93 = signIn0.checkImage(image85, imageObserver92);
        java.awt.im.InputContext inputContext94 = signIn0.getInputContext();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertNull(rectangle38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(layoutManager45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(window54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(container62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dimension69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(layoutManager77);
        org.junit.Assert.assertNull(rectangle79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(imageList83);
        org.junit.Assert.assertNotNull(image85);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(inputContext94);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.clearAllInput();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray6 = home0.getHierarchyBoundsListeners();
        Home home7 = new Home();
        javax.swing.JLabel jLabel8 = null;
        home7.taskEndLabel = jLabel8;
        home7.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea12 = null;
        home7.taskDescField = jTextArea12;
        javax.swing.JTextField jTextField14 = null;
        home7.taskNameField = jTextField14;
        SignIn signIn16 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        signIn16.removeInputMethodListener(inputMethodListener17);
        boolean boolean19 = signIn16.isDisplayable();
        java.awt.LayoutManager layoutManager20 = signIn16.getLayout();
        signIn16.setIgnoreRepaint(true);
        SignIn signIn23 = new SignIn();
        java.awt.Event event24 = null;
        boolean boolean27 = signIn23.mouseDrag(event24, 10, (int) (byte) -1);
        boolean boolean28 = signIn23.isForegroundSet();
        java.awt.Window window29 = signIn23.getOwner();
        boolean boolean30 = signIn16.isFocusCycleRoot((java.awt.Container) signIn23);
        signIn16.repaint((long) (short) 1);
        SignIn signIn33 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener34 = null;
        signIn33.removeInputMethodListener(inputMethodListener34);
        boolean boolean36 = signIn33.isDisplayable();
        java.awt.Container container37 = signIn33.getParent();
        SignIn signIn38 = new SignIn();
        java.awt.Event event39 = null;
        boolean boolean42 = signIn38.mouseDrag(event39, 10, (int) (byte) -1);
        boolean boolean43 = signIn38.isForegroundSet();
        java.awt.Dimension dimension44 = signIn38.preferredSize();
        signIn33.setMinimumSize(dimension44);
        java.awt.event.HierarchyListener hierarchyListener46 = null;
        signIn33.addHierarchyListener(hierarchyListener46);
        SignIn signIn48 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener49 = null;
        signIn48.removeInputMethodListener(inputMethodListener49);
        boolean boolean51 = signIn48.isDisplayable();
        java.awt.LayoutManager layoutManager52 = signIn48.getLayout();
        signIn33.setLayout(layoutManager52);
        java.awt.Rectangle rectangle54 = signIn33.getMaximizedBounds();
        boolean boolean55 = signIn16.isFocusCycleRoot((java.awt.Container) signIn33);
        boolean boolean56 = signIn16.isBackgroundSet();
        signIn16.repaint();
        javax.swing.JButton jButton58 = signIn16.buttonSignup;
        SignIn signIn59 = new SignIn();
        int int60 = signIn59.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration61 = signIn59.getGraphicsConfiguration();
        java.awt.Font font62 = signIn59.getFont();
        javax.swing.JTextField jTextField63 = signIn59.textUsername;
        SignIn signIn64 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener65 = null;
        signIn64.removeInputMethodListener(inputMethodListener65);
        boolean boolean67 = signIn64.isDisplayable();
        java.awt.Container container68 = signIn64.getParent();
        SignIn signIn69 = new SignIn();
        java.awt.Event event70 = null;
        boolean boolean73 = signIn69.mouseDrag(event70, 10, (int) (byte) -1);
        boolean boolean74 = signIn69.isForegroundSet();
        java.awt.Dimension dimension75 = signIn69.preferredSize();
        signIn64.setMinimumSize(dimension75);
        java.awt.event.HierarchyListener hierarchyListener77 = null;
        signIn64.addHierarchyListener(hierarchyListener77);
        signIn64.show();
        signIn64.invalidate();
        java.awt.Point point81 = signIn64.getLocation();
        java.awt.Component component82 = signIn59.getComponentAt(point81);
        boolean boolean83 = signIn16.contains(point81);
        java.awt.Component component84 = home7.getComponentAt(point81);
        java.awt.Component component85 = home0.findComponentAt(point81);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(layoutManager20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(window29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(container37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dimension44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(layoutManager52);
        org.junit.Assert.assertNull(rectangle54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jButton58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration61);
        org.junit.Assert.assertNull(font62);
        org.junit.Assert.assertNotNull(jTextField63);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(container68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dimension75);
        org.junit.Assert.assertNotNull(point81);
        org.junit.Assert.assertNotNull(component82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(component84);
        org.junit.Assert.assertNull(component85);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.LayoutManager layoutManager21 = signIn17.getLayout();
        signIn17.setIgnoreRepaint(true);
        SignIn signIn24 = new SignIn();
        java.awt.Event event25 = null;
        boolean boolean28 = signIn24.mouseDrag(event25, 10, (int) (byte) -1);
        boolean boolean29 = signIn24.isForegroundSet();
        java.awt.Window window30 = signIn24.getOwner();
        boolean boolean31 = signIn17.isFocusCycleRoot((java.awt.Container) signIn24);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn32.setIgnoreRepaint(true);
        SignIn signIn39 = new SignIn();
        java.awt.Event event40 = null;
        boolean boolean43 = signIn39.mouseDrag(event40, 10, (int) (byte) -1);
        boolean boolean44 = signIn39.isForegroundSet();
        java.awt.Window window45 = signIn39.getOwner();
        boolean boolean46 = signIn32.isFocusCycleRoot((java.awt.Container) signIn39);
        java.awt.Dimension dimension47 = signIn39.minimumSize();
        signIn24.setMaximumSize(dimension47);
        signIn0.setMaximumSize(dimension47);
        SignIn signIn50 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        signIn50.removeInputMethodListener(inputMethodListener51);
        boolean boolean53 = signIn50.isDisplayable();
        java.awt.event.FocusEvent.Cause cause54 = null;
        boolean boolean55 = signIn50.requestFocusInWindow(cause54);
        java.awt.LayoutManager layoutManager56 = signIn50.getLayout();
        boolean boolean57 = signIn50.isForegroundSet();
        java.awt.Event event58 = null;
        boolean boolean61 = signIn50.mouseDrag(event58, (int) (byte) 1, (int) (byte) 10);
        java.awt.ImageCapabilities imageCapabilities64 = null;
        java.awt.image.VolatileImage volatileImage65 = signIn50.createVolatileImage((int) (short) 0, (-1), imageCapabilities64);
        java.awt.Dimension dimension66 = signIn50.getSize();
        signIn0.setMaximumSize(dimension66);
        javax.swing.JMenuBar jMenuBar68 = null;
        signIn0.setJMenuBar(jMenuBar68);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(layoutManager21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(window30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(window45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(layoutManager56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(volatileImage65);
        org.junit.Assert.assertNotNull(dimension66);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        java.awt.Dimension dimension2 = signUp0.size();
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertNotNull(dimension2);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.Container container21 = signIn17.getParent();
        SignIn signIn22 = new SignIn();
        java.awt.Event event23 = null;
        boolean boolean26 = signIn22.mouseDrag(event23, 10, (int) (byte) -1);
        boolean boolean27 = signIn22.isForegroundSet();
        java.awt.Dimension dimension28 = signIn22.preferredSize();
        signIn17.setMinimumSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener30 = null;
        signIn17.addHierarchyListener(hierarchyListener30);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn17.setLayout(layoutManager36);
        java.awt.Rectangle rectangle38 = signIn17.getMaximizedBounds();
        boolean boolean39 = signIn0.isFocusCycleRoot((java.awt.Container) signIn17);
        boolean boolean40 = signIn0.isBackgroundSet();
        signIn0.repaint();
        int int42 = signIn0.getWidth();
        java.awt.image.VolatileImage volatileImage45 = signIn0.createVolatileImage((-1), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertNull(rectangle38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 700 + "'", int42 == 700);
        org.junit.Assert.assertNull(volatileImage45);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.Container container21 = signIn17.getParent();
        SignIn signIn22 = new SignIn();
        java.awt.Event event23 = null;
        boolean boolean26 = signIn22.mouseDrag(event23, 10, (int) (byte) -1);
        boolean boolean27 = signIn22.isForegroundSet();
        java.awt.Dimension dimension28 = signIn22.preferredSize();
        signIn17.setMinimumSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener30 = null;
        signIn17.addHierarchyListener(hierarchyListener30);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn17.setLayout(layoutManager36);
        java.awt.Rectangle rectangle38 = signIn17.getMaximizedBounds();
        boolean boolean39 = signIn0.isFocusCycleRoot((java.awt.Container) signIn17);
        boolean boolean40 = signIn0.isBackgroundSet();
        SignIn signIn41 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        signIn41.removeInputMethodListener(inputMethodListener42);
        boolean boolean44 = signIn41.isDisplayable();
        java.awt.LayoutManager layoutManager45 = signIn41.getLayout();
        signIn41.setIgnoreRepaint(true);
        SignIn signIn48 = new SignIn();
        java.awt.Event event49 = null;
        boolean boolean52 = signIn48.mouseDrag(event49, 10, (int) (byte) -1);
        boolean boolean53 = signIn48.isForegroundSet();
        java.awt.Window window54 = signIn48.getOwner();
        boolean boolean55 = signIn41.isFocusCycleRoot((java.awt.Container) signIn48);
        signIn41.repaint((long) (short) 1);
        SignIn signIn58 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener59 = null;
        signIn58.removeInputMethodListener(inputMethodListener59);
        boolean boolean61 = signIn58.isDisplayable();
        java.awt.Container container62 = signIn58.getParent();
        SignIn signIn63 = new SignIn();
        java.awt.Event event64 = null;
        boolean boolean67 = signIn63.mouseDrag(event64, 10, (int) (byte) -1);
        boolean boolean68 = signIn63.isForegroundSet();
        java.awt.Dimension dimension69 = signIn63.preferredSize();
        signIn58.setMinimumSize(dimension69);
        java.awt.event.HierarchyListener hierarchyListener71 = null;
        signIn58.addHierarchyListener(hierarchyListener71);
        SignIn signIn73 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener74 = null;
        signIn73.removeInputMethodListener(inputMethodListener74);
        boolean boolean76 = signIn73.isDisplayable();
        java.awt.LayoutManager layoutManager77 = signIn73.getLayout();
        signIn58.setLayout(layoutManager77);
        java.awt.Rectangle rectangle79 = signIn58.getMaximizedBounds();
        boolean boolean80 = signIn41.isFocusCycleRoot((java.awt.Container) signIn58);
        SignIn signIn81 = new SignIn();
        int int82 = signIn81.getState();
        java.util.List<java.awt.Image> imageList83 = signIn81.getIconImages();
        java.awt.image.ImageProducer imageProducer84 = null;
        java.awt.Image image85 = signIn81.createImage(imageProducer84);
        boolean boolean91 = signIn58.imageUpdate(image85, 10, 0, 32, 100, 5);
        java.awt.image.ImageObserver imageObserver92 = null;
        int int93 = signIn0.checkImage(image85, imageObserver92);
        java.awt.Graphics graphics94 = null;
        signIn0.update(graphics94);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertNull(rectangle38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(layoutManager45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(window54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(container62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(dimension69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(layoutManager77);
        org.junit.Assert.assertNull(rectangle79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(imageList83);
        org.junit.Assert.assertNotNull(image85);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        home0.revalidate();
        home0.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str13 = home0.user_id;
        int int14 = home0.getCursorType();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Signup" + "'", str13, "User Signup");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        javax.swing.JTextField jTextField7 = null;
        home0.taskNameField = jTextField7;
        home0.firePropertyChange("Home[frame3,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double) 10L, (double) 2);
        javax.swing.JTable jTable13 = home0.table;
        boolean boolean14 = home0.getFocusTraversalKeysEnabled();
        org.junit.Assert.assertNotNull(jTable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = signIn6.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField10 = signIn6.textUsername;
        home0.taskStartField = jTextField10;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskStartLabel;
        home0.lblScheduledBy = jLabel13;
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = home0.createImage(imageProducer15);
        javax.swing.JPanel jPanel17 = home0.panel;
        javax.swing.JLabel jLabel18 = home0.status;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jLabel18);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        int int2 = home0.sel_task_id;
        SignIn signIn3 = new SignIn();
        int int4 = signIn3.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = signIn3.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField7 = signIn3.textPassword;
        java.awt.LayoutManager layoutManager8 = jPasswordField7.getLayout();
        boolean boolean9 = jPasswordField7.isMaximumSizeSet();
        home0.taskTypeField = jPasswordField7;
        java.awt.event.MouseListener mouseListener11 = null;
        home0.removeMouseListener(mouseListener11);
        boolean boolean13 = home0.isFocusable();
        SignUp signUp14 = new SignUp();
        SignUp signUp15 = new SignUp();
        javax.swing.JPasswordField jPasswordField16 = signUp15.textPassword;
        signUp14.profileNameTextField = jPasswordField16;
        home0.taskStartField = jPasswordField16;
        javax.swing.JLabel jLabel19 = home0.lblScheduledBy;
        jLabel19.enableInputMethods(true);
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jPasswordField7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jPasswordField16);
        org.junit.Assert.assertNotNull(jLabel19);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.LayoutManager layoutManager19 = signIn15.getLayout();
        signIn0.setLayout(layoutManager19);
        boolean boolean21 = signIn0.isValid();
        signIn0.setVisible(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        userProfile0.updateProfilePassword();
        java.lang.String str5 = userProfile0.respN;
        javax.swing.JButton jButton6 = userProfile0.backButton;
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Please enter your old and new password" + "'", str5, "Please enter your old and new password");
        org.junit.Assert.assertNotNull(jButton6);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        javax.accessibility.AccessibleContext accessibleContext2 = signUp0.getAccessibleContext();
        boolean boolean5 = signUp0.inside(16, 12);
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertNotNull(accessibleContext2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.event.FocusEvent.Cause cause22 = null;
        boolean boolean23 = signIn18.requestFocusInWindow(cause22);
        javax.swing.JRootPane jRootPane24 = signIn18.getRootPane();
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.LayoutManager layoutManager29 = signIn25.getLayout();
        signIn25.setIgnoreRepaint(true);
        SignIn signIn32 = new SignIn();
        java.awt.Event event33 = null;
        boolean boolean36 = signIn32.mouseDrag(event33, 10, (int) (byte) -1);
        boolean boolean37 = signIn32.isForegroundSet();
        java.awt.Window window38 = signIn32.getOwner();
        boolean boolean39 = signIn25.isFocusCycleRoot((java.awt.Container) signIn32);
        signIn25.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType42 = signIn25.getModalExclusionType();
        signIn18.setModalExclusionType(modalExclusionType42);
        boolean boolean44 = signIn18.isFocusTraversalPolicySet();
        signUp0.signIn = signIn18;
        signUp0.handleSignUpButton("No Complete", "Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jRootPane24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(layoutManager29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(window38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType42 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType42.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Window window6 = signIn0.getOwner();
        java.awt.event.WindowFocusListener windowFocusListener7 = null;
        signIn0.addWindowFocusListener(windowFocusListener7);
        java.util.List<java.awt.Image> imageList9 = signIn0.getIconImages();
        SignIn signIn10 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        signIn10.removeInputMethodListener(inputMethodListener11);
        boolean boolean13 = signIn10.isDisplayable();
        java.awt.Container container14 = signIn10.getParent();
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.Event event19 = null;
        boolean boolean21 = signIn15.keyDown(event19, (int) '4');
        java.awt.Color color22 = signIn15.getBackground();
        signIn10.setBackground(color22);
        signIn0.setForeground(color22);
        SignIn signIn25 = new SignIn();
        float float26 = signIn25.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray27 = signIn25.getPropertyChangeListeners();
        SignIn signIn28 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        signIn28.removeInputMethodListener(inputMethodListener29);
        boolean boolean31 = signIn28.isDisplayable();
        java.awt.LayoutManager layoutManager32 = signIn28.getLayout();
        signIn28.setIgnoreRepaint(true);
        SignIn signIn35 = new SignIn();
        java.awt.Event event36 = null;
        boolean boolean39 = signIn35.mouseDrag(event36, 10, (int) (byte) -1);
        boolean boolean40 = signIn35.isForegroundSet();
        java.awt.Window window41 = signIn35.getOwner();
        boolean boolean42 = signIn28.isFocusCycleRoot((java.awt.Container) signIn35);
        signIn28.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType45 = signIn28.getModalExclusionType();
        signIn25.setModalExclusionType(modalExclusionType45);
        boolean boolean47 = signIn25.isMinimumSizeSet();
        int int48 = signIn0.getComponentZOrder((java.awt.Component) signIn25);
        java.awt.Container container49 = signIn0.getFocusCycleRootAncestor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(window6);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(layoutManager32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(window41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType45 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType45.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNull(container49);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        DataAccess dataAccess0 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList2 = dataAccess0.getAllJobs("hi!");
        java.lang.String str6 = dataAccess0.signUp("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "frame4", "");
        DataAccess dataAccess7 = new DataAccess();
        DataAccess dataAccess8 = new DataAccess();
        DataAccess dataAccess9 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList10 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList12 = dataAccess9.scheduleTasks(strListList10, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList14 = dataAccess8.scheduleTasks(strListList10, "User Signup");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList16 = dataAccess7.scheduleTasks(strListList10, "Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList18 = dataAccess0.scheduleTasks(strListList16, "Home[frame10,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList20 = dataAccess0.getAllJobs("Home[frame10,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNotNull(strListList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strListList12);
        org.junit.Assert.assertNotNull(strListList14);
        org.junit.Assert.assertNotNull(strListList16);
        org.junit.Assert.assertNotNull(strListList18);
        org.junit.Assert.assertNotNull(strListList20);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        java.awt.Dimension dimension3 = signIn0.minimumSize();
        signIn0.firePropertyChange("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (double) 1L, 0.0d);
        float float8 = signIn0.getAlignmentY();
        signIn0.setLocationByPlatform(true);
        java.awt.Toolkit toolkit11 = signIn0.getToolkit();
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.5f + "'", float8 == 0.5f);
        org.junit.Assert.assertNotNull(toolkit11);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.clearAllInput();
        java.awt.dnd.DropTarget dropTarget6 = null;
        home0.setDropTarget(dropTarget6);
        SignUp signUp8 = new SignUp();
        SignIn signIn9 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        signIn9.removeInputMethodListener(inputMethodListener10);
        boolean boolean12 = signIn9.isDisplayable();
        java.awt.LayoutManager layoutManager13 = signIn9.getLayout();
        signIn9.setIgnoreRepaint(true);
        SignIn signIn16 = new SignIn();
        java.awt.Event event17 = null;
        boolean boolean20 = signIn16.mouseDrag(event17, 10, (int) (byte) -1);
        boolean boolean21 = signIn16.isForegroundSet();
        java.awt.Window window22 = signIn16.getOwner();
        boolean boolean23 = signIn9.isFocusCycleRoot((java.awt.Container) signIn16);
        boolean boolean24 = signIn16.isPreferredSizeSet();
        signUp8.signIn = signIn16;
        javax.swing.JTextField jTextField26 = signUp8.textUsername;
        SignIn signIn27 = new SignIn();
        int int28 = signIn27.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = signIn27.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField31 = signIn27.textPassword;
        signUp8.textUsername = jPasswordField31;
        Home home33 = new Home();
        javax.swing.JTextField jTextField34 = home33.taskStartField;
        Home home35 = new Home();
        javax.swing.JScrollPane jScrollPane36 = null;
        home35.scrollPane = jScrollPane36;
        javax.swing.JPanel jPanel38 = home35.panel;
        com.toedter.calendar.JDateChooser jDateChooser39 = home35.stDate;
        home33.enDate = jDateChooser39;
        signUp8.addPropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser39);
        home0.stDate = jDateChooser39;
        javax.swing.JButton jButton43 = home0.deleteJob;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(layoutManager13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(window22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jTextField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertNotNull(jPasswordField31);
        org.junit.Assert.assertNull(jTextField34);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jDateChooser39);
        org.junit.Assert.assertNotNull(jButton43);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        javax.swing.JTextField jTextField7 = null;
        home0.taskNameField = jTextField7;
        home0.firePropertyChange("User Signup", (double) 2, (double) 1);
        boolean boolean13 = home0.isValidateRoot();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        boolean boolean7 = signIn0.isForegroundSet();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn0.mouseDrag(event8, (int) (byte) 1, (int) (byte) 10);
        java.awt.Font font12 = signIn0.getFont();
        java.awt.FocusTraversalPolicy focusTraversalPolicy13 = signIn0.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(font12);
        org.junit.Assert.assertNotNull(focusTraversalPolicy13);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = signIn6.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField10 = signIn6.textUsername;
        home0.taskStartField = jTextField10;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskStartLabel;
        home0.lblScheduledBy = jLabel13;
        java.awt.ComponentOrientation componentOrientation15 = home0.getComponentOrientation();
        javax.swing.JButton jButton16 = home0.updateJob;
        home0.addJob();
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.LayoutManager layoutManager22 = signIn18.getLayout();
        signIn18.setIgnoreRepaint(true);
        SignIn signIn25 = new SignIn();
        java.awt.Event event26 = null;
        boolean boolean29 = signIn25.mouseDrag(event26, 10, (int) (byte) -1);
        boolean boolean30 = signIn25.isForegroundSet();
        java.awt.Window window31 = signIn25.getOwner();
        boolean boolean32 = signIn18.isFocusCycleRoot((java.awt.Container) signIn25);
        signIn18.repaint((long) (short) 1);
        SignIn signIn35 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        signIn35.removeInputMethodListener(inputMethodListener36);
        boolean boolean38 = signIn35.isDisplayable();
        java.awt.Container container39 = signIn35.getParent();
        SignIn signIn40 = new SignIn();
        java.awt.Event event41 = null;
        boolean boolean44 = signIn40.mouseDrag(event41, 10, (int) (byte) -1);
        boolean boolean45 = signIn40.isForegroundSet();
        java.awt.Dimension dimension46 = signIn40.preferredSize();
        signIn35.setMinimumSize(dimension46);
        java.awt.event.HierarchyListener hierarchyListener48 = null;
        signIn35.addHierarchyListener(hierarchyListener48);
        SignIn signIn50 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        signIn50.removeInputMethodListener(inputMethodListener51);
        boolean boolean53 = signIn50.isDisplayable();
        java.awt.LayoutManager layoutManager54 = signIn50.getLayout();
        signIn35.setLayout(layoutManager54);
        java.awt.Rectangle rectangle56 = signIn35.getMaximizedBounds();
        boolean boolean57 = signIn18.isFocusCycleRoot((java.awt.Container) signIn35);
        SignIn signIn58 = new SignIn();
        int int59 = signIn58.getState();
        java.util.List<java.awt.Image> imageList60 = signIn58.getIconImages();
        java.awt.image.ImageProducer imageProducer61 = null;
        java.awt.Image image62 = signIn58.createImage(imageProducer61);
        boolean boolean68 = signIn35.imageUpdate(image62, 10, 0, 32, 100, 5);
        SignIn signIn71 = new SignIn();
        float float72 = signIn71.getAlignmentY();
        boolean boolean73 = signIn71.getFocusTraversalKeysEnabled();
        java.lang.String str74 = signIn71.toString();
        int int75 = home0.checkImage(image62, 0, (-1), (java.awt.image.ImageObserver) signIn71);
        SignUp signUp76 = new SignUp();
        javax.swing.JPasswordField jPasswordField77 = signUp76.textPassword;
        signIn71.textUsername = jPasswordField77;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertNotNull(jButton16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(window31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(container39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(layoutManager54);
        org.junit.Assert.assertNull(rectangle56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(imageList60);
        org.junit.Assert.assertNotNull(image62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.5f + "'", float72 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "SignIn[frame12,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str74, "SignIn[frame12,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
        org.junit.Assert.assertNotNull(jPasswordField77);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        signIn0.removePropertyChangeListener("", propertyChangeListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = signIn0.getFocusTraversalPolicy();
        java.awt.Component component8 = signIn0.getGlassPane();
        boolean boolean9 = signIn0.isUndecorated();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy7);
        org.junit.Assert.assertNotNull(component8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.LayoutManager layoutManager19 = signIn15.getLayout();
        signIn0.setLayout(layoutManager19);
        boolean boolean21 = signIn0.isValid();
        Home home22 = new Home();
        javax.swing.JLabel jLabel23 = null;
        home22.taskEndLabel = jLabel23;
        java.awt.Component component27 = home22.getComponentAt(10, 610);
        SignIn signIn28 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        signIn28.removeInputMethodListener(inputMethodListener29);
        boolean boolean31 = signIn28.isDisplayable();
        java.awt.Container container32 = signIn28.getParent();
        SignIn signIn33 = new SignIn();
        java.awt.Event event34 = null;
        boolean boolean37 = signIn33.mouseDrag(event34, 10, (int) (byte) -1);
        boolean boolean38 = signIn33.isForegroundSet();
        java.awt.Dimension dimension39 = signIn33.preferredSize();
        signIn28.setMinimumSize(dimension39);
        int int41 = signIn28.countComponents();
        // The following exception was thrown during execution in test generation
        try {
            signIn0.add((java.awt.Component) home22, (java.lang.Object) signIn28, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(component27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(container32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dimension39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        javax.swing.JRootPane jRootPane6 = signIn0.getRootPane();
        java.awt.dnd.DropTarget dropTarget7 = null;
        signIn0.setDropTarget(dropTarget7);
        java.awt.Graphics graphics9 = null;
        signIn0.paint(graphics9);
        java.awt.Graphics graphics11 = null;
        signIn0.update(graphics11);
        java.io.PrintWriter printWriter13 = null;
        // The following exception was thrown during execution in test generation
        try {
            signIn0.list(printWriter13, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(jRootPane6);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JPanel jPanel8 = home5.panel;
        javax.swing.JTextField jTextField9 = home5.taskStartField;
        java.lang.String str10 = home5.rsp;
        javax.swing.JComboBox jComboBox11 = home5.priorityDropdown;
        home0.scheduleDropdown = jComboBox11;
        javax.swing.JLabel jLabel13 = home0.taskDescLabel;
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        home0.addInputMethodListener(inputMethodListener14);
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertNull(jTextField9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(jLabel13);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = signIn6.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField10 = signIn6.textUsername;
        home0.taskStartField = jTextField10;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskStartLabel;
        home0.lblScheduledBy = jLabel13;
        java.awt.ComponentOrientation componentOrientation15 = home0.getComponentOrientation();
        javax.swing.JButton jButton16 = home0.updateJob;
        java.awt.Component component17 = home0.getMostRecentFocusOwner();
        home0.hide();
        java.awt.ImageCapabilities imageCapabilities21 = null;
        java.awt.image.VolatileImage volatileImage22 = home0.createVolatileImage((int) 'a', 3, imageCapabilities21);
        java.lang.String str23 = home0.user_id;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertNotNull(jButton16);
        org.junit.Assert.assertNotNull(component17);
        org.junit.Assert.assertNull(volatileImage22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "User Signup" + "'", str23, "User Signup");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        boolean boolean7 = signIn0.isFontSet();
        signIn0.firePropertyChange("", ' ', 'a');
        java.awt.event.MouseListener[] mouseListenerArray12 = signIn0.getMouseListeners();
        java.awt.event.KeyListener[] keyListenerArray13 = signIn0.getKeyListeners();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mouseListenerArray12);
        org.junit.Assert.assertNotNull(keyListenerArray13);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        java.awt.event.WindowFocusListener windowFocusListener15 = null;
        signIn0.addWindowFocusListener(windowFocusListener15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        Home home3 = new Home();
        javax.swing.JLabel jLabel4 = home3.taskStartLabel;
        home0.taskTypeLabel = jLabel4;
        java.awt.Event event6 = null;
        boolean boolean9 = home0.mouseDown(event6, (int) (short) 1, 128);
        boolean boolean10 = home0.isUndecorated();
        org.junit.Assert.assertNotNull(jLabel4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        javax.swing.JPasswordField jPasswordField4 = userProfile0.oldPasstextField;
        userProfile0.user_pass = "Home[frame8,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertNotNull(jPasswordField4);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        boolean boolean8 = home0.isUndecorated();
        java.awt.event.ComponentListener[] componentListenerArray9 = home0.getComponentListeners();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(componentListenerArray9);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Event event4 = null;
        boolean boolean6 = signIn0.keyUp(event4, 128);
        signIn0.list();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        javax.swing.JTextField jTextField7 = null;
        home0.taskNameField = jTextField7;
        home0.firePropertyChange("Home[frame3,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (double) 10L, (double) 2);
        javax.swing.JScrollPane jScrollPane13 = home0.scrollPane;
        home0.setLocation((int) 'a', (int) '4');
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.event.FocusEvent.Cause cause21 = null;
        boolean boolean22 = signIn17.requestFocusInWindow(cause21);
        javax.swing.JRootPane jRootPane23 = signIn17.getRootPane();
        SignIn signIn24 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        signIn24.removeInputMethodListener(inputMethodListener25);
        boolean boolean27 = signIn24.isDisplayable();
        java.awt.LayoutManager layoutManager28 = signIn24.getLayout();
        signIn24.setIgnoreRepaint(true);
        SignIn signIn31 = new SignIn();
        java.awt.Event event32 = null;
        boolean boolean35 = signIn31.mouseDrag(event32, 10, (int) (byte) -1);
        boolean boolean36 = signIn31.isForegroundSet();
        java.awt.Window window37 = signIn31.getOwner();
        boolean boolean38 = signIn24.isFocusCycleRoot((java.awt.Container) signIn31);
        signIn24.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType41 = signIn24.getModalExclusionType();
        signIn17.setModalExclusionType(modalExclusionType41);
        javax.swing.JTextField jTextField43 = signIn17.textUsername;
        home0.taskStartField = jTextField43;
        org.junit.Assert.assertNotNull(jScrollPane13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jRootPane23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(layoutManager28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(window37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType41 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType41.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(jTextField43);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        Home home0 = new Home();
        javax.swing.JTable jTable1 = home0.table;
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        signIn2.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = signIn2.getModalExclusionType();
        home0.setModalExclusionType(modalExclusionType19);
        Home home21 = new Home();
        javax.swing.JScrollPane jScrollPane22 = null;
        home21.scrollPane = jScrollPane22;
        javax.swing.JPanel jPanel24 = home21.panel;
        boolean boolean25 = home21.isOpaque();
        javax.swing.JTextField jTextField26 = home21.taskStartField;
        SignIn signIn27 = new SignIn();
        int int28 = signIn27.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = signIn27.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField31 = signIn27.textUsername;
        home21.taskStartField = jTextField31;
        Home home33 = new Home();
        javax.swing.JLabel jLabel34 = home33.taskDescLabel;
        home33.rsp = "hi!";
        javax.swing.JComboBox jComboBox37 = home33.statusDropdown;
        Home home38 = new Home();
        javax.swing.JLabel jLabel39 = home38.taskDescLabel;
        home33.taskStartLabel = jLabel39;
        home21.taskTypeLabel = jLabel39;
        home0.taskEndLabel = jLabel39;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = null;
        home43.taskEndLabel = jLabel44;
        home43.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JLabel jLabel48 = home43.taskTypeLabel;
        home0.taskDescLabel = jLabel48;
        java.awt.event.ComponentListener[] componentListenerArray50 = jLabel48.getComponentListeners();
        SignIn signIn51 = new SignIn();
        java.awt.Event event52 = null;
        boolean boolean55 = signIn51.mouseDrag(event52, 10, (int) (byte) -1);
        java.awt.Event event56 = null;
        boolean boolean59 = signIn51.mouseUp(event56, (-1), (int) '4');
        signIn51.show(false);
        signIn51.doLayout();
        Home home63 = new Home();
        javax.swing.JLabel jLabel64 = null;
        home63.taskEndLabel = jLabel64;
        Home home66 = new Home();
        javax.swing.JLabel jLabel67 = home66.taskStartLabel;
        home63.taskTypeLabel = jLabel67;
        java.awt.Point point69 = home63.getLocation();
        Home home70 = new Home();
        javax.swing.JScrollPane jScrollPane71 = null;
        home70.scrollPane = jScrollPane71;
        javax.swing.JButton jButton73 = home70.updateJob;
        home63.updateJob = jButton73;
        signIn51.buttonSignup = jButton73;
        SignIn signIn76 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener77 = null;
        signIn76.removeInputMethodListener(inputMethodListener77);
        boolean boolean79 = signIn76.isDisplayable();
        java.awt.LayoutManager layoutManager80 = signIn76.getLayout();
        Home home81 = new Home();
        javax.swing.JScrollPane jScrollPane82 = null;
        home81.scrollPane = jScrollPane82;
        javax.swing.JPanel jPanel84 = home81.panel;
        boolean boolean85 = home81.isOpaque();
        javax.swing.JTextField jTextField86 = home81.taskStartField;
        SignIn signIn87 = new SignIn();
        int int88 = signIn87.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray90 = signIn87.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField91 = signIn87.textUsername;
        home81.taskStartField = jTextField91;
        Home home93 = new Home();
        javax.swing.JLabel jLabel94 = home93.taskStartLabel;
        home81.lblScheduledBy = jLabel94;
        java.awt.ComponentOrientation componentOrientation96 = home81.getComponentOrientation();
        signIn76.setComponentOrientation(componentOrientation96);
        jButton73.setComponentOrientation(componentOrientation96);
        jLabel48.setComponentOrientation(componentOrientation96);
        org.junit.Assert.assertNotNull(jTable1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType19 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType19.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertNotNull(jTextField31);
        org.junit.Assert.assertNotNull(jLabel34);
        org.junit.Assert.assertNotNull(jComboBox37);
        org.junit.Assert.assertNotNull(jLabel39);
        org.junit.Assert.assertNotNull(jLabel48);
        org.junit.Assert.assertNotNull(componentListenerArray50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jLabel67);
        org.junit.Assert.assertNotNull(point69);
        org.junit.Assert.assertNotNull(jButton73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(layoutManager80);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNull(jTextField86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray90);
        org.junit.Assert.assertNotNull(jTextField91);
        org.junit.Assert.assertNotNull(jLabel94);
        org.junit.Assert.assertNotNull(componentOrientation96);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.lang.String str1 = Utils.passwordHashing("frame9");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bc0fe9478b455315f655a08ce5916052913cc6cb0f23cd3b51f1e3479fac4512" + "'", str1, "bc0fe9478b455315f655a08ce5916052913cc6cb0f23cd3b51f1e3479fac4512");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        SignUp signUp0 = new SignUp();
        javax.swing.JButton jButton1 = signUp0.buttonSignup;
        java.awt.Shape shape2 = null;
        signUp0.setMixingCutoutShape(shape2);
        java.awt.Insets insets4 = signUp0.getInsets();
        java.awt.Shape shape5 = signUp0.getShape();
        java.awt.Container container6 = signUp0.getContentPane();
        org.junit.Assert.assertNotNull(jButton1);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNull(shape5);
        org.junit.Assert.assertNotNull(container6);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.Event event9 = null;
        boolean boolean11 = signIn5.keyDown(event9, (int) '4');
        java.awt.Color color12 = signIn5.getBackground();
        signIn0.setBackground(color12);
        java.awt.dnd.DropTarget dropTarget14 = null;
        signIn0.setDropTarget(dropTarget14);
        Home home16 = new Home();
        javax.swing.JLabel jLabel17 = null;
        home16.taskEndLabel = jLabel17;
        Home home19 = new Home();
        javax.swing.JLabel jLabel20 = home19.taskStartLabel;
        home16.taskTypeLabel = jLabel20;
        java.awt.Point point22 = home16.getLocation();
        java.awt.Component component23 = signIn0.findComponentAt(point22);
        Home home24 = new Home();
        javax.swing.JScrollPane jScrollPane25 = null;
        home24.scrollPane = jScrollPane25;
        javax.swing.JPanel jPanel27 = home24.panel;
        boolean boolean28 = home24.isOpaque();
        home24.clearAllInput();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray30 = home24.getHierarchyBoundsListeners();
        javax.swing.JComboBox jComboBox31 = home24.priorityDropdown;
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.Container container36 = signIn32.getParent();
        SignIn signIn37 = new SignIn();
        java.awt.Event event38 = null;
        boolean boolean41 = signIn37.mouseDrag(event38, 10, (int) (byte) -1);
        boolean boolean42 = signIn37.isForegroundSet();
        java.awt.Dimension dimension43 = signIn37.preferredSize();
        signIn32.setMinimumSize(dimension43);
        boolean boolean45 = signIn32.isAlwaysOnTopSupported();
        java.awt.image.ImageProducer imageProducer46 = null;
        java.awt.Image image47 = signIn32.createImage(imageProducer46);
        boolean boolean53 = jComboBox31.imageUpdate(image47, 10, (int) (short) 0, 100, 6, (int) (short) -1);
        SignIn signIn54 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener55 = null;
        signIn54.removeInputMethodListener(inputMethodListener55);
        boolean boolean57 = signIn54.isDisplayable();
        java.awt.LayoutManager layoutManager58 = signIn54.getLayout();
        signIn54.setIgnoreRepaint(true);
        SignIn signIn61 = new SignIn();
        java.awt.Event event62 = null;
        boolean boolean65 = signIn61.mouseDrag(event62, 10, (int) (byte) -1);
        boolean boolean66 = signIn61.isForegroundSet();
        java.awt.Window window67 = signIn61.getOwner();
        boolean boolean68 = signIn54.isFocusCycleRoot((java.awt.Container) signIn61);
        signIn54.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType71 = signIn54.getModalExclusionType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = signIn0.prepareImage(image47, (java.awt.image.ImageObserver) signIn54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.image.ImageProducer.startProduction(java.awt.image.ImageConsumer)\" because the return value of \"sun.awt.image.ToolkitImage.getSource()\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertNotNull(point22);
        org.junit.Assert.assertNull(component23);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray30);
        org.junit.Assert.assertNotNull(jComboBox31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(container36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dimension43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(image47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(layoutManager58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(window67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType71 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType71.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField4 = signIn0.textPassword;
        java.awt.LayoutManager layoutManager5 = jPasswordField4.getLayout();
        java.awt.Image image6 = null;
        SignIn signIn9 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        signIn9.removeInputMethodListener(inputMethodListener10);
        boolean boolean12 = signIn9.isDisplayable();
        java.awt.event.FocusEvent.Cause cause13 = null;
        boolean boolean14 = signIn9.requestFocusInWindow(cause13);
        javax.swing.JRootPane jRootPane15 = signIn9.getRootPane();
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        signIn9.removeHierarchyListener(hierarchyListener16);
        int int18 = jPasswordField4.checkImage(image6, 32, (int) (short) 1, (java.awt.image.ImageObserver) signIn9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jPasswordField4);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jRootPane15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = signIn0.getGraphicsConfiguration();
        java.awt.Font font3 = signIn0.getFont();
        javax.swing.JTextField jTextField4 = signIn0.textUsername;
        java.awt.Graphics graphics5 = null;
        jTextField4.paintAll(graphics5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration2);
        org.junit.Assert.assertNull(font3);
        org.junit.Assert.assertNotNull(jTextField4);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        java.awt.dnd.DropTarget dropTarget4 = null;
        home0.setDropTarget(dropTarget4);
        int int6 = home0.sel_task_id;
        java.awt.Rectangle rectangle7 = home0.bounds();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(rectangle7);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        javax.swing.JPanel jPanel2 = home0.panel;
        java.awt.Rectangle rectangle3 = home0.getBounds();
        SignUp signUp4 = new SignUp();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.LayoutManager layoutManager9 = signIn5.getLayout();
        signIn5.setIgnoreRepaint(true);
        SignIn signIn12 = new SignIn();
        java.awt.Event event13 = null;
        boolean boolean16 = signIn12.mouseDrag(event13, 10, (int) (byte) -1);
        boolean boolean17 = signIn12.isForegroundSet();
        java.awt.Window window18 = signIn12.getOwner();
        boolean boolean19 = signIn5.isFocusCycleRoot((java.awt.Container) signIn12);
        boolean boolean20 = signIn12.isPreferredSizeSet();
        signUp4.signIn = signIn12;
        javax.swing.JTextField jTextField22 = signUp4.textUsername;
        signUp4.setTitle("User Signup");
        javax.swing.JButton jButton25 = signUp4.buttonCancel;
        home0.profileBtn = jButton25;
        // The following exception was thrown during execution in test generation
        try {
            int int29 = jButton25.getBaseline(3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width and height must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel2);
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(window18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertNotNull(jButton25);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        boolean boolean15 = signIn7.isPreferredSizeSet();
        java.awt.Color color16 = signIn7.getForeground();
        java.awt.Insets insets17 = signIn7.insets();
        SignIn signIn18 = new SignIn();
        int int19 = signIn18.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration20 = signIn18.getGraphicsConfiguration();
        java.awt.Font font21 = signIn18.getFont();
        javax.swing.JTextField jTextField22 = signIn18.textUsername;
        SignIn signIn23 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        signIn23.removeInputMethodListener(inputMethodListener24);
        boolean boolean26 = signIn23.isDisplayable();
        java.awt.Container container27 = signIn23.getParent();
        SignIn signIn28 = new SignIn();
        java.awt.Event event29 = null;
        boolean boolean32 = signIn28.mouseDrag(event29, 10, (int) (byte) -1);
        boolean boolean33 = signIn28.isForegroundSet();
        java.awt.Dimension dimension34 = signIn28.preferredSize();
        signIn23.setMinimumSize(dimension34);
        java.awt.event.HierarchyListener hierarchyListener36 = null;
        signIn23.addHierarchyListener(hierarchyListener36);
        signIn23.show();
        signIn23.invalidate();
        java.awt.Point point40 = signIn23.getLocation();
        java.awt.Component component41 = signIn18.getComponentAt(point40);
        java.awt.Component component42 = signIn7.findComponentAt(point40);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(color16);
        org.junit.Assert.assertNotNull(insets17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration20);
        org.junit.Assert.assertNull(font21);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(container27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertNotNull(point40);
        org.junit.Assert.assertNotNull(component41);
        org.junit.Assert.assertNull(component42);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        com.toedter.calendar.JDateChooser jDateChooser4 = home0.stDate;
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JButton jButton8 = home5.updateJob;
        java.awt.im.InputMethodRequests inputMethodRequests9 = home5.getInputMethodRequests();
        SignUp signUp10 = new SignUp();
        javax.swing.JPasswordField jPasswordField11 = signUp10.textPassword;
        boolean boolean12 = jPasswordField11.getIgnoreRepaint();
        home5.taskNameField = jPasswordField11;
        java.awt.Event event14 = null;
        SignUp signUp15 = new SignUp();
        SignIn signIn16 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        signIn16.removeInputMethodListener(inputMethodListener17);
        boolean boolean19 = signIn16.isDisplayable();
        java.awt.LayoutManager layoutManager20 = signIn16.getLayout();
        signIn16.setIgnoreRepaint(true);
        SignIn signIn23 = new SignIn();
        java.awt.Event event24 = null;
        boolean boolean27 = signIn23.mouseDrag(event24, 10, (int) (byte) -1);
        boolean boolean28 = signIn23.isForegroundSet();
        java.awt.Window window29 = signIn23.getOwner();
        boolean boolean30 = signIn16.isFocusCycleRoot((java.awt.Container) signIn23);
        boolean boolean31 = signIn23.isPreferredSizeSet();
        signUp15.signIn = signIn23;
        javax.swing.JTextField jTextField33 = signUp15.textUsername;
        signUp15.setTitle("User Signup");
        javax.swing.JButton jButton36 = signUp15.buttonCancel;
        java.awt.Event event37 = null;
        SignIn signIn38 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener39 = null;
        signIn38.removeInputMethodListener(inputMethodListener39);
        boolean boolean41 = signIn38.isDisplayable();
        java.awt.event.FocusEvent.Cause cause42 = null;
        boolean boolean43 = signIn38.requestFocusInWindow(cause42);
        javax.swing.JRootPane jRootPane44 = signIn38.getRootPane();
        java.awt.event.HierarchyListener hierarchyListener45 = null;
        signIn38.removeHierarchyListener(hierarchyListener45);
        boolean boolean47 = signIn38.isFocused();
        boolean boolean48 = signUp15.lostFocus(event37, (java.lang.Object) signIn38);
        boolean boolean49 = jPasswordField11.action(event14, (java.lang.Object) event37);
        java.awt.dnd.DropTarget dropTarget50 = jPasswordField11.getDropTarget();
        home0.setDropTarget(dropTarget50);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertNotNull(jDateChooser4);
        org.junit.Assert.assertNotNull(jButton8);
        org.junit.Assert.assertNull(inputMethodRequests9);
        org.junit.Assert.assertNotNull(jPasswordField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(layoutManager20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(window29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jTextField33);
        org.junit.Assert.assertNotNull(jButton36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jRootPane44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dropTarget50);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        java.awt.Dimension dimension17 = signIn9.minimumSize();
        java.awt.Insets insets18 = signIn9.insets();
        signUp0.signIn = signIn9;
        boolean boolean20 = signIn9.isAutoRequestFocus();
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Event event4 = null;
        boolean boolean6 = signIn0.keyDown(event4, (int) '4');
        java.awt.Color color7 = signIn0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = signIn0.getAccessibleContext();
        Home home9 = new Home();
        javax.swing.JScrollPane jScrollPane10 = null;
        home9.scrollPane = jScrollPane10;
        javax.swing.JPanel jPanel12 = home9.panel;
        SignIn signIn13 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        signIn13.removeInputMethodListener(inputMethodListener14);
        boolean boolean16 = signIn13.isDisplayable();
        java.awt.LayoutManager layoutManager17 = signIn13.getLayout();
        signIn13.setIgnoreRepaint(true);
        java.awt.Component component20 = signIn13.getGlassPane();
        int int21 = jPanel12.getComponentZOrder((java.awt.Component) signIn13);
        java.awt.Font font22 = jPanel12.getFont();
        signIn0.setFont(font22);
        javax.swing.JMenuBar jMenuBar24 = signIn0.getJMenuBar();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(layoutManager17);
        org.junit.Assert.assertNotNull(component20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(font22);
        org.junit.Assert.assertNull(jMenuBar24);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        java.awt.event.WindowFocusListener[] windowFocusListenerArray17 = signIn0.getWindowFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(windowFocusListenerArray17);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        signIn0.repaint((int) '#', 9, (-1), (int) (short) 0);
        java.awt.FocusTraversalPolicy focusTraversalPolicy11 = signIn0.getFocusTraversalPolicy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.event.FocusEvent.Cause cause22 = null;
        boolean boolean23 = signIn18.requestFocusInWindow(cause22);
        javax.swing.JRootPane jRootPane24 = signIn18.getRootPane();
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.LayoutManager layoutManager29 = signIn25.getLayout();
        signIn25.setIgnoreRepaint(true);
        SignIn signIn32 = new SignIn();
        java.awt.Event event33 = null;
        boolean boolean36 = signIn32.mouseDrag(event33, 10, (int) (byte) -1);
        boolean boolean37 = signIn32.isForegroundSet();
        java.awt.Window window38 = signIn32.getOwner();
        boolean boolean39 = signIn25.isFocusCycleRoot((java.awt.Container) signIn32);
        signIn25.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType42 = signIn25.getModalExclusionType();
        signIn18.setModalExclusionType(modalExclusionType42);
        boolean boolean44 = signIn18.isFocusTraversalPolicySet();
        signUp0.signIn = signIn18;
        java.awt.Rectangle rectangle46 = signIn18.getMaximizedBounds();
        java.awt.event.FocusListener focusListener47 = null;
        signIn18.removeFocusListener(focusListener47);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jRootPane24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(layoutManager29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(window38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType42 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType42.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(rectangle46);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JLabel jLabel5 = home0.taskTypeLabel;
        int int6 = home0.sel_task_id;
        java.util.Date date8 = home0.stringToDate("SignIn[frame12,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(date8);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        java.awt.dnd.DropTarget dropTarget4 = null;
        home0.setDropTarget(dropTarget4);
        home0.deleteJob();
        Home home7 = new Home();
        javax.swing.JLabel jLabel8 = home7.taskDescLabel;
        home7.rsp = "hi!";
        javax.swing.JComboBox jComboBox11 = home7.statusDropdown;
        Home home12 = new Home();
        javax.swing.JScrollPane jScrollPane13 = null;
        home12.scrollPane = jScrollPane13;
        javax.swing.JPanel jPanel15 = home12.panel;
        javax.swing.JTextField jTextField16 = home12.taskStartField;
        java.lang.String str17 = home12.rsp;
        javax.swing.JComboBox jComboBox18 = home12.priorityDropdown;
        home7.scheduleDropdown = jComboBox18;
        Home home20 = new Home();
        javax.swing.JLabel jLabel21 = home20.taskStartLabel;
        Home home22 = new Home();
        javax.swing.JScrollPane jScrollPane23 = null;
        home22.scrollPane = jScrollPane23;
        javax.swing.JPanel jPanel25 = home22.panel;
        javax.swing.JTextField jTextField26 = home22.taskStartField;
        Home home27 = new Home();
        javax.swing.JScrollPane jScrollPane28 = null;
        home27.scrollPane = jScrollPane28;
        javax.swing.JButton jButton30 = home27.updateJob;
        home22.deleteJob = jButton30;
        home20.addJob = jButton30;
        javax.swing.JTable jTable33 = home20.table;
        home7.table = jTable33;
        home0.table = jTable33;
        java.awt.event.FocusEvent.Cause cause36 = null;
        jTable33.requestFocus(cause36);
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNull(jTextField16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jComboBox18);
        org.junit.Assert.assertNotNull(jLabel21);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertNotNull(jButton30);
        org.junit.Assert.assertNotNull(jTable33);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Window window6 = signIn0.getOwner();
        java.awt.event.WindowFocusListener windowFocusListener7 = null;
        signIn0.addWindowFocusListener(windowFocusListener7);
        java.awt.Event event9 = null;
        boolean boolean12 = signIn0.mouseMove(event9, (int) (short) 0, (int) '4');
        java.awt.Point point14 = signIn0.getMousePosition(false);
        signIn0.setLocationByPlatform(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(window6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(point14);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        int int2 = home0.sel_task_id;
        SignIn signIn3 = new SignIn();
        int int4 = signIn3.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = signIn3.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField7 = signIn3.textPassword;
        java.awt.LayoutManager layoutManager8 = jPasswordField7.getLayout();
        boolean boolean9 = jPasswordField7.isMaximumSizeSet();
        home0.taskTypeField = jPasswordField7;
        java.awt.event.MouseListener mouseListener11 = null;
        home0.removeMouseListener(mouseListener11);
        boolean boolean13 = home0.isFocusable();
        SignUp signUp14 = new SignUp();
        SignUp signUp15 = new SignUp();
        javax.swing.JPasswordField jPasswordField16 = signUp15.textPassword;
        signUp14.profileNameTextField = jPasswordField16;
        home0.taskStartField = jPasswordField16;
        javax.swing.JLabel jLabel19 = home0.lblScheduledBy;
        javax.swing.JTable jTable20 = null;
        home0.table = jTable20;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jPasswordField7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jPasswordField16);
        org.junit.Assert.assertNotNull(jLabel19);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.beans.PropertyChangeListener propertyChangeListener5 = null;
        signIn0.removePropertyChangeListener("", propertyChangeListener5);
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = signIn0.getFocusTraversalPolicy();
        SignIn signIn8 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener9 = null;
        signIn8.removeInputMethodListener(inputMethodListener9);
        boolean boolean11 = signIn8.isDisplayable();
        java.awt.Container container12 = signIn8.getParent();
        SignIn signIn13 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        signIn13.removeInputMethodListener(inputMethodListener14);
        boolean boolean16 = signIn13.isDisplayable();
        java.awt.Event event17 = null;
        boolean boolean19 = signIn13.keyDown(event17, (int) '4');
        java.awt.Color color20 = signIn13.getBackground();
        signIn8.setBackground(color20);
        java.awt.Component component24 = signIn8.getComponentAt(128, 100);
        java.awt.Event event25 = null;
        SignIn signIn26 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        signIn26.removeInputMethodListener(inputMethodListener27);
        boolean boolean29 = signIn26.isDisplayable();
        java.awt.LayoutManager layoutManager30 = signIn26.getLayout();
        signIn26.setIgnoreRepaint(true);
        SignIn signIn33 = new SignIn();
        java.awt.Event event34 = null;
        boolean boolean37 = signIn33.mouseDrag(event34, 10, (int) (byte) -1);
        boolean boolean38 = signIn33.isForegroundSet();
        java.awt.Window window39 = signIn33.getOwner();
        boolean boolean40 = signIn26.isFocusCycleRoot((java.awt.Container) signIn33);
        signIn26.repaint((long) (short) 1);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior43 = signIn26.getBaselineResizeBehavior();
        int int44 = signIn26.getHeight();
        boolean boolean45 = component24.gotFocus(event25, (java.lang.Object) signIn26);
        java.awt.Dimension dimension46 = signIn26.getPreferredSize();
        signIn0.setSize(dimension46);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(focusTraversalPolicy7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(container12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(color20);
        org.junit.Assert.assertNotNull(component24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(layoutManager30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(window39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior43 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior43.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 600 + "'", int44 == 600);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension46);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JTextField jTextField5 = home4.taskStartField;
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        home4.enDate = jDateChooser10;
        home4.revalidate();
        home4.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str17 = home4.user_id;
        javax.swing.JScrollPane jScrollPane18 = home4.scrollPane;
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        jScrollPane18.addMouseMotionListener(mouseMotionListener19);
        home0.scrollPane = jScrollPane18;
        home0.repaint((long) 1, (int) (byte) -1, 100, 0, 16);
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User Signup" + "'", str17, "User Signup");
        org.junit.Assert.assertNotNull(jScrollPane18);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        java.lang.String str15 = signIn7.getTitle();
        java.awt.Point point16 = signIn7.getMousePosition();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener17 = null;
        signIn7.removeHierarchyBoundsListener(hierarchyBoundsListener17);
        boolean boolean19 = signIn7.isFocusable();
        java.awt.event.WindowFocusListener windowFocusListener20 = null;
        signIn7.addWindowFocusListener(windowFocusListener20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "User Signup" + "'", str15, "User Signup");
        org.junit.Assert.assertNull(point16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.ImageCapabilities imageCapabilities8 = null;
        java.awt.image.VolatileImage volatileImage9 = signIn0.createVolatileImage((int) '4', 0, imageCapabilities8);
        SignIn signIn10 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        signIn10.removeInputMethodListener(inputMethodListener11);
        SignIn signIn13 = new SignIn();
        java.awt.Event event14 = null;
        boolean boolean17 = signIn13.mouseDrag(event14, 10, (int) (byte) -1);
        boolean boolean18 = signIn13.isForegroundSet();
        java.awt.Dimension dimension19 = signIn13.preferredSize();
        signIn10.setMinimumSize(dimension19);
        signIn0.setMaximumSize(dimension19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(volatileImage9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        javax.swing.JPanel jPanel2 = home0.panel;
        java.awt.Rectangle rectangle3 = home0.getBounds();
        home0.sel_task_id = 4;
        UserProfile userProfile6 = home0.userProfile;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel2);
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertNull(userProfile6);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.Point point3 = signIn0.getMousePosition();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        signIn0.removeWindowFocusListener(windowFocusListener4);
        java.awt.Graphics graphics6 = null;
        signIn0.print(graphics6);
        SignUp signUp8 = new SignUp();
        SignIn signIn9 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        signIn9.removeInputMethodListener(inputMethodListener10);
        boolean boolean12 = signIn9.isDisplayable();
        java.awt.LayoutManager layoutManager13 = signIn9.getLayout();
        signIn9.setIgnoreRepaint(true);
        SignIn signIn16 = new SignIn();
        java.awt.Event event17 = null;
        boolean boolean20 = signIn16.mouseDrag(event17, 10, (int) (byte) -1);
        boolean boolean21 = signIn16.isForegroundSet();
        java.awt.Window window22 = signIn16.getOwner();
        boolean boolean23 = signIn9.isFocusCycleRoot((java.awt.Container) signIn16);
        boolean boolean24 = signIn16.isPreferredSizeSet();
        signUp8.signIn = signIn16;
        java.awt.event.ComponentListener componentListener26 = null;
        signUp8.removeComponentListener(componentListener26);
        signUp8.transferFocus();
        // The following exception was thrown during execution in test generation
        try {
            signIn0.setComponentZOrder((java.awt.Component) signUp8, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(layoutManager13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(window22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = signIn0.getGraphicsConfiguration();
        java.awt.Font font3 = signIn0.getFont();
        java.awt.image.BufferStrategy bufferStrategy4 = signIn0.getBufferStrategy();
        java.awt.Event event5 = null;
        SignIn signIn6 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        signIn6.removeInputMethodListener(inputMethodListener7);
        boolean boolean9 = signIn6.isDisplayable();
        java.awt.LayoutManager layoutManager10 = signIn6.getLayout();
        signIn6.setIgnoreRepaint(true);
        SignIn signIn13 = new SignIn();
        java.awt.Event event14 = null;
        boolean boolean17 = signIn13.mouseDrag(event14, 10, (int) (byte) -1);
        boolean boolean18 = signIn13.isForegroundSet();
        java.awt.Window window19 = signIn13.getOwner();
        boolean boolean20 = signIn6.isFocusCycleRoot((java.awt.Container) signIn13);
        signIn6.repaint((long) (short) 1);
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        signIn6.addHierarchyListener(hierarchyListener23);
        boolean boolean25 = signIn0.lostFocus(event5, (java.lang.Object) signIn6);
        signIn6.setVisible(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration2);
        org.junit.Assert.assertNull(font3);
        org.junit.Assert.assertNull(bufferStrategy4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(layoutManager10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(window19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        javax.swing.JTextField jTextField4 = userProfile0.nameTextField;
        userProfile0.updateProfileInfo();
        userProfile0.updateProfilePassword();
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertNotNull(jTextField4);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        javax.swing.JTextField jTextField4 = home0.taskStartField;
        java.lang.String str5 = home0.rsp;
        java.awt.Insets insets6 = home0.insets();
        home0.clearAllInput();
        Home home8 = new Home();
        javax.swing.JLabel jLabel9 = home8.taskStartLabel;
        Home home10 = new Home();
        javax.swing.JScrollPane jScrollPane11 = null;
        home10.scrollPane = jScrollPane11;
        javax.swing.JPanel jPanel13 = home10.panel;
        javax.swing.JTextField jTextField14 = home10.taskStartField;
        Home home15 = new Home();
        javax.swing.JScrollPane jScrollPane16 = null;
        home15.scrollPane = jScrollPane16;
        javax.swing.JButton jButton18 = home15.updateJob;
        home10.deleteJob = jButton18;
        home8.addJob = jButton18;
        Home home21 = new Home();
        javax.swing.JLabel jLabel22 = home21.taskDescLabel;
        home21.rsp = "hi!";
        javax.swing.JComboBox jComboBox25 = home21.statusDropdown;
        Home home26 = new Home();
        javax.swing.JTextField jTextField27 = home26.taskStartField;
        boolean boolean28 = home26.isOpaque();
        javax.swing.JTable jTable29 = home26.table;
        boolean boolean30 = jTable29.getIgnoreRepaint();
        jTable29.firePropertyChange("hi!", (float) 10, (float) 610);
        home21.table = jTable29;
        javax.swing.JButton jButton36 = home21.profileBtn;
        javax.swing.JComboBox jComboBox37 = home21.statusDropdown;
        home8.statusDropdown = jComboBox37;
        home0.scheduleDropdown = jComboBox37;
        int int40 = jComboBox37.getHeight();
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertNull(jTextField4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(insets6);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jPanel13);
        org.junit.Assert.assertNull(jTextField14);
        org.junit.Assert.assertNotNull(jButton18);
        org.junit.Assert.assertNotNull(jLabel22);
        org.junit.Assert.assertNotNull(jComboBox25);
        org.junit.Assert.assertNull(jTextField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(jTable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jButton36);
        org.junit.Assert.assertNotNull(jComboBox37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 40 + "'", int40 == 40);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        boolean boolean7 = signIn0.isFontSet();
        signIn0.firePropertyChange("", ' ', 'a');
        signIn0.firePropertyChange("hi!", (short) (byte) 0, (short) 1);
        SignIn signIn16 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener17 = null;
        signIn16.removeInputMethodListener(inputMethodListener17);
        boolean boolean19 = signIn16.isDisplayable();
        java.awt.Container container20 = signIn16.getParent();
        SignIn signIn21 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener22 = null;
        signIn21.removeInputMethodListener(inputMethodListener22);
        boolean boolean24 = signIn21.isDisplayable();
        java.awt.Event event25 = null;
        boolean boolean27 = signIn21.keyDown(event25, (int) '4');
        java.awt.Color color28 = signIn21.getBackground();
        signIn16.setBackground(color28);
        java.awt.dnd.DropTarget dropTarget30 = null;
        signIn16.setDropTarget(dropTarget30);
        Home home32 = new Home();
        javax.swing.JLabel jLabel33 = null;
        home32.taskEndLabel = jLabel33;
        Home home35 = new Home();
        javax.swing.JLabel jLabel36 = home35.taskStartLabel;
        home32.taskTypeLabel = jLabel36;
        java.awt.Point point38 = home32.getLocation();
        java.awt.Component component39 = signIn16.findComponentAt(point38);
        java.awt.Cursor cursor40 = signIn16.getCursor();
        java.awt.FocusTraversalPolicy focusTraversalPolicy41 = signIn16.getFocusTraversalPolicy();
        signIn0.setFocusTraversalPolicy(focusTraversalPolicy41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(container20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertNotNull(jLabel36);
        org.junit.Assert.assertNotNull(point38);
        org.junit.Assert.assertNull(component39);
        org.junit.Assert.assertNotNull(cursor40);
        org.junit.Assert.assertNotNull(focusTraversalPolicy41);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.setFocusTraversalKeysEnabled(true);
        java.awt.event.WindowListener[] windowListenerArray7 = home0.getWindowListeners();
        home0.removeNotify();
        home0.setLocation(212, (int) ' ');
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(windowListenerArray7);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Event event6 = null;
        SignIn signIn7 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener8 = null;
        signIn7.removeInputMethodListener(inputMethodListener8);
        boolean boolean10 = signIn7.isDisplayable();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = signIn7.requestFocusInWindow(cause11);
        java.awt.Window window13 = signIn7.getOwner();
        javax.swing.TransferHandler transferHandler14 = signIn7.getTransferHandler();
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        signIn7.removeInputMethodListener(inputMethodListener15);
        boolean boolean17 = signIn0.gotFocus(event6, (java.lang.Object) signIn7);
        java.awt.event.MouseListener mouseListener18 = null;
        signIn0.removeMouseListener(mouseListener18);
        java.awt.Dimension dimension20 = signIn0.getSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertNull(transferHandler14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dimension20);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        SignUp signUp4 = new SignUp();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.LayoutManager layoutManager9 = signIn5.getLayout();
        signIn5.setIgnoreRepaint(true);
        SignIn signIn12 = new SignIn();
        java.awt.Event event13 = null;
        boolean boolean16 = signIn12.mouseDrag(event13, 10, (int) (byte) -1);
        boolean boolean17 = signIn12.isForegroundSet();
        java.awt.Window window18 = signIn12.getOwner();
        boolean boolean19 = signIn5.isFocusCycleRoot((java.awt.Container) signIn12);
        boolean boolean20 = signIn12.isPreferredSizeSet();
        signUp4.signIn = signIn12;
        javax.swing.JTextField jTextField22 = signUp4.textUsername;
        SignIn signIn23 = new SignIn();
        int int24 = signIn23.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray26 = signIn23.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField27 = signIn23.textPassword;
        signUp4.textUsername = jPasswordField27;
        SignIn signIn29 = null;
        signUp4.signIn = signIn29;
        SignUp signUp31 = new SignUp();
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn32.setIgnoreRepaint(true);
        SignIn signIn39 = new SignIn();
        java.awt.Event event40 = null;
        boolean boolean43 = signIn39.mouseDrag(event40, 10, (int) (byte) -1);
        boolean boolean44 = signIn39.isForegroundSet();
        java.awt.Window window45 = signIn39.getOwner();
        boolean boolean46 = signIn32.isFocusCycleRoot((java.awt.Container) signIn39);
        boolean boolean47 = signIn39.isPreferredSizeSet();
        signUp31.signIn = signIn39;
        javax.swing.JTextField jTextField49 = signUp31.textUsername;
        SignIn signIn50 = new SignIn();
        int int51 = signIn50.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray53 = signIn50.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField54 = signIn50.textPassword;
        signUp31.textUsername = jPasswordField54;
        jPasswordField54.repaint();
        signUp4.textUsername = jPasswordField54;
        userProfile0.nameTextField = jPasswordField54;
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(window18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray26);
        org.junit.Assert.assertNotNull(jPasswordField27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(window45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jTextField49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray53);
        org.junit.Assert.assertNotNull(jPasswordField54);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        SignUp signUp0 = new SignUp();
        javax.swing.JButton jButton1 = signUp0.buttonSignup;
        java.awt.Shape shape2 = null;
        signUp0.setMixingCutoutShape(shape2);
        java.awt.Insets insets4 = signUp0.getInsets();
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        jDateChooser10.list();
        signUp0.removePropertyChangeListener("bc0fe9478b455315f655a08ce5916052913cc6cb0f23cd3b51f1e3479fac4512", (java.beans.PropertyChangeListener) jDateChooser10);
        org.junit.Assert.assertNotNull(jButton1);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JButton jButton3 = home0.profileBtn;
        java.awt.event.ContainerListener containerListener4 = null;
        home0.addContainerListener(containerListener4);
        home0.transferFocusDownCycle();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jButton3);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskStartLabel;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        javax.swing.JTextField jTextField6 = home2.taskStartField;
        Home home7 = new Home();
        javax.swing.JScrollPane jScrollPane8 = null;
        home7.scrollPane = jScrollPane8;
        javax.swing.JButton jButton10 = home7.updateJob;
        home2.deleteJob = jButton10;
        home0.addJob = jButton10;
        javax.swing.JTable jTable13 = home0.table;
        java.awt.Graphics graphics14 = null;
        home0.printComponents(graphics14);
        java.lang.String str16 = home0.getName();
        home0.sel_task_id = 32;
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNull(jTextField6);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(jTable13);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "frame14" + "'", str16, "frame14");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JPanel jPanel8 = home5.panel;
        javax.swing.JTextField jTextField9 = home5.taskStartField;
        java.lang.String str10 = home5.rsp;
        javax.swing.JComboBox jComboBox11 = home5.priorityDropdown;
        home0.scheduleDropdown = jComboBox11;
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = home13.taskStartLabel;
        Home home15 = new Home();
        javax.swing.JScrollPane jScrollPane16 = null;
        home15.scrollPane = jScrollPane16;
        javax.swing.JPanel jPanel18 = home15.panel;
        javax.swing.JTextField jTextField19 = home15.taskStartField;
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JButton jButton23 = home20.updateJob;
        home15.deleteJob = jButton23;
        home13.addJob = jButton23;
        javax.swing.JTable jTable26 = home13.table;
        home0.table = jTable26;
        boolean boolean28 = home0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertNull(jTextField9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(jLabel14);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNull(jTextField19);
        org.junit.Assert.assertNotNull(jButton23);
        org.junit.Assert.assertNotNull(jTable26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskStartLabel;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        javax.swing.JTextField jTextField6 = home2.taskStartField;
        Home home7 = new Home();
        javax.swing.JScrollPane jScrollPane8 = null;
        home7.scrollPane = jScrollPane8;
        javax.swing.JButton jButton10 = home7.updateJob;
        home2.deleteJob = jButton10;
        home0.addJob = jButton10;
        javax.swing.JTable jTable13 = home0.table;
        java.util.Date date14 = null;
        java.lang.String str15 = home0.dateToString(date14);
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNull(jTextField6);
        org.junit.Assert.assertNotNull(jButton10);
        org.junit.Assert.assertNotNull(jTable13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JLabel jLabel5 = home0.taskTypeLabel;
        boolean boolean6 = home0.isResizable();
        org.junit.Assert.assertNotNull(jLabel5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Window window6 = signIn0.getOwner();
        java.awt.event.WindowFocusListener windowFocusListener7 = null;
        signIn0.addWindowFocusListener(windowFocusListener7);
        java.util.List<java.awt.Image> imageList9 = signIn0.getIconImages();
        SignIn signIn10 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        signIn10.removeInputMethodListener(inputMethodListener11);
        boolean boolean13 = signIn10.isDisplayable();
        java.awt.Container container14 = signIn10.getParent();
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.Event event19 = null;
        boolean boolean21 = signIn15.keyDown(event19, (int) '4');
        java.awt.Color color22 = signIn15.getBackground();
        signIn10.setBackground(color22);
        signIn0.setForeground(color22);
        SignIn signIn25 = new SignIn();
        float float26 = signIn25.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray27 = signIn25.getPropertyChangeListeners();
        SignIn signIn28 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener29 = null;
        signIn28.removeInputMethodListener(inputMethodListener29);
        boolean boolean31 = signIn28.isDisplayable();
        java.awt.LayoutManager layoutManager32 = signIn28.getLayout();
        signIn28.setIgnoreRepaint(true);
        SignIn signIn35 = new SignIn();
        java.awt.Event event36 = null;
        boolean boolean39 = signIn35.mouseDrag(event36, 10, (int) (byte) -1);
        boolean boolean40 = signIn35.isForegroundSet();
        java.awt.Window window41 = signIn35.getOwner();
        boolean boolean42 = signIn28.isFocusCycleRoot((java.awt.Container) signIn35);
        signIn28.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType45 = signIn28.getModalExclusionType();
        signIn25.setModalExclusionType(modalExclusionType45);
        boolean boolean47 = signIn25.isMinimumSizeSet();
        int int48 = signIn0.getComponentZOrder((java.awt.Component) signIn25);
        java.awt.image.ColorModel colorModel49 = signIn0.getColorModel();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(window6);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(container14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(color22);
        org.junit.Assert.assertTrue("'" + float26 + "' != '" + 0.5f + "'", float26 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(layoutManager32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(window41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType45 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType45.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(colorModel49);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        SignIn signIn13 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener14 = null;
        signIn13.removeInputMethodListener(inputMethodListener14);
        boolean boolean16 = signIn13.isDisplayable();
        java.awt.LayoutManager layoutManager17 = signIn13.getLayout();
        signIn13.setIgnoreRepaint(true);
        SignIn signIn20 = new SignIn();
        java.awt.Event event21 = null;
        boolean boolean24 = signIn20.mouseDrag(event21, 10, (int) (byte) -1);
        boolean boolean25 = signIn20.isForegroundSet();
        java.awt.Window window26 = signIn20.getOwner();
        boolean boolean27 = signIn13.isFocusCycleRoot((java.awt.Container) signIn20);
        signIn13.repaint((long) (short) 1);
        SignIn signIn30 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener31 = null;
        signIn30.removeInputMethodListener(inputMethodListener31);
        boolean boolean33 = signIn30.isDisplayable();
        java.awt.Container container34 = signIn30.getParent();
        SignIn signIn35 = new SignIn();
        java.awt.Event event36 = null;
        boolean boolean39 = signIn35.mouseDrag(event36, 10, (int) (byte) -1);
        boolean boolean40 = signIn35.isForegroundSet();
        java.awt.Dimension dimension41 = signIn35.preferredSize();
        signIn30.setMinimumSize(dimension41);
        java.awt.event.HierarchyListener hierarchyListener43 = null;
        signIn30.addHierarchyListener(hierarchyListener43);
        SignIn signIn45 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener46 = null;
        signIn45.removeInputMethodListener(inputMethodListener46);
        boolean boolean48 = signIn45.isDisplayable();
        java.awt.LayoutManager layoutManager49 = signIn45.getLayout();
        signIn30.setLayout(layoutManager49);
        java.awt.Rectangle rectangle51 = signIn30.getMaximizedBounds();
        boolean boolean52 = signIn13.isFocusCycleRoot((java.awt.Container) signIn30);
        boolean boolean53 = signIn13.isBackgroundSet();
        signIn13.resize((int) (byte) 100, (int) 'a');
        boolean boolean59 = signIn13.contains((int) (short) 100, (int) '#');
        signIn13.hide();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component62 = signIn0.add((java.awt.Component) signIn13, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(layoutManager17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(window26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(container34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dimension41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(layoutManager49);
        org.junit.Assert.assertNull(rectangle51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        boolean boolean8 = home0.isShowing();
        javax.swing.JLabel jLabel9 = home0.taskEndLabel;
        Home home10 = new Home();
        javax.swing.JLabel jLabel11 = home10.taskDescLabel;
        int int12 = home10.sel_task_id;
        javax.swing.JComboBox jComboBox13 = home10.priorityDropdown;
        Home home14 = new Home();
        javax.swing.JScrollPane jScrollPane15 = null;
        home14.scrollPane = jScrollPane15;
        javax.swing.JPanel jPanel17 = home14.panel;
        javax.swing.JTextField jTextField18 = home14.taskStartField;
        java.lang.String str19 = home14.rsp;
        javax.swing.JComboBox jComboBox20 = home14.priorityDropdown;
        home10.scheduleDropdown = jComboBox20;
        home0.scheduleDropdown = jComboBox20;
        javax.swing.JComboBox jComboBox23 = home0.scheduleDropdown;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jLabel11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(jComboBox13);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNull(jTextField18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(jComboBox20);
        org.junit.Assert.assertNotNull(jComboBox23);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.image.ImageProducer imageProducer3 = null;
        java.awt.Image image4 = signIn0.createImage(imageProducer3);
        java.awt.event.MouseListener mouseListener5 = null;
        signIn0.removeMouseListener(mouseListener5);
        Home home8 = new Home();
        javax.swing.JLabel jLabel9 = home8.taskDescLabel;
        home8.rsp = "hi!";
        javax.swing.JComboBox jComboBox12 = home8.statusDropdown;
        Home home13 = new Home();
        javax.swing.JTextField jTextField14 = home13.taskStartField;
        boolean boolean15 = home13.isOpaque();
        javax.swing.JTable jTable16 = home13.table;
        boolean boolean17 = jTable16.getIgnoreRepaint();
        jTable16.firePropertyChange("hi!", (float) 10, (float) 610);
        home8.table = jTable16;
        Home home23 = new Home();
        javax.swing.JScrollPane jScrollPane24 = null;
        home23.scrollPane = jScrollPane24;
        javax.swing.JPanel jPanel26 = home23.panel;
        com.toedter.calendar.JDateChooser jDateChooser27 = home23.stDate;
        jDateChooser27.list();
        home8.enDate = jDateChooser27;
        signIn0.addPropertyChangeListener("hi!", (java.beans.PropertyChangeListener) jDateChooser27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNotNull(image4);
        org.junit.Assert.assertNotNull(jLabel9);
        org.junit.Assert.assertNotNull(jComboBox12);
        org.junit.Assert.assertNull(jTextField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jTable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jDateChooser27);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        userProfile0.updateProfilePassword();
        java.lang.String str5 = userProfile0.respN;
        java.awt.image.ColorModel colorModel6 = userProfile0.getColorModel();
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Please enter your old and new password" + "'", str5, "Please enter your old and new password");
        org.junit.Assert.assertNotNull(colorModel6);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        javax.swing.TransferHandler transferHandler21 = signUp0.getTransferHandler();
        Home home22 = new Home();
        javax.swing.JLabel jLabel23 = home22.taskDescLabel;
        home22.rsp = "hi!";
        javax.swing.JComboBox jComboBox26 = home22.statusDropdown;
        Home home27 = new Home();
        javax.swing.JLabel jLabel28 = home27.taskDescLabel;
        home22.taskStartLabel = jLabel28;
        javax.swing.JLabel jLabel30 = home22.taskStartLabel;
        signUp0.setContentPane((java.awt.Container) jLabel30);
        java.awt.ImageCapabilities imageCapabilities34 = null;
        java.awt.image.VolatileImage volatileImage35 = signUp0.createVolatileImage((int) (byte) 1, (int) (byte) 10, imageCapabilities34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertNotNull(jLabel23);
        org.junit.Assert.assertNotNull(jComboBox26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jLabel30);
        org.junit.Assert.assertNull(volatileImage35);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.clearAllInput();
        java.awt.dnd.DropTarget dropTarget6 = null;
        home0.setDropTarget(dropTarget6);
        SignUp signUp8 = new SignUp();
        SignIn signIn9 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        signIn9.removeInputMethodListener(inputMethodListener10);
        boolean boolean12 = signIn9.isDisplayable();
        java.awt.LayoutManager layoutManager13 = signIn9.getLayout();
        signIn9.setIgnoreRepaint(true);
        SignIn signIn16 = new SignIn();
        java.awt.Event event17 = null;
        boolean boolean20 = signIn16.mouseDrag(event17, 10, (int) (byte) -1);
        boolean boolean21 = signIn16.isForegroundSet();
        java.awt.Window window22 = signIn16.getOwner();
        boolean boolean23 = signIn9.isFocusCycleRoot((java.awt.Container) signIn16);
        boolean boolean24 = signIn16.isPreferredSizeSet();
        signUp8.signIn = signIn16;
        javax.swing.JTextField jTextField26 = signUp8.textUsername;
        SignIn signIn27 = new SignIn();
        int int28 = signIn27.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray30 = signIn27.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField31 = signIn27.textPassword;
        signUp8.textUsername = jPasswordField31;
        Home home33 = new Home();
        javax.swing.JTextField jTextField34 = home33.taskStartField;
        Home home35 = new Home();
        javax.swing.JScrollPane jScrollPane36 = null;
        home35.scrollPane = jScrollPane36;
        javax.swing.JPanel jPanel38 = home35.panel;
        com.toedter.calendar.JDateChooser jDateChooser39 = home35.stDate;
        home33.enDate = jDateChooser39;
        signUp8.addPropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser39);
        home0.stDate = jDateChooser39;
        java.awt.event.MouseListener mouseListener43 = null;
        jDateChooser39.removeMouseListener(mouseListener43);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(layoutManager13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(window22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jTextField26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray30);
        org.junit.Assert.assertNotNull(jPasswordField31);
        org.junit.Assert.assertNull(jTextField34);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jDateChooser39);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        SignUp signUp3 = new SignUp();
        SignUp signUp4 = new SignUp();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.LayoutManager layoutManager9 = signIn5.getLayout();
        signIn5.setIgnoreRepaint(true);
        SignIn signIn12 = new SignIn();
        java.awt.Event event13 = null;
        boolean boolean16 = signIn12.mouseDrag(event13, 10, (int) (byte) -1);
        boolean boolean17 = signIn12.isForegroundSet();
        java.awt.Window window18 = signIn12.getOwner();
        boolean boolean19 = signIn5.isFocusCycleRoot((java.awt.Container) signIn12);
        boolean boolean20 = signIn12.isPreferredSizeSet();
        signUp4.signIn = signIn12;
        javax.swing.JTextField jTextField22 = signUp4.textUsername;
        signUp3.profileNameTextField = jTextField22;
        home0.taskEndField = jTextField22;
        java.awt.event.ComponentListener componentListener25 = null;
        home0.addComponentListener(componentListener25);
        boolean boolean27 = home0.isUndecorated();
        int int28 = home0.getDefaultCloseOperation();
        home0.pack();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(window18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isShowing();
        int int4 = signIn0.getHeight();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 600 + "'", int4 == 600);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        java.awt.Component component4 = userProfile0.locate(3, (int) (short) 10);
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertNotNull(component4);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JLabel jLabel6 = home5.taskDescLabel;
        home0.taskStartLabel = jLabel6;
        home0.refreshTable();
        javax.swing.JTextField jTextField9 = home0.taskEndField;
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNotNull(jLabel6);
        org.junit.Assert.assertNull(jTextField9);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        SignIn signIn0 = new SignIn();
        float float1 = signIn0.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = signIn0.getPropertyChangeListeners();
        SignIn signIn3 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        signIn3.removeInputMethodListener(inputMethodListener4);
        boolean boolean6 = signIn3.isDisplayable();
        java.awt.LayoutManager layoutManager7 = signIn3.getLayout();
        signIn3.setIgnoreRepaint(true);
        SignIn signIn10 = new SignIn();
        java.awt.Event event11 = null;
        boolean boolean14 = signIn10.mouseDrag(event11, 10, (int) (byte) -1);
        boolean boolean15 = signIn10.isForegroundSet();
        java.awt.Window window16 = signIn10.getOwner();
        boolean boolean17 = signIn3.isFocusCycleRoot((java.awt.Container) signIn10);
        signIn3.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType20 = signIn3.getModalExclusionType();
        signIn0.setModalExclusionType(modalExclusionType20);
        boolean boolean22 = signIn0.isMinimumSizeSet();
        java.awt.event.WindowFocusListener windowFocusListener23 = null;
        signIn0.removeWindowFocusListener(windowFocusListener23);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(window16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.awt.GraphicsConfiguration graphicsConfiguration2 = signIn0.getGraphicsConfiguration();
        java.awt.Font font3 = signIn0.getFont();
        signIn0.resize((int) (byte) -1, (int) (byte) 1);
        signIn0.doLayout();
        java.lang.Class<?> wildcardClass8 = signIn0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(graphicsConfiguration2);
        org.junit.Assert.assertNull(font3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = signIn6.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField10 = signIn6.textUsername;
        home0.taskStartField = jTextField10;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskStartLabel;
        home0.lblScheduledBy = jLabel13;
        java.awt.image.ImageProducer imageProducer15 = null;
        java.awt.Image image16 = home0.createImage(imageProducer15);
        SignUp signUp17 = new SignUp();
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.LayoutManager layoutManager22 = signIn18.getLayout();
        signIn18.setIgnoreRepaint(true);
        SignIn signIn25 = new SignIn();
        java.awt.Event event26 = null;
        boolean boolean29 = signIn25.mouseDrag(event26, 10, (int) (byte) -1);
        boolean boolean30 = signIn25.isForegroundSet();
        java.awt.Window window31 = signIn25.getOwner();
        boolean boolean32 = signIn18.isFocusCycleRoot((java.awt.Container) signIn25);
        boolean boolean33 = signIn25.isPreferredSizeSet();
        signUp17.signIn = signIn25;
        javax.swing.JTextField jTextField35 = signUp17.textUsername;
        boolean boolean36 = jTextField35.requestFocusInWindow();
        home0.taskNameField = jTextField35;
        javax.swing.JButton jButton38 = home0.profileBtn;
        home0.updateJob();
        SignUp signUp40 = new SignUp();
        SignIn signIn41 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener42 = null;
        signIn41.removeInputMethodListener(inputMethodListener42);
        boolean boolean44 = signIn41.isDisplayable();
        java.awt.LayoutManager layoutManager45 = signIn41.getLayout();
        signIn41.setIgnoreRepaint(true);
        SignIn signIn48 = new SignIn();
        java.awt.Event event49 = null;
        boolean boolean52 = signIn48.mouseDrag(event49, 10, (int) (byte) -1);
        boolean boolean53 = signIn48.isForegroundSet();
        java.awt.Window window54 = signIn48.getOwner();
        boolean boolean55 = signIn41.isFocusCycleRoot((java.awt.Container) signIn48);
        boolean boolean56 = signIn48.isPreferredSizeSet();
        signUp40.signIn = signIn48;
        javax.swing.JTextField jTextField58 = signUp40.textUsername;
        SignIn signIn59 = new SignIn();
        int int60 = signIn59.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray62 = signIn59.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField63 = signIn59.textPassword;
        signUp40.textUsername = jPasswordField63;
        Home home65 = new Home();
        javax.swing.JTextField jTextField66 = home65.taskStartField;
        Home home67 = new Home();
        javax.swing.JScrollPane jScrollPane68 = null;
        home67.scrollPane = jScrollPane68;
        javax.swing.JPanel jPanel70 = home67.panel;
        com.toedter.calendar.JDateChooser jDateChooser71 = home67.stDate;
        home65.enDate = jDateChooser71;
        signUp40.addPropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser71);
        home0.stDate = jDateChooser71;
        java.util.Date date75 = null;
        java.lang.String str76 = home0.dateToString(date75);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(image16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(window31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(jTextField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jButton38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(layoutManager45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(window54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jTextField58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray62);
        org.junit.Assert.assertNotNull(jPasswordField63);
        org.junit.Assert.assertNull(jTextField66);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(jDateChooser71);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        SignUp signUp0 = new SignUp();
        javax.swing.JButton jButton1 = signUp0.buttonSignup;
        javax.swing.JButton jButton2 = signUp0.buttonCancel;
        java.awt.FocusTraversalPolicy focusTraversalPolicy3 = signUp0.getFocusTraversalPolicy();
        signUp0.setFocusableWindowState(false);
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.util.List<java.awt.Image> imageList8 = signIn6.getIconImages();
        java.awt.image.ImageProducer imageProducer9 = null;
        java.awt.Image image10 = signIn6.createImage(imageProducer9);
        java.awt.event.MouseListener mouseListener11 = null;
        signIn6.removeMouseListener(mouseListener11);
        java.awt.event.WindowStateListener[] windowStateListenerArray13 = signIn6.getWindowStateListeners();
        SignIn signIn14 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        signIn14.removeInputMethodListener(inputMethodListener15);
        boolean boolean17 = signIn14.isDisplayable();
        java.awt.LayoutManager layoutManager18 = signIn14.getLayout();
        Home home19 = new Home();
        javax.swing.JScrollPane jScrollPane20 = null;
        home19.scrollPane = jScrollPane20;
        javax.swing.JPanel jPanel22 = home19.panel;
        boolean boolean23 = home19.isOpaque();
        javax.swing.JTextField jTextField24 = home19.taskStartField;
        SignIn signIn25 = new SignIn();
        int int26 = signIn25.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray28 = signIn25.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField29 = signIn25.textUsername;
        home19.taskStartField = jTextField29;
        Home home31 = new Home();
        javax.swing.JLabel jLabel32 = home31.taskStartLabel;
        home19.lblScheduledBy = jLabel32;
        java.awt.ComponentOrientation componentOrientation34 = home19.getComponentOrientation();
        signIn14.setComponentOrientation(componentOrientation34);
        signIn6.setComponentOrientation(componentOrientation34);
        SignIn signIn37 = new SignIn();
        int int38 = signIn37.getState();
        java.util.List<java.awt.Image> imageList39 = signIn37.getIconImages();
        java.awt.image.ImageProducer imageProducer40 = null;
        java.awt.Image image41 = signIn37.createImage(imageProducer40);
        java.awt.event.MouseListener mouseListener42 = null;
        signIn37.removeMouseListener(mouseListener42);
        java.awt.event.WindowStateListener[] windowStateListenerArray44 = signIn37.getWindowStateListeners();
        signIn37.enable(false);
        signIn37.revalidate();
        signIn37.firePropertyChange("User Signup", (-1L), (long) 'a');
        Home home52 = new Home();
        javax.swing.JLabel jLabel53 = null;
        home52.taskEndLabel = jLabel53;
        Home home55 = new Home();
        javax.swing.JLabel jLabel56 = home55.taskStartLabel;
        home52.taskTypeLabel = jLabel56;
        java.awt.Point point58 = home52.getLocation();
        java.awt.Component component59 = signIn37.findComponentAt(point58);
        java.awt.Component component60 = signIn6.findComponentAt(point58);
        java.awt.Component component61 = signUp0.findComponentAt(point58);
        org.junit.Assert.assertNotNull(jButton1);
        org.junit.Assert.assertNotNull(jButton2);
        org.junit.Assert.assertNotNull(focusTraversalPolicy3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(imageList8);
        org.junit.Assert.assertNotNull(image10);
        org.junit.Assert.assertNotNull(windowStateListenerArray13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(layoutManager18);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(jTextField24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray28);
        org.junit.Assert.assertNotNull(jTextField29);
        org.junit.Assert.assertNotNull(jLabel32);
        org.junit.Assert.assertNotNull(componentOrientation34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(imageList39);
        org.junit.Assert.assertNotNull(image41);
        org.junit.Assert.assertNotNull(windowStateListenerArray44);
        org.junit.Assert.assertNotNull(jLabel56);
        org.junit.Assert.assertNotNull(point58);
        org.junit.Assert.assertNull(component59);
        org.junit.Assert.assertNull(component60);
        org.junit.Assert.assertNull(component61);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        java.awt.dnd.DropTarget dropTarget4 = null;
        home0.setDropTarget(dropTarget4);
        int int6 = home0.sel_task_id;
        java.awt.image.BufferStrategy bufferStrategy7 = home0.getBufferStrategy();
        java.awt.Window window8 = home0.getOwner();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(bufferStrategy7);
        org.junit.Assert.assertNull(window8);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        SignUp signUp0 = new SignUp();
        boolean boolean1 = signUp0.isFocusableWindow();
        boolean boolean2 = signUp0.getFocusTraversalKeysEnabled();
        javax.swing.JTextField jTextField3 = signUp0.profileNameTextField;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTextField3);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.awt.Event event4 = null;
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JPanel jPanel8 = home5.panel;
        boolean boolean9 = home5.isOpaque();
        javax.swing.JTextField jTextField10 = home5.taskStartField;
        SignIn signIn11 = new SignIn();
        int int12 = signIn11.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = signIn11.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField15 = signIn11.textUsername;
        home5.taskStartField = jTextField15;
        Home home17 = new Home();
        javax.swing.JLabel jLabel18 = home17.taskStartLabel;
        home5.lblScheduledBy = jLabel18;
        java.awt.ComponentOrientation componentOrientation20 = home5.getComponentOrientation();
        javax.swing.JButton jButton21 = home5.updateJob;
        home5.addJob();
        boolean boolean23 = signIn0.gotFocus(event4, (java.lang.Object) home5);
        javax.swing.JButton jButton24 = home5.profileBtn;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jTextField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(componentOrientation20);
        org.junit.Assert.assertNotNull(jButton21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jButton24);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        boolean boolean15 = signIn7.isPreferredSizeSet();
        java.lang.String str16 = signIn7.getWarningString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.Event event9 = null;
        boolean boolean11 = signIn5.keyDown(event9, (int) '4');
        java.awt.Color color12 = signIn5.getBackground();
        signIn0.setBackground(color12);
        java.awt.Component component16 = signIn0.getComponentAt(128, 100);
        java.awt.Event event17 = null;
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.LayoutManager layoutManager22 = signIn18.getLayout();
        signIn18.setIgnoreRepaint(true);
        SignIn signIn25 = new SignIn();
        java.awt.Event event26 = null;
        boolean boolean29 = signIn25.mouseDrag(event26, 10, (int) (byte) -1);
        boolean boolean30 = signIn25.isForegroundSet();
        java.awt.Window window31 = signIn25.getOwner();
        boolean boolean32 = signIn18.isFocusCycleRoot((java.awt.Container) signIn25);
        signIn18.repaint((long) (short) 1);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior35 = signIn18.getBaselineResizeBehavior();
        int int36 = signIn18.getHeight();
        boolean boolean37 = component16.gotFocus(event17, (java.lang.Object) signIn18);
        signIn18.setResizable(false);
        signIn18.setBounds(700, (int) (byte) 10, 3, 6);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(color12);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(window31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior35 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior35.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 600 + "'", int36 == 600);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        DataAccess dataAccess0 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList1 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList3 = dataAccess0.scheduleTasks(strListList1, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.lang.String str7 = dataAccess0.signUp("Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "Home[frame3,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "");
        DataAccess dataAccess8 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList9 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList11 = dataAccess8.scheduleTasks(strListList9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        DataAccess dataAccess12 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList13 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList15 = dataAccess12.scheduleTasks(strListList13, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList17 = dataAccess8.scheduleTasks(strListList13, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList19 = dataAccess0.scheduleTasks(strListList17, "");
        org.junit.Assert.assertNotNull(strListList3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strListList11);
        org.junit.Assert.assertNotNull(strListList15);
        org.junit.Assert.assertNotNull(strListList17);
        org.junit.Assert.assertNotNull(strListList19);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        SignIn signIn19 = new SignIn();
        int int20 = signIn19.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray22 = signIn19.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField23 = signIn19.textPassword;
        signUp0.textUsername = jPasswordField23;
        SignIn signIn25 = null;
        signUp0.signIn = signIn25;
        java.lang.String str27 = signUp0.resp;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray22);
        org.junit.Assert.assertNotNull(jPasswordField23);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        boolean boolean7 = signIn0.isForegroundSet();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn0.mouseDrag(event8, (int) (byte) 1, (int) (byte) 10);
        java.awt.ImageCapabilities imageCapabilities14 = null;
        java.awt.image.VolatileImage volatileImage15 = signIn0.createVolatileImage((int) (short) 0, (-1), imageCapabilities14);
        SignIn signIn16 = new SignIn();
        int int17 = signIn16.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray19 = signIn16.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField20 = signIn16.textPassword;
        java.awt.LayoutManager layoutManager21 = jPasswordField20.getLayout();
        boolean boolean22 = jPasswordField20.isMaximumSizeSet();
        boolean boolean23 = jPasswordField20.getIgnoreRepaint();
        signIn0.setGlassPane((java.awt.Component) jPasswordField20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(volatileImage15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray19);
        org.junit.Assert.assertNotNull(jPasswordField20);
        org.junit.Assert.assertNotNull(layoutManager21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        home0.revalidate();
        home0.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        javax.swing.JTextField jTextField13 = home0.taskEndField;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
        org.junit.Assert.assertNull(jTextField13);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        Home home0 = new Home();
        javax.swing.JButton jButton1 = home0.deleteJob;
        home0.rsp = "User Signup";
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = home0.requestFocusInWindow(cause4);
        java.awt.Toolkit toolkit6 = home0.getToolkit();
        org.junit.Assert.assertNotNull(jButton1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(toolkit6);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        SignUp signUp0 = new SignUp();
        javax.swing.JPasswordField jPasswordField1 = signUp0.textPassword;
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        java.awt.Dimension dimension17 = signIn9.minimumSize();
        java.awt.Insets insets18 = signIn9.insets();
        signUp0.signIn = signIn9;
        java.awt.LayoutManager layoutManager20 = signIn9.getLayout();
        java.io.PrintStream printStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            signIn9.list(printStream21, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jPasswordField1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dimension17);
        org.junit.Assert.assertNotNull(insets18);
        org.junit.Assert.assertNotNull(layoutManager20);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        signIn0.show();
        boolean boolean16 = signIn0.isVisible();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JButton jButton3 = home0.profileBtn;
        java.awt.event.ContainerListener containerListener4 = null;
        home0.addContainerListener(containerListener4);
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        jDateChooser10.firePropertyChange("", (byte) 1, (byte) 1);
        home0.panel = jDateChooser10;
        com.toedter.calendar.JDateChooser jDateChooser16 = home0.stDate;
        UserProfile userProfile17 = home0.userProfile;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jButton3);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
        org.junit.Assert.assertNotNull(jDateChooser16);
        org.junit.Assert.assertNull(userProfile17);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        boolean boolean5 = signIn0.isForegroundSet();
        java.awt.Event event6 = null;
        SignIn signIn7 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener8 = null;
        signIn7.removeInputMethodListener(inputMethodListener8);
        boolean boolean10 = signIn7.isDisplayable();
        java.awt.event.FocusEvent.Cause cause11 = null;
        boolean boolean12 = signIn7.requestFocusInWindow(cause11);
        java.awt.Window window13 = signIn7.getOwner();
        javax.swing.TransferHandler transferHandler14 = signIn7.getTransferHandler();
        java.awt.event.InputMethodListener inputMethodListener15 = null;
        signIn7.removeInputMethodListener(inputMethodListener15);
        boolean boolean17 = signIn0.gotFocus(event6, (java.lang.Object) signIn7);
        SignIn signIn18 = new SignIn();
        java.awt.Shape shape19 = null;
        signIn18.setShape(shape19);
        java.awt.event.WindowListener windowListener21 = null;
        signIn18.removeWindowListener(windowListener21);
        SignIn signIn23 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        signIn23.removeInputMethodListener(inputMethodListener24);
        boolean boolean26 = signIn23.isDisplayable();
        java.awt.Container container27 = signIn23.getParent();
        java.awt.event.InputMethodListener inputMethodListener28 = null;
        signIn23.addInputMethodListener(inputMethodListener28);
        java.awt.MenuBar menuBar30 = null;
        signIn23.setMenuBar(menuBar30);
        signIn23.transferFocus();
        java.util.Locale locale33 = signIn23.getLocale();
        signIn18.setLocale(locale33);
        signIn7.setLocale(locale33);
        SignIn signIn36 = new SignIn();
        float float37 = signIn36.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray38 = signIn36.getPropertyChangeListeners();
        signIn36.firePropertyChange("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (byte) 0, (byte) 0);
        SignIn signIn43 = new SignIn();
        int int44 = signIn43.getState();
        java.util.List<java.awt.Image> imageList45 = signIn43.getIconImages();
        java.awt.Point point46 = signIn43.getMousePosition();
        java.awt.event.WindowFocusListener windowFocusListener47 = null;
        signIn43.removeWindowFocusListener(windowFocusListener47);
        java.awt.Rectangle rectangle49 = null;
        java.awt.Rectangle rectangle50 = signIn43.getBounds(rectangle49);
        signIn36.setBounds(rectangle50);
        signIn7.setMixingCutoutShape((java.awt.Shape) rectangle50);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertNull(transferHandler14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(container27);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.5f + "'", float37 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray38);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(imageList45);
        org.junit.Assert.assertNull(point46);
        org.junit.Assert.assertNotNull(rectangle50);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        Home home0 = new Home();
        javax.swing.JTable jTable1 = home0.table;
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        signIn2.repaint((long) (short) 1);
        java.awt.Dialog.ModalExclusionType modalExclusionType19 = signIn2.getModalExclusionType();
        home0.setModalExclusionType(modalExclusionType19);
        java.awt.event.FocusListener focusListener21 = null;
        home0.addFocusListener(focusListener21);
        SignIn signIn23 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        signIn23.removeInputMethodListener(inputMethodListener24);
        boolean boolean26 = signIn23.isDisplayable();
        java.awt.LayoutManager layoutManager27 = signIn23.getLayout();
        signIn23.setIgnoreRepaint(true);
        SignIn signIn30 = new SignIn();
        java.awt.Event event31 = null;
        boolean boolean34 = signIn30.mouseDrag(event31, 10, (int) (byte) -1);
        boolean boolean35 = signIn30.isForegroundSet();
        java.awt.Window window36 = signIn30.getOwner();
        boolean boolean37 = signIn23.isFocusCycleRoot((java.awt.Container) signIn30);
        java.awt.Dimension dimension38 = signIn30.minimumSize();
        java.awt.Insets insets39 = signIn30.insets();
        signIn30.show(true);
        java.awt.MenuBar menuBar42 = signIn30.getMenuBar();
        java.awt.Font font43 = signIn30.getFont();
        home0.setFont(font43);
        org.junit.Assert.assertNotNull(jTable1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + modalExclusionType19 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType19.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(layoutManager27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(window36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dimension38);
        org.junit.Assert.assertNotNull(insets39);
        org.junit.Assert.assertNull(menuBar42);
        org.junit.Assert.assertNotNull(font43);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JTextField jTextField6 = home5.taskStartField;
        boolean boolean7 = home5.isOpaque();
        javax.swing.JTable jTable8 = home5.table;
        boolean boolean9 = jTable8.getIgnoreRepaint();
        jTable8.firePropertyChange("hi!", (float) 10, (float) 610);
        home0.table = jTable8;
        javax.swing.JButton jButton15 = home0.profileBtn;
        java.awt.Event event16 = null;
        SignUp signUp17 = new SignUp();
        javax.swing.JPasswordField jPasswordField18 = signUp17.textPassword;
        SignIn signIn19 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        signIn19.removeInputMethodListener(inputMethodListener20);
        boolean boolean22 = signIn19.isDisplayable();
        java.awt.LayoutManager layoutManager23 = signIn19.getLayout();
        signIn19.setIgnoreRepaint(true);
        SignIn signIn26 = new SignIn();
        java.awt.Event event27 = null;
        boolean boolean30 = signIn26.mouseDrag(event27, 10, (int) (byte) -1);
        boolean boolean31 = signIn26.isForegroundSet();
        java.awt.Window window32 = signIn26.getOwner();
        boolean boolean33 = signIn19.isFocusCycleRoot((java.awt.Container) signIn26);
        java.awt.Dimension dimension34 = signIn26.minimumSize();
        java.awt.Insets insets35 = signIn26.insets();
        signUp17.signIn = signIn26;
        boolean boolean37 = home0.lostFocus(event16, (java.lang.Object) signIn26);
        boolean boolean40 = signIn26.contains(100, 1000);
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNull(jTextField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jTable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jButton15);
        org.junit.Assert.assertNotNull(jPasswordField18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(window32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertNotNull(insets35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JScrollPane jScrollPane5 = null;
        home4.scrollPane = jScrollPane5;
        javax.swing.table.DefaultTableModel defaultTableModel7 = home4.tableModel;
        home0.tableModel = defaultTableModel7;
        java.awt.Dimension dimension9 = home0.getMaximumSize();
        java.awt.Event event10 = null;
        boolean boolean13 = home0.mouseEnter(event10, 0, 5);
        Home home14 = new Home();
        javax.swing.JScrollPane jScrollPane15 = null;
        home14.scrollPane = jScrollPane15;
        javax.swing.JPanel jPanel17 = home14.panel;
        javax.swing.JTextField jTextField18 = home14.taskStartField;
        java.lang.String str19 = home14.rsp;
        javax.swing.JComboBox jComboBox20 = home14.priorityDropdown;
        home0.setLocationRelativeTo((java.awt.Component) home14);
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNotNull(defaultTableModel7);
        org.junit.Assert.assertNotNull(dimension9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNull(jTextField18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(jComboBox20);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        javax.swing.JPanel jPanel2 = home0.panel;
        java.awt.Rectangle rectangle3 = home0.getBounds();
        SignUp signUp4 = new SignUp();
        SignIn signIn5 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener6 = null;
        signIn5.removeInputMethodListener(inputMethodListener6);
        boolean boolean8 = signIn5.isDisplayable();
        java.awt.LayoutManager layoutManager9 = signIn5.getLayout();
        signIn5.setIgnoreRepaint(true);
        SignIn signIn12 = new SignIn();
        java.awt.Event event13 = null;
        boolean boolean16 = signIn12.mouseDrag(event13, 10, (int) (byte) -1);
        boolean boolean17 = signIn12.isForegroundSet();
        java.awt.Window window18 = signIn12.getOwner();
        boolean boolean19 = signIn5.isFocusCycleRoot((java.awt.Container) signIn12);
        boolean boolean20 = signIn12.isPreferredSizeSet();
        signUp4.signIn = signIn12;
        javax.swing.JTextField jTextField22 = signUp4.textUsername;
        signUp4.setTitle("User Signup");
        javax.swing.JButton jButton25 = signUp4.buttonCancel;
        home0.profileBtn = jButton25;
        home0.setUndecorated(false);
        Home home29 = new Home();
        javax.swing.JTextField jTextField30 = home29.taskStartField;
        boolean boolean31 = home29.isOpaque();
        javax.swing.JTable jTable32 = home29.table;
        java.awt.dnd.DropTarget dropTarget33 = null;
        home29.setDropTarget(dropTarget33);
        home29.deleteJob();
        Home home36 = new Home();
        javax.swing.JLabel jLabel37 = home36.taskDescLabel;
        home36.rsp = "hi!";
        javax.swing.JComboBox jComboBox40 = home36.statusDropdown;
        Home home41 = new Home();
        javax.swing.JScrollPane jScrollPane42 = null;
        home41.scrollPane = jScrollPane42;
        javax.swing.JPanel jPanel44 = home41.panel;
        javax.swing.JTextField jTextField45 = home41.taskStartField;
        java.lang.String str46 = home41.rsp;
        javax.swing.JComboBox jComboBox47 = home41.priorityDropdown;
        home36.scheduleDropdown = jComboBox47;
        Home home49 = new Home();
        javax.swing.JLabel jLabel50 = home49.taskStartLabel;
        Home home51 = new Home();
        javax.swing.JScrollPane jScrollPane52 = null;
        home51.scrollPane = jScrollPane52;
        javax.swing.JPanel jPanel54 = home51.panel;
        javax.swing.JTextField jTextField55 = home51.taskStartField;
        Home home56 = new Home();
        javax.swing.JScrollPane jScrollPane57 = null;
        home56.scrollPane = jScrollPane57;
        javax.swing.JButton jButton59 = home56.updateJob;
        home51.deleteJob = jButton59;
        home49.addJob = jButton59;
        javax.swing.JTable jTable62 = home49.table;
        home36.table = jTable62;
        home29.table = jTable62;
        home0.table = jTable62;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel2);
        org.junit.Assert.assertNotNull(rectangle3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(layoutManager9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(window18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jTextField22);
        org.junit.Assert.assertNotNull(jButton25);
        org.junit.Assert.assertNull(jTextField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jTable32);
        org.junit.Assert.assertNotNull(jLabel37);
        org.junit.Assert.assertNotNull(jComboBox40);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNull(jTextField45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(jComboBox47);
        org.junit.Assert.assertNotNull(jLabel50);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNull(jTextField55);
        org.junit.Assert.assertNotNull(jButton59);
        org.junit.Assert.assertNotNull(jTable62);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.image.ImageProducer imageProducer3 = null;
        java.awt.Image image4 = signIn0.createImage(imageProducer3);
        signIn0.firePropertyChange("", (byte) 0, (byte) 0);
        java.util.List<java.awt.Image> imageList9 = signIn0.getIconImages();
        java.awt.Graphics graphics10 = signIn0.getGraphics();
        java.awt.Font font11 = signIn0.getFont();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNotNull(image4);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertNull(graphics10);
        org.junit.Assert.assertNull(font11);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.clearAllInput();
        java.awt.event.ContainerListener containerListener6 = null;
        home0.addContainerListener(containerListener6);
        home0.setExtendedState(0);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JPanel jPanel8 = home5.panel;
        boolean boolean9 = home5.isOpaque();
        javax.swing.JTextField jTextField10 = home5.taskStartField;
        SignIn signIn11 = new SignIn();
        int int12 = signIn11.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = signIn11.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField15 = signIn11.textUsername;
        home5.taskStartField = jTextField15;
        Home home17 = new Home();
        javax.swing.JLabel jLabel18 = home17.taskStartLabel;
        home5.lblScheduledBy = jLabel18;
        java.awt.ComponentOrientation componentOrientation20 = home5.getComponentOrientation();
        signIn0.setComponentOrientation(componentOrientation20);
        boolean boolean22 = signIn0.isDoubleBuffered();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jTextField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(componentOrientation20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        SignUp signUp7 = new SignUp();
        javax.swing.JButton jButton8 = signUp7.buttonSignup;
        home0.deleteJob = jButton8;
        boolean boolean10 = home0.isFocusTraversalPolicyProvider();
        Home home11 = new Home();
        javax.swing.JTextField jTextField12 = home11.taskStartField;
        boolean boolean13 = home11.isOpaque();
        javax.swing.JTable jTable14 = home11.table;
        javax.swing.JButton jButton15 = home11.profileBtn;
        java.awt.image.ImageProducer imageProducer16 = null;
        java.awt.Image image17 = jButton15.createImage(imageProducer16);
        java.awt.event.KeyListener keyListener18 = null;
        jButton15.addKeyListener(keyListener18);
        home0.profileBtn = jButton15;
        // The following exception was thrown during execution in test generation
        try {
            home0.createBufferStrategy(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Component must have a valid peer");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jButton8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jTextField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jTable14);
        org.junit.Assert.assertNotNull(jButton15);
        org.junit.Assert.assertNotNull(image17);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.LayoutManager layoutManager19 = signIn15.getLayout();
        signIn0.setLayout(layoutManager19);
        boolean boolean21 = signIn0.isValid();
        boolean boolean22 = signIn0.isAlwaysOnTopSupported();
        Home home23 = new Home();
        javax.swing.JTextField jTextField24 = home23.taskStartField;
        Home home25 = new Home();
        javax.swing.JScrollPane jScrollPane26 = null;
        home25.scrollPane = jScrollPane26;
        javax.swing.JPanel jPanel28 = home25.panel;
        com.toedter.calendar.JDateChooser jDateChooser29 = home25.stDate;
        home23.enDate = jDateChooser29;
        home23.revalidate();
        home23.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str36 = home23.user_id;
        java.util.List<java.awt.Image> imageList37 = home23.getIconImages();
        Home home38 = new Home();
        javax.swing.JLabel jLabel39 = home38.taskDescLabel;
        home38.rsp = "hi!";
        javax.swing.JComboBox jComboBox42 = home38.statusDropdown;
        Home home43 = new Home();
        javax.swing.JScrollPane jScrollPane44 = null;
        home43.scrollPane = jScrollPane44;
        javax.swing.JPanel jPanel46 = home43.panel;
        javax.swing.JTextField jTextField47 = home43.taskStartField;
        java.lang.String str48 = home43.rsp;
        javax.swing.JComboBox jComboBox49 = home43.priorityDropdown;
        home38.scheduleDropdown = jComboBox49;
        home23.scheduleDropdown = jComboBox49;
        boolean boolean52 = home23.isLightweight();
        // The following exception was thrown during execution in test generation
        try {
            signIn0.setGlassPane((java.awt.Component) home23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(jTextField24);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jDateChooser29);
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "User Signup" + "'", str36, "User Signup");
        org.junit.Assert.assertNotNull(imageList37);
        org.junit.Assert.assertNotNull(jLabel39);
        org.junit.Assert.assertNotNull(jComboBox42);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNull(jTextField47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(jComboBox49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        java.awt.image.ColorModel colorModel3 = signIn0.getColorModel();
        java.awt.image.VolatileImage volatileImage6 = signIn0.createVolatileImage(128, 11);
        org.junit.Assert.assertNotNull(colorModel3);
        org.junit.Assert.assertNull(volatileImage6);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        Home home5 = new Home();
        javax.swing.JTextField jTextField6 = home5.taskStartField;
        boolean boolean7 = home5.isOpaque();
        javax.swing.JTable jTable8 = home5.table;
        boolean boolean9 = jTable8.getIgnoreRepaint();
        jTable8.firePropertyChange("hi!", (float) 10, (float) 610);
        home0.table = jTable8;
        javax.swing.JButton jButton15 = home0.profileBtn;
        java.awt.Event event16 = null;
        SignUp signUp17 = new SignUp();
        javax.swing.JPasswordField jPasswordField18 = signUp17.textPassword;
        SignIn signIn19 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        signIn19.removeInputMethodListener(inputMethodListener20);
        boolean boolean22 = signIn19.isDisplayable();
        java.awt.LayoutManager layoutManager23 = signIn19.getLayout();
        signIn19.setIgnoreRepaint(true);
        SignIn signIn26 = new SignIn();
        java.awt.Event event27 = null;
        boolean boolean30 = signIn26.mouseDrag(event27, 10, (int) (byte) -1);
        boolean boolean31 = signIn26.isForegroundSet();
        java.awt.Window window32 = signIn26.getOwner();
        boolean boolean33 = signIn19.isFocusCycleRoot((java.awt.Container) signIn26);
        java.awt.Dimension dimension34 = signIn26.minimumSize();
        java.awt.Insets insets35 = signIn26.insets();
        signUp17.signIn = signIn26;
        boolean boolean37 = home0.lostFocus(event16, (java.lang.Object) signIn26);
        java.awt.event.ActionEvent actionEvent38 = null;
        // The following exception was thrown during execution in test generation
        try {
            signIn26.actionPerformed(actionEvent38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNull(jTextField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(jTable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jButton15);
        org.junit.Assert.assertNotNull(jPasswordField18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(layoutManager23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(window32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dimension34);
        org.junit.Assert.assertNotNull(insets35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        java.lang.String str4 = userProfile0.user_pass;
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.Container container21 = signIn17.getParent();
        SignIn signIn22 = new SignIn();
        java.awt.Event event23 = null;
        boolean boolean26 = signIn22.mouseDrag(event23, 10, (int) (byte) -1);
        boolean boolean27 = signIn22.isForegroundSet();
        java.awt.Dimension dimension28 = signIn22.preferredSize();
        signIn17.setMinimumSize(dimension28);
        java.awt.event.HierarchyListener hierarchyListener30 = null;
        signIn17.addHierarchyListener(hierarchyListener30);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn17.setLayout(layoutManager36);
        java.awt.Rectangle rectangle38 = signIn17.getMaximizedBounds();
        boolean boolean39 = signIn0.isFocusCycleRoot((java.awt.Container) signIn17);
        boolean boolean40 = signIn0.isBackgroundSet();
        signIn0.resize((int) (byte) 100, (int) 'a');
        boolean boolean46 = signIn0.contains((int) (short) 100, (int) '#');
        signIn0.hide();
        Home home48 = new Home();
        javax.swing.JLabel jLabel49 = home48.taskDescLabel;
        home48.rsp = "hi!";
        javax.swing.JComboBox jComboBox52 = home48.statusDropdown;
        Home home53 = new Home();
        javax.swing.JScrollPane jScrollPane54 = null;
        home53.scrollPane = jScrollPane54;
        javax.swing.JPanel jPanel56 = home53.panel;
        javax.swing.JTextField jTextField57 = home53.taskStartField;
        java.lang.String str58 = home53.rsp;
        javax.swing.JComboBox jComboBox59 = home53.priorityDropdown;
        home48.scheduleDropdown = jComboBox59;
        Home home61 = new Home();
        javax.swing.JLabel jLabel62 = home61.taskStartLabel;
        Home home63 = new Home();
        javax.swing.JScrollPane jScrollPane64 = null;
        home63.scrollPane = jScrollPane64;
        javax.swing.JPanel jPanel66 = home63.panel;
        javax.swing.JTextField jTextField67 = home63.taskStartField;
        Home home68 = new Home();
        javax.swing.JScrollPane jScrollPane69 = null;
        home68.scrollPane = jScrollPane69;
        javax.swing.JButton jButton71 = home68.updateJob;
        home63.deleteJob = jButton71;
        home61.addJob = jButton71;
        javax.swing.JTable jTable74 = home61.table;
        home48.table = jTable74;
        Home home76 = new Home();
        javax.swing.JLabel jLabel77 = home76.taskDescLabel;
        home76.rsp = "hi!";
        javax.swing.JComboBox jComboBox80 = home76.statusDropdown;
        javax.swing.JPanel jPanel81 = home76.panel;
        home48.panel = jPanel81;
        SignIn signIn83 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener84 = null;
        signIn83.removeInputMethodListener(inputMethodListener84);
        boolean boolean86 = signIn83.isDisplayable();
        java.awt.event.FocusEvent.Cause cause87 = null;
        boolean boolean88 = signIn83.requestFocusInWindow(cause87);
        javax.swing.JRootPane jRootPane89 = signIn83.getRootPane();
        java.awt.dnd.DropTarget dropTarget90 = null;
        signIn83.setDropTarget(dropTarget90);
        java.awt.Graphics graphics92 = null;
        signIn83.paint(graphics92);
        java.awt.event.MouseListener mouseListener94 = null;
        signIn83.removeMouseListener(mouseListener94);
        // The following exception was thrown during execution in test generation
        try {
            signIn0.add((java.awt.Component) home48, (java.lang.Object) signIn83, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(container21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertNull(rectangle38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jLabel49);
        org.junit.Assert.assertNotNull(jComboBox52);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNull(jTextField57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(jComboBox59);
        org.junit.Assert.assertNotNull(jLabel62);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNull(jTextField67);
        org.junit.Assert.assertNotNull(jButton71);
        org.junit.Assert.assertNotNull(jTable74);
        org.junit.Assert.assertNotNull(jLabel77);
        org.junit.Assert.assertNotNull(jComboBox80);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jRootPane89);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        boolean boolean15 = signIn7.isPreferredSizeSet();
        java.awt.Color color16 = signIn7.getForeground();
        boolean boolean17 = signIn7.requestFocusInWindow();
        Home home18 = null;
        signIn7.home = home18;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(color16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        java.awt.event.ComponentListener componentListener7 = null;
        signIn0.removeComponentListener(componentListener7);
        DataAccess dataAccess9 = signIn0.api;
        java.awt.Insets insets10 = signIn0.insets();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertNull(dataAccess9);
        org.junit.Assert.assertNotNull(insets10);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        javax.swing.JTextField jTextField4 = home0.taskStartField;
        java.lang.String str5 = home0.rsp;
        javax.swing.JComboBox jComboBox6 = home0.priorityDropdown;
        Home home7 = new Home();
        javax.swing.JScrollPane jScrollPane8 = null;
        home7.scrollPane = jScrollPane8;
        javax.swing.table.DefaultTableModel defaultTableModel10 = home7.tableModel;
        Home home11 = new Home();
        javax.swing.JScrollPane jScrollPane12 = null;
        home11.scrollPane = jScrollPane12;
        javax.swing.table.DefaultTableModel defaultTableModel14 = home11.tableModel;
        home7.tableModel = defaultTableModel14;
        home0.tableModel = defaultTableModel14;
        javax.swing.JLabel jLabel17 = home0.taskNameLabel;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertNull(jTextField4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(jComboBox6);
        org.junit.Assert.assertNotNull(defaultTableModel10);
        org.junit.Assert.assertNotNull(defaultTableModel14);
        org.junit.Assert.assertNotNull(jLabel17);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        signIn0.show();
        Home home16 = new Home();
        javax.swing.JTextField jTextField17 = home16.taskStartField;
        boolean boolean18 = home16.isOpaque();
        javax.swing.JTable jTable19 = home16.table;
        javax.swing.JButton jButton20 = home16.profileBtn;
        java.awt.image.ImageProducer imageProducer21 = null;
        java.awt.Image image22 = jButton20.createImage(imageProducer21);
        boolean boolean28 = signIn0.imageUpdate(image22, (int) (short) -1, 700, 16, 16, 5);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNull(jTextField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jTable19);
        org.junit.Assert.assertNotNull(jButton20);
        org.junit.Assert.assertNotNull(image22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        int int2 = home0.sel_task_id;
        javax.swing.JButton jButton3 = home0.deleteJob;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(jButton3);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        SignUp signUp0 = new SignUp();
        javax.swing.JButton jButton1 = signUp0.buttonSignup;
        java.awt.Shape shape2 = null;
        signUp0.setMixingCutoutShape(shape2);
        java.awt.Insets insets4 = signUp0.getInsets();
        SignIn signIn5 = new SignIn();
        int int6 = signIn5.getState();
        java.util.List<java.awt.Image> imageList7 = signIn5.getIconImages();
        java.awt.image.ImageProducer imageProducer8 = null;
        java.awt.Image image9 = signIn5.createImage(imageProducer8);
        java.awt.event.MouseListener mouseListener10 = null;
        signIn5.removeMouseListener(mouseListener10);
        java.awt.event.WindowStateListener[] windowStateListenerArray12 = signIn5.getWindowStateListeners();
        signIn5.enable(false);
        signIn5.revalidate();
        signIn5.firePropertyChange("User Signup", (-1L), (long) 'a');
        Home home20 = new Home();
        javax.swing.JLabel jLabel21 = null;
        home20.taskEndLabel = jLabel21;
        Home home23 = new Home();
        javax.swing.JLabel jLabel24 = home23.taskStartLabel;
        home20.taskTypeLabel = jLabel24;
        java.awt.Point point26 = home20.getLocation();
        java.awt.Component component27 = signIn5.findComponentAt(point26);
        java.awt.dnd.DropTarget dropTarget28 = null;
        signIn5.setDropTarget(dropTarget28);
        signUp0.signIn = signIn5;
        org.junit.Assert.assertNotNull(jButton1);
        org.junit.Assert.assertNotNull(insets4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(imageList7);
        org.junit.Assert.assertNotNull(image9);
        org.junit.Assert.assertNotNull(windowStateListenerArray12);
        org.junit.Assert.assertNotNull(jLabel24);
        org.junit.Assert.assertNotNull(point26);
        org.junit.Assert.assertNull(component27);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        java.awt.dnd.DropTarget dropTarget4 = null;
        home0.setDropTarget(dropTarget4);
        SignIn signIn6 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        signIn6.removeInputMethodListener(inputMethodListener7);
        boolean boolean9 = signIn6.isDisplayable();
        java.awt.Event event10 = null;
        boolean boolean12 = signIn6.keyDown(event10, (int) '4');
        java.awt.Color color13 = signIn6.getBackground();
        home0.setForeground(color13);
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(color13);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.Event event2 = null;
        boolean boolean5 = signIn1.mouseDrag(event2, 10, (int) (byte) -1);
        java.awt.Event event6 = null;
        boolean boolean9 = signIn1.mouseUp(event6, (-1), (int) '4');
        signIn1.show(false);
        signIn1.doLayout();
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = null;
        home13.taskEndLabel = jLabel14;
        Home home16 = new Home();
        javax.swing.JLabel jLabel17 = home16.taskStartLabel;
        home13.taskTypeLabel = jLabel17;
        java.awt.Point point19 = home13.getLocation();
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JButton jButton23 = home20.updateJob;
        home13.updateJob = jButton23;
        signIn1.buttonSignup = jButton23;
        SignIn signIn26 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        signIn26.removeInputMethodListener(inputMethodListener27);
        boolean boolean29 = signIn26.isDisplayable();
        java.awt.LayoutManager layoutManager30 = signIn26.getLayout();
        Home home31 = new Home();
        javax.swing.JScrollPane jScrollPane32 = null;
        home31.scrollPane = jScrollPane32;
        javax.swing.JPanel jPanel34 = home31.panel;
        boolean boolean35 = home31.isOpaque();
        javax.swing.JTextField jTextField36 = home31.taskStartField;
        SignIn signIn37 = new SignIn();
        int int38 = signIn37.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray40 = signIn37.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField41 = signIn37.textUsername;
        home31.taskStartField = jTextField41;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = home43.taskStartLabel;
        home31.lblScheduledBy = jLabel44;
        java.awt.ComponentOrientation componentOrientation46 = home31.getComponentOrientation();
        signIn26.setComponentOrientation(componentOrientation46);
        jButton23.setComponentOrientation(componentOrientation46);
        userProfile0.backButton = jButton23;
        java.lang.String str50 = userProfile0.user_id;
        userProfile0.toFront();
        Home home52 = new Home();
        javax.swing.JTextField jTextField53 = home52.taskStartField;
        boolean boolean54 = home52.isOpaque();
        javax.swing.JTable jTable55 = home52.table;
        javax.swing.JButton jButton56 = home52.profileBtn;
        userProfile0.btnUpdatePassword = jButton56;
        java.lang.String str58 = userProfile0.respN;
        SignIn signIn59 = new SignIn();
        int int60 = signIn59.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray62 = signIn59.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField63 = signIn59.textUsername;
        java.awt.Dimension dimension64 = jTextField63.getPreferredSize();
        userProfile0.nameTextField = jTextField63;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jLabel17);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(jButton23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(layoutManager30);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(jTextField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray40);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(componentOrientation46);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User Signup" + "'", str50, "User Signup");
        org.junit.Assert.assertNull(jTextField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTable55);
        org.junit.Assert.assertNotNull(jButton56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray62);
        org.junit.Assert.assertNotNull(jTextField63);
        org.junit.Assert.assertNotNull(dimension64);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        java.awt.Point point3 = home0.getMousePosition();
        Home home4 = new Home();
        javax.swing.JTextField jTextField5 = home4.taskStartField;
        boolean boolean6 = home4.isOpaque();
        javax.swing.JTable jTable7 = home4.table;
        java.awt.dnd.DropTarget dropTarget8 = null;
        home4.setDropTarget(dropTarget8);
        home4.deleteJob();
        java.awt.Dimension dimension11 = home4.minimumSize();
        home0.remove((java.awt.Component) home4);
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(point3);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jTable7);
        org.junit.Assert.assertNotNull(dimension11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        DataAccess dataAccess0 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList2 = dataAccess0.getAllJobs("hi!");
        java.lang.String str6 = dataAccess0.signUp("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", "frame4", "");
        DataAccess dataAccess7 = new DataAccess();
        DataAccess dataAccess8 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList9 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList11 = dataAccess8.scheduleTasks(strListList9, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList13 = dataAccess7.scheduleTasks(strListList9, "User Signup");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList15 = dataAccess0.scheduleTasks(strListList13, "");
        org.junit.Assert.assertNotNull(strListList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strListList11);
        org.junit.Assert.assertNotNull(strListList13);
        org.junit.Assert.assertNotNull(strListList15);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.Event event2 = null;
        boolean boolean5 = signIn1.mouseDrag(event2, 10, (int) (byte) -1);
        java.awt.Event event6 = null;
        boolean boolean9 = signIn1.mouseUp(event6, (-1), (int) '4');
        signIn1.show(false);
        signIn1.doLayout();
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = null;
        home13.taskEndLabel = jLabel14;
        Home home16 = new Home();
        javax.swing.JLabel jLabel17 = home16.taskStartLabel;
        home13.taskTypeLabel = jLabel17;
        java.awt.Point point19 = home13.getLocation();
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JButton jButton23 = home20.updateJob;
        home13.updateJob = jButton23;
        signIn1.buttonSignup = jButton23;
        SignIn signIn26 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        signIn26.removeInputMethodListener(inputMethodListener27);
        boolean boolean29 = signIn26.isDisplayable();
        java.awt.LayoutManager layoutManager30 = signIn26.getLayout();
        Home home31 = new Home();
        javax.swing.JScrollPane jScrollPane32 = null;
        home31.scrollPane = jScrollPane32;
        javax.swing.JPanel jPanel34 = home31.panel;
        boolean boolean35 = home31.isOpaque();
        javax.swing.JTextField jTextField36 = home31.taskStartField;
        SignIn signIn37 = new SignIn();
        int int38 = signIn37.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray40 = signIn37.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField41 = signIn37.textUsername;
        home31.taskStartField = jTextField41;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = home43.taskStartLabel;
        home31.lblScheduledBy = jLabel44;
        java.awt.ComponentOrientation componentOrientation46 = home31.getComponentOrientation();
        signIn26.setComponentOrientation(componentOrientation46);
        jButton23.setComponentOrientation(componentOrientation46);
        userProfile0.backButton = jButton23;
        java.lang.String str50 = userProfile0.user_id;
        userProfile0.toFront();
        userProfile0.updateProfileInfo();
        userProfile0.rsp = "hi!";
        java.lang.String str55 = userProfile0.user_pass;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jLabel17);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(jButton23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(layoutManager30);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(jTextField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray40);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(componentOrientation46);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User Signup" + "'", str50, "User Signup");
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.LayoutManager layoutManager19 = signIn15.getLayout();
        signIn0.setLayout(layoutManager19);
        java.awt.Rectangle rectangle21 = signIn0.getMaximizedBounds();
        signIn0.setFocusCycleRoot(false);
        javax.swing.JRootPane jRootPane24 = signIn0.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            signIn0.setDefaultCloseOperation(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertNull(rectangle21);
        org.junit.Assert.assertNotNull(jRootPane24);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        home0.rsp = "SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]";
        home0.removeNotify();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        javax.swing.TransferHandler transferHandler21 = signUp0.getTransferHandler();
        Home home22 = new Home();
        javax.swing.JLabel jLabel23 = home22.taskDescLabel;
        home22.rsp = "hi!";
        javax.swing.JComboBox jComboBox26 = home22.statusDropdown;
        Home home27 = new Home();
        javax.swing.JLabel jLabel28 = home27.taskDescLabel;
        home22.taskStartLabel = jLabel28;
        javax.swing.JLabel jLabel30 = home22.taskStartLabel;
        signUp0.setContentPane((java.awt.Container) jLabel30);
        java.lang.String str32 = signUp0.resp;
        java.awt.event.WindowStateListener windowStateListener33 = null;
        signUp0.addWindowStateListener(windowStateListener33);
        signUp0.hide();
        javax.swing.JTextField jTextField36 = signUp0.profileNameTextField;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNull(transferHandler21);
        org.junit.Assert.assertNotNull(jLabel23);
        org.junit.Assert.assertNotNull(jComboBox26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jLabel30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(jTextField36);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        DataAccess dataAccess0 = new DataAccess();
        DataAccess dataAccess1 = new DataAccess();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList2 = new java.util.Vector<java.util.Vector<java.lang.String>>();
        java.util.Vector<java.util.Vector<java.lang.String>> strListList4 = dataAccess1.scheduleTasks(strListList2, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList6 = dataAccess0.scheduleTasks(strListList2, "User Signup");
        java.util.Vector<java.util.Vector<java.lang.String>> strListList8 = dataAccess0.getAllJobs("Home[frame1,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        java.lang.String str11 = dataAccess0.isUserValid("frame14", "Home[frame10,460,112,1000x800,invalid,hidden,layout=java.awt.BorderLayout,title=Job Scheduler,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertNotNull(strListList4);
        org.junit.Assert.assertNotNull(strListList6);
        org.junit.Assert.assertNotNull(strListList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        javax.swing.JRootPane jRootPane21 = signUp0.getRootPane();
        java.awt.Container container22 = signUp0.getContentPane();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertNotNull(jRootPane21);
        org.junit.Assert.assertNotNull(container22);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        java.awt.Event event4 = null;
        Home home5 = new Home();
        javax.swing.JScrollPane jScrollPane6 = null;
        home5.scrollPane = jScrollPane6;
        javax.swing.JPanel jPanel8 = home5.panel;
        boolean boolean9 = home5.isOpaque();
        javax.swing.JTextField jTextField10 = home5.taskStartField;
        SignIn signIn11 = new SignIn();
        int int12 = signIn11.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = signIn11.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField15 = signIn11.textUsername;
        home5.taskStartField = jTextField15;
        Home home17 = new Home();
        javax.swing.JLabel jLabel18 = home17.taskStartLabel;
        home5.lblScheduledBy = jLabel18;
        java.awt.ComponentOrientation componentOrientation20 = home5.getComponentOrientation();
        javax.swing.JButton jButton21 = home5.updateJob;
        home5.addJob();
        boolean boolean23 = signIn0.gotFocus(event4, (java.lang.Object) home5);
        boolean boolean24 = home5.isPreferredSizeSet();
        Home home25 = new Home();
        javax.swing.JScrollPane jScrollPane26 = null;
        home25.scrollPane = jScrollPane26;
        javax.swing.JPanel jPanel28 = home25.panel;
        javax.swing.JTextField jTextField29 = home25.taskStartField;
        java.lang.String str30 = home25.rsp;
        javax.swing.JComboBox jComboBox31 = home25.priorityDropdown;
        Home home32 = new Home();
        javax.swing.JScrollPane jScrollPane33 = null;
        home32.scrollPane = jScrollPane33;
        javax.swing.table.DefaultTableModel defaultTableModel35 = home32.tableModel;
        Home home36 = new Home();
        javax.swing.JScrollPane jScrollPane37 = null;
        home36.scrollPane = jScrollPane37;
        javax.swing.table.DefaultTableModel defaultTableModel39 = home36.tableModel;
        home32.tableModel = defaultTableModel39;
        home25.tableModel = defaultTableModel39;
        home5.tableModel = defaultTableModel39;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jTextField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        org.junit.Assert.assertNotNull(jTextField15);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(componentOrientation20);
        org.junit.Assert.assertNotNull(jButton21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNull(jTextField29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(jComboBox31);
        org.junit.Assert.assertNotNull(defaultTableModel35);
        org.junit.Assert.assertNotNull(defaultTableModel39);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        Home home3 = new Home();
        javax.swing.JLabel jLabel4 = home3.taskStartLabel;
        home0.taskTypeLabel = jLabel4;
        java.io.PrintWriter printWriter6 = null;
        // The following exception was thrown during execution in test generation
        try {
            jLabel4.list(printWriter6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jLabel4);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextField jTextField5 = home0.taskEndField;
        home0.toBack();
        org.junit.Assert.assertNull(jTextField5);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        UserProfile userProfile0 = new UserProfile();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        SignIn signIn20 = new SignIn();
        int int21 = signIn20.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = signIn20.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField24 = signIn20.textPassword;
        signUp1.textUsername = jPasswordField24;
        jPasswordField24.repaint();
        userProfile0.oldPasstextField = jPasswordField24;
        Home home28 = new Home();
        javax.swing.JLabel jLabel29 = home28.taskDescLabel;
        home28.rsp = "hi!";
        userProfile0.home = home28;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNotNull(jPasswordField24);
        org.junit.Assert.assertNotNull(jLabel29);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        int int2 = home0.sel_task_id;
        SignIn signIn3 = new SignIn();
        int int4 = signIn3.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = signIn3.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField7 = signIn3.textPassword;
        java.awt.LayoutManager layoutManager8 = jPasswordField7.getLayout();
        boolean boolean9 = jPasswordField7.isMaximumSizeSet();
        home0.taskTypeField = jPasswordField7;
        java.awt.event.MouseListener mouseListener11 = null;
        home0.removeMouseListener(mouseListener11);
        java.lang.String str13 = home0.getName();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jPasswordField7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "frame15" + "'", str13, "frame15");
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        boolean boolean15 = signIn7.isPreferredSizeSet();
        java.awt.Color color16 = signIn7.getForeground();
        java.awt.Graphics graphics17 = null;
        signIn7.update(graphics17);
        signIn7.show(false);
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        signIn7.removeInputMethodListener(inputMethodListener21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(color16);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField4 = signIn0.textPassword;
        boolean boolean5 = signIn0.isPreferredSizeSet();
        Home home6 = new Home();
        javax.swing.JLabel jLabel7 = null;
        home6.taskEndLabel = jLabel7;
        home6.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextField jTextField11 = home6.taskEndField;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskDescLabel;
        home12.rsp = "hi!";
        javax.swing.JComboBox jComboBox16 = home12.statusDropdown;
        Home home17 = new Home();
        javax.swing.JLabel jLabel18 = home17.taskDescLabel;
        home12.taskStartLabel = jLabel18;
        javax.swing.JLabel jLabel20 = home12.taskStartLabel;
        java.awt.Event event21 = null;
        boolean boolean23 = jLabel20.keyUp(event21, 4);
        home6.status = jLabel20;
        com.toedter.calendar.JDateChooser jDateChooser25 = home6.enDate;
        signIn0.removePropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jPasswordField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jTextField11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(jComboBox16);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jLabel20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jDateChooser25);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        java.awt.event.ActionEvent actionEvent5 = null;
        // The following exception was thrown during execution in test generation
        try {
            home0.actionPerformed(actionEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.event.ActionEvent.getSource()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        signIn0.repaint((long) (short) 1);
        SignIn signIn17 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener18 = null;
        signIn17.removeInputMethodListener(inputMethodListener18);
        boolean boolean20 = signIn17.isDisplayable();
        java.awt.LayoutManager layoutManager21 = signIn17.getLayout();
        signIn17.setIgnoreRepaint(true);
        SignIn signIn24 = new SignIn();
        java.awt.Event event25 = null;
        boolean boolean28 = signIn24.mouseDrag(event25, 10, (int) (byte) -1);
        boolean boolean29 = signIn24.isForegroundSet();
        java.awt.Window window30 = signIn24.getOwner();
        boolean boolean31 = signIn17.isFocusCycleRoot((java.awt.Container) signIn24);
        SignIn signIn32 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        signIn32.removeInputMethodListener(inputMethodListener33);
        boolean boolean35 = signIn32.isDisplayable();
        java.awt.LayoutManager layoutManager36 = signIn32.getLayout();
        signIn32.setIgnoreRepaint(true);
        SignIn signIn39 = new SignIn();
        java.awt.Event event40 = null;
        boolean boolean43 = signIn39.mouseDrag(event40, 10, (int) (byte) -1);
        boolean boolean44 = signIn39.isForegroundSet();
        java.awt.Window window45 = signIn39.getOwner();
        boolean boolean46 = signIn32.isFocusCycleRoot((java.awt.Container) signIn39);
        java.awt.Dimension dimension47 = signIn39.minimumSize();
        signIn24.setMaximumSize(dimension47);
        signIn0.setMaximumSize(dimension47);
        SignIn signIn50 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        signIn50.removeInputMethodListener(inputMethodListener51);
        boolean boolean53 = signIn50.isDisplayable();
        java.awt.event.FocusEvent.Cause cause54 = null;
        boolean boolean55 = signIn50.requestFocusInWindow(cause54);
        java.awt.LayoutManager layoutManager56 = signIn50.getLayout();
        boolean boolean57 = signIn50.isForegroundSet();
        java.awt.Event event58 = null;
        boolean boolean61 = signIn50.mouseDrag(event58, (int) (byte) 1, (int) (byte) 10);
        java.awt.ImageCapabilities imageCapabilities64 = null;
        java.awt.image.VolatileImage volatileImage65 = signIn50.createVolatileImage((int) (short) 0, (-1), imageCapabilities64);
        java.awt.Dimension dimension66 = signIn50.getSize();
        signIn0.setMaximumSize(dimension66);
        signIn0.setFocusTraversalKeysEnabled(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(layoutManager21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(window30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(layoutManager36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(window45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dimension47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(layoutManager56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(volatileImage65);
        org.junit.Assert.assertNotNull(dimension66);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        UserProfile userProfile0 = new UserProfile();
        javax.swing.JTextField jTextField1 = userProfile0.emailTextField;
        userProfile0.rsp = "User Signup";
        javax.swing.JTextField jTextField4 = userProfile0.nameTextField;
        userProfile0.updateProfileInfo();
        java.lang.String str6 = userProfile0.user_pass;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = userProfile0.areFocusTraversalKeysSet(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(jTextField1);
        org.junit.Assert.assertNotNull(jTextField4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        boolean boolean7 = signIn0.isForegroundSet();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn0.mouseDrag(event8, (int) (byte) 1, (int) (byte) 10);
        java.awt.Event event12 = null;
        boolean boolean14 = signIn0.keyUp(event12, 100);
        javax.swing.JRootPane jRootPane15 = signIn0.getRootPane();
        float float16 = jRootPane15.getAlignmentX();
        jRootPane15.firePropertyChange("User Signup", '4', 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jRootPane15);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        UserProfile userProfile0 = new UserProfile();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        SignIn signIn20 = new SignIn();
        int int21 = signIn20.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = signIn20.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField24 = signIn20.textPassword;
        signUp1.textUsername = jPasswordField24;
        jPasswordField24.repaint();
        userProfile0.oldPasstextField = jPasswordField24;
        userProfile0.repaint((int) '#', 128, (int) ' ', (int) (short) 0);
        int int33 = userProfile0.getHeight();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        org.junit.Assert.assertNotNull(jPasswordField24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 800 + "'", int33 == 800);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Event event4 = null;
        boolean boolean6 = signIn0.keyDown(event4, (int) '4');
        java.awt.Color color7 = signIn0.getBackground();
        javax.accessibility.AccessibleContext accessibleContext8 = signIn0.getAccessibleContext();
        SignUp signUp9 = new SignUp();
        javax.swing.JPasswordField jPasswordField10 = signUp9.textPassword;
        SignIn signIn11 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        signIn11.removeInputMethodListener(inputMethodListener12);
        boolean boolean14 = signIn11.isDisplayable();
        java.awt.LayoutManager layoutManager15 = signIn11.getLayout();
        signIn11.setIgnoreRepaint(true);
        SignIn signIn18 = new SignIn();
        java.awt.Event event19 = null;
        boolean boolean22 = signIn18.mouseDrag(event19, 10, (int) (byte) -1);
        boolean boolean23 = signIn18.isForegroundSet();
        java.awt.Window window24 = signIn18.getOwner();
        boolean boolean25 = signIn11.isFocusCycleRoot((java.awt.Container) signIn18);
        java.awt.Dimension dimension26 = signIn18.minimumSize();
        java.awt.Insets insets27 = signIn18.insets();
        signUp9.signIn = signIn18;
        java.awt.Insets insets29 = signIn18.insets();
        javax.swing.JPasswordField jPasswordField30 = signIn18.textPassword;
        signIn0.textPassword = jPasswordField30;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(color7);
        org.junit.Assert.assertNotNull(accessibleContext8);
        org.junit.Assert.assertNotNull(jPasswordField10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(layoutManager15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(window24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dimension26);
        org.junit.Assert.assertNotNull(insets27);
        org.junit.Assert.assertNotNull(insets29);
        org.junit.Assert.assertNotNull(jPasswordField30);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        Home home0 = new Home();
        javax.swing.JTable jTable1 = home0.table;
        SignUp signUp2 = new SignUp();
        SignIn signIn3 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        signIn3.removeInputMethodListener(inputMethodListener4);
        boolean boolean6 = signIn3.isDisplayable();
        java.awt.LayoutManager layoutManager7 = signIn3.getLayout();
        signIn3.setIgnoreRepaint(true);
        SignIn signIn10 = new SignIn();
        java.awt.Event event11 = null;
        boolean boolean14 = signIn10.mouseDrag(event11, 10, (int) (byte) -1);
        boolean boolean15 = signIn10.isForegroundSet();
        java.awt.Window window16 = signIn10.getOwner();
        boolean boolean17 = signIn3.isFocusCycleRoot((java.awt.Container) signIn10);
        boolean boolean18 = signIn10.isPreferredSizeSet();
        signUp2.signIn = signIn10;
        javax.swing.JTextField jTextField20 = signUp2.textUsername;
        boolean boolean21 = jTextField20.requestFocusInWindow();
        java.awt.image.ImageProducer imageProducer22 = null;
        java.awt.Image image23 = jTextField20.createImage(imageProducer22);
        home0.taskNameField = jTextField20;
        org.junit.Assert.assertNotNull(jTable1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(layoutManager7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(window16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(jTextField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(image23);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        SignUp signUp0 = new SignUp();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        boolean boolean16 = signIn8.isPreferredSizeSet();
        signUp0.signIn = signIn8;
        javax.swing.JTextField jTextField18 = signUp0.textUsername;
        SignIn signIn19 = new SignIn();
        int int20 = signIn19.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray22 = signIn19.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField23 = signIn19.textPassword;
        signUp0.textUsername = jPasswordField23;
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.event.FocusEvent.Cause cause29 = null;
        boolean boolean30 = signIn25.requestFocusInWindow(cause29);
        java.awt.LayoutManager layoutManager31 = signIn25.getLayout();
        signUp0.signIn = signIn25;
        signUp0.setAutoRequestFocus(false);
        java.awt.MenuBar menuBar35 = null;
        signUp0.setMenuBar(menuBar35);
        boolean boolean37 = signUp0.isShowing();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jTextField18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray22);
        org.junit.Assert.assertNotNull(jPasswordField23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(layoutManager31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray3 = signIn0.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField4 = signIn0.textUsername;
        java.awt.image.VolatileImage volatileImage7 = signIn0.createVolatileImage((int) (short) 10, 4);
        java.awt.dnd.DropTarget dropTarget8 = signIn0.getDropTarget();
        javax.swing.JButton jButton9 = signIn0.buttonSignup;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray3);
        org.junit.Assert.assertNotNull(jTextField4);
        org.junit.Assert.assertNull(volatileImage7);
        org.junit.Assert.assertNull(dropTarget8);
        org.junit.Assert.assertNotNull(jButton9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        SignUp signUp0 = new SignUp();
        SignUp signUp1 = new SignUp();
        SignIn signIn2 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener3 = null;
        signIn2.removeInputMethodListener(inputMethodListener3);
        boolean boolean5 = signIn2.isDisplayable();
        java.awt.LayoutManager layoutManager6 = signIn2.getLayout();
        signIn2.setIgnoreRepaint(true);
        SignIn signIn9 = new SignIn();
        java.awt.Event event10 = null;
        boolean boolean13 = signIn9.mouseDrag(event10, 10, (int) (byte) -1);
        boolean boolean14 = signIn9.isForegroundSet();
        java.awt.Window window15 = signIn9.getOwner();
        boolean boolean16 = signIn2.isFocusCycleRoot((java.awt.Container) signIn9);
        boolean boolean17 = signIn9.isPreferredSizeSet();
        signUp1.signIn = signIn9;
        javax.swing.JTextField jTextField19 = signUp1.textUsername;
        signUp0.profileNameTextField = jTextField19;
        SignUp signUp21 = new SignUp();
        SignUp signUp22 = new SignUp();
        SignIn signIn23 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener24 = null;
        signIn23.removeInputMethodListener(inputMethodListener24);
        boolean boolean26 = signIn23.isDisplayable();
        java.awt.LayoutManager layoutManager27 = signIn23.getLayout();
        signIn23.setIgnoreRepaint(true);
        SignIn signIn30 = new SignIn();
        java.awt.Event event31 = null;
        boolean boolean34 = signIn30.mouseDrag(event31, 10, (int) (byte) -1);
        boolean boolean35 = signIn30.isForegroundSet();
        java.awt.Window window36 = signIn30.getOwner();
        boolean boolean37 = signIn23.isFocusCycleRoot((java.awt.Container) signIn30);
        boolean boolean38 = signIn30.isPreferredSizeSet();
        signUp22.signIn = signIn30;
        javax.swing.JTextField jTextField40 = signUp22.textUsername;
        signUp21.profileNameTextField = jTextField40;
        javax.swing.TransferHandler transferHandler42 = signUp21.getTransferHandler();
        SignUp signUp43 = new SignUp();
        SignIn signIn44 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener45 = null;
        signIn44.removeInputMethodListener(inputMethodListener45);
        boolean boolean47 = signIn44.isDisplayable();
        java.awt.LayoutManager layoutManager48 = signIn44.getLayout();
        signIn44.setIgnoreRepaint(true);
        SignIn signIn51 = new SignIn();
        java.awt.Event event52 = null;
        boolean boolean55 = signIn51.mouseDrag(event52, 10, (int) (byte) -1);
        boolean boolean56 = signIn51.isForegroundSet();
        java.awt.Window window57 = signIn51.getOwner();
        boolean boolean58 = signIn44.isFocusCycleRoot((java.awt.Container) signIn51);
        boolean boolean59 = signIn51.isPreferredSizeSet();
        signUp43.signIn = signIn51;
        javax.swing.JTextField jTextField61 = signUp43.textUsername;
        SignIn signIn62 = new SignIn();
        int int63 = signIn62.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray65 = signIn62.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField66 = signIn62.textPassword;
        signUp43.textUsername = jPasswordField66;
        jPasswordField66.repaint();
        signUp21.profileNameTextField = jPasswordField66;
        signUp0.textPassword = jPasswordField66;
        java.awt.Dimension dimension71 = signUp0.getPreferredSize();
        java.awt.Container container72 = signUp0.getContentPane();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(window15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jTextField19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(layoutManager27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(window36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jTextField40);
        org.junit.Assert.assertNull(transferHandler42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(layoutManager48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(window57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jTextField61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray65);
        org.junit.Assert.assertNotNull(jPasswordField66);
        org.junit.Assert.assertNotNull(dimension71);
        org.junit.Assert.assertNotNull(container72);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        SignIn signIn0 = new SignIn();
        signIn0.setState((int) (byte) 1);
        SignIn signIn3 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener4 = null;
        signIn3.removeInputMethodListener(inputMethodListener4);
        boolean boolean6 = signIn3.isDisplayable();
        java.awt.Container container7 = signIn3.getParent();
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Dimension dimension14 = signIn8.preferredSize();
        signIn3.setMinimumSize(dimension14);
        java.awt.event.HierarchyListener hierarchyListener16 = null;
        signIn3.addHierarchyListener(hierarchyListener16);
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.LayoutManager layoutManager22 = signIn18.getLayout();
        signIn3.setLayout(layoutManager22);
        boolean boolean24 = signIn0.isAncestorOf((java.awt.Component) signIn3);
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        java.awt.Dimension dimension28 = signIn25.minimumSize();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray29 = signIn25.getMouseMotionListeners();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray30 = signIn25.getMouseWheelListeners();
        boolean boolean31 = signIn3.isFocusCycleRoot((java.awt.Container) signIn25);
        java.lang.String str32 = signIn25.getTitle();
        signIn25.setName("frame9");
        java.awt.event.ContainerListener containerListener35 = null;
        signIn25.addContainerListener(containerListener35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(container7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dimension14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dimension28);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray29);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "User Signup" + "'", str32, "User Signup");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.image.ImageProducer imageProducer3 = null;
        java.awt.Image image4 = signIn0.createImage(imageProducer3);
        signIn0.firePropertyChange("", (byte) 0, (byte) 0);
        java.util.List<java.awt.Image> imageList9 = signIn0.getIconImages();
        java.awt.Graphics graphics10 = signIn0.getGraphics();
        boolean boolean11 = signIn0.isFocusTraversalPolicyProvider();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNotNull(image4);
        org.junit.Assert.assertNotNull(imageList9);
        org.junit.Assert.assertNull(graphics10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = null;
        home0.taskEndLabel = jLabel1;
        home0.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        javax.swing.JTextArea jTextArea5 = null;
        home0.taskDescField = jTextArea5;
        SignUp signUp7 = new SignUp();
        javax.swing.JButton jButton8 = signUp7.buttonSignup;
        home0.deleteJob = jButton8;
        boolean boolean10 = home0.isFocusTraversalPolicyProvider();
        javax.swing.JButton jButton11 = home0.profileBtn;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskDescLabel;
        home12.rsp = "hi!";
        javax.swing.JComboBox jComboBox16 = home12.statusDropdown;
        Home home17 = new Home();
        javax.swing.JLabel jLabel18 = home17.taskDescLabel;
        home12.taskStartLabel = jLabel18;
        home12.refreshTable();
        Home home21 = new Home();
        javax.swing.JScrollPane jScrollPane22 = null;
        home21.scrollPane = jScrollPane22;
        javax.swing.JPanel jPanel24 = home21.panel;
        SignIn signIn25 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener26 = null;
        signIn25.removeInputMethodListener(inputMethodListener26);
        boolean boolean28 = signIn25.isDisplayable();
        java.awt.LayoutManager layoutManager29 = signIn25.getLayout();
        signIn25.setIgnoreRepaint(true);
        java.awt.Component component32 = signIn25.getGlassPane();
        int int33 = jPanel24.getComponentZOrder((java.awt.Component) signIn25);
        java.awt.Font font34 = jPanel24.getFont();
        home12.setFont(font34);
        java.awt.FontMetrics fontMetrics36 = home0.getFontMetrics(font34);
        org.junit.Assert.assertNotNull(jButton8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jButton11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(jComboBox16);
        org.junit.Assert.assertNotNull(jLabel18);
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(layoutManager29);
        org.junit.Assert.assertNotNull(component32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(font34);
        org.junit.Assert.assertNotNull(fontMetrics36);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.image.ColorModel colorModel6 = signIn0.getColorModel();
        Home home7 = new Home();
        javax.swing.JLabel jLabel8 = home7.taskDescLabel;
        home7.rsp = "hi!";
        javax.swing.JComboBox jComboBox11 = home7.statusDropdown;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskDescLabel;
        home7.taskStartLabel = jLabel13;
        int int15 = jLabel13.countComponents();
        java.awt.Component component16 = signIn0.add((java.awt.Component) jLabel13);
        java.awt.event.FocusEvent.Cause cause17 = null;
        boolean boolean18 = jLabel13.requestFocusInWindow(cause17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(colorModel6);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(component16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        javax.swing.JButton jButton4 = home0.profileBtn;
        java.awt.image.ImageProducer imageProducer5 = null;
        java.awt.Image image6 = jButton4.createImage(imageProducer5);
        boolean boolean7 = jButton4.isBackgroundSet();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertNotNull(jButton4);
        org.junit.Assert.assertNotNull(image6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        Home home2 = new Home();
        javax.swing.JScrollPane jScrollPane3 = null;
        home2.scrollPane = jScrollPane3;
        javax.swing.JPanel jPanel5 = home2.panel;
        com.toedter.calendar.JDateChooser jDateChooser6 = home2.stDate;
        home0.enDate = jDateChooser6;
        home0.revalidate();
        home0.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str13 = home0.user_id;
        java.awt.Container container14 = home0.getFocusCycleRootAncestor();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jDateChooser6);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "User Signup" + "'", str13, "User Signup");
        org.junit.Assert.assertNull(container14);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.Container container4 = signIn0.getParent();
        SignIn signIn5 = new SignIn();
        java.awt.Event event6 = null;
        boolean boolean9 = signIn5.mouseDrag(event6, 10, (int) (byte) -1);
        boolean boolean10 = signIn5.isForegroundSet();
        java.awt.Dimension dimension11 = signIn5.preferredSize();
        signIn0.setMinimumSize(dimension11);
        java.awt.event.HierarchyListener hierarchyListener13 = null;
        signIn0.addHierarchyListener(hierarchyListener13);
        signIn0.show();
        signIn0.invalidate();
        java.awt.Point point17 = signIn0.getLocation();
        java.awt.image.ImageProducer imageProducer18 = null;
        java.awt.Image image19 = signIn0.createImage(imageProducer18);
        javax.swing.JPasswordField jPasswordField20 = signIn0.textPassword;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(container4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dimension11);
        org.junit.Assert.assertNotNull(point17);
        org.junit.Assert.assertNotNull(image19);
        org.junit.Assert.assertNotNull(jPasswordField20);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JButton jButton3 = home0.profileBtn;
        java.awt.Dimension dimension4 = home0.getMinimumSize();
        java.awt.Graphics graphics5 = home0.getGraphics();
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jButton3);
        org.junit.Assert.assertNotNull(dimension4);
        org.junit.Assert.assertNull(graphics5);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener2 = null;
        signIn1.removeInputMethodListener(inputMethodListener2);
        boolean boolean4 = signIn1.isDisplayable();
        java.awt.LayoutManager layoutManager5 = signIn1.getLayout();
        signIn1.setIgnoreRepaint(true);
        SignIn signIn8 = new SignIn();
        java.awt.Event event9 = null;
        boolean boolean12 = signIn8.mouseDrag(event9, 10, (int) (byte) -1);
        boolean boolean13 = signIn8.isForegroundSet();
        java.awt.Window window14 = signIn8.getOwner();
        boolean boolean15 = signIn1.isFocusCycleRoot((java.awt.Container) signIn8);
        SignIn signIn16 = new SignIn();
        int int17 = signIn16.getState();
        java.util.List<java.awt.Image> imageList18 = signIn16.getIconImages();
        java.awt.image.ImageProducer imageProducer19 = null;
        java.awt.Image image20 = signIn16.createImage(imageProducer19);
        boolean boolean26 = signIn8.imageUpdate(image20, 9, 0, 212, 3, (int) (short) 0);
        userProfile0.setIconImage(image20);
        javax.swing.JTextField jTextField28 = userProfile0.emailTextField;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(layoutManager5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(window14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(imageList18);
        org.junit.Assert.assertNotNull(image20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jTextField28);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        java.awt.LayoutManager layoutManager6 = signIn0.getLayout();
        java.awt.event.ComponentListener componentListener7 = null;
        signIn0.removeComponentListener(componentListener7);
        DataAccess dataAccess9 = signIn0.api;
        java.awt.event.WindowFocusListener[] windowFocusListenerArray10 = signIn0.getWindowFocusListeners();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(layoutManager6);
        org.junit.Assert.assertNull(dataAccess9);
        org.junit.Assert.assertNotNull(windowFocusListenerArray10);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JButton jButton3 = home0.profileBtn;
        SignUp signUp4 = new SignUp();
        java.awt.Component[] componentArray5 = signUp4.getComponents();
        boolean boolean6 = jButton3.isFocusCycleRoot((java.awt.Container) signUp4);
        javax.swing.JButton jButton7 = null;
        signUp4.buttonSignup = jButton7;
        javax.swing.JTextField jTextField9 = signUp4.profileNameTextField;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jButton3);
        org.junit.Assert.assertNotNull(componentArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jTextField9);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        int int2 = home0.sel_task_id;
        SignIn signIn3 = new SignIn();
        int int4 = signIn3.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray6 = signIn3.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField7 = signIn3.textPassword;
        java.awt.LayoutManager layoutManager8 = jPasswordField7.getLayout();
        boolean boolean9 = jPasswordField7.isMaximumSizeSet();
        home0.taskTypeField = jPasswordField7;
        java.awt.event.MouseListener mouseListener11 = null;
        home0.removeMouseListener(mouseListener11);
        boolean boolean13 = home0.isFocusable();
        SignUp signUp14 = new SignUp();
        SignUp signUp15 = new SignUp();
        javax.swing.JPasswordField jPasswordField16 = signUp15.textPassword;
        signUp14.profileNameTextField = jPasswordField16;
        home0.taskStartField = jPasswordField16;
        home0.addJob();
        com.toedter.calendar.JDateChooser jDateChooser20 = home0.enDate;
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray6);
        org.junit.Assert.assertNotNull(jPasswordField7);
        org.junit.Assert.assertNotNull(layoutManager8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jPasswordField16);
        org.junit.Assert.assertNotNull(jDateChooser20);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        Home home4 = new Home();
        javax.swing.JTextField jTextField5 = home4.taskStartField;
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        home4.enDate = jDateChooser10;
        home4.revalidate();
        home4.firePropertyChange("SignIn[frame2,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]", (byte) -1, (byte) 10);
        java.lang.String str17 = home4.user_id;
        javax.swing.JScrollPane jScrollPane18 = home4.scrollPane;
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        jScrollPane18.addMouseMotionListener(mouseMotionListener19);
        home0.scrollPane = jScrollPane18;
        Home home22 = new Home();
        javax.swing.JScrollPane jScrollPane23 = null;
        home22.scrollPane = jScrollPane23;
        javax.swing.JPanel jPanel25 = home22.panel;
        javax.swing.JTextField jTextField26 = home22.taskStartField;
        Home home27 = new Home();
        javax.swing.JLabel jLabel28 = home27.taskDescLabel;
        home27.rsp = "hi!";
        javax.swing.JComboBox jComboBox31 = home27.statusDropdown;
        Home home32 = new Home();
        javax.swing.JLabel jLabel33 = home32.taskDescLabel;
        home27.taskStartLabel = jLabel33;
        home22.lblScheduledBy = jLabel33;
        home0.taskNameLabel = jLabel33;
        home0.toFront();
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "User Signup" + "'", str17, "User Signup");
        org.junit.Assert.assertNotNull(jScrollPane18);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertNotNull(jLabel28);
        org.junit.Assert.assertNotNull(jComboBox31);
        org.junit.Assert.assertNotNull(jLabel33);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        SignIn signIn6 = new SignIn();
        int int7 = signIn6.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = signIn6.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField10 = signIn6.textUsername;
        home0.taskStartField = jTextField10;
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = home12.taskStartLabel;
        home0.lblScheduledBy = jLabel13;
        java.awt.ComponentOrientation componentOrientation15 = home0.getComponentOrientation();
        javax.swing.JButton jButton16 = home0.updateJob;
        home0.addJob();
        SignIn signIn18 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        signIn18.removeInputMethodListener(inputMethodListener19);
        boolean boolean21 = signIn18.isDisplayable();
        java.awt.LayoutManager layoutManager22 = signIn18.getLayout();
        signIn18.setIgnoreRepaint(true);
        SignIn signIn25 = new SignIn();
        java.awt.Event event26 = null;
        boolean boolean29 = signIn25.mouseDrag(event26, 10, (int) (byte) -1);
        boolean boolean30 = signIn25.isForegroundSet();
        java.awt.Window window31 = signIn25.getOwner();
        boolean boolean32 = signIn18.isFocusCycleRoot((java.awt.Container) signIn25);
        signIn18.repaint((long) (short) 1);
        SignIn signIn35 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener36 = null;
        signIn35.removeInputMethodListener(inputMethodListener36);
        boolean boolean38 = signIn35.isDisplayable();
        java.awt.Container container39 = signIn35.getParent();
        SignIn signIn40 = new SignIn();
        java.awt.Event event41 = null;
        boolean boolean44 = signIn40.mouseDrag(event41, 10, (int) (byte) -1);
        boolean boolean45 = signIn40.isForegroundSet();
        java.awt.Dimension dimension46 = signIn40.preferredSize();
        signIn35.setMinimumSize(dimension46);
        java.awt.event.HierarchyListener hierarchyListener48 = null;
        signIn35.addHierarchyListener(hierarchyListener48);
        SignIn signIn50 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener51 = null;
        signIn50.removeInputMethodListener(inputMethodListener51);
        boolean boolean53 = signIn50.isDisplayable();
        java.awt.LayoutManager layoutManager54 = signIn50.getLayout();
        signIn35.setLayout(layoutManager54);
        java.awt.Rectangle rectangle56 = signIn35.getMaximizedBounds();
        boolean boolean57 = signIn18.isFocusCycleRoot((java.awt.Container) signIn35);
        SignIn signIn58 = new SignIn();
        int int59 = signIn58.getState();
        java.util.List<java.awt.Image> imageList60 = signIn58.getIconImages();
        java.awt.image.ImageProducer imageProducer61 = null;
        java.awt.Image image62 = signIn58.createImage(imageProducer61);
        boolean boolean68 = signIn35.imageUpdate(image62, 10, 0, 32, 100, 5);
        SignIn signIn71 = new SignIn();
        float float72 = signIn71.getAlignmentY();
        boolean boolean73 = signIn71.getFocusTraversalKeysEnabled();
        java.lang.String str74 = signIn71.toString();
        int int75 = home0.checkImage(image62, 0, (-1), (java.awt.image.ImageObserver) signIn71);
        java.lang.Object obj76 = home0.getTreeLock();
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
        org.junit.Assert.assertNotNull(jTextField10);
        org.junit.Assert.assertNotNull(jLabel13);
        org.junit.Assert.assertNotNull(componentOrientation15);
        org.junit.Assert.assertNotNull(jButton16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(layoutManager22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(window31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(container39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(dimension46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(layoutManager54);
        org.junit.Assert.assertNull(rectangle56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(imageList60);
        org.junit.Assert.assertNotNull(image62);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.5f + "'", float72 == 0.5f);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str74 + "' != '" + "SignIn[frame16,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]" + "'", str74, "SignIn[frame16,610,212,700x600,invalid,hidden,layout=java.awt.BorderLayout,title=User Signup,resizable,normal,defaultCloseOperation=EXIT_ON_CLOSE,rootPane=javax.swing.JRootPane[,0,0,0x0,invalid,layout=javax.swing.JRootPane$RootLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=16777673,maximumSize=,minimumSize=,preferredSize=],rootPaneCheckingEnabled=true]");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        Home home0 = new Home();
        javax.swing.JLabel jLabel1 = home0.taskDescLabel;
        home0.rsp = "hi!";
        javax.swing.JComboBox jComboBox4 = home0.statusDropdown;
        java.awt.image.VolatileImage volatileImage7 = jComboBox4.createVolatileImage(0, 9);
        jComboBox4.layout();
        org.junit.Assert.assertNotNull(jLabel1);
        org.junit.Assert.assertNotNull(jComboBox4);
        org.junit.Assert.assertNull(volatileImage7);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        home0.setFocusTraversalKeysEnabled(true);
        java.awt.event.WindowListener[] windowListenerArray7 = home0.getWindowListeners();
        home0.firePropertyChange("User Signup", (long) ' ', 1L);
        Home home12 = new Home();
        javax.swing.JLabel jLabel13 = null;
        home12.taskEndLabel = jLabel13;
        home12.rsp = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        java.awt.Window window17 = home12.getOwner();
        java.awt.Event event18 = null;
        SignUp signUp19 = new SignUp();
        SignIn signIn20 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener21 = null;
        signIn20.removeInputMethodListener(inputMethodListener21);
        boolean boolean23 = signIn20.isDisplayable();
        java.awt.LayoutManager layoutManager24 = signIn20.getLayout();
        signIn20.setIgnoreRepaint(true);
        SignIn signIn27 = new SignIn();
        java.awt.Event event28 = null;
        boolean boolean31 = signIn27.mouseDrag(event28, 10, (int) (byte) -1);
        boolean boolean32 = signIn27.isForegroundSet();
        java.awt.Window window33 = signIn27.getOwner();
        boolean boolean34 = signIn20.isFocusCycleRoot((java.awt.Container) signIn27);
        boolean boolean35 = signIn27.isPreferredSizeSet();
        signUp19.signIn = signIn27;
        javax.swing.JTextField jTextField37 = signUp19.textUsername;
        SignIn signIn38 = new SignIn();
        int int39 = signIn38.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray41 = signIn38.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JPasswordField jPasswordField42 = signIn38.textPassword;
        signUp19.textUsername = jPasswordField42;
        Home home44 = new Home();
        javax.swing.JTextField jTextField45 = home44.taskStartField;
        Home home46 = new Home();
        javax.swing.JScrollPane jScrollPane47 = null;
        home46.scrollPane = jScrollPane47;
        javax.swing.JPanel jPanel49 = home46.panel;
        com.toedter.calendar.JDateChooser jDateChooser50 = home46.stDate;
        home44.enDate = jDateChooser50;
        signUp19.addPropertyChangeListener((java.beans.PropertyChangeListener) jDateChooser50);
        Home home53 = new Home();
        javax.swing.JTextField jTextField54 = home53.taskStartField;
        boolean boolean55 = home53.isOpaque();
        javax.swing.JTable jTable56 = home53.table;
        javax.swing.JButton jButton57 = home53.profileBtn;
        signUp19.buttonSignup = jButton57;
        boolean boolean59 = home12.lostFocus(event18, (java.lang.Object) jButton57);
        home0.addJob = jButton57;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(windowListenerArray7);
        org.junit.Assert.assertNull(window17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(layoutManager24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(window33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jTextField37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray41);
        org.junit.Assert.assertNotNull(jPasswordField42);
        org.junit.Assert.assertNull(jTextField45);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jDateChooser50);
        org.junit.Assert.assertNull(jTextField54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jTable56);
        org.junit.Assert.assertNotNull(jButton57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        java.awt.Dimension dimension3 = signIn0.minimumSize();
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray4 = signIn0.getMouseMotionListeners();
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray5 = signIn0.getMouseWheelListeners();
        SignIn signIn6 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener7 = null;
        signIn6.removeInputMethodListener(inputMethodListener7);
        boolean boolean9 = signIn6.isDisplayable();
        java.awt.Container container10 = signIn6.getParent();
        SignIn signIn11 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        signIn11.removeInputMethodListener(inputMethodListener12);
        boolean boolean14 = signIn11.isDisplayable();
        java.awt.Event event15 = null;
        boolean boolean17 = signIn11.keyDown(event15, (int) '4');
        java.awt.Color color18 = signIn11.getBackground();
        signIn6.setBackground(color18);
        java.awt.dnd.DropTarget dropTarget20 = null;
        signIn6.setDropTarget(dropTarget20);
        Home home22 = new Home();
        javax.swing.JLabel jLabel23 = null;
        home22.taskEndLabel = jLabel23;
        Home home25 = new Home();
        javax.swing.JLabel jLabel26 = home25.taskStartLabel;
        home22.taskTypeLabel = jLabel26;
        java.awt.Point point28 = home22.getLocation();
        java.awt.Component component29 = signIn6.findComponentAt(point28);
        java.awt.Cursor cursor30 = signIn6.getCursor();
        signIn0.setCursor(cursor30);
        org.junit.Assert.assertNotNull(dimension3);
        org.junit.Assert.assertNotNull(mouseMotionListenerArray4);
        org.junit.Assert.assertNotNull(mouseWheelListenerArray5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(container10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(color18);
        org.junit.Assert.assertNotNull(jLabel26);
        org.junit.Assert.assertNotNull(point28);
        org.junit.Assert.assertNull(component29);
        org.junit.Assert.assertNotNull(cursor30);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.event.FocusEvent.Cause cause4 = null;
        boolean boolean5 = signIn0.requestFocusInWindow(cause4);
        signIn0.setBounds(9, 1, 40, 4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        SignIn signIn0 = new SignIn();
        int int1 = signIn0.getState();
        java.util.List<java.awt.Image> imageList2 = signIn0.getIconImages();
        java.awt.Point point3 = signIn0.getMousePosition();
        java.awt.event.WindowFocusListener windowFocusListener4 = null;
        signIn0.removeWindowFocusListener(windowFocusListener4);
        java.awt.Graphics graphics6 = null;
        signIn0.print(graphics6);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener8 = null;
        signIn0.removeHierarchyBoundsListener(hierarchyBoundsListener8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(imageList2);
        org.junit.Assert.assertNull(point3);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        Home home0 = new Home();
        javax.swing.JTextField jTextField1 = home0.taskStartField;
        boolean boolean2 = home0.isOpaque();
        javax.swing.JTable jTable3 = home0.table;
        java.awt.dnd.DropTarget dropTarget4 = null;
        home0.setDropTarget(dropTarget4);
        home0.deleteJob();
        Home home7 = new Home();
        javax.swing.JLabel jLabel8 = home7.taskDescLabel;
        home7.rsp = "hi!";
        javax.swing.JComboBox jComboBox11 = home7.statusDropdown;
        Home home12 = new Home();
        javax.swing.JScrollPane jScrollPane13 = null;
        home12.scrollPane = jScrollPane13;
        javax.swing.JPanel jPanel15 = home12.panel;
        javax.swing.JTextField jTextField16 = home12.taskStartField;
        java.lang.String str17 = home12.rsp;
        javax.swing.JComboBox jComboBox18 = home12.priorityDropdown;
        home7.scheduleDropdown = jComboBox18;
        Home home20 = new Home();
        javax.swing.JLabel jLabel21 = home20.taskStartLabel;
        Home home22 = new Home();
        javax.swing.JScrollPane jScrollPane23 = null;
        home22.scrollPane = jScrollPane23;
        javax.swing.JPanel jPanel25 = home22.panel;
        javax.swing.JTextField jTextField26 = home22.taskStartField;
        Home home27 = new Home();
        javax.swing.JScrollPane jScrollPane28 = null;
        home27.scrollPane = jScrollPane28;
        javax.swing.JButton jButton30 = home27.updateJob;
        home22.deleteJob = jButton30;
        home20.addJob = jButton30;
        javax.swing.JTable jTable33 = home20.table;
        home7.table = jTable33;
        home0.table = jTable33;
        home0.rsp = "";
        org.junit.Assert.assertNull(jTextField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(jTable3);
        org.junit.Assert.assertNotNull(jLabel8);
        org.junit.Assert.assertNotNull(jComboBox11);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNull(jTextField16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(jComboBox18);
        org.junit.Assert.assertNotNull(jLabel21);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNull(jTextField26);
        org.junit.Assert.assertNotNull(jButton30);
        org.junit.Assert.assertNotNull(jTable33);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        javax.swing.JTextField jTextField4 = home0.taskStartField;
        java.lang.String str5 = home0.rsp;
        UserProfile userProfile6 = home0.userProfile;
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = home0.getHierarchyListeners();
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertNull(jTextField4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(userProfile6);
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.table.DefaultTableModel defaultTableModel3 = home0.tableModel;
        javax.swing.JTable jTable4 = home0.table;
        java.awt.Graphics graphics5 = null;
        home0.update(graphics5);
        java.lang.String str7 = home0.rsp;
        home0.deleteJob();
        org.junit.Assert.assertNotNull(defaultTableModel3);
        org.junit.Assert.assertNotNull(jTable4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        SignIn signIn0 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener1 = null;
        signIn0.removeInputMethodListener(inputMethodListener1);
        boolean boolean3 = signIn0.isDisplayable();
        java.awt.LayoutManager layoutManager4 = signIn0.getLayout();
        signIn0.setIgnoreRepaint(true);
        SignIn signIn7 = new SignIn();
        java.awt.Event event8 = null;
        boolean boolean11 = signIn7.mouseDrag(event8, 10, (int) (byte) -1);
        boolean boolean12 = signIn7.isForegroundSet();
        java.awt.Window window13 = signIn7.getOwner();
        boolean boolean14 = signIn0.isFocusCycleRoot((java.awt.Container) signIn7);
        SignIn signIn15 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener16 = null;
        signIn15.removeInputMethodListener(inputMethodListener16);
        boolean boolean18 = signIn15.isDisplayable();
        java.awt.LayoutManager layoutManager19 = signIn15.getLayout();
        signIn15.setIgnoreRepaint(true);
        SignIn signIn22 = new SignIn();
        java.awt.Event event23 = null;
        boolean boolean26 = signIn22.mouseDrag(event23, 10, (int) (byte) -1);
        boolean boolean27 = signIn22.isForegroundSet();
        java.awt.Window window28 = signIn22.getOwner();
        boolean boolean29 = signIn15.isFocusCycleRoot((java.awt.Container) signIn22);
        java.awt.Dimension dimension30 = signIn22.minimumSize();
        signIn7.setMaximumSize(dimension30);
        int int32 = signIn7.getY();
        java.awt.Rectangle rectangle33 = signIn7.bounds();
        java.awt.Dimension dimension34 = signIn7.preferredSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(layoutManager4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(window13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(layoutManager19);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(window28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dimension30);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 212 + "'", int32 == 212);
        org.junit.Assert.assertNotNull(rectangle33);
        org.junit.Assert.assertNotNull(dimension34);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        SignIn signIn0 = new SignIn();
        java.awt.Event event1 = null;
        boolean boolean4 = signIn0.mouseDrag(event1, 10, (int) (byte) -1);
        Home home6 = new Home();
        javax.swing.JScrollPane jScrollPane7 = null;
        home6.scrollPane = jScrollPane7;
        javax.swing.JPanel jPanel9 = home6.panel;
        com.toedter.calendar.JDateChooser jDateChooser10 = home6.stDate;
        jDateChooser10.firePropertyChange("", (byte) 1, (byte) 1);
        signIn0.addPropertyChangeListener("", (java.beans.PropertyChangeListener) jDateChooser10);
        java.util.Locale locale16 = signIn0.getLocale();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jPanel9);
        org.junit.Assert.assertNotNull(jDateChooser10);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        home0.sel_task_id = 5;
        boolean boolean8 = home0.isActive();
        SignIn signIn9 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener10 = null;
        signIn9.removeInputMethodListener(inputMethodListener10);
        boolean boolean12 = signIn9.isDisplayable();
        java.awt.LayoutManager layoutManager13 = signIn9.getLayout();
        signIn9.setIgnoreRepaint(true);
        SignIn signIn16 = new SignIn();
        java.awt.Event event17 = null;
        boolean boolean20 = signIn16.mouseDrag(event17, 10, (int) (byte) -1);
        boolean boolean21 = signIn16.isForegroundSet();
        java.awt.Window window22 = signIn16.getOwner();
        boolean boolean23 = signIn9.isFocusCycleRoot((java.awt.Container) signIn16);
        SignIn signIn24 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener25 = null;
        signIn24.removeInputMethodListener(inputMethodListener25);
        boolean boolean27 = signIn24.isDisplayable();
        java.awt.LayoutManager layoutManager28 = signIn24.getLayout();
        signIn24.setIgnoreRepaint(true);
        SignIn signIn31 = new SignIn();
        java.awt.Event event32 = null;
        boolean boolean35 = signIn31.mouseDrag(event32, 10, (int) (byte) -1);
        boolean boolean36 = signIn31.isForegroundSet();
        java.awt.Window window37 = signIn31.getOwner();
        boolean boolean38 = signIn24.isFocusCycleRoot((java.awt.Container) signIn31);
        java.awt.Dimension dimension39 = signIn31.minimumSize();
        signIn16.setMaximumSize(dimension39);
        int int41 = signIn16.getY();
        java.awt.Rectangle rectangle42 = signIn16.bounds();
        home0.setMaximizedBounds(rectangle42);
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(layoutManager13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(window22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(layoutManager28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(window37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dimension39);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 212 + "'", int41 == 212);
        org.junit.Assert.assertNotNull(rectangle42);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        SignIn signIn0 = new SignIn();
        float float1 = signIn0.getAlignmentY();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray2 = signIn0.getPropertyChangeListeners();
        signIn0.firePropertyChange("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", (byte) 0, (byte) 0);
        java.awt.image.VolatileImage volatileImage9 = signIn0.createVolatileImage(100, 0);
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.5f + "'", float1 == 0.5f);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray2);
        org.junit.Assert.assertNull(volatileImage9);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        Home home0 = new Home();
        javax.swing.JScrollPane jScrollPane1 = null;
        home0.scrollPane = jScrollPane1;
        javax.swing.JPanel jPanel3 = home0.panel;
        boolean boolean4 = home0.isOpaque();
        javax.swing.JTextField jTextField5 = home0.taskStartField;
        home0.sel_task_id = 5;
        boolean boolean8 = home0.isActive();
        Home home9 = new Home();
        javax.swing.JScrollPane jScrollPane10 = null;
        home9.scrollPane = jScrollPane10;
        javax.swing.table.DefaultTableModel defaultTableModel12 = home9.tableModel;
        home0.tableModel = defaultTableModel12;
        org.junit.Assert.assertNotNull(jPanel3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(jTextField5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(defaultTableModel12);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.Event event2 = null;
        boolean boolean5 = signIn1.mouseDrag(event2, 10, (int) (byte) -1);
        java.awt.Event event6 = null;
        boolean boolean9 = signIn1.mouseUp(event6, (-1), (int) '4');
        signIn1.show(false);
        signIn1.doLayout();
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = null;
        home13.taskEndLabel = jLabel14;
        Home home16 = new Home();
        javax.swing.JLabel jLabel17 = home16.taskStartLabel;
        home13.taskTypeLabel = jLabel17;
        java.awt.Point point19 = home13.getLocation();
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JButton jButton23 = home20.updateJob;
        home13.updateJob = jButton23;
        signIn1.buttonSignup = jButton23;
        SignIn signIn26 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        signIn26.removeInputMethodListener(inputMethodListener27);
        boolean boolean29 = signIn26.isDisplayable();
        java.awt.LayoutManager layoutManager30 = signIn26.getLayout();
        Home home31 = new Home();
        javax.swing.JScrollPane jScrollPane32 = null;
        home31.scrollPane = jScrollPane32;
        javax.swing.JPanel jPanel34 = home31.panel;
        boolean boolean35 = home31.isOpaque();
        javax.swing.JTextField jTextField36 = home31.taskStartField;
        SignIn signIn37 = new SignIn();
        int int38 = signIn37.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray40 = signIn37.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField41 = signIn37.textUsername;
        home31.taskStartField = jTextField41;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = home43.taskStartLabel;
        home31.lblScheduledBy = jLabel44;
        java.awt.ComponentOrientation componentOrientation46 = home31.getComponentOrientation();
        signIn26.setComponentOrientation(componentOrientation46);
        jButton23.setComponentOrientation(componentOrientation46);
        userProfile0.backButton = jButton23;
        java.lang.String str50 = userProfile0.user_id;
        userProfile0.toFront();
        Home home52 = new Home();
        javax.swing.JTextField jTextField53 = home52.taskStartField;
        boolean boolean54 = home52.isOpaque();
        javax.swing.JTable jTable55 = home52.table;
        javax.swing.JButton jButton56 = home52.profileBtn;
        userProfile0.btnUpdatePassword = jButton56;
        java.lang.String str58 = userProfile0.respN;
        userProfile0.loadProfile();
        javax.swing.JPasswordField jPasswordField60 = userProfile0.oldPasstextField;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jLabel17);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(jButton23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(layoutManager30);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(jTextField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray40);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(componentOrientation46);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User Signup" + "'", str50, "User Signup");
        org.junit.Assert.assertNull(jTextField53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jTable55);
        org.junit.Assert.assertNotNull(jButton56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(jPasswordField60);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        UserProfile userProfile0 = new UserProfile();
        SignIn signIn1 = new SignIn();
        java.awt.Event event2 = null;
        boolean boolean5 = signIn1.mouseDrag(event2, 10, (int) (byte) -1);
        java.awt.Event event6 = null;
        boolean boolean9 = signIn1.mouseUp(event6, (-1), (int) '4');
        signIn1.show(false);
        signIn1.doLayout();
        Home home13 = new Home();
        javax.swing.JLabel jLabel14 = null;
        home13.taskEndLabel = jLabel14;
        Home home16 = new Home();
        javax.swing.JLabel jLabel17 = home16.taskStartLabel;
        home13.taskTypeLabel = jLabel17;
        java.awt.Point point19 = home13.getLocation();
        Home home20 = new Home();
        javax.swing.JScrollPane jScrollPane21 = null;
        home20.scrollPane = jScrollPane21;
        javax.swing.JButton jButton23 = home20.updateJob;
        home13.updateJob = jButton23;
        signIn1.buttonSignup = jButton23;
        SignIn signIn26 = new SignIn();
        java.awt.event.InputMethodListener inputMethodListener27 = null;
        signIn26.removeInputMethodListener(inputMethodListener27);
        boolean boolean29 = signIn26.isDisplayable();
        java.awt.LayoutManager layoutManager30 = signIn26.getLayout();
        Home home31 = new Home();
        javax.swing.JScrollPane jScrollPane32 = null;
        home31.scrollPane = jScrollPane32;
        javax.swing.JPanel jPanel34 = home31.panel;
        boolean boolean35 = home31.isOpaque();
        javax.swing.JTextField jTextField36 = home31.taskStartField;
        SignIn signIn37 = new SignIn();
        int int38 = signIn37.getState();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray40 = signIn37.getPropertyChangeListeners("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855");
        javax.swing.JTextField jTextField41 = signIn37.textUsername;
        home31.taskStartField = jTextField41;
        Home home43 = new Home();
        javax.swing.JLabel jLabel44 = home43.taskStartLabel;
        home31.lblScheduledBy = jLabel44;
        java.awt.ComponentOrientation componentOrientation46 = home31.getComponentOrientation();
        signIn26.setComponentOrientation(componentOrientation46);
        jButton23.setComponentOrientation(componentOrientation46);
        userProfile0.backButton = jButton23;
        java.lang.String str50 = userProfile0.user_id;
        userProfile0.toFront();
        userProfile0.updateProfileInfo();
        java.awt.Container container53 = userProfile0.getContentPane();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jLabel17);
        org.junit.Assert.assertNotNull(point19);
        org.junit.Assert.assertNotNull(jButton23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(layoutManager30);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(jTextField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(propertyChangeListenerArray40);
        org.junit.Assert.assertNotNull(jTextField41);
        org.junit.Assert.assertNotNull(jLabel44);
        org.junit.Assert.assertNotNull(componentOrientation46);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "User Signup" + "'", str50, "User Signup");
        org.junit.Assert.assertNotNull(container53);
    }
}

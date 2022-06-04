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
        observer.Updater updater0 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.Desktop desktop1 = new observer.Desktop(updater0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        java.lang.Class<?> wildcardClass10 = laptop8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass9 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        observer.Updater updater1 = new observer.Updater((double) 100);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = laptop3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        java.lang.Class<?> wildcardClass8 = laptop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass10 = desktop9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        observer.Laptop laptop14 = new observer.Laptop(updater12);
        updater12.updateVersion((double) (short) 1);
        updater12.updateVersion((double) 0);
        updater12.updateVersion((double) (short) 0);
        observer.Desktop desktop21 = new observer.Desktop(updater12);
        observer.Laptop laptop22 = new observer.Laptop(updater12);
        updater1.attach((observer.Device) laptop22);
        java.lang.Class<?> wildcardClass24 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        updater1.updateVersion((double) 'a');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        observer.Laptop laptop14 = new observer.Laptop(updater12);
        updater12.updateVersion((double) (short) 1);
        updater12.updateVersion((double) 0);
        updater12.updateVersion((double) (short) 0);
        observer.Desktop desktop21 = new observer.Desktop(updater12);
        observer.Laptop laptop22 = new observer.Laptop(updater12);
        updater1.attach((observer.Device) laptop22);
        java.lang.Class<?> wildcardClass24 = laptop22.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Updater updater13 = new observer.Updater((double) 0.0f);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        observer.Laptop laptop17 = new observer.Laptop(updater15);
        updater15.updateVersion((double) (short) 1);
        updater15.updateVersion((double) 0);
        updater15.updateVersion((double) (short) 0);
        observer.Desktop desktop24 = new observer.Desktop(updater15);
        updater13.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        observer.Updater updater28 = new observer.Updater(0.0d);
        updater28.updateVersion((double) 0L);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater1.attach((observer.Device) laptop31);
        updater1.updateVersion(1.0d);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Updater updater13 = new observer.Updater((double) 0.0f);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        observer.Laptop laptop17 = new observer.Laptop(updater15);
        updater15.updateVersion((double) (short) 1);
        updater15.updateVersion((double) 0);
        updater15.updateVersion((double) (short) 0);
        observer.Desktop desktop24 = new observer.Desktop(updater15);
        updater13.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        observer.Updater updater28 = new observer.Updater(0.0d);
        updater28.updateVersion((double) 0L);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater1.attach((observer.Device) laptop31);
        observer.Desktop desktop33 = new observer.Desktop(updater1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        java.lang.Class<?> wildcardClass13 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass12 = laptop11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        updater11.updateVersion(10.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop16);
        java.lang.Class<?> wildcardClass18 = laptop16.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        updater14.attach((observer.Device) laptop19);
        observer.Desktop desktop21 = new observer.Desktop(updater14);
        observer.Laptop laptop22 = new observer.Laptop(updater14);
        observer.Updater updater24 = new observer.Updater((double) (byte) 10);
        updater24.updateVersion(1.0d);
        updater24.updateVersion(10.0d);
        observer.Laptop laptop29 = new observer.Laptop(updater24);
        updater14.attach((observer.Device) laptop29);
        updater1.attach((observer.Device) laptop29);
        observer.Laptop laptop32 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass33 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        observer.Laptop laptop9 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop9);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater13);
        updater11.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater11);
        observer.Laptop laptop19 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop19);
        java.lang.Class<?> wildcardClass21 = laptop19.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 0);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass6 = desktop5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater3.updateVersion((double) 0L);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater16);
        observer.Laptop laptop24 = new observer.Laptop(updater16);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        updater26.updateVersion(1.0d);
        updater26.updateVersion(10.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater26);
        updater16.attach((observer.Device) laptop31);
        updater3.attach((observer.Device) laptop31);
        observer.Laptop laptop34 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop34);
        observer.Laptop laptop36 = new observer.Laptop(updater1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        observer.Updater updater1 = new observer.Updater((double) 1.0f);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater3.updateVersion((double) 0L);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater16);
        observer.Laptop laptop24 = new observer.Laptop(updater16);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        updater26.updateVersion(1.0d);
        updater26.updateVersion(10.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater26);
        updater16.attach((observer.Device) laptop31);
        updater3.attach((observer.Device) laptop31);
        observer.Laptop laptop34 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop34);
        observer.Updater updater37 = new observer.Updater(0.0d);
        updater37.updateVersion((double) 0L);
        observer.Laptop laptop40 = new observer.Laptop(updater37);
        updater1.attach((observer.Device) laptop40);
        updater1.updateVersion((double) 100.0f);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        observer.Updater updater1 = new observer.Updater((double) 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion((double) (short) 0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) (short) 100);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        updater11.updateVersion(10.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop16);
        java.lang.Class<?> wildcardClass18 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        observer.Updater updater1 = new observer.Updater((double) 10.0f);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        observer.Updater updater1 = new observer.Updater((double) '#');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        observer.Updater updater1 = new observer.Updater(10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        observer.Desktop desktop6 = new observer.Desktop(updater1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = laptop3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop7);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        updater10.attach((observer.Device) laptop16);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        observer.Laptop laptop21 = new observer.Laptop(updater19);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        updater23.updateVersion(1.0d);
        observer.Laptop laptop26 = new observer.Laptop(updater23);
        updater19.attach((observer.Device) laptop26);
        updater10.attach((observer.Device) laptop26);
        updater1.attach((observer.Device) laptop26);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        observer.Updater updater1 = new observer.Updater((double) 10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion((double) (short) 10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        updater9.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater9);
        updater7.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater7);
        observer.Desktop desktop15 = new observer.Desktop(updater7);
        updater7.updateVersion(0.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop18);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        observer.Updater updater1 = new observer.Updater((double) 1L);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass7 = desktop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass9 = laptop8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        updater7.updateVersion(1.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        updater3.attach((observer.Device) laptop10);
        updater1.attach((observer.Device) laptop10);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion(1.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        updater10.attach((observer.Device) laptop15);
        observer.Desktop desktop17 = new observer.Desktop(updater10);
        observer.Desktop desktop18 = new observer.Desktop(updater10);
        updater10.updateVersion(0.0d);
        observer.Updater updater22 = new observer.Updater(0.0d);
        updater22.updateVersion((double) 0L);
        observer.Laptop laptop25 = new observer.Laptop(updater22);
        observer.Laptop laptop26 = new observer.Laptop(updater22);
        observer.Desktop desktop27 = new observer.Desktop(updater22);
        updater10.attach((observer.Device) desktop27);
        updater1.attach((observer.Device) desktop27);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        java.lang.Class<?> wildcardClass14 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater13);
        updater11.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater11);
        observer.Laptop laptop19 = new observer.Laptop(updater11);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion(1.0d);
        updater21.updateVersion(10.0d);
        observer.Laptop laptop26 = new observer.Laptop(updater21);
        updater11.attach((observer.Device) laptop26);
        observer.Desktop desktop28 = new observer.Desktop(updater11);
        updater1.attach((observer.Device) desktop28);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Updater updater13 = new observer.Updater((double) 0.0f);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        observer.Laptop laptop17 = new observer.Laptop(updater15);
        updater15.updateVersion((double) (short) 1);
        updater15.updateVersion((double) 0);
        updater15.updateVersion((double) (short) 0);
        observer.Desktop desktop24 = new observer.Desktop(updater15);
        updater13.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        observer.Updater updater28 = new observer.Updater(0.0d);
        updater28.updateVersion((double) 0L);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater1.attach((observer.Device) laptop31);
        updater1.updateVersion((double) 0.0f);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100.0f);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        observer.Updater updater1 = new observer.Updater((double) (-1.0f));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(100.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        observer.Updater updater1 = new observer.Updater(1.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion(1.0d);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        updater10.attach((observer.Device) laptop17);
        updater1.attach((observer.Device) laptop17);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        observer.Updater updater1 = new observer.Updater(100.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        updater9.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater9);
        updater7.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater7);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        updater7.attach((observer.Device) laptop19);
        observer.Desktop desktop21 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop21);
        observer.Laptop laptop23 = new observer.Laptop(updater1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        updater14.attach((observer.Device) laptop19);
        observer.Desktop desktop21 = new observer.Desktop(updater14);
        observer.Laptop laptop22 = new observer.Laptop(updater14);
        observer.Updater updater24 = new observer.Updater((double) (byte) 10);
        updater24.updateVersion(1.0d);
        updater24.updateVersion(10.0d);
        observer.Laptop laptop29 = new observer.Laptop(updater24);
        updater14.attach((observer.Device) laptop29);
        updater1.attach((observer.Device) laptop29);
        java.lang.Class<?> wildcardClass32 = laptop29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        updater9.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater9);
        updater7.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater7);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        updater7.attach((observer.Device) laptop19);
        observer.Desktop desktop21 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop21);
        observer.Desktop desktop23 = new observer.Desktop(updater1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 10L);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) -1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater8);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop14 = new observer.Laptop(updater13);
        updater8.attach((observer.Device) laptop14);
        updater1.attach((observer.Device) laptop14);
        updater1.updateVersion((double) (short) 10);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        updater1.updateVersion((double) 10L);
        observer.Laptop laptop16 = new observer.Laptop(updater1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater3.updateVersion((double) 0L);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater16);
        observer.Laptop laptop24 = new observer.Laptop(updater16);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        updater26.updateVersion(1.0d);
        updater26.updateVersion(10.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater26);
        updater16.attach((observer.Device) laptop31);
        updater3.attach((observer.Device) laptop31);
        observer.Laptop laptop34 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop34);
        observer.Updater updater37 = new observer.Updater(0.0d);
        updater37.updateVersion((double) 0L);
        observer.Laptop laptop40 = new observer.Laptop(updater37);
        updater1.attach((observer.Device) laptop40);
        updater1.updateVersion((double) (-1L));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 'a');
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater8.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater8);
        observer.Desktop desktop16 = new observer.Desktop(updater8);
        updater8.updateVersion(0.0d);
        observer.Updater updater20 = new observer.Updater(0.0d);
        updater20.updateVersion((double) 0L);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Laptop laptop24 = new observer.Laptop(updater20);
        observer.Desktop desktop25 = new observer.Desktop(updater20);
        updater8.attach((observer.Device) desktop25);
        updater6.attach((observer.Device) desktop25);
        updater1.attach((observer.Device) desktop25);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Updater updater3 = new observer.Updater((double) 100);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Desktop desktop5 = new observer.Desktop(updater3);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100.0f);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater3);
        observer.Desktop desktop11 = new observer.Desktop(updater3);
        updater3.updateVersion(0.0d);
        observer.Updater updater15 = new observer.Updater(0.0d);
        updater15.updateVersion((double) 0L);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        observer.Laptop laptop19 = new observer.Laptop(updater15);
        observer.Desktop desktop20 = new observer.Desktop(updater15);
        updater3.attach((observer.Device) desktop20);
        updater1.attach((observer.Device) desktop20);
        observer.Desktop desktop23 = new observer.Desktop(updater1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion((-1.0d));
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater8);
        updater6.attach((observer.Device) laptop11);
        updater1.attach((observer.Device) laptop11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Updater updater3 = new observer.Updater((-1.0d));
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater3.updateVersion((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        observer.Updater updater1 = new observer.Updater((double) (-1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 10.0f);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater3.updateVersion((double) 0L);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater16);
        observer.Laptop laptop24 = new observer.Laptop(updater16);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        updater26.updateVersion(1.0d);
        updater26.updateVersion(10.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater26);
        updater16.attach((observer.Device) laptop31);
        updater3.attach((observer.Device) laptop31);
        observer.Laptop laptop34 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop34);
        observer.Updater updater37 = new observer.Updater(0.0d);
        updater37.updateVersion((double) 0L);
        observer.Laptop laptop40 = new observer.Laptop(updater37);
        updater1.attach((observer.Device) laptop40);
        observer.Laptop laptop42 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass43 = laptop42.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        updater5.updateVersion(10.0d);
        observer.Desktop desktop10 = new observer.Desktop(updater5);
        observer.Laptop laptop11 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop11);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Updater updater11 = new observer.Updater((double) 0.0f);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop14 = new observer.Laptop(updater13);
        observer.Laptop laptop15 = new observer.Laptop(updater13);
        updater13.updateVersion((double) (short) 1);
        updater13.updateVersion((double) 0);
        updater13.updateVersion((double) (short) 0);
        observer.Desktop desktop22 = new observer.Desktop(updater13);
        updater11.attach((observer.Device) desktop22);
        updater1.attach((observer.Device) desktop22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 10);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        updater6.updateVersion(1.0d);
        observer.Laptop laptop9 = new observer.Laptop(updater6);
        updater4.attach((observer.Device) laptop9);
        observer.Desktop desktop11 = new observer.Desktop(updater4);
        updater4.updateVersion(0.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater4);
        updater1.attach((observer.Device) laptop14);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        observer.Updater updater1 = new observer.Updater((double) 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass13 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) 100L);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (byte) -1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        updater5.updateVersion(10.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater5);
        observer.Updater updater12 = new observer.Updater((double) 0.0f);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop15 = new observer.Laptop(updater14);
        observer.Laptop laptop16 = new observer.Laptop(updater14);
        updater14.updateVersion((double) (short) 1);
        updater14.updateVersion((double) 0);
        updater14.updateVersion((double) (short) 0);
        observer.Desktop desktop23 = new observer.Desktop(updater14);
        updater12.attach((observer.Device) desktop23);
        updater5.attach((observer.Device) desktop23);
        updater1.attach((observer.Device) desktop23);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 100.0f);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater11);
        updater9.attach((observer.Device) laptop14);
        observer.Desktop desktop16 = new observer.Desktop(updater9);
        observer.Laptop laptop17 = new observer.Laptop(updater9);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        updater19.updateVersion(10.0d);
        observer.Laptop laptop24 = new observer.Laptop(updater19);
        updater9.attach((observer.Device) laptop24);
        updater1.attach((observer.Device) laptop24);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
        observer.Laptop laptop15 = new observer.Laptop(updater1);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        observer.Laptop laptop22 = new observer.Laptop(updater19);
        updater17.attach((observer.Device) laptop22);
        observer.Desktop desktop24 = new observer.Desktop(updater17);
        updater17.updateVersion(0.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater17);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        observer.Updater updater31 = new observer.Updater((double) (byte) 10);
        updater31.updateVersion(1.0d);
        observer.Laptop laptop34 = new observer.Laptop(updater31);
        updater29.attach((observer.Device) laptop34);
        observer.Desktop desktop36 = new observer.Desktop(updater29);
        updater17.attach((observer.Device) desktop36);
        updater1.attach((observer.Device) desktop36);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) ' ');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        updater1.updateVersion((double) (byte) 10);
    }
}


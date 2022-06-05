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
        java.lang.Class<?> wildcardClass10 = laptop8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        observer.Updater updater1 = new observer.Updater((double) 100);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = laptop3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        java.lang.Class<?> wildcardClass8 = laptop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
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
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass12 = laptop11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
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
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
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
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
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
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass6 = desktop5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
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
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        observer.Updater updater1 = new observer.Updater((double) 1.0f);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
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
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
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
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        observer.Updater updater1 = new observer.Updater((double) '#');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        observer.Updater updater1 = new observer.Updater(10.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = laptop3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
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
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        observer.Updater updater1 = new observer.Updater((double) 1L);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass7 = desktop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
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
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
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
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Updater updater3 = new observer.Updater((double) 100);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Desktop desktop5 = new observer.Desktop(updater3);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
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
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
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
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass13 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
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

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
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
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
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
        java.lang.Class<?> wildcardClass44 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater3);
        observer.Laptop laptop11 = new observer.Laptop(updater3);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        updater13.updateVersion(10.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater13);
        updater3.attach((observer.Device) laptop18);
        updater1.attach((observer.Device) laptop18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
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
        observer.Updater updater31 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop32 = new observer.Laptop(updater31);
        observer.Laptop laptop33 = new observer.Laptop(updater31);
        updater1.attach((observer.Device) laptop33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
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
        java.lang.Class<?> wildcardClass24 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
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
        java.lang.Class<?> wildcardClass24 = laptop23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
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
        java.lang.Class<?> wildcardClass25 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion((-1.0d));
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater8);
        updater6.attach((observer.Device) laptop11);
        updater1.attach((observer.Device) laptop11);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
        observer.Laptop laptop14 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater1.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 100.0f);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
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
        java.lang.Class<?> wildcardClass19 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) -1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Updater updater9 = new observer.Updater((double) 0L);
        observer.Laptop laptop10 = new observer.Laptop(updater9);
        updater1.attach((observer.Device) laptop10);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
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
        java.lang.Class<?> wildcardClass42 = laptop40.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion(1.0d);
        updater14.updateVersion(10.0d);
        observer.Updater updater20 = new observer.Updater((double) (byte) 10);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        updater22.updateVersion(1.0d);
        observer.Laptop laptop25 = new observer.Laptop(updater22);
        updater20.attach((observer.Device) laptop25);
        observer.Desktop desktop27 = new observer.Desktop(updater20);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater20.attach((observer.Device) laptop32);
        observer.Desktop desktop34 = new observer.Desktop(updater20);
        updater14.attach((observer.Device) desktop34);
        observer.Laptop laptop36 = new observer.Laptop(updater14);
        updater1.attach((observer.Device) laptop36);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater1.attach((observer.Device) laptop13);
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        // The following exception was thrown during execution in test generation
        try {
            updater1.updateVersion((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) 100L);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0.0f);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        updater10.updateVersion((double) (short) 1);
        updater10.updateVersion((double) 0);
        updater10.updateVersion((double) (short) 0);
        observer.Desktop desktop19 = new observer.Desktop(updater10);
        updater8.attach((observer.Device) desktop19);
        updater1.attach((observer.Device) desktop19);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        observer.Updater updater1 = new observer.Updater(0.0d);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
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
        java.lang.Class<?> wildcardClass24 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        observer.Updater updater1 = new observer.Updater((double) 100L);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        updater5.updateVersion(10.0d);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater13);
        updater11.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater11);
        observer.Updater updater20 = new observer.Updater((double) (byte) 10);
        updater20.updateVersion(1.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        updater11.attach((observer.Device) laptop23);
        observer.Desktop desktop25 = new observer.Desktop(updater11);
        updater5.attach((observer.Device) desktop25);
        updater1.attach((observer.Device) desktop25);
        java.lang.Class<?> wildcardClass28 = desktop25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        observer.Updater updater1 = new observer.Updater((double) 100.0f);
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
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater13);
        updater11.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater11);
        observer.Laptop laptop19 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop19);
        updater1.updateVersion((double) (short) 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater1.attach((observer.Device) laptop13);
        updater1.updateVersion(10.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        java.lang.Class<?> wildcardClass42 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
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
        observer.Updater updater17 = new observer.Updater((double) 0L);
        observer.Desktop desktop18 = new observer.Desktop(updater17);
        updater17.updateVersion((-1.0d));
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        observer.Updater updater24 = new observer.Updater((double) (byte) 10);
        updater24.updateVersion(1.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater24);
        updater22.attach((observer.Device) laptop27);
        updater17.attach((observer.Device) laptop27);
        updater1.attach((observer.Device) laptop27);
        observer.Desktop desktop31 = new observer.Desktop(updater1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 10.0f);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) ' ');
        observer.Updater updater8 = new observer.Updater((double) 100);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion(1.0d);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        updater10.attach((observer.Device) laptop17);
        updater8.attach((observer.Device) laptop17);
        observer.Laptop laptop20 = new observer.Laptop(updater8);
        updater1.attach((observer.Device) laptop20);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        observer.Updater updater1 = new observer.Updater((double) (byte) 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
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
        observer.Laptop laptop30 = new observer.Laptop(updater1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
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
        updater1.updateVersion((double) (byte) -1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        // The following exception was thrown during execution in test generation
        try {
            updater1.updateVersion((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
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
        java.lang.Class<?> wildcardClass14 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
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
        observer.Updater updater17 = new observer.Updater((double) 0L);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        updater17.updateVersion((double) (short) 10);
        observer.Desktop desktop21 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop21);
        observer.Laptop laptop23 = new observer.Laptop(updater1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
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
        observer.Laptop laptop21 = new observer.Laptop(updater1);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion(10.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
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
        updater1.updateVersion((double) 'a');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
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
        observer.Desktop desktop25 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass26 = desktop25.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        observer.Updater updater36 = new observer.Updater((double) (byte) 10);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        updater38.updateVersion(1.0d);
        observer.Laptop laptop41 = new observer.Laptop(updater38);
        updater36.attach((observer.Device) laptop41);
        observer.Desktop desktop43 = new observer.Desktop(updater36);
        observer.Desktop desktop44 = new observer.Desktop(updater36);
        updater36.updateVersion(0.0d);
        observer.Updater updater48 = new observer.Updater((double) 0.0f);
        observer.Updater updater50 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop51 = new observer.Laptop(updater50);
        observer.Laptop laptop52 = new observer.Laptop(updater50);
        updater50.updateVersion((double) (short) 1);
        updater50.updateVersion((double) 0);
        updater50.updateVersion((double) (short) 0);
        observer.Desktop desktop59 = new observer.Desktop(updater50);
        updater48.attach((observer.Device) desktop59);
        updater36.attach((observer.Device) desktop59);
        observer.Updater updater63 = new observer.Updater(0.0d);
        updater63.updateVersion((double) 0L);
        observer.Laptop laptop66 = new observer.Laptop(updater63);
        updater36.attach((observer.Device) laptop66);
        observer.Desktop desktop68 = new observer.Desktop(updater36);
        updater1.attach((observer.Device) desktop68);
        observer.Desktop desktop70 = new observer.Desktop(updater1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((double) 0.0f);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
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
        updater1.updateVersion((double) 10L);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) (short) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        observer.Updater updater1 = new observer.Updater((double) (short) -1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater3);
        observer.Desktop desktop11 = new observer.Desktop(updater3);
        updater3.updateVersion(0.0d);
        observer.Updater updater15 = new observer.Updater((double) 0.0f);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Laptop laptop19 = new observer.Laptop(updater17);
        updater17.updateVersion((double) (short) 1);
        updater17.updateVersion((double) 0);
        updater17.updateVersion((double) (short) 0);
        observer.Desktop desktop26 = new observer.Desktop(updater17);
        updater15.attach((observer.Device) desktop26);
        updater3.attach((observer.Device) desktop26);
        observer.Updater updater30 = new observer.Updater(0.0d);
        updater30.updateVersion((double) 0L);
        observer.Laptop laptop33 = new observer.Laptop(updater30);
        updater3.attach((observer.Device) laptop33);
        updater1.attach((observer.Device) laptop33);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 100.0f);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
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
        updater1.updateVersion((double) 1.0f);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        observer.Updater updater1 = new observer.Updater((double) 10.0f);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (-1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 0.0f);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater8.updateVersion((double) (short) 1);
        updater8.updateVersion((double) 0);
        updater8.updateVersion((double) (short) 0);
        observer.Desktop desktop17 = new observer.Desktop(updater8);
        updater6.attach((observer.Device) desktop17);
        updater6.updateVersion((double) 'a');
        observer.Updater updater22 = new observer.Updater((double) 0L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        updater22.updateVersion((-1.0d));
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater27.attach((observer.Device) laptop32);
        updater22.attach((observer.Device) laptop32);
        updater6.attach((observer.Device) laptop32);
        updater1.attach((observer.Device) laptop32);
        observer.Laptop laptop37 = new observer.Laptop(updater1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) 10L);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 10);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        updater6.updateVersion(1.0d);
        observer.Laptop laptop9 = new observer.Laptop(updater6);
        updater4.attach((observer.Device) laptop9);
        observer.Laptop laptop11 = new observer.Laptop(updater4);
        updater4.updateVersion(1.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater4);
        observer.Desktop desktop15 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop15);
        java.lang.Class<?> wildcardClass17 = desktop15.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        updater1.updateVersion((double) (short) 10);
        java.lang.Class<?> wildcardClass29 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass13 = laptop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
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
        observer.Desktop desktop17 = new observer.Desktop(updater1);
        observer.Desktop desktop18 = new observer.Desktop(updater1);
        observer.Desktop desktop19 = new observer.Desktop(updater1);
        observer.Laptop laptop20 = new observer.Laptop(updater1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        updater7.updateVersion(1.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        updater7.attach((observer.Device) laptop13);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop22 = new observer.Laptop(updater21);
        updater16.attach((observer.Device) laptop22);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop26 = new observer.Laptop(updater25);
        observer.Laptop laptop27 = new observer.Laptop(updater25);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater25.attach((observer.Device) laptop32);
        updater16.attach((observer.Device) laptop32);
        updater7.attach((observer.Device) laptop32);
        updater1.attach((observer.Device) laptop32);
        java.lang.Class<?> wildcardClass37 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        observer.Laptop laptop9 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop9);
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        updater15.updateVersion(1.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater13.attach((observer.Device) laptop18);
        observer.Desktop desktop20 = new observer.Desktop(updater13);
        updater1.attach((observer.Device) desktop20);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        updater25.updateVersion(1.0d);
        observer.Laptop laptop28 = new observer.Laptop(updater25);
        updater23.attach((observer.Device) laptop28);
        observer.Desktop desktop30 = new observer.Desktop(updater23);
        observer.Updater updater32 = new observer.Updater((double) (byte) 10);
        updater32.updateVersion(1.0d);
        observer.Laptop laptop35 = new observer.Laptop(updater32);
        updater23.attach((observer.Device) laptop35);
        updater1.attach((observer.Device) laptop35);
        observer.Laptop laptop38 = new observer.Laptop(updater1);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion(100.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (byte) 0);
        updater1.updateVersion((double) '#');
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (byte) 0);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
        updater1.updateVersion((double) (-1L));
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 'a');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
        java.lang.Class<?> wildcardClass11 = desktop9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater(0.0d);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        observer.Laptop laptop8 = new observer.Laptop(updater6);
        updater6.updateVersion((double) (short) 1);
        updater6.updateVersion((double) 0);
        updater6.updateVersion((double) (short) 0);
        observer.Desktop desktop15 = new observer.Desktop(updater6);
        updater6.updateVersion((double) 0L);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion(1.0d);
        observer.Laptop laptop24 = new observer.Laptop(updater21);
        updater19.attach((observer.Device) laptop24);
        observer.Desktop desktop26 = new observer.Desktop(updater19);
        observer.Laptop laptop27 = new observer.Laptop(updater19);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        updater29.updateVersion(10.0d);
        observer.Laptop laptop34 = new observer.Laptop(updater29);
        updater19.attach((observer.Device) laptop34);
        updater6.attach((observer.Device) laptop34);
        observer.Laptop laptop37 = new observer.Laptop(updater6);
        updater4.attach((observer.Device) laptop37);
        updater1.attach((observer.Device) laptop37);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        observer.Updater updater1 = new observer.Updater((double) 0);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 0.0f);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater8.updateVersion((double) (short) 1);
        updater8.updateVersion((double) 0);
        updater8.updateVersion((double) (short) 0);
        observer.Desktop desktop17 = new observer.Desktop(updater8);
        updater6.attach((observer.Device) desktop17);
        updater6.updateVersion((double) 'a');
        observer.Updater updater22 = new observer.Updater((double) 0L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        updater22.updateVersion((-1.0d));
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater27.attach((observer.Device) laptop32);
        updater22.attach((observer.Device) laptop32);
        updater6.attach((observer.Device) laptop32);
        updater1.attach((observer.Device) laptop32);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        observer.Updater updater40 = new observer.Updater((double) (byte) 10);
        updater40.updateVersion(1.0d);
        observer.Laptop laptop43 = new observer.Laptop(updater40);
        updater38.attach((observer.Device) laptop43);
        observer.Desktop desktop45 = new observer.Desktop(updater38);
        observer.Laptop laptop46 = new observer.Laptop(updater38);
        updater1.attach((observer.Device) laptop46);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        observer.Updater updater1 = new observer.Updater((double) (short) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        observer.Updater updater1 = new observer.Updater((double) (-1.0f));
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
        observer.Laptop laptop14 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        // The following exception was thrown during execution in test generation
        try {
            updater1.updateVersion((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        observer.Desktop desktop24 = new observer.Desktop(updater1);
        observer.Desktop desktop25 = new observer.Desktop(updater1);
        observer.Desktop desktop26 = new observer.Desktop(updater1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        observer.Updater updater0 = null;
        // The following exception was thrown during execution in test generation
        try {
            observer.Laptop laptop1 = new observer.Laptop(updater0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        updater15.updateVersion(1.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater13.attach((observer.Device) laptop18);
        observer.Desktop desktop20 = new observer.Desktop(updater13);
        updater1.attach((observer.Device) desktop20);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        updater25.updateVersion(1.0d);
        observer.Laptop laptop28 = new observer.Laptop(updater25);
        updater23.attach((observer.Device) laptop28);
        observer.Desktop desktop30 = new observer.Desktop(updater23);
        observer.Updater updater32 = new observer.Updater((double) (byte) 10);
        updater32.updateVersion(1.0d);
        observer.Laptop laptop35 = new observer.Laptop(updater32);
        updater23.attach((observer.Device) laptop35);
        updater1.attach((observer.Device) laptop35);
        observer.Desktop desktop38 = new observer.Desktop(updater1);
        observer.Desktop desktop39 = new observer.Desktop(updater1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        updater15.updateVersion(1.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater13.attach((observer.Device) laptop18);
        observer.Desktop desktop20 = new observer.Desktop(updater13);
        updater1.attach((observer.Device) desktop20);
        observer.Laptop laptop22 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass23 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        observer.Updater updater1 = new observer.Updater((double) (-1));
        updater1.updateVersion((double) 10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        observer.Updater updater1 = new observer.Updater((double) (byte) -1);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
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
        observer.Desktop desktop18 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass19 = desktop18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        observer.Laptop laptop16 = new observer.Laptop(updater13);
        updater11.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater11);
        observer.Desktop desktop19 = new observer.Desktop(updater11);
        updater11.updateVersion(0.0d);
        observer.Laptop laptop22 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop22);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
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
        updater1.updateVersion((double) 100);
        observer.Desktop desktop29 = new observer.Desktop(updater1);
        observer.Updater updater31 = new observer.Updater((double) (byte) 10);
        updater31.updateVersion(1.0d);
        observer.Desktop desktop34 = new observer.Desktop(updater31);
        observer.Updater updater36 = new observer.Updater((double) 0.0f);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop39 = new observer.Laptop(updater38);
        observer.Laptop laptop40 = new observer.Laptop(updater38);
        updater38.updateVersion((double) (short) 1);
        updater38.updateVersion((double) 0);
        updater38.updateVersion((double) (short) 0);
        observer.Desktop desktop47 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop47);
        updater36.updateVersion((double) 'a');
        observer.Updater updater52 = new observer.Updater((double) 0L);
        observer.Desktop desktop53 = new observer.Desktop(updater52);
        updater52.updateVersion((-1.0d));
        observer.Updater updater57 = new observer.Updater((double) (byte) 10);
        observer.Updater updater59 = new observer.Updater((double) (byte) 10);
        updater59.updateVersion(1.0d);
        observer.Laptop laptop62 = new observer.Laptop(updater59);
        updater57.attach((observer.Device) laptop62);
        updater52.attach((observer.Device) laptop62);
        updater36.attach((observer.Device) laptop62);
        updater31.attach((observer.Device) laptop62);
        updater1.attach((observer.Device) laptop62);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 100.0f);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass9 = laptop8.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        updater1.updateVersion((double) (short) 10);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        updater19.updateVersion(10.0d);
        observer.Desktop desktop24 = new observer.Desktop(updater19);
        observer.Laptop laptop25 = new observer.Laptop(updater19);
        observer.Laptop laptop26 = new observer.Laptop(updater19);
        updater1.attach((observer.Device) laptop26);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop10);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass13 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        updater10.updateVersion((double) (short) 1);
        updater10.updateVersion((double) 0);
        updater10.updateVersion((double) (short) 0);
        observer.Desktop desktop19 = new observer.Desktop(updater10);
        updater10.updateVersion((double) 0L);
        observer.Laptop laptop22 = new observer.Laptop(updater10);
        updater1.attach((observer.Device) laptop22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        updater9.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater9);
        updater5.attach((observer.Device) laptop12);
        updater1.attach((observer.Device) laptop12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass11 = desktop10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass13 = desktop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 10L);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        observer.Desktop desktop35 = new observer.Desktop(updater1);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
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
        observer.Desktop desktop27 = new observer.Desktop(updater1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = desktop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
        observer.Updater updater15 = new observer.Updater(0.0d);
        updater15.updateVersion((double) 0L);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        observer.Laptop laptop19 = new observer.Laptop(updater15);
        observer.Desktop desktop20 = new observer.Desktop(updater15);
        observer.Desktop desktop21 = new observer.Desktop(updater15);
        updater1.attach((observer.Device) desktop21);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100.0f);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion(1.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        updater10.attach((observer.Device) laptop15);
        observer.Desktop desktop17 = new observer.Desktop(updater10);
        observer.Desktop desktop18 = new observer.Desktop(updater10);
        updater10.updateVersion(0.0d);
        observer.Desktop desktop21 = new observer.Desktop(updater10);
        updater1.attach((observer.Device) desktop21);
        java.lang.Class<?> wildcardClass23 = desktop21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop10);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (byte) 0);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
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
        updater1.updateVersion((double) 100);
        observer.Desktop desktop29 = new observer.Desktop(updater1);
        observer.Desktop desktop30 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass31 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
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
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass12 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass7 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
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
        observer.Laptop laptop35 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass36 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (-1));
        observer.Laptop laptop15 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass16 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100.0f);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion((double) 0);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        observer.Desktop desktop18 = new observer.Desktop(updater14);
        observer.Laptop laptop19 = new observer.Laptop(updater14);
        updater1.attach((observer.Device) laptop19);
        observer.Desktop desktop21 = new observer.Desktop(updater1);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        observer.Updater updater1 = new observer.Updater((double) 10L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater3);
        observer.Desktop desktop11 = new observer.Desktop(updater3);
        updater3.updateVersion(0.0d);
        observer.Updater updater15 = new observer.Updater((double) 0.0f);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Laptop laptop19 = new observer.Laptop(updater17);
        updater17.updateVersion((double) (short) 1);
        updater17.updateVersion((double) 0);
        updater17.updateVersion((double) (short) 0);
        observer.Desktop desktop26 = new observer.Desktop(updater17);
        updater15.attach((observer.Device) desktop26);
        updater3.attach((observer.Device) desktop26);
        observer.Updater updater30 = new observer.Updater(0.0d);
        updater30.updateVersion((double) 0L);
        observer.Laptop laptop33 = new observer.Laptop(updater30);
        updater3.attach((observer.Device) laptop33);
        updater3.updateVersion(1.0d);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        observer.Updater updater40 = new observer.Updater((double) (byte) 10);
        updater40.updateVersion(1.0d);
        observer.Laptop laptop43 = new observer.Laptop(updater40);
        updater38.attach((observer.Device) laptop43);
        observer.Desktop desktop45 = new observer.Desktop(updater38);
        observer.Desktop desktop46 = new observer.Desktop(updater38);
        updater38.updateVersion(0.0d);
        observer.Updater updater50 = new observer.Updater((double) 0.0f);
        observer.Updater updater52 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop53 = new observer.Laptop(updater52);
        observer.Laptop laptop54 = new observer.Laptop(updater52);
        updater52.updateVersion((double) (short) 1);
        updater52.updateVersion((double) 0);
        updater52.updateVersion((double) (short) 0);
        observer.Desktop desktop61 = new observer.Desktop(updater52);
        updater50.attach((observer.Device) desktop61);
        updater38.attach((observer.Device) desktop61);
        observer.Updater updater65 = new observer.Updater(0.0d);
        updater65.updateVersion((double) 0L);
        observer.Laptop laptop68 = new observer.Laptop(updater65);
        updater38.attach((observer.Device) laptop68);
        observer.Desktop desktop70 = new observer.Desktop(updater38);
        updater3.attach((observer.Device) desktop70);
        updater1.attach((observer.Device) desktop70);
        updater1.updateVersion((double) '#');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        observer.Updater updater1 = new observer.Updater((double) 10L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        updater7.updateVersion(1.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        updater5.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater5);
        observer.Laptop laptop13 = new observer.Laptop(updater5);
        observer.Updater updater15 = new observer.Updater((double) 0.0f);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Laptop laptop19 = new observer.Laptop(updater17);
        updater17.updateVersion((double) (short) 1);
        updater17.updateVersion((double) 0);
        updater17.updateVersion((double) (short) 0);
        observer.Desktop desktop26 = new observer.Desktop(updater17);
        updater15.attach((observer.Device) desktop26);
        updater5.attach((observer.Device) desktop26);
        observer.Desktop desktop29 = new observer.Desktop(updater5);
        updater1.attach((observer.Device) desktop29);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        updater1.updateVersion((double) (byte) 10);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 0);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        observer.Laptop laptop14 = new observer.Laptop(updater12);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        updater16.updateVersion(1.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        updater12.attach((observer.Device) laptop19);
        observer.Laptop laptop21 = new observer.Laptop(updater12);
        observer.Laptop laptop22 = new observer.Laptop(updater12);
        observer.Device device23 = null;
        updater12.attach(device23);
        observer.Updater updater26 = new observer.Updater(0.0d);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop29 = new observer.Laptop(updater28);
        observer.Laptop laptop30 = new observer.Laptop(updater28);
        updater28.updateVersion((double) (short) 1);
        updater28.updateVersion((double) 0);
        updater28.updateVersion((double) (short) 0);
        observer.Desktop desktop37 = new observer.Desktop(updater28);
        updater26.attach((observer.Device) desktop37);
        updater12.attach((observer.Device) desktop37);
        updater1.attach((observer.Device) desktop37);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
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
        updater1.updateVersion((double) 100.0f);
        observer.Desktop desktop46 = new observer.Desktop(updater1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 100.0f);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) -1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater8.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater8);
        observer.Desktop desktop16 = new observer.Desktop(updater8);
        updater8.updateVersion(0.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater8);
        observer.Desktop desktop20 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop20);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass10 = laptop9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1L);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = desktop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        updater1.updateVersion((double) (-1L));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) '4');
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        observer.Updater updater1 = new observer.Updater(1.0d);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) 100L);
        updater1.updateVersion((double) (short) 0);
        observer.Updater updater11 = new observer.Updater((-1.0d));
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        observer.Updater updater16 = new observer.Updater((double) 0L);
        updater16.updateVersion((double) 0.0f);
        observer.Desktop desktop19 = new observer.Desktop(updater16);
        observer.Desktop desktop20 = new observer.Desktop(updater16);
        updater1.attach((observer.Device) desktop20);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass7 = laptop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100.0f);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion((double) 0);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        observer.Desktop desktop18 = new observer.Desktop(updater14);
        observer.Laptop laptop19 = new observer.Laptop(updater14);
        updater1.attach((observer.Device) laptop19);
        observer.Laptop laptop21 = new observer.Laptop(updater1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(100.0d);
        observer.Updater updater5 = new observer.Updater(0.0d);
        updater5.updateVersion((double) 0L);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        observer.Laptop laptop9 = new observer.Laptop(updater5);
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
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (-1L));
        observer.Updater updater5 = new observer.Updater((double) 1);
        observer.Desktop desktop6 = new observer.Desktop(updater5);
        updater1.attach((observer.Device) desktop6);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater11);
        updater9.attach((observer.Device) laptop14);
        observer.Desktop desktop16 = new observer.Desktop(updater9);
        observer.Desktop desktop17 = new observer.Desktop(updater9);
        updater9.updateVersion(0.0d);
        observer.Updater updater21 = new observer.Updater(0.0d);
        updater21.updateVersion((double) 0L);
        observer.Laptop laptop24 = new observer.Laptop(updater21);
        observer.Laptop laptop25 = new observer.Laptop(updater21);
        observer.Desktop desktop26 = new observer.Desktop(updater21);
        updater9.attach((observer.Device) desktop26);
        updater1.attach((observer.Device) desktop26);
        updater1.updateVersion((double) (short) -1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        updater1.updateVersion((double) 100.0f);
        java.lang.Class<?> wildcardClass7 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (-1.0f));
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        observer.Laptop laptop22 = new observer.Laptop(updater19);
        updater17.attach((observer.Device) laptop22);
        observer.Laptop laptop24 = new observer.Laptop(updater17);
        updater17.updateVersion(1.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater17);
        observer.Desktop desktop28 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop28);
        observer.Desktop desktop30 = new observer.Desktop(updater1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        observer.Updater updater1 = new observer.Updater(0.0d);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Laptop laptop23 = new observer.Laptop(updater16);
        updater1.attach((observer.Device) laptop23);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (-1.0f));
        updater1.updateVersion((double) 100.0f);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
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
        observer.Desktop desktop42 = new observer.Desktop(updater1);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = desktop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        observer.Desktop desktop17 = new observer.Desktop(updater1);
        observer.Desktop desktop18 = new observer.Desktop(updater1);
        observer.Desktop desktop19 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion((double) 0);
        updater14.updateVersion((double) ' ');
        updater14.updateVersion((double) 100L);
        updater14.updateVersion((double) (short) 0);
        observer.Updater updater24 = new observer.Updater((-1.0d));
        observer.Laptop laptop25 = new observer.Laptop(updater24);
        updater14.attach((observer.Device) laptop25);
        updater1.attach((observer.Device) laptop25);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        updater1.updateVersion((double) 100.0f);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
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
        observer.Desktop desktop37 = new observer.Desktop(updater1);
        observer.Laptop laptop38 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass39 = laptop38.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop37 = new observer.Laptop(updater1);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
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
        updater1.updateVersion((double) 0.0f);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        observer.Laptop laptop9 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop9);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 1);
        observer.Updater updater13 = new observer.Updater((double) 0L);
        observer.Laptop laptop14 = new observer.Laptop(updater13);
        updater13.updateVersion((double) (short) 10);
        observer.Desktop desktop17 = new observer.Desktop(updater13);
        observer.Laptop laptop18 = new observer.Laptop(updater13);
        observer.Laptop laptop19 = new observer.Laptop(updater13);
        updater1.attach((observer.Device) laptop19);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0.0f);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        updater10.updateVersion((double) (short) 1);
        updater10.updateVersion((double) 0);
        updater10.updateVersion((double) (short) 0);
        observer.Desktop desktop19 = new observer.Desktop(updater10);
        updater8.attach((observer.Device) desktop19);
        updater1.attach((observer.Device) desktop19);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        updater25.updateVersion(1.0d);
        observer.Laptop laptop28 = new observer.Laptop(updater25);
        updater23.attach((observer.Device) laptop28);
        observer.Desktop desktop30 = new observer.Desktop(updater23);
        observer.Desktop desktop31 = new observer.Desktop(updater23);
        updater1.attach((observer.Device) desktop31);
        observer.Laptop laptop33 = new observer.Laptop(updater1);
        observer.Updater updater35 = new observer.Updater((double) (byte) 10);
        updater35.updateVersion(1.0d);
        observer.Desktop desktop38 = new observer.Desktop(updater35);
        observer.Laptop laptop39 = new observer.Laptop(updater35);
        updater1.attach((observer.Device) laptop39);
        observer.Laptop laptop41 = new observer.Laptop(updater1);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
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
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        observer.Laptop laptop22 = new observer.Laptop(updater19);
        updater17.attach((observer.Device) laptop22);
        observer.Desktop desktop24 = new observer.Desktop(updater17);
        updater17.updateVersion(0.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater17);
        updater17.updateVersion((-1.0d));
        observer.Updater updater31 = new observer.Updater((double) 0.0f);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Laptop laptop35 = new observer.Laptop(updater33);
        updater33.updateVersion((double) (short) 1);
        updater33.updateVersion((double) 0);
        updater33.updateVersion((double) (short) 0);
        observer.Desktop desktop42 = new observer.Desktop(updater33);
        updater31.attach((observer.Device) desktop42);
        updater31.updateVersion((double) 'a');
        observer.Updater updater47 = new observer.Updater((double) 0L);
        observer.Laptop laptop48 = new observer.Laptop(updater47);
        updater47.updateVersion((double) (short) 10);
        observer.Desktop desktop51 = new observer.Desktop(updater47);
        updater31.attach((observer.Device) desktop51);
        observer.Desktop desktop53 = new observer.Desktop(updater31);
        updater17.attach((observer.Device) desktop53);
        updater1.attach((observer.Device) desktop53);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '4');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Updater updater8 = new observer.Updater(0.0d);
        updater8.updateVersion((double) 0L);
        observer.Laptop laptop11 = new observer.Laptop(updater8);
        observer.Laptop laptop12 = new observer.Laptop(updater8);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion(1.0d);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        updater14.attach((observer.Device) laptop20);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        updater23.updateVersion(1.0d);
        observer.Laptop laptop26 = new observer.Laptop(updater23);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop29 = new observer.Laptop(updater28);
        updater23.attach((observer.Device) laptop29);
        observer.Updater updater32 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop33 = new observer.Laptop(updater32);
        observer.Laptop laptop34 = new observer.Laptop(updater32);
        observer.Updater updater36 = new observer.Updater((double) (byte) 10);
        updater36.updateVersion(1.0d);
        observer.Laptop laptop39 = new observer.Laptop(updater36);
        updater32.attach((observer.Device) laptop39);
        updater23.attach((observer.Device) laptop39);
        updater14.attach((observer.Device) laptop39);
        updater8.attach((observer.Device) laptop39);
        updater1.attach((observer.Device) laptop39);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Laptop laptop16 = new observer.Laptop(updater1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
        observer.Desktop desktop16 = new observer.Desktop(updater1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 0);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        updater3.updateVersion(10.0d);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater11);
        updater9.attach((observer.Device) laptop14);
        observer.Desktop desktop16 = new observer.Desktop(updater9);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater9.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater9);
        updater3.attach((observer.Device) desktop23);
        observer.Laptop laptop25 = new observer.Laptop(updater3);
        observer.Desktop desktop26 = new observer.Desktop(updater3);
        observer.Desktop desktop27 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop27);
        java.lang.Class<?> wildcardClass29 = desktop27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass7 = laptop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        observer.Laptop laptop37 = new observer.Laptop(updater1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        updater1.updateVersion((double) 100.0f);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        updater1.attach((observer.Device) laptop9);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Updater updater10 = new observer.Updater((double) 0L);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        updater10.updateVersion((double) (short) 10);
        observer.Desktop desktop14 = new observer.Desktop(updater10);
        updater10.updateVersion((double) 100.0f);
        observer.Laptop laptop17 = new observer.Laptop(updater10);
        updater1.attach((observer.Device) laptop17);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Device device7 = null;
        updater1.attach(device7);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (-1L));
        observer.Updater updater5 = new observer.Updater((double) 1);
        observer.Desktop desktop6 = new observer.Desktop(updater5);
        updater1.attach((observer.Device) desktop6);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion(1.0d);
        observer.Laptop laptop14 = new observer.Laptop(updater11);
        updater9.attach((observer.Device) laptop14);
        observer.Desktop desktop16 = new observer.Desktop(updater9);
        observer.Desktop desktop17 = new observer.Desktop(updater9);
        updater9.updateVersion(0.0d);
        observer.Updater updater21 = new observer.Updater(0.0d);
        updater21.updateVersion((double) 0L);
        observer.Laptop laptop24 = new observer.Laptop(updater21);
        observer.Laptop laptop25 = new observer.Laptop(updater21);
        observer.Desktop desktop26 = new observer.Desktop(updater21);
        updater9.attach((observer.Device) desktop26);
        updater1.attach((observer.Device) desktop26);
        java.lang.Class<?> wildcardClass29 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Device device12 = null;
        updater1.attach(device12);
        // The following exception was thrown during execution in test generation
        try {
            updater1.updateVersion((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 10);
        updater4.updateVersion(1.0d);
        updater4.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater4);
        observer.Laptop laptop10 = new observer.Laptop(updater4);
        observer.Laptop laptop11 = new observer.Laptop(updater4);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        updater13.updateVersion(1.0d);
        updater13.updateVersion(10.0d);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion(1.0d);
        observer.Laptop laptop24 = new observer.Laptop(updater21);
        updater19.attach((observer.Device) laptop24);
        observer.Desktop desktop26 = new observer.Desktop(updater19);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        updater28.updateVersion(1.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater19.attach((observer.Device) laptop31);
        observer.Desktop desktop33 = new observer.Desktop(updater19);
        updater13.attach((observer.Device) desktop33);
        updater4.attach((observer.Device) desktop33);
        updater1.attach((observer.Device) desktop33);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
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
        observer.Desktop desktop43 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (byte) 10);
        observer.Desktop desktop46 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 0.0f);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater8.updateVersion((double) (short) 1);
        updater8.updateVersion((double) 0);
        updater8.updateVersion((double) (short) 0);
        observer.Desktop desktop17 = new observer.Desktop(updater8);
        updater6.attach((observer.Device) desktop17);
        updater6.updateVersion((double) 'a');
        observer.Updater updater22 = new observer.Updater((double) 0L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        updater22.updateVersion((-1.0d));
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater27.attach((observer.Device) laptop32);
        updater22.attach((observer.Device) laptop32);
        updater6.attach((observer.Device) laptop32);
        updater1.attach((observer.Device) laptop32);
        observer.Updater updater38 = new observer.Updater((double) 10L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        updater1.attach((observer.Device) desktop39);
        java.lang.Class<?> wildcardClass41 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Updater updater3 = new observer.Updater((-1.0d));
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater3.updateVersion((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
        updater1.updateVersion((double) (-1));
        observer.Laptop laptop11 = new observer.Laptop(updater1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Updater updater3 = new observer.Updater(0.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater5.updateVersion((double) (short) 1);
        updater5.updateVersion((double) 0);
        updater5.updateVersion((double) (short) 0);
        observer.Desktop desktop14 = new observer.Desktop(updater5);
        updater3.attach((observer.Device) desktop14);
        observer.Desktop desktop16 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop16);
        observer.Laptop laptop18 = new observer.Laptop(updater1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 10);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass6 = laptop5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Updater updater12 = new observer.Updater((double) 'a');
        observer.Updater updater14 = new observer.Updater((-1.0d));
        observer.Laptop laptop15 = new observer.Laptop(updater14);
        updater14.updateVersion((double) 100L);
        observer.Desktop desktop18 = new observer.Desktop(updater14);
        updater12.attach((observer.Device) desktop18);
        updater1.attach((observer.Device) desktop18);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) '4');
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
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
        observer.Desktop desktop18 = new observer.Desktop(updater1);
        observer.Desktop desktop19 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (byte) 100);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        observer.Updater updater1 = new observer.Updater((double) (short) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        observer.Updater updater14 = new observer.Updater(0.0d);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop17 = new observer.Laptop(updater16);
        observer.Laptop laptop18 = new observer.Laptop(updater16);
        updater16.updateVersion((double) (short) 1);
        updater16.updateVersion((double) 0);
        updater16.updateVersion((double) (short) 0);
        observer.Desktop desktop25 = new observer.Desktop(updater16);
        updater16.updateVersion((double) 0L);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        observer.Updater updater31 = new observer.Updater((double) (byte) 10);
        updater31.updateVersion(1.0d);
        observer.Laptop laptop34 = new observer.Laptop(updater31);
        updater29.attach((observer.Device) laptop34);
        observer.Desktop desktop36 = new observer.Desktop(updater29);
        observer.Laptop laptop37 = new observer.Laptop(updater29);
        observer.Updater updater39 = new observer.Updater((double) (byte) 10);
        updater39.updateVersion(1.0d);
        updater39.updateVersion(10.0d);
        observer.Laptop laptop44 = new observer.Laptop(updater39);
        updater29.attach((observer.Device) laptop44);
        updater16.attach((observer.Device) laptop44);
        observer.Laptop laptop47 = new observer.Laptop(updater16);
        updater14.attach((observer.Device) laptop47);
        observer.Laptop laptop49 = new observer.Laptop(updater14);
        observer.Desktop desktop50 = new observer.Desktop(updater14);
        observer.Laptop laptop51 = new observer.Laptop(updater14);
        updater1.attach((observer.Device) laptop51);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (-1L));
        updater1.updateVersion((double) 'a');
        observer.Updater updater7 = new observer.Updater((double) 10L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop8);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        updater15.updateVersion(1.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater13.attach((observer.Device) laptop18);
        observer.Desktop desktop20 = new observer.Desktop(updater13);
        updater1.attach((observer.Device) desktop20);
        updater1.updateVersion((double) (short) -1);
        observer.Laptop laptop24 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass25 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater3.updateVersion((double) (short) 1);
        updater3.updateVersion((double) 0);
        updater3.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop12);
        updater1.updateVersion((double) (short) 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 10L);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
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
        java.lang.Class<?> wildcardClass23 = desktop21.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        updater1.updateVersion((double) 100.0f);
        updater1.updateVersion((double) 1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
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
        observer.Desktop desktop43 = new observer.Desktop(updater1);
        observer.Laptop laptop44 = new observer.Laptop(updater1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 'a');
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
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
        observer.Desktop desktop44 = new observer.Desktop(updater1);
        observer.Updater updater46 = new observer.Updater((double) 0.0f);
        observer.Updater updater48 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop49 = new observer.Laptop(updater48);
        observer.Laptop laptop50 = new observer.Laptop(updater48);
        updater48.updateVersion((double) (short) 1);
        updater48.updateVersion((double) 0);
        updater48.updateVersion((double) (short) 0);
        observer.Desktop desktop57 = new observer.Desktop(updater48);
        updater46.attach((observer.Device) desktop57);
        observer.Laptop laptop59 = new observer.Laptop(updater46);
        updater1.attach((observer.Device) laptop59);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 10);
        updater4.updateVersion((double) 0);
        updater4.updateVersion((double) ' ');
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion(1.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        updater10.attach((observer.Device) laptop15);
        observer.Desktop desktop17 = new observer.Desktop(updater10);
        observer.Desktop desktop18 = new observer.Desktop(updater10);
        updater10.updateVersion(0.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater10);
        updater4.attach((observer.Device) laptop21);
        updater1.attach((observer.Device) laptop21);
        observer.Desktop desktop24 = new observer.Desktop(updater1);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        updater28.updateVersion(1.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater26.attach((observer.Device) laptop31);
        observer.Desktop desktop33 = new observer.Desktop(updater26);
        updater26.updateVersion(0.0d);
        observer.Laptop laptop36 = new observer.Laptop(updater26);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        observer.Updater updater40 = new observer.Updater((double) (byte) 10);
        updater40.updateVersion(1.0d);
        observer.Laptop laptop43 = new observer.Laptop(updater40);
        updater38.attach((observer.Device) laptop43);
        observer.Desktop desktop45 = new observer.Desktop(updater38);
        updater26.attach((observer.Device) desktop45);
        observer.Laptop laptop47 = new observer.Laptop(updater26);
        updater1.attach((observer.Device) laptop47);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        updater1.updateVersion((double) (byte) 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        observer.Updater updater14 = new observer.Updater((double) 1);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater1.attach((observer.Device) desktop15);
        observer.Updater updater18 = new observer.Updater((double) 0.0f);
        updater18.updateVersion((double) (short) 0);
        observer.Desktop desktop21 = new observer.Desktop(updater18);
        updater1.attach((observer.Device) desktop21);
        updater1.updateVersion((double) 'a');
        observer.Updater updater26 = new observer.Updater((double) 0.0f);
        observer.Laptop laptop27 = new observer.Laptop(updater26);
        updater1.attach((observer.Device) laptop27);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        observer.Desktop desktop17 = new observer.Desktop(updater1);
        observer.Laptop laptop18 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass19 = laptop18.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
        updater1.updateVersion((double) (-1L));
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        updater7.updateVersion(1.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        updater5.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater5);
        observer.Desktop desktop13 = new observer.Desktop(updater5);
        updater5.updateVersion(0.0d);
        observer.Desktop desktop16 = new observer.Desktop(updater5);
        observer.Laptop laptop17 = new observer.Laptop(updater5);
        observer.Laptop laptop18 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop18);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        observer.Device device2 = null;
        updater1.attach(device2);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        updater19.updateVersion(1.0d);
        observer.Laptop laptop22 = new observer.Laptop(updater19);
        updater17.attach((observer.Device) laptop22);
        observer.Laptop laptop24 = new observer.Laptop(updater17);
        updater17.updateVersion(1.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater17);
        observer.Desktop desktop28 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop28);
        java.lang.Class<?> wildcardClass30 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        updater10.updateVersion(10.0d);
        observer.Updater updater16 = new observer.Updater((double) (byte) 10);
        observer.Updater updater18 = new observer.Updater((double) (byte) 10);
        updater18.updateVersion(1.0d);
        observer.Laptop laptop21 = new observer.Laptop(updater18);
        updater16.attach((observer.Device) laptop21);
        observer.Desktop desktop23 = new observer.Desktop(updater16);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        updater25.updateVersion(1.0d);
        observer.Laptop laptop28 = new observer.Laptop(updater25);
        updater16.attach((observer.Device) laptop28);
        observer.Desktop desktop30 = new observer.Desktop(updater16);
        updater10.attach((observer.Device) desktop30);
        updater1.attach((observer.Device) desktop30);
        updater1.updateVersion((double) 1);
        java.lang.Class<?> wildcardClass35 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        observer.Updater updater1 = new observer.Updater(100.0d);
        updater1.updateVersion((double) '4');
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop7);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        observer.Laptop laptop12 = new observer.Laptop(updater10);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion(1.0d);
        observer.Laptop laptop17 = new observer.Laptop(updater14);
        updater10.attach((observer.Device) laptop17);
        updater1.attach((observer.Device) laptop17);
        observer.Laptop laptop20 = new observer.Laptop(updater1);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        observer.Updater updater24 = new observer.Updater((double) (byte) 10);
        updater24.updateVersion(1.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater24);
        updater22.attach((observer.Device) laptop27);
        observer.Desktop desktop29 = new observer.Desktop(updater22);
        updater22.updateVersion(0.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater22);
        updater22.updateVersion((-1.0d));
        updater22.updateVersion((double) (byte) 100);
        observer.Updater updater38 = new observer.Updater((double) (byte) 10);
        observer.Updater updater40 = new observer.Updater((double) (byte) 10);
        updater40.updateVersion(1.0d);
        observer.Laptop laptop43 = new observer.Laptop(updater40);
        updater38.attach((observer.Device) laptop43);
        observer.Laptop laptop45 = new observer.Laptop(updater38);
        updater38.updateVersion(1.0d);
        observer.Laptop laptop48 = new observer.Laptop(updater38);
        observer.Desktop desktop49 = new observer.Desktop(updater38);
        updater22.attach((observer.Device) desktop49);
        updater1.attach((observer.Device) desktop49);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 0.0f);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        updater15.updateVersion(1.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater13.attach((observer.Device) laptop18);
        observer.Desktop desktop20 = new observer.Desktop(updater13);
        updater1.attach((observer.Device) desktop20);
        updater1.updateVersion((double) (short) -1);
        observer.Laptop laptop24 = new observer.Laptop(updater1);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        updater28.updateVersion(1.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater26.attach((observer.Device) laptop31);
        observer.Desktop desktop33 = new observer.Desktop(updater26);
        updater26.updateVersion(0.0d);
        updater26.updateVersion((double) 100.0f);
        observer.Updater updater39 = new observer.Updater((double) (byte) 10);
        updater39.updateVersion((double) 0);
        observer.Laptop laptop42 = new observer.Laptop(updater39);
        observer.Desktop desktop43 = new observer.Desktop(updater39);
        observer.Laptop laptop44 = new observer.Laptop(updater39);
        updater26.attach((observer.Device) laptop44);
        updater1.attach((observer.Device) laptop44);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
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
        updater1.updateVersion((double) ' ');
        observer.Updater updater18 = new observer.Updater((double) 100);
        observer.Desktop desktop19 = new observer.Desktop(updater18);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0);
        updater21.updateVersion((double) ' ');
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater27.attach((observer.Device) laptop32);
        observer.Desktop desktop34 = new observer.Desktop(updater27);
        observer.Desktop desktop35 = new observer.Desktop(updater27);
        updater27.updateVersion(0.0d);
        observer.Laptop laptop38 = new observer.Laptop(updater27);
        updater21.attach((observer.Device) laptop38);
        updater18.attach((observer.Device) laptop38);
        updater1.attach((observer.Device) laptop38);
        observer.Laptop laptop42 = new observer.Laptop(updater1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((-1.0d));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        updater7.updateVersion((double) 0);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        observer.Desktop desktop11 = new observer.Desktop(updater7);
        observer.Laptop laptop12 = new observer.Laptop(updater7);
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
        updater7.attach((observer.Device) laptop29);
        updater1.attach((observer.Device) laptop29);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        observer.Updater updater1 = new observer.Updater(0.0d);
        updater1.updateVersion((double) 0L);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) 0L);
        observer.Desktop desktop9 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop9);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop14 = new observer.Laptop(updater13);
        observer.Laptop laptop15 = new observer.Laptop(updater13);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        updater17.updateVersion(1.0d);
        observer.Laptop laptop20 = new observer.Laptop(updater17);
        updater13.attach((observer.Device) laptop20);
        observer.Laptop laptop22 = new observer.Laptop(updater13);
        observer.Laptop laptop23 = new observer.Laptop(updater13);
        updater1.attach((observer.Device) laptop23);
        java.lang.Class<?> wildcardClass25 = laptop23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        java.lang.Class<?> wildcardClass15 = laptop14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 'a');
        updater1.updateVersion((double) (byte) 0);
        updater1.updateVersion((double) 1L);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        observer.Updater updater1 = new observer.Updater(1.0d);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 1);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        observer.Desktop desktop6 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop6);
        java.lang.Class<?> wildcardClass8 = desktop6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 0);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
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
        observer.Updater updater17 = new observer.Updater((double) 0L);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        updater17.updateVersion((double) (short) 10);
        observer.Desktop desktop21 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop21);
        updater1.updateVersion((double) 100L);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 1);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        observer.Updater updater1 = new observer.Updater((double) (-1.0f));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
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
        observer.Desktop desktop16 = new observer.Desktop(updater1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
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
        observer.Desktop desktop17 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass18 = desktop17.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
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
        observer.Desktop desktop35 = new observer.Desktop(updater1);
        observer.Updater updater37 = new observer.Updater((double) (byte) 10);
        updater37.updateVersion(1.0d);
        updater37.updateVersion(10.0d);
        observer.Laptop laptop42 = new observer.Laptop(updater37);
        updater37.updateVersion((double) (byte) 1);
        observer.Updater updater46 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop47 = new observer.Laptop(updater46);
        observer.Laptop laptop48 = new observer.Laptop(updater46);
        observer.Updater updater50 = new observer.Updater((double) (byte) 10);
        updater50.updateVersion(1.0d);
        observer.Laptop laptop53 = new observer.Laptop(updater50);
        updater46.attach((observer.Device) laptop53);
        updater37.attach((observer.Device) laptop53);
        observer.Updater updater57 = new observer.Updater((double) (byte) 10);
        updater57.updateVersion(1.0d);
        observer.Laptop laptop60 = new observer.Laptop(updater57);
        observer.Updater updater62 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop63 = new observer.Laptop(updater62);
        updater57.attach((observer.Device) laptop63);
        updater37.attach((observer.Device) laptop63);
        updater1.attach((observer.Device) laptop63);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (-1L));
        updater1.updateVersion((double) 'a');
        observer.Updater updater7 = new observer.Updater((double) 10L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop8);
        updater1.updateVersion((double) (short) 0);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
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
        updater1.updateVersion((double) 1);
        observer.Device device20 = null;
        updater1.attach(device20);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Updater updater3 = new observer.Updater((-1.0d));
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater3.updateVersion((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion(1.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        updater10.attach((observer.Device) laptop15);
        observer.Desktop desktop17 = new observer.Desktop(updater10);
        updater10.updateVersion(0.0d);
        observer.Laptop laptop20 = new observer.Laptop(updater10);
        updater10.updateVersion((-1.0d));
        updater10.updateVersion((double) (byte) 100);
        observer.Updater updater26 = new observer.Updater((double) (byte) 10);
        observer.Updater updater28 = new observer.Updater((double) (byte) 10);
        updater28.updateVersion(1.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater28);
        updater26.attach((observer.Device) laptop31);
        observer.Laptop laptop33 = new observer.Laptop(updater26);
        updater26.updateVersion(1.0d);
        observer.Laptop laptop36 = new observer.Laptop(updater26);
        observer.Desktop desktop37 = new observer.Desktop(updater26);
        updater10.attach((observer.Device) desktop37);
        updater1.attach((observer.Device) desktop37);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        observer.Updater updater1 = new observer.Updater((double) (short) 0);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass14 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100.0f);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) -1);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater8.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater8);
        updater8.updateVersion(0.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater8);
        updater8.updateVersion((-1.0d));
        updater8.updateVersion((double) (byte) 100);
        observer.Desktop desktop23 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop23);
        java.lang.Class<?> wildcardClass25 = desktop23.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        observer.Desktop desktop25 = new observer.Desktop(updater1);
        observer.Laptop laptop26 = new observer.Laptop(updater1);
        observer.Laptop laptop27 = new observer.Laptop(updater1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
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
        updater1.updateVersion((double) 0);
        java.lang.Class<?> wildcardClass45 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        observer.Updater updater1 = new observer.Updater((double) ' ');
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion(1.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater3.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop10);
        observer.Laptop laptop12 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 'a');
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion(1.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop6);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
        observer.Updater updater13 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop14 = new observer.Laptop(updater13);
        observer.Laptop laptop15 = new observer.Laptop(updater13);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        updater17.updateVersion(1.0d);
        observer.Laptop laptop20 = new observer.Laptop(updater17);
        updater13.attach((observer.Device) laptop20);
        updater1.attach((observer.Device) laptop20);
        java.lang.Class<?> wildcardClass23 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        updater1.updateVersion((double) 0L);
        observer.Updater updater38 = new observer.Updater((double) 0L);
        updater38.updateVersion((double) (byte) -1);
        observer.Updater updater42 = new observer.Updater((double) (byte) 10);
        updater42.updateVersion(1.0d);
        updater42.updateVersion(10.0d);
        observer.Laptop laptop47 = new observer.Laptop(updater42);
        observer.Updater updater49 = new observer.Updater((double) 0.0f);
        observer.Updater updater51 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop52 = new observer.Laptop(updater51);
        observer.Laptop laptop53 = new observer.Laptop(updater51);
        updater51.updateVersion((double) (short) 1);
        updater51.updateVersion((double) 0);
        updater51.updateVersion((double) (short) 0);
        observer.Desktop desktop60 = new observer.Desktop(updater51);
        updater49.attach((observer.Device) desktop60);
        updater42.attach((observer.Device) desktop60);
        updater38.attach((observer.Device) desktop60);
        updater38.updateVersion((double) 100);
        observer.Desktop desktop66 = new observer.Desktop(updater38);
        observer.Desktop desktop67 = new observer.Desktop(updater38);
        updater1.attach((observer.Device) desktop67);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0);
        updater1.updateVersion((double) ' ');
        updater1.updateVersion((double) (short) 100);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
        observer.Updater updater10 = new observer.Updater(0.0d);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        observer.Laptop laptop14 = new observer.Laptop(updater12);
        updater12.updateVersion((double) (short) 1);
        updater12.updateVersion((double) 0);
        updater12.updateVersion((double) (short) 0);
        observer.Desktop desktop21 = new observer.Desktop(updater12);
        updater12.updateVersion((double) 0L);
        observer.Updater updater25 = new observer.Updater((double) (byte) 10);
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        updater27.updateVersion(1.0d);
        observer.Laptop laptop30 = new observer.Laptop(updater27);
        updater25.attach((observer.Device) laptop30);
        observer.Desktop desktop32 = new observer.Desktop(updater25);
        observer.Laptop laptop33 = new observer.Laptop(updater25);
        observer.Updater updater35 = new observer.Updater((double) (byte) 10);
        updater35.updateVersion(1.0d);
        updater35.updateVersion(10.0d);
        observer.Laptop laptop40 = new observer.Laptop(updater35);
        updater25.attach((observer.Device) laptop40);
        updater12.attach((observer.Device) laptop40);
        observer.Laptop laptop43 = new observer.Laptop(updater12);
        updater10.attach((observer.Device) laptop43);
        observer.Updater updater46 = new observer.Updater(0.0d);
        updater46.updateVersion((double) 0L);
        observer.Laptop laptop49 = new observer.Laptop(updater46);
        updater10.attach((observer.Device) laptop49);
        updater10.updateVersion((double) (-1L));
        observer.Desktop desktop53 = new observer.Desktop(updater10);
        updater1.attach((observer.Device) desktop53);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Updater updater3 = new observer.Updater((-1.0d));
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater3.updateVersion((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
        updater1.updateVersion((double) (-1));
        observer.Device device11 = null;
        updater1.attach(device11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
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
        updater1.updateVersion((double) 1);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        updater23.updateVersion(1.0d);
        observer.Laptop laptop26 = new observer.Laptop(updater23);
        updater21.attach((observer.Device) laptop26);
        observer.Desktop desktop28 = new observer.Desktop(updater21);
        updater21.updateVersion(0.0d);
        observer.Laptop laptop31 = new observer.Laptop(updater21);
        updater1.attach((observer.Device) laptop31);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
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
        updater1.updateVersion((double) 10);
        observer.Laptop laptop16 = new observer.Laptop(updater1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100L);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion(1.0d);
        observer.Laptop laptop11 = new observer.Laptop(updater8);
        updater6.attach((observer.Device) laptop11);
        observer.Laptop laptop13 = new observer.Laptop(updater6);
        observer.Updater updater15 = new observer.Updater((double) (byte) 10);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        updater17.updateVersion(1.0d);
        observer.Laptop laptop20 = new observer.Laptop(updater17);
        updater15.attach((observer.Device) laptop20);
        observer.Desktop desktop22 = new observer.Desktop(updater15);
        observer.Desktop desktop23 = new observer.Desktop(updater15);
        updater15.updateVersion(0.0d);
        observer.Updater updater27 = new observer.Updater(0.0d);
        updater27.updateVersion((double) 0L);
        observer.Laptop laptop30 = new observer.Laptop(updater27);
        observer.Laptop laptop31 = new observer.Laptop(updater27);
        observer.Desktop desktop32 = new observer.Desktop(updater27);
        updater15.attach((observer.Device) desktop32);
        updater6.attach((observer.Device) desktop32);
        updater1.attach((observer.Device) desktop32);
        updater1.updateVersion((double) 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(1.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 0.0f);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater8.updateVersion((double) (short) 1);
        updater8.updateVersion((double) 0);
        updater8.updateVersion((double) (short) 0);
        observer.Desktop desktop17 = new observer.Desktop(updater8);
        updater6.attach((observer.Device) desktop17);
        updater6.updateVersion((double) 'a');
        observer.Updater updater22 = new observer.Updater((double) 0L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        updater22.updateVersion((-1.0d));
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        observer.Updater updater29 = new observer.Updater((double) (byte) 10);
        updater29.updateVersion(1.0d);
        observer.Laptop laptop32 = new observer.Laptop(updater29);
        updater27.attach((observer.Device) laptop32);
        updater22.attach((observer.Device) laptop32);
        updater6.attach((observer.Device) laptop32);
        updater1.attach((observer.Device) laptop32);
        observer.Updater updater38 = new observer.Updater((double) 10L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        updater1.attach((observer.Device) desktop39);
        updater1.updateVersion((double) (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) 0.0f);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) -1);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        updater10.updateVersion(1.0d);
        observer.Laptop laptop13 = new observer.Laptop(updater10);
        updater8.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater8);
        updater8.updateVersion(0.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater8);
        updater8.updateVersion((-1.0d));
        updater8.updateVersion((double) (byte) 100);
        observer.Desktop desktop23 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop23);
        observer.Laptop laptop25 = new observer.Laptop(updater1);
    }
}


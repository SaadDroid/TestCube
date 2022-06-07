import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObserverRegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test001");
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test002");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass3 = laptop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test003");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test005");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        java.lang.Class<?> wildcardClass7 = desktop5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test006");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test007");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test008");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop9);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test009");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop9);
        java.lang.Class<?> wildcardClass11 = desktop9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test010");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test011");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Updater updater15 = new observer.Updater((double) 100L);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        updater1.attach((observer.Device) laptop16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test012");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test013");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = laptop10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test014");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test015");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test016");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        updater1.updateVersion(1.0d);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test017");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test018");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test019");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass10 = desktop9.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test020");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test021");
        observer.Updater updater1 = new observer.Updater((double) 100.0f);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test022");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 1L);
        observer.Updater updater7 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test023");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        java.lang.Class<?> wildcardClass13 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test024");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        java.lang.Class<?> wildcardClass16 = laptop14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test025");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) ' ');
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test026");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop10 = new observer.Laptop(updater9);
        observer.Laptop laptop11 = new observer.Laptop(updater9);
        updater1.attach((observer.Device) laptop11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test027");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1.0f);
        updater1.updateVersion((double) '#');
        java.lang.Class<?> wildcardClass7 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test028");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        updater1.attach((observer.Device) laptop34);
        java.lang.Class<?> wildcardClass36 = laptop34.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test029");
        observer.Updater updater1 = new observer.Updater((double) (-1L));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test030");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop8);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test031");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        java.lang.Class<?> wildcardClass32 = desktop28.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test032");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test033");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test034");
        observer.Updater updater1 = new observer.Updater((double) 0);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test035");
        observer.Updater updater1 = new observer.Updater((double) (byte) -1);
        updater1.updateVersion((double) (-1L));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test036");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater3.updateVersion((double) 1.0f);
        updater3.updateVersion((double) '#');
        observer.Laptop laptop9 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test037");
        observer.Updater updater1 = new observer.Updater((double) (-1.0f));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test038");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 0.0f);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test039");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test040");
        observer.Updater updater1 = new observer.Updater((double) (byte) 0);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test041");
        observer.Updater updater1 = new observer.Updater((double) 10L);
        observer.Updater updater3 = new observer.Updater((double) 'a');
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        updater6.updateVersion((double) 0L);
        updater6.updateVersion(0.0d);
        updater6.updateVersion(0.0d);
        updater6.updateVersion((double) 100);
        observer.Laptop laptop15 = new observer.Laptop(updater6);
        updater3.attach((observer.Device) laptop15);
        updater1.attach((observer.Device) laptop15);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test042");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test043");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test044");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass5 = laptop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test045");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass3 = laptop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test046");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        updater1.updateVersion((double) (byte) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test047");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test048");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test049");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Updater updater8 = new observer.Updater((double) (byte) 1);
        updater8.updateVersion(10.0d);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop13 = new observer.Laptop(updater12);
        observer.Laptop laptop14 = new observer.Laptop(updater12);
        updater8.attach((observer.Device) laptop14);
        updater1.attach((observer.Device) laptop14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test050");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) -1);
        java.lang.Class<?> wildcardClass7 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test051");
        observer.Updater updater1 = new observer.Updater((double) 0L);
        updater1.updateVersion((double) (short) 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test052");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Laptop laptop49 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass50 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test053");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        observer.Updater updater8 = new observer.Updater((double) (byte) 1);
        updater8.updateVersion(10.0d);
        observer.Desktop desktop11 = new observer.Desktop(updater8);
        observer.Desktop desktop12 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop12);
        java.lang.Class<?> wildcardClass14 = desktop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test054");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test055");
        observer.Updater updater1 = new observer.Updater((double) ' ');
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test056");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        java.lang.Class<?> wildcardClass5 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test057");
        observer.Updater updater1 = new observer.Updater((double) 10);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test058");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test059");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop12);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test060");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(1.0d);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test061");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        updater1.updateVersion((double) (short) 1);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Desktop desktop20 = new observer.Desktop(updater17);
        updater17.updateVersion((double) (short) 100);
        observer.Desktop desktop23 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop23);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test062");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        observer.Updater updater8 = new observer.Updater((double) (byte) 1);
        updater8.updateVersion(10.0d);
        observer.Desktop desktop11 = new observer.Desktop(updater8);
        observer.Desktop desktop12 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop12);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test063");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test064");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) ' ');
        observer.Device device12 = null;
        updater1.attach(device12);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test065");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Updater updater14 = new observer.Updater((double) (short) 10);
        observer.Updater updater16 = new observer.Updater((double) 100L);
        observer.Laptop laptop17 = new observer.Laptop(updater16);
        updater14.attach((observer.Device) laptop17);
        updater1.attach((observer.Device) laptop17);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test066");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test067");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test068");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test069");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        observer.Laptop laptop14 = new observer.Laptop(updater1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test070");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(100.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop15 = new observer.Laptop(updater14);
        updater14.updateVersion((double) 1.0f);
        observer.Desktop desktop18 = new observer.Desktop(updater14);
        updater1.attach((observer.Device) desktop18);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test071");
        observer.Updater updater1 = new observer.Updater((double) 100);
        updater1.updateVersion((double) (byte) 100);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) -1);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test072");
        observer.Updater updater1 = new observer.Updater((double) (byte) 0);
        observer.Updater updater3 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test073");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        updater1.attach((observer.Device) laptop10);
        java.lang.Class<?> wildcardClass13 = laptop10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test074");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test075");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
        updater1.updateVersion((double) (-1.0f));
        observer.Desktop desktop4 = new observer.Desktop(updater1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test076");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass8 = desktop7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test077");
        observer.Updater updater1 = new observer.Updater(10.0d);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 1);
        observer.Laptop laptop5 = new observer.Laptop(updater4);
        updater1.attach((observer.Device) laptop5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test078");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass3 = laptop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test079");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test080");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        updater1.attach((observer.Device) laptop34);
        observer.Desktop desktop36 = new observer.Desktop(updater1);
        observer.Desktop desktop37 = new observer.Desktop(updater1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test081");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test082");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass13 = desktop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test083");
        observer.Updater updater1 = new observer.Updater((double) (short) -1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test084");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test085");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test086");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Updater updater3 = new observer.Updater((double) (byte) 1);
        updater3.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test087");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test088");
        observer.Updater updater1 = new observer.Updater((double) 100);
        updater1.updateVersion((double) (byte) 100);
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test089");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        updater1.updateVersion((double) 100L);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test090");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 1);
        updater5.updateVersion(10.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop8);
        observer.Updater updater11 = new observer.Updater((double) (byte) 1);
        updater11.updateVersion(10.0d);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        updater11.attach((observer.Device) laptop18);
        updater1.attach((observer.Device) laptop18);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test091");
        observer.Updater updater1 = new observer.Updater((double) 'a');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test092");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Updater updater8 = new observer.Updater((double) 100L);
        updater8.updateVersion((double) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion((double) 0L);
        updater12.updateVersion(0.0d);
        updater12.updateVersion(0.0d);
        updater12.updateVersion((double) 100);
        observer.Laptop laptop21 = new observer.Laptop(updater12);
        updater8.attach((observer.Device) laptop21);
        observer.Updater updater24 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop25 = new observer.Laptop(updater24);
        observer.Updater updater27 = new observer.Updater((double) 100L);
        observer.Updater updater29 = new observer.Updater((double) 100L);
        observer.Desktop desktop30 = new observer.Desktop(updater29);
        observer.Updater updater32 = new observer.Updater((double) 100L);
        observer.Desktop desktop33 = new observer.Desktop(updater32);
        updater29.attach((observer.Device) desktop33);
        observer.Desktop desktop35 = new observer.Desktop(updater29);
        updater27.attach((observer.Device) desktop35);
        updater24.attach((observer.Device) desktop35);
        updater8.attach((observer.Device) desktop35);
        updater1.attach((observer.Device) desktop35);
        updater1.updateVersion((double) (-1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test093");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Updater updater3 = new observer.Updater((double) 'a');
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        updater6.updateVersion((double) 0L);
        updater6.updateVersion(0.0d);
        updater6.updateVersion(0.0d);
        updater6.updateVersion((double) 100);
        observer.Laptop laptop15 = new observer.Laptop(updater6);
        updater3.attach((observer.Device) laptop15);
        updater1.attach((observer.Device) laptop15);
        updater1.updateVersion((double) (-1L));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test094");
        observer.Updater updater1 = new observer.Updater(0.0d);
        java.lang.Class<?> wildcardClass2 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test095");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        observer.Laptop laptop4 = new observer.Laptop(updater1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test096");
        observer.Updater updater1 = new observer.Updater((double) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test097");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test098");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        updater4.updateVersion((double) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion((double) 0L);
        updater8.updateVersion(0.0d);
        updater8.updateVersion(0.0d);
        updater8.updateVersion((double) 100);
        observer.Laptop laptop17 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        updater4.attach((observer.Device) laptop23);
        updater1.attach((observer.Device) laptop23);
        observer.Laptop laptop26 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass27 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test099");
        observer.Updater updater1 = new observer.Updater((-1.0d));
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        updater3.updateVersion((double) 0L);
        updater3.updateVersion(0.0d);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Desktop desktop10 = new observer.Desktop(updater9);
        observer.Updater updater12 = new observer.Updater((double) 100L);
        observer.Desktop desktop13 = new observer.Desktop(updater12);
        updater9.attach((observer.Device) desktop13);
        observer.Desktop desktop15 = new observer.Desktop(updater9);
        updater3.attach((observer.Device) desktop15);
        updater1.attach((observer.Device) desktop15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test100");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (-1L));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test101");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 1L);
        updater1.updateVersion((double) (short) 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test102");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        updater1.updateVersion((double) 10.0f);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test103");
        observer.Updater updater1 = new observer.Updater((double) 1L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test104");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) ' ');
        observer.Desktop desktop8 = new observer.Desktop(updater1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test105");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test106");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass14 = desktop13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test107");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test108");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass14 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test109");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop12);
        java.lang.Class<?> wildcardClass14 = desktop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test110");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        updater1.attach((observer.Device) laptop34);
        observer.Desktop desktop36 = new observer.Desktop(updater1);
        observer.Updater updater38 = new observer.Updater((double) (byte) 1);
        updater38.updateVersion(10.0d);
        observer.Updater updater42 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop43 = new observer.Laptop(updater42);
        observer.Laptop laptop44 = new observer.Laptop(updater42);
        updater38.attach((observer.Device) laptop44);
        observer.Desktop desktop46 = new observer.Desktop(updater38);
        updater1.attach((observer.Device) desktop46);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test111");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop9);
        observer.Laptop laptop11 = new observer.Laptop(updater1);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test112");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Updater updater7 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        observer.Updater updater10 = new observer.Updater((double) (byte) 1);
        updater10.updateVersion(10.0d);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop15 = new observer.Laptop(updater14);
        observer.Laptop laptop16 = new observer.Laptop(updater14);
        updater10.attach((observer.Device) laptop16);
        observer.Desktop desktop18 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop18);
        observer.Laptop laptop20 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop20);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test113");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Laptop laptop12 = new observer.Laptop(updater4);
        observer.Laptop laptop13 = new observer.Laptop(updater4);
        updater1.attach((observer.Device) laptop13);
        updater1.updateVersion((double) 1.0f);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test114");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test115");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass5 = desktop4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test116");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
        observer.Updater updater3 = new observer.Updater((double) (byte) 1);
        updater3.updateVersion(10.0d);
        updater3.updateVersion((double) 100L);
        observer.Laptop laptop8 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop8);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test117");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 100L);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Updater updater8 = new observer.Updater((double) (short) 10);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        updater8.attach((observer.Device) laptop11);
        updater1.attach((observer.Device) laptop11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test118");
        observer.Updater updater1 = new observer.Updater((double) (-1));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test119");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = laptop10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test120");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test121");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
        updater1.updateVersion((double) (-1.0f));
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test122");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        updater1.attach((observer.Device) laptop10);
        updater1.updateVersion((double) 100.0f);
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test123");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(100.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass13 = desktop12.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test124");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        updater4.updateVersion((double) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion((double) 0L);
        updater8.updateVersion(0.0d);
        updater8.updateVersion(0.0d);
        updater8.updateVersion((double) 100);
        observer.Laptop laptop17 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        updater4.attach((observer.Device) laptop23);
        updater1.attach((observer.Device) laptop23);
        java.lang.Class<?> wildcardClass26 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test125");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test126");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) ' ');
        observer.Laptop laptop12 = new observer.Laptop(updater1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test127");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1));
        updater1.updateVersion((double) ' ');
        observer.Laptop laptop18 = new observer.Laptop(updater1);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test128");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        updater15.updateVersion((double) 100L);
        observer.Laptop laptop20 = new observer.Laptop(updater15);
        observer.Laptop laptop21 = new observer.Laptop(updater15);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        updater23.updateVersion((double) 10);
        observer.Desktop desktop26 = new observer.Desktop(updater23);
        updater23.updateVersion((double) (short) 100);
        observer.Updater updater30 = new observer.Updater((double) 100L);
        updater30.updateVersion((double) 10);
        observer.Updater updater34 = new observer.Updater((double) (byte) 10);
        updater34.updateVersion((double) 0L);
        updater34.updateVersion(0.0d);
        updater34.updateVersion(0.0d);
        updater34.updateVersion((double) 100);
        observer.Laptop laptop43 = new observer.Laptop(updater34);
        updater30.attach((observer.Device) laptop43);
        observer.Updater updater46 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop47 = new observer.Laptop(updater46);
        observer.Updater updater49 = new observer.Updater((double) 100L);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        observer.Desktop desktop52 = new observer.Desktop(updater51);
        observer.Updater updater54 = new observer.Updater((double) 100L);
        observer.Desktop desktop55 = new observer.Desktop(updater54);
        updater51.attach((observer.Device) desktop55);
        observer.Desktop desktop57 = new observer.Desktop(updater51);
        updater49.attach((observer.Device) desktop57);
        updater46.attach((observer.Device) desktop57);
        updater30.attach((observer.Device) desktop57);
        updater23.attach((observer.Device) desktop57);
        updater15.attach((observer.Device) desktop57);
        updater1.attach((observer.Device) desktop57);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test129");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        updater4.updateVersion((double) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion((double) 0L);
        updater8.updateVersion(0.0d);
        updater8.updateVersion(0.0d);
        updater8.updateVersion((double) 100);
        observer.Laptop laptop17 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        updater4.attach((observer.Device) laptop23);
        updater1.attach((observer.Device) laptop23);
        observer.Laptop laptop26 = new observer.Laptop(updater1);
        observer.Laptop laptop27 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass28 = laptop27.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test130");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test131");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        java.lang.Class<?> wildcardClass16 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test132");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Laptop laptop12 = new observer.Laptop(updater4);
        observer.Laptop laptop13 = new observer.Laptop(updater4);
        updater1.attach((observer.Device) laptop13);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
        observer.Updater updater17 = new observer.Updater((double) (byte) 1);
        updater17.updateVersion(10.0d);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop22 = new observer.Laptop(updater21);
        observer.Laptop laptop23 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop23);
        observer.Laptop laptop25 = new observer.Laptop(updater17);
        observer.Laptop laptop26 = new observer.Laptop(updater17);
        updater1.attach((observer.Device) laptop26);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test133");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1.0f);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (-1.0f));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test134");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        updater1.updateVersion((double) (short) -1);
        observer.Laptop laptop34 = new observer.Laptop(updater1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test135");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass11 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test136");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Updater updater15 = new observer.Updater((double) 100L);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        updater5.attach((observer.Device) laptop16);
        observer.Updater updater19 = new observer.Updater((double) 0);
        updater19.updateVersion((-1.0d));
        observer.Updater updater23 = new observer.Updater((double) 100L);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        observer.Updater updater28 = new observer.Updater((double) 100L);
        observer.Desktop desktop29 = new observer.Desktop(updater28);
        updater25.attach((observer.Device) desktop29);
        observer.Desktop desktop31 = new observer.Desktop(updater25);
        updater23.attach((observer.Device) desktop31);
        observer.Updater updater34 = new observer.Updater((double) (byte) 1);
        updater34.updateVersion(10.0d);
        observer.Laptop laptop37 = new observer.Laptop(updater34);
        observer.Updater updater39 = new observer.Updater((double) (byte) 1);
        updater39.updateVersion(10.0d);
        observer.Desktop desktop42 = new observer.Desktop(updater39);
        updater34.attach((observer.Device) desktop42);
        updater23.attach((observer.Device) desktop42);
        updater19.attach((observer.Device) desktop42);
        observer.Laptop laptop46 = new observer.Laptop(updater19);
        updater5.attach((observer.Device) laptop46);
        updater1.attach((observer.Device) laptop46);
        observer.Desktop desktop49 = new observer.Desktop(updater1);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test137");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (byte) -1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test138");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        updater7.updateVersion((double) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion((double) 0L);
        updater11.updateVersion(0.0d);
        updater11.updateVersion(0.0d);
        updater11.updateVersion((double) 100);
        observer.Laptop laptop20 = new observer.Laptop(updater11);
        updater7.attach((observer.Device) laptop20);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        updater23.updateVersion((double) 10);
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        updater27.updateVersion((double) 0L);
        updater27.updateVersion(0.0d);
        updater27.updateVersion(0.0d);
        updater27.updateVersion((double) 100);
        observer.Laptop laptop36 = new observer.Laptop(updater27);
        updater23.attach((observer.Device) laptop36);
        observer.Updater updater39 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop40 = new observer.Laptop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Updater updater44 = new observer.Updater((double) 100L);
        observer.Desktop desktop45 = new observer.Desktop(updater44);
        observer.Updater updater47 = new observer.Updater((double) 100L);
        observer.Desktop desktop48 = new observer.Desktop(updater47);
        updater44.attach((observer.Device) desktop48);
        observer.Desktop desktop50 = new observer.Desktop(updater44);
        updater42.attach((observer.Device) desktop50);
        updater39.attach((observer.Device) desktop50);
        updater23.attach((observer.Device) desktop50);
        updater7.attach((observer.Device) desktop50);
        updater1.attach((observer.Device) desktop50);
        observer.Updater updater57 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop58 = new observer.Laptop(updater57);
        observer.Desktop desktop59 = new observer.Desktop(updater57);
        updater1.attach((observer.Device) desktop59);
        observer.Updater updater62 = new observer.Updater((double) 100L);
        observer.Desktop desktop63 = new observer.Desktop(updater62);
        observer.Laptop laptop64 = new observer.Laptop(updater62);
        observer.Updater updater66 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop67 = new observer.Laptop(updater66);
        updater62.attach((observer.Device) laptop67);
        observer.Updater updater70 = new observer.Updater((double) 100L);
        observer.Updater updater72 = new observer.Updater((double) 100L);
        observer.Desktop desktop73 = new observer.Desktop(updater72);
        observer.Updater updater75 = new observer.Updater((double) 100L);
        observer.Desktop desktop76 = new observer.Desktop(updater75);
        updater72.attach((observer.Device) desktop76);
        observer.Desktop desktop78 = new observer.Desktop(updater72);
        updater70.attach((observer.Device) desktop78);
        observer.Updater updater81 = new observer.Updater((double) (byte) 1);
        updater81.updateVersion(10.0d);
        observer.Laptop laptop84 = new observer.Laptop(updater81);
        observer.Updater updater86 = new observer.Updater((double) (byte) 1);
        updater86.updateVersion(10.0d);
        observer.Desktop desktop89 = new observer.Desktop(updater86);
        updater81.attach((observer.Device) desktop89);
        updater70.attach((observer.Device) desktop89);
        updater62.attach((observer.Device) desktop89);
        updater1.attach((observer.Device) desktop89);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test139");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        observer.Laptop laptop21 = new observer.Laptop(updater19);
        updater15.attach((observer.Device) laptop21);
        observer.Laptop laptop23 = new observer.Laptop(updater15);
        updater15.updateVersion((double) 10);
        updater15.updateVersion((double) (byte) 1);
        observer.Updater updater29 = new observer.Updater((double) 100L);
        observer.Desktop desktop30 = new observer.Desktop(updater29);
        observer.Updater updater32 = new observer.Updater((double) (byte) 1);
        updater32.updateVersion(10.0d);
        observer.Updater updater36 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop37 = new observer.Laptop(updater36);
        observer.Laptop laptop38 = new observer.Laptop(updater36);
        updater32.attach((observer.Device) laptop38);
        observer.Laptop laptop40 = new observer.Laptop(updater32);
        observer.Laptop laptop41 = new observer.Laptop(updater32);
        updater29.attach((observer.Device) laptop41);
        updater15.attach((observer.Device) laptop41);
        updater1.attach((observer.Device) laptop41);
        updater1.updateVersion((double) 10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test140");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Updater updater15 = new observer.Updater((double) 0);
        updater15.updateVersion((-1.0d));
        observer.Updater updater19 = new observer.Updater((double) 100L);
        observer.Updater updater21 = new observer.Updater((double) 100L);
        observer.Desktop desktop22 = new observer.Desktop(updater21);
        observer.Updater updater24 = new observer.Updater((double) 100L);
        observer.Desktop desktop25 = new observer.Desktop(updater24);
        updater21.attach((observer.Device) desktop25);
        observer.Desktop desktop27 = new observer.Desktop(updater21);
        updater19.attach((observer.Device) desktop27);
        observer.Updater updater30 = new observer.Updater((double) (byte) 1);
        updater30.updateVersion(10.0d);
        observer.Laptop laptop33 = new observer.Laptop(updater30);
        observer.Updater updater35 = new observer.Updater((double) (byte) 1);
        updater35.updateVersion(10.0d);
        observer.Desktop desktop38 = new observer.Desktop(updater35);
        updater30.attach((observer.Device) desktop38);
        updater19.attach((observer.Device) desktop38);
        updater15.attach((observer.Device) desktop38);
        observer.Laptop laptop42 = new observer.Laptop(updater15);
        updater1.attach((observer.Device) laptop42);
        java.lang.Class<?> wildcardClass44 = laptop42.getClass();
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test141");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Updater updater50 = new observer.Updater((double) 100L);
        observer.Desktop desktop51 = new observer.Desktop(updater50);
        observer.Updater updater53 = new observer.Updater((double) 100L);
        observer.Desktop desktop54 = new observer.Desktop(updater53);
        updater50.attach((observer.Device) desktop54);
        observer.Desktop desktop56 = new observer.Desktop(updater50);
        updater1.attach((observer.Device) desktop56);
        java.lang.Class<?> wildcardClass58 = desktop56.getClass();
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test142");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        updater1.updateVersion((double) 1L);
        java.lang.Class<?> wildcardClass51 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test143");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test144");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 100L);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 100);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test145");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) (byte) 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test146");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        updater1.updateVersion((double) (-1));
        observer.Updater updater5 = new observer.Updater((double) 100L);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater5.attach((observer.Device) desktop13);
        updater5.updateVersion((double) (-1));
        observer.Desktop desktop17 = new observer.Desktop(updater5);
        observer.Updater updater19 = new observer.Updater((double) (byte) 1);
        updater19.updateVersion(10.0d);
        observer.Updater updater23 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop24 = new observer.Laptop(updater23);
        observer.Laptop laptop25 = new observer.Laptop(updater23);
        updater19.attach((observer.Device) laptop25);
        observer.Laptop laptop27 = new observer.Laptop(updater19);
        updater19.updateVersion((double) 10);
        updater19.updateVersion((double) (byte) 1);
        observer.Updater updater33 = new observer.Updater((double) 100L);
        observer.Desktop desktop34 = new observer.Desktop(updater33);
        observer.Updater updater36 = new observer.Updater((double) (byte) 1);
        updater36.updateVersion(10.0d);
        observer.Updater updater40 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop41 = new observer.Laptop(updater40);
        observer.Laptop laptop42 = new observer.Laptop(updater40);
        updater36.attach((observer.Device) laptop42);
        observer.Laptop laptop44 = new observer.Laptop(updater36);
        observer.Laptop laptop45 = new observer.Laptop(updater36);
        updater33.attach((observer.Device) laptop45);
        updater19.attach((observer.Device) laptop45);
        updater5.attach((observer.Device) laptop45);
        updater1.attach((observer.Device) laptop45);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test147");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        updater1.updateVersion((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass35 = laptop34.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test148");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop12);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        observer.Laptop laptop21 = new observer.Laptop(updater19);
        updater15.attach((observer.Device) laptop21);
        updater1.attach((observer.Device) laptop21);
        observer.Desktop desktop24 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 1);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test149");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1.0f);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test150");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Laptop laptop12 = new observer.Laptop(updater4);
        observer.Laptop laptop13 = new observer.Laptop(updater4);
        updater1.attach((observer.Device) laptop13);
        java.lang.Class<?> wildcardClass15 = laptop13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test151");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test152");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test153");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test154");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        updater1.updateVersion(0.0d);
        java.lang.Class<?> wildcardClass10 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test155");
        observer.Updater updater1 = new observer.Updater((double) 100);
        updater1.updateVersion((double) (byte) 100);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 0.0f);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test156");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        updater1.updateVersion(1.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test157");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test158");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 1L);
        java.lang.Class<?> wildcardClass15 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test159");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Desktop desktop49 = new observer.Desktop(updater1);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        updater51.updateVersion((double) 10);
        observer.Desktop desktop54 = new observer.Desktop(updater51);
        updater51.updateVersion((double) (short) 100);
        updater51.updateVersion(1.0d);
        observer.Laptop laptop59 = new observer.Laptop(updater51);
        updater1.attach((observer.Device) laptop59);
        observer.Desktop desktop61 = new observer.Desktop(updater1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test160");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        observer.Updater updater5 = new observer.Updater((double) 100L);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater5.attach((observer.Device) desktop13);
        observer.Updater updater16 = new observer.Updater((double) (byte) 1);
        updater16.updateVersion(10.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        observer.Updater updater21 = new observer.Updater((double) (byte) 1);
        updater21.updateVersion(10.0d);
        observer.Desktop desktop24 = new observer.Desktop(updater21);
        updater16.attach((observer.Device) desktop24);
        updater5.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        observer.Laptop laptop28 = new observer.Laptop(updater1);
        updater1.updateVersion(100.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test161");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 1L);
        observer.Updater updater7 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop8 = new observer.Laptop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        updater10.updateVersion((double) 10);
        observer.Updater updater14 = new observer.Updater((double) (byte) 10);
        updater14.updateVersion((double) 0L);
        updater14.updateVersion(0.0d);
        updater14.updateVersion(0.0d);
        updater14.updateVersion((double) 100);
        observer.Laptop laptop23 = new observer.Laptop(updater14);
        updater10.attach((observer.Device) laptop23);
        observer.Updater updater26 = new observer.Updater((double) (byte) 1);
        updater26.updateVersion(10.0d);
        observer.Laptop laptop29 = new observer.Laptop(updater26);
        updater10.attach((observer.Device) laptop29);
        updater7.attach((observer.Device) laptop29);
        observer.Laptop laptop32 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop32);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test162");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        observer.Updater updater9 = new observer.Updater((double) 10);
        observer.Desktop desktop10 = new observer.Desktop(updater9);
        observer.Desktop desktop11 = new observer.Desktop(updater9);
        updater1.attach((observer.Device) desktop11);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test163");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass11 = laptop10.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test164");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        updater1.attach((observer.Device) laptop34);
        observer.Desktop desktop36 = new observer.Desktop(updater1);
        observer.Laptop laptop37 = new observer.Laptop(updater1);
        observer.Desktop desktop38 = new observer.Desktop(updater1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test165");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Desktop desktop32 = new observer.Desktop(updater1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test166");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1));
        updater1.updateVersion((double) ' ');
        observer.Desktop desktop18 = new observer.Desktop(updater1);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) '#');
        observer.Laptop laptop26 = new observer.Laptop(updater25);
        observer.Laptop laptop27 = new observer.Laptop(updater25);
        updater20.attach((observer.Device) laptop27);
        observer.Updater updater30 = new observer.Updater((double) 100L);
        updater30.updateVersion((double) 10);
        observer.Desktop desktop33 = new observer.Desktop(updater30);
        updater30.updateVersion((double) (short) 100);
        observer.Updater updater37 = new observer.Updater((double) 100L);
        updater37.updateVersion((double) 10);
        observer.Updater updater41 = new observer.Updater((double) (byte) 10);
        updater41.updateVersion((double) 0L);
        updater41.updateVersion(0.0d);
        updater41.updateVersion(0.0d);
        updater41.updateVersion((double) 100);
        observer.Laptop laptop50 = new observer.Laptop(updater41);
        updater37.attach((observer.Device) laptop50);
        observer.Updater updater53 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop54 = new observer.Laptop(updater53);
        observer.Updater updater56 = new observer.Updater((double) 100L);
        observer.Updater updater58 = new observer.Updater((double) 100L);
        observer.Desktop desktop59 = new observer.Desktop(updater58);
        observer.Updater updater61 = new observer.Updater((double) 100L);
        observer.Desktop desktop62 = new observer.Desktop(updater61);
        updater58.attach((observer.Device) desktop62);
        observer.Desktop desktop64 = new observer.Desktop(updater58);
        updater56.attach((observer.Device) desktop64);
        updater53.attach((observer.Device) desktop64);
        updater37.attach((observer.Device) desktop64);
        updater30.attach((observer.Device) desktop64);
        updater20.attach((observer.Device) desktop64);
        updater1.attach((observer.Device) desktop64);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test167");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        observer.Desktop desktop11 = new observer.Desktop(updater1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test168");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        updater1.updateVersion((double) (byte) 10);
        observer.Desktop desktop34 = new observer.Desktop(updater1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test169");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Updater updater3 = new observer.Updater((double) 'a');
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        updater6.updateVersion((double) 0L);
        updater6.updateVersion(0.0d);
        updater6.updateVersion(0.0d);
        updater6.updateVersion((double) 100);
        observer.Laptop laptop15 = new observer.Laptop(updater6);
        updater3.attach((observer.Device) laptop15);
        updater1.attach((observer.Device) laptop15);
        observer.Desktop desktop18 = new observer.Desktop(updater1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test170");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        observer.Updater updater33 = new observer.Updater((double) 100L);
        updater33.updateVersion((double) 10);
        observer.Updater updater37 = new observer.Updater((double) (byte) 10);
        updater37.updateVersion((double) 0L);
        updater37.updateVersion(0.0d);
        updater37.updateVersion(0.0d);
        updater37.updateVersion((double) 100);
        observer.Laptop laptop46 = new observer.Laptop(updater37);
        updater33.attach((observer.Device) laptop46);
        observer.Updater updater49 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop50 = new observer.Laptop(updater49);
        observer.Updater updater52 = new observer.Updater((double) 100L);
        observer.Updater updater54 = new observer.Updater((double) 100L);
        observer.Desktop desktop55 = new observer.Desktop(updater54);
        observer.Updater updater57 = new observer.Updater((double) 100L);
        observer.Desktop desktop58 = new observer.Desktop(updater57);
        updater54.attach((observer.Device) desktop58);
        observer.Desktop desktop60 = new observer.Desktop(updater54);
        updater52.attach((observer.Device) desktop60);
        updater49.attach((observer.Device) desktop60);
        updater33.attach((observer.Device) desktop60);
        observer.Updater updater65 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop66 = new observer.Laptop(updater65);
        updater33.attach((observer.Device) laptop66);
        updater1.attach((observer.Device) laptop66);
        java.lang.Class<?> wildcardClass69 = laptop66.getClass();
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test171");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Desktop desktop49 = new observer.Desktop(updater1);
        observer.Desktop desktop50 = new observer.Desktop(updater1);
        observer.Laptop laptop51 = new observer.Laptop(updater1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test172");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        java.lang.Class<?> wildcardClass7 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test173");
        observer.Updater updater1 = new observer.Updater((double) (short) 0);
        updater1.updateVersion((double) ' ');
        observer.Laptop laptop4 = new observer.Laptop(updater1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test174");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        updater1.updateVersion((double) (short) -1);
        observer.Desktop desktop34 = new observer.Desktop(updater1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test175");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) '#');
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        observer.Laptop laptop8 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop8);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        updater11.updateVersion((double) 10);
        observer.Desktop desktop14 = new observer.Desktop(updater11);
        updater11.updateVersion((double) (short) 100);
        observer.Updater updater18 = new observer.Updater((double) 100L);
        updater18.updateVersion((double) 10);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        updater22.updateVersion((double) 0L);
        updater22.updateVersion(0.0d);
        updater22.updateVersion(0.0d);
        updater22.updateVersion((double) 100);
        observer.Laptop laptop31 = new observer.Laptop(updater22);
        updater18.attach((observer.Device) laptop31);
        observer.Updater updater34 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop35 = new observer.Laptop(updater34);
        observer.Updater updater37 = new observer.Updater((double) 100L);
        observer.Updater updater39 = new observer.Updater((double) 100L);
        observer.Desktop desktop40 = new observer.Desktop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Desktop desktop43 = new observer.Desktop(updater42);
        updater39.attach((observer.Device) desktop43);
        observer.Desktop desktop45 = new observer.Desktop(updater39);
        updater37.attach((observer.Device) desktop45);
        updater34.attach((observer.Device) desktop45);
        updater18.attach((observer.Device) desktop45);
        updater11.attach((observer.Device) desktop45);
        updater1.attach((observer.Device) desktop45);
        observer.Updater updater52 = new observer.Updater((double) 100L);
        updater52.updateVersion((double) 10);
        updater52.updateVersion((-1.0d));
        updater52.updateVersion((double) (byte) 100);
        observer.Desktop desktop59 = new observer.Desktop(updater52);
        updater1.attach((observer.Device) desktop59);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test176");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 10.0f);
        java.lang.Class<?> wildcardClass6 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test177");
        observer.Updater updater1 = new observer.Updater((double) (short) 1);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        java.lang.Class<?> wildcardClass3 = desktop2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test178");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(100.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Laptop laptop13 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass14 = laptop13.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test179");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 10.0f);
        observer.Updater updater7 = new observer.Updater((double) 100);
        updater7.updateVersion((double) (byte) 100);
        observer.Laptop laptop10 = new observer.Laptop(updater7);
        updater1.attach((observer.Device) laptop10);
        observer.Updater updater13 = new observer.Updater((double) (byte) 1);
        updater13.updateVersion(10.0d);
        updater13.updateVersion((double) 100L);
        observer.Laptop laptop18 = new observer.Laptop(updater13);
        observer.Laptop laptop19 = new observer.Laptop(updater13);
        observer.Updater updater21 = new observer.Updater((double) 100L);
        updater21.updateVersion((double) 10);
        observer.Desktop desktop24 = new observer.Desktop(updater21);
        updater21.updateVersion((double) (short) 100);
        observer.Updater updater28 = new observer.Updater((double) 100L);
        updater28.updateVersion((double) 10);
        observer.Updater updater32 = new observer.Updater((double) (byte) 10);
        updater32.updateVersion((double) 0L);
        updater32.updateVersion(0.0d);
        updater32.updateVersion(0.0d);
        updater32.updateVersion((double) 100);
        observer.Laptop laptop41 = new observer.Laptop(updater32);
        updater28.attach((observer.Device) laptop41);
        observer.Updater updater44 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop45 = new observer.Laptop(updater44);
        observer.Updater updater47 = new observer.Updater((double) 100L);
        observer.Updater updater49 = new observer.Updater((double) 100L);
        observer.Desktop desktop50 = new observer.Desktop(updater49);
        observer.Updater updater52 = new observer.Updater((double) 100L);
        observer.Desktop desktop53 = new observer.Desktop(updater52);
        updater49.attach((observer.Device) desktop53);
        observer.Desktop desktop55 = new observer.Desktop(updater49);
        updater47.attach((observer.Device) desktop55);
        updater44.attach((observer.Device) desktop55);
        updater28.attach((observer.Device) desktop55);
        updater21.attach((observer.Device) desktop55);
        updater13.attach((observer.Device) desktop55);
        updater1.attach((observer.Device) desktop55);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test180");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        observer.Updater updater15 = new observer.Updater((double) 100L);
        observer.Desktop desktop16 = new observer.Desktop(updater15);
        observer.Updater updater18 = new observer.Updater((double) (byte) 1);
        updater18.updateVersion(10.0d);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop23 = new observer.Laptop(updater22);
        observer.Laptop laptop24 = new observer.Laptop(updater22);
        updater18.attach((observer.Device) laptop24);
        observer.Laptop laptop26 = new observer.Laptop(updater18);
        observer.Laptop laptop27 = new observer.Laptop(updater18);
        updater15.attach((observer.Device) laptop27);
        updater1.attach((observer.Device) laptop27);
        java.lang.Class<?> wildcardClass30 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test181");
        observer.Updater updater1 = new observer.Updater((double) 100);
        updater1.updateVersion((double) (byte) 100);
        observer.Updater updater5 = new observer.Updater((double) 100L);
        updater5.updateVersion((double) 10);
        observer.Updater updater9 = new observer.Updater((double) (byte) 10);
        updater9.updateVersion((double) 0L);
        updater9.updateVersion(0.0d);
        updater9.updateVersion(0.0d);
        updater9.updateVersion((double) 100);
        observer.Laptop laptop18 = new observer.Laptop(updater9);
        updater5.attach((observer.Device) laptop18);
        observer.Updater updater21 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop22 = new observer.Laptop(updater21);
        observer.Updater updater24 = new observer.Updater((double) 100L);
        observer.Updater updater26 = new observer.Updater((double) 100L);
        observer.Desktop desktop27 = new observer.Desktop(updater26);
        observer.Updater updater29 = new observer.Updater((double) 100L);
        observer.Desktop desktop30 = new observer.Desktop(updater29);
        updater26.attach((observer.Device) desktop30);
        observer.Desktop desktop32 = new observer.Desktop(updater26);
        updater24.attach((observer.Device) desktop32);
        updater21.attach((observer.Device) desktop32);
        updater5.attach((observer.Device) desktop32);
        observer.Updater updater37 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop38 = new observer.Laptop(updater37);
        updater5.attach((observer.Device) laptop38);
        observer.Desktop desktop40 = new observer.Desktop(updater5);
        updater1.attach((observer.Device) desktop40);
        java.lang.Class<?> wildcardClass42 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test182");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        java.lang.Class<?> wildcardClass32 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test183");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion((double) (short) 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test184");
        observer.Updater updater1 = new observer.Updater(100.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test185");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Laptop laptop18 = new observer.Laptop(updater15);
        observer.Updater updater20 = new observer.Updater((double) '#');
        observer.Laptop laptop21 = new observer.Laptop(updater20);
        observer.Laptop laptop22 = new observer.Laptop(updater20);
        updater15.attach((observer.Device) laptop22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        updater25.updateVersion((double) 10);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater25.updateVersion((double) (short) 100);
        observer.Updater updater32 = new observer.Updater((double) 100L);
        updater32.updateVersion((double) 10);
        observer.Updater updater36 = new observer.Updater((double) (byte) 10);
        updater36.updateVersion((double) 0L);
        updater36.updateVersion(0.0d);
        updater36.updateVersion(0.0d);
        updater36.updateVersion((double) 100);
        observer.Laptop laptop45 = new observer.Laptop(updater36);
        updater32.attach((observer.Device) laptop45);
        observer.Updater updater48 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop49 = new observer.Laptop(updater48);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        observer.Updater updater53 = new observer.Updater((double) 100L);
        observer.Desktop desktop54 = new observer.Desktop(updater53);
        observer.Updater updater56 = new observer.Updater((double) 100L);
        observer.Desktop desktop57 = new observer.Desktop(updater56);
        updater53.attach((observer.Device) desktop57);
        observer.Desktop desktop59 = new observer.Desktop(updater53);
        updater51.attach((observer.Device) desktop59);
        updater48.attach((observer.Device) desktop59);
        updater32.attach((observer.Device) desktop59);
        updater25.attach((observer.Device) desktop59);
        updater15.attach((observer.Device) desktop59);
        updater1.attach((observer.Device) desktop59);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test186");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) '4');
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) ' ');
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test187");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop12);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        observer.Laptop laptop21 = new observer.Laptop(updater19);
        updater15.attach((observer.Device) laptop21);
        updater1.attach((observer.Device) laptop21);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Laptop laptop28 = new observer.Laptop(updater25);
        observer.Desktop desktop29 = new observer.Desktop(updater25);
        updater1.attach((observer.Device) desktop29);
        java.lang.Class<?> wildcardClass31 = desktop29.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test188");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Desktop desktop3 = new observer.Desktop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Updater updater15 = new observer.Updater((double) 100L);
        observer.Laptop laptop16 = new observer.Laptop(updater15);
        updater5.attach((observer.Device) laptop16);
        observer.Updater updater19 = new observer.Updater((double) 0);
        updater19.updateVersion((-1.0d));
        observer.Updater updater23 = new observer.Updater((double) 100L);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        observer.Updater updater28 = new observer.Updater((double) 100L);
        observer.Desktop desktop29 = new observer.Desktop(updater28);
        updater25.attach((observer.Device) desktop29);
        observer.Desktop desktop31 = new observer.Desktop(updater25);
        updater23.attach((observer.Device) desktop31);
        observer.Updater updater34 = new observer.Updater((double) (byte) 1);
        updater34.updateVersion(10.0d);
        observer.Laptop laptop37 = new observer.Laptop(updater34);
        observer.Updater updater39 = new observer.Updater((double) (byte) 1);
        updater39.updateVersion(10.0d);
        observer.Desktop desktop42 = new observer.Desktop(updater39);
        updater34.attach((observer.Device) desktop42);
        updater23.attach((observer.Device) desktop42);
        updater19.attach((observer.Device) desktop42);
        observer.Laptop laptop46 = new observer.Laptop(updater19);
        updater5.attach((observer.Device) laptop46);
        updater1.attach((observer.Device) laptop46);
        observer.Laptop laptop49 = new observer.Laptop(updater1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test189");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) (byte) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test190");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        observer.Laptop laptop15 = new observer.Laptop(updater1);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test191");
        observer.Updater updater1 = new observer.Updater((double) (byte) 100);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        updater4.updateVersion((double) 10);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        updater8.updateVersion((double) 0L);
        updater8.updateVersion(0.0d);
        updater8.updateVersion(0.0d);
        updater8.updateVersion((double) 100);
        observer.Laptop laptop17 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        updater4.attach((observer.Device) laptop23);
        updater1.attach((observer.Device) laptop23);
        observer.Laptop laptop26 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        observer.Updater updater30 = new observer.Updater((double) 100L);
        updater30.updateVersion((double) 10);
        observer.Updater updater34 = new observer.Updater((double) (byte) 10);
        updater34.updateVersion((double) 0L);
        updater34.updateVersion(0.0d);
        updater34.updateVersion(0.0d);
        updater34.updateVersion((double) 100);
        observer.Laptop laptop43 = new observer.Laptop(updater34);
        updater30.attach((observer.Device) laptop43);
        observer.Updater updater46 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop47 = new observer.Laptop(updater46);
        observer.Updater updater49 = new observer.Updater((double) 100L);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        observer.Desktop desktop52 = new observer.Desktop(updater51);
        observer.Updater updater54 = new observer.Updater((double) 100L);
        observer.Desktop desktop55 = new observer.Desktop(updater54);
        updater51.attach((observer.Device) desktop55);
        observer.Desktop desktop57 = new observer.Desktop(updater51);
        updater49.attach((observer.Device) desktop57);
        updater46.attach((observer.Device) desktop57);
        updater30.attach((observer.Device) desktop57);
        observer.Updater updater62 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop63 = new observer.Laptop(updater62);
        updater30.attach((observer.Device) laptop63);
        observer.Desktop desktop65 = new observer.Desktop(updater30);
        updater1.attach((observer.Device) desktop65);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test192");
        observer.Updater updater1 = new observer.Updater(10.0d);
        observer.Updater updater3 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test193");
        observer.Updater updater1 = new observer.Updater((double) (byte) -1);
        updater1.updateVersion((double) (short) -1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test194");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1.0f);
        updater1.updateVersion((double) '#');
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Updater updater9 = new observer.Updater((double) (byte) -1);
        observer.Laptop laptop10 = new observer.Laptop(updater9);
        updater1.attach((observer.Device) laptop10);
        updater1.updateVersion((double) 1L);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test195");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test196");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        observer.Updater updater13 = new observer.Updater((double) 100L);
        observer.Desktop desktop14 = new observer.Desktop(updater13);
        observer.Laptop laptop15 = new observer.Laptop(updater13);
        observer.Updater updater17 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        updater13.attach((observer.Device) laptop18);
        observer.Updater updater21 = new observer.Updater((double) 100L);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        observer.Desktop desktop24 = new observer.Desktop(updater23);
        observer.Updater updater26 = new observer.Updater((double) 100L);
        observer.Desktop desktop27 = new observer.Desktop(updater26);
        updater23.attach((observer.Device) desktop27);
        observer.Desktop desktop29 = new observer.Desktop(updater23);
        updater21.attach((observer.Device) desktop29);
        observer.Updater updater32 = new observer.Updater((double) (byte) 1);
        updater32.updateVersion(10.0d);
        observer.Laptop laptop35 = new observer.Laptop(updater32);
        observer.Updater updater37 = new observer.Updater((double) (byte) 1);
        updater37.updateVersion(10.0d);
        observer.Desktop desktop40 = new observer.Desktop(updater37);
        updater32.attach((observer.Device) desktop40);
        updater21.attach((observer.Device) desktop40);
        updater13.attach((observer.Device) desktop40);
        updater1.attach((observer.Device) desktop40);
        updater1.updateVersion((double) 10);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test197");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass8 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test198");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (-1));
        observer.Updater updater17 = new observer.Updater((double) (byte) 1);
        updater17.updateVersion(10.0d);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop22 = new observer.Laptop(updater21);
        observer.Laptop laptop23 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop23);
        observer.Laptop laptop25 = new observer.Laptop(updater17);
        observer.Laptop laptop26 = new observer.Laptop(updater17);
        updater1.attach((observer.Device) laptop26);
        observer.Updater updater29 = new observer.Updater((double) 100L);
        updater29.updateVersion((double) 10);
        observer.Updater updater33 = new observer.Updater((double) (byte) 10);
        updater33.updateVersion((double) 0L);
        updater33.updateVersion(0.0d);
        updater33.updateVersion(0.0d);
        updater33.updateVersion((double) 100);
        observer.Laptop laptop42 = new observer.Laptop(updater33);
        updater29.attach((observer.Device) laptop42);
        observer.Updater updater45 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop46 = new observer.Laptop(updater45);
        observer.Updater updater48 = new observer.Updater((double) 100L);
        observer.Updater updater50 = new observer.Updater((double) 100L);
        observer.Desktop desktop51 = new observer.Desktop(updater50);
        observer.Updater updater53 = new observer.Updater((double) 100L);
        observer.Desktop desktop54 = new observer.Desktop(updater53);
        updater50.attach((observer.Device) desktop54);
        observer.Desktop desktop56 = new observer.Desktop(updater50);
        updater48.attach((observer.Device) desktop56);
        updater45.attach((observer.Device) desktop56);
        updater29.attach((observer.Device) desktop56);
        observer.Updater updater61 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop62 = new observer.Laptop(updater61);
        updater29.attach((observer.Device) laptop62);
        updater1.attach((observer.Device) laptop62);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test199");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 10.0f);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test200");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (byte) 10);
        observer.Updater updater8 = new observer.Updater((double) 100L);
        updater8.updateVersion((double) 10);
        observer.Updater updater12 = new observer.Updater((double) (byte) 10);
        updater12.updateVersion((double) 0L);
        updater12.updateVersion(0.0d);
        updater12.updateVersion(0.0d);
        updater12.updateVersion((double) 100);
        observer.Laptop laptop21 = new observer.Laptop(updater12);
        updater8.attach((observer.Device) laptop21);
        observer.Updater updater24 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop25 = new observer.Laptop(updater24);
        observer.Updater updater27 = new observer.Updater((double) 100L);
        observer.Updater updater29 = new observer.Updater((double) 100L);
        observer.Desktop desktop30 = new observer.Desktop(updater29);
        observer.Updater updater32 = new observer.Updater((double) 100L);
        observer.Desktop desktop33 = new observer.Desktop(updater32);
        updater29.attach((observer.Device) desktop33);
        observer.Desktop desktop35 = new observer.Desktop(updater29);
        updater27.attach((observer.Device) desktop35);
        updater24.attach((observer.Device) desktop35);
        updater8.attach((observer.Device) desktop35);
        updater1.attach((observer.Device) desktop35);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test201");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Desktop desktop12 = new observer.Desktop(updater11);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        updater11.attach((observer.Device) desktop15);
        observer.Desktop desktop17 = new observer.Desktop(updater11);
        updater9.attach((observer.Device) desktop17);
        observer.Updater updater20 = new observer.Updater((double) (byte) 1);
        updater20.updateVersion(10.0d);
        observer.Laptop laptop23 = new observer.Laptop(updater20);
        observer.Updater updater25 = new observer.Updater((double) (byte) 1);
        updater25.updateVersion(10.0d);
        observer.Desktop desktop28 = new observer.Desktop(updater25);
        updater20.attach((observer.Device) desktop28);
        updater9.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        updater1.updateVersion(100.0d);
        observer.Updater updater35 = new observer.Updater((double) 100L);
        observer.Desktop desktop36 = new observer.Desktop(updater35);
        observer.Laptop laptop37 = new observer.Laptop(updater35);
        observer.Updater updater39 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop40 = new observer.Laptop(updater39);
        updater35.attach((observer.Device) laptop40);
        updater35.updateVersion(0.0d);
        observer.Laptop laptop44 = new observer.Laptop(updater35);
        updater1.attach((observer.Device) laptop44);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test202");
        observer.Updater updater1 = new observer.Updater((double) (short) 0);
        updater1.updateVersion(0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test203");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) -1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Laptop laptop8 = new observer.Laptop(updater1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test204");
        observer.Updater updater1 = new observer.Updater((double) '4');
        updater1.updateVersion(10.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test205");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) (short) 0);
        observer.Updater updater6 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        updater6.updateVersion((double) 1.0f);
        updater6.updateVersion((double) '#');
        observer.Laptop laptop12 = new observer.Laptop(updater6);
        observer.Updater updater14 = new observer.Updater((double) 100L);
        observer.Desktop desktop15 = new observer.Desktop(updater14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        observer.Desktop desktop18 = new observer.Desktop(updater17);
        updater14.attach((observer.Device) desktop18);
        observer.Laptop laptop20 = new observer.Laptop(updater14);
        updater14.updateVersion((double) (short) -1);
        observer.Updater updater24 = new observer.Updater((double) (byte) 1);
        updater24.updateVersion(10.0d);
        observer.Laptop laptop27 = new observer.Laptop(updater24);
        observer.Updater updater29 = new observer.Updater((double) (byte) 1);
        updater29.updateVersion(10.0d);
        observer.Desktop desktop32 = new observer.Desktop(updater29);
        updater24.attach((observer.Device) desktop32);
        updater14.attach((observer.Device) desktop32);
        updater6.attach((observer.Device) desktop32);
        updater1.attach((observer.Device) desktop32);
        updater1.updateVersion((double) 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test206");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        observer.Updater updater15 = new observer.Updater((double) 100L);
        observer.Desktop desktop16 = new observer.Desktop(updater15);
        observer.Updater updater18 = new observer.Updater((double) (byte) 1);
        updater18.updateVersion(10.0d);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop23 = new observer.Laptop(updater22);
        observer.Laptop laptop24 = new observer.Laptop(updater22);
        updater18.attach((observer.Device) laptop24);
        observer.Laptop laptop26 = new observer.Laptop(updater18);
        observer.Laptop laptop27 = new observer.Laptop(updater18);
        updater15.attach((observer.Device) laptop27);
        updater1.attach((observer.Device) laptop27);
        updater1.updateVersion((double) 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test207");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 10);
        updater4.updateVersion((double) 0L);
        updater4.updateVersion(0.0d);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        observer.Updater updater13 = new observer.Updater((double) 100L);
        observer.Desktop desktop14 = new observer.Desktop(updater13);
        updater10.attach((observer.Device) desktop14);
        observer.Desktop desktop16 = new observer.Desktop(updater10);
        updater4.attach((observer.Device) desktop16);
        updater1.attach((observer.Device) desktop16);
        observer.Desktop desktop19 = new observer.Desktop(updater1);
        observer.Laptop laptop20 = new observer.Laptop(updater1);
        observer.Updater updater22 = new observer.Updater((double) 0);
        updater22.updateVersion((-1.0d));
        observer.Updater updater26 = new observer.Updater((double) 100L);
        observer.Updater updater28 = new observer.Updater((double) 100L);
        observer.Desktop desktop29 = new observer.Desktop(updater28);
        observer.Updater updater31 = new observer.Updater((double) 100L);
        observer.Desktop desktop32 = new observer.Desktop(updater31);
        updater28.attach((observer.Device) desktop32);
        observer.Desktop desktop34 = new observer.Desktop(updater28);
        updater26.attach((observer.Device) desktop34);
        observer.Updater updater37 = new observer.Updater((double) (byte) 1);
        updater37.updateVersion(10.0d);
        observer.Laptop laptop40 = new observer.Laptop(updater37);
        observer.Updater updater42 = new observer.Updater((double) (byte) 1);
        updater42.updateVersion(10.0d);
        observer.Desktop desktop45 = new observer.Desktop(updater42);
        updater37.attach((observer.Device) desktop45);
        updater26.attach((observer.Device) desktop45);
        updater22.attach((observer.Device) desktop45);
        observer.Laptop laptop49 = new observer.Laptop(updater22);
        observer.Updater updater51 = new observer.Updater((double) 1L);
        observer.Desktop desktop52 = new observer.Desktop(updater51);
        observer.Laptop laptop53 = new observer.Laptop(updater51);
        updater22.attach((observer.Device) laptop53);
        updater1.attach((observer.Device) laptop53);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test208");
        observer.Updater updater1 = new observer.Updater((double) 1L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        updater5.updateVersion((double) 1.0f);
        updater5.updateVersion((double) '#');
        observer.Laptop laptop11 = new observer.Laptop(updater5);
        observer.Updater updater13 = new observer.Updater((double) 100L);
        observer.Desktop desktop14 = new observer.Desktop(updater13);
        observer.Updater updater16 = new observer.Updater((double) 100L);
        observer.Desktop desktop17 = new observer.Desktop(updater16);
        updater13.attach((observer.Device) desktop17);
        observer.Laptop laptop19 = new observer.Laptop(updater13);
        updater13.updateVersion((double) (short) -1);
        observer.Updater updater23 = new observer.Updater((double) (byte) 1);
        updater23.updateVersion(10.0d);
        observer.Laptop laptop26 = new observer.Laptop(updater23);
        observer.Updater updater28 = new observer.Updater((double) (byte) 1);
        updater28.updateVersion(10.0d);
        observer.Desktop desktop31 = new observer.Desktop(updater28);
        updater23.attach((observer.Device) desktop31);
        updater13.attach((observer.Device) desktop31);
        updater5.attach((observer.Device) desktop31);
        updater1.attach((observer.Device) desktop31);
        java.lang.Class<?> wildcardClass36 = desktop31.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test209");
        observer.Updater updater1 = new observer.Updater((double) '4');
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (short) 1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        updater6.updateVersion((double) 100L);
        observer.Laptop laptop11 = new observer.Laptop(updater6);
        updater4.attach((observer.Device) laptop11);
        updater1.attach((observer.Device) laptop11);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test210");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Laptop laptop3 = new observer.Laptop(updater1);
        java.lang.Class<?> wildcardClass4 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test211");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) (byte) 1);
        updater4.updateVersion(10.0d);
        observer.Updater updater8 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop9 = new observer.Laptop(updater8);
        observer.Laptop laptop10 = new observer.Laptop(updater8);
        updater4.attach((observer.Device) laptop10);
        observer.Desktop desktop12 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop12);
        observer.Updater updater15 = new observer.Updater((double) (byte) 1);
        updater15.updateVersion(10.0d);
        observer.Updater updater19 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop20 = new observer.Laptop(updater19);
        observer.Laptop laptop21 = new observer.Laptop(updater19);
        updater15.attach((observer.Device) laptop21);
        updater1.attach((observer.Device) laptop21);
        observer.Laptop laptop24 = new observer.Laptop(updater1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test212");
        observer.Updater updater1 = new observer.Updater((double) 10L);
        updater1.updateVersion((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        observer.Laptop laptop8 = new observer.Laptop(updater6);
        observer.Updater updater10 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop11 = new observer.Laptop(updater10);
        updater6.attach((observer.Device) laptop11);
        updater6.updateVersion(0.0d);
        observer.Desktop desktop15 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test213");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Laptop laptop10 = new observer.Laptop(updater9);
        updater1.attach((observer.Device) laptop10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test214");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Laptop laptop5 = new observer.Laptop(updater1);
        observer.Laptop laptop6 = new observer.Laptop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test215");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 1L);
        observer.Laptop laptop15 = new observer.Laptop(updater1);
        observer.Laptop laptop16 = new observer.Laptop(updater1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test216");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        observer.Updater updater5 = new observer.Updater((double) 100L);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater5.attach((observer.Device) desktop13);
        observer.Updater updater16 = new observer.Updater((double) (byte) 1);
        updater16.updateVersion(10.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        observer.Updater updater21 = new observer.Updater((double) (byte) 1);
        updater21.updateVersion(10.0d);
        observer.Desktop desktop24 = new observer.Desktop(updater21);
        updater16.attach((observer.Device) desktop24);
        updater5.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        java.lang.Class<?> wildcardClass28 = updater1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test217");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        updater1.updateVersion((double) 1L);
        observer.Desktop desktop15 = new observer.Desktop(updater1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test218");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        observer.Laptop laptop10 = new observer.Laptop(updater1);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test219");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverRegTester0.test220");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(100.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
    }
}


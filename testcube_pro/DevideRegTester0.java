import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DevideRegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test002");
        Devide devide0 = new Devide();
        java.lang.Class<?> wildcardClass1 = devide0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test003");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test004");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test005");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test006");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test007");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test008");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test009");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test010");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test011");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test012");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test013");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test014");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test015");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test016");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test017");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test018");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test019");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test020");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test021");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        double double18 = devide0.devide(0, (int) '#');
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test022");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test023");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test024");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test025");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-32.0d) + "'", double24 == (-32.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test026");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test027");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test028");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test029");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        double double9 = devide0.devide((int) 'a', (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test030");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test031");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test032");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test033");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test034");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        double double12 = devide0.devide(0, (int) '#');
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test035");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        double double9 = devide0.devide((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test036");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        double double27 = devide0.devide(0, (int) ' ');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-32.0d) + "'", double24 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test037");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) 'a', (int) (short) 100);
        double double27 = devide0.devide(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test038");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        double double18 = devide0.devide((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test039");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) 'a', (int) 'a');
        double double27 = devide0.devide((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test040");
        Devide devide0 = new Devide();
        double double3 = devide0.devide(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test041");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) ' ', (int) (byte) -1);
        double double33 = devide0.devide((int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass34 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-32.0d) + "'", double30 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test042");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test043");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test044");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) 'a', (int) 'a');
        double double27 = devide0.devide((int) ' ', (int) '#');
        double double30 = devide0.devide((int) ' ', (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test045");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-97.0d) + "'", double30 == (-97.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test046");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test047");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) (short) 10);
        double double33 = devide0.devide((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass34 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.0d + "'", double30 == 3.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test048");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test049");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        double double9 = devide0.devide((int) 'a', (int) (byte) 10);
        double double12 = devide0.devide((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test050");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test051");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test052");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((-1), (int) ' ');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test053");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        double double12 = devide0.devide(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test054");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test055");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide((int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test056");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        java.lang.Class<?> wildcardClass4 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test057");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        double double27 = devide0.devide(0, (int) ' ');
        double double30 = devide0.devide((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-32.0d) + "'", double24 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 32.0d + "'", double30 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test058");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        double double9 = devide0.devide((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test059");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test060");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test061");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test062");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test063");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test064");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test065");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test066");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) (byte) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test067");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide((int) (byte) 100, (int) '4');
        double double9 = devide0.devide((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test068");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((-1), (int) (byte) 10);
        double double24 = devide0.devide((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test069");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test070");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide(100, (int) (byte) 100);
        double double12 = devide0.devide(100, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test071");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) (short) 10);
        double double33 = devide0.devide((int) '#', (int) '4');
        double double36 = devide0.devide((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.0d + "'", double30 == 3.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test072");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) 'a', (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-97.0d) + "'", double9 == (-97.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test073");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test074");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test075");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test076");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide((int) '#', (int) (short) 10);
        double double18 = devide0.devide((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test077");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test078");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test079");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test080");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        double double18 = devide0.devide(100, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test081");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        double double12 = devide0.devide(0, (int) '#');
        double double15 = devide0.devide((int) (short) 100, (int) (byte) -1);
        double double18 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-100.0d) + "'", double15 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test082");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test083");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test084");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-32.0d) + "'", double30 == (-32.0d));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test085");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(1, 10);
        double double27 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double30 = devide0.devide((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test086");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test087");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test088");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) (short) 10);
        double double27 = devide0.devide((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test089");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide(100, (int) (byte) 100);
        double double12 = devide0.devide((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test090");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        double double18 = devide0.devide(0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test091");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        double double9 = devide0.devide((int) 'a', (int) (byte) 10);
        double double12 = devide0.devide((int) (byte) 100, (-1));
        double double15 = devide0.devide((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test092");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double24 = devide0.devide(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test093");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide((int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test094");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        double double18 = devide0.devide((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test095");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test096");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        double double18 = devide0.devide(0, (int) (byte) -1);
        double double21 = devide0.devide(10, (int) (short) 10);
        double double24 = devide0.devide((int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test097");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) 'a', (int) (short) -1);
        double double15 = devide0.devide((int) ' ', 10);
        double double18 = devide0.devide((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-97.0d) + "'", double12 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test098");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test099");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test100");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        double double18 = devide0.devide(0, (int) (byte) -1);
        double double21 = devide0.devide(10, (int) (short) 10);
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test101");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) (short) 10);
        double double27 = devide0.devide((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test102");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        double double27 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double30 = devide0.devide((-1), (-1));
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-32.0d) + "'", double24 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test103");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        double double9 = devide0.devide(1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test104");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        double double18 = devide0.devide(0, (int) '#');
        double double21 = devide0.devide((int) (byte) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test105");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) 'a', (int) (short) 1);
        double double27 = devide0.devide((int) (short) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test106");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) '4', (int) '#');
        double double9 = devide0.devide((int) (byte) 0, (int) (byte) -1);
        double double12 = devide0.devide((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test107");
        Devide devide0 = new Devide();
        double double3 = devide0.devide(100, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-100.0d) + "'", double3 == (-100.0d));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test108");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (short) -1, (int) '#');
        double double15 = devide0.devide((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test109");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test110");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) (byte) 0, (int) (short) -1);
        double double27 = devide0.devide((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test111");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) (byte) 0, (int) (short) -1);
        double double27 = devide0.devide((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.0d + "'", double27 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test112");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test113");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test114");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test115");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test116");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-100.0d) + "'", double24 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test117");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        double double18 = devide0.devide(0, (int) (byte) -1);
        double double21 = devide0.devide(10, (int) (short) 10);
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test118");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) 'a', (int) (short) -1);
        double double15 = devide0.devide((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-97.0d) + "'", double12 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test119");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 1);
        double double18 = devide0.devide((int) (byte) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test120");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (byte) 0, (int) '#');
        double double30 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double33 = devide0.devide((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test121");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-97.0d) + "'", double12 == (-97.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test122");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) 'a', (int) (short) -1);
        double double15 = devide0.devide((int) ' ', 10);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-97.0d) + "'", double12 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test123");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide(10, (int) (byte) 100);
        double double9 = devide0.devide((int) (byte) 10, (int) '4');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test124");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide((int) (byte) 100, (int) '4');
        double double9 = devide0.devide((int) (short) -1, (int) 'a');
        double double12 = devide0.devide((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test125");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) 'a', (int) (short) 1);
        double double27 = devide0.devide((-1), 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test126");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 100);
        double double27 = devide0.devide((int) '4', (int) (short) 10);
        double double30 = devide0.devide((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test127");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) '#', (int) (short) 100);
        double double24 = devide0.devide((int) ' ', (int) (byte) 1);
        double double27 = devide0.devide(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test128");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.0d + "'", double30 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test129");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        double double18 = devide0.devide(0, (int) (byte) -1);
        double double21 = devide0.devide(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test130");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test131");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test132");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) (byte) 100);
        double double27 = devide0.devide((int) '4', 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 52.0d + "'", double27 == 52.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test133");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test134");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide((int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass7 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test135");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) '4', 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 52.0d + "'", double21 == 52.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test136");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide(10, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test137");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide((int) (byte) -1, (int) (short) 1);
        double double12 = devide0.devide((int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test138");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide((int) '#', (int) (short) 10);
        double double18 = devide0.devide(1, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test139");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        double double9 = devide0.devide(0, (-1));
        double double12 = devide0.devide((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test140");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide(1, 1);
        double double15 = devide0.devide(0, (-1));
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test141");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test142");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) '4', (int) '4');
        double double9 = devide0.devide((int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test143");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        double double18 = devide0.devide(10, (int) (short) 1);
        double double21 = devide0.devide((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test144");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        double double9 = devide0.devide((int) (short) 100, 1);
        double double12 = devide0.devide((int) (short) 100, (int) (short) 100);
        double double15 = devide0.devide((int) (byte) 0, (int) (short) 1);
        double double18 = devide0.devide(100, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test145");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(1, 10);
        double double27 = devide0.devide((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test146");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide(100, (int) '#');
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 2.0d + "'", double24 == 2.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test147");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) '4', (int) (byte) -1);
        double double30 = devide0.devide((int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-52.0d) + "'", double27 == (-52.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test148");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) (short) 10);
        double double27 = devide0.devide((int) 'a', (int) '4');
        double double30 = devide0.devide(100, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test149");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(1, 10);
        double double27 = devide0.devide((int) (short) -1, (int) (short) 100);
        double double30 = devide0.devide((int) (byte) -1, (int) ' ');
        double double33 = devide0.devide((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test150");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 3.0d + "'", double27 == 3.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test151");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) '#', (int) (short) 100);
        double double24 = devide0.devide((int) ' ', (int) (byte) 1);
        double double27 = devide0.devide(10, (int) (byte) 100);
        double double30 = devide0.devide((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 32.0d + "'", double24 == 32.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test152");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (short) 10, (int) 'a');
        double double30 = devide0.devide((int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test153");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (short) 0, (int) 'a');
        double double27 = devide0.devide(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test154");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide(10, (int) (short) 10);
        double double18 = devide0.devide((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test155");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test156");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(1, 10);
        double double27 = devide0.devide((int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test157");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        double double9 = devide0.devide(0, (-1));
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test158");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide((int) '#', (int) (short) 10);
        double double18 = devide0.devide((int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 3.0d + "'", double15 == 3.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test159");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide(1, 1);
        double double15 = devide0.devide(0, (-1));
        double double18 = devide0.devide((int) (byte) -1, (int) (short) -1);
        double double21 = devide0.devide(1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test160");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) (byte) 0, (int) (byte) 100);
        double double15 = devide0.devide(0, (int) (byte) -1);
        double double18 = devide0.devide(0, (int) (byte) -1);
        double double21 = devide0.devide(10, (int) (short) 10);
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 1);
        double double27 = devide0.devide(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test161");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-10.0d) + "'", double21 == (-10.0d));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test162");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test163");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        double double15 = devide0.devide(10, (int) (short) 10);
        double double18 = devide0.devide((int) (byte) 100, (int) (short) -1);
        double double21 = devide0.devide((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-100.0d) + "'", double18 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test164");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        double double9 = devide0.devide((int) (short) 100, 1);
        double double12 = devide0.devide((int) (short) 100, (int) (short) 100);
        double double15 = devide0.devide((int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test165");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (short) 100, (int) (byte) -1);
        double double27 = devide0.devide((int) (short) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-100.0d) + "'", double24 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test166");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) '#', (int) '#');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test167");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) (byte) -1, (-1));
        double double15 = devide0.devide((int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test168");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        double double9 = devide0.devide(0, (-1));
        double double12 = devide0.devide(100, (-1));
        double double15 = devide0.devide((int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test169");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        double double18 = devide0.devide(0, (int) 'a');
        double double21 = devide0.devide((int) (byte) 100, (int) '4');
        double double24 = devide0.devide((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test170");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) 'a', (int) (short) 1);
        double double27 = devide0.devide(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 97.0d + "'", double24 == 97.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test171");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        double double9 = devide0.devide((int) (short) 100, 1);
        double double12 = devide0.devide((int) (short) 100, (int) (short) 100);
        double double15 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test172");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) (byte) 100);
        double double27 = devide0.devide(100, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-100.0d) + "'", double27 == (-100.0d));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test173");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (byte) 0, (int) '#');
        double double30 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test174");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        double double12 = devide0.devide(0, (int) (byte) 100);
        double double15 = devide0.devide((int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test175");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 1, (int) (short) 1);
        double double9 = devide0.devide(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test176");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        double double9 = devide0.devide((int) (short) -1, (int) (short) 10);
        double double12 = devide0.devide((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test177");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test178");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        double double12 = devide0.devide((int) '#', (int) (short) 100);
        double double15 = devide0.devide((int) (short) 0, (int) (short) 1);
        double double18 = devide0.devide(0, 1);
        double double21 = devide0.devide(0, (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test179");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) '#', (int) (short) 100);
        double double24 = devide0.devide(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test180");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) ' ', (int) (byte) -1);
        double double33 = devide0.devide(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-32.0d) + "'", double30 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test181");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        double double30 = devide0.devide((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass31 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test182");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide(1, 1);
        double double15 = devide0.devide(0, (-1));
        double double18 = devide0.devide((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test183");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        double double9 = devide0.devide(0, (-1));
        double double12 = devide0.devide(100, (-1));
        double double15 = devide0.devide(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test184");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (short) 100, (int) (byte) -1);
        double double12 = devide0.devide(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-100.0d) + "'", double9 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test185");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (byte) 10, (int) '4');
        double double12 = devide0.devide((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass13 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test186");
        Devide devide0 = new Devide();
        double double3 = devide0.devide(0, (int) (byte) 100);
        double double6 = devide0.devide((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-52.0d) + "'", double6 == (-52.0d));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test187");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (byte) -1, (int) ' ');
        double double24 = devide0.devide(0, 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test188");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test189");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (byte) 0, (int) '#');
        double double30 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double33 = devide0.devide((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test190");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) (short) 10);
        double double27 = devide0.devide((int) (short) 0, (int) 'a');
        double double30 = devide0.devide((int) (short) -1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test191");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 1);
        double double18 = devide0.devide((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test192");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass25 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test193");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) 'a', (int) 'a');
        double double27 = devide0.devide((int) ' ', (int) '#');
        double double30 = devide0.devide((int) ' ', (int) (byte) 100);
        double double33 = devide0.devide((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test194");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) 'a');
        double double9 = devide0.devide((int) (byte) 0, (int) (short) 1);
        double double12 = devide0.devide((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test195");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 100);
        double double27 = devide0.devide((int) '4', (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-100.0d) + "'", double21 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 5.0d + "'", double27 == 5.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test196");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        double double18 = devide0.devide((int) '#', (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 3.0d + "'", double18 == 3.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test197");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide(0, (int) (short) 10);
        double double9 = devide0.devide((int) 'a', (int) (byte) 10);
        double double12 = devide0.devide((int) (byte) 100, (-1));
        double double15 = devide0.devide((int) (short) 1, (int) '4');
        double double18 = devide0.devide((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass19 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 9.0d + "'", double9 == 9.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-100.0d) + "'", double12 == (-100.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test198");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        double double15 = devide0.devide((int) ' ', (int) (short) 1);
        double double18 = devide0.devide(0, (int) 'a');
        double double21 = devide0.devide((int) (byte) 100, (int) '4');
        java.lang.Class<?> wildcardClass22 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-32.0d) + "'", double12 == (-32.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test199");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (short) 0, (int) (short) 1);
        double double15 = devide0.devide((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test200");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-97.0d) + "'", double3 == (-97.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test201");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        double double9 = devide0.devide((int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass10 = devide0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test202");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test203");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (byte) 10, (int) '4');
        double double12 = devide0.devide((int) ' ', (int) (short) 10);
        double double15 = devide0.devide((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 3.0d + "'", double12 == 3.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideRegTester0.test204");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) '#', (int) '#');
        double double12 = devide0.devide((int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }
}


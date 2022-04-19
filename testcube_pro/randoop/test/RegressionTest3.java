import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        int int21 = testClass1_0.add((int) (short) 1, (int) (byte) 10);
        int int24 = testClass1_0.add((-34), (-36));
        int int27 = testClass1_0.add((-32), (-98));
        int int30 = testClass1_0.add(98, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add(26, (int) (short) 1);
        int int30 = testClass1_0.add((-33), 50);
        int int33 = testClass1_0.add(0, 12);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27 + "'", int27 == 27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(13, 11);
        int int27 = testClass1_0.add((-26), (-99));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        int int21 = testClass1_0.add(25, (-99));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-12), (-2));
        int int15 = testClass1_0.add(97, 14);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(33, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add((-7), 27);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(0, (-97));
        int int18 = testClass1_0.add((int) (short) -1, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add(102, (-97));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-7), 13);
        int int27 = testClass1_0.add(98, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(18, (int) '#');
        int int21 = testClass1_0.add((-7), (-25));
        int int24 = testClass1_0.add(51, 50);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add((-1), 6);
        int int21 = testClass1_0.add(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(51, (-16));
        int int27 = testClass1_0.add(100, (-20));
        int int30 = testClass1_0.add((-5), 4);
        int int33 = testClass1_0.add(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-12), (int) (byte) 100);
        int int27 = testClass1_0.add((-96), (int) (short) -1);
        int int30 = testClass1_0.add(27, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(12, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(9, (int) (byte) 1);
        int int21 = testClass1_0.add(8, 8);
        int int24 = testClass1_0.add((-53), 20);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add(9, (-49));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        int int24 = testClass1_0.add((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((-1), 4);
        int int21 = testClass1_0.add((-25), (-10));
        int int24 = testClass1_0.add((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((-4), 11);
        int int24 = testClass1_0.add((int) (byte) 10, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(33, 101);
        int int24 = testClass1_0.add(51, (-97));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        int int21 = testClass1_0.add((int) (short) 0, (-13));
        int int24 = testClass1_0.add((int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-26), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add(0, (-13));
        int int21 = testClass1_0.add(0, (-36));
        int int24 = testClass1_0.add(26, 21);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add(34, (-34));
        int int30 = testClass1_0.add((-3), (-96));
        int int33 = testClass1_0.add((-11), (-4));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add(37, 27);
        int int27 = testClass1_0.add((int) (short) -1, 12);
        int int30 = testClass1_0.add((-16), (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) (short) 10, 98);
        int int12 = testClass1_0.add((-96), 53);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(53, 11);
        int int12 = testClass1_0.add(0, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        int int21 = testClass1_0.add(4, (-24));
        int int24 = testClass1_0.add((-23), (-96));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 0, (-23));
        int int18 = testClass1_0.add((-23), 27);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(102, (-6));
        int int24 = testClass1_0.add((-51), (-51));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(51, (-16));
        int int27 = testClass1_0.add(9, 50);
        int int30 = testClass1_0.add((-32), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-50), 50);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-99), 101);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        int int27 = testClass1_0.add(0, (-53));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((-36), (-51));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add((-7), (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(100, 21);
        int int9 = testClass1_0.add(11, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add((-36), (-9));
        int int30 = testClass1_0.add((int) (short) 10, 54);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add((int) (byte) 10, (-96));
        int int30 = testClass1_0.add(1, (-10));
        int int33 = testClass1_0.add((-23), (-2));
        int int36 = testClass1_0.add(11, (int) '4');
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 12 + "'", int33 == 12);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-19));
        int int21 = testClass1_0.add(21, (-1));
        int int24 = testClass1_0.add(34, (-9));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-14), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add((int) (short) 100, 8);
        int int27 = testClass1_0.add((-51), (-14));
        int int30 = testClass1_0.add(15, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(17, 5);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
        int int27 = testClass1_0.add((-7), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add((-32), 8);
        int int33 = testClass1_0.add((-8), (int) '4');
        int int36 = testClass1_0.add(12, (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add(22, (-101));
        int int24 = testClass1_0.add((-32), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-5), 34);
        int int21 = testClass1_0.add((-14), 55);
        int int24 = testClass1_0.add(7, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-1), (-23));
        int int18 = testClass1_0.add((int) (short) -1, (-10));
        int int21 = testClass1_0.add(17, 51);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(36, (-101));
        int int18 = testClass1_0.add((-33), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        int int27 = testClass1_0.add((-13), 102);
        int int30 = testClass1_0.add((-19), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add((-18), (-6));
        int int12 = testClass1_0.add((-34), 17);
        int int15 = testClass1_0.add((-13), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-12) + "'", int15 == (-12));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add(2, (-8));
        int int18 = testClass1_0.add((-2), (int) (short) -1);
        int int21 = testClass1_0.add(0, 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add((int) (byte) 100, 3);
        int int30 = testClass1_0.add((-3), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((-3), 21);
        int int9 = testClass1_0.add(49, 53);
        int int12 = testClass1_0.add(4, 51);
        int int15 = testClass1_0.add((int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add((-23), 9);
        int int30 = testClass1_0.add(7, 8);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add((-51), 7);
        int int30 = testClass1_0.add(97, (-20));
        int int33 = testClass1_0.add((-5), (-50));
        int int36 = testClass1_0.add(27, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add(101, (-14));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        int int18 = testClass1_0.add((int) (short) 100, (int) '#');
        int int21 = testClass1_0.add(3, (-51));
        int int24 = testClass1_0.add((-98), 37);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add(27, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 7);
        int int24 = testClass1_0.add(8, (-97));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-32), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-32), (-23));
        int int18 = testClass1_0.add(8, (-1));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((int) (short) 10, (-50));
        int int21 = testClass1_0.add(101, (-14));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(34, 34);
        int int27 = testClass1_0.add((-96), (int) 'a');
        int int30 = testClass1_0.add(36, 34);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(21, (-51));
        int int15 = testClass1_0.add(35, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(100, 21);
        int int9 = testClass1_0.add(7, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-4), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-24), 101);
        int int24 = testClass1_0.add((-16), 8);
        int int27 = testClass1_0.add(51, (int) 'a');
        int int30 = testClass1_0.add((-5), 17);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((int) (byte) 0, 8);
        int int12 = testClass1_0.add(2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        int int18 = testClass1_0.add(26, 50);
        int int21 = testClass1_0.add((-12), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        int int27 = testClass1_0.add(7, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        int int15 = testClass1_0.add((-25), 50);
        int int18 = testClass1_0.add(25, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add(49, (int) ' ');
        int int30 = testClass1_0.add(102, (int) (short) 10);
        int int33 = testClass1_0.add((-32), (-16));
        int int36 = testClass1_0.add((-16), 100);
        int int39 = testClass1_0.add(20, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = testClass1_0.add(102, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(33, (-9));
        int int15 = testClass1_0.add(49, (-13));
        int int18 = testClass1_0.add((-12), (-48));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-2), (-36));
        int int24 = testClass1_0.add(9, (-101));
        int int27 = testClass1_0.add((-53), (-33));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        int int24 = testClass1_0.add(27, (int) '4');
        int int27 = testClass1_0.add(0, (-50));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add(1, (-8));
        int int21 = testClass1_0.add((-11), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add((int) '4', (-48));
        int int24 = testClass1_0.add(0, 6);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add((-7), 27);
        int int24 = testClass1_0.add(7, 25);
        int int27 = testClass1_0.add((-97), 36);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-101), (-8));
        int int18 = testClass1_0.add(36, 37);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add(27, (-12));
        int int15 = testClass1_0.add((-96), (-23));
        int int18 = testClass1_0.add((int) (short) 1, (-2));
        int int21 = testClass1_0.add(8, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((-20), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(9, (int) (short) 1);
        int int24 = testClass1_0.add(12, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((-18), (-1));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, 9);
        int int21 = testClass1_0.add((-7), 35);
        int int24 = testClass1_0.add(54, (int) (short) -1);
        int int27 = testClass1_0.add(6, 21);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-53) + "'", int24 == (-53));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        int int18 = testClass1_0.add(13, (int) (byte) -1);
        int int21 = testClass1_0.add((-101), (-18));
        int int24 = testClass1_0.add((-9), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-12) + "'", int18 == (-12));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add(37, (-9));
        int int30 = testClass1_0.add((-7), (-24));
        int int33 = testClass1_0.add(22, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add((-51), 7);
        int int30 = testClass1_0.add(97, (-20));
        int int33 = testClass1_0.add((-5), (-50));
        int int36 = testClass1_0.add((int) ' ', 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(100, (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 10, (-34));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add(0, (int) 'a');
        int int30 = testClass1_0.add(11, 101);
        int int33 = testClass1_0.add(3, 37);
        int int36 = testClass1_0.add(0, (-50));
        int int39 = testClass1_0.add(6, 8);
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(10, (int) (byte) 1);
        int int27 = testClass1_0.add((int) (byte) -1, 97);
        int int30 = testClass1_0.add((-50), 22);
        int int33 = testClass1_0.add(0, (-48));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add((-51), 7);
        int int30 = testClass1_0.add(97, (-20));
        int int33 = testClass1_0.add((-5), (-50));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-96), (-12));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-34), 100);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add(12, (-13));
        int int21 = testClass1_0.add(49, (-2));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-23) + "'", int21 == (-23));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-6), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add(0, (int) '#');
        int int24 = testClass1_0.add((-20), (-13));
        int int27 = testClass1_0.add(2, (int) (byte) 10);
        int int30 = testClass1_0.add((-12), 14);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add(51, (-20));
        int int24 = testClass1_0.add(25, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(98, 10);
        int int21 = testClass1_0.add(21, 8);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add(15, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add(11, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, (int) (byte) 100);
        int int21 = testClass1_0.add(27, 13);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-8), 35);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-49), (-36));
        int int21 = testClass1_0.add((-21), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        int int21 = testClass1_0.add((-49), (-16));
        int int24 = testClass1_0.add(6, 35);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(25, 25);
        int int21 = testClass1_0.add((-99), 10);
        int int24 = testClass1_0.add(17, 12);
        int int27 = testClass1_0.add(7, 25);
        int int30 = testClass1_0.add((int) ' ', 14);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add(11, 3);
        int int33 = testClass1_0.add(100, (-4));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add((-6), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-24) + "'", int33 == (-24));
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (-48));
        int int18 = testClass1_0.add(11, (-24));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-23), 8);
        int int27 = testClass1_0.add((-51), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(0, (-1));
        int int21 = testClass1_0.add(101, 1);
        int int24 = testClass1_0.add((-23), (-48));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        int int24 = testClass1_0.add(13, 1);
        int int27 = testClass1_0.add(20, 102);
        int int30 = testClass1_0.add(20, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add(0, (int) 'a');
        int int30 = testClass1_0.add(11, 101);
        int int33 = testClass1_0.add(3, 37);
        int int36 = testClass1_0.add(0, (-50));
        // The following exception was thrown during execution in test generation
        try {
            int int39 = testClass1_0.add(11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(13, 11);
        int int27 = testClass1_0.add((-26), (-99));
        int int30 = testClass1_0.add((int) (short) -1, 18);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add(51, (-16));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-12), 33);
        int int27 = testClass1_0.add(101, (-7));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-13) + "'", int27 == (-13));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 0, (-50));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-49), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        int int21 = testClass1_0.add((int) (short) 10, 101);
        int int24 = testClass1_0.add((-13), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-19), 53);
        int int18 = testClass1_0.add((-7), 4);
        int int21 = testClass1_0.add((int) (byte) 0, (-101));
        int int24 = testClass1_0.add((-26), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((-3), 21);
        int int9 = testClass1_0.add(49, 53);
        int int12 = testClass1_0.add((-7), 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(18, 49);
        int int24 = testClass1_0.add(9, 1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-24), 101);
        int int24 = testClass1_0.add((-49), 98);
        int int27 = testClass1_0.add((-9), (-98));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(12, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        int int24 = testClass1_0.add(53, 13);
        int int27 = testClass1_0.add(18, 49);
        int int30 = testClass1_0.add(0, (-11));
        int int33 = testClass1_0.add(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
        int int21 = testClass1_0.add(3, (-12));
        int int24 = testClass1_0.add(0, 33);
        int int27 = testClass1_0.add((-10), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((-11), (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-3), 25);
        int int24 = testClass1_0.add(49, 9);
        int int27 = testClass1_0.add((-19), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add((int) (short) 1, 36);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-97), 53);
        int int27 = testClass1_0.add(18, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        int int12 = testClass1_0.add((-21), (int) (byte) -1);
        int int15 = testClass1_0.add(25, (-23));
        int int18 = testClass1_0.add(26, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (short) 1, (int) (byte) 1);
        int int15 = testClass1_0.add((int) 'a', 51);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add((-13), 51);
        int int21 = testClass1_0.add((-34), (-10));
        int int24 = testClass1_0.add(8, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(36, 1);
        int int27 = testClass1_0.add((-50), (int) (byte) 1);
        int int30 = testClass1_0.add(0, 12);
        int int33 = testClass1_0.add(101, 97);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-49) + "'", int27 == (-49));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(0, (-18));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add(50, (-14));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((-10), (-9));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(0, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((-11), 36);
        int int24 = testClass1_0.add((-6), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(8, 100);
        int int24 = testClass1_0.add(15, (-10));
        int int27 = testClass1_0.add((-1), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add(21, 51);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        int int24 = testClass1_0.add((int) (short) 10, 6);
        int int27 = testClass1_0.add(0, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(33, (-9));
        int int15 = testClass1_0.add(49, (-13));
        int int18 = testClass1_0.add(27, (-25));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(55, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        int int27 = testClass1_0.add((-5), 37);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add((-3), 49);
        int int21 = testClass1_0.add(6, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(0, (-25));
        int int24 = testClass1_0.add((int) (byte) 10, 8);
        int int27 = testClass1_0.add(0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add((-32), (-49));
        int int21 = testClass1_0.add(17, (-10));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-4), (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add(0, (int) 'a');
        int int30 = testClass1_0.add(22, (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add(100, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add(4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) -1, 37);
        int int18 = testClass1_0.add((-4), (-2));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        int int24 = testClass1_0.add(3, 100);
        int int27 = testClass1_0.add((-96), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        int int15 = testClass1_0.add(17, 7);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add((-32), (-10));
        int int30 = testClass1_0.add(98, (int) (short) -1);
        int int33 = testClass1_0.add(17, (-1));
        int int36 = testClass1_0.add((-9), 97);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-97) + "'", int30 == (-97));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-16) + "'", int33 == (-16));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(27, (int) 'a');
        int int21 = testClass1_0.add((-24), (-19));
        int int24 = testClass1_0.add(97, 37);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add(21, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-6), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add(2, (-8));
        int int18 = testClass1_0.add((-2), (int) (short) -1);
        int int21 = testClass1_0.add((-11), (-6));
        int int24 = testClass1_0.add(3, 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(6, 27);
        int int30 = testClass1_0.add(8, 26);
        int int33 = testClass1_0.add((-4), (-16));
        int int36 = testClass1_0.add((int) (short) 100, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(14, (int) (short) -1);
        int int24 = testClass1_0.add((-23), (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13) + "'", int21 == (-13));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add((-19), (int) (short) 100);
        int int27 = testClass1_0.add(10, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-97), 53);
        int int27 = testClass1_0.add(97, 54);
        int int30 = testClass1_0.add((-51), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        int int21 = testClass1_0.add(4, (-24));
        int int24 = testClass1_0.add(53, 3);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add(98, 35);
        int int12 = testClass1_0.add((-8), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        int int12 = testClass1_0.add((int) 'a', 1);
        int int15 = testClass1_0.add(53, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add((-32), (-10));
        int int30 = testClass1_0.add((int) (short) 1, (-26));
        int int33 = testClass1_0.add(54, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add((-21), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 35);
        int int24 = testClass1_0.add((int) (byte) 0, (int) '4');
        int int27 = testClass1_0.add((int) (byte) 10, 54);
        int int30 = testClass1_0.add((-26), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add((-1), (int) (byte) 10);
        int int24 = testClass1_0.add((-8), 37);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(11, 27);
        int int27 = testClass1_0.add((-97), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-18) + "'", int27 == (-18));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(25, (-13));
        int int15 = testClass1_0.add(53, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-24), 101);
        int int24 = testClass1_0.add((-36), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-35) + "'", int24 == (-35));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) -1, (-50));
        int int24 = testClass1_0.add(100, 102);
        int int27 = testClass1_0.add((-98), 4);
        int int30 = testClass1_0.add((int) (byte) 1, (-24));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-23) + "'", int27 == (-23));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add((int) 'a', (-101));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-21), 51);
        int int27 = testClass1_0.add(0, (-21));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((int) ' ', (int) (byte) 1);
        int int27 = testClass1_0.add(6, 26);
        int int30 = testClass1_0.add((-99), (-34));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((-34), (int) (byte) 100);
        int int21 = testClass1_0.add(21, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add(37, (-9));
        int int30 = testClass1_0.add((-7), (-24));
        int int33 = testClass1_0.add((-32), 12);
        int int36 = testClass1_0.add(49, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        int int18 = testClass1_0.add((int) (short) 100, (int) '#');
        int int21 = testClass1_0.add(97, 6);
        int int24 = testClass1_0.add(15, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-23), (int) '4');
        int int27 = testClass1_0.add((int) ' ', (-6));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-99), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((-3), (-36));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(13, 11);
        int int27 = testClass1_0.add((-26), (-99));
        int int30 = testClass1_0.add((int) (short) -1, 18);
        int int33 = testClass1_0.add((-6), 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        int int21 = testClass1_0.add((-51), (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-50) + "'", int21 == (-50));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(51, (-8));
        int int24 = testClass1_0.add((-13), 53);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        int int18 = testClass1_0.add(13, (int) (byte) -1);
        int int21 = testClass1_0.add(0, 25);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-12) + "'", int18 == (-12));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(8, 6);
        int int18 = testClass1_0.add((-11), (-99));
        int int21 = testClass1_0.add((-8), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 0, (-50));
        int int15 = testClass1_0.add(37, 11);
        int int18 = testClass1_0.add(55, 20);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(54, 102);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add(102, (int) (byte) 10);
        int int30 = testClass1_0.add((-35), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(102, (-6));
        int int24 = testClass1_0.add((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        int int18 = testClass1_0.add(54, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(36, 1);
        int int27 = testClass1_0.add(51, (-18));
        int int30 = testClass1_0.add((-3), (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add(37, (-9));
        int int30 = testClass1_0.add((-7), (-24));
        int int33 = testClass1_0.add((-32), 12);
        int int36 = testClass1_0.add(51, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
        int int21 = testClass1_0.add((-101), (-11));
        int int24 = testClass1_0.add((-50), (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add(51, 18);
        int int15 = testClass1_0.add((-32), (-10));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add(0, (int) '#');
        int int24 = testClass1_0.add((-20), (-13));
        int int27 = testClass1_0.add((-101), (-6));
        int int30 = testClass1_0.add((-36), (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(34, (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(37, 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add((-48), 34);
        int int21 = testClass1_0.add(0, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(33, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((int) '4', 53);
        int int12 = testClass1_0.add((-13), (int) ' ');
        int int15 = testClass1_0.add((-17), (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-5), 54);
        int int24 = testClass1_0.add((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36 + "'", int24 == 36);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(102, (-4));
        int int21 = testClass1_0.add(5, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(53, (-12));
        int int27 = testClass1_0.add(20, 100);
        int int30 = testClass1_0.add(101, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 51 + "'", int30 == 51);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((int) (short) 10, (int) (short) 100);
        int int18 = testClass1_0.add((-9), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        int int21 = testClass1_0.add((-50), (int) (short) 1);
        int int24 = testClass1_0.add((-14), 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-49) + "'", int21 == (-49));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add(5, (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        int int21 = testClass1_0.add(54, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55 + "'", int21 == 55);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-5), 34);
        int int21 = testClass1_0.add((int) '4', 7);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((-1), 4);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add(26, (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-7), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 35);
        int int24 = testClass1_0.add((int) (byte) 0, (int) '4');
        int int27 = testClass1_0.add((int) (short) 0, 1);
        int int30 = testClass1_0.add(13, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add((int) (byte) -1, 18);
        int int30 = testClass1_0.add((-9), 22);
        int int33 = testClass1_0.add((int) (byte) -1, 10);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((int) (byte) 10, (-99));
        int int24 = testClass1_0.add(12, 102);
        int int27 = testClass1_0.add(8, (int) (byte) -1);
        int int30 = testClass1_0.add((int) '#', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(18, 12);
        int int9 = testClass1_0.add(0, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add((-3), (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add(21, (int) (byte) -1);
        int int24 = testClass1_0.add(14, 21);
        int int27 = testClass1_0.add((-21), (int) 'a');
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-34), 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-15), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 0, (-12));
        int int24 = testClass1_0.add(27, (int) (byte) -1);
        int int27 = testClass1_0.add((-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-26) + "'", int24 == (-26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add(34, (-34));
        int int30 = testClass1_0.add((-24), (int) (short) 10);
        int int33 = testClass1_0.add(11, 9);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((-16), 21);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(7, (-12));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(102, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-101) + "'", int24 == (-101));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        int int18 = testClass1_0.add((int) (short) 100, (int) '#');
        int int21 = testClass1_0.add(3, (-51));
        int int24 = testClass1_0.add((-98), 37);
        int int27 = testClass1_0.add(22, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(97, (int) (short) -1);
        int int27 = testClass1_0.add(25, 17);
        int int30 = testClass1_0.add(2, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-96) + "'", int24 == (-96));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(18, 49);
        int int24 = testClass1_0.add(9, 1);
        int int27 = testClass1_0.add((-7), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-21), 51);
        int int27 = testClass1_0.add(4, (-97));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((int) (byte) -1, (-32));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((int) '4', 17);
        int int30 = testClass1_0.add((int) (short) 10, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add(2, (-8));
        int int18 = testClass1_0.add(15, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, 9);
        int int21 = testClass1_0.add((-7), 35);
        int int24 = testClass1_0.add(21, 34);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add(49, (int) ' ');
        int int30 = testClass1_0.add(102, (int) (short) 10);
        int int33 = testClass1_0.add((-32), (-16));
        int int36 = testClass1_0.add((-1), 13);
        int int39 = testClass1_0.add((-7), 97);
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(97, 10);
        int int30 = testClass1_0.add(100, (-99));
        int int33 = testClass1_0.add(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add(18, (-20));
        int int24 = testClass1_0.add((int) (short) 10, (-8));
        int int27 = testClass1_0.add(27, 100);
        int int30 = testClass1_0.add(7, (-3));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add(101, (-7));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13) + "'", int24 == (-13));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((-18), (-1));
        int int18 = testClass1_0.add(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(7, (int) (byte) 100);
        int int18 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int21 = testClass1_0.add(6, (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add((-8), (-10));
        int int12 = testClass1_0.add((-14), 5);
        int int15 = testClass1_0.add((-5), (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(22, 13);
        int int21 = testClass1_0.add(20, (-20));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(98, 54);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-9), (-24));
        int int18 = testClass1_0.add(5, 12);
        int int21 = testClass1_0.add(27, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(1, (-15));
        int int21 = testClass1_0.add(35, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add(37, 27);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-8), (int) (short) 1);
        int int15 = testClass1_0.add(27, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((int) (byte) 0, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(6, 27);
        int int30 = testClass1_0.add(8, 26);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(102, (-6));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int24 = testClass1_0.add((-51), (-9));
        int int27 = testClass1_0.add(36, (-16));
        int int30 = testClass1_0.add((-1), 13);
        int int33 = testClass1_0.add((-97), (-13));
        int int36 = testClass1_0.add((-15), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(5, (-8));
        int int24 = testClass1_0.add(101, (-21));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add((-24), 4);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add(1, (-8));
        int int21 = testClass1_0.add((-34), 50);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((-3), (-36));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-101), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add(27, (-12));
        int int15 = testClass1_0.add((-96), (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((int) (byte) -1, (-24));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(2, 10);
        int int27 = testClass1_0.add(7, 100);
        int int30 = testClass1_0.add(51, 22);
        int int33 = testClass1_0.add((-3), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-16), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(25, 25);
        int int21 = testClass1_0.add((-99), 10);
        int int24 = testClass1_0.add(100, (-19));
        int int27 = testClass1_0.add((int) (short) 0, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(8, 100);
        int int24 = testClass1_0.add(5, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(35, (-18));
        int int21 = testClass1_0.add((-23), (-7));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) 'a', 8);
        int int21 = testClass1_0.add(6, 2);
        int int24 = testClass1_0.add((-101), (-11));
        int int27 = testClass1_0.add((-34), 51);
        int int30 = testClass1_0.add(15, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', 13);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        int int12 = testClass1_0.add(37, (-31));
        int int15 = testClass1_0.add(7, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int24 = testClass1_0.add((-51), (-9));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add(33, 101);
        int int30 = testClass1_0.add(17, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 18 + "'", int30 == 18);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(1, (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(1, (-10));
        int int15 = testClass1_0.add(97, 27);
        int int18 = testClass1_0.add(1, (-23));
        int int21 = testClass1_0.add(97, (-1));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96) + "'", int21 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((int) (byte) 10, (-99));
        int int24 = testClass1_0.add((-13), 1);
        int int27 = testClass1_0.add(97, (int) 'a');
        int int30 = testClass1_0.add((-95), (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add(49, 4);
        int int30 = testClass1_0.add((-15), (-20));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (int) (short) -1);
        int int27 = testClass1_0.add((-14), 21);
        int int30 = testClass1_0.add((-50), 7);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        int int12 = testClass1_0.add(54, 34);
        int int15 = testClass1_0.add((-95), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add((-32), (-10));
        int int30 = testClass1_0.add(98, (int) (short) -1);
        int int33 = testClass1_0.add(0, 13);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-97) + "'", int30 == (-97));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add((int) ' ', (-13));
        int int21 = testClass1_0.add(22, 54);
        int int24 = testClass1_0.add((-25), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
        int int21 = testClass1_0.add(2, 22);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((int) '4', 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((int) ' ', 2);
        int int15 = testClass1_0.add(36, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(11, 98);
        int int9 = testClass1_0.add((-18), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-23), (int) '4');
        int int27 = testClass1_0.add((-12), (-6));
        int int30 = testClass1_0.add(8, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        int int21 = testClass1_0.add(102, (-24));
        int int24 = testClass1_0.add((int) (short) 10, (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-6), (-19));
        int int18 = testClass1_0.add((-4), 21);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(4, 10);
        int int21 = testClass1_0.add((-10), 21);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        int int18 = testClass1_0.add(19, 26);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-34), (-34));
        int int15 = testClass1_0.add((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 0, (-50));
        int int15 = testClass1_0.add(33, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-16), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-15) + "'", int21 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        int int21 = testClass1_0.add((int) (short) 10, 101);
        int int24 = testClass1_0.add(53, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(0, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add((-99), 36);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add(51, 17);
        int int18 = testClass1_0.add(2, (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        int int24 = testClass1_0.add(13, 98);
        int int27 = testClass1_0.add(5, (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        int int21 = testClass1_0.add(34, 19);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add((-11), 3);
        int int30 = testClass1_0.add((-4), 9);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add((-32), 102);
        int int15 = testClass1_0.add((-32), (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, (-7));
        int int21 = testClass1_0.add(13, (-32));
        int int24 = testClass1_0.add(49, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((int) (byte) -1, 25);
        int int21 = testClass1_0.add((-19), 37);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(36, (int) 'a');
        int int24 = testClass1_0.add((-10), 49);
        int int27 = testClass1_0.add(50, (int) (byte) 1);
        int int30 = testClass1_0.add(6, 25);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((-21), 12);
        int int21 = testClass1_0.add((int) 'a', 50);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(18, 97);
        int int24 = testClass1_0.add((-48), (int) '#');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((int) (byte) 0, 34);
        int int24 = testClass1_0.add((-12), (-20));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-19), 53);
        int int18 = testClass1_0.add((-7), 4);
        int int21 = testClass1_0.add((int) (byte) 0, (-101));
        int int24 = testClass1_0.add(1, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(25, 25);
        int int21 = testClass1_0.add(0, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((-49), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-23), 100);
        int int15 = testClass1_0.add(0, (-32));
        int int18 = testClass1_0.add(0, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(4, 13);
        int int24 = testClass1_0.add((-16), (-51));
        int int27 = testClass1_0.add((int) (short) 10, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((-51), (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(7, (-16));
        int int21 = testClass1_0.add((int) '#', (-13));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((int) '#', 7);
        int int27 = testClass1_0.add(7, 102);
        int int30 = testClass1_0.add((-26), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add((int) (short) 10, 33);
        int int27 = testClass1_0.add((int) (short) 0, (-34));
        int int30 = testClass1_0.add((-2), (int) (short) 1);
        int int33 = testClass1_0.add((-101), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-100) + "'", int33 == (-100));
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add((-48), 34);
        int int21 = testClass1_0.add((-53), 22);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-12), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-6), (-19));
        int int18 = testClass1_0.add((-4), 21);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 10, 5);
        int int6 = testClass1_0.add((-6), (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, 9);
        int int21 = testClass1_0.add((-7), 35);
        int int24 = testClass1_0.add(21, 34);
        int int27 = testClass1_0.add(8, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((int) (byte) 100, 34);
        int int21 = testClass1_0.add(37, (-1));
        int int24 = testClass1_0.add((-15), (int) (byte) 1);
        int int27 = testClass1_0.add(19, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-36) + "'", int21 == (-36));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14) + "'", int24 == (-14));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((-11), (-2));
        int int24 = testClass1_0.add((int) (byte) 0, (-20));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(11, 27);
        int int27 = testClass1_0.add((int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-11), (-2));
        int int18 = testClass1_0.add((-6), (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add((int) '#', (int) (byte) -1);
        int int30 = testClass1_0.add((int) '4', (-96));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(51, (int) '#');
        int int27 = testClass1_0.add(102, 54);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(0, (-18));
        int int21 = testClass1_0.add(13, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(4, (-32));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add(49, (int) ' ');
        int int30 = testClass1_0.add((int) (short) -1, (-18));
        int int33 = testClass1_0.add((-21), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-6) + "'", int33 == (-6));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add((-3), 49);
        int int21 = testClass1_0.add(19, 19);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        int int24 = testClass1_0.add(13, 1);
        int int27 = testClass1_0.add(20, 102);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add(17, 97);
        int int15 = testClass1_0.add(0, (-14));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(34, (int) (short) 10);
        int int24 = testClass1_0.add(36, 98);
        int int27 = testClass1_0.add((-99), 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add((-3), (-1));
        int int15 = testClass1_0.add(2, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        int int27 = testClass1_0.add((-13), 102);
        int int30 = testClass1_0.add(0, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add((-23), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(97, 10);
        int int30 = testClass1_0.add(100, (-99));
        int int33 = testClass1_0.add(5, (-8));
        int int36 = testClass1_0.add((int) (short) 100, (-20));
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add(0, (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(20, 102);
        int int18 = testClass1_0.add((-36), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(18, 49);
        int int21 = testClass1_0.add((int) (short) 0, (-18));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-36), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(5, 53);
        int int21 = testClass1_0.add((-23), (-8));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
        int int21 = testClass1_0.add((int) '#', 34);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(21, (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(102, (int) (short) -1);
        int int27 = testClass1_0.add(3, 18);
        int int30 = testClass1_0.add((-8), 51);
        int int33 = testClass1_0.add((int) (short) -1, (-32));
        int int36 = testClass1_0.add(53, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-101) + "'", int24 == (-101));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-2), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-5), 54);
        int int24 = testClass1_0.add((-17), 37);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add((-3), (int) (byte) 1);
        int int30 = testClass1_0.add(99, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-48) + "'", int30 == (-48));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(11, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = testClass1_0.add((-53), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-7), 21);
        int int18 = testClass1_0.add(37, 13);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-19), 53);
        int int18 = testClass1_0.add((int) (byte) 10, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-11), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 35);
        int int21 = testClass1_0.add(50, (int) '#');
        int int24 = testClass1_0.add(55, (-49));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-3), (-99));
        int int18 = testClass1_0.add(101, (int) 'a');
        int int21 = testClass1_0.add(36, (-3));
        int int24 = testClass1_0.add(37, (-1));
        int int27 = testClass1_0.add((-5), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-36) + "'", int24 == (-36));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        int int18 = testClass1_0.add((-2), (-9));
        int int21 = testClass1_0.add(11, 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) 'a', (int) 'a');
        int int21 = testClass1_0.add((int) '4', 101);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(98, (-3));
        int int24 = testClass1_0.add(36, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-36), (int) 'a');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add((int) 'a', (-24));
        int int18 = testClass1_0.add(50, (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-5), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add((-4), (-25));
        int int27 = testClass1_0.add((-53), 19);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        int int9 = testClass1_0.add(15, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add((-8), (-10));
        int int12 = testClass1_0.add((-14), 5);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((-20), (int) (short) -1);
        int int27 = testClass1_0.add(26, (-19));
        int int30 = testClass1_0.add((-26), (-16));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add(34, 13);
        int int33 = testClass1_0.add(100, (-11));
        int int36 = testClass1_0.add((-7), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(22, (int) (short) 100);
        int int15 = testClass1_0.add(20, 50);
        int int18 = testClass1_0.add((-19), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        int int21 = testClass1_0.add(98, 18);
        int int24 = testClass1_0.add((-15), 34);
        int int27 = testClass1_0.add((-2), (-8));
        int int30 = testClass1_0.add(98, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-4) + "'", int30 == (-4));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add(11, 3);
        int int33 = testClass1_0.add(100, (-4));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-24) + "'", int33 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(53, 33);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int24 = testClass1_0.add(34, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add(100, (-3));
        int int18 = testClass1_0.add(20, 20);
        int int21 = testClass1_0.add((int) (short) -1, (-25));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) 1);
        int int27 = testClass1_0.add(98, (int) ' ');
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        int int12 = testClass1_0.add((int) '4', 54);
        int int15 = testClass1_0.add((int) ' ', (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(9, (int) (byte) 1);
        int int21 = testClass1_0.add((int) 'a', (-97));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-99), (int) 'a');
        int int24 = testClass1_0.add((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add((-32), (-10));
        int int30 = testClass1_0.add(98, (int) (short) -1);
        int int33 = testClass1_0.add(17, (-1));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-97) + "'", int30 == (-97));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-16) + "'", int33 == (-16));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add((-48), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(0, (-20));
        int int27 = testClass1_0.add((int) (byte) -1, (-18));
        int int30 = testClass1_0.add((-19), (-7));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add(12, (-23));
        int int15 = testClass1_0.add((-98), (-15));
        int int18 = testClass1_0.add(50, (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add(49, 100);
        int int15 = testClass1_0.add((-4), (-50));
        int int18 = testClass1_0.add((-96), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        int int24 = testClass1_0.add((int) 'a', (-6));
        int int27 = testClass1_0.add((-101), (int) (byte) -1);
        int int30 = testClass1_0.add((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15) + "'", int24 == (-15));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(0, (int) (byte) -1);
        int int9 = testClass1_0.add((-99), (int) ' ');
        int int12 = testClass1_0.add(27, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-2) + "'", int9 == (-2));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-8) + "'", int12 == (-8));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        int int24 = testClass1_0.add(97, 9);
        int int27 = testClass1_0.add((-25), 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((int) (short) 0, 21);
        int int15 = testClass1_0.add((int) '4', (-14));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add(51, (-16));
        int int18 = testClass1_0.add((-48), 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(34, 34);
        int int27 = testClass1_0.add((-96), (int) 'a');
        int int30 = testClass1_0.add((-24), 19);
        int int33 = testClass1_0.add((int) '4', (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add(37, (-9));
        int int30 = testClass1_0.add((-7), (-24));
        int int33 = testClass1_0.add(3, (int) (byte) 1);
        int int36 = testClass1_0.add((-15), 37);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) 'a', 8);
        int int21 = testClass1_0.add(6, 2);
        int int24 = testClass1_0.add((-101), (-11));
        int int27 = testClass1_0.add((-34), 51);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-51), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(3, (-25));
        int int24 = testClass1_0.add((-96), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(53, (-3));
        int int15 = testClass1_0.add(27, (-13));
        int int18 = testClass1_0.add(102, 6);
        int int21 = testClass1_0.add(53, (-36));
        int int24 = testClass1_0.add(0, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16) + "'", int12 == (-16));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((int) '#', 7);
        int int27 = testClass1_0.add(7, 102);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        int int27 = testClass1_0.add((-13), 102);
        int int30 = testClass1_0.add((-20), 1);
        int int33 = testClass1_0.add((-24), (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-19) + "'", int30 == (-19));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add(11, 10);
        int int24 = testClass1_0.add((-12), (-5));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add(49, (int) ' ');
        int int30 = testClass1_0.add(102, (int) (short) 10);
        int int33 = testClass1_0.add(53, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 11 + "'", int30 == 11);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-2) + "'", int33 == (-2));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-11), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-2), (-36));
        int int24 = testClass1_0.add(9, (-101));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-24));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add(14, 49);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        int int24 = testClass1_0.add((int) 'a', (-6));
        int int27 = testClass1_0.add(0, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15) + "'", int24 == (-15));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-97), 11);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-26), 14);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add(101, (-2));
        int int27 = testClass1_0.add((-4), (int) (byte) -1);
        int int30 = testClass1_0.add(51, 22);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add(21, (int) (byte) -1);
        int int24 = testClass1_0.add(14, 21);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((-24), 53);
        int int24 = testClass1_0.add((int) '4', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(33, (-4));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add(97, (-34));
        int int21 = testClass1_0.add((-36), 7);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(13, 101);
        int int24 = testClass1_0.add((-20), 18);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(36, (int) (short) 1);
        int int12 = testClass1_0.add((-50), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 37 + "'", int9 == 37);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add((-10), (int) '#');
        int int21 = testClass1_0.add((int) ' ', 49);
        int int24 = testClass1_0.add(10, 51);
        int int27 = testClass1_0.add(98, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add(0, 8);
        int int18 = testClass1_0.add(50, 37);
        int int21 = testClass1_0.add(34, 21);
        int int24 = testClass1_0.add((-48), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add((int) 'a', 98);
        int int21 = testClass1_0.add((int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add(11, 3);
        int int33 = testClass1_0.add((-11), (-96));
        int int36 = testClass1_0.add((-34), (int) (byte) 100);
        int int39 = testClass1_0.add(0, 53);
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        int int21 = testClass1_0.add(98, 18);
        int int24 = testClass1_0.add((-15), 34);
        int int27 = testClass1_0.add((-32), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        int int18 = testClass1_0.add((int) (short) 100, (int) '#');
        int int21 = testClass1_0.add(3, (-51));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(6, 27);
        int int30 = testClass1_0.add(8, 26);
        int int33 = testClass1_0.add((-13), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-12) + "'", int33 == (-12));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add(98, (-98));
        int int18 = testClass1_0.add((int) (short) -1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add((-20), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        int int15 = testClass1_0.add(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add((-4), (-19));
        int int30 = testClass1_0.add((-8), (int) (byte) 1);
        int int33 = testClass1_0.add((-33), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-7) + "'", int30 == (-7));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(0, 4);
        int int24 = testClass1_0.add(98, (-2));
        int int27 = testClass1_0.add(102, (-26));
        int int30 = testClass1_0.add(15, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-48) + "'", int24 == (-48));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((-20), (int) (short) -1);
        int int27 = testClass1_0.add(26, (-19));
        int int30 = testClass1_0.add((-19), (int) '4');
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-5), 34);
        int int21 = testClass1_0.add(97, (-11));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        int int21 = testClass1_0.add(101, 53);
        int int24 = testClass1_0.add((-19), 49);
        int int27 = testClass1_0.add((-14), (-6));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-5), 34);
        int int21 = testClass1_0.add((int) '4', 7);
        int int24 = testClass1_0.add(27, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((int) (byte) 1, (-24));
        int int24 = testClass1_0.add(14, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 2);
        int int18 = testClass1_0.add(20, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(1, 36);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-9), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-8) + "'", int27 == (-8));
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-18), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 19 + "'", int21 == 19);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add((int) 'a', (-101));
        int int27 = testClass1_0.add(22, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(13, 11);
        int int27 = testClass1_0.add((-36), (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        int int15 = testClass1_0.add((-12), (-16));
        int int18 = testClass1_0.add(53, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-52) + "'", int18 == (-52));
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add(97, (-16));
        int int30 = testClass1_0.add((-101), 53);
        int int33 = testClass1_0.add(0, (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add(0, (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((int) (byte) 0, 34);
        int int24 = testClass1_0.add((-12), (-20));
        int int27 = testClass1_0.add((-51), (-24));
        int int30 = testClass1_0.add(13, 33);
        int int33 = testClass1_0.add((-25), (-4));
        int int36 = testClass1_0.add(3, 35);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) -1, (-50));
        int int24 = testClass1_0.add(100, 102);
        int int27 = testClass1_0.add((-98), 4);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-23) + "'", int27 == (-23));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-10), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
        int int21 = testClass1_0.add((-23), (-31));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(11, (-13));
        int int27 = testClass1_0.add(12, (-31));
        int int30 = testClass1_0.add((int) (short) 10, 49);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 54);
        int int24 = testClass1_0.add((int) (short) 1, (-20));
        int int27 = testClass1_0.add((int) '4', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-20), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 53 + "'", int27 == 53);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add((-2), 34);
        int int18 = testClass1_0.add(97, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 0, (int) (short) 1);
        int int21 = testClass1_0.add((-9), (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        int int15 = testClass1_0.add((-25), 50);
        int int18 = testClass1_0.add(99, (-9));
        int int21 = testClass1_0.add((-50), (-19));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-10) + "'", int18 == (-10));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(0, 97);
        int int30 = testClass1_0.add(12, 11);
        int int33 = testClass1_0.add((int) (short) -1, 97);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 0, (int) (short) 1);
        int int21 = testClass1_0.add((-11), (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add(12, (-13));
        int int21 = testClass1_0.add((-18), (-26));
        int int24 = testClass1_0.add((-48), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(7, (-16));
        int int21 = testClass1_0.add(0, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 10, (-96));
        int int12 = testClass1_0.add(2, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(14, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-97), 11);
        int int24 = testClass1_0.add(35, (int) '4');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add(0, (int) 'a');
        int int30 = testClass1_0.add(11, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(55, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        int int24 = testClass1_0.add(97, 9);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(36, 1);
        int int27 = testClass1_0.add((-5), (int) (short) 1);
        int int30 = testClass1_0.add(7, 12);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add(9, 13);
        int int30 = testClass1_0.add(1, 13);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-99), (int) 'a');
        int int24 = testClass1_0.add((-2), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) (byte) 1, (-5));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(27, 54);
        int int27 = testClass1_0.add((-98), (-3));
        int int30 = testClass1_0.add((-17), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 33 + "'", int27 == 33);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((-97), (-13));
        int int9 = testClass1_0.add((-35), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-12), 33);
        int int27 = testClass1_0.add((-25), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, 9);
        int int21 = testClass1_0.add((-7), 35);
        int int24 = testClass1_0.add(54, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-53) + "'", int24 == (-53));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-15), 25);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        int int24 = testClass1_0.add(3, 100);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-97), 11);
        int int24 = testClass1_0.add(35, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-9), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(97, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-5) + "'", int9 == (-5));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add((-30), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(17, 5);
        int int9 = testClass1_0.add((-9), (-1));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(1, 5);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(1, (-3));
        int int24 = testClass1_0.add(98, (int) 'a');
        int int27 = testClass1_0.add(34, (-34));
        int int30 = testClass1_0.add((-24), (int) (short) 10);
        int int33 = testClass1_0.add(11, 9);
        int int36 = testClass1_0.add((-51), (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-50) + "'", int36 == (-50));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(25, (int) (short) -1);
        int int27 = testClass1_0.add(34, 51);
        int int30 = testClass1_0.add(34, 13);
        int int33 = testClass1_0.add(9, (-51));
        int int36 = testClass1_0.add((-11), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add(0, 54);
        int int15 = testClass1_0.add((-12), 13);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) -1);
        int int27 = testClass1_0.add((-32), (-10));
        int int30 = testClass1_0.add((int) (short) 1, (-26));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(9, (int) (byte) 1);
        int int21 = testClass1_0.add(8, 8);
        int int24 = testClass1_0.add((-53), 20);
        int int27 = testClass1_0.add(33, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add(5, (int) (short) 100);
        int int24 = testClass1_0.add((int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((-51), 5);
        int int18 = testClass1_0.add(12, (-51));
        int int21 = testClass1_0.add((-32), 53);
        int int24 = testClass1_0.add(6, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(12, (-97));
        int int27 = testClass1_0.add((-11), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(37, 5);
        int int27 = testClass1_0.add((-12), 22);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        int int24 = testClass1_0.add(53, 13);
        int int27 = testClass1_0.add(18, 49);
        int int30 = testClass1_0.add((-49), 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int24 = testClass1_0.add((-51), (-9));
        int int27 = testClass1_0.add(36, (-16));
        int int30 = testClass1_0.add((-1), 13);
        int int33 = testClass1_0.add((-97), (-13));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((-18), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(1, (-11));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add(37, 51);
        int int24 = testClass1_0.add((-13), (-7));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(3, (-32));
        int int27 = testClass1_0.add(2, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(49, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-95), 97);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(10, (int) (byte) 1);
        int int27 = testClass1_0.add((int) (byte) 100, 100);
        int int30 = testClass1_0.add(0, (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(7, (-16));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add((int) (byte) 100, (int) (short) -1);
        int int30 = testClass1_0.add((-15), (-99));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-99) + "'", int27 == (-99));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-23), 8);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(54, 102);
        int int21 = testClass1_0.add((-24), (-30));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 2);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add((int) 'a', (-101));
        int int27 = testClass1_0.add((-32), 14);
        int int30 = testClass1_0.add(12, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(55, (int) (short) 10);
        int int15 = testClass1_0.add((-1), (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        int int21 = testClass1_0.add((-49), (-16));
        int int24 = testClass1_0.add(6, 35);
        int int27 = testClass1_0.add(101, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-10), 9);
        int int18 = testClass1_0.add((-99), 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(10, (-23));
        int int18 = testClass1_0.add((-34), (-7));
        int int21 = testClass1_0.add((int) (short) 100, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-18), (int) (byte) -1);
        int int15 = testClass1_0.add(22, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((-97), (-13));
        int int9 = testClass1_0.add(0, 100);
        int int12 = testClass1_0.add(8, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add(5, 22);
        int int30 = testClass1_0.add((-2), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        int int21 = testClass1_0.add(0, (-36));
        int int24 = testClass1_0.add((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) '4', (-16));
        int int21 = testClass1_0.add((-48), (-18));
        int int24 = testClass1_0.add(7, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        int int21 = testClass1_0.add(98, 18);
        int int24 = testClass1_0.add((-15), 34);
        int int27 = testClass1_0.add((-2), (-8));
        int int30 = testClass1_0.add(36, 36);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((-3), 21);
        int int9 = testClass1_0.add(49, 53);
        int int12 = testClass1_0.add(4, 51);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        int int21 = testClass1_0.add((-53), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(51, (int) '#');
        int int27 = testClass1_0.add(102, 54);
        int int30 = testClass1_0.add((int) (byte) -1, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(36, (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}


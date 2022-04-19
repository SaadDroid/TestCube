import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(49, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-97) + "'", int30 == (-97));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-16) + "'", int33 == (-16));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((-19), 7);
        int int21 = testClass1_0.add(18, (-31));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add((int) (byte) 10, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        int int30 = testClass1_0.add(18, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 37 + "'", int24 == 37);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-8), (int) (short) 1);
        int int15 = testClass1_0.add((-3), (-23));
        int int18 = testClass1_0.add((-12), 54);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(2, 11);
        int int15 = testClass1_0.add(3, 20);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((-9), 53);
        int int30 = testClass1_0.add(54, (-96));
        int int33 = testClass1_0.add((int) '4', 22);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add(22, 14);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(18, (-6));
        int int18 = testClass1_0.add(0, 98);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((-97), 97);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-19), (-10));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(4, 27);
        int int21 = testClass1_0.add((-36), (int) ' ');
        int int24 = testClass1_0.add(25, 12);
        int int27 = testClass1_0.add((int) (short) 10, 97);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add((int) 'a', (-1));
        int int21 = testClass1_0.add(53, (-15));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-96) + "'", int18 == (-96));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(25, 25);
        int int21 = testClass1_0.add((-99), 10);
        int int24 = testClass1_0.add(17, 12);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(37, (-7));
        int int24 = testClass1_0.add(0, (-3));
        int int27 = testClass1_0.add(5, 54);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(102, 102);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add(18, (-20));
        int int24 = testClass1_0.add((int) ' ', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-99), (-24));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-7), 21);
        int int18 = testClass1_0.add(98, 27);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(18, 49);
        int int21 = testClass1_0.add((int) (short) 0, (-18));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(27, 19);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(4, 13);
        int int24 = testClass1_0.add(0, 21);
        int int27 = testClass1_0.add((-50), (-23));
        int int30 = testClass1_0.add(37, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-36) + "'", int30 == (-36));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        int int12 = testClass1_0.add(54, 34);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add((-48), (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add(54, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 55 + "'", int21 == 55);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add((int) 'a', (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add((-51), 98);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add((-13), (-51));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(5, (-15));
        int int24 = testClass1_0.add(22, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-97), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        int int12 = testClass1_0.add((-21), (int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
        int int27 = testClass1_0.add((-24), 53);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(34, (int) (short) 10);
        int int24 = testClass1_0.add(36, 98);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-31), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        int int30 = testClass1_0.add(5, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add((int) 'a', 7);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add((-96), 97);
        int int24 = testClass1_0.add((-11), (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) 1);
        int int27 = testClass1_0.add(33, (int) '4');
        int int30 = testClass1_0.add(102, (-34));
        int int33 = testClass1_0.add((-1), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add((int) 'a', (-1));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-96) + "'", int18 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        int int30 = testClass1_0.add((-23), (-25));
        int int33 = testClass1_0.add(53, 6);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(17, 11);
        int int18 = testClass1_0.add((-32), (-25));
        int int21 = testClass1_0.add((-7), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-8), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((-96), 17);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add((-3), (-3));
        int int27 = testClass1_0.add(53, (int) 'a');
        int int30 = testClass1_0.add((-12), 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(54, 102);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        int int9 = testClass1_0.add(20, (-49));
        int int12 = testClass1_0.add(8, 9);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add(27, (-12));
        int int15 = testClass1_0.add(13, 97);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        int int30 = testClass1_0.add(37, 4);
        int int33 = testClass1_0.add(33, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(26, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add((int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add((-48), (int) (byte) 10);
        int int27 = testClass1_0.add((-10), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add((int) ' ', (-13));
        int int21 = testClass1_0.add(22, 54);
        int int24 = testClass1_0.add((-19), 35);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(98, (-3));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-31) + "'", int21 == (-31));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        int int39 = testClass1_0.add((-15), 54);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        int int30 = testClass1_0.add((-31), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        int int30 = testClass1_0.add((int) (short) 100, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-13) + "'", int27 == (-13));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) (byte) 1, (-5));
        int int27 = testClass1_0.add((int) ' ', (-3));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-10), (-13));
        int int27 = testClass1_0.add((-34), 22);
        int int30 = testClass1_0.add(17, (int) '#');
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        int int12 = testClass1_0.add(37, (-31));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-19), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        int int30 = testClass1_0.add(98, (-53));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(18, (-4));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) '4', (int) ' ');
        int int18 = testClass1_0.add((-49), 102);
        int int21 = testClass1_0.add((-12), 25);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 0, (-50));
        int int15 = testClass1_0.add(53, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(100, 10);
        int int15 = testClass1_0.add((-96), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-23), 100);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(100, 21);
        int int9 = testClass1_0.add(5, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((int) (byte) 0, (int) (short) 100);
        int int18 = testClass1_0.add(7, 33);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        int int24 = testClass1_0.add(0, (-10));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add(19, (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(33, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add((-48), (int) (byte) 10);
        int int27 = testClass1_0.add((-14), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add((-24), (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add(26, (-9));
        int int24 = testClass1_0.add(0, (-32));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-4), (-1));
        int int30 = testClass1_0.add((int) (byte) 10, 17);
        int int33 = testClass1_0.add((-24), 17);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add(27, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 7);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add(53, 18);
        int int18 = testClass1_0.add(27, (-34));
        int int21 = testClass1_0.add((-101), 26);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-16), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add(100, (-3));
        int int18 = testClass1_0.add(20, 20);
        int int21 = testClass1_0.add((-96), (-49));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add(97, 11);
        int int21 = testClass1_0.add((-20), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19) + "'", int21 == (-19));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add(97, (-31));
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(14, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add(13, 51);
        int int27 = testClass1_0.add(49, (-3));
        int int30 = testClass1_0.add((-16), 7);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add((-99), (int) '4');
        int int24 = testClass1_0.add((-101), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13) + "'", int24 == (-13));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add(37, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-31), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add((-97), (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(97, 13);
        int int18 = testClass1_0.add(97, (-6));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15) + "'", int18 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add((-24), (-14));
        int int27 = testClass1_0.add((-21), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 22 + "'", int27 == 22);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        int int21 = testClass1_0.add((int) (short) -1, (-11));
        int int24 = testClass1_0.add((int) (byte) 1, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (-9));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add((-96), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 10);
        int int18 = testClass1_0.add((-2), (-8));
        int int21 = testClass1_0.add(18, (-16));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add((int) 'a', (-24));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((-4), 36);
        int int15 = testClass1_0.add((-99), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-23) + "'", int15 == (-23));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(27, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add(9, (int) (byte) 10);
        int int27 = testClass1_0.add((-51), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-97), 53);
        int int27 = testClass1_0.add((-4), (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        int int21 = testClass1_0.add((int) (short) -1, (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(6, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add(4, (-50));
        int int27 = testClass1_0.add((-2), 33);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(5, (-8));
        int int24 = testClass1_0.add(8, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15) + "'", int24 == (-15));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 102 + "'", int27 == 102);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) 'a', (-1));
        int int15 = testClass1_0.add(13, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-34));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-96) + "'", int12 == (-96));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((int) '#', 98);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add(98, (-2));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-48) + "'", int15 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((int) '4', (-10));
        int int18 = testClass1_0.add((-12), (-34));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        int int21 = testClass1_0.add((int) (short) 0, (-13));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) 'a', 8);
        int int21 = testClass1_0.add(3, 4);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        int int33 = testClass1_0.add((-99), (-11));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-19), (-10));
        int int24 = testClass1_0.add(100, (int) '#');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', (-7));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        int int33 = testClass1_0.add(51, 7);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(8, 100);
        int int24 = testClass1_0.add((int) (short) 0, (int) '4');
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add(7, 98);
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-10), (-13));
        int int27 = testClass1_0.add(35, 7);
        int int30 = testClass1_0.add(18, (-2));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-8) + "'", int30 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((-99), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-98) + "'", int24 == (-98));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add((-4), (-25));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) '4');
        int int21 = testClass1_0.add((-21), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add((-34), (int) (short) 10);
        int int27 = testClass1_0.add((-4), 2);
        int int30 = testClass1_0.add(100, (int) 'a');
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-50), 0);
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add(49, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        int int21 = testClass1_0.add(100, (-12));
        int int24 = testClass1_0.add(36, 97);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add(0, (-53));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add((-99), (int) '4');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(98, 6);
        int int12 = testClass1_0.add((-21), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        int int33 = testClass1_0.add(0, (-101));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((-1), 4);
        int int21 = testClass1_0.add((-25), (-10));
        int int24 = testClass1_0.add((-8), 4);
        int int27 = testClass1_0.add((-11), 51);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add(101, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add(3, 26);
        int int15 = testClass1_0.add((int) ' ', (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(10, (int) (byte) 1);
        int int27 = testClass1_0.add(0, 17);
        int int30 = testClass1_0.add((-21), 97);
        int int33 = testClass1_0.add((-8), (int) ' ');
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add(6, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add(7, (-13));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(37, 33);
        int int15 = testClass1_0.add((int) (short) -1, 5);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', (-7));
        int int27 = testClass1_0.add((-5), (-24));
        int int30 = testClass1_0.add((-31), (-13));
        int int33 = testClass1_0.add(0, (-18));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(49, 100);
        int int18 = testClass1_0.add((-99), (-51));
        int int21 = testClass1_0.add((-53), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        int int21 = testClass1_0.add(25, (-99));
        int int24 = testClass1_0.add((-4), (-9));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(54, 102);
        int int24 = testClass1_0.add((-99), (-5));
        int int27 = testClass1_0.add((-3), 101);
        int int30 = testClass1_0.add(2, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-51) + "'", int24 == (-51));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add((int) (short) 1, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-8), 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(5, (-15));
        int int24 = testClass1_0.add(22, 12);
        int int27 = testClass1_0.add((-10), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-9) + "'", int27 == (-9));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-25), 17);
        int int12 = testClass1_0.add((int) (short) 0, 27);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add(0, 2);
        int int27 = testClass1_0.add((int) '#', (-96));
        int int30 = testClass1_0.add((int) (byte) 0, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-2), (-101));
        int int12 = testClass1_0.add(17, (-34));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        int int36 = testClass1_0.add((-7), 36);
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
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(51, (-99));
        int int21 = testClass1_0.add((-4), (-18));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        int int15 = testClass1_0.add((-21), (int) (byte) 10);
        int int18 = testClass1_0.add((int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add((-24), (int) '#');
        int int30 = testClass1_0.add((int) (byte) 100, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34 + "'", int30 == 34);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add(51, (-20));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add((-21), (-19));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(10, (-23));
        int int18 = testClass1_0.add((-34), (-7));
        int int21 = testClass1_0.add(18, (-7));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(54, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(53, (-98));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        int int18 = testClass1_0.add(26, 50);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
            int int27 = testClass1_0.add((-5), (int) (byte) 0);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add((int) (short) -1, (-31));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add(21, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add(5, (int) '#');
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-12), (int) (byte) 100);
        int int27 = testClass1_0.add(0, 13);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(27, 19);
        int int21 = testClass1_0.add(6, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        int int21 = testClass1_0.add((-50), (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-49) + "'", int21 == (-49));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add(22, (-49));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-14), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add(12, (-34));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((-36), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-9), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-23), 18);
        int int24 = testClass1_0.add(27, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(5, 17);
        int int15 = testClass1_0.add((-5), 37);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add(13, 11);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add(33, (int) 'a');
        int int24 = testClass1_0.add(9, (int) (byte) 10);
        int int27 = testClass1_0.add(8, 26);
        int int30 = testClass1_0.add((int) (byte) -1, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((-16), 21);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add((-24), (-14));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-4), (-1));
        int int30 = testClass1_0.add((int) (byte) 10, 17);
        int int33 = testClass1_0.add(50, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-49) + "'", int33 == (-49));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add(51, 18);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(97, (int) '4');
        int int18 = testClass1_0.add((-99), 50);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 1, 9);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(20, (-25));
        int int18 = testClass1_0.add((-34), 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(100, 102);
        int int18 = testClass1_0.add(2, 1);
        int int21 = testClass1_0.add(34, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) -1, (-50));
        int int24 = testClass1_0.add(100, 102);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(0, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        int int36 = testClass1_0.add((-96), 9);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-9) + "'", int36 == (-9));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add(97, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-23) + "'", int18 == (-23));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 35);
        int int24 = testClass1_0.add((int) ' ', 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        int int33 = testClass1_0.add(0, 11);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((int) (short) 0, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((-24), 53);
        int int24 = testClass1_0.add((int) (short) 100, (-96));
        int int27 = testClass1_0.add((int) (byte) -1, 97);
        int int30 = testClass1_0.add((int) (byte) 100, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        int int39 = testClass1_0.add((int) (short) 10, 97);
        int int42 = testClass1_0.add((-21), (-16));
        int int45 = testClass1_0.add(17, 50);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add(25, 35);
        int int24 = testClass1_0.add(54, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-53) + "'", int24 == (-53));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add(101, 98);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(27, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add((-34), (int) (short) 10);
        int int27 = testClass1_0.add((-4), 2);
        int int30 = testClass1_0.add((-31), 4);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-6) + "'", int30 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(4, 27);
        int int21 = testClass1_0.add((-36), (int) ' ');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(100, 3);
        int int18 = testClass1_0.add((-24), 8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (short) 1, (int) (byte) 1);
        int int15 = testClass1_0.add(0, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        int int30 = testClass1_0.add(0, 11);
        int int33 = testClass1_0.add((int) ' ', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add(53, 18);
        int int18 = testClass1_0.add(27, (-34));
        int int21 = testClass1_0.add((-97), 53);
        int int24 = testClass1_0.add(7, (-36));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, 20);
        int int21 = testClass1_0.add(17, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        int int21 = testClass1_0.add((int) (short) 10, 101);
        int int24 = testClass1_0.add((-36), (int) '4');
        int int27 = testClass1_0.add((-96), 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-16), (-19));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((int) (short) 1, 101);
        int int15 = testClass1_0.add(12, 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(100, 102);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-11), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (short) 1, 36);
        int int24 = testClass1_0.add(35, (-6));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(20, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add(97, (-34));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        int int9 = testClass1_0.add(20, (-49));
        int int12 = testClass1_0.add((int) (byte) 1, (-21));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-7), 13);
        int int27 = testClass1_0.add((-51), 51);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add((-32), 15);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        int int42 = testClass1_0.add(5, 98);
        int int45 = testClass1_0.add(1, 100);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(34, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(11, (-16));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), 98);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-14), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(13, 101);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((-96), (int) (short) 10);
        int int21 = testClass1_0.add(26, (-48));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(54, 102);
        int int24 = testClass1_0.add((-99), (-5));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
        int int27 = testClass1_0.add((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-51) + "'", int27 == (-51));
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (short) 1, (int) (short) 1);
        int int15 = testClass1_0.add(0, (int) '#');
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-8), (int) (short) 1);
        int int15 = testClass1_0.add((-3), (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-12), 33);
        int int27 = testClass1_0.add(13, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-12), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(17, 11);
        int int18 = testClass1_0.add((-32), (-25));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add((-23), 11);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        int int33 = testClass1_0.add((-12), (-11));
        int int36 = testClass1_0.add((-99), 7);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-13) + "'", int36 == (-13));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add((-6), (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add(100, (-3));
        int int18 = testClass1_0.add(20, 20);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-20), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        int int30 = testClass1_0.add((int) (byte) -1, 20);
        int int33 = testClass1_0.add((-15), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(54, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-99) + "'", int27 == (-99));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((int) (short) 1, 101);
        int int15 = testClass1_0.add(12, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        int int30 = testClass1_0.add(22, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-21) + "'", int30 == (-21));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(13, 9);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add((-7), 27);
        int int24 = testClass1_0.add(7, 25);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(53, 36);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-2), (-101));
        int int12 = testClass1_0.add(33, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-32) + "'", int12 == (-32));
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((int) (byte) 10, (-99));
        int int24 = testClass1_0.add(12, 102);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        int int30 = testClass1_0.add((-32), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add((-24), (-14));
        int int27 = testClass1_0.add(0, (-24));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 10);
        int int18 = testClass1_0.add((-2), (-8));
        int int21 = testClass1_0.add(18, (-16));
        int int24 = testClass1_0.add(0, 35);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(102, (-14));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-96), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-6) + "'", int9 == (-6));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        int int21 = testClass1_0.add((-25), 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add(13, 51);
        int int27 = testClass1_0.add(49, (-3));
        int int30 = testClass1_0.add((-16), 7);
        int int33 = testClass1_0.add((-1), 102);
        int int36 = testClass1_0.add(25, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add(97, 36);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        int int33 = testClass1_0.add(51, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add((int) (short) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add((-34), (int) (short) 10);
        int int27 = testClass1_0.add(98, (int) 'a');
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        int int30 = testClass1_0.add(27, (-36));
        int int33 = testClass1_0.add((int) (byte) -1, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 100, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((-96), 5);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-18) + "'", int12 == (-18));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add(11, (-34));
        int int18 = testClass1_0.add((-7), 11);
        int int21 = testClass1_0.add((-11), (-53));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((int) (byte) 10, (-99));
        int int24 = testClass1_0.add(12, 102);
        int int27 = testClass1_0.add((-97), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(20, (-14));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-23), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-3), 25);
        int int24 = testClass1_0.add(49, 9);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(1, (-10));
        int int15 = testClass1_0.add(97, 27);
        int int18 = testClass1_0.add(1, (-23));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add((-21), (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-20) + "'", int18 == (-20));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-50), 50);
        int int24 = testClass1_0.add((int) '#', (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((-2), (-7));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add(0, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(3, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-2), (int) 'a');
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-12), 33);
        int int27 = testClass1_0.add(13, (int) '4');
        int int30 = testClass1_0.add((-10), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add(1, (-8));
        int int21 = testClass1_0.add((-10), 19);
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
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-23), 18);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add(14, 49);
        int int15 = testClass1_0.add((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        int int30 = testClass1_0.add((int) (short) 1, 101);
        int int33 = testClass1_0.add(35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(21, (-15));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(49, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-18), (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add((-19), 18);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add(20, (-51));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add((int) (byte) -1, 34);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add((int) (short) 0, 100);
        int int18 = testClass1_0.add(98, 50);
        int int21 = testClass1_0.add((-12), (-3));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((int) ' ', (int) '#');
        int int18 = testClass1_0.add(49, 49);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add(8, 8);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        int int24 = testClass1_0.add((int) (byte) 0, 1);
        int int27 = testClass1_0.add((-7), 25);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(102, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add(25, 35);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((int) (short) 10, (-101));
        int int21 = testClass1_0.add((int) (byte) 100, (-50));
        int int24 = testClass1_0.add((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add(25, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
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
        int int30 = testClass1_0.add(20, 100);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-49), (-11));
        int int21 = testClass1_0.add(19, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(5, 53);
        int int21 = testClass1_0.add(19, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(3, (-1));
        int int9 = testClass1_0.add((-50), 3);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-15) + "'", int9 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 10);
        int int18 = testClass1_0.add((-2), (-8));
        int int21 = testClass1_0.add(33, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(102, (int) ' ');
        int int27 = testClass1_0.add((-4), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add((int) (short) 1, (-31));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
        int int27 = testClass1_0.add((-24), 53);
        int int30 = testClass1_0.add((int) (byte) 100, 18);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((-15), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-8), (-101));
        int int27 = testClass1_0.add(13, (-14));
        int int30 = testClass1_0.add(10, 12);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        int int24 = testClass1_0.add((int) (short) 10, 6);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add((int) '#', (-7));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(34, 1);
        int int15 = testClass1_0.add(6, 3);
        int int18 = testClass1_0.add((int) (byte) 1, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(10, (int) (byte) 1);
        int int27 = testClass1_0.add(0, 17);
        int int30 = testClass1_0.add(34, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(34, 1);
        int int15 = testClass1_0.add(6, 3);
        int int18 = testClass1_0.add((-9), (-101));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(33, (-10));
        int int15 = testClass1_0.add((-1), 13);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add(6, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-32), 2);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        int int24 = testClass1_0.add((-24), 53);
        int int27 = testClass1_0.add((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) -1, 34);
        int int21 = testClass1_0.add((-14), (-9));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add((-14), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(27, (int) 'a');
        int int21 = testClass1_0.add((-24), (-19));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(19, 33);
        int int21 = testClass1_0.add((-101), 50);
        int int24 = testClass1_0.add((int) 'a', (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(3, (-1));
        int int9 = testClass1_0.add((-2), (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add(12, (-23));
        int int15 = testClass1_0.add((-51), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(51, (-99));
        int int21 = testClass1_0.add((-20), 34);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-51), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(102, (-6));
        int int24 = testClass1_0.add((-51), (-51));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(0, 98);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(22, (int) '#');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(13, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(0, (-7));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        int int24 = testClass1_0.add(0, (-10));
        int int27 = testClass1_0.add(55, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add((int) (byte) 1, 18);
        int int24 = testClass1_0.add((-31), (-8));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((-4), 11);
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
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (short) -1, 25);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        int int30 = testClass1_0.add((-34), (-98));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((-4), 36);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(33, (-10));
        int int15 = testClass1_0.add((-16), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(11, (-16));
        int int15 = testClass1_0.add((-18), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-17) + "'", int15 == (-17));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add((-97), (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
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
        int int33 = testClass1_0.add(7, 5);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        int int30 = testClass1_0.add((-23), 20);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(14, (-23));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((int) (byte) -1, 25);
        int int21 = testClass1_0.add(97, (-97));
        int int24 = testClass1_0.add((int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add(0, 2);
        int int27 = testClass1_0.add((int) '#', (-96));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(17, 11);
        int int18 = testClass1_0.add((-32), (-25));
        int int21 = testClass1_0.add((-7), 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((-96), 17);
        int int21 = testClass1_0.add((-20), (-97));
        int int24 = testClass1_0.add((int) ' ', 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(13, (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-23), 8);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-21), 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(36, 14);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        int int30 = testClass1_0.add((-4), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((-9), 53);
        int int30 = testClass1_0.add(54, (-96));
        int int33 = testClass1_0.add((-32), 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(4, 27);
        int int21 = testClass1_0.add((-36), (int) ' ');
        int int24 = testClass1_0.add(0, 37);
        int int27 = testClass1_0.add((int) (byte) 0, 4);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-20), (-11));
        int int27 = testClass1_0.add((int) (byte) -1, 25);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(98, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-10), 9);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
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
        int int30 = testClass1_0.add((int) (byte) 0, (-9));
        int int33 = testClass1_0.add(0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(4, (-34));
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((int) (byte) -1, 25);
        int int21 = testClass1_0.add(97, (-97));
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
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
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
        int int30 = testClass1_0.add((-36), (int) '#');
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((-3), 21);
        int int9 = testClass1_0.add((-7), (-21));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((int) '4', (-10));
        int int18 = testClass1_0.add((-25), 13);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add(0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((int) (byte) 10, (int) (short) -1);
        int int27 = testClass1_0.add(21, 10);
        int int30 = testClass1_0.add((-51), (-32));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add((int) 'a', (-1));
        int int21 = testClass1_0.add((-8), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-96) + "'", int18 == (-96));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((-8), (-32));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add((int) 'a', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(20, 102);
        int int18 = testClass1_0.add(98, (-50));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) (short) 10, 1);
        int int15 = testClass1_0.add((-16), (-12));
        int int18 = testClass1_0.add((int) (byte) 0, 21);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-12), (-2));
        int int15 = testClass1_0.add(97, 14);
        int int18 = testClass1_0.add((-34), (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
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
        int int30 = testClass1_0.add(50, 36);
        int int33 = testClass1_0.add(17, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        int int12 = testClass1_0.add(54, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-98), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((int) (byte) -1, (-24));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        int int30 = testClass1_0.add(27, (-36));
        int int33 = testClass1_0.add((int) (short) 0, 34);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((-1), 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(10, (int) (byte) 1);
        int int27 = testClass1_0.add(0, 17);
        int int30 = testClass1_0.add((-10), 26);
        int int33 = testClass1_0.add(51, 10);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add(9, (-49));
        int int24 = testClass1_0.add(35, 22);
        int int27 = testClass1_0.add((int) (short) 100, (-6));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
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
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(0, (-20));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add((-2), 101);
        int int18 = testClass1_0.add((int) (short) 0, 25);
        int int21 = testClass1_0.add((int) ' ', 7);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(18, 97);
        int int24 = testClass1_0.add((-48), (int) '#');
        int int27 = testClass1_0.add((-21), (-12));
        int int30 = testClass1_0.add(54, (int) ' ');
        int int33 = testClass1_0.add(34, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add(21, (-32));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-26), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (short) 0, 36);
        int int27 = testClass1_0.add(12, 5);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((-97), (-13));
        int int9 = testClass1_0.add(26, 9);
        int int12 = testClass1_0.add(9, (int) (byte) 100);
        int int15 = testClass1_0.add(21, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-2), (-36));
        int int24 = testClass1_0.add((-9), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(51, (-16));
        int int27 = testClass1_0.add(7, (-32));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        int int21 = testClass1_0.add(0, 4);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add(101, (-14));
        int int18 = testClass1_0.add(35, 11);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(100, 3);
        int int18 = testClass1_0.add((-24), 8);
        int int21 = testClass1_0.add((int) (short) 10, (-9));
        int int24 = testClass1_0.add(54, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((-18), (-1));
        int int18 = testClass1_0.add((-14), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-7), 21);
        int int18 = testClass1_0.add(37, 13);
        int int21 = testClass1_0.add((-9), (-15));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-3), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(10, (-97));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((int) (byte) 100, 34);
        int int21 = testClass1_0.add(37, (-1));
        int int24 = testClass1_0.add((-15), (int) (byte) 1);
        int int27 = testClass1_0.add((-50), 27);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-36) + "'", int21 == (-36));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14) + "'", int24 == (-14));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        int int12 = testClass1_0.add((int) 'a', 1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(34, 1);
        int int15 = testClass1_0.add((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(54, 102);
        int int24 = testClass1_0.add(26, (int) '#');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-8), (int) (short) 1);
        int int15 = testClass1_0.add((-3), (-23));
        int int18 = testClass1_0.add((-12), 54);
        int int21 = testClass1_0.add(25, (-96));
        int int24 = testClass1_0.add((int) (byte) -1, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(54, (int) ' ');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add(0, (-4));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add((-10), (int) '#');
        int int21 = testClass1_0.add((-51), 97);
        int int24 = testClass1_0.add(4, 12);
        int int27 = testClass1_0.add(102, (-96));
        int int30 = testClass1_0.add((-16), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add(2, (-8));
        int int18 = testClass1_0.add((-2), (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((-11), 36);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 0, (-12));
        int int24 = testClass1_0.add(53, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add((-96), (int) (byte) 10);
        int int18 = testClass1_0.add((-11), 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
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
        int int30 = testClass1_0.add(6, (-96));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(18, 97);
        int int24 = testClass1_0.add((-48), (int) '#');
        int int27 = testClass1_0.add((-21), (-12));
        int int30 = testClass1_0.add(54, (int) ' ');
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add((-3), (-1));
        int int15 = testClass1_0.add((int) (short) 100, (-19));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-99) + "'", int27 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((-49), 1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-12), (-2));
        int int15 = testClass1_0.add((int) ' ', (-1));
        int int18 = testClass1_0.add(4, 50);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-31) + "'", int15 == (-31));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(0, (int) (short) 100);
        int int15 = testClass1_0.add((-16), (-26));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add(22, (-101));
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
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add((-34), 50);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        int int21 = testClass1_0.add((-98), (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 99 + "'", int21 == 99);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add((int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-16), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-15), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(6, (-11));
        int int21 = testClass1_0.add((-3), 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(5, (-13));
        int int24 = testClass1_0.add(19, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-5) + "'", int24 == (-5));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add((-3), (-1));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(102, (int) ' ');
        int int27 = testClass1_0.add((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(21, 11);
        int int27 = testClass1_0.add((int) (byte) -1, 34);
        int int30 = testClass1_0.add(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add((int) (short) 1, 36);
        int int24 = testClass1_0.add((-21), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(37, 5);
        int int27 = testClass1_0.add(8, (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        int int30 = testClass1_0.add((-24), (int) (byte) -1);
        int int33 = testClass1_0.add((-14), 6);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-53) + "'", int24 == (-53));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((-97), (-13));
        int int9 = testClass1_0.add(26, 9);
        int int12 = testClass1_0.add(9, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add(14, 49);
        int int15 = testClass1_0.add((-5), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', (-7));
        int int27 = testClass1_0.add((-5), (-24));
        int int30 = testClass1_0.add((-31), (-13));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((-9), 53);
        int int30 = testClass1_0.add(35, 33);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add(19, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-18) + "'", int15 == (-18));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-36), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) (short) 10, 98);
        int int12 = testClass1_0.add((-96), 53);
        int int15 = testClass1_0.add(27, (-3));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(22, 13);
        int int21 = testClass1_0.add(0, 3);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(4, 34);
        int int21 = testClass1_0.add((-16), (-31));
        int int24 = testClass1_0.add(15, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(22, 13);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27 + "'", int27 == 27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) -1, 37);
        int int18 = testClass1_0.add(33, (-16));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-7), 17);
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
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add((-34), (int) (short) 10);
        int int27 = testClass1_0.add(98, (int) 'a');
        int int30 = testClass1_0.add((-53), (-14));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((int) ' ', (int) '#');
        int int18 = testClass1_0.add((-49), (-24));
        int int21 = testClass1_0.add(13, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(34, (-2));
        int int24 = testClass1_0.add((-7), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        int int30 = testClass1_0.add((int) '#', 12);
        int int33 = testClass1_0.add((-7), (-25));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(55, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-6) + "'", int12 == (-6));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add((-21), (int) (short) 1);
        int int21 = testClass1_0.add((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-20) + "'", int18 == (-20));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
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
        int int33 = testClass1_0.add(36, (int) (short) 1);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 37 + "'", int33 == 37);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((int) (byte) 1, (-24));
        int int24 = testClass1_0.add((int) (short) 0, 25);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((-11), 11);
        int int27 = testClass1_0.add((-26), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-3), (-99));
        int int18 = testClass1_0.add((-10), (-1));
        int int21 = testClass1_0.add((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add((-7), 3);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-99), (int) (byte) 10);
        int int18 = testClass1_0.add((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-99) + "'", int18 == (-99));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add((-50), 36);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((int) ' ', 8);
        int int24 = testClass1_0.add((-20), 20);
        int int27 = testClass1_0.add((-15), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(33, (-23));
        int int18 = testClass1_0.add(17, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        int int15 = testClass1_0.add((-51), 25);
        int int18 = testClass1_0.add((int) (short) 1, (-19));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add((int) 'a', 98);
        int int21 = testClass1_0.add((-36), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
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
        int int30 = testClass1_0.add((-19), (-97));
        int int33 = testClass1_0.add(101, (-11));
        int int36 = testClass1_0.add(21, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-101), (-15));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
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
        int int33 = testClass1_0.add(51, 7);
        int int36 = testClass1_0.add((-1), (-50));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(5, (-15));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        int int12 = testClass1_0.add((int) '4', 54);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        int int15 = testClass1_0.add((-51), 25);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-8), (-101));
        int int27 = testClass1_0.add(13, (-14));
        int int30 = testClass1_0.add((int) (byte) -1, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(98, 54);
        int int27 = testClass1_0.add((int) '4', (-12));
        int int30 = testClass1_0.add(51, 19);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 100, 35);
        int int18 = testClass1_0.add(26, 17);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
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
        int int30 = testClass1_0.add((int) (byte) -1, 20);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
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
        int int36 = testClass1_0.add((-99), (-21));
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        int int30 = testClass1_0.add((-21), (int) (byte) -1);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22 + "'", int30 == 22);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add(6, 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-4), (-1));
        int int30 = testClass1_0.add((int) (byte) 10, 17);
        int int33 = testClass1_0.add((-24), 17);
        int int36 = testClass1_0.add((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
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
        int int33 = testClass1_0.add((-21), 25);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        int int15 = testClass1_0.add((-21), (int) (byte) 10);
        int int18 = testClass1_0.add((-32), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add((-10), 20);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(25, 2);
        int int27 = testClass1_0.add((-6), (int) (short) 10);
        int int30 = testClass1_0.add(12, (-23));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add((-19), 8);
        int int18 = testClass1_0.add((int) (byte) 0, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add(0, 34);
        int int27 = testClass1_0.add((-50), (int) ' ');
        int int30 = testClass1_0.add((int) 'a', 4);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 25 + "'", int30 == 25);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(25, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(14, (int) (short) -1);
        int int24 = testClass1_0.add((int) '#', (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13) + "'", int21 == (-13));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(20, 21);
        int int24 = testClass1_0.add(18, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        int int30 = testClass1_0.add((-33), (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-96) + "'", int24 == (-96));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((int) '4', (-10));
        int int18 = testClass1_0.add((-25), 13);
        int int21 = testClass1_0.add((-8), 33);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
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
        int int30 = testClass1_0.add(36, 12);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add(11, (-34));
        int int18 = testClass1_0.add((-7), 11);
        int int21 = testClass1_0.add((-24), (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
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
        int int30 = testClass1_0.add(37, 4);
        int int33 = testClass1_0.add(33, 5);
        int int36 = testClass1_0.add((-16), (int) (byte) -1);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 17 + "'", int36 == 17);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        int int21 = testClass1_0.add((-49), (-16));
        int int24 = testClass1_0.add(6, 35);
        int int27 = testClass1_0.add((-9), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-23), 51);
        int int21 = testClass1_0.add(54, 102);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(34, 51);
        int int15 = testClass1_0.add(0, (-1));
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((-9), 53);
        int int30 = testClass1_0.add(54, (-96));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }
}


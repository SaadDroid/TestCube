import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add((-33), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(14, (-23));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        int int30 = testClass1_0.add(12, (-101));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int30 = testClass1_0.add((-23), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add((-21), (int) (short) 1);
        int int24 = testClass1_0.add(4, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(7, (-16));
        int int21 = testClass1_0.add(0, (int) ' ');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add(37, 51);
        int int24 = testClass1_0.add((-13), (-7));
        int int27 = testClass1_0.add(4, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        int int24 = testClass1_0.add(97, 9);
        int int27 = testClass1_0.add((-3), (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(0, 49);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-49), (-11));
        int int21 = testClass1_0.add((-11), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-53), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add(50, (int) '#');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        int int30 = testClass1_0.add((-7), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 8 + "'", int30 == 8);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, (int) (byte) 100);
        int int21 = testClass1_0.add(98, (-101));
        int int24 = testClass1_0.add((-99), 20);
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
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        int int18 = testClass1_0.add(6, 18);
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
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((-1), 4);
        int int21 = testClass1_0.add((-25), (-10));
        int int24 = testClass1_0.add((-8), 4);
        int int27 = testClass1_0.add(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(14, (-23));
        int int27 = testClass1_0.add((-9), 36);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(20, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(2, (-24));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(100, 102);
        int int18 = testClass1_0.add(2, 1);
        int int21 = testClass1_0.add(34, (-7));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(18, (-9));
        int int27 = testClass1_0.add(0, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add(33, (-8));
        int int24 = testClass1_0.add(51, 12);
        int int27 = testClass1_0.add((-16), 98);
        int int30 = testClass1_0.add(36, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 13 + "'", int30 == 13);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int6 = testClass1_0.add((-50), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(18, (int) '#');
        int int21 = testClass1_0.add((-31), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(26, (-8));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add((-8), (-10));
        int int12 = testClass1_0.add((-14), 5);
        int int15 = testClass1_0.add((-10), 25);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        int int33 = testClass1_0.add(21, (-52));
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
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        int int30 = testClass1_0.add((-6), (-13));
        int int33 = testClass1_0.add(1, 21);
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
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        int int30 = testClass1_0.add(54, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        int int27 = testClass1_0.add(3, 21);
        int int30 = testClass1_0.add(10, 10);
        int int33 = testClass1_0.add((-49), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(5, (-8));
        int int24 = testClass1_0.add(4, 22);
        int int27 = testClass1_0.add((-4), 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        int int33 = testClass1_0.add((int) '#', 21);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add((int) (short) 100, 37);
        int int12 = testClass1_0.add((-21), (int) (byte) -1);
        int int15 = testClass1_0.add(25, (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) (byte) 1, (-5));
        int int27 = testClass1_0.add(98, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((-101), (-48));
        int int18 = testClass1_0.add((-2), 37);
        int int21 = testClass1_0.add(14, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(10, (-10));
        int int27 = testClass1_0.add((-3), (-2));
        int int30 = testClass1_0.add(21, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add(11, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add((int) (short) 10, 33);
        int int27 = testClass1_0.add(27, 27);
        int int30 = testClass1_0.add(34, 54);
        int int33 = testClass1_0.add(7, (int) ' ');
        int int36 = testClass1_0.add(50, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-49) + "'", int36 == (-49));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(34, 51);
        int int15 = testClass1_0.add(0, (-1));
        int int18 = testClass1_0.add(49, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((int) '#', 7);
        int int27 = testClass1_0.add((int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add((-10), (int) '#');
        int int21 = testClass1_0.add((-51), 97);
        int int24 = testClass1_0.add(53, (-2));
        int int27 = testClass1_0.add(0, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-25) + "'", int24 == (-25));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int33 = testClass1_0.add(12, (-6));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-6), (-19));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-2), (-101));
        int int12 = testClass1_0.add((-2), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (short) 10, 33);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (-48));
        int int18 = testClass1_0.add((int) 'a', (-50));
        int int21 = testClass1_0.add((int) (short) 0, (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) 100, (int) '#');
        int int18 = testClass1_0.add((-23), 9);
        int int21 = testClass1_0.add((-97), (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add((-10), 20);
        int int21 = testClass1_0.add(5, (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(12, (-97));
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add(34, 36);
        int int24 = testClass1_0.add(36, (-24));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-10), 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add((-4), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add(12, (-9));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add((-21), (-51));
        int int21 = testClass1_0.add((int) (short) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(7, (int) (byte) 100);
        int int18 = testClass1_0.add((int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-11), (int) 'a');
        int int15 = testClass1_0.add((-9), 7);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-24));
        int int21 = testClass1_0.add(102, (-8));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add((int) (byte) 1, (-7));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(49, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-32), 2);
        int int18 = testClass1_0.add((-97), (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add((-50), (-7));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((-6), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add((-5), (-1));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(0, (int) (short) 100);
        int int15 = testClass1_0.add((-12), 18);
        int int18 = testClass1_0.add((-2), (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
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
        int int30 = testClass1_0.add((-24), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(51, (-53));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        int int27 = testClass1_0.add((-101), 25);
        int int30 = testClass1_0.add(49, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(4, 34);
        int int21 = testClass1_0.add((-16), (-31));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), 98);
        int int21 = testClass1_0.add((-4), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add((int) 'a', (-51));
        int int15 = testClass1_0.add((-6), (-11));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((-7), (int) (short) 10);
        int int21 = testClass1_0.add(2, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(11, (int) ' ');
        int int27 = testClass1_0.add(3, (-1));
        int int30 = testClass1_0.add((-30), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add((-53), (-14));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add(4, (-50));
        int int27 = testClass1_0.add(36, (-15));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-97), (int) (short) 1);
        int int18 = testClass1_0.add((-31), (-31));
        int int21 = testClass1_0.add((-21), 11);
        int int24 = testClass1_0.add((int) (byte) 1, 6);
        int int27 = testClass1_0.add(25, (-16));
        int int30 = testClass1_0.add((-97), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(101, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
        int int39 = testClass1_0.add((int) (byte) 100, 34);
        int int42 = testClass1_0.add((-17), (-14));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((-3), (-99));
        int int24 = testClass1_0.add(1, (-5));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add(51, 17);
        int int18 = testClass1_0.add((-17), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(0, 49);
        int int24 = testClass1_0.add((-36), 20);
        int int27 = testClass1_0.add(7, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add((-1), (-20));
        int int30 = testClass1_0.add((-12), 13);
        int int33 = testClass1_0.add((int) (byte) 10, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((-51), 5);
        int int18 = testClass1_0.add(12, (-51));
        int int21 = testClass1_0.add((-32), 53);
        int int24 = testClass1_0.add((-34), 102);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        int int33 = testClass1_0.add(53, (-5));
        int int36 = testClass1_0.add((-14), 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33 == (-9));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((int) (byte) 1, (-24));
        int int24 = testClass1_0.add((-4), (-3));
        int int27 = testClass1_0.add((-5), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        int int24 = testClass1_0.add((-24), (-10));
        int int27 = testClass1_0.add((int) (byte) -1, 35);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add((int) '#', (-7));
        int int27 = testClass1_0.add(8, (-101));
        int int30 = testClass1_0.add((-21), 5);
        int int33 = testClass1_0.add((-48), (-15));
        int int36 = testClass1_0.add(53, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        int int30 = testClass1_0.add((-50), (-32));
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((-49), (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(13, 9);
        int int18 = testClass1_0.add((-18), (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(50, 35);
        int int27 = testClass1_0.add(35, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-23), 18);
        int int24 = testClass1_0.add(0, (-6));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 0, (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add(21, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(55, (int) 'a');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(49, 100);
        int int18 = testClass1_0.add((-99), (-51));
        int int21 = testClass1_0.add((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add(1, (-14));
        int int15 = testClass1_0.add((-36), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
        int int30 = testClass1_0.add(25, (-50));
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-53), 100);
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        int int24 = testClass1_0.add((-24), (-10));
        int int27 = testClass1_0.add(20, (-96));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', (-7));
        int int27 = testClass1_0.add(101, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-2), (-36));
        int int24 = testClass1_0.add(9, (-101));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-8), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
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
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(7, (int) (byte) 100);
        int int18 = testClass1_0.add(34, (-97));
        int int21 = testClass1_0.add((-32), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(25, (int) (byte) 10);
        int int21 = testClass1_0.add((-10), 17);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        int int30 = testClass1_0.add(0, 37);
        int int33 = testClass1_0.add((-17), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add(27, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 7);
        int int24 = testClass1_0.add((-4), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add(101, (-31));
        int int24 = testClass1_0.add(9, (int) '#');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add((-11), 12);
        int int21 = testClass1_0.add(99, (-101));
        int int24 = testClass1_0.add((-21), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-20) + "'", int24 == (-20));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, (int) (byte) 100);
        int int21 = testClass1_0.add(98, (-101));
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
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((-24), (-53));
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        int int24 = testClass1_0.add((-23), (int) 'a');
        int int27 = testClass1_0.add(26, (-2));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-12) + "'", int27 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add(35, 27);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((-96), (int) (short) 10);
        int int21 = testClass1_0.add(26, (-48));
        int int24 = testClass1_0.add((-23), (-6));
        int int27 = testClass1_0.add((-2), (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add(101, (int) (byte) 100);
        int int18 = testClass1_0.add((int) (short) -1, 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add((-18), (-6));
        int int12 = testClass1_0.add((-34), 17);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
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
        int int36 = testClass1_0.add((-7), (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-6) + "'", int36 == (-6));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(0, (-25));
        int int24 = testClass1_0.add((int) (byte) 10, 8);
        int int27 = testClass1_0.add(0, 18);
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
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-19), (-10));
        int int24 = testClass1_0.add(101, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add((int) (short) 1, 36);
        int int24 = testClass1_0.add((-49), (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-8), 35);
        int int18 = testClass1_0.add((int) '4', (-20));
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        int int15 = testClass1_0.add((-7), (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
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
            int int24 = testClass1_0.add(33, (int) (byte) 0);
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
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add(17, (int) (byte) -1);
        int int18 = testClass1_0.add((-31), 27);
        int int21 = testClass1_0.add((-1), (int) '4');
        int int24 = testClass1_0.add(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16) + "'", int15 == (-16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        int int18 = testClass1_0.add(18, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add((-4), (-25));
        int int27 = testClass1_0.add((-36), 36);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-14), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-9), (-6));
        int int15 = testClass1_0.add((-8), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((int) (short) -1, (-97));
        int int15 = testClass1_0.add((-95), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add((-101), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add((-10), (int) '#');
        int int21 = testClass1_0.add((-51), 97);
        int int24 = testClass1_0.add(53, (-2));
        int int27 = testClass1_0.add(0, 7);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-25) + "'", int24 == (-25));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        int int21 = testClass1_0.add((int) (short) -1, (-11));
        int int24 = testClass1_0.add((-8), 49);
        int int27 = testClass1_0.add(2, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add(1, (-14));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        int int30 = testClass1_0.add((-26), 20);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        int int21 = testClass1_0.add((-101), 9);
        int int24 = testClass1_0.add((-8), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 1, (-6));
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add((int) (byte) 1, 18);
        int int24 = testClass1_0.add((-17), (-25));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((int) (byte) 0, 34);
        int int24 = testClass1_0.add((-12), (-20));
        int int27 = testClass1_0.add((-24), (-34));
        int int30 = testClass1_0.add(102, (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-97), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        int int24 = testClass1_0.add((int) 'a', (-6));
        int int27 = testClass1_0.add((-17), (-101));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15) + "'", int24 == (-15));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        int int21 = testClass1_0.add((int) (short) 10, (-24));
        int int24 = testClass1_0.add((-35), (-13));
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
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((-11), 6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(36, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        int int33 = testClass1_0.add((-6), (-51));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(1, 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(35, (-8));
        int int27 = testClass1_0.add((int) (short) 0, 18);
        int int30 = testClass1_0.add(37, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-36) + "'", int30 == (-36));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(10, (-23));
        int int18 = testClass1_0.add((-34), (-7));
        int int21 = testClass1_0.add((-7), (int) (short) -1);
        int int24 = testClass1_0.add((-14), (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add(11, (-34));
        int int18 = testClass1_0.add((-7), 11);
        int int21 = testClass1_0.add((-31), 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-18), (int) (byte) -1);
        int int15 = testClass1_0.add(22, (int) (short) 100);
        int int18 = testClass1_0.add(9, (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((-26), 3);
        int int24 = testClass1_0.add((-26), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        int int30 = testClass1_0.add(51, (-26));
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
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add((-1), (int) (byte) 10);
        int int24 = testClass1_0.add(7, 35);
        int int27 = testClass1_0.add((-15), (-34));
        int int30 = testClass1_0.add(101, (-8));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-11) + "'", int30 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((-24), 5);
        int int27 = testClass1_0.add((-14), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        int int24 = testClass1_0.add((-5), (-23));
        int int27 = testClass1_0.add((-50), (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (short) 1);
        int int21 = testClass1_0.add(2, 22);
        int int24 = testClass1_0.add((-49), (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 101 + "'", int18 == 101);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
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
        int int36 = testClass1_0.add(0, 102);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(100, 3);
        int int18 = testClass1_0.add((-24), 8);
        int int21 = testClass1_0.add((int) (short) 10, (-9));
        int int24 = testClass1_0.add((-49), (-24));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add(0, 54);
        int int15 = testClass1_0.add((-12), 13);
        int int18 = testClass1_0.add((-9), 14);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(4, (-32));
        int int21 = testClass1_0.add(9, 5);
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
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int33 = testClass1_0.add((-53), 3);
        int int36 = testClass1_0.add((-19), 22);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-16) + "'", int33 == (-16));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((-26), 3);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        int int33 = testClass1_0.add(22, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add((-19), 18);
        int int24 = testClass1_0.add((int) 'a', 51);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(4, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(15, (-51));
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
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add(34, (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
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
        int int30 = testClass1_0.add(50, 17);
        int int33 = testClass1_0.add((int) (byte) 100, 4);
        int int36 = testClass1_0.add(55, (-15));
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 26 + "'", int33 == 26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(4, 8);
        int int18 = testClass1_0.add((int) '4', (-97));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-32), (-23));
        int int18 = testClass1_0.add(99, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-48) + "'", int18 == (-48));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add((-19), 8);
        int int18 = testClass1_0.add(1, (-97));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add(13, (-11));
        int int24 = testClass1_0.add((int) (short) 10, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add(19, (int) (byte) -1);
        int int18 = testClass1_0.add((-24), (-31));
        int int21 = testClass1_0.add(10, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-18) + "'", int15 == (-18));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        int int18 = testClass1_0.add(26, 50);
        int int21 = testClass1_0.add(53, (-51));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add((-19), 18);
        int int24 = testClass1_0.add((int) 'a', 51);
        int int27 = testClass1_0.add((int) (short) 1, (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(8, (-12));
        int int15 = testClass1_0.add(0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-97), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((-3), (-99));
        int int24 = testClass1_0.add(1, (-5));
        int int27 = testClass1_0.add((-24), (-10));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        int int21 = testClass1_0.add((-49), (-16));
        int int24 = testClass1_0.add(6, 35);
        int int27 = testClass1_0.add((-9), 99);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((int) (short) 0, 9);
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
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        int int36 = testClass1_0.add(3, (-3));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        int int36 = testClass1_0.add((int) (byte) 1, 97);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        int int33 = testClass1_0.add(18, (-24));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(53, 2);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27 + "'", int15 == 27);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-23), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add(0, 4);
        int int30 = testClass1_0.add((-13), (-51));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-32), 2);
        int int18 = testClass1_0.add((-97), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-15) + "'", int15 == (-15));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-6), (-19));
        int int18 = testClass1_0.add(98, 22);
        int int21 = testClass1_0.add(10, 51);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add((int) (short) 1, (-31));
        int int27 = testClass1_0.add(25, (-2));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11) + "'", int27 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add((int) (short) 1, (-31));
        int int27 = testClass1_0.add((int) (byte) 10, (int) (short) 10);
        int int30 = testClass1_0.add(34, (-13));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add((int) 'a', (-1));
        int int21 = testClass1_0.add((-96), 19);
        int int24 = testClass1_0.add(6, 97);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-96) + "'", int18 == (-96));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = testClass1_0.add(26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((-97), 11);
        int int24 = testClass1_0.add(15, (-21));
        int int27 = testClass1_0.add((-21), (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        int int30 = testClass1_0.add(10, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-36), (int) 'a');
        int int27 = testClass1_0.add(98, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
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
        int int30 = testClass1_0.add(51, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-26) + "'", int24 == (-26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-50) + "'", int30 == (-50));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(0, 4);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-11), (int) 'a');
        int int15 = testClass1_0.add(4, 18);
        int int18 = testClass1_0.add(15, (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add(17, 97);
        int int15 = testClass1_0.add(0, (-14));
        int int18 = testClass1_0.add((-30), 54);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-101), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add((int) (short) 1, (-31));
        int int27 = testClass1_0.add((int) (byte) 10, (int) (short) 10);
        int int30 = testClass1_0.add((-3), (-15));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-12), 35);
        int int18 = testClass1_0.add((int) (byte) 100, (-17));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-23), 18);
        int int24 = testClass1_0.add(0, (-6));
        int int27 = testClass1_0.add(36, (-96));
        int int30 = testClass1_0.add(5, (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add(11, 10);
        int int24 = testClass1_0.add((-12), (-5));
        int int27 = testClass1_0.add((int) '#', (int) 'a');
        int int30 = testClass1_0.add((-7), (-19));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-36), (int) 'a');
        int int27 = testClass1_0.add((int) '4', (-36));
        int int30 = testClass1_0.add(27, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        int int21 = testClass1_0.add(49, (int) (byte) 1);
        int int24 = testClass1_0.add((-34), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 50 + "'", int21 == 50);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-33) + "'", int24 == (-33));
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(36, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(3, (-25));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(102, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add(51, 17);
        int int18 = testClass1_0.add(49, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(0, (int) (short) 100);
        int int15 = testClass1_0.add((-11), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(18, (-4));
        int int27 = testClass1_0.add(12, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add((-48), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(3, (-99));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((-14), 51);
        int int30 = testClass1_0.add(0, (-11));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add((int) (byte) 100, (-51));
        int int24 = testClass1_0.add(53, 14);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        int int18 = testClass1_0.add(13, (int) (byte) -1);
        int int21 = testClass1_0.add(0, (int) ' ');
        int int24 = testClass1_0.add((int) (byte) -1, 17);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-12) + "'", int18 == (-12));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(3, (-99));
        int int27 = testClass1_0.add(49, (-11));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) -1, 34);
        int int21 = testClass1_0.add((-30), (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        int int30 = testClass1_0.add((int) ' ', 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-97), (int) (short) 1);
        int int18 = testClass1_0.add((-31), (-31));
        int int21 = testClass1_0.add(12, (-96));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((int) (byte) 0, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(18, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-20), (-51));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((-13), 53);
        int int21 = testClass1_0.add(0, 4);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
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
        int int33 = testClass1_0.add(37, (-9));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        int int21 = testClass1_0.add(55, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add(33, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
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
        int int30 = testClass1_0.add(2, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add(101, (-14));
        int int18 = testClass1_0.add((-98), (-14));
        int int21 = testClass1_0.add((-17), (-20));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(33, 101);
        int int24 = testClass1_0.add(51, (-97));
        int int27 = testClass1_0.add((int) 'a', (-97));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(18, 49);
        int int21 = testClass1_0.add((int) (short) 0, (-18));
        int int24 = testClass1_0.add(19, (-96));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(36, (int) 'a');
        int int24 = testClass1_0.add((-10), 49);
        int int27 = testClass1_0.add((-19), (-3));
        int int30 = testClass1_0.add((-99), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        int int30 = testClass1_0.add(50, (-5));
        int int33 = testClass1_0.add((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-6), (-19));
        int int18 = testClass1_0.add(11, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
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
        int int30 = testClass1_0.add((-12), (-52));
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(8, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(4, (-32));
        int int21 = testClass1_0.add(9, 5);
        int int24 = testClass1_0.add(10, (-16));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add((-6), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
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
        int int30 = testClass1_0.add(3, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add(0, (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
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
        int int30 = testClass1_0.add((int) (short) 0, 37);
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
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-2), (-1));
        int int21 = testClass1_0.add((-4), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-97), 53);
        int int27 = testClass1_0.add(20, (-32));
        int int30 = testClass1_0.add(4, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((int) '4', 53);
        int int12 = testClass1_0.add((-13), (int) ' ');
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add(22, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((-98), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
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
        int int30 = testClass1_0.add((-48), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        int int30 = testClass1_0.add(0, (-4));
        int int33 = testClass1_0.add((-34), (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-2), (int) 'a');
        int int15 = testClass1_0.add((int) (byte) 1, (-31));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((-49), 1);
        int int15 = testClass1_0.add(27, 7);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-101), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((-7), (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add(37, 51);
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
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((int) (byte) 100, 101);
        int int27 = testClass1_0.add((-21), (-53));
        int int30 = testClass1_0.add(10, (int) '4');
        int int33 = testClass1_0.add(25, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        int int30 = testClass1_0.add((-31), (int) '#');
        int int33 = testClass1_0.add((-52), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 7 + "'", int33 == 7);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add(0, (-53));
        int int21 = testClass1_0.add(1, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
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
        int int30 = testClass1_0.add((int) '#', (-97));
        int int33 = testClass1_0.add(13, (-96));
        int int36 = testClass1_0.add((-96), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(27, 19);
        int int21 = testClass1_0.add((-32), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((int) (byte) 0, (int) (short) 100);
        int int18 = testClass1_0.add(53, 25);
        int int21 = testClass1_0.add((int) 'a', (-33));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(10, (-10));
        int int27 = testClass1_0.add((-3), (-2));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
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
        int int33 = testClass1_0.add((-19), (int) '4');
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(4, 8);
        int int18 = testClass1_0.add(20, (-25));
        int int21 = testClass1_0.add(11, (-9));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-99), (int) (byte) 10);
        int int18 = testClass1_0.add((-48), 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
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
        int int30 = testClass1_0.add(34, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-33) + "'", int30 == (-33));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-51), 3);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-16) + "'", int18 == (-16));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(4, 8);
        int int18 = testClass1_0.add(20, (-25));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-1), (-20));
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
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(5, (-15));
        int int24 = testClass1_0.add(22, 12);
        int int27 = testClass1_0.add((int) (short) 1, 26);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add(12, (-13));
        int int21 = testClass1_0.add(49, (-2));
        int int24 = testClass1_0.add(20, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-23) + "'", int21 == (-23));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add(101, (-31));
        int int24 = testClass1_0.add(9, (int) '#');
        int int27 = testClass1_0.add((-17), 100);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-5), 54);
        int int24 = testClass1_0.add((-17), 37);
        int int27 = testClass1_0.add(0, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(0, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
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
        int int30 = testClass1_0.add((-34), 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-50), 98);
        int int6 = testClass1_0.add((-2), (-101));
        int int9 = testClass1_0.add(9, 10);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add((int) (short) 0, 100);
        int int18 = testClass1_0.add(27, 12);
        int int21 = testClass1_0.add(37, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(21, (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
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
            int int27 = testClass1_0.add((-5), 0);
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(1, (-15));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(34, 1);
        int int15 = testClass1_0.add(21, (int) '#');
        int int18 = testClass1_0.add((-2), 11);
        int int21 = testClass1_0.add(20, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-97), (int) (short) 1);
        int int18 = testClass1_0.add((-31), (-31));
        int int21 = testClass1_0.add(5, (-26));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        int int21 = testClass1_0.add(102, (-24));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-50), (-24));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(55, (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-1), (int) (byte) 1);
        int int24 = testClass1_0.add((-23), 8);
        int int27 = testClass1_0.add((-97), (-32));
        int int30 = testClass1_0.add(55, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add((int) (byte) 1, 18);
        int int24 = testClass1_0.add((-17), (-25));
        int int27 = testClass1_0.add(10, (int) (byte) 1);
        int int30 = testClass1_0.add((-3), 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
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
        int int33 = testClass1_0.add(25, 34);
        int int36 = testClass1_0.add((-100), 36);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        int int30 = testClass1_0.add((-26), 20);
        int int33 = testClass1_0.add(35, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
        int int21 = testClass1_0.add((-101), (-11));
        int int24 = testClass1_0.add((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-30), (-95));
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
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add(0, (int) '#');
        int int24 = testClass1_0.add(34, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
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
        int int33 = testClass1_0.add((-26), (-6));
        int int36 = testClass1_0.add((-14), 49);
        int int39 = testClass1_0.add((-50), (-8));
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 7 + "'", int39 == 7);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-51), (int) (short) 100);
        int int24 = testClass1_0.add(0, 35);
        int int27 = testClass1_0.add((-51), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add(51, 17);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((int) (short) -1, (-97));
        int int15 = testClass1_0.add((-20), (-9));
        int int18 = testClass1_0.add(49, 37);
        int int21 = testClass1_0.add(50, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
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
        int int30 = testClass1_0.add((-20), (-10));
        int int33 = testClass1_0.add(17, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        int int21 = testClass1_0.add((int) (short) 1, (int) (byte) 10);
        int int24 = testClass1_0.add(20, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(0, (-25));
        int int24 = testClass1_0.add((int) (byte) 10, 8);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add(101, (-7));
        int int27 = testClass1_0.add((-15), (-51));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-13) + "'", int24 == (-13));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(33, (-10));
        int int15 = testClass1_0.add((int) 'a', 34);
        int int18 = testClass1_0.add((-18), (-97));
        int int21 = testClass1_0.add(13, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-12) + "'", int21 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add((-21), (-51));
        int int21 = testClass1_0.add((int) (short) 1, 97);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(50, (-5));
        int int18 = testClass1_0.add((int) (short) 10, 8);
        int int21 = testClass1_0.add(15, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add((-12), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add((int) (byte) 0, 5);
        int int24 = testClass1_0.add(0, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(35, (-8));
        int int27 = testClass1_0.add(2, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-5), 12);
        int int15 = testClass1_0.add(13, (-101));
        int int18 = testClass1_0.add((-53), (-4));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(10, (-97));
        int int15 = testClass1_0.add((int) (short) 1, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        int int24 = testClass1_0.add(13, 98);
        int int27 = testClass1_0.add((-6), 53);
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
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(5, 17);
        int int15 = testClass1_0.add(15, (int) (short) 10);
        int int18 = testClass1_0.add(4, 10);
        int int21 = testClass1_0.add((-53), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add((int) (byte) 1, 18);
        int int24 = testClass1_0.add((-31), (-8));
        int int27 = testClass1_0.add(11, 55);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-12), (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(21, (int) (short) 0);
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
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
        int int36 = testClass1_0.add((-17), (-31));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((int) (short) 10, (-101));
        int int21 = testClass1_0.add((int) (byte) 100, (-50));
        int int24 = testClass1_0.add((-26), 8);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((-25), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(55, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        int int18 = testClass1_0.add((-95), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        int int30 = testClass1_0.add((-11), (-23));
        int int33 = testClass1_0.add((-7), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add((-1), (-20));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(99, (-24));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(18, (-6));
        int int18 = testClass1_0.add((-26), 101);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        int int30 = testClass1_0.add(36, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        int int15 = testClass1_0.add((-12), (-16));
        int int18 = testClass1_0.add((-49), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 35);
        int int24 = testClass1_0.add((int) (byte) 0, (int) '4');
        int int27 = testClass1_0.add((int) 'a', (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, (-7));
        int int21 = testClass1_0.add(0, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-24), 101);
        int int24 = testClass1_0.add((-49), 98);
        int int27 = testClass1_0.add((-25), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 0, (-12));
        int int24 = testClass1_0.add(27, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-26) + "'", int24 == (-26));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add((-32), 7);
        int int15 = testClass1_0.add(11, (int) (short) 10);
        int int18 = testClass1_0.add(102, 15);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        int int36 = testClass1_0.add(17, 9);
        int int39 = testClass1_0.add((-8), 51);
        int int42 = testClass1_0.add((-6), (-51));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((int) (byte) 10, 11);
        int int24 = testClass1_0.add(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(14, (int) (short) -1);
        int int24 = testClass1_0.add(54, 19);
        int int27 = testClass1_0.add(26, (-26));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13) + "'", int21 == (-13));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add(0, (-13));
        int int21 = testClass1_0.add(0, (-36));
        int int24 = testClass1_0.add((-99), (-11));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-34), (-34));
        int int15 = testClass1_0.add((int) ' ', (int) (short) 100);
        int int18 = testClass1_0.add((-101), (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add((int) '#', (-7));
        int int27 = testClass1_0.add(8, (-101));
        int int30 = testClass1_0.add((-21), 5);
        int int33 = testClass1_0.add(19, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20 + "'", int33 == 20);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-101), (-6));
        int int24 = testClass1_0.add((-17), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add(15, (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(37, 33);
        int int15 = testClass1_0.add((-52), (-34));
        int int18 = testClass1_0.add((-101), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 54);
        int int24 = testClass1_0.add((int) (short) 1, (-20));
        int int27 = testClass1_0.add((-100), (-10));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(10, (-97));
        int int15 = testClass1_0.add(21, (-32));
        int int18 = testClass1_0.add(0, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(13, (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((-3), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        int int18 = testClass1_0.add(13, (int) (byte) -1);
        int int21 = testClass1_0.add((-101), (-18));
        int int24 = testClass1_0.add(50, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-12) + "'", int18 == (-12));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 0, (-12));
        int int24 = testClass1_0.add(27, (int) (byte) -1);
        int int27 = testClass1_0.add(0, (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-26) + "'", int24 == (-26));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int30 = testClass1_0.add(21, (-13));
        int int33 = testClass1_0.add((-6), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add((int) (short) 10, (-4));
        int int24 = testClass1_0.add(100, (-21));
        int int27 = testClass1_0.add((-17), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
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
        int int30 = testClass1_0.add(36, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        int int21 = testClass1_0.add((-11), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
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
        int int30 = testClass1_0.add(21, (-13));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((-19), 53);
        int int18 = testClass1_0.add((-18), (-25));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(49, (-33));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(0, (int) (short) 100);
        int int15 = testClass1_0.add(101, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-6) + "'", int15 == (-6));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int24 = testClass1_0.add(18, (-19));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
        int int33 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int36 = testClass1_0.add(20, (-18));
        int int39 = testClass1_0.add((-24), 20);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add(0, (-13));
        int int21 = testClass1_0.add(0, (-36));
        int int24 = testClass1_0.add((-99), (-11));
        int int27 = testClass1_0.add((-16), (int) (byte) 1);
        int int30 = testClass1_0.add(9, (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add(51, 2);
        int int21 = testClass1_0.add(4, (int) '4');
        int int24 = testClass1_0.add((-21), (-48));
        int int27 = testClass1_0.add(15, 8);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add(22, 14);
        int int24 = testClass1_0.add(18, 19);
        int int27 = testClass1_0.add(20, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-19) + "'", int27 == (-19));
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(8, 100);
        int int24 = testClass1_0.add(1, (-49));
        int int27 = testClass1_0.add((int) (byte) 100, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(18, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = testClass1_0.add(8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((-48), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add((-21), (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) 'a', (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add((-7), (int) (byte) 1);
        int int21 = testClass1_0.add(1, (-100));
        int int24 = testClass1_0.add(55, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-6) + "'", int18 == (-6));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(5, 53);
        int int21 = testClass1_0.add(8, (int) ' ');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((-99), (int) (short) 100);
        int int9 = testClass1_0.add(34, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, 35);
        int int24 = testClass1_0.add(9, 14);
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        int int33 = testClass1_0.add(10, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
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
        int int33 = testClass1_0.add(3, (-50));
        int int36 = testClass1_0.add(51, (-23));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(99, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-98) + "'", int18 == (-98));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(11, (-13));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(5, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((int) (short) 10, (-101));
        int int21 = testClass1_0.add((int) (byte) 100, (-50));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-9), (-6));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((-49), (int) (byte) 1);
        int int15 = testClass1_0.add((-53), 9);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-48) + "'", int12 == (-48));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        int int18 = testClass1_0.add((-2), (-9));
        int int21 = testClass1_0.add(11, 100);
        int int24 = testClass1_0.add((-33), 25);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        int int27 = testClass1_0.add((-13), (-23));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        int int36 = testClass1_0.add((-31), (-51));
        int int39 = testClass1_0.add((-18), (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-17) + "'", int39 == (-17));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-17), 51);
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
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add((-20), (-9));
        int int12 = testClass1_0.add((int) 'a', 1);
        int int15 = testClass1_0.add((-1), (-15));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-48), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 98 + "'", int12 == 98);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        int int24 = testClass1_0.add(51, (-19));
        int int27 = testClass1_0.add((-20), (int) (byte) 1);
        int int30 = testClass1_0.add(33, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-19) + "'", int27 == (-19));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        int int15 = testClass1_0.add(26, 5);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-5), 54);
        int int24 = testClass1_0.add((int) 'a', 54);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(14, (-23));
        int int27 = testClass1_0.add((-9), 36);
        int int30 = testClass1_0.add(0, 27);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-8), 35);
        int int18 = testClass1_0.add((int) '4', (-20));
        int int21 = testClass1_0.add((-21), 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-10), 10);
        int int18 = testClass1_0.add((int) (byte) 1, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(4, 27);
        int int21 = testClass1_0.add((-36), (int) ' ');
        int int24 = testClass1_0.add(4, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
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
        int int33 = testClass1_0.add(11, (-13));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((-17), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add((-24), 4);
        int int18 = testClass1_0.add(3, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-5) + "'", int15 == (-5));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        int int30 = testClass1_0.add((int) (byte) -1, 97);
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
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) 'a', (int) 'a');
        int int21 = testClass1_0.add((-9), 26);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add(21, (-7));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-34), (-34));
        int int15 = testClass1_0.add(0, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        int int24 = testClass1_0.add((int) '4', (-9));
        int int27 = testClass1_0.add((-49), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add(0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-4), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((-4), 36);
        int int15 = testClass1_0.add((-13), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        int int36 = testClass1_0.add(14, (-26));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '4', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add((-32), 7);
        int int15 = testClass1_0.add(11, (int) (short) 10);
        int int18 = testClass1_0.add(102, 15);
        int int21 = testClass1_0.add(102, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        int int21 = testClass1_0.add(25, (-99));
        int int24 = testClass1_0.add((-4), (-9));
        int int27 = testClass1_0.add(17, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(53, (-3));
        int int15 = testClass1_0.add(27, (-13));
        int int18 = testClass1_0.add(7, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16) + "'", int12 == (-16));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        int int21 = testClass1_0.add(5, (int) (short) 100);
        int int24 = testClass1_0.add(22, (int) (short) -1);
        int int27 = testClass1_0.add((-53), 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-21) + "'", int24 == (-21));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(34, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-33) + "'", int15 == (-33));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(51, (-50));
        int int27 = testClass1_0.add(6, 18);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        int int30 = testClass1_0.add(14, (-36));
        int int33 = testClass1_0.add((-13), 54);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-25), 17);
        int int12 = testClass1_0.add((int) (short) 0, 27);
        int int15 = testClass1_0.add((int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        int int33 = testClass1_0.add((-97), (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-8) + "'", int33 == (-8));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add((-19), (-15));
        int int24 = testClass1_0.add(2, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
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
        int int33 = testClass1_0.add(26, 5);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(7, (-16));
        int int21 = testClass1_0.add((int) '#', (-13));
        int int24 = testClass1_0.add(26, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        int int33 = testClass1_0.add(7, (-24));
        int int36 = testClass1_0.add((-12), 35);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) '4', (int) (short) 10);
        int int12 = testClass1_0.add(98, 2);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 50 + "'", int12 == 50);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
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
        int int36 = testClass1_0.add((-5), (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        int int24 = testClass1_0.add(11, (int) 'a');
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(97, (-99));
        int int18 = testClass1_0.add((-31), 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-30) + "'", int18 == (-30));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-23), (int) '4');
        int int27 = testClass1_0.add(18, 22);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add(11, 10);
        int int24 = testClass1_0.add((-12), (-5));
        int int27 = testClass1_0.add((int) '#', (int) 'a');
        int int30 = testClass1_0.add(17, 19);
        int int33 = testClass1_0.add((-96), 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-4) + "'", int33 == (-4));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add((-49), 12);
        int int21 = testClass1_0.add(10, 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        int int21 = testClass1_0.add((-97), (-1));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 98 + "'", int21 == 98);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) '4');
        int int21 = testClass1_0.add((-101), 9);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((int) ' ', (int) '#');
        int int18 = testClass1_0.add(49, 49);
        int int21 = testClass1_0.add(21, (-11));
        int int24 = testClass1_0.add((int) (short) 10, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-36), (int) 'a');
        int int27 = testClass1_0.add((int) '4', (-36));
        int int30 = testClass1_0.add(19, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 100, 35);
        int int18 = testClass1_0.add(26, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-101), (-99));
        int int21 = testClass1_0.add(1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) 'a', (-1));
        int int15 = testClass1_0.add(0, 33);
        int int18 = testClass1_0.add((int) (byte) 1, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-96) + "'", int12 == (-96));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(9, (int) (byte) 1);
        int int21 = testClass1_0.add((-49), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        int int36 = testClass1_0.add((-7), (-9));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(51, (int) '#');
        int int27 = testClass1_0.add(49, 10);
        int int30 = testClass1_0.add(12, (-49));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(17, (-3));
        int int24 = testClass1_0.add((-19), 5);
        int int27 = testClass1_0.add(4, 8);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(37, 33);
        int int15 = testClass1_0.add((int) ' ', 53);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        int int33 = testClass1_0.add(19, (-19));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
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
        int int42 = testClass1_0.add(49, 98);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add(51, 17);
        int int18 = testClass1_0.add(34, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-33) + "'", int18 == (-33));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add(17, 97);
        int int15 = testClass1_0.add(0, (-14));
        int int18 = testClass1_0.add((-19), (-7));
        int int21 = testClass1_0.add(3, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add(100, (-4));
        int int12 = testClass1_0.add((-98), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-24) + "'", int9 == (-24));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
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
        int int33 = testClass1_0.add(21, 19);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((-96), (int) (short) 10);
        int int21 = testClass1_0.add(26, (-48));
        int int24 = testClass1_0.add((-23), (-6));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((-30), (-95));
        int int24 = testClass1_0.add((-2), 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((int) 'a', (-23));
        int int18 = testClass1_0.add((-4), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        int int30 = testClass1_0.add((-34), 49);
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        int int33 = testClass1_0.add(100, (-95));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add(51, (-16));
        int int18 = testClass1_0.add((int) (byte) 10, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add((int) 'a', 7);
        int int27 = testClass1_0.add((-34), 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
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
        int int33 = testClass1_0.add(0, (-50));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(100, (-21));
        int int27 = testClass1_0.add((-53), (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 54 + "'", int27 == 54);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-19), (-10));
        int int24 = testClass1_0.add(100, (int) '#');
        int int27 = testClass1_0.add(49, (-17));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((-3), (-99));
        int int24 = testClass1_0.add(1, (-5));
        int int27 = testClass1_0.add((-97), 26);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        int int30 = testClass1_0.add((-11), (-23));
        int int33 = testClass1_0.add((-16), (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 0, 25);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((-51), 5);
        int int18 = testClass1_0.add((-53), (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add(0, (-13));
        int int21 = testClass1_0.add(0, (-36));
        int int24 = testClass1_0.add(26, 21);
        int int27 = testClass1_0.add((-7), (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(37, (-50));
        int int12 = testClass1_0.add((int) '#', 11);
        int int15 = testClass1_0.add((-4), (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-3) + "'", int15 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add((-17), (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        int int27 = testClass1_0.add(3, 21);
        int int30 = testClass1_0.add((int) 'a', (-24));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add((-19), (-15));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        int int33 = testClass1_0.add(53, (-5));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-9) + "'", int33 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(53, 11);
        int int12 = testClass1_0.add((-97), (int) (short) 1);
        int int15 = testClass1_0.add((int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-96) + "'", int12 == (-96));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        int int36 = testClass1_0.add(50, (-52));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        int int36 = testClass1_0.add((-5), (int) (short) 1);
        int int39 = testClass1_0.add(9, (-7));
        int int42 = testClass1_0.add((-52), (-36));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
        int int27 = testClass1_0.add((int) '4', (-2));
        int int30 = testClass1_0.add((-30), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-25) + "'", int27 == (-25));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
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
        int int33 = testClass1_0.add((int) (short) 1, 51);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add(25, 13);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add((-16), 22);
        int int21 = testClass1_0.add((-6), (-50));
        int int24 = testClass1_0.add((-31), (int) '4');
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
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        int int30 = testClass1_0.add(53, 11);
        int int33 = testClass1_0.add(33, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(100, 21);
        int int9 = testClass1_0.add(11, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        int int30 = testClass1_0.add(0, (-4));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
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
        int int33 = testClass1_0.add((-23), 97);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-8), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        int int30 = testClass1_0.add(99, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) 100, (int) '#');
        int int18 = testClass1_0.add((-23), 9);
        int int21 = testClass1_0.add(10, (-15));
        int int24 = testClass1_0.add(22, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-32), 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add(18, (-20));
        int int24 = testClass1_0.add((-12), (-17));
        int int27 = testClass1_0.add(17, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-15), (-98));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        int int33 = testClass1_0.add(99, 100);
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
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(10, (-10));
        int int27 = testClass1_0.add((int) 'a', 49);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add((-16), 49);
        int int21 = testClass1_0.add((-4), 26);
        int int24 = testClass1_0.add(102, 14);
        int int27 = testClass1_0.add(19, (-50));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add(54, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
        int int30 = testClass1_0.add(34, (int) (short) 1);
        int int33 = testClass1_0.add(3, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-36), (int) 'a');
        int int27 = testClass1_0.add((int) '4', (-36));
        int int30 = testClass1_0.add(0, (-5));
        int int33 = testClass1_0.add((-101), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
        int int33 = testClass1_0.add((int) (byte) 0, (-100));
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(55, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(7, (-12));
        int int24 = testClass1_0.add((int) 'a', 50);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        int int15 = testClass1_0.add(17, 7);
        int int18 = testClass1_0.add(19, (-23));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(101, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
        int int33 = testClass1_0.add(54, (-36));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(4, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(100, 102);
        int int18 = testClass1_0.add((-95), 9);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-9) + "'", int18 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
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
        int int30 = testClass1_0.add((-4), (-6));
        int int33 = testClass1_0.add((int) (short) 1, 22);
        int int36 = testClass1_0.add((-48), (-23));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((-36), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-23), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }
}


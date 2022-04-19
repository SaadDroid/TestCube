import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 100, 5);
        int int15 = testClass1_0.add(97, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-12) + "'", int15 == (-12));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((-96), (int) (short) 10);
        int int21 = testClass1_0.add(3, 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((-2), (-7));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add((-16), 49);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add(0, (int) '#');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-3), 102);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(20, 21);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add(53, 18);
        int int18 = testClass1_0.add(27, (-34));
        int int21 = testClass1_0.add((-97), 53);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (short) -1, 18);
        int int24 = testClass1_0.add(13, 51);
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add((-2), 101);
        int int18 = testClass1_0.add((-10), (-51));
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        int int24 = testClass1_0.add((int) '4', (-9));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add((int) 'a', 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add(53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((int) (short) 100, 3);
        int int21 = testClass1_0.add((int) '4', (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(51, (-16));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(5, 17);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-23), (int) '4');
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-50), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(9, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, 7);
        int int12 = testClass1_0.add((int) (byte) 100, 10);
        int int15 = testClass1_0.add((-13), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-7), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        int int9 = testClass1_0.add(20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((-5), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-19) + "'", int9 == (-19));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
            int int27 = testClass1_0.add(7, 0);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(25, (-13));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(18, (int) '#');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, (-7));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((-1), 4);
        int int21 = testClass1_0.add((-25), (-10));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((-3), 21);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add(51, 9);
        int int18 = testClass1_0.add(1, (-8));
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(18, (-6));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add(17, (int) (byte) -1);
        int int18 = testClass1_0.add((-9), 49);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16) + "'", int15 == (-16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        int int30 = testClass1_0.add(7, 9);
        int int33 = testClass1_0.add(13, (-2));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-5) + "'", int33 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-6) + "'", int27 == (-6));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(49, 98);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        int int30 = testClass1_0.add(7, 9);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(4, 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(2, 49);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        int int30 = testClass1_0.add(0, 53);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(0, (-1));
        int int21 = testClass1_0.add(101, 1);
        int int24 = testClass1_0.add(0, 102);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(27, 34);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
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
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(27, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add((-99), (int) 'a');
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-11), (int) 'a');
        int int15 = testClass1_0.add(4, 18);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(51, (int) '#');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-51), 102);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((int) (short) 0, 21);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(12, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-11) + "'", int12 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        int int12 = testClass1_0.add((-23), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-25), 17);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        int int30 = testClass1_0.add(4, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) 'a', 8);
        int int21 = testClass1_0.add(3, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-13), 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(3, (-25));
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-96) + "'", int24 == (-96));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(51, (-50));
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 0, (-50));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((-19), 7);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(35, (int) (byte) 0);
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
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(12, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add((-49), 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11) + "'", int27 == (-11));
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add((-101), 0);
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
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-19));
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
            int int30 = testClass1_0.add((-15), 0);
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
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
        int int21 = testClass1_0.add((-101), (-11));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(7, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add((-8), 53);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-12), (int) (byte) 100);
        int int27 = testClass1_0.add((int) (short) 100, (int) (byte) 1);
        int int30 = testClass1_0.add(20, 54);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add(35, (int) (byte) 10);
        int int24 = testClass1_0.add((-6), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add((-1), 8);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add((-5), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        int int24 = testClass1_0.add((-12), (int) (byte) 100);
        int int27 = testClass1_0.add((int) (short) 100, (int) (byte) 1);
        int int30 = testClass1_0.add(20, 54);
        int int33 = testClass1_0.add(0, (-36));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 101 + "'", int27 == 101);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add((-32), 102);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        int int21 = testClass1_0.add(37, (-7));
        int int24 = testClass1_0.add(0, (-3));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add((-11), 36);
        int int24 = testClass1_0.add((-23), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add(51, 2);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((int) (byte) 0, 53);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, 7);
        int int12 = testClass1_0.add((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        int int24 = testClass1_0.add(53, 13);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-3), (-99));
        int int18 = testClass1_0.add(101, (int) 'a');
        int int21 = testClass1_0.add(36, (-3));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(12, (-1));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11) + "'", int27 == (-11));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) '4', (-16));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(4, 13);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        int int24 = testClass1_0.add((-19), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(37, 33);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((-11), 11);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(17, (-3));
        int int24 = testClass1_0.add((-19), 5);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add((-8), (-10));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(102, (-4));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add(37, 51);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add(17, 97);
        int int15 = testClass1_0.add(10, (-20));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(8, 1);
        int int15 = testClass1_0.add(9, (-8));
        int int18 = testClass1_0.add(102, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(21, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((int) (byte) 10, 4);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, 51);
        int int27 = testClass1_0.add(27, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 14 + "'", int27 == 14);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(8, (int) (byte) 100);
        int int9 = testClass1_0.add((-51), 11);
        int int12 = testClass1_0.add((-7), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(11, (-13));
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        int int30 = testClass1_0.add((int) (short) 100, 20);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 6 + "'", int30 == 6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(9, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-9), 0);
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add(34, 101);
        int int18 = testClass1_0.add(0, (int) (short) 100);
        int int21 = testClass1_0.add(0, (int) '#');
        int int24 = testClass1_0.add((-20), (-13));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) '4', (int) ' ');
        int int18 = testClass1_0.add((-49), 102);
        int int21 = testClass1_0.add((-12), 12);
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
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((-34), 101);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(18, 12);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        int int30 = testClass1_0.add((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(0, (-20));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((int) (byte) 0, 0);
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
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add(97, 11);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((-12), 20);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        int int33 = testClass1_0.add(13, (-5));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-15), 25);
        int int21 = testClass1_0.add((-12), 4);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(37, (-50));
        int int12 = testClass1_0.add((int) '#', 11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-96), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        int int30 = testClass1_0.add(11, 34);
        int int33 = testClass1_0.add((-15), (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-2), (-101));
        int int12 = testClass1_0.add(33, 17);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((int) (byte) 0, 53);
        int int18 = testClass1_0.add(34, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add((-8), (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-7) + "'", int12 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(100, 3);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add(37, 27);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add(22, 12);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-1), (-23));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(27, (int) '#');
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        int int33 = testClass1_0.add((-8), 5);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(10, (-10));
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(35, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(8, (-24));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add((-32), 102);
        int int15 = testClass1_0.add((int) (short) 1, (-51));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-10), (-13));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add((-51), 98);
        int int18 = testClass1_0.add((-36), (-50));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', 13);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20 + "'", int24 == 20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((-1), 4);
        int int21 = testClass1_0.add((-25), (-10));
        int int24 = testClass1_0.add((-36), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add((int) ' ', 5);
        int int18 = testClass1_0.add(8, (-23));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(33, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add(27, (-12));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add(0, 5);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        int int30 = testClass1_0.add((int) (byte) 0, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add((-16), 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(14, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add((-96), (int) 'a');
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(27, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add((-13), 51);
        int int21 = testClass1_0.add((-97), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-23) + "'", int21 == (-23));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(18, (-6));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((-34), 101);
        int int18 = testClass1_0.add(97, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(34, 1);
        int int15 = testClass1_0.add(21, (int) '#');
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(18, 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, 33);
        int int15 = testClass1_0.add(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        int int36 = testClass1_0.add(4, 6);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(49, 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) '4', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        int int30 = testClass1_0.add((-5), (-9));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add(0, 2);
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
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((int) (short) 10, (int) 'a');
        int int21 = testClass1_0.add((int) '#', 34);
        int int24 = testClass1_0.add((-96), 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-31) + "'", int24 == (-31));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add(3, 26);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-99), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((-7), 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add((-7), 27);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(98, 6);
        int int12 = testClass1_0.add(26, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-9) + "'", int24 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add((-13), 51);
        int int21 = testClass1_0.add(36, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(25, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(17, 11);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) (short) 10, 1);
        int int15 = testClass1_0.add((int) (short) -1, (-11));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((-21), 12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((int) (byte) 100, 0);
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add(12, (-23));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(8, (-12));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(1, (-2));
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((int) (short) 1, 25);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-19));
        int int21 = testClass1_0.add(21, (-1));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(97, (-99));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add((-96), 97);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((-96), 17);
        int int21 = testClass1_0.add((-20), (-97));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add((-13), (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int9 = testClass1_0.add((-5), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(49, 98);
        int int21 = testClass1_0.add(22, 33);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(14, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) (short) 10, 1);
        int int15 = testClass1_0.add((-34), (-5));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(7, 0);
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-99), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-8) + "'", int15 == (-8));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add((int) ' ', (-13));
        int int21 = testClass1_0.add(22, 54);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-16), 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        int int24 = testClass1_0.add((int) 'a', (-6));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-15) + "'", int24 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-20), (-11));
        int int27 = testClass1_0.add((-7), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add(37, (-12));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add((int) 'a', 98);
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(25, 25);
        int int21 = testClass1_0.add((-99), 10);
        int int24 = testClass1_0.add(100, (-19));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-8) + "'", int21 == (-8));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((-9), (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-32), (-23));
        int int18 = testClass1_0.add(14, (-9));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(10, (-23));
        int int18 = testClass1_0.add((-34), (-7));
        int int21 = testClass1_0.add(18, (-7));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(0, (-1));
        int int21 = testClass1_0.add(101, 1);
        int int24 = testClass1_0.add(0, 102);
        int int27 = testClass1_0.add((-20), (int) ' ');
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 102 + "'", int21 == 102);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add(6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        int int30 = testClass1_0.add(12, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-34) + "'", int27 == (-34));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        int int15 = testClass1_0.add((-21), (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 0, (-23));
        int int18 = testClass1_0.add((-2), 101);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add(100, 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, (-7));
        int int21 = testClass1_0.add(13, (-32));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add((-11), 12);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        int int30 = testClass1_0.add(49, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(98, 98);
        int int24 = testClass1_0.add((-24), (-34));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((-11), (-2));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add((int) (short) 10, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add(102, (-23));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add((-13), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add(11, 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((int) ' ', (int) '#');
        int int18 = testClass1_0.add((-49), (-24));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((-3), (-11));
        int int21 = testClass1_0.add(37, (-16));
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        java.lang.Class<?> wildcardClass4 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((int) (byte) 1, (-24));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
            int int24 = testClass1_0.add(8, 0);
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(13, 101);
        int int24 = testClass1_0.add((int) (short) 100, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-12), (-2));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((-51), 5);
        int int18 = testClass1_0.add(12, (-51));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-24));
        int int21 = testClass1_0.add(5, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add(3, (-11));
        int int24 = testClass1_0.add(9, 13);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-20), (-11));
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
            int int27 = testClass1_0.add((int) (short) 10, 0);
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(17, 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((int) (byte) 100, 101);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add((int) (short) 0, 100);
        int int18 = testClass1_0.add(17, 9);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-97) + "'", int30 == (-97));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add(33, (-8));
        int int24 = testClass1_0.add(51, 12);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((int) (short) 0, 21);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(7, 4);
        int int24 = testClass1_0.add((-32), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((-21), 12);
        int int21 = testClass1_0.add((int) 'a', 50);
        int int24 = testClass1_0.add(3, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add((-19), (-24));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((-21), 12);
        int int21 = testClass1_0.add((int) 'a', 50);
        int int24 = testClass1_0.add((-24), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(3, (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add((-13), (-25));
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        int int30 = testClass1_0.add(21, (-97));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((int) (short) -1, (-97));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        // The following exception was thrown during execution in test generation
        try {
            int int39 = testClass1_0.add((-23), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        int int30 = testClass1_0.add((-10), (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-9) + "'", int30 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((int) '#', (int) (short) 10);
        int int21 = testClass1_0.add(51, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add(27, (-12));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        int int39 = testClass1_0.add((-34), 26);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add((-21), 12);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add(102, (-23));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((-4), 54);
        int int18 = testClass1_0.add((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(27, 25);
        int int21 = testClass1_0.add((-10), 8);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(100, 3);
        int int18 = testClass1_0.add((-24), 8);
        int int21 = testClass1_0.add((-9), (-99));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add(36, 20);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((int) (byte) 10, (-101));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((-96), (int) (short) 10);
        int int21 = testClass1_0.add(36, 21);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(18, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-3) + "'", int30 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((int) (short) 10, 25);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(18, (int) '#');
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add((int) (short) 0, 26);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add((int) (byte) 100, 34);
        int int21 = testClass1_0.add(37, (-1));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-36) + "'", int21 == (-36));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 10, 5);
        int int6 = testClass1_0.add(2, (-101));
        int int9 = testClass1_0.add((-97), (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-24) + "'", int24 == (-24));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (-9));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(6, 7);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add((-19), (int) (short) 100);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 34 + "'", int27 == 34);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        int int21 = testClass1_0.add((-1), (-32));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add(12, (-13));
        int int21 = testClass1_0.add(51, 5);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        int int9 = testClass1_0.add(20, (-49));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(53, 33);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(4, (-32));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(20, 102);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(25, 2);
        int int24 = testClass1_0.add(5, (-96));
        int int27 = testClass1_0.add((int) (short) 0, 26);
        int int30 = testClass1_0.add((-13), 14);
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-9), 53);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add(35, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add((-24), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-31), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-101), (-6));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(97, (-99));
        int int18 = testClass1_0.add((-16), (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((-10), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add((-32), 7);
        int int15 = testClass1_0.add(36, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-101), (-8));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        int int15 = testClass1_0.add((-25), 50);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(36, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) '4', 8);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(26, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-25), 17);
        int int12 = testClass1_0.add((int) (short) 0, 27);
        int int15 = testClass1_0.add((-16), 33);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 54);
        int int24 = testClass1_0.add((-53), 50);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add(7, (-19));
        int int15 = testClass1_0.add(4, 8);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(19, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        int int36 = testClass1_0.add((-96), (-12));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (short) 0, 11);
        int int24 = testClass1_0.add(27, (int) '4');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        int int30 = testClass1_0.add(14, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add((int) 'a', 36);
        int int9 = testClass1_0.add(49, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-97), (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add(0, 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        int int39 = testClass1_0.add((-20), (-99));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (byte) 1, 101);
        int int18 = testClass1_0.add(35, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(102, (-4));
        int int21 = testClass1_0.add((-101), 25);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        int int36 = testClass1_0.add((-24), (-3));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-24) + "'", int33 == (-24));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(5, 53);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(25, (int) (byte) -1);
        int int21 = testClass1_0.add((-15), 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-24) + "'", int18 == (-24));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-31), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add(3, (-48));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-32), (-23));
        int int18 = testClass1_0.add(51, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add(0, (int) (short) 100);
        int int15 = testClass1_0.add((-12), 18);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-99), 0);
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
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-96), 25);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(8, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-1), (int) (short) 1);
        int int6 = testClass1_0.add(100, (int) '4');
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((-36), (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(4, 13);
        int int24 = testClass1_0.add((-16), (-51));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, 97);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(97, 13);
        int int18 = testClass1_0.add(97, (-6));
        int int21 = testClass1_0.add(37, 20);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15) + "'", int18 == (-15));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(21, (-10));
        int int15 = testClass1_0.add((int) ' ', (int) '#');
        int int18 = testClass1_0.add(49, 49);
        int int21 = testClass1_0.add(21, (-11));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) '4', (-16));
        int int21 = testClass1_0.add((-101), 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        int int21 = testClass1_0.add(98, (int) ' ');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(37, 101);
        int int24 = testClass1_0.add((-12), 33);
        int int27 = testClass1_0.add(97, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 13 + "'", int27 == 13);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-16), (int) (byte) 1);
        int int15 = testClass1_0.add((-96), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-15) + "'", int12 == (-15));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add((int) (short) 1, (int) (short) 100);
        int int21 = testClass1_0.add(34, (int) (short) 10);
        int int24 = testClass1_0.add(36, 98);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(102, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add((int) (short) 100, 9);
        int int30 = testClass1_0.add(97, 35);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((int) 'a', 13);
        int int27 = testClass1_0.add(102, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
        int int21 = testClass1_0.add((int) (byte) 100, 1);
        int int24 = testClass1_0.add((-23), (int) 'a');
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 101 + "'", int21 == 101);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add(18, (-20));
        int int24 = testClass1_0.add(18, 8);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add(51, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(25, (int) (byte) 10);
        int int21 = testClass1_0.add((-21), (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(53, 49);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add((-25), 17);
        int int12 = testClass1_0.add((int) (short) 0, 27);
        int int15 = testClass1_0.add((int) (short) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((-3), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add(18, (-20));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-23), 0);
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
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(2, 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((-50), 98);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = testClass1_0.add((int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(14, (int) (short) -1);
        int int24 = testClass1_0.add(54, 19);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13) + "'", int21 == (-13));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-5) + "'", int27 == (-5));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((int) (short) 10, (-50));
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        int int24 = testClass1_0.add((-24), (-10));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        int int33 = testClass1_0.add(17, (-50));
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(33, (-9));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        int int36 = testClass1_0.add(18, 20);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        int int33 = testClass1_0.add(11, (-48));
        int int36 = testClass1_0.add((-11), 33);
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(5, (-15));
        int int24 = testClass1_0.add(22, 12);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        int int30 = testClass1_0.add(25, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add((-9), 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(101, 3);
        int int18 = testClass1_0.add(25, 3);
        int int21 = testClass1_0.add((-19), 18);
        int int24 = testClass1_0.add(5, (-24));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(9, (int) (short) 1);
        int int24 = testClass1_0.add(0, (-4));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add(7, 102);
        int int21 = testClass1_0.add((-51), 12);
        int int24 = testClass1_0.add(22, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(51, 0);
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
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(0, 102);
        int int12 = testClass1_0.add((int) (short) 1, (-3));
        int int15 = testClass1_0.add((-24), 3);
        int int18 = testClass1_0.add(5, 53);
        int int21 = testClass1_0.add(8, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(4, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-7) + "'", int15 == (-7));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add((-49), (-8));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(12, (-1));
        int int30 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-11) + "'", int27 == (-11));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 10, 5);
        int int6 = testClass1_0.add(0, 10);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(21, 35);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
            int int27 = testClass1_0.add(8, (int) (byte) 0);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        int int12 = testClass1_0.add((-32), 7);
        int int15 = testClass1_0.add(11, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(8, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add(5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(19, 33);
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-49), (-11));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((-20), (-11));
        int int27 = testClass1_0.add((int) (byte) 10, (-49));
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(33, (-9));
        int int15 = testClass1_0.add(49, (-13));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((-12), 20);
        int int18 = testClass1_0.add((int) '4', 21);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add(18, 12);
        int int15 = testClass1_0.add(20, (-14));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add(0, 53);
        int int21 = testClass1_0.add(25, (-99));
        int int24 = testClass1_0.add((-4), (-9));
        int int27 = testClass1_0.add((-16), 22);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(11, (-13));
        int int27 = testClass1_0.add((-51), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add(0, 8);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        int int30 = testClass1_0.add(11, 34);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((int) ' ', (int) (byte) 1);
        int int27 = testClass1_0.add(97, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 33 + "'", int24 == 33);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add(33, (-1));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add((-23), (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        int int30 = testClass1_0.add((-25), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-24) + "'", int30 == (-24));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add((-11), 51);
        int int15 = testClass1_0.add(97, 1);
        int int18 = testClass1_0.add((-50), (int) (byte) 100);
        int int21 = testClass1_0.add(13, (-11));
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(97, (int) (short) -1);
        int int27 = testClass1_0.add((int) 'a', 5);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-96) + "'", int24 == (-96));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20 + "'", int27 == 20);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (short) 0, (int) (short) 100);
        int int24 = testClass1_0.add((-50), 6);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-7) + "'", int24 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 17 + "'", int27 == 17);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((-11), (-19));
        int int21 = testClass1_0.add(21, (-1));
        int int24 = testClass1_0.add(0, (-50));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-20) + "'", int21 == (-20));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-3), (-99));
        int int18 = testClass1_0.add((-10), (-1));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        int int33 = testClass1_0.add(11, (-48));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, 7);
        int int12 = testClass1_0.add((-3), 8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = testClass1_0.add((int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(1, (-10));
        int int15 = testClass1_0.add(97, 27);
        int int18 = testClass1_0.add(1, (-23));
        int int21 = testClass1_0.add((-1), 8);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add((-10), 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        int int39 = testClass1_0.add((-8), (-101));
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add((int) (byte) 100, (-2));
        int int27 = testClass1_0.add((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(22, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-15) + "'", int27 == (-15));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) (byte) -1, (-8));
        int int24 = testClass1_0.add(4, (-50));
        int int27 = testClass1_0.add((-15), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(18, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((-97), (-13));
        int int9 = testClass1_0.add(26, 9);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add((int) ' ', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add(0, (-25));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 0, (-23));
        int int18 = testClass1_0.add((-23), 27);
        int int21 = testClass1_0.add(98, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-3), (-99));
        int int18 = testClass1_0.add(101, (int) 'a');
        int int21 = testClass1_0.add((int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        int int21 = testClass1_0.add((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((-3), (-99));
        int int24 = testClass1_0.add(1, (-5));
        int int27 = testClass1_0.add(12, 37);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add((-2), 101);
        int int18 = testClass1_0.add((int) (short) 0, 25);
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-8), (-5));
        int int18 = testClass1_0.add(0, 10);
        int int21 = testClass1_0.add(98, 18);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 10, 5);
        int int6 = testClass1_0.add(0, 10);
        int int9 = testClass1_0.add(0, 25);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add(98, 35);
        int int12 = testClass1_0.add((int) (short) 100, 3);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(18, 27);
        int int21 = testClass1_0.add((int) (short) -1, (-11));
        int int24 = testClass1_0.add(11, 21);
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(102, 102);
        int int15 = testClass1_0.add((-13), 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((int) (short) 1, 101);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((int) (byte) 10, (-101));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = testClass1_0.add((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        int int30 = testClass1_0.add(2, (int) '4');
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
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) 100, (int) '#');
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-10), (int) (short) -1);
        int int18 = testClass1_0.add((-10), (int) '#');
        int int21 = testClass1_0.add((int) ' ', 49);
        int int24 = testClass1_0.add(10, 51);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((-2), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add(0, 5);
        int int18 = testClass1_0.add((-23), (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add(98, (-31));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add(22, (-20));
        int int18 = testClass1_0.add((int) ' ', (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((-20), 21);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-2), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-2), (int) '#');
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = testClass1_0.add((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add(33, (-8));
        int int24 = testClass1_0.add(51, 12);
        int int27 = testClass1_0.add(101, 9);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        int int15 = testClass1_0.add((-21), (int) (byte) 10);
        int int18 = testClass1_0.add((int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-97), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-21) + "'", int30 == (-21));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(98, 10);
        int int21 = testClass1_0.add(0, (int) (short) -1);
        int int24 = testClass1_0.add(101, 4);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 26 + "'", int24 == 26);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-25), 0);
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
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add(12, (-23));
        int int15 = testClass1_0.add((-4), (-6));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add(34, 36);
        int int24 = testClass1_0.add(0, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-23), 2);
        int int27 = testClass1_0.add(8, 15);
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(3, (-25));
        int int24 = testClass1_0.add((-15), (-20));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-51), (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add(11, (-34));
        int int18 = testClass1_0.add((-7), 11);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
        int int21 = testClass1_0.add((-15), (-16));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add((-32), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }
}


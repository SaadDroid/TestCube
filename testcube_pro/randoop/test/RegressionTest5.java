import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        int int33 = testClass1_0.add(7, 16);
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
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        int int42 = testClass1_0.add((-49), (-50));
        int int45 = testClass1_0.add((-24), (-98));
        java.lang.Class<?> wildcardClass46 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((int) (short) 1, 101);
        int int15 = testClass1_0.add(12, 10);
        int int18 = testClass1_0.add(53, (-16));
        int int21 = testClass1_0.add((-53), 5);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-9) + "'", int21 == (-9));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add((int) (short) -1, 21);
        int int27 = testClass1_0.add((-51), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add(21, 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(3, (-99));
        int int27 = testClass1_0.add((int) 'a', (-95));
        int int30 = testClass1_0.add((-95), (-48));
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(49, 102);
        int int21 = testClass1_0.add(4, 13);
        int int24 = testClass1_0.add((-16), (-51));
        int int27 = testClass1_0.add(11, 14);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(21, (-15));
        int int15 = testClass1_0.add((-30), 21);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (short) 1, (int) (short) 1);
        int int15 = testClass1_0.add(0, (int) '#');
        int int18 = testClass1_0.add((-6), 21);
        int int21 = testClass1_0.add((-14), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add(3, (-7));
        int int24 = testClass1_0.add((-3), (-35));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-11), (int) 'a');
        int int15 = testClass1_0.add(7, 4);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        int int33 = testClass1_0.add(2, 101);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add((int) (byte) 0, (-3));
        int int21 = testClass1_0.add((int) (byte) 100, (-99));
        int int24 = testClass1_0.add(1, (-2));
        int int27 = testClass1_0.add(26, (-3));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        int int27 = testClass1_0.add((-48), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-99) + "'", int24 == (-99));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(53, 11);
        int int12 = testClass1_0.add((-97), (int) (short) 1);
        int int15 = testClass1_0.add((int) (byte) 0, (-8));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-96) + "'", int12 == (-96));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
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
        int int30 = testClass1_0.add(15, 25);
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
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-24), 49);
        int int15 = testClass1_0.add((-21), (int) (byte) 10);
        int int18 = testClass1_0.add((-24), 18);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(37, (-96));
        int int12 = testClass1_0.add((-11), (-16));
        int int15 = testClass1_0.add(11, (-34));
        int int18 = testClass1_0.add((-7), 11);
        int int21 = testClass1_0.add(21, (-31));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add((-9), 101);
        int int18 = testClass1_0.add((-2), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(1, (-10));
        int int15 = testClass1_0.add(97, 27);
        int int18 = testClass1_0.add(1, (-23));
        int int21 = testClass1_0.add(97, (-1));
        int int24 = testClass1_0.add((int) (byte) 100, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-96) + "'", int21 == (-96));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        int int45 = testClass1_0.add((-50), 19);
        java.lang.Class<?> wildcardClass46 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(7, (-12));
        int int24 = testClass1_0.add(0, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        int int33 = testClass1_0.add(3, (-33));
        int int36 = testClass1_0.add(25, (-17));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-2), (-10));
        int int21 = testClass1_0.add((int) (short) 1, 36);
        int int24 = testClass1_0.add((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(5, (-13));
        int int24 = testClass1_0.add((-48), (-4));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(27, (int) 'a');
        int int21 = testClass1_0.add((-24), (-19));
        int int24 = testClass1_0.add(97, 37);
        int int27 = testClass1_0.add(54, 17);
        int int30 = testClass1_0.add((-3), (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add(100, (-3));
        int int18 = testClass1_0.add(20, 20);
        int int21 = testClass1_0.add((int) (short) -1, (-25));
        int int24 = testClass1_0.add((-36), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add((int) (short) 0, (-31));
        int int18 = testClass1_0.add((-2), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(27, 54);
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
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add((int) (byte) 10, (int) (byte) 10);
        int int21 = testClass1_0.add((-18), (-53));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(35, (-8));
        int int27 = testClass1_0.add(14, 97);
        int int30 = testClass1_0.add((-24), (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(4, 9);
        int int18 = testClass1_0.add(4, 97);
        int int21 = testClass1_0.add(8, (int) (byte) 10);
        int int24 = testClass1_0.add(102, (int) ' ');
        int int27 = testClass1_0.add(11, (-21));
        int int30 = testClass1_0.add(97, 101);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = testClass1_0.add(36, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add(33, 26);
        java.lang.Class<?> wildcardClass7 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(53, 100);
        int int15 = testClass1_0.add((-48), (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((int) (short) 10, (-50));
        int int21 = testClass1_0.add(101, (-14));
        int int24 = testClass1_0.add(51, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-6) + "'", int21 == (-6));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(0, (int) (byte) 100);
        int int18 = testClass1_0.add(0, (int) (byte) 100);
        int int21 = testClass1_0.add((-10), (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add((-3), 51);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(17, 11);
        int int18 = testClass1_0.add((-32), (-25));
        int int21 = testClass1_0.add((-53), 37);
        int int24 = testClass1_0.add(10, (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(25, 35);
        int int12 = testClass1_0.add(54, 34);
        int int15 = testClass1_0.add(5, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((-13), 25);
        int int21 = testClass1_0.add((int) (byte) 1, (-6));
        int int24 = testClass1_0.add(0, (-48));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((int) (short) -1, (-97));
        int int15 = testClass1_0.add((-20), (-9));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        int int33 = testClass1_0.add(18, (-21));
        int int36 = testClass1_0.add((-1), (int) (short) -1);
        int int39 = testClass1_0.add((-49), 17);
        int int42 = testClass1_0.add((-26), 3);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-7) + "'", int42 == (-7));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(97, (-24));
        int int21 = testClass1_0.add(102, 12);
        int int24 = testClass1_0.add((int) (short) 0, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        int int24 = testClass1_0.add(49, (int) (short) 10);
        int int27 = testClass1_0.add(20, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) '#', (int) (byte) 1);
        int int18 = testClass1_0.add(54, 102);
        int int21 = testClass1_0.add((-24), (-30));
        int int24 = testClass1_0.add(49, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(13, (-99));
        int int27 = testClass1_0.add(50, (-34));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        int int33 = testClass1_0.add(0, (-14));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        int int36 = testClass1_0.add(0, (-97));
        java.lang.Class<?> wildcardClass37 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-16) + "'", int21 == (-16));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add((-23), (int) '4');
        int int27 = testClass1_0.add(11, 25);
        int int30 = testClass1_0.add(7, (-33));
        int int33 = testClass1_0.add(33, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int36 = testClass1_0.add((int) '#', (-53));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((int) (byte) 0, (int) (short) 100);
        int int18 = testClass1_0.add(53, 25);
        int int21 = testClass1_0.add((-13), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        int int33 = testClass1_0.add(35, (-35));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add((int) '#', (-7));
        int int27 = testClass1_0.add(9, 21);
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add(5, 17);
        int int15 = testClass1_0.add((-13), (-26));
        int int18 = testClass1_0.add((-95), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) (short) 10, 98);
        int int12 = testClass1_0.add((-96), 53);
        int int15 = testClass1_0.add(14, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add(17, (int) (byte) 1);
        int int21 = testClass1_0.add(51, 3);
        int int24 = testClass1_0.add(49, (-33));
        int int27 = testClass1_0.add(0, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add(10, (-34));
        int int18 = testClass1_0.add(11, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add(101, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int int33 = testClass1_0.add((-48), 10);
        int int36 = testClass1_0.add(101, (-4));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3) + "'", int33 == (-3));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-24) + "'", int36 == (-24));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add((-18), (int) 'a');
        int int21 = testClass1_0.add((-20), (-30));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) '#', 2);
        int int18 = testClass1_0.add(4, (-32));
        int int21 = testClass1_0.add(12, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(2, (-1));
        int int18 = testClass1_0.add(21, 36);
        int int21 = testClass1_0.add(14, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-13) + "'", int21 == (-13));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((int) (byte) 10, 4);
        int int24 = testClass1_0.add(0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        int int30 = testClass1_0.add(98, 54);
        int int33 = testClass1_0.add((-4), 11);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        int int24 = testClass1_0.add(50, 10);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(33, (-4));
        int int24 = testClass1_0.add(35, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-7) + "'", int21 == (-7));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-25), (-3));
        int int15 = testClass1_0.add(20, 27);
        int int18 = testClass1_0.add(3, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add((-16), (-101));
        int int15 = testClass1_0.add((-17), 11);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add(18, (-9));
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
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((int) (byte) -1, (-98));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add(3, 34);
        int int12 = testClass1_0.add((-9), (-24));
        int int15 = testClass1_0.add((-11), 25);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add(37, 49);
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        int int33 = testClass1_0.add(3, (-51));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 1, (int) (short) 100);
        int int21 = testClass1_0.add((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
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
        int int36 = testClass1_0.add(34, (-1));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-33) + "'", int36 == (-33));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(9, (int) (short) 10);
        int int21 = testClass1_0.add(1, (-9));
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((-11), 6);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-51), 102);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(1, 53);
        int int18 = testClass1_0.add((int) (byte) 1, (-2));
        int int21 = testClass1_0.add((-2), (-36));
        int int24 = testClass1_0.add(14, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int33 = testClass1_0.add(33, 26);
        int int36 = testClass1_0.add(15, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = testClass1_0.add(26, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        int int24 = testClass1_0.add((int) (byte) 0, 1);
        int int27 = testClass1_0.add((-35), 34);
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
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add((int) (short) -1, (-1));
        int int9 = testClass1_0.add((int) (short) -1, (-23));
        int int12 = testClass1_0.add((-11), 8);
        int int15 = testClass1_0.add((-3), (-5));
        int int18 = testClass1_0.add((int) (short) 10, (-50));
        int int21 = testClass1_0.add((-32), (-24));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        int int30 = testClass1_0.add((-6), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-49) + "'", int24 == (-49));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-5) + "'", int30 == (-5));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        int int39 = testClass1_0.add(18, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-17) + "'", int39 == (-17));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-24), 101);
        int int24 = testClass1_0.add((-16), 8);
        int int27 = testClass1_0.add((-50), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) 10, (-96));
        int int18 = testClass1_0.add(0, 4);
        int int21 = testClass1_0.add((-49), (int) (short) 1);
        int int24 = testClass1_0.add((int) (byte) 100, (-99));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-48) + "'", int21 == (-48));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-5), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        int int30 = testClass1_0.add((-11), (-32));
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
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(25, 100);
        int int12 = testClass1_0.add(100, 11);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        int int30 = testClass1_0.add(100, (-99));
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
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((int) (byte) 0, 53);
        int int18 = testClass1_0.add(34, (int) (short) 1);
        int int21 = testClass1_0.add(0, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-5));
        int int18 = testClass1_0.add(37, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add((-99), 8);
        int int24 = testClass1_0.add(34, 34);
        int int27 = testClass1_0.add(35, (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-11) + "'", int21 == (-11));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
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
        int int30 = testClass1_0.add((-5), 19);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((int) '4', (-10));
        int int18 = testClass1_0.add((-12), (-34));
        int int21 = testClass1_0.add(26, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-7) + "'", int27 == (-7));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add((int) (byte) 10, 54);
        int int24 = testClass1_0.add((-101), 33);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(33, 3);
        int int18 = testClass1_0.add((int) (short) -1, (-96));
        int int21 = testClass1_0.add(37, 51);
        int int24 = testClass1_0.add((-10), (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((-3), (-21));
        int int27 = testClass1_0.add((-11), (-31));
        int int30 = testClass1_0.add((-48), (-101));
        int int33 = testClass1_0.add(6, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add(3, 26);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 11 + "'", int27 == 11);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((-5), 54);
        int int24 = testClass1_0.add(0, 54);
        int int27 = testClass1_0.add(5, (-49));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (short) 100, 25);
        int int12 = testClass1_0.add(18, 2);
        int int15 = testClass1_0.add((int) (byte) 10, 8);
        int int18 = testClass1_0.add((-99), 35);
        int int21 = testClass1_0.add(13, (-6));
        int int24 = testClass1_0.add(21, 13);
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
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add((-11), 12);
        int int21 = testClass1_0.add((-18), (-2));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        int int36 = testClass1_0.add(0, (-19));
        int int39 = testClass1_0.add((int) (byte) 10, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(9, (int) (short) 1);
        int int24 = testClass1_0.add(19, (int) (short) 100);
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((int) (byte) 100, 9);
        int int18 = testClass1_0.add((-5), (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add(53, (-3));
        int int15 = testClass1_0.add(27, (-13));
        int int18 = testClass1_0.add(102, 6);
        int int21 = testClass1_0.add((-96), (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-16) + "'", int12 == (-16));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(1, (int) (byte) 100);
        int int24 = testClass1_0.add(0, 37);
        int int27 = testClass1_0.add(20, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(10, (-10));
        int int27 = testClass1_0.add((int) (short) 10, (-24));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((int) (short) 10, (int) (short) 100);
        int int18 = testClass1_0.add((-101), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-19) + "'", int18 == (-19));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((int) '#', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
        int int24 = testClass1_0.add((int) '4', 25);
        int int27 = testClass1_0.add((-1), (-8));
        int int30 = testClass1_0.add(98, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-15), 25);
        int int21 = testClass1_0.add((int) (short) 0, (int) ' ');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (-9));
        int int18 = testClass1_0.add((int) (short) 0, 54);
        int int21 = testClass1_0.add(17, (-35));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        int int33 = testClass1_0.add((-1), (-23));
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) (byte) 10, (-23));
        int int21 = testClass1_0.add(3, (int) (byte) 10);
        int int24 = testClass1_0.add((-1), 14);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(11, (int) (short) -1);
        int int24 = testClass1_0.add((-24), 5);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-10) + "'", int21 == (-10));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        int int21 = testClass1_0.add((-50), (int) (short) 1);
        int int24 = testClass1_0.add(97, 7);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-49) + "'", int21 == (-49));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        int int33 = testClass1_0.add(14, 50);
        java.lang.Class<?> wildcardClass34 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(98, 5);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20 + "'", int21 == 20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-15), 25);
        int int21 = testClass1_0.add((int) (short) 0, (int) ' ');
        int int24 = testClass1_0.add((-10), (-96));
        int int27 = testClass1_0.add(9, (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(18, (-6));
        int int18 = testClass1_0.add(0, 98);
        int int21 = testClass1_0.add((-48), (-12));
        int int24 = testClass1_0.add(33, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add((-11), 34);
        int int15 = testClass1_0.add(51, (-32));
        int int18 = testClass1_0.add(4, 27);
        int int21 = testClass1_0.add((-36), (int) ' ');
        int int24 = testClass1_0.add(8, (-24));
        int int27 = testClass1_0.add(7, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-3), 102);
        int int15 = testClass1_0.add(26, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
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
        int int33 = testClass1_0.add(37, (-26));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((int) (short) 0, (-10));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(51, 36);
        int int12 = testClass1_0.add((-35), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-9), (-24));
        int int18 = testClass1_0.add((-51), (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-4) + "'", int18 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add(100, 10);
        int int21 = testClass1_0.add((int) (short) -1, 51);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(0, 21);
        int int12 = testClass1_0.add((int) (byte) -1, (int) '4');
        int int15 = testClass1_0.add(100, (-18));
        int int18 = testClass1_0.add((-18), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add((-7), 3);
        int int27 = testClass1_0.add(51, (int) '4');
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
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-11), (-8));
        int int18 = testClass1_0.add((-2), (-9));
        int int21 = testClass1_0.add(11, 100);
        int int24 = testClass1_0.add((-33), 25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-5), (-11));
        int int21 = testClass1_0.add(102, (-24));
        int int24 = testClass1_0.add(101, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-3) + "'", int24 == (-3));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(100, 102);
        int int18 = testClass1_0.add(2, 1);
        int int21 = testClass1_0.add(97, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add(0, 6);
        int int18 = testClass1_0.add((int) (short) 10, (-101));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        int int33 = testClass1_0.add(54, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add((int) (byte) 0, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((-20), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add((-48), 101);
        int int18 = testClass1_0.add((-51), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(100, (-11));
        int int24 = testClass1_0.add(101, (-7));
        int int27 = testClass1_0.add(0, 17);
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add((-97), (int) (short) 1);
        int int18 = testClass1_0.add((-31), (-31));
        int int21 = testClass1_0.add(15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = testClass1_0.add(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
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
        int int30 = testClass1_0.add((-50), (-18));
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((int) (short) 0, (int) (byte) -1);
        int int18 = testClass1_0.add(6, (-11));
        int int21 = testClass1_0.add((-10), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((int) (byte) 10, 4);
        int int24 = testClass1_0.add((-101), 33);
        int int27 = testClass1_0.add((int) 'a', 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add(97, 11);
        int int21 = testClass1_0.add((-20), (int) (byte) 1);
        int int24 = testClass1_0.add(17, (-9));
        int int27 = testClass1_0.add(1, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19) + "'", int21 == (-19));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 0, (-24));
        int int18 = testClass1_0.add(54, (int) 'a');
        int int21 = testClass1_0.add((int) (short) 10, 101);
        int int24 = testClass1_0.add((-25), (-51));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(22, 8);
        int int18 = testClass1_0.add((int) (short) 0, 9);
        int int21 = testClass1_0.add((-99), 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((-12), (int) (byte) -1);
        int int21 = testClass1_0.add(25, 35);
        int int24 = testClass1_0.add((int) 'a', 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 100, 35);
        int int18 = testClass1_0.add((-6), (-8));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = testClass1_0.add((-18), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add((-2), 34);
        int int18 = testClass1_0.add(22, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(33, 11);
        int int18 = testClass1_0.add(4, 10);
        int int21 = testClass1_0.add((-10), 21);
        int int24 = testClass1_0.add(98, (-96));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(3, (-1));
        int int9 = testClass1_0.add((-50), 3);
        int int12 = testClass1_0.add((-95), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-2) + "'", int6 == (-2));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-15) + "'", int9 == (-15));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-12) + "'", int12 == (-12));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        int int30 = testClass1_0.add((-18), (int) (short) 10);
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), 98);
        int int21 = testClass1_0.add((-31), (-35));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(100, (-12));
        int int21 = testClass1_0.add(14, 98);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-7) + "'", int18 == (-7));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(14, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        int int30 = testClass1_0.add(13, (-6));
        int int33 = testClass1_0.add((-2), (-95));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add((-2), (int) '#');
        int int27 = testClass1_0.add(34, 12);
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
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        // The following exception was thrown during execution in test generation
        try {
            int int36 = testClass1_0.add(11, 0);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-21) + "'", int30 == (-21));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add(17, (int) (byte) -1);
        int int18 = testClass1_0.add(25, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16) + "'", int15 == (-16));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int12 = testClass1_0.add(3, 49);
        int int15 = testClass1_0.add((-51), 25);
        int int18 = testClass1_0.add((-6), (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        int int30 = testClass1_0.add((-16), (-21));
        int int33 = testClass1_0.add(22, 8);
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        int int30 = testClass1_0.add((-99), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-4) + "'", int27 == (-4));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        int int30 = testClass1_0.add((-26), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-48) + "'", int24 == (-48));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-2) + "'", int27 == (-2));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27 + "'", int30 == 27);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add((-11), 25);
        int int18 = testClass1_0.add(0, (-18));
        int int21 = testClass1_0.add(36, 101);
        int int24 = testClass1_0.add((-23), 55);
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add(10, (-34));
        int int18 = testClass1_0.add(11, 2);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add((int) (short) 100, (-23));
        int int24 = testClass1_0.add(11, (-1));
        int int27 = testClass1_0.add(0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add(5, 5);
        int int15 = testClass1_0.add((-99), (-9));
        int int18 = testClass1_0.add((-21), (-51));
        int int21 = testClass1_0.add((-16), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((-31), (-20));
        int int24 = testClass1_0.add((-48), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(12, 36);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        int int30 = testClass1_0.add(4, 14);
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
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int33 = testClass1_0.add((int) (byte) 100, 25);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
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
        int int30 = testClass1_0.add(12, 35);
        int int33 = testClass1_0.add((int) ' ', 14);
        int int36 = testClass1_0.add((-33), (-96));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-10) + "'", int24 == (-10));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        int int33 = testClass1_0.add(53, (-97));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add((int) (byte) 100, (-51));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        int int33 = testClass1_0.add((-2), 37);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        int int33 = testClass1_0.add(97, (-98));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-12), 13);
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
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        int int21 = testClass1_0.add(101, 53);
        int int24 = testClass1_0.add((-19), 49);
        int int27 = testClass1_0.add((-18), (-53));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add(11, (int) 'a');
        int int24 = testClass1_0.add((int) '4', (int) (short) 1);
        int int27 = testClass1_0.add(2, (int) '4');
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
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int12 = testClass1_0.add((-9), 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((int) (short) -1, (int) 'a');
        int int15 = testClass1_0.add(51, 8);
        int int18 = testClass1_0.add((int) (byte) 100, (-7));
        int int21 = testClass1_0.add(0, (-8));
        int int24 = testClass1_0.add((-14), 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-13) + "'", int18 == (-13));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add(10, 36);
        int int18 = testClass1_0.add((-3), (int) (byte) -1);
        int int21 = testClass1_0.add(7, (-50));
        int int24 = testClass1_0.add(51, (-50));
        int int27 = testClass1_0.add(27, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(10, (int) (short) 10);
        int int18 = testClass1_0.add(18, (-99));
        int int21 = testClass1_0.add((-6), (-25));
        int int24 = testClass1_0.add(5, (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(97, 13);
        int int18 = testClass1_0.add(97, (-6));
        int int21 = testClass1_0.add(13, 54);
        int int24 = testClass1_0.add((-100), 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-15) + "'", int18 == (-15));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        int int36 = testClass1_0.add(9, (-2));
        int int39 = testClass1_0.add((-21), (-98));
        // The following exception was thrown during execution in test generation
        try {
            int int42 = testClass1_0.add((-17), 0);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-3) + "'", int36 == (-3));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (short) 1, (int) '#');
        int int18 = testClass1_0.add(3, (int) '4');
        int int21 = testClass1_0.add((-23), (int) '4');
        int int24 = testClass1_0.add(14, (-23));
        int int27 = testClass1_0.add((-11), 20);
        int int30 = testClass1_0.add((-34), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-2) + "'", int30 == (-2));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(102, (int) (short) -1);
        int int18 = testClass1_0.add(13, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-101) + "'", int15 == (-101));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(9, (int) (byte) -1);
        int int21 = testClass1_0.add(50, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-8) + "'", int18 == (-8));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add((-31), 6);
        int int27 = testClass1_0.add((int) 'a', (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-4) + "'", int24 == (-4));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-99), (-99));
        int int15 = testClass1_0.add((int) (byte) -1, 37);
        int int18 = testClass1_0.add(33, (-16));
        int int21 = testClass1_0.add((int) (byte) -1, (-13));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        int int36 = testClass1_0.add((-11), 34);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-7), 37);
        int int18 = testClass1_0.add(51, 35);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add(51, (int) (short) -1);
        int int9 = testClass1_0.add((int) ' ', (int) '#');
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add(97, 13);
        int int18 = testClass1_0.add((-5), 51);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 10, (-96));
        int int12 = testClass1_0.add(27, (-5));
        int int15 = testClass1_0.add((-32), (int) (byte) -1);
        int int18 = testClass1_0.add((-25), (-51));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-4) + "'", int12 == (-4));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(1, (int) (short) 10);
        int int18 = testClass1_0.add(21, (-24));
        int int21 = testClass1_0.add((-3), 35);
        int int24 = testClass1_0.add(1, 13);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 0, (int) 'a');
        int int15 = testClass1_0.add(4, 101);
        int int18 = testClass1_0.add(0, 21);
        int int21 = testClass1_0.add(0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add((-2), 101);
        int int18 = testClass1_0.add(5, 54);
        int int21 = testClass1_0.add((-101), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add(13, 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(8, (int) (short) 10);
        int int9 = testClass1_0.add((-99), (int) (short) 10);
        int int12 = testClass1_0.add((int) '#', 98);
        int int15 = testClass1_0.add(22, (-20));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-8) + "'", int9 == (-8));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((int) (short) 10, (-50));
        int int24 = testClass1_0.add((-10), (-13));
        int int27 = testClass1_0.add(27, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        int int36 = testClass1_0.add((int) (short) 100, (-26));
        int int39 = testClass1_0.add(35, 12);
        java.lang.Class<?> wildcardClass40 = testClass1_0.getClass();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-2) + "'", int36 == (-2));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add(100, 34);
        int int21 = testClass1_0.add(18, 102);
        int int24 = testClass1_0.add((int) (byte) 1, 35);
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
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add(53, (-50));
        int int21 = testClass1_0.add((int) (byte) 100, (int) (byte) -1);
        int int24 = testClass1_0.add(15, (-26));
        int int27 = testClass1_0.add((-8), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-99) + "'", int21 == (-99));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        int int36 = testClass1_0.add((-14), (-96));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(13, (int) (byte) 100);
        int int24 = testClass1_0.add(0, (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((-24), 11);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add((-16), (-12));
        int int15 = testClass1_0.add(51, 22);
        int int18 = testClass1_0.add((-49), (-96));
        int int21 = testClass1_0.add((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((int) '#', 3);
        int int15 = testClass1_0.add(10, (-23));
        int int18 = testClass1_0.add((-34), (-7));
        int int21 = testClass1_0.add(18, (-7));
        int int24 = testClass1_0.add(33, 101);
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(99, (-99));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
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
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(13, (-15));
        int int21 = testClass1_0.add((-25), 17);
        int int24 = testClass1_0.add(11, 27);
        int int27 = testClass1_0.add((int) '#', (-51));
        int int30 = testClass1_0.add(0, (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
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
        int int30 = testClass1_0.add(0, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-3) + "'", int21 == (-3));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        int int21 = testClass1_0.add((-23), 18);
        int int24 = testClass1_0.add(35, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (short) 0, 21);
        int int9 = testClass1_0.add(0, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
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
        int int36 = testClass1_0.add(34, (-1));
        int int39 = testClass1_0.add((-48), (-4));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-33) + "'", int36 == (-33));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 13 + "'", int39 == 13);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((-2), (int) (short) 10);
        int int12 = testClass1_0.add(8, (-12));
        int int15 = testClass1_0.add(13, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(0, 101);
        int int9 = testClass1_0.add(17, (-9));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((int) (short) -1, 101);
        int int15 = testClass1_0.add((-23), 54);
        int int18 = testClass1_0.add(0, (-49));
        int int21 = testClass1_0.add((-97), (int) (short) 100);
        int int24 = testClass1_0.add(50, (-52));
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
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(25, (-50));
        int int15 = testClass1_0.add((int) '4', (-10));
        int int18 = testClass1_0.add((-25), 13);
        int int21 = testClass1_0.add((-8), 33);
        int int24 = testClass1_0.add((int) '4', (int) (short) 1);
        int int27 = testClass1_0.add((int) (byte) 1, (int) (byte) 1);
        int int30 = testClass1_0.add((int) (byte) 10, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-4) + "'", int15 == (-4));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add(33, (-1));
        int int18 = testClass1_0.add((int) (byte) -1, (-101));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, 51);
        int int12 = testClass1_0.add((-2), (-3));
        int int15 = testClass1_0.add((-1), (-23));
        int int18 = testClass1_0.add((int) (short) -1, (-10));
        int int21 = testClass1_0.add(27, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 28 + "'", int21 == 28);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add((-7), 6);
        int int24 = testClass1_0.add(7, 13);
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
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((int) (short) 10, (int) (short) 100);
        int int18 = testClass1_0.add(21, (-11));
        int int21 = testClass1_0.add((-4), (-15));
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
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
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
        int int33 = testClass1_0.add((-15), (-6));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        int int30 = testClass1_0.add(35, 13);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add(0, 18);
        int int15 = testClass1_0.add(11, 9);
        int int18 = testClass1_0.add(35, (-18));
        int int21 = testClass1_0.add((-23), (-7));
        int int24 = testClass1_0.add((-50), (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        int int30 = testClass1_0.add(25, (-99));
        int int33 = testClass1_0.add((-17), (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        int int30 = testClass1_0.add((-24), (-98));
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
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(97, (int) (byte) 100);
        int int9 = testClass1_0.add(97, (-23));
        int int12 = testClass1_0.add((-8), 2);
        int int15 = testClass1_0.add((-96), 37);
        int int18 = testClass1_0.add((int) (byte) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3) + "'", int9 == (-3));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(1, 3);
        int int18 = testClass1_0.add((-15), 25);
        int int21 = testClass1_0.add((-12), 4);
        int int24 = testClass1_0.add((-8), 11);
        int int27 = testClass1_0.add(13, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add((-16), (-101));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(51, (-99));
        int int21 = testClass1_0.add((-20), 34);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add(97, 11);
        int int21 = testClass1_0.add((-20), (int) (byte) 1);
        int int24 = testClass1_0.add(17, (-9));
        int int27 = testClass1_0.add((-8), 27);
        int int30 = testClass1_0.add((-6), 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19) + "'", int21 == (-19));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add((int) '#', 18);
        int int21 = testClass1_0.add((-10), 8);
        int int24 = testClass1_0.add((int) (short) 10, (-5));
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
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add(8, (-53));
        java.lang.Class<?> wildcardClass13 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
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
        int int30 = testClass1_0.add(98, 22);
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-4) + "'", int21 == (-4));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add((-101), (-6));
        int int24 = testClass1_0.add(21, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 17 + "'", int21 == 17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-20) + "'", int24 == (-20));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-96), (int) (byte) 100);
        int int15 = testClass1_0.add(0, (-8));
        int int18 = testClass1_0.add(10, 97);
        int int21 = testClass1_0.add(27, (-9));
        int int24 = testClass1_0.add(4, (-100));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) (byte) 1, 25);
        int int15 = testClass1_0.add(0, 8);
        int int18 = testClass1_0.add(50, 37);
        int int21 = testClass1_0.add(34, 21);
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
        int int30 = testClass1_0.add((int) '4', 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        int int39 = testClass1_0.add((-21), (-24));
        int int42 = testClass1_0.add(4, (-14));
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((int) '4', (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(20, 102);
        int int18 = testClass1_0.add(98, (-50));
        int int21 = testClass1_0.add(102, (-31));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
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
        int int42 = testClass1_0.add(50, (-100));
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 0, (int) (short) 10);
        int int6 = testClass1_0.add(2, (int) (byte) -1);
        int int9 = testClass1_0.add((int) (short) 0, (int) '4');
        int int12 = testClass1_0.add((int) '#', (-99));
        int int15 = testClass1_0.add((int) (byte) 100, 35);
        int int18 = testClass1_0.add((-6), (-8));
        int int21 = testClass1_0.add((-24), 4);
        int int24 = testClass1_0.add((-19), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-5) + "'", int21 == (-5));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add((-11), (int) 'a');
        int int15 = testClass1_0.add(7, 4);
        int int18 = testClass1_0.add((-1), (int) ' ');
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add(5, 13);
        int int21 = testClass1_0.add((int) (short) 10, (-98));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(18, (int) '#');
        int int21 = testClass1_0.add((-7), (-25));
        int int24 = testClass1_0.add(27, (-2));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, 25);
        int int12 = testClass1_0.add(3, 3);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) 100);
        int int18 = testClass1_0.add(51, 2);
        int int21 = testClass1_0.add(4, (int) '4');
        int int24 = testClass1_0.add((-21), (-48));
        int int27 = testClass1_0.add(54, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 26 + "'", int18 == 26);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((-99), 4);
        int int12 = testClass1_0.add(7, 51);
        int int15 = testClass1_0.add((-11), 4);
        int int18 = testClass1_0.add(21, (-34));
        int int21 = testClass1_0.add((-15), (int) '#');
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-23) + "'", int9 == (-23));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((-3), 10);
        int int15 = testClass1_0.add((-1), (-32));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((-49), (-11));
        int int21 = testClass1_0.add(19, 37);
        int int24 = testClass1_0.add(3, (-48));
        int int27 = testClass1_0.add(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add(0, (-50));
        int int18 = testClass1_0.add((int) 'a', 6);
        int int21 = testClass1_0.add(9, (int) '#');
        int int24 = testClass1_0.add(19, (-97));
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
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add((-7), 21);
        int int18 = testClass1_0.add(98, 27);
        int int21 = testClass1_0.add((-20), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(102, (-6));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-16) + "'", int15 == (-16));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add((-1), (-1));
        int int18 = testClass1_0.add((int) (short) 1, 102);
        int int21 = testClass1_0.add((int) (byte) 1, (-24));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((-2), 49);
        int int18 = testClass1_0.add(97, 11);
        int int21 = testClass1_0.add((-20), (int) (byte) 1);
        int int24 = testClass1_0.add(17, (-9));
        int int27 = testClass1_0.add(17, (-33));
        java.lang.Class<?> wildcardClass28 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-19) + "'", int21 == (-19));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        int int33 = testClass1_0.add(7, 4);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
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
        // The following exception was thrown during execution in test generation
        try {
            int int30 = testClass1_0.add(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-50) + "'", int6 == (-50));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-36) + "'", int21 == (-36));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-14) + "'", int24 == (-14));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        int int36 = testClass1_0.add(35, (-3));
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-10) + "'", int36 == (-10));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(33, (-10));
        int int15 = testClass1_0.add((int) 'a', 34);
        int int18 = testClass1_0.add((-18), (-97));
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-2) + "'", int12 == (-2));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) -1, 34);
        int int21 = testClass1_0.add((-14), (-9));
        int int24 = testClass1_0.add((int) (byte) 10, (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 33 + "'", int15 == 33);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(101, 97);
        int int15 = testClass1_0.add(2, 2);
        int int18 = testClass1_0.add((int) (byte) 0, 100);
        int int21 = testClass1_0.add((-4), 11);
        int int24 = testClass1_0.add(37, (-98));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (short) 100, (-1));
        int int12 = testClass1_0.add((-1), (int) (byte) -1);
        int int15 = testClass1_0.add(21, (int) (short) 100);
        int int18 = testClass1_0.add(53, (int) (short) 1);
        int int21 = testClass1_0.add(4, (-24));
        int int24 = testClass1_0.add(53, 3);
        int int27 = testClass1_0.add((-13), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-99) + "'", int9 == (-99));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 18 + "'", int24 == 18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        int int30 = testClass1_0.add((-1), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(100, (int) ' ');
        int int12 = testClass1_0.add(53, 102);
        int int15 = testClass1_0.add((int) (byte) 100, (int) (short) 100);
        int int18 = testClass1_0.add(18, (int) '#');
        int int21 = testClass1_0.add((-7), (-25));
        int int24 = testClass1_0.add(27, (-2));
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-12) + "'", int24 == (-12));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
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
        int int33 = testClass1_0.add((-101), (-33));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, 5);
        int int18 = testClass1_0.add(22, (-24));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
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
        int int39 = testClass1_0.add(98, 55);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-4) + "'", int36 == (-4));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) (byte) 10, 5);
        int int6 = testClass1_0.add(0, 10);
        int int9 = testClass1_0.add(100, (-18));
        java.lang.Class<?> wildcardClass10 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-4) + "'", int9 == (-4));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        int int30 = testClass1_0.add(17, (-15));
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
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add(13, 55);
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
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(3, (int) (byte) 100);
        int int6 = testClass1_0.add(18, (int) (byte) 10);
        int int9 = testClass1_0.add(102, (-96));
        int int12 = testClass1_0.add((int) (short) -1, (-97));
        int int15 = testClass1_0.add((-20), (-9));
        int int18 = testClass1_0.add(49, 37);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add((int) (byte) 100, 2);
        int int12 = testClass1_0.add(100, (int) '4');
        int int15 = testClass1_0.add(1, 4);
        int int18 = testClass1_0.add(13, 8);
        int int21 = testClass1_0.add(8, 100);
        int int24 = testClass1_0.add(1, (-49));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add((-96), 100);
        int int15 = testClass1_0.add((-18), (-1));
        int int18 = testClass1_0.add((-98), (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(98, 12);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(100, (int) (short) 10);
        int int21 = testClass1_0.add((int) (byte) 10, (-34));
        int int24 = testClass1_0.add((-24), 11);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = testClass1_0.add(5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 11 + "'", int18 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add((-48), 101);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        int int30 = testClass1_0.add(10, 11);
        int int33 = testClass1_0.add(97, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-15) + "'", int33 == (-15));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add((int) '#', 21);
        int int15 = testClass1_0.add((int) (short) 100, (int) (byte) -1);
        int int18 = testClass1_0.add((int) ' ', (-24));
        int int21 = testClass1_0.add((-99), (-50));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-99) + "'", int15 == (-99));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(18, (-96));
        int int12 = testClass1_0.add(49, (-11));
        int int15 = testClass1_0.add(102, (-49));
        int int18 = testClass1_0.add((-11), 12);
        int int21 = testClass1_0.add((-53), (-9));
        java.lang.Class<?> wildcardClass22 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-3) + "'", int12 == (-3));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(4, (-96));
        int int12 = testClass1_0.add((-99), (-3));
        int int15 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
        int int18 = testClass1_0.add(33, (-11));
        int int21 = testClass1_0.add((-99), 3);
        int int24 = testClass1_0.add(0, (-12));
        int int27 = testClass1_0.add(22, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-2) + "'", int18 == (-2));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-32) + "'", int21 == (-32));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((-32), (int) (short) -1);
        int int15 = testClass1_0.add(33, (-1));
        int int18 = testClass1_0.add(51, 34);
        java.lang.Class<?> wildcardClass19 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-32) + "'", int15 == (-32));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        int int39 = testClass1_0.add((-99), (-7));
        int int42 = testClass1_0.add((int) (short) 1, (-99));
        int int45 = testClass1_0.add(1, 1);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
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
        java.lang.Class<?> wildcardClass31 = testClass1_0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
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
        int int30 = testClass1_0.add(54, 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 13 + "'", int24 == 13);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((-51), 5);
        int int18 = testClass1_0.add(12, (-51));
        int int21 = testClass1_0.add((-9), (-33));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-9) + "'", int15 == (-9));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(7, 21);
        int int9 = testClass1_0.add(0, (int) (byte) 1);
        int int12 = testClass1_0.add((int) 'a', 102);
        int int15 = testClass1_0.add((-19), 8);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add((int) ' ', (int) ' ');
        int int15 = testClass1_0.add(3, (int) (short) -1);
        int int18 = testClass1_0.add(3, 2);
        int int21 = testClass1_0.add(54, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-2) + "'", int15 == (-2));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) (byte) 10, (int) (short) 100);
        int int9 = testClass1_0.add(6, 5);
        int int12 = testClass1_0.add((-3), 102);
        int int15 = testClass1_0.add((-96), (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-95) + "'", int15 == (-95));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(36, (-99));
        int int6 = testClass1_0.add((int) (byte) 0, 21);
        int int9 = testClass1_0.add(5, 100);
        int int12 = testClass1_0.add(97, 6);
        int int15 = testClass1_0.add((int) (short) 1, 9);
        int int18 = testClass1_0.add((-10), (-23));
        int int21 = testClass1_0.add(18, 49);
        int int24 = testClass1_0.add(9, 1);
        int int27 = testClass1_0.add(101, (-23));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-3) + "'", int27 == (-3));
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) '4', (int) ' ');
        int int18 = testClass1_0.add((-49), 102);
        int int21 = testClass1_0.add((-12), 25);
        int int24 = testClass1_0.add((int) '4', (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-2) + "'", int24 == (-2));
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add(1, (int) ' ');
        int int15 = testClass1_0.add(0, (-99));
        int int18 = testClass1_0.add((int) (byte) 0, 4);
        int int21 = testClass1_0.add((int) (byte) -1, (-32));
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add(0, (-1));
        int int12 = testClass1_0.add((int) (byte) 100, 5);
        int int15 = testClass1_0.add((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 21 + "'", int12 == 21);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 98 + "'", int15 == 98);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add(97, (int) (short) 100);
        int int12 = testClass1_0.add(97, (int) ' ');
        int int15 = testClass1_0.add(97, (int) (byte) -1);
        int int18 = testClass1_0.add(101, 13);
        int int21 = testClass1_0.add(0, 8);
        int int24 = testClass1_0.add(2, 10);
        int int27 = testClass1_0.add(8, (-101));
        int int30 = testClass1_0.add(3, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-96) + "'", int15 == (-96));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add(51, (int) (byte) 100);
        int int6 = testClass1_0.add(17, 5);
        int int9 = testClass1_0.add((-9), (-1));
        int int12 = testClass1_0.add(0, 7);
        int int15 = testClass1_0.add((-24), 10);
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(10, 101);
        int int12 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int15 = testClass1_0.add((-96), (-3));
        int int18 = testClass1_0.add((int) (byte) 1, 21);
        int int21 = testClass1_0.add((int) 'a', (-23));
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
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        int int33 = testClass1_0.add(15, (int) (byte) 100);
        int int36 = testClass1_0.add(2, (-101));
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(0, 51);
        int int15 = testClass1_0.add((-96), (-2));
        int int18 = testClass1_0.add((-3), (-11));
        int int21 = testClass1_0.add(20, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
        int int9 = testClass1_0.add(100, (int) (byte) 1);
        int int12 = testClass1_0.add(97, 4);
        int int15 = testClass1_0.add((int) 'a', (int) (short) 100);
        int int18 = testClass1_0.add((int) (short) 0, (int) (byte) 10);
        int int21 = testClass1_0.add(13, (int) (byte) 100);
        int int24 = testClass1_0.add(7, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 101 + "'", int9 == 101);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 25 + "'", int12 == 25);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 25);
        int int12 = testClass1_0.add(0, (int) ' ');
        int int15 = testClass1_0.add((int) (byte) -1, (int) ' ');
        int int18 = testClass1_0.add(51, 97);
        int int21 = testClass1_0.add((-15), (-16));
        int int24 = testClass1_0.add(10, (-10));
        java.lang.Class<?> wildcardClass25 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add(0, 51);
        int int9 = testClass1_0.add(100, 51);
        int int12 = testClass1_0.add(34, 51);
        int int15 = testClass1_0.add(0, (-1));
        java.lang.Class<?> wildcardClass16 = testClass1_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
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
        int int39 = testClass1_0.add(26, (-100));
        int int42 = testClass1_0.add(97, 98);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((-96), (-1));
        int int9 = testClass1_0.add((int) (byte) -1, 5);
        int int12 = testClass1_0.add(0, (-1));
        int int15 = testClass1_0.add(17, (int) (short) 1);
        int int18 = testClass1_0.add((int) (short) -1, (-50));
        int int21 = testClass1_0.add(34, (-10));
        int int24 = testClass1_0.add((-48), 18);
        int int27 = testClass1_0.add((-100), (-33));
        int int30 = testClass1_0.add(36, (-25));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-96) + "'", int3 == (-96));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-2) + "'", int21 == (-2));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
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
        int int39 = testClass1_0.add((int) (short) 1, 35);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) ' ', (int) ' ');
        int int6 = testClass1_0.add((int) ' ', 36);
        int int9 = testClass1_0.add((-24), 13);
        int int12 = testClass1_0.add((-1), 34);
        int int15 = testClass1_0.add((-1), (-7));
        int int18 = testClass1_0.add(36, (-8));
        int int21 = testClass1_0.add((-25), (int) (short) -1);
        int int24 = testClass1_0.add(97, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-3) + "'", int18 == (-3));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 26 + "'", int21 == 26);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        TestClass1 testClass1_0 = new TestClass1();
        int int3 = testClass1_0.add((int) 'a', (-1));
        int int6 = testClass1_0.add((int) '#', (int) '#');
        int int9 = testClass1_0.add((-1), 10);
        int int12 = testClass1_0.add(0, 100);
        int int15 = testClass1_0.add((int) (byte) -1, 1);
        int int18 = testClass1_0.add((-23), (-96));
        int int21 = testClass1_0.add((int) (byte) -1, (int) (short) -1);
        int int24 = testClass1_0.add(12, 101);
        int int27 = testClass1_0.add((-19), (int) (short) 10);
        int int30 = testClass1_0.add(0, 26);
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
}


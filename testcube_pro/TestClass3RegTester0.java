import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClass3RegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test002");
        TestClass3 testClass3_0 = new TestClass3();
        java.lang.Class<?> wildcardClass1 = testClass3_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test003");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test004");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test005");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test006");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add(52, 10);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test007");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        java.lang.Class<?> wildcardClass4 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test008");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test009");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test010");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test011");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test012");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test013");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test014");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test015");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) '#', 0);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test016");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test017");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test018");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test019");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test020");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (short) 0, (int) '4');
        int int12 = testClass3_0.add((int) 'a', 97);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test021");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test022");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass3_0.add((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test023");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) 'a', 35);
        int int6 = testClass3_0.add((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test024");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (short) 0, (int) '4');
        int int12 = testClass3_0.add(0, 35);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test025");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add((int) (byte) 1, 35);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test026");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 1);
        int int15 = testClass3_0.add((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test027");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test028");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test029");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass3_0.add((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test030");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test031");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        int int18 = testClass3_0.add((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test032");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test033");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test034");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((-1), (int) '#');
        java.lang.Class<?> wildcardClass4 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test035");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add(52, 10);
        int int12 = testClass3_0.add((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test036");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass3_0.add(100, 0);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test037");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add(52, 0);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test038");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, 97);
        int int21 = testClass3_0.add(35, (int) '#');
        java.lang.Class<?> wildcardClass22 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test039");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass3_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass3_0.add((int) (short) -1, 52);
        int int15 = testClass3_0.add((int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test040");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add(100, (int) 'a');
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test041");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test042");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test043");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test044");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) '#', 97);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test045");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass3_0.add(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test046");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test047");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test048");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) 'a', (int) '4');
        int int15 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test049");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test050");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass4 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test051");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (short) 100, 1);
        int int15 = testClass3_0.add(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test052");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test053");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (short) 100, 1);
        int int18 = testClass3_0.add((int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test054");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add(0, (int) (byte) 1);
        int int18 = testClass3_0.add((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test055");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass3_0.add((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test056");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass3_0.add(100, 0);
        int int21 = testClass3_0.add((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test057");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        int int18 = testClass3_0.add((int) 'a', (int) (short) 1);
        int int21 = testClass3_0.add((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test058");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test059");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test060");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) 'a', (-1));
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test061");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass3_0.add(32, 10);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test062");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test063");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test064");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test065");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, 97);
        int int21 = testClass3_0.add(35, (int) '#');
        int int24 = testClass3_0.add(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test066");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, 0);
        int int9 = testClass3_0.add(35, (int) (short) 0);
        int int12 = testClass3_0.add((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test067");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add((-1), 52);
        int int15 = testClass3_0.add(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test068");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test069");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test070");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        java.lang.Class<?> wildcardClass10 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test071");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass3_0.add((int) (short) 100, 100);
        int int12 = testClass3_0.add((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test072");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (short) 0, (int) '4');
        int int12 = testClass3_0.add(0, 35);
        int int15 = testClass3_0.add(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test073");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) (short) 0, (int) '#');
        int int15 = testClass3_0.add((int) (byte) -1, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test074");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, (int) 'a');
        int int21 = testClass3_0.add((int) ' ', 1);
        java.lang.Class<?> wildcardClass22 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test075");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add(52, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test076");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add((int) (short) 1, (int) '4');
        int int18 = testClass3_0.add((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test077");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        int int18 = testClass3_0.add(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test078");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test079");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test080");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(35, (int) (byte) -1);
        int int12 = testClass3_0.add((int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test081");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 1);
        int int15 = testClass3_0.add((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test082");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) '#', 97);
        int int18 = testClass3_0.add((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test083");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass3_0.add(32, (int) ' ');
        int int21 = testClass3_0.add((int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test084");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) 'a', (-1));
        int int21 = testClass3_0.add(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test085");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test086");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (short) 0, (int) '4');
        int int12 = testClass3_0.add((int) 'a', 97);
        int int15 = testClass3_0.add(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test087");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add((int) (short) 1, (int) '4');
        int int18 = testClass3_0.add((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test088");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test089");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, (int) 'a');
        int int21 = testClass3_0.add((int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test090");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add((int) (short) 100, 1);
        int int18 = testClass3_0.add(97, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test091");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test092");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass3_0.add((int) (short) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test093");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test094");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass3_0.add(32, (int) ' ');
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test095");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (short) 100, 1);
        int int15 = testClass3_0.add(10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test096");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) '#', 97);
        int int18 = testClass3_0.add(0, (-1));
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test097");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test098");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass3_0.add(32, 10);
        int int15 = testClass3_0.add((int) ' ', (int) (short) 100);
        int int18 = testClass3_0.add((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test099");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) 'a', (-1));
        int int21 = testClass3_0.add((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test100");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((-1), 1);
        int int6 = testClass3_0.add((int) 'a', 0);
        java.lang.Class<?> wildcardClass7 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test101");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((-1), 1);
        int int6 = testClass3_0.add((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test102");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add((int) (byte) 10, 100);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test103");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add(0, (int) 'a');
        int int18 = testClass3_0.add((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test104");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) (short) -1, 32);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test105");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass3_0.add(97, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test106");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add((int) ' ', 1);
        int int18 = testClass3_0.add(1, 97);
        int int21 = testClass3_0.add(35, (int) '#');
        int int24 = testClass3_0.add((int) '#', 52);
        int int27 = testClass3_0.add((int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test107");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(0, 0);
        int int6 = testClass3_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass3_0.add((int) (short) 100, 100);
        int int12 = testClass3_0.add((int) '4', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test108");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add(0, (int) (byte) 1);
        int int18 = testClass3_0.add(32, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test109");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add((int) (byte) 10, 100);
        int int12 = testClass3_0.add((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test110");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(52, (int) (byte) 100);
        int int12 = testClass3_0.add((int) (byte) -1, 35);
        int int15 = testClass3_0.add(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test111");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(97, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test112");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) '4', (int) (short) 10);
        int int15 = testClass3_0.add((int) '#', 97);
        int int18 = testClass3_0.add((int) ' ', (int) (short) 10);
        int int21 = testClass3_0.add(1, (int) '#');
        int int24 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test113");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add(52, 0);
        int int9 = testClass3_0.add(32, (int) (byte) 10);
        int int12 = testClass3_0.add((int) ' ', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test114");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        int int18 = testClass3_0.add(0, 1);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test115");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass3_0.add(32, 10);
        int int15 = testClass3_0.add((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test116");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(35, (int) (byte) -1);
        int int12 = testClass3_0.add((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test117");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) '4', 0);
        int int6 = testClass3_0.add((int) (short) 10, 1);
        int int9 = testClass3_0.add((int) (byte) -1, 52);
        int int12 = testClass3_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass3_0.add(10, (int) (byte) 100);
        int int18 = testClass3_0.add((int) (short) 0, 32);
        java.lang.Class<?> wildcardClass19 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test118");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test119");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) '4', 0);
        int int9 = testClass3_0.add(10, 32);
        int int12 = testClass3_0.add((int) ' ', 0);
        int int15 = testClass3_0.add(35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test120");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) '4');
        int int9 = testClass3_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass3_0.add(32, 10);
        int int15 = testClass3_0.add((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass3_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test121");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add(100, (int) (byte) 1);
        int int6 = testClass3_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass3_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass3_0.add((int) (byte) 0, 1);
        int int15 = testClass3_0.add(0, 32);
        int int18 = testClass3_0.add((int) 'a', (-1));
        int int21 = testClass3_0.add(0, (-1));
        int int24 = testClass3_0.add(35, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test122");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass3_0.add(0, (int) (byte) 1);
        int int15 = testClass3_0.add(100, (int) 'a');
        int int18 = testClass3_0.add((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass3RegTester0.test123");
        TestClass3 testClass3_0 = new TestClass3();
        int int3 = testClass3_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass3_0.add(0, (int) (short) 1);
        int int9 = testClass3_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass3_0.add((int) (byte) 0, (int) (byte) 0);
        int int15 = testClass3_0.add((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClass2RegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test002");
        TestClass2 testClass2_0 = new TestClass2();
        java.lang.Class<?> wildcardClass1 = testClass2_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test003");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test004");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test005");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test006");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(52, 10);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test007");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test008");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test009");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test010");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test011");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test012");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
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
            System.out.format("%n%s%n", "TestClass2RegTester0.test013");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test014");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test015");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 0);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test016");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test017");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
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
            System.out.format("%n%s%n", "TestClass2RegTester0.test018");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (short) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test019");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test020");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) 'a', 97);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test021");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test022");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test023");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add(0, 35);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test024");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add((int) (byte) 1, 35);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test025");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test026");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test027");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test028");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test029");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test030");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), (int) '#');
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test031");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(52, 10);
        int int12 = testClass2_0.add((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test032");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test033");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add(52, 0);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test034");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
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
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test035");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (short) -1, 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test036");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test037");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test038");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add(0, (int) 'a');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test039");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test040");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test041");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test042");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test043");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test044");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test045");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test046");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test047");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test048");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test049");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test050");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test051");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test052");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test053");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add((int) (short) 1, (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test054");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, 0);
        int int9 = testClass2_0.add(35, (int) (short) 0);
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test055");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        int int15 = testClass2_0.add(35, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test056");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test057");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test058");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test059");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) ' ', 1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
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
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test060");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add((int) (short) 1, (int) '4');
        int int18 = testClass2_0.add((-1), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test061");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test062");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test063");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
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
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test064");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test065");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) 'a', 97);
        int int15 = testClass2_0.add(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test066");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add((int) (short) 1, (int) '4');
        int int18 = testClass2_0.add((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test067");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add(97, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test068");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test069");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test070");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test071");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add(0, (-1));
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test072");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) 'a', 0);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test073");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) (short) -1, 32);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test074");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test075");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test076");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(0, 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test077");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) (short) 0, 32);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test078");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test079");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add((int) ' ', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test080");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        int int15 = testClass2_0.add((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test081");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test082");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add((int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test083");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test084");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 1, 97);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test085");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test086");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add((int) ' ', (int) (short) 10);
        int int21 = testClass2_0.add(1, (int) '#');
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test087");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 10, 10);
        int int18 = testClass2_0.add((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test088");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test089");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        int int21 = testClass2_0.add((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test090");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) ' ', 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test091");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test092");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (short) -1, 52);
        int int15 = testClass2_0.add(100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test093");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add((int) ' ', (int) (short) 10);
        int int21 = testClass2_0.add(1, (int) '#');
        int int24 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test094");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test095");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test096");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test097");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 52);
        int int27 = testClass2_0.add((int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test098");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) 'a', 97);
        int int15 = testClass2_0.add(0, (int) (short) 1);
        int int18 = testClass2_0.add(35, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test099");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (byte) 1, 100);
        int int6 = testClass2_0.add((int) '#', 52);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test100");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test101");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test102");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) '4', 97);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test103");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(10, (int) (short) 0);
        int int18 = testClass2_0.add(35, (-1));
        int int21 = testClass2_0.add(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test104");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test105");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add(100, (int) '4');
        int int15 = testClass2_0.add((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test106");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test107");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(0, (int) (short) 100);
        int int21 = testClass2_0.add((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test108");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, 0);
        int int6 = testClass2_0.add((int) '#', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test109");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (byte) 1, 100);
        int int6 = testClass2_0.add((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test110");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int21 = testClass2_0.add((int) (short) 0, (-1));
        int int24 = testClass2_0.add((int) '#', (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test111");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add(0, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test112");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) (short) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test113");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(35, (int) 'a');
        int int21 = testClass2_0.add(0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test114");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) 'a', 35);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test115");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (byte) 1, 100);
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test116");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test117");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 10, (int) (byte) 0);
        int int21 = testClass2_0.add((int) ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test118");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test119");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) (short) -1, 32);
        int int21 = testClass2_0.add((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test120");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add(0, 35);
        int int15 = testClass2_0.add(10, (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test121");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(52, 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test122");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test123");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test124");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test125");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 10, 10);
        int int18 = testClass2_0.add((int) 'a', (int) (byte) 1);
        int int21 = testClass2_0.add((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test126");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        int int24 = testClass2_0.add((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test127");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test128");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test129");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test130");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test131");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) '4');
        int int9 = testClass2_0.add(52, (-1));
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test132");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(0, 1);
        int int21 = testClass2_0.add(10, (int) (short) 1);
        int int24 = testClass2_0.add(100, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test133");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 52);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test134");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        int int21 = testClass2_0.add((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test135");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add((int) ' ', (int) (short) 100);
        int int18 = testClass2_0.add((int) (byte) 1, 32);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test136");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test137");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add(35, (int) ' ');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test138");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, 0);
        int int6 = testClass2_0.add((int) (short) 10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test139");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) (short) 0, (int) '#');
        int int15 = testClass2_0.add((-1), (int) (byte) 0);
        int int18 = testClass2_0.add((int) (short) 0, 52);
        int int21 = testClass2_0.add((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test140");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) (short) 0, (int) '#');
        int int15 = testClass2_0.add((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test141");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int21 = testClass2_0.add((int) (short) 0, (-1));
        int int24 = testClass2_0.add((int) '#', (int) (byte) 0);
        int int27 = testClass2_0.add((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test142");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) '4');
        int int9 = testClass2_0.add(52, (-1));
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test143");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test144");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test145");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test146");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(97, 0);
        int int15 = testClass2_0.add(35, (int) '4');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test147");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add(32, 97);
        int int21 = testClass2_0.add(35, 35);
        int int24 = testClass2_0.add((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test148");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(10, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test149");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test150");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 52);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test151");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test152");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(52, 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test153");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(52, 10);
        int int12 = testClass2_0.add((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test154");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, 0);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test155");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test156");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) (short) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test157");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 0);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test158");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (short) -1, 52);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test159");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add(1, (int) (short) -1);
        int int12 = testClass2_0.add(0, 97);
        int int15 = testClass2_0.add((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test160");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test161");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        int int21 = testClass2_0.add((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test162");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        int int21 = testClass2_0.add((-1), 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test163");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add(32, 97);
        int int21 = testClass2_0.add(35, 35);
        int int24 = testClass2_0.add(10, (int) 'a');
        int int27 = testClass2_0.add((int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test164");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) (short) -1, 32);
        int int21 = testClass2_0.add(97, 0);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test165");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int15 = testClass2_0.add((int) (short) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test166");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add(0, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 1, (int) '#');
        int int21 = testClass2_0.add(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test167");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 100, 100);
        int int18 = testClass2_0.add((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test168");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add((-1), 0);
        int int18 = testClass2_0.add((int) '4', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test169");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test170");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test171");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 0);
        int int15 = testClass2_0.add(1, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test172");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test173");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(0, (-1));
        int int12 = testClass2_0.add((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test174");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) ' ', 1);
        int int24 = testClass2_0.add((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test175");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), (int) '#');
        int int6 = testClass2_0.add((int) '4', (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test176");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) 0, (int) '4');
        int int21 = testClass2_0.add((int) (short) 0, (int) (short) 10);
        int int24 = testClass2_0.add((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test177");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test178");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add(0, (int) 'a');
        int int21 = testClass2_0.add((int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test179");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        int int24 = testClass2_0.add(52, 35);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test180");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add(10, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test181");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(97, (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test182");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int15 = testClass2_0.add((int) (byte) 0, (int) '4');
        int int18 = testClass2_0.add((int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test183");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add(35, (-1));
        int int15 = testClass2_0.add(52, 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test184");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        int int15 = testClass2_0.add(1, 97);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test185");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 100);
        int int18 = testClass2_0.add(35, (int) ' ');
        int int21 = testClass2_0.add((int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test186");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add(52, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test187");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        int int24 = testClass2_0.add((int) '#', 0);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test188");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add((-1), 0);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test189");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add((int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test190");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        int int27 = testClass2_0.add(32, (int) ' ');
        int int30 = testClass2_0.add((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass31 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test191");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 10, 10);
        int int18 = testClass2_0.add((int) 'a', (int) (byte) 1);
        int int21 = testClass2_0.add((int) '4', (int) (short) 1);
        int int24 = testClass2_0.add((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test192");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (short) -1, 52);
        int int15 = testClass2_0.add(0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test193");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add(35, (-1));
        int int15 = testClass2_0.add(10, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test194");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) ' ', 1);
        int int24 = testClass2_0.add(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test195");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) (short) 0, (int) '#');
        int int15 = testClass2_0.add((-1), (int) (byte) 0);
        int int18 = testClass2_0.add((int) (short) 0, 52);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test196");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(0, 1);
        int int21 = testClass2_0.add(10, (int) (short) 1);
        int int24 = testClass2_0.add(100, (int) (short) 10);
        int int27 = testClass2_0.add((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test197");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int18 = testClass2_0.add((-1), 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test198");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add(1, (int) (short) -1);
        int int12 = testClass2_0.add((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test199");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(10, (int) (short) 0);
        int int18 = testClass2_0.add(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test200");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        int int27 = testClass2_0.add(32, (int) ' ');
        int int30 = testClass2_0.add((int) '4', 52);
        int int33 = testClass2_0.add(0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test201");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (byte) 1, 100);
        int int6 = testClass2_0.add(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test202");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        int int21 = testClass2_0.add((int) (byte) 1, (-1));
        int int24 = testClass2_0.add((int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test203");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add((int) ' ', (int) (short) 100);
        int int18 = testClass2_0.add((int) (byte) 1, 32);
        int int21 = testClass2_0.add(32, 100);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test204");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 52);
        int int27 = testClass2_0.add((int) (short) 10, (int) 'a');
        int int30 = testClass2_0.add((int) (short) 0, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 52 + "'", int30 == 52);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test205");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test206");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        int int15 = testClass2_0.add(97, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test207");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        int int27 = testClass2_0.add(32, (int) ' ');
        java.lang.Class<?> wildcardClass28 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test208");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) 1, 0);
        int int12 = testClass2_0.add((int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test209");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test210");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test211");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add(97, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test212");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test213");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 32);
        int int27 = testClass2_0.add(97, (int) (short) 1);
        int int30 = testClass2_0.add(35, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test214");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (short) -1, 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 10);
        int int18 = testClass2_0.add((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test215");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        int int21 = testClass2_0.add((int) (short) -1, 0);
        int int24 = testClass2_0.add((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test216");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 32);
        int int27 = testClass2_0.add(97, (int) (short) 1);
        int int30 = testClass2_0.add((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test217");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 52);
        int int15 = testClass2_0.add((-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test218");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test219");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add((-1), (int) ' ');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test220");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test221");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add((int) ' ', (int) (short) 10);
        int int21 = testClass2_0.add(1, (int) '#');
        int int24 = testClass2_0.add((int) (byte) -1, 100);
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
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test222");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        int int21 = testClass2_0.add(97, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test223");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 1, (int) '#');
        int int12 = testClass2_0.add((int) 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test224");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add(0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test225");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 32);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test226");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 32);
        int int24 = testClass2_0.add((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test227");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        int int24 = testClass2_0.add(52, 35);
        int int27 = testClass2_0.add((int) 'a', (int) '#');
        int int30 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test228");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test229");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(52, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test230");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) -1, (int) 'a');
        int int21 = testClass2_0.add((int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test231");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add(0, (int) (short) 10);
        int int15 = testClass2_0.add(1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test232");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add((int) (short) 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test233");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, (int) '4');
        int int6 = testClass2_0.add((int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test234");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 10);
        int int18 = testClass2_0.add(52, (-1));
        int int21 = testClass2_0.add((int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test235");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, 0);
        int int9 = testClass2_0.add(35, (int) (short) 0);
        int int12 = testClass2_0.add((int) (byte) 0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 100, 0);
        int int18 = testClass2_0.add(32, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test236");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test237");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) 'a', 97);
        int int15 = testClass2_0.add((int) 'a', (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test238");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(0, (int) (short) 100);
        int int21 = testClass2_0.add((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test239");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test240");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (short) -1, (int) (byte) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) 'a');
        int int18 = testClass2_0.add((int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test241");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (short) -1, 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test242");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add(10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test243");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add(0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test244");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (short) 1, (int) (byte) 1);
        int int12 = testClass2_0.add(0, (int) 'a');
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test245");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add(100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test246");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add(52, (int) 'a');
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test247");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, 0);
        int int9 = testClass2_0.add(35, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test248");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (short) 1, (int) (byte) 1);
        int int12 = testClass2_0.add((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test249");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 10);
        int int18 = testClass2_0.add(0, 100);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test250");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) (byte) -1, (int) (short) 0);
        int int18 = testClass2_0.add((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test251");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        int int24 = testClass2_0.add((int) '#', 0);
        int int27 = testClass2_0.add(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test252");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (byte) -1, (int) (short) -1);
        int int18 = testClass2_0.add(1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test253");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int18 = testClass2_0.add(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test254");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(52, 1);
        int int15 = testClass2_0.add(0, 32);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test255");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (short) 1, (int) (byte) 1);
        int int12 = testClass2_0.add((int) (byte) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test256");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        int int24 = testClass2_0.add(52, 35);
        int int27 = testClass2_0.add((int) 'a', (int) '#');
        int int30 = testClass2_0.add(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test257");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) (short) 0, (int) '#');
        int int15 = testClass2_0.add((int) (byte) -1, 35);
        int int18 = testClass2_0.add(10, 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test258");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add(0, (int) (byte) 0);
        int int24 = testClass2_0.add((int) 'a', (int) (short) 0);
        int int27 = testClass2_0.add((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass28 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test259");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        int int21 = testClass2_0.add((int) (byte) 10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test260");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(97, (-1));
        int int12 = testClass2_0.add(97, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test261");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(0, (int) (short) 1);
        int int18 = testClass2_0.add((int) (short) -1, (int) ' ');
        int int21 = testClass2_0.add(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test262");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add((int) ' ', 100);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test263");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((-1), (int) (short) 10);
        int int15 = testClass2_0.add(52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test264");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        int int12 = testClass2_0.add(32, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test265");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) (short) 0, 32);
        int int21 = testClass2_0.add((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test266");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test267");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) ' ', 1);
        int int24 = testClass2_0.add((int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test268");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test269");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) 'a');
        int int9 = testClass2_0.add(52, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test270");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add((int) '4', 52);
        int int21 = testClass2_0.add(1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test271");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 100);
        int int18 = testClass2_0.add(35, (int) ' ');
        int int21 = testClass2_0.add((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test272");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add(52, 1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test273");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(52, 97);
        int int18 = testClass2_0.add(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test274");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(52, 97);
        int int18 = testClass2_0.add(10, 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test275");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add(1, (int) (short) -1);
        int int12 = testClass2_0.add((int) (short) 10, 52);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test276");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(32, (int) ' ');
        int int21 = testClass2_0.add((int) (byte) 1, (-1));
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test277");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(52, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test278");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 32);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test279");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add((int) ' ', 100);
        int int21 = testClass2_0.add((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test280");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add(32, 97);
        int int21 = testClass2_0.add(35, 35);
        int int24 = testClass2_0.add((int) (short) 10, 0);
        int int27 = testClass2_0.add(100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test281");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add(0, (-1));
        int int21 = testClass2_0.add((int) (byte) -1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test282");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) 'a', 97);
        int int15 = testClass2_0.add((int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test283");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(0, (-1));
        int int24 = testClass2_0.add(35, 35);
        int int27 = testClass2_0.add(35, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test284");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 0);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 1);
        int int18 = testClass2_0.add((int) (byte) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test285");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(52, 100);
        int int18 = testClass2_0.add((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test286");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (short) -1, (int) (byte) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 0, 100);
        int int21 = testClass2_0.add((int) 'a', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test287");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(10, (int) (short) 0);
        int int18 = testClass2_0.add(35, (-1));
        int int21 = testClass2_0.add((int) (byte) 0, (int) (short) 10);
        int int24 = testClass2_0.add(100, 35);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test288");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(0, (-1));
        int int24 = testClass2_0.add(35, 35);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test289");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((-1), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test290");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(97, (-1));
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test291");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(100, 1);
        int int24 = testClass2_0.add(52, 35);
        int int27 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test292");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add((-1), 52);
        int int15 = testClass2_0.add((int) (byte) 0, (int) (byte) 100);
        int int18 = testClass2_0.add(35, (int) ' ');
        int int21 = testClass2_0.add((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test293");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add(0, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) 1, (int) '#');
        int int21 = testClass2_0.add((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test294");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        int int15 = testClass2_0.add(1, 97);
        int int18 = testClass2_0.add((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test295");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test296");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test297");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (short) 0, (int) '4');
        int int12 = testClass2_0.add((int) (byte) 100, (int) (short) -1);
        int int15 = testClass2_0.add((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test298");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add(0, (int) (byte) 0);
        int int24 = testClass2_0.add((int) 'a', (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test299");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test300");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test301");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add(0, (-1));
        int int24 = testClass2_0.add((-1), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test302");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass10 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test303");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test304");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) -1, (int) 'a');
        int int21 = testClass2_0.add(1, 35);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test305");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 10, 10);
        int int18 = testClass2_0.add((int) 'a', (int) (byte) 1);
        int int21 = testClass2_0.add((int) '4', (int) (short) 1);
        int int24 = testClass2_0.add(32, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test306");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) (short) 0, (int) '#');
        int int15 = testClass2_0.add((-1), (int) (byte) 0);
        int int18 = testClass2_0.add((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test307");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) 'a', (-1));
        int int21 = testClass2_0.add((int) (byte) 0, 1);
        int int24 = testClass2_0.add((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test308");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((-1), (int) (short) -1);
        int int9 = testClass2_0.add(1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test309");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(0, 1);
        int int21 = testClass2_0.add(10, (int) (short) 1);
        int int24 = testClass2_0.add(10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test310");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add(35, (int) '#');
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test311");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (short) -1, (int) (byte) 10);
        int int15 = testClass2_0.add((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test312");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add(35, (int) ' ');
        int int18 = testClass2_0.add((int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test313");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test314");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        int int27 = testClass2_0.add(32, (int) ' ');
        int int30 = testClass2_0.add((int) (byte) 0, 10);
        int int33 = testClass2_0.add((-1), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test315");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        int int15 = testClass2_0.add(1, 97);
        int int18 = testClass2_0.add((-1), 0);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test316");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (byte) 1, 100);
        int int6 = testClass2_0.add((int) '#', 52);
        int int9 = testClass2_0.add((-1), 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test317");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) '4', (int) (byte) 100);
        int int15 = testClass2_0.add(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test318");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test319");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) '#', 97);
        int int18 = testClass2_0.add(0, (-1));
        int int21 = testClass2_0.add(97, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test320");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int9 = testClass2_0.add((int) (short) 100, 100);
        int int12 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int15 = testClass2_0.add((int) (short) 100, (int) (short) -1);
        int int18 = testClass2_0.add((int) (short) 100, (int) (byte) 100);
        int int21 = testClass2_0.add((int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test321");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (byte) 10, 1);
        int int21 = testClass2_0.add(0, (int) (byte) 0);
        int int24 = testClass2_0.add((int) 'a', (int) (short) 0);
        int int27 = testClass2_0.add((int) 'a', (int) (short) 1);
        int int30 = testClass2_0.add((int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test322");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((int) (short) 100, 97);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test323");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add(100, (int) 'a');
        int int18 = testClass2_0.add(0, (int) 'a');
        int int21 = testClass2_0.add(35, 10);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test324");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(0, 1);
        int int21 = testClass2_0.add(10, (int) (short) 1);
        int int24 = testClass2_0.add((-1), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test325");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, 1);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add((int) '4', 52);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test326");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) 'a', 35);
        int int6 = testClass2_0.add((int) (byte) 100, (int) (byte) 10);
        int int9 = testClass2_0.add((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test327");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add(35, (int) 'a');
        int int21 = testClass2_0.add((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test328");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, (int) 'a');
        int int21 = testClass2_0.add((int) ' ', 1);
        int int24 = testClass2_0.add(52, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test329");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 1, (int) (byte) 10);
        int int9 = testClass2_0.add(10, 0);
        int int12 = testClass2_0.add((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass13 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test330");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add((int) (short) 0, (int) '4');
        int int21 = testClass2_0.add((int) (short) 0, (int) (short) 10);
        int int24 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test331");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test332");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (short) 100, 1);
        int int18 = testClass2_0.add((-1), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test333");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add(52, (int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test334");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(0, (-1));
        int int12 = testClass2_0.add((int) ' ', (int) (short) 100);
        int int15 = testClass2_0.add((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test335");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add((int) ' ', (int) (short) 100);
        int int18 = testClass2_0.add(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test336");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, (int) '4');
        java.lang.Class<?> wildcardClass4 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test337");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(52, 10);
        int int12 = testClass2_0.add((-1), (int) (byte) 1);
        int int15 = testClass2_0.add((int) 'a', (int) (byte) 100);
        int int18 = testClass2_0.add((int) (short) 1, 52);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test338");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(97, (-1));
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test339");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add(32, 97);
        int int21 = testClass2_0.add((int) (byte) -1, (-1));
        int int24 = testClass2_0.add((int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test340");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 1);
        int int15 = testClass2_0.add((int) (short) 10, (int) (short) 10);
        int int18 = testClass2_0.add((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test341");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test342");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add((int) (byte) 10, 100);
        int int12 = testClass2_0.add((int) (short) -1, (int) (byte) 10);
        int int15 = testClass2_0.add((int) (short) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test343");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(0, 0);
        int int6 = testClass2_0.add(32, (int) (short) 1);
        int int9 = testClass2_0.add(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test344");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) '4');
        int int9 = testClass2_0.add(32, (int) 'a');
        int int12 = testClass2_0.add(35, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test345");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(97, (int) '4');
        int int21 = testClass2_0.add(1, 100);
        int int24 = testClass2_0.add((int) '4', 97);
        java.lang.Class<?> wildcardClass25 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test346");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add(0, (-1));
        int int12 = testClass2_0.add((int) ' ', (int) (short) 100);
        int int15 = testClass2_0.add(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test347");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        int int12 = testClass2_0.add(0, (int) (byte) 1);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) 0);
        int int18 = testClass2_0.add(52, (int) (short) 1);
        java.lang.Class<?> wildcardClass19 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test348");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((-1), 1);
        int int6 = testClass2_0.add((int) '4', (int) '4');
        int int9 = testClass2_0.add((int) '#', 10);
        int int12 = testClass2_0.add((-1), 32);
        int int15 = testClass2_0.add((int) (byte) 0, 35);
        int int18 = testClass2_0.add(35, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test349");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        int int15 = testClass2_0.add(10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test350");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add((int) (byte) 100, (int) (short) 1);
        int int12 = testClass2_0.add((int) (byte) 0, 1);
        int int15 = testClass2_0.add(0, 32);
        int int18 = testClass2_0.add((int) (short) -1, 32);
        int int21 = testClass2_0.add((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test351");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (byte) 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test352");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) '#', (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test353");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, (int) (byte) 1);
        int int6 = testClass2_0.add(0, (int) (short) 1);
        int int9 = testClass2_0.add((int) (byte) 100, (int) (byte) 0);
        int int12 = testClass2_0.add((-1), (int) (short) 10);
        int int15 = testClass2_0.add(100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test354");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((-1), (int) (short) -1);
        int int9 = testClass2_0.add((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test355");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) '#', 0);
        int int15 = testClass2_0.add(1, (int) (short) 10);
        int int18 = testClass2_0.add((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test356");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add(97, (int) 'a');
        int int27 = testClass2_0.add(35, 0);
        int int30 = testClass2_0.add((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 35 + "'", int30 == 35);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test357");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) (byte) -1, (int) (short) 0);
        int int18 = testClass2_0.add((-1), (int) (short) 10);
        int int21 = testClass2_0.add((int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test358");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) 'a', (int) '4');
        int int15 = testClass2_0.add((int) (byte) 1, (int) (short) 100);
        int int18 = testClass2_0.add((int) 'a', 100);
        int int21 = testClass2_0.add((int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test359");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) ' ');
        int int9 = testClass2_0.add(10, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test360");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(32, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test361");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(52, 100);
        int int18 = testClass2_0.add((int) (short) 1, 35);
        int int21 = testClass2_0.add(100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test362");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(52, 100);
        int int18 = testClass2_0.add((int) (short) 0, (int) (byte) 0);
        int int21 = testClass2_0.add((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass22 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test363");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add((int) (short) 10, 1);
        int int9 = testClass2_0.add((int) (byte) -1, 52);
        int int12 = testClass2_0.add((int) (byte) 10, (int) (byte) 1);
        int int15 = testClass2_0.add(10, (int) (byte) 100);
        int int18 = testClass2_0.add((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test364");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) 'a', 35);
        int int6 = testClass2_0.add((int) (byte) 100, (int) (byte) 10);
        int int9 = testClass2_0.add((int) (byte) 0, (int) (byte) 0);
        int int12 = testClass2_0.add((int) (short) 0, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test365");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(35, (int) (byte) -1);
        int int12 = testClass2_0.add((int) (byte) 100, 100);
        int int15 = testClass2_0.add((-1), (int) (short) 1);
        int int18 = testClass2_0.add((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test366");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add((int) (byte) 1, (int) (byte) -1);
        int int18 = testClass2_0.add(100, 0);
        int int21 = testClass2_0.add((int) (short) -1, 0);
        int int24 = testClass2_0.add(0, 35);
        int int27 = testClass2_0.add(35, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test367");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(10, 32);
        int int12 = testClass2_0.add((int) ' ', 0);
        int int15 = testClass2_0.add((int) ' ', 1);
        int int18 = testClass2_0.add(1, 97);
        int int21 = testClass2_0.add(35, (int) '#');
        int int24 = testClass2_0.add((int) '#', 32);
        int int27 = testClass2_0.add(97, (int) (short) 1);
        int int30 = testClass2_0.add((int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass31 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test368");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) (byte) 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test369");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) '4', 0);
        int int6 = testClass2_0.add(52, 0);
        int int9 = testClass2_0.add(32, (int) (byte) 10);
        int int12 = testClass2_0.add((int) '4', (int) (short) 10);
        int int15 = testClass2_0.add(0, (int) 'a');
        int int18 = testClass2_0.add(52, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test370");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add((int) (short) -1, 0);
        int int6 = testClass2_0.add((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass7 = testClass2_0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test371");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) (short) 1, (int) '4');
        int int9 = testClass2_0.add((int) 'a', (int) (short) 100);
        int int12 = testClass2_0.add(32, 10);
        int int15 = testClass2_0.add(52, 100);
        int int18 = testClass2_0.add((int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test372");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(0, (int) (byte) 1);
        int int18 = testClass2_0.add(32, 97);
        int int21 = testClass2_0.add(52, (int) (short) 100);
        int int24 = testClass2_0.add((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass2RegTester0.test373");
        TestClass2 testClass2_0 = new TestClass2();
        int int3 = testClass2_0.add(100, (int) (byte) 1);
        int int6 = testClass2_0.add((int) '4', 0);
        int int9 = testClass2_0.add(52, (int) (byte) 100);
        int int12 = testClass2_0.add((int) (byte) -1, 35);
        int int15 = testClass2_0.add(52, 97);
        int int18 = testClass2_0.add(10, 0);
        int int21 = testClass2_0.add(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }
}


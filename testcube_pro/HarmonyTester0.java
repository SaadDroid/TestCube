import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HarmonyTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test002");
        Harmony harmony0 = new Harmony();
        java.lang.Class<?> wildcardClass1 = harmony0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test003");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test004");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test005");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test006");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test007");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test008");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test009");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test010");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test011");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test012");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test013");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(10, 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test014");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test015");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test016");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test017");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1399733633 + "'", int12 == 1399733633);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test018");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test019");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 1, 32);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test020");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test021");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test022");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) 'a', (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test023");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test024");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow((int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test025");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow(32, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test026");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test027");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test028");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test029");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test030");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((-1), (int) '#');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test031");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test032");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test033");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test034");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test035");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow(0, 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test036");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test037");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test038");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(100, 97);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test039");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int12 = harmony0.pow(0, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test040");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test041");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test042");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test043");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test044");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test045");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow((-1401860735), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1401860735) + "'", int21 == (-1401860735));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test046");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test047");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test048");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test049");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test050");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test051");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow((-1), 97);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test052");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow(0, 35);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test053");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test054");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test055");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test056");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test057");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test058");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test059");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int6 = harmony0.pow(10, 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test060");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test061");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test062");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(35, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1528444521 + "'", int21 == 1528444521);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test063");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 1, 32);
        int int12 = harmony0.pow((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test064");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow((int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test065");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow(0, 0);
        int int21 = harmony0.pow(97, (int) ' ');
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-447362047) + "'", int21 == (-447362047));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test066");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(10, 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test067");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test068");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 1, 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test069");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow(97, (int) ' ');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-447362047) + "'", int12 == (-447362047));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test070");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) 'a', 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test071");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test072");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test073");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(1661992960, (int) (byte) 0);
        int int24 = harmony0.pow((int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1661992960 + "'", int24 == 1661992960);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test074");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow(32, 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test075");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(1661992960, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test076");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(100, 10);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test077");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow(32, (int) (short) 10);
        int int9 = harmony0.pow((-447362047), (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test078");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow(100, (int) (short) 0);
        int int27 = harmony0.pow((-1401860735), (int) (short) 10);
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1741273343) + "'", int27 == (-1741273343));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test079");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(100, (int) 'a');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test080");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (short) 10, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test081");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow(32, (int) (short) 10);
        int int9 = harmony0.pow((-447362047), (int) (short) 0);
        int int12 = harmony0.pow(1, 97);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test082");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test083");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        int int6 = harmony0.pow(0, (int) '4');
        int int9 = harmony0.pow((-447362047), (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1599473663) + "'", int9 == (-1599473663));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test084");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow(10, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test085");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test086");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test087");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), (int) '#');
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test088");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow(1, (int) (short) 100);
        int int24 = harmony0.pow(0, 32);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test089");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test090");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test091");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow((-1), 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test092");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow(2049419009, 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test093");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test094");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int12 = harmony0.pow((int) (short) 100, (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test095");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(0, (int) '#');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test096");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 0);
        int int18 = harmony0.pow((int) (short) 1, 35);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test097");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1661992960 + "'", int18 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test098");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(10, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test099");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) (short) 100, 10);
        int int21 = harmony0.pow((-1741273343), (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1661992960 + "'", int18 == 1661992960);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test100");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test101");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow(10, (int) '4');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test102");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test103");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((-1917263871), 97);
        java.lang.Class<?> wildcardClass4 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1930223617 + "'", int3 == 1930223617);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test104");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        int int18 = harmony0.pow(97, (int) '4');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1601735553 + "'", int18 == 1601735553);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test105");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) -1, (int) '#');
        int int9 = harmony0.pow(1, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test106");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) '#', 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test107");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow(100, (int) (short) 0);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test108");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(100, 10);
        int int18 = harmony0.pow((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test109");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test110");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow(35, (int) ' ');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1995483777 + "'", int12 == 1995483777);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test111");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) 'a', 100);
        int int21 = harmony0.pow((int) 'a', (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 360339393 + "'", int21 == 360339393);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test112");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(100, (int) 'a');
        int int15 = harmony0.pow((int) (byte) -1, 32);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test113");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow(97, (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1601735553 + "'", int12 == 1601735553);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test114");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test115");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (byte) 1, (int) (byte) 1);
        int int12 = harmony0.pow((int) ' ', 32);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test116");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(100, (int) 'a');
        int int15 = harmony0.pow((-1741273343), (int) ' ');
        int int18 = harmony0.pow((-1599473663), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1917263871) + "'", int15 == (-1917263871));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-672866303) + "'", int18 == (-672866303));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test117");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test118");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(32, (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test119");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(97, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test120");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(100, (int) 'a');
        int int15 = harmony0.pow((-1741273343), (int) ' ');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1917263871) + "'", int15 == (-1917263871));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test121");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(339461633, 97);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 694552065 + "'", int12 == 694552065);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test122");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow(10, (int) (short) 100);
        int int21 = harmony0.pow((-1599473663), (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test123");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((-1599473663), (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test124");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) (short) 10, 100);
        int int12 = harmony0.pow(1, 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test125");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow(1, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test126");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (byte) -1, 32);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test127");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test128");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test129");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow((-1), 97);
        int int24 = harmony0.pow((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1661992960 + "'", int24 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test130");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int12 = harmony0.pow((int) (short) 100, (int) '4');
        int int15 = harmony0.pow((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test131");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow((-1), 97);
        int int24 = harmony0.pow(1930223617, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1930223617 + "'", int24 == 1930223617);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test132");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((-1599473663), 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1599473663) + "'", int12 == (-1599473663));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test133");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (byte) 1, (int) (byte) 1);
        int int12 = harmony0.pow((-672866303), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 761757697 + "'", int12 == 761757697);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test134");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((-1401860735), 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 339461633 + "'", int18 == 339461633);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test135");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test136");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow((int) (byte) 1, 10);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test137");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(100, 97);
        int int9 = harmony0.pow((int) '#', (int) (byte) 1);
        int int12 = harmony0.pow(0, 97);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test138");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        int int6 = harmony0.pow(0, (int) '4');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test139");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow(10, (int) '4');
        int int12 = harmony0.pow(339461633, 32);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46612479) + "'", int12 == (-46612479));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test140");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 1, 97);
        int int9 = harmony0.pow(761757697, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-182026239) + "'", int9 == (-182026239));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test141");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (byte) 1, (int) 'a');
        int int18 = harmony0.pow(0, (int) 'a');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test142");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test143");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) 'a', 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test144");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow(1, 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test145");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(2049419009, (int) '#');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1418646785 + "'", int15 == 1418646785);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test146");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow(10, 97);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test147");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(339461633, 97);
        int int15 = harmony0.pow((-46612479), 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 694552065 + "'", int12 == 694552065);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test148");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow(97, (int) ' ');
        int int15 = harmony0.pow((-1741273343), 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-447362047) + "'", int12 == (-447362047));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test149");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow((-46612479), (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1244332033 + "'", int18 == 1244332033);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test150");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow(1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test151");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) 'a', 100);
        int int21 = harmony0.pow((int) 'a', (int) (short) 10);
        int int24 = harmony0.pow(32, (int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 360339393 + "'", int21 == 360339393);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test152");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow(1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test153");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1601735553, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test154");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow(1, 100);
        int int18 = harmony0.pow(35, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test155");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test156");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow(32, (int) (short) 10);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test157");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) -1, (int) '#');
        int int9 = harmony0.pow(0, (int) ' ');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test158");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 1, 32);
        int int12 = harmony0.pow((-46612479), (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46612479) + "'", int12 == (-46612479));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test159");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test160");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) (short) 1, 0);
        int int15 = harmony0.pow(1528444521, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test161");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow(0, 35);
        int int12 = harmony0.pow(0, 97);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test162");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow(2049419009, 0);
        int int12 = harmony0.pow((-1), (int) (short) 0);
        int int15 = harmony0.pow(100, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test163");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) ' ', 32);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test164");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 1, 97);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test165");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 1, 100);
        int int12 = harmony0.pow((-1401860735), (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 339461633 + "'", int12 == 339461633);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test166");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int6 = harmony0.pow(10, 0);
        int int9 = harmony0.pow((int) (short) 0, (int) (short) 100);
        int int12 = harmony0.pow((int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test167");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow(100, (int) (short) 0);
        int int27 = harmony0.pow(1930223617, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-922255359) + "'", int27 == (-922255359));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test168");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow(10, 32);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test169");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) ' ', (int) (byte) 1);
        int int6 = harmony0.pow(1399733633, (int) (short) 0);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test170");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(1661992960, (int) (byte) 0);
        int int24 = harmony0.pow((-1599473663), 1);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1599473663) + "'", int24 == (-1599473663));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test171");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow(10, (int) '4');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test172");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow(0, 100);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test173");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow(2049419009, (int) ' ');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test174");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow(97, (int) ' ');
        int int15 = harmony0.pow((-1741273343), 0);
        int int18 = harmony0.pow(97, (int) '4');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-447362047) + "'", int12 == (-447362047));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1601735553 + "'", int18 == 1601735553);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test175");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow((int) (byte) -1, (int) (byte) 0);
        int int12 = harmony0.pow((int) (byte) 10, 1);
        int int15 = harmony0.pow((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test176");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), (int) '#');
        int int27 = harmony0.pow(100, 100);
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test177");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(100, 97);
        int int9 = harmony0.pow((int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test178");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow(32, 0);
        int int27 = harmony0.pow((-118608221), (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-118608221) + "'", int27 == (-118608221));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test179");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((-447362047), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-680860671) + "'", int18 == (-680860671));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test180");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(100, (int) 'a');
        int int15 = harmony0.pow((-1741273343), (int) ' ');
        int int18 = harmony0.pow(97, (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1917263871) + "'", int15 == (-1917263871));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test181");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) 'a', (int) (short) 1);
        int int18 = harmony0.pow(339461633, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-374752255) + "'", int18 == (-374752255));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test182");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), 97);
        int int27 = harmony0.pow((int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test183");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow(10, (int) (short) 100);
        int int21 = harmony0.pow((-1599473663), (int) (byte) 0);
        int int24 = harmony0.pow(1528444521, (int) 'a');
        int int27 = harmony0.pow((int) ' ', 0);
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1303189143) + "'", int24 == (-1303189143));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test184");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow(32, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test185");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow((-46612479), (int) (byte) 100);
        int int21 = harmony0.pow((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1244332033 + "'", int18 == 1244332033);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test186");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        int int6 = harmony0.pow(1, (int) (byte) 10);
        int int9 = harmony0.pow(1210453889, 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test187");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(100, 97);
        int int9 = harmony0.pow((int) '#', (int) (byte) 1);
        int int12 = harmony0.pow(0, 97);
        int int15 = harmony0.pow((-1917263871), 35);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-330915839) + "'", int15 == (-330915839));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test188");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow(1, (int) (short) 100);
        int int24 = harmony0.pow((int) (short) 0, 0);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test189");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow(1399733633, (int) (short) 10);
        int int24 = harmony0.pow(32, 0);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2049419009 + "'", int21 == 2049419009);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test190");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow(0, 100);
        int int24 = harmony0.pow(1995483777, (int) '#');
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1210453889 + "'", int24 == 1210453889);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test191");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (byte) -1, 32);
        int int9 = harmony0.pow((int) ' ', (int) (byte) 100);
        int int12 = harmony0.pow(761757697, (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1190789119) + "'", int12 == (-1190789119));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test192");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) (short) 10, 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test193");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow(2049419009, 0);
        int int12 = harmony0.pow((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test194");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow(10, (int) (short) 100);
        int int21 = harmony0.pow((-1599473663), (int) (byte) 0);
        int int24 = harmony0.pow(1528444521, (int) 'a');
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1303189143) + "'", int24 == (-1303189143));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test195");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 0);
        int int18 = harmony0.pow(1661992960, 10);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test196");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow((int) (byte) -1, (int) (byte) 0);
        int int12 = harmony0.pow((int) (byte) 10, 1);
        int int15 = harmony0.pow(2049419009, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1844020737 + "'", int15 == 1844020737);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test197");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 0);
        int int18 = harmony0.pow((int) (short) 1, 35);
        int int21 = harmony0.pow((-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test198");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (byte) 1, (int) 'a');
        int int18 = harmony0.pow(0, (int) 'a');
        int int21 = harmony0.pow(1210453889, 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1095247103) + "'", int21 == (-1095247103));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test199");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((-1599473663), (int) (short) 100);
        int int18 = harmony0.pow((int) ' ', 0);
        int int21 = harmony0.pow((-46612479), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 876052481 + "'", int21 == 876052481);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test200");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((-672866303), 97);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1917263871) + "'", int9 == (-1917263871));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test201");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) '#', 0);
        int int9 = harmony0.pow(35, (int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1528444521 + "'", int9 == 1528444521);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test202");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test203");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int24 = harmony0.pow((int) (byte) 1, 10);
        int int27 = harmony0.pow((-120848383), (int) ' ');
        java.lang.Class<?> wildcardClass28 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 427819009 + "'", int27 == 427819009);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test204");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(0, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test205");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) -1, 32);
        int int15 = harmony0.pow((int) '#', 97);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-118608221) + "'", int15 == (-118608221));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test206");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test207");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow(1, (int) (byte) 100);
        int int18 = harmony0.pow((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test208");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, (int) ' ');
        int int15 = harmony0.pow(32, (int) (byte) 10);
        int int18 = harmony0.pow(1399733633, (int) (short) 0);
        int int21 = harmony0.pow(32, (int) (short) 1);
        int int24 = harmony0.pow((-182026239), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-476676095) + "'", int24 == (-476676095));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test209");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow(1, (int) (byte) 100);
        int int18 = harmony0.pow((int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test210");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) 'a', 100);
        int int21 = harmony0.pow(32, (int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test211");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow((-1), (int) (short) 10);
        int int21 = harmony0.pow(1244332033, (int) (byte) 100);
        int int24 = harmony0.pow((-118608221), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-120848383) + "'", int21 == (-120848383));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-118608221) + "'", int24 == (-118608221));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test212");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) 'a', 0);
        int int21 = harmony0.pow(35, (int) '4');
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1579239825 + "'", int21 == 1579239825);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test213");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        int int6 = harmony0.pow(1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test214");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow(10, (int) (byte) 100);
        int int18 = harmony0.pow(10, (int) (short) 100);
        int int21 = harmony0.pow((-1599473663), (int) (byte) 0);
        int int24 = harmony0.pow(1528444521, (int) 'a');
        int int27 = harmony0.pow((int) ' ', 0);
        int int30 = harmony0.pow(694552065, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1303189143) + "'", int24 == (-1303189143));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 694552065 + "'", int30 == 694552065);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test215");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 1, 32);
        int int12 = harmony0.pow(35, (int) '#');
        int int15 = harmony0.pow((-1917263871), (int) (short) 0);
        int int18 = harmony0.pow((-1401860735), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 618402555 + "'", int12 == 618402555);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1401860735) + "'", int18 == (-1401860735));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test216");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test217");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow(0, 35);
        int int12 = harmony0.pow(0, 97);
        int int15 = harmony0.pow((int) '#', (int) (short) 100);
        int int18 = harmony0.pow(360339393, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86196911) + "'", int15 == (-86196911));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1599473663) + "'", int18 == (-1599473663));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test218");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow((-1), (int) ' ');
        int int21 = harmony0.pow((-1401860735), (int) (byte) 1);
        int int24 = harmony0.pow((-680860671), 32);
        int int27 = harmony0.pow((int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1401860735) + "'", int21 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1549565953 + "'", int24 == 1549565953);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1399733633 + "'", int27 == 1399733633);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test219");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (short) 10, 0);
        int int15 = harmony0.pow(1601735553, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1409754239) + "'", int15 == (-1409754239));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test220");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((-1599473663), (int) (short) 100);
        int int18 = harmony0.pow((int) ' ', 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test221");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(0, 97);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test222");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 10, 1);
        int int12 = harmony0.pow((-86196911), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-157291999) + "'", int12 == (-157291999));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test223");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) (byte) 1, 35);
        int int21 = harmony0.pow((-1), 97);
        int int24 = harmony0.pow((int) (short) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test224");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow(0, 0);
        int int21 = harmony0.pow(97, (int) ' ');
        int int24 = harmony0.pow((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-447362047) + "'", int21 == (-447362047));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test225");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) ' ', 32);
        int int12 = harmony0.pow(1930223617, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-226443263) + "'", int12 == (-226443263));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test226");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow((int) (byte) 100, 10);
        int int18 = harmony0.pow(32, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test227");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, (int) (short) 100);
        int int6 = harmony0.pow((-1095247103), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1448737537 + "'", int6 == 1448737537);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test228");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(0, (int) '#');
        int int12 = harmony0.pow(339461633, (int) ' ');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-46612479) + "'", int12 == (-46612479));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test229");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 10, 1);
        int int12 = harmony0.pow((int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test230");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 1);
        int int18 = harmony0.pow(1930223617, 1);
        int int21 = harmony0.pow((-1190789119), 10);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1930223617 + "'", int18 == 1930223617);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 977010689 + "'", int21 == 977010689);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test231");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((-46612479), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1321353217 + "'", int9 == 1321353217);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test232");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) -1, 32);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test233");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 10, 1);
        int int12 = harmony0.pow((int) '4', (int) (byte) 1);
        int int15 = harmony0.pow(0, 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test234");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow(1528444521, 0);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test235");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow(1549565953, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-15958015) + "'", int9 == (-15958015));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test236");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1303189143), 52);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1932966049 + "'", int24 == 1932966049);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test237");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow((int) (byte) -1, (int) (byte) 0);
        int int12 = harmony0.pow((int) (byte) 10, 1);
        int int15 = harmony0.pow((int) (byte) 1, (int) (byte) 100);
        int int18 = harmony0.pow((-1741273343), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 532735745 + "'", int18 == 532735745);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test238");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow(0, 35);
        int int12 = harmony0.pow(0, 97);
        int int15 = harmony0.pow((int) '#', (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-86196911) + "'", int15 == (-86196911));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test239");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow(10, (int) '4');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow((-182026239), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-746520575) + "'", int15 == (-746520575));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test240");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow((-1401860735), 100);
        int int18 = harmony0.pow((int) (short) 100, 10);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 339461633 + "'", int15 == 339461633);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1661992960 + "'", int18 == 1661992960);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test241");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int12 = harmony0.pow((int) (short) 100, (int) '4');
        int int15 = harmony0.pow((-226443263), 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1343750145 + "'", int15 == 1343750145);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test242");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (short) 10, (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test243");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow(2049419009, (int) ' ');
        int int18 = harmony0.pow(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test244");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow(2049419009, 0);
        int int12 = harmony0.pow((-1303189143), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 83629561 + "'", int12 == 83629561);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test245");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow(10, (int) '4');
        int int12 = harmony0.pow((-86196911), 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1143009857 + "'", int12 == 1143009857);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test246");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((int) (byte) 0, (int) ' ');
        int int18 = harmony0.pow((int) 'a', 0);
        int int21 = harmony0.pow(97, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-447362047) + "'", int21 == (-447362047));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test247");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow(1399733633, 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test248");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 1, 100);
        int int12 = harmony0.pow((-1401860735), (int) (byte) 100);
        int int15 = harmony0.pow(427819009, 100);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 339461633 + "'", int12 == 339461633);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-167772159) + "'", int15 == (-167772159));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test249");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow(100, (int) (short) 0);
        int int15 = harmony0.pow((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test250");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(100, 97);
        int int9 = harmony0.pow((int) '#', (int) (byte) 1);
        int int12 = harmony0.pow((-476676095), (int) ' ');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1926234113 + "'", int12 == 1926234113);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test251");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow((-1), (int) (short) 100);
        int int12 = harmony0.pow(97, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test252");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow(97, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test253");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(0, (int) (short) 0);
        int int6 = harmony0.pow(0, 0);
        int int9 = harmony0.pow((int) (byte) -1, (int) (byte) 0);
        int int12 = harmony0.pow((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test254");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((-680860671), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test255");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 1, (int) ' ');
        int int6 = harmony0.pow(1, (int) (byte) 100);
        int int9 = harmony0.pow(1528444521, (int) ' ');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1905792767) + "'", int9 == (-1905792767));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test256");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), (int) '#');
        int int27 = harmony0.pow(100, 100);
        int int30 = harmony0.pow(1272053761, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test257");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((int) '#', (int) ' ');
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1995483777 + "'", int24 == 1995483777);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test258");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow(0, 100);
        int int24 = harmony0.pow(1995483777, (int) '#');
        int int27 = harmony0.pow(1926234113, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1210453889 + "'", int24 == 1210453889);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-650117119) + "'", int27 == (-650117119));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test259");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) ' ', (int) (byte) 1);
        int int18 = harmony0.pow(1930223617, 1);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1930223617 + "'", int18 == 1930223617);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test260");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 1, 32);
        int int12 = harmony0.pow((int) (short) 1, 1);
        int int15 = harmony0.pow((-118608221), (int) '#');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 685828731 + "'", int15 == 685828731);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test261");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) 'a', (int) (short) 1);
        int int18 = harmony0.pow((-1), (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test262");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        int int21 = harmony0.pow(694552065, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test263");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (short) 0, 0);
        int int6 = harmony0.pow((-1917263871), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test264");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow(1661992960, 10);
        int int15 = harmony0.pow((int) 'a', (int) (short) 1);
        int int18 = harmony0.pow((-1), (int) (byte) 10);
        int int21 = harmony0.pow((-1303189143), (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1303189143) + "'", int21 == (-1303189143));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test265");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow(1399733633, 0);
        int int21 = harmony0.pow(10, (int) '#');
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test266");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), 97);
        java.lang.Class<?> wildcardClass25 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test267");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) 1, (int) (byte) 0);
        int int9 = harmony0.pow((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test268");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) ' ', 32);
        int int12 = harmony0.pow(1930223617, (int) (byte) 10);
        int int15 = harmony0.pow((-226443263), (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-226443263) + "'", int12 == (-226443263));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-226443263) + "'", int15 == (-226443263));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test269");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 1, 100);
        int int12 = harmony0.pow((-1401860735), (int) (byte) 100);
        int int15 = harmony0.pow(52, 32);
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 339461633 + "'", int12 == 339461633);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test270");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test271");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow(427819009, (int) 'a');
        java.lang.Class<?> wildcardClass7 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1451229183) + "'", int6 == (-1451229183));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test272");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) ' ', 32);
        int int12 = harmony0.pow(1930223617, (int) (byte) 10);
        int int15 = harmony0.pow((-680860671), (int) 'a');
        java.lang.Class<?> wildcardClass16 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-226443263) + "'", int12 == (-226443263));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-763337727) + "'", int15 == (-763337727));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test273");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(0, (int) '#');
        int int12 = harmony0.pow((-182026239), (int) '4');
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1272053761 + "'", int12 == 1272053761);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test274");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow(32, 100);
        int int21 = harmony0.pow((-118608221), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-118608221) + "'", int21 == (-118608221));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test275");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) '4', (int) ' ');
        int int9 = harmony0.pow(10, 100);
        int int12 = harmony0.pow(1995483777, 0);
        java.lang.Class<?> wildcardClass13 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test276");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) ' ', (int) '#');
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow((int) (byte) 100, 10);
        int int18 = harmony0.pow((int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test277");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) ' ', 0);
        int int15 = harmony0.pow(10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test278");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1661992960, (int) (byte) 1);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) -1, (int) (short) 100);
        int int12 = harmony0.pow(1244332033, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1661992960 + "'", int3 == 1661992960);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 441122817 + "'", int12 == 441122817);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test279");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((int) (short) 0, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 1, 100);
        int int12 = harmony0.pow((-1401860735), (int) (byte) 100);
        int int15 = harmony0.pow(427819009, 100);
        int int18 = harmony0.pow(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 339461633 + "'", int12 == 339461633);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-167772159) + "'", int15 == (-167772159));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test280");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) '4', (int) '#');
        int int12 = harmony0.pow((int) (byte) -1, (int) (byte) 100);
        int int15 = harmony0.pow(10, 0);
        int int18 = harmony0.pow((int) 'a', 100);
        int int21 = harmony0.pow(339461633, 32);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1399733633 + "'", int18 == 1399733633);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-46612479) + "'", int21 == (-46612479));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test281");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        int int18 = harmony0.pow((-167772159), (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-167772159) + "'", int18 == (-167772159));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test282");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 1, 97);
        int int9 = harmony0.pow(1930223617, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-922255359) + "'", int9 == (-922255359));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test283");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 10, (int) (byte) 1);
        int int6 = harmony0.pow((-447362047), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 837005313 + "'", int6 == 837005313);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test284");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 0, 32);
        int int12 = harmony0.pow((int) (byte) 100, (int) (short) 1);
        int int15 = harmony0.pow((-1599473663), (int) (short) 100);
        int int18 = harmony0.pow(761757697, (int) '4');
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-672866303) + "'", int15 == (-672866303));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1190789119) + "'", int18 == (-1190789119));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test285");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) -1, (int) 'a');
        int int9 = harmony0.pow(1661992960, (int) (short) 0);
        int int12 = harmony0.pow((int) (short) 100, (int) '#');
        int int15 = harmony0.pow((-1), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test286");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow(1661992960, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test287");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow(0, (int) 'a');
        int int9 = harmony0.pow((int) (byte) 1, 0);
        int int12 = harmony0.pow((-1599473663), 1);
        int int15 = harmony0.pow(761757697, 52);
        int int18 = harmony0.pow((int) (short) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1599473663) + "'", int12 == (-1599473663));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1190789119) + "'", int15 == (-1190789119));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test288");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 10, 100);
        int int12 = harmony0.pow(0, (int) '4');
        int int15 = harmony0.pow((int) (short) 10, 100);
        int int18 = harmony0.pow((int) (short) 0, (int) (byte) 100);
        int int21 = harmony0.pow((-1303189143), (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test289");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) ' ', 32);
        int int12 = harmony0.pow((-1303189143), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test290");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) (short) -1, 97);
        int int9 = harmony0.pow((-1917263871), (int) ' ');
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1998323713 + "'", int9 == 1998323713);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test291");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) '4', 0);
        int int6 = harmony0.pow((int) (short) 100, 100);
        int int9 = harmony0.pow((int) (byte) 100, 10);
        int int12 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int15 = harmony0.pow((int) (short) 100, 10);
        int int18 = harmony0.pow(0, 32);
        int int21 = harmony0.pow((int) (short) -1, 35);
        int int24 = harmony0.pow((-1), 97);
        int int27 = harmony0.pow(1844020737, (int) (short) 100);
        int int30 = harmony0.pow((int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1661992960 + "'", int9 == 1661992960);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1661992960 + "'", int15 == 1661992960);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-749709311) + "'", int27 == (-749709311));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test292");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow((int) (byte) 1, (int) (byte) 0);
        int int6 = harmony0.pow(10, 0);
        int int9 = harmony0.pow((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass10 = harmony0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test293");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1, 0);
        int int6 = harmony0.pow((int) (byte) 1, 0);
        int int9 = harmony0.pow((int) (short) 10, 100);
        int int12 = harmony0.pow((-447362047), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test294");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow(32, (int) (short) 10);
        int int9 = harmony0.pow((int) (short) 10, (int) (short) 100);
        int int12 = harmony0.pow((-763337727), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 900064257 + "'", int12 == 900064257);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "HarmonyTester0.test295");
        Harmony harmony0 = new Harmony();
        int int3 = harmony0.pow(1399733633, (int) 'a');
        int int6 = harmony0.pow((int) '#', 0);
        int int9 = harmony0.pow((-1303189143), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1401860735) + "'", int3 == (-1401860735));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }
}


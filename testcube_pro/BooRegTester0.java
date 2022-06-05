import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BooRegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test002");
        Boo boo0 = new Boo();
        java.lang.Class<?> wildcardClass1 = boo0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test003");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test004");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test005");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test006");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test007");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass3 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test008");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test009");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test010");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test011");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test012");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test013");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test014");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test015");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test016");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test017");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test018");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test019");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test020");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test021");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 1);
        int int10 = boo0.blah(0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test022");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test023");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test024");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test025");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test026");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test027");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) 10);
        int int12 = boo0.blah(0);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test028");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test029");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test030");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah(10);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test031");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (byte) 10);
        int int12 = boo0.blah(10);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test032");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(0);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test033");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test034");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(0);
        int int14 = boo0.blah(56);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test035");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test036");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 1);
        int int6 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test037");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test038");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah(100);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test039");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah((int) (byte) 1);
        int int8 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test040");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test041");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test042");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test043");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) 'a');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test044");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test045");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test046");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test047");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test048");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(100);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test049");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test050");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test051");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(56);
        int int14 = boo0.blah(0);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test052");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah(1);
        int int8 = boo0.blah((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test053");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test054");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (byte) 1);
        int int16 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test055");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test056");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test057");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah(0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test058");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test059");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test060");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 100);
        int int14 = boo0.blah(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test061");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test062");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah(1);
        int int8 = boo0.blah(56);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test063");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test064");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) -1);
        int int16 = boo0.blah(0);
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test065");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) 10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test066");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah(0);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test067");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test068");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test069");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test070");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah(10);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test071");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah(10);
        int int10 = boo0.blah(0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test072");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test073");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test074");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test075");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah(0);
        int int8 = boo0.blah(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test076");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        int int16 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test077");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test078");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test079");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test080");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test081");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah(100);
        int int12 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 56 + "'", int10 == 56);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test082");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test083");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test084");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test085");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test086");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test087");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test088");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test089");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test090");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) '#');
        int int12 = boo0.blah((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test091");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (byte) 1);
        int int16 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test092");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test093");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test094");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) '#');
        int int12 = boo0.blah((int) 'a');
        int int14 = boo0.blah((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test095");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(100);
        int int10 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test096");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah(1);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test097");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 0);
        int int14 = boo0.blah((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test098");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah(1);
        int int8 = boo0.blah(56);
        int int10 = boo0.blah((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 56 + "'", int10 == 56);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test099");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test100");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (short) -1);
        int int14 = boo0.blah((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test101");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (byte) 10);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test102");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test103");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test104");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test105");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        int int16 = boo0.blah((-1));
        int int18 = boo0.blah((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test106");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test107");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test108");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test109");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test110");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (byte) 10);
        int int12 = boo0.blah((int) (byte) 0);
        int int14 = boo0.blah((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test111");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        int int16 = boo0.blah((int) (byte) 1);
        int int18 = boo0.blah(0);
        int int20 = boo0.blah(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 56 + "'", int20 == 56);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test112");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 1);
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test113");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah(0);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test114");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 1);
        int int10 = boo0.blah((int) '#');
        int int12 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test115");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test116");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) -1);
        int int16 = boo0.blah((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test117");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 1);
        int int10 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test118");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test119");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah(10);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test120");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test121");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test122");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test123");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(100);
        int int10 = boo0.blah((int) (short) 0);
        int int12 = boo0.blah((int) '#');
        int int14 = boo0.blah((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test124");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test125");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(0);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test126");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 0);
        int int10 = boo0.blah(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test127");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah(1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test128");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(1);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test129");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 100);
        int int14 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 56 + "'", int12 == 56);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test130");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah(0);
        int int16 = boo0.blah((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test131");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 100);
        int int6 = boo0.blah((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test132");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test133");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 1);
        int int6 = boo0.blah((int) (byte) 1);
        int int8 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test134");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test135");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(100);
        int int10 = boo0.blah((int) (short) 0);
        int int12 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test136");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah(1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test137");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        java.lang.Class<?> wildcardClass5 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test138");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test139");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test140");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test141");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(100);
        int int10 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test142");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) (short) 10);
        int int8 = boo0.blah((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test143");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test144");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) 'a');
        int int10 = boo0.blah((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 56 + "'", int10 == 56);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test145");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 100);
        int int6 = boo0.blah(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test146");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test147");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah(10);
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test148");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test149");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah(0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test150");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 0);
        int int14 = boo0.blah((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test151");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah(0);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test152");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test153");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) 'a');
        int int18 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test154");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test155");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((-1));
        int int18 = boo0.blah((int) (byte) 10);
        int int20 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test156");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 100);
        int int6 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test157");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah(10);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test158");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(56);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test159");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah(0);
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test160");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        int int16 = boo0.blah((int) (byte) 1);
        int int18 = boo0.blah((int) '#');
        int int20 = boo0.blah((int) '4');
        java.lang.Class<?> wildcardClass21 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test161");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 100);
        int int10 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test162");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah(10);
        int int16 = boo0.blah((int) '#');
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test163");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah(10);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test164");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(56);
        int int14 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test165");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) '#');
        int int12 = boo0.blah((int) 'a');
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test166");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test167");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) -1);
        int int16 = boo0.blah((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test168");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test169");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(56);
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((int) (byte) 0);
        int int18 = boo0.blah(100);
        java.lang.Class<?> wildcardClass19 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test170");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test171");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test172");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 100);
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah(56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test173");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah(56);
        int int16 = boo0.blah((int) (byte) 1);
        int int18 = boo0.blah(100);
        java.lang.Class<?> wildcardClass19 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test174");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah(10);
        int int18 = boo0.blah((int) (short) -1);
        int int20 = boo0.blah((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test175");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) 10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah((int) '#');
        int int16 = boo0.blah((int) (short) 100);
        int int18 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass19 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 56 + "'", int16 == 56);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test176");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah(0);
        int int8 = boo0.blah((int) (byte) 1);
        int int10 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test177");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) (byte) 10);
        int int12 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass13 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test178");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((int) ' ');
        int int14 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test179");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah((int) (byte) 1);
        int int8 = boo0.blah((int) (short) 100);
        int int10 = boo0.blah(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 56 + "'", int10 == 56);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test180");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah(1);
        int int8 = boo0.blah(56);
        int int10 = boo0.blah((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test181");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(0);
        int int6 = boo0.blah((int) (byte) 1);
        int int8 = boo0.blah(100);
        int int10 = boo0.blah((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test182");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(1);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) (byte) 100);
        int int10 = boo0.blah((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 56 + "'", int8 == 56);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test183");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) '#');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test184");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (byte) 1);
        int int14 = boo0.blah((int) (short) 1);
        int int16 = boo0.blah(100);
        int int18 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 56 + "'", int16 == 56);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test185");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test186");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test187");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test188");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah(10);
        int int6 = boo0.blah((int) 'a');
        java.lang.Class<?> wildcardClass7 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test189");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) 'a');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test190");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) 'a');
        int int16 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test191");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 100);
        int int6 = boo0.blah((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test192");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah((int) (byte) 10);
        int int14 = boo0.blah((int) (short) 0);
        int int16 = boo0.blah((int) (short) 100);
        int int18 = boo0.blah(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 56 + "'", int16 == 56);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test193");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test194");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 0);
        int int14 = boo0.blah(0);
        java.lang.Class<?> wildcardClass15 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test195");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah(10);
        int int10 = boo0.blah((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test196");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(1);
        int int12 = boo0.blah((int) (short) 0);
        int int14 = boo0.blah((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test197");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) -1);
        int int16 = boo0.blah(0);
        int int18 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test198");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah((int) (short) 1);
        int int10 = boo0.blah((int) (byte) 0);
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah((int) (short) 100);
        int int16 = boo0.blah((int) '#');
        int int18 = boo0.blah((int) (byte) 10);
        int int20 = boo0.blah(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test199");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) 100);
        int int8 = boo0.blah(0);
        int int10 = boo0.blah((int) ' ');
        int int12 = boo0.blah(10);
        int int14 = boo0.blah((int) (byte) 100);
        int int16 = boo0.blah((-1));
        int int18 = boo0.blah((int) (byte) 10);
        int int20 = boo0.blah((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test200");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah(10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah(10);
        int int16 = boo0.blah((int) (short) 10);
        int int18 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass19 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test201");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (short) -1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) -1);
        int int12 = boo0.blah((int) ' ');
        int int14 = boo0.blah((int) 'a');
        int int16 = boo0.blah((-1));
        java.lang.Class<?> wildcardClass17 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test202");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 0);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) '4');
        int int12 = boo0.blah((-1));
        int int14 = boo0.blah(10);
        int int16 = boo0.blah((int) '#');
        int int18 = boo0.blah((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test203");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (byte) 10);
        int int6 = boo0.blah((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 56 + "'", int6 == 56);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test204");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test205");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) (short) 0);
        int int4 = boo0.blah((int) ' ');
        int int6 = boo0.blah((int) (short) 1);
        int int8 = boo0.blah((int) ' ');
        int int10 = boo0.blah((int) (short) 10);
        int int12 = boo0.blah(0);
        int int14 = boo0.blah((int) (short) 0);
        int int16 = boo0.blah(1);
        int int18 = boo0.blah((int) (byte) 0);
        int int20 = boo0.blah((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test206");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test207");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 1);
        int int6 = boo0.blah((int) (byte) 1);
        int int8 = boo0.blah((int) (short) 0);
        int int10 = boo0.blah((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test208");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) (short) 0);
        int int6 = boo0.blah((int) '4');
        int int8 = boo0.blah((int) ' ');
        java.lang.Class<?> wildcardClass9 = boo0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "BooRegTester0.test209");
        Boo boo0 = new Boo();
        int int2 = boo0.blah((int) '4');
        int int4 = boo0.blah((int) 'a');
        int int6 = boo0.blah((int) (byte) 10);
        int int8 = boo0.blah((int) (byte) 10);
        int int10 = boo0.blah(0);
        int int12 = boo0.blah((int) (short) -1);
        int int14 = boo0.blah((int) '#');
        int int16 = boo0.blah((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}


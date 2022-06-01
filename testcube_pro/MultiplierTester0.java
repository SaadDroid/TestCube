import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MultiplierTester0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test2");
        Multiplier multiplier0 = new Multiplier();
        java.lang.Class<?> wildcardClass1 = multiplier0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test3");
        Multiplier multiplier0 = new Multiplier();
        int int3 = multiplier0.multiply((int) '4', 0);
        int int6 = multiplier0.multiply((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-97) + "'", int6 == (-97));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test4");
        Multiplier multiplier0 = new Multiplier();
        int int3 = multiplier0.multiply((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test5");
        Multiplier multiplier0 = new Multiplier();
        int int3 = multiplier0.multiply(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = multiplier0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MultiplierTester0.test6");
        Multiplier multiplier0 = new Multiplier();
        int int3 = multiplier0.multiply((int) '4', 0);
        int int6 = multiplier0.multiply((-97), 0);
        java.lang.Class<?> wildcardClass7 = multiplier0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}


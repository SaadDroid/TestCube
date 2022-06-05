import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DivBy0RegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test002");
        DivBy0 divBy0_0 = new DivBy0();
        java.lang.Class<?> wildcardClass1 = divBy0_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test003");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test004");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test005");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test006");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass5 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test007");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test008");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass3 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test009");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test010");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test011");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test012");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test013");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test014");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test015");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test016");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test017");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test018");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test019");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test020");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test021");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test022");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test023");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test024");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test025");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test026");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test027");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test028");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test029");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test030");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test031");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test032");
        DivBy0 divBy0_0 = new DivBy0();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test033");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test034");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test035");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test036");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test037");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test038");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test039");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test040");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test041");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test042");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test043");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test044");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test045");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test046");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test047");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test048");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test049");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test050");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test051");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test052");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test053");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test054");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test055");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test056");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test057");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test058");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test059");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test060");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test061");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test062");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test063");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test064");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test065");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test066");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test067");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test068");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test069");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test070");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test071");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test072");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test073");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test074");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test075");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test076");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test077");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test078");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test079");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test080");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test081");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test082");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test083");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test084");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test085");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test086");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test087");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test088");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test089");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test090");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass3 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test091");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test092");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test093");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test094");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test095");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test096");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test097");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test098");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test099");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test100");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test101");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test102");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test103");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test104");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test105");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test106");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test107");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test108");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test109");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test110");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test111");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test112");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test113");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test114");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test115");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test116");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test117");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test118");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test119");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test120");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test121");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test122");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test123");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test124");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test125");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test126");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test127");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test128");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test129");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test130");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test131");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test132");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test133");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test134");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test135");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test136");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test137");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test138");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test139");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test140");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test141");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test142");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test143");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test144");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test145");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test146");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test147");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test148");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test149");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test150");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass5 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test151");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test152");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test153");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass5 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test154");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test155");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test156");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test157");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test158");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test159");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test160");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test161");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test162");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test163");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test164");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test165");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test166");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test167");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test168");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test169");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test170");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test171");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test172");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test173");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test174");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test175");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test176");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test177");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test178");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test179");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test180");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test181");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test182");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test183");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test184");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass7 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test185");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test186");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test187");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test188");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test189");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test190");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test191");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test192");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test193");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test194");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test195");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        int int8 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test196");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test197");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test198");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test199");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test200");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test201");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test202");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test203");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test204");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test205");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test206");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test207");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test208");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test209");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test210");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test211");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test212");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test213");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test214");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test215");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test216");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test217");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test218");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test219");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test220");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test221");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test222");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test223");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        int int16 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test224");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test225");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test226");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test227");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test228");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test229");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test230");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test231");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test232");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0(97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test233");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test234");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test235");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test236");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test237");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test238");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test239");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test240");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test241");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        int int16 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test242");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test243");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test244");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int6 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test245");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test246");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test247");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test248");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test249");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test250");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test251");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) 'a');
        int int18 = divBy0_0.divBy0((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test252");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test253");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test254");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test255");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test256");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test257");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test258");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test259");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test260");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test261");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test262");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) 'a');
        int int14 = divBy0_0.divBy0((-1));
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test263");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (byte) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test264");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test265");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test266");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test267");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test268");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test269");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test270");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test271");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test272");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (short) -1);
        int int18 = divBy0_0.divBy0(1);
        int int20 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test273");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test274");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        int int18 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test275");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test276");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (byte) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test277");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test278");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test279");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test280");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test281");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (byte) 1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test282");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test283");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test284");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test285");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0(35);
        int int16 = divBy0_0.divBy0(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test286");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) 'a');
        int int14 = divBy0_0.divBy0((-1));
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test287");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test288");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test289");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((-1));
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test290");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test291");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test292");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test293");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test294");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test295");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test296");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test297");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test298");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test299");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test300");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test301");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test302");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) (byte) 1);
        int int22 = divBy0_0.divBy0(35);
        java.lang.Class<?> wildcardClass23 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test303");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test304");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test305");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) '#');
        int int16 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test306");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) (short) 1);
        int int22 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test307");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test308");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test309");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test310");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test311");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass17 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test312");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test313");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        int int14 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test314");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) (byte) -1);
        int int8 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test315");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test316");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) '#');
        int int18 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test317");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test318");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test319");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test320");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) (byte) 1);
        int int22 = divBy0_0.divBy0(97);
        java.lang.Class<?> wildcardClass23 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test321");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) 'a');
        int int14 = divBy0_0.divBy0((-1));
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test322");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test323");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass21 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test324");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test325");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) (byte) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test326");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test327");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test328");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test329");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test330");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test331");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test332");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0(1);
        int int14 = divBy0_0.divBy0((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = divBy0_0.divBy0((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test333");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test334");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (short) -1);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test335");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0((-1));
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((int) 'a');
        int int14 = divBy0_0.divBy0((-1));
        int int16 = divBy0_0.divBy0((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test336");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test337");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0((int) (short) 1);
        int int16 = divBy0_0.divBy0((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test338");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test339");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        int int14 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test340");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (short) -1);
        int int18 = divBy0_0.divBy0(1);
        java.lang.Class<?> wildcardClass19 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test341");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test342");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = divBy0_0.divBy0(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test343");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) 1);
        int int14 = divBy0_0.divBy0(35);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test344");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0(1);
        int int4 = divBy0_0.divBy0((-1));
        int int6 = divBy0_0.divBy0((int) 'a');
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test345");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) '#');
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test346");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0(1);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0(1);
        int int14 = divBy0_0.divBy0((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test347");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) -1);
        int int10 = divBy0_0.divBy0((int) 'a');
        int int12 = divBy0_0.divBy0((int) '#');
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test348");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(97);
        int int14 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test349");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = divBy0_0.divBy0((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test350");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        int int18 = divBy0_0.divBy0((int) 'a');
        int int20 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = divBy0_0.divBy0((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test351");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0(1);
        int int12 = divBy0_0.divBy0((int) '#');
        int int14 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test352");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) 1);
        int int12 = divBy0_0.divBy0((-1));
        int int14 = divBy0_0.divBy0((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test353");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((-1));
        java.lang.Class<?> wildcardClass13 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test354");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(97);
        int int18 = divBy0_0.divBy0((int) (byte) -1);
        int int20 = divBy0_0.divBy0((int) (short) 1);
        int int22 = divBy0_0.divBy0((int) (short) -1);
        int int24 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test355");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0(97);
        int int16 = divBy0_0.divBy0((int) (byte) -1);
        int int18 = divBy0_0.divBy0((int) (short) 1);
        int int20 = divBy0_0.divBy0((-1));
        int int22 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass23 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test356");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (byte) 1);
        int int10 = divBy0_0.divBy0((int) (short) -1);
        int int12 = divBy0_0.divBy0((-1));
        int int14 = divBy0_0.divBy0((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test357");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) -1);
        int int8 = divBy0_0.divBy0(97);
        int int10 = divBy0_0.divBy0(35);
        int int12 = divBy0_0.divBy0((int) (byte) -1);
        int int14 = divBy0_0.divBy0((int) 'a');
        java.lang.Class<?> wildcardClass15 = divBy0_0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DivBy0RegTester0.test358");
        DivBy0 divBy0_0 = new DivBy0();
        int int2 = divBy0_0.divBy0((int) 'a');
        int int4 = divBy0_0.divBy0((int) (short) -1);
        int int6 = divBy0_0.divBy0((int) (short) 1);
        int int8 = divBy0_0.divBy0((int) (short) 1);
        int int10 = divBy0_0.divBy0((int) (byte) 1);
        int int12 = divBy0_0.divBy0(35);
        int int14 = divBy0_0.divBy0((int) (short) -1);
        int int16 = divBy0_0.divBy0(35);
        int int18 = divBy0_0.divBy0((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = divBy0_0.divBy0((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }
}


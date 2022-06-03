import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestClass1Tester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test02");
        TestClass1 testClass1_0 = new TestClass1();
        java.lang.Class<?> wildcardClass1 = testClass1_0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test03");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test04");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test05");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test06");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test07");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test08");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test09");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test10");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test11");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test12");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test13");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test14");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test15");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test16");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test17");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test18");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test19");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test20");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test21");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test22");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test23");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test24");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test25");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test26");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test27");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test28");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test29");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test30");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test31");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test32");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test33");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test34");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test35");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test36");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test37");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test38");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test39");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test40");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test41");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test42");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test43");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test44");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test45");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test46");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test47");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test48");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test49");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test50");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test51");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test52");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test53");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test54");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test55");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test56");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test57");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test58");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test59");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test60");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test61");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test62");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test63");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test64");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test65");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test66");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test67");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test68");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test69");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test70");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TestClass1Tester0.test71");
        TestClass1 testClass1_0 = new TestClass1();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = testClass1_0.add((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }
}


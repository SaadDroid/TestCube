import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MathRegTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test01");
        int int1 = Math.sum((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test03");
        Math math0 = new Math();
        java.lang.Class<?> wildcardClass1 = math0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test04");
        int int1 = Math.sum((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test05");
        int int1 = Math.sum((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 630 + "'", int1 == 630);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test06");
        int int1 = Math.sum((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test07");
        int int1 = Math.sum(630);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 198766 + "'", int1 == 198766);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test08");
        int int1 = Math.sum(198766);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1720775718) + "'", int1 == (-1720775718));
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test09");
        int int1 = Math.sum(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test10");
        int int1 = Math.sum((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5051 + "'", int1 == 5051);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test11");
        int int1 = Math.sum((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test12");
        int int1 = Math.sum(5051);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12758826 + "'", int1 == 12758826);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test13");
        int int1 = Math.sum((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test14");
        int int1 = Math.sum((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1379 + "'", int1 == 1379);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test15");
        int int1 = Math.sum((-1720775718));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test16");
        int int1 = Math.sum((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test17");
        int int1 = Math.sum(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test18");
        int int1 = Math.sum((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4753 + "'", int1 == 4753);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test19");
        int int1 = Math.sum(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5051 + "'", int1 == 5051);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test20");
        int int1 = Math.sum((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 529 + "'", int1 == 529);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test21");
        int int1 = Math.sum(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test22");
        int int1 = Math.sum((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test23");
        int int1 = Math.sum((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5051 + "'", int1 == 5051);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test24");
        int int1 = Math.sum((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test25");
        int int1 = Math.sum((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test26");
        int int1 = Math.sum(4753);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11297881 + "'", int1 == 11297881);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test27");
        int int1 = Math.sum(529);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 140185 + "'", int1 == 140185);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test28");
        int int1 = Math.sum(12758826);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-98397944) + "'", int1 == (-98397944));
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test29");
        int int1 = Math.sum(56);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1597 + "'", int1 == 1597);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test30");
        int int1 = Math.sum(1379);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 951510 + "'", int1 == 951510);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test31");
        int int1 = Math.sum(11297881);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2144142757 + "'", int1 == 2144142757);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test32");
        int int1 = Math.sum(951510);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1714549726 + "'", int1 == 1714549726);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test33");
        int int1 = Math.sum((-98397944));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test34");
        int int1 = Math.sum(1714549726);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1220449330 + "'", int1 == 1220449330);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test35");
        int int1 = Math.sum(1220449330);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1549809404 + "'", int1 == 1549809404);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test36");
        int int1 = Math.sum(140185);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1236052613 + "'", int1 == 1236052613);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test37");
        int int1 = Math.sum(1236052613);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-604190257) + "'", int1 == (-604190257));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test38");
        int int1 = Math.sum((-604190257));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test39");
        int int1 = Math.sum(2144142757);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 538407167 + "'", int1 == 538407167);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test40");
        int int1 = Math.sum(538407167);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1343961216) + "'", int1 == (-1343961216));
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test41");
        int int1 = Math.sum((-1343961216));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test42");
        int int1 = Math.sum(1549809404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1654112135 + "'", int1 == 1654112135);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test43");
        int int1 = Math.sum(1597);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1276003 + "'", int1 == 1276003);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test44");
        int int1 = Math.sum(1276003);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1951320234) + "'", int1 == (-1951320234));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test45");
        int int1 = Math.sum(1654112135);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1617806244) + "'", int1 == (-1617806244));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test46");
        int int1 = Math.sum((-1951320234));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "MathRegTester0.test47");
        int int1 = Math.sum((-1617806244));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }
}


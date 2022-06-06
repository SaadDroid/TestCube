import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DevideErrTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test01");
        Devide devide0 = new Devide();
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double3 = devide0.devide((int) '4', 0);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test02");
        Devide devide0 = new Devide();
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double3 = devide0.devide(1, 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test03");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) (short) -1, 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test04");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide(0, 0);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test05");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) (byte) 1, 0);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test06");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide(100, (int) (short) 0);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test07");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = devide0.devide((int) (byte) 10, 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test08");
        Devide devide0 = new Devide();
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double3 = devide0.devide(0, (int) (short) 0);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test09");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide(0, (int) (short) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test10");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double21 = devide0.devide(0, (int) (short) 0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test11");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) ' ', (int) (short) 0);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test12");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) 'a', 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((int) (short) 10, (int) (byte) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test13");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide((int) (byte) 1, (int) (short) 0);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test14");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) ' ', (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = devide0.devide(0, (int) (short) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test15");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = devide0.devide((int) ' ', (int) (short) 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test16");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (byte) 10, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((int) (short) 100, 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test17");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 0, (int) '4');
        double double6 = devide0.devide((int) ' ', (int) (short) 100);
        double double9 = devide0.devide((int) (short) 100, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((-1), 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test18");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide((int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test19");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) (short) -1, (int) (short) 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test20");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((-1), (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = devide0.devide((int) '4', 0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test21");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide((int) (byte) 100, 10);
        double double15 = devide0.devide((int) (short) 1, 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double18 = devide0.devide(100, (int) (short) 0);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test22");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double12 = devide0.devide(1, (int) '4');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = devide0.devide((int) (short) 0, 0);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test23");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) -1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = devide0.devide((int) ' ', 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test24");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (byte) 10, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide((int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test25");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        double double6 = devide0.devide(100, 100);
        double double9 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((int) (byte) 0, 0);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test26");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) '4');
        double double6 = devide0.devide((int) (byte) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test27");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = devide0.devide(0, 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test28");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double33 = devide0.devide(0, (int) (short) 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test29");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double21 = devide0.devide((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test30");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(0, (int) (byte) 1);
        double double27 = devide0.devide((int) (short) 0, (int) (short) 10);
        double double30 = devide0.devide((int) '#', (int) (short) 10);
        double double33 = devide0.devide((int) '#', (int) '4');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double36 = devide0.devide((int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test31");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide((int) (byte) 1, 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test32");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide(100, 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test33");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide(0, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((int) '#', (int) (short) 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test34");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) -1, (int) (byte) -1);
        double double6 = devide0.devide((int) (byte) 100, (int) '4');
        double double9 = devide0.devide((int) (short) -1, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((int) ' ', (int) (short) 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test35");
        Devide devide0 = new Devide();
        double double3 = devide0.devide(0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) (short) 1, (int) (short) 0);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test36");
        Devide devide0 = new Devide();
        double double3 = devide0.devide(0, (int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide(1, 0);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test37");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (short) -1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = devide0.devide((int) ' ', (int) (byte) 0);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test38");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide(0, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide(100, (int) (byte) 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test39");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) (byte) -1, (int) 'a');
        double double12 = devide0.devide(1, 1);
        double double15 = devide0.devide(0, (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double18 = devide0.devide(0, 0);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test40");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (short) 10, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((-1), (int) (short) 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test41");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide(1, (int) (short) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test42");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide((int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test43");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) ' ', (int) 'a');
        double double24 = devide0.devide((int) ' ', (int) (short) -1);
        double double27 = devide0.devide(0, (int) ' ');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((int) '4', 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test44");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) 100, (int) (byte) 100);
        double double21 = devide0.devide((int) '#', (int) (short) 100);
        double double24 = devide0.devide((int) ' ', (int) (byte) 1);
        double double27 = devide0.devide(10, (int) (byte) 100);
        double double30 = devide0.devide((int) (byte) 1, (int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double33 = devide0.devide((int) 'a', (int) (byte) 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test45");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((-1), (int) (byte) -1);
        double double6 = devide0.devide(0, 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide(1, (int) (byte) 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test46");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((-1), (int) (byte) -1);
        double double21 = devide0.devide((int) (short) 100, (-1));
        double double24 = devide0.devide((int) (short) 100, (int) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide((int) (short) 1, 0);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test47");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide((-1), (int) '4');
        double double27 = devide0.devide((int) (byte) 0, (int) '#');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((int) '#', 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test48");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) 0, (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide((int) (byte) -1, (int) (byte) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test49");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 100);
        double double21 = devide0.devide((int) (short) 1, (int) (byte) 1);
        double double24 = devide0.devide(1, 10);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double27 = devide0.devide((int) (byte) 1, 0);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test50");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, (int) (byte) 100);
        double double24 = devide0.devide((int) (byte) -1, (int) (short) 10);
        double double27 = devide0.devide((int) (short) 0, (int) 'a');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((int) (short) 0, (int) (short) 0);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test51");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) 100, (int) 'a');
        double double6 = devide0.devide((int) (short) 10, (int) (byte) 1);
        double double9 = devide0.devide((int) '4', (int) '#');
        double double12 = devide0.devide((int) (byte) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = devide0.devide((int) (short) -1, 0);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test52");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (byte) 100, 100);
        double double24 = devide0.devide((int) 'a', (int) (short) 1);
        double double27 = devide0.devide((-1), 1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide(100, 0);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test53");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (short) 1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = devide0.devide(10, 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test54");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (short) 0, (int) 'a');
        double double27 = devide0.devide(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide(0, (int) (byte) 0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test55");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) (byte) -1, (int) (byte) 10);
        double double6 = devide0.devide(100, (int) 'a');
        double double9 = devide0.devide(0, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = devide0.devide((int) (byte) 10, (int) (byte) 0);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test56");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide(100, 10);
        double double12 = devide0.devide(0, (int) (byte) 100);
        double double15 = devide0.devide((int) (short) -1, (int) '#');
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double18 = devide0.devide((int) (byte) 1, (int) (byte) 0);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test57");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) 'a', (-1));
        double double6 = devide0.devide((int) (short) 100, 100);
        double double9 = devide0.devide((int) ' ', (int) '#');
        double double12 = devide0.devide((int) (byte) 10, (int) (short) 10);
        double double15 = devide0.devide((int) ' ', (int) (byte) 1);
        double double18 = devide0.devide((int) (short) -1, (int) (byte) 10);
        double double21 = devide0.devide((int) (short) 10, (int) (byte) 100);
        double double24 = devide0.devide((int) (short) 0, (int) 'a');
        double double27 = devide0.devide(0, (int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double30 = devide0.devide((int) (byte) 0, 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideErrTester0.test58");
        Devide devide0 = new Devide();
        double double3 = devide0.devide((int) ' ', 100);
        double double6 = devide0.devide((int) (byte) 1, (int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = devide0.devide((int) (short) 10, (int) (short) 0);
    }
}


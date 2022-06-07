import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ObserverErrTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test01");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) (byte) 100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test02");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop5.devide((int) '4');
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test03");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop5.devide((int) (byte) 0);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test04");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) ' ');
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test05");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop9.devide((int) (short) -1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test06");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide((int) '4');
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test07");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        observer.Updater updater12 = new observer.Updater((double) (byte) 1);
        updater12.updateVersion(10.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        observer.Updater updater17 = new observer.Updater((double) (byte) 1);
        updater17.updateVersion(10.0d);
        observer.Desktop desktop20 = new observer.Desktop(updater17);
        updater12.attach((observer.Device) desktop20);
        updater1.attach((observer.Device) desktop20);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = desktop20.devide(100);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test08");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop5.devide(100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test09");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide(100);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test10");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        observer.Updater updater8 = new observer.Updater((double) (byte) 1);
        updater8.updateVersion(10.0d);
        observer.Desktop desktop11 = new observer.Desktop(updater8);
        observer.Desktop desktop12 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop12);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = desktop12.devide(0);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test11");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide((int) (short) 100);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test12");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) (short) 0);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test13");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop13);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop13.devide(100);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test14");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) '#');
        observer.Updater updater8 = new observer.Updater((double) (byte) 1);
        updater8.updateVersion(10.0d);
        observer.Desktop desktop11 = new observer.Desktop(updater8);
        observer.Desktop desktop12 = new observer.Desktop(updater8);
        updater1.attach((observer.Device) desktop12);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = desktop12.devide((int) (byte) 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test15");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop13);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop13.devide((int) (byte) 1);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test16");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion(0.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = desktop4.devide(100);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test17");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = desktop4.devide(1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test18");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide(10);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test19");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop14.devide((int) ' ');
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test20");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        observer.Updater updater12 = new observer.Updater((double) (byte) 1);
        updater12.updateVersion(10.0d);
        observer.Laptop laptop15 = new observer.Laptop(updater12);
        observer.Updater updater17 = new observer.Updater((double) (byte) 1);
        updater17.updateVersion(10.0d);
        observer.Desktop desktop20 = new observer.Desktop(updater17);
        updater12.attach((observer.Device) desktop20);
        updater1.attach((observer.Device) desktop20);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double24 = desktop20.devide(0);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test21");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) (byte) 100);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test22");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide(1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test23");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) 'a');
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test24");
        observer.Updater updater1 = new observer.Updater((double) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) (byte) 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test25");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop5.devide((int) (short) 100);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test26");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide((int) (byte) 1);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test27");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 1L);
        observer.Updater updater7 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop10.devide(0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test28");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) (short) 0);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test29");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide((int) ' ');
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test30");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = desktop4.devide((int) (byte) -1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test31");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double14 = desktop12.devide((int) (byte) 10);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test32");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide((int) (byte) 0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test33");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        updater1.updateVersion((double) (short) 0);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = desktop13.devide((int) (byte) 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test34");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide((int) (short) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test35");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) ' ');
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test36");
        observer.Updater updater1 = new observer.Updater((double) 1);
        observer.Updater updater3 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        observer.Laptop laptop5 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop5);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide(1);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test37");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) (short) 100);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test38");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop9.devide(0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test39");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        updater7.updateVersion((double) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion((double) 0L);
        updater11.updateVersion(0.0d);
        updater11.updateVersion(0.0d);
        updater11.updateVersion((double) 100);
        observer.Laptop laptop20 = new observer.Laptop(updater11);
        updater7.attach((observer.Device) laptop20);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        updater23.updateVersion((double) 10);
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        updater27.updateVersion((double) 0L);
        updater27.updateVersion(0.0d);
        updater27.updateVersion(0.0d);
        updater27.updateVersion((double) 100);
        observer.Laptop laptop36 = new observer.Laptop(updater27);
        updater23.attach((observer.Device) laptop36);
        observer.Updater updater39 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop40 = new observer.Laptop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Updater updater44 = new observer.Updater((double) 100L);
        observer.Desktop desktop45 = new observer.Desktop(updater44);
        observer.Updater updater47 = new observer.Updater((double) 100L);
        observer.Desktop desktop48 = new observer.Desktop(updater47);
        updater44.attach((observer.Device) desktop48);
        observer.Desktop desktop50 = new observer.Desktop(updater44);
        updater42.attach((observer.Device) desktop50);
        updater39.attach((observer.Device) desktop50);
        updater23.attach((observer.Device) desktop50);
        updater7.attach((observer.Device) desktop50);
        updater1.attach((observer.Device) desktop50);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double57 = desktop50.devide((int) (short) 1);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test40");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((-1.0d));
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop8 = new observer.Desktop(updater1);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide(10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test41");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) '4');
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test42");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide(1);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test43");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop13);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop13.devide((int) (short) 0);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test44");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop9);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop9.devide((int) (short) 0);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test45");
        observer.Updater updater1 = new observer.Updater((double) 100);
        updater1.updateVersion((double) (byte) 100);
        updater1.updateVersion((double) (byte) 100);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide((int) '4');
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test46");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 1.0f);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) (short) 10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test47");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) (byte) 0);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test48");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double50 = desktop44.devide((int) (byte) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test49");
        observer.Updater updater1 = new observer.Updater((double) (-1));
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) ' ');
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test50");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = desktop13.devide((int) (short) 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test51");
        observer.Updater updater1 = new observer.Updater((double) 0.0f);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide((int) '#');
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test52");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) (byte) 1);
        updater6.updateVersion(10.0d);
        observer.Desktop desktop9 = new observer.Desktop(updater6);
        updater1.attach((observer.Device) desktop9);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop9.devide((int) (short) 10);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test53");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Updater updater50 = new observer.Updater((double) 100L);
        observer.Desktop desktop51 = new observer.Desktop(updater50);
        observer.Updater updater53 = new observer.Updater((double) 100L);
        observer.Desktop desktop54 = new observer.Desktop(updater53);
        updater50.attach((observer.Device) desktop54);
        observer.Desktop desktop56 = new observer.Desktop(updater50);
        updater1.attach((observer.Device) desktop56);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double59 = desktop56.devide((int) (short) 0);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test54");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double4 = desktop2.devide(0);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test55");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Desktop desktop6 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop6.devide(1);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test56");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        updater7.updateVersion((double) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion((double) 0L);
        updater11.updateVersion(0.0d);
        updater11.updateVersion(0.0d);
        updater11.updateVersion((double) 100);
        observer.Laptop laptop20 = new observer.Laptop(updater11);
        updater7.attach((observer.Device) laptop20);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        updater23.updateVersion((double) 10);
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        updater27.updateVersion((double) 0L);
        updater27.updateVersion(0.0d);
        updater27.updateVersion(0.0d);
        updater27.updateVersion((double) 100);
        observer.Laptop laptop36 = new observer.Laptop(updater27);
        updater23.attach((observer.Device) laptop36);
        observer.Updater updater39 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop40 = new observer.Laptop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Updater updater44 = new observer.Updater((double) 100L);
        observer.Desktop desktop45 = new observer.Desktop(updater44);
        observer.Updater updater47 = new observer.Updater((double) 100L);
        observer.Desktop desktop48 = new observer.Desktop(updater47);
        updater44.attach((observer.Device) desktop48);
        observer.Desktop desktop50 = new observer.Desktop(updater44);
        updater42.attach((observer.Device) desktop50);
        updater39.attach((observer.Device) desktop50);
        updater23.attach((observer.Device) desktop50);
        updater7.attach((observer.Device) desktop50);
        updater1.attach((observer.Device) desktop50);
        observer.Updater updater57 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop58 = new observer.Laptop(updater57);
        observer.Desktop desktop59 = new observer.Desktop(updater57);
        updater1.attach((observer.Device) desktop59);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double62 = desktop59.devide((int) (byte) -1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test57");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        updater1.updateVersion((double) (short) 1);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Desktop desktop20 = new observer.Desktop(updater17);
        updater17.updateVersion((double) (short) 100);
        observer.Desktop desktop23 = new observer.Desktop(updater17);
        updater1.attach((observer.Device) desktop23);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double26 = desktop23.devide(100);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test58");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop18 = new observer.Laptop(updater17);
        observer.Updater updater20 = new observer.Updater((double) 100L);
        observer.Updater updater22 = new observer.Updater((double) 100L);
        observer.Desktop desktop23 = new observer.Desktop(updater22);
        observer.Updater updater25 = new observer.Updater((double) 100L);
        observer.Desktop desktop26 = new observer.Desktop(updater25);
        updater22.attach((observer.Device) desktop26);
        observer.Desktop desktop28 = new observer.Desktop(updater22);
        updater20.attach((observer.Device) desktop28);
        updater17.attach((observer.Device) desktop28);
        updater1.attach((observer.Device) desktop28);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double33 = desktop28.devide((-1));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test59");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Desktop desktop5 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double7 = desktop5.devide((int) (short) -1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test60");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double6 = desktop4.devide((int) (byte) 10);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test61");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        observer.Laptop laptop7 = new observer.Laptop(updater1);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(100.0d);
        observer.Desktop desktop12 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double14 = desktop12.devide((int) (byte) 10);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test62");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Desktop desktop4 = new observer.Desktop(updater3);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        updater3.attach((observer.Device) desktop7);
        observer.Desktop desktop9 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop9);
        updater1.updateVersion((double) (-1));
        observer.Desktop desktop13 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double15 = desktop13.devide((int) (short) 10);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test63");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Laptop laptop4 = new observer.Laptop(updater1);
        observer.Updater updater6 = new observer.Updater((double) '#');
        observer.Laptop laptop7 = new observer.Laptop(updater6);
        observer.Laptop laptop8 = new observer.Laptop(updater6);
        updater1.attach((observer.Device) laptop8);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        updater11.updateVersion((double) 10);
        observer.Desktop desktop14 = new observer.Desktop(updater11);
        updater11.updateVersion((double) (short) 100);
        observer.Updater updater18 = new observer.Updater((double) 100L);
        updater18.updateVersion((double) 10);
        observer.Updater updater22 = new observer.Updater((double) (byte) 10);
        updater22.updateVersion((double) 0L);
        updater22.updateVersion(0.0d);
        updater22.updateVersion(0.0d);
        updater22.updateVersion((double) 100);
        observer.Laptop laptop31 = new observer.Laptop(updater22);
        updater18.attach((observer.Device) laptop31);
        observer.Updater updater34 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop35 = new observer.Laptop(updater34);
        observer.Updater updater37 = new observer.Updater((double) 100L);
        observer.Updater updater39 = new observer.Updater((double) 100L);
        observer.Desktop desktop40 = new observer.Desktop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Desktop desktop43 = new observer.Desktop(updater42);
        updater39.attach((observer.Device) desktop43);
        observer.Desktop desktop45 = new observer.Desktop(updater39);
        updater37.attach((observer.Device) desktop45);
        updater34.attach((observer.Device) desktop45);
        updater18.attach((observer.Device) desktop45);
        updater11.attach((observer.Device) desktop45);
        updater1.attach((observer.Device) desktop45);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double52 = desktop45.devide((int) '#');
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test64");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Laptop laptop9 = new observer.Laptop(updater1);
        updater1.updateVersion((double) 10);
        updater1.updateVersion((double) (byte) 1);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop14.devide((int) (byte) 1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test65");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        updater1.updateVersion((double) 1L);
        observer.Updater updater7 = new observer.Updater((double) (short) 10);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop8);
        observer.Desktop desktop10 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double12 = desktop10.devide((int) (byte) -1);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test66");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        observer.Desktop desktop2 = new observer.Desktop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Desktop desktop5 = new observer.Desktop(updater4);
        updater1.attach((observer.Device) desktop5);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double8 = desktop5.devide(10);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test67");
        observer.Updater updater1 = new observer.Updater((double) '#');
        observer.Updater updater3 = new observer.Updater((double) (byte) 1);
        updater3.updateVersion(10.0d);
        observer.Laptop laptop6 = new observer.Laptop(updater3);
        observer.Desktop desktop7 = new observer.Desktop(updater3);
        updater1.attach((observer.Device) desktop7);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double10 = desktop7.devide((int) (short) 10);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test68");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Desktop desktop4 = new observer.Desktop(updater1);
        updater1.updateVersion((double) (short) 100);
        observer.Desktop desktop7 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double9 = desktop7.devide(0);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test69");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        updater1.updateVersion(0.0d);
        updater1.updateVersion((double) 100);
        observer.Updater updater11 = new observer.Updater((double) 100L);
        observer.Laptop laptop12 = new observer.Laptop(updater11);
        updater1.attach((observer.Device) laptop12);
        observer.Desktop desktop14 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop14.devide(0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test70");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Desktop desktop49 = new observer.Desktop(updater1);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        updater51.updateVersion((double) 10);
        observer.Desktop desktop54 = new observer.Desktop(updater51);
        updater51.updateVersion((double) (short) 100);
        updater51.updateVersion(1.0d);
        observer.Laptop laptop59 = new observer.Laptop(updater51);
        updater1.attach((observer.Device) laptop59);
        observer.Desktop desktop61 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double63 = desktop61.devide((int) (short) 100);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test71");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop2 = new observer.Laptop(updater1);
        observer.Updater updater4 = new observer.Updater((double) 100L);
        observer.Updater updater6 = new observer.Updater((double) 100L);
        observer.Desktop desktop7 = new observer.Desktop(updater6);
        observer.Updater updater9 = new observer.Updater((double) 100L);
        observer.Desktop desktop10 = new observer.Desktop(updater9);
        updater6.attach((observer.Device) desktop10);
        observer.Desktop desktop12 = new observer.Desktop(updater6);
        updater4.attach((observer.Device) desktop12);
        updater1.attach((observer.Device) desktop12);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop12.devide((int) (short) 10);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test72");
        observer.Updater updater1 = new observer.Updater((double) (byte) 10);
        updater1.updateVersion((double) 0L);
        updater1.updateVersion(0.0d);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater1.attach((observer.Device) desktop13);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double16 = desktop13.devide((int) (short) 100);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test73");
        observer.Updater updater1 = new observer.Updater((double) 100L);
        updater1.updateVersion((double) 10);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        updater5.updateVersion((double) 0L);
        updater5.updateVersion(0.0d);
        updater5.updateVersion(0.0d);
        updater5.updateVersion((double) 100);
        observer.Laptop laptop14 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop14);
        observer.Updater updater17 = new observer.Updater((double) 100L);
        updater17.updateVersion((double) 10);
        observer.Updater updater21 = new observer.Updater((double) (byte) 10);
        updater21.updateVersion((double) 0L);
        updater21.updateVersion(0.0d);
        updater21.updateVersion(0.0d);
        updater21.updateVersion((double) 100);
        observer.Laptop laptop30 = new observer.Laptop(updater21);
        updater17.attach((observer.Device) laptop30);
        observer.Updater updater33 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop34 = new observer.Laptop(updater33);
        observer.Updater updater36 = new observer.Updater((double) 100L);
        observer.Updater updater38 = new observer.Updater((double) 100L);
        observer.Desktop desktop39 = new observer.Desktop(updater38);
        observer.Updater updater41 = new observer.Updater((double) 100L);
        observer.Desktop desktop42 = new observer.Desktop(updater41);
        updater38.attach((observer.Device) desktop42);
        observer.Desktop desktop44 = new observer.Desktop(updater38);
        updater36.attach((observer.Device) desktop44);
        updater33.attach((observer.Device) desktop44);
        updater17.attach((observer.Device) desktop44);
        updater1.attach((observer.Device) desktop44);
        observer.Desktop desktop49 = new observer.Desktop(updater1);
        observer.Updater updater51 = new observer.Updater((double) 100L);
        updater51.updateVersion((double) 10);
        observer.Desktop desktop54 = new observer.Desktop(updater51);
        updater51.updateVersion((double) (short) 100);
        updater51.updateVersion(1.0d);
        observer.Laptop laptop59 = new observer.Laptop(updater51);
        updater1.attach((observer.Device) laptop59);
        observer.Desktop desktop61 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double63 = desktop61.devide((int) (byte) -1);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test74");
        observer.Updater updater1 = new observer.Updater((double) (byte) 1);
        updater1.updateVersion(10.0d);
        observer.Updater updater5 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop6 = new observer.Laptop(updater5);
        observer.Laptop laptop7 = new observer.Laptop(updater5);
        updater1.attach((observer.Device) laptop7);
        observer.Desktop desktop9 = new observer.Desktop(updater1);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double11 = desktop9.devide((int) (byte) 0);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test75");
        observer.Updater updater1 = new observer.Updater((double) (short) 10);
        observer.Updater updater3 = new observer.Updater((double) 100L);
        observer.Laptop laptop4 = new observer.Laptop(updater3);
        updater1.attach((observer.Device) laptop4);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        updater7.updateVersion((double) 10);
        observer.Updater updater11 = new observer.Updater((double) (byte) 10);
        updater11.updateVersion((double) 0L);
        updater11.updateVersion(0.0d);
        updater11.updateVersion(0.0d);
        updater11.updateVersion((double) 100);
        observer.Laptop laptop20 = new observer.Laptop(updater11);
        updater7.attach((observer.Device) laptop20);
        observer.Updater updater23 = new observer.Updater((double) 100L);
        updater23.updateVersion((double) 10);
        observer.Updater updater27 = new observer.Updater((double) (byte) 10);
        updater27.updateVersion((double) 0L);
        updater27.updateVersion(0.0d);
        updater27.updateVersion(0.0d);
        updater27.updateVersion((double) 100);
        observer.Laptop laptop36 = new observer.Laptop(updater27);
        updater23.attach((observer.Device) laptop36);
        observer.Updater updater39 = new observer.Updater((double) (short) 10);
        observer.Laptop laptop40 = new observer.Laptop(updater39);
        observer.Updater updater42 = new observer.Updater((double) 100L);
        observer.Updater updater44 = new observer.Updater((double) 100L);
        observer.Desktop desktop45 = new observer.Desktop(updater44);
        observer.Updater updater47 = new observer.Updater((double) 100L);
        observer.Desktop desktop48 = new observer.Desktop(updater47);
        updater44.attach((observer.Device) desktop48);
        observer.Desktop desktop50 = new observer.Desktop(updater44);
        updater42.attach((observer.Device) desktop50);
        updater39.attach((observer.Device) desktop50);
        updater23.attach((observer.Device) desktop50);
        updater7.attach((observer.Device) desktop50);
        updater1.attach((observer.Device) desktop50);
        observer.Updater updater57 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop58 = new observer.Laptop(updater57);
        observer.Desktop desktop59 = new observer.Desktop(updater57);
        updater1.attach((observer.Device) desktop59);
        observer.Updater updater62 = new observer.Updater((double) 100L);
        observer.Desktop desktop63 = new observer.Desktop(updater62);
        observer.Laptop laptop64 = new observer.Laptop(updater62);
        observer.Updater updater66 = new observer.Updater((double) (byte) 10);
        observer.Laptop laptop67 = new observer.Laptop(updater66);
        updater62.attach((observer.Device) laptop67);
        observer.Updater updater70 = new observer.Updater((double) 100L);
        observer.Updater updater72 = new observer.Updater((double) 100L);
        observer.Desktop desktop73 = new observer.Desktop(updater72);
        observer.Updater updater75 = new observer.Updater((double) 100L);
        observer.Desktop desktop76 = new observer.Desktop(updater75);
        updater72.attach((observer.Device) desktop76);
        observer.Desktop desktop78 = new observer.Desktop(updater72);
        updater70.attach((observer.Device) desktop78);
        observer.Updater updater81 = new observer.Updater((double) (byte) 1);
        updater81.updateVersion(10.0d);
        observer.Laptop laptop84 = new observer.Laptop(updater81);
        observer.Updater updater86 = new observer.Updater((double) (byte) 1);
        updater86.updateVersion(10.0d);
        observer.Desktop desktop89 = new observer.Desktop(updater86);
        updater81.attach((observer.Device) desktop89);
        updater70.attach((observer.Device) desktop89);
        updater62.attach((observer.Device) desktop89);
        updater1.attach((observer.Device) desktop89);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double95 = desktop89.devide((int) (short) -1);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ObserverErrTester0.test76");
        observer.Updater updater1 = new observer.Updater((double) 0);
        updater1.updateVersion((-1.0d));
        observer.Updater updater5 = new observer.Updater((double) 100L);
        observer.Updater updater7 = new observer.Updater((double) 100L);
        observer.Desktop desktop8 = new observer.Desktop(updater7);
        observer.Updater updater10 = new observer.Updater((double) 100L);
        observer.Desktop desktop11 = new observer.Desktop(updater10);
        updater7.attach((observer.Device) desktop11);
        observer.Desktop desktop13 = new observer.Desktop(updater7);
        updater5.attach((observer.Device) desktop13);
        observer.Updater updater16 = new observer.Updater((double) (byte) 1);
        updater16.updateVersion(10.0d);
        observer.Laptop laptop19 = new observer.Laptop(updater16);
        observer.Updater updater21 = new observer.Updater((double) (byte) 1);
        updater21.updateVersion(10.0d);
        observer.Desktop desktop24 = new observer.Desktop(updater21);
        updater16.attach((observer.Device) desktop24);
        updater5.attach((observer.Device) desktop24);
        updater1.attach((observer.Device) desktop24);
        // during test generation this statement threw an exception of type java.lang.ArithmeticException in error
        double double29 = desktop24.devide((int) '#');
    }
}


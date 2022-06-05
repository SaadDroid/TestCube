import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DevideByZeroTester0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideByZeroTester0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "DevideByZeroTester0.test2");
        DevideByZero devideByZero0 = new DevideByZero();
        java.lang.Class<?> wildcardClass1 = devideByZero0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


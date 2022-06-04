import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        int int0 = 630;
        int int1 = Math.sum(int0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == int0 * (int0 + 1) / 2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        int int0 = 0;
        int int1 = Math.sum(int0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == int0 * (int0 + 1) / 2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        char char0 = '4';
        int int1 = Math.sum((int) char0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == char0 * (char0 + 1) / 2);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        byte byte0 = (byte) 0;
        int int1 = Math.sum((int) byte0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == byte0 * (byte0 + 1) / 2);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        byte byte0 = (byte) 10;
        int int1 = Math.sum((int) byte0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == byte0 * (byte0 + 1) / 2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        int int0 = 10;
        int int1 = Math.sum(int0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == int0 * (int0 + 1) / 2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        int int0 = 100;
        int int1 = Math.sum(int0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == int0 * (int0 + 1) / 2);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        char char0 = ' ';
        int int1 = Math.sum((int) char0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == char0 * (char0 + 1) / 2);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        byte byte0 = (byte) 100;
        int int1 = Math.sum((int) byte0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == byte0 * (byte0 + 1) / 2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        short short0 = (short) 0;
        int int1 = Math.sum((int) short0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == short0 * (short0 + 1) / 2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        short short0 = (short) 10;
        int int1 = Math.sum((int) short0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == short0 * (short0 + 1) / 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        int int0 = 11297881;
        int int1 = Math.sum(int0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == int0 * (int0 + 1) / 2);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        short short0 = (short) 100;
        int int1 = Math.sum((int) short0);
        // Checks the post-condition:
        org.junit.Assert.assertTrue("Post-condition: ", int1 == short0 * (short0 + 1) / 2);
    }
}


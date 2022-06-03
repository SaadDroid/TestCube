import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testSaadTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test01");
        testSaad testSaad0 = new testSaad();
        java.lang.Class<?> wildcardClass1 = testSaad0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test02");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test03");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.Class<?> wildcardClass7 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test04");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.Class<?> wildcardClass10 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test05");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.Class<?> wildcardClass4 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test06");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.Class<?> wildcardClass10 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test07");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.Class<?> wildcardClass13 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test08");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!");
        java.lang.Class<?> wildcardClass13 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!" + "'", str12, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test09");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!", "hi!");
        java.lang.String str21 = testSaad0.sakib("hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!" + "'", str18, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test10");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test11");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!hi!");
        java.lang.Class<?> wildcardClass13 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!" + "'", str12, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test12");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str15 = testSaad0.sakib("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!" + "'", str12, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test13");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!", "hi!");
        java.lang.Class<?> wildcardClass19 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!" + "'", str18, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test14");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!hi!", "hi!hi!");
        java.lang.Class<?> wildcardClass19 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test15");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!", "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test16");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.Class<?> wildcardClass16 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test17");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!", "hi!");
        java.lang.String str21 = testSaad0.sakib("hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass22 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!" + "'", str18, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test18");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        java.lang.Class<?> wildcardClass13 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test19");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass10 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test20");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass10 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test21");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass7 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test22");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass10 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test23");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test24");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test25");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!");
        java.lang.Class<?> wildcardClass13 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!" + "'", str12, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test26");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test27");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!", "");
        java.lang.Class<?> wildcardClass7 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test28");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test29");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str15 = testSaad0.sakib("hi!", "hi!hi!hi!");
        java.lang.Class<?> wildcardClass16 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!" + "'", str12, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test30");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.Class<?> wildcardClass7 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test31");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str12 = testSaad0.sakib("hi!", "");
        java.lang.String str15 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str18 = testSaad0.sakib("hi!hi!hi!", "hi!hi!");
        java.lang.String str21 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str21, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test32");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!" + "'", str6, "hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test33");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!");
        java.lang.String str15 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test34");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test35");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str12 = testSaad0.sakib("", "hi!hi!");
        java.lang.String str15 = testSaad0.sakib("hi!", "hi!hi!hi!");
        java.lang.String str18 = testSaad0.sakib("hi!hi!hi!hi!", "");
        java.lang.Class<?> wildcardClass19 = testSaad0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!" + "'", str9, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!" + "'", str12, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!hi!hi!hi!" + "'", str18, "hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test36");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("", "");
        java.lang.String str6 = testSaad0.sakib("hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str6, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test37");
        testSaad testSaad0 = new testSaad();
        java.lang.String str3 = testSaad0.sakib("hi!", "hi!");
        java.lang.String str6 = testSaad0.sakib("hi!hi!", "");
        java.lang.String str9 = testSaad0.sakib("hi!hi!hi!", "hi!hi!hi!hi!hi!hi!");
        java.lang.String str12 = testSaad0.sakib("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!" + "'", str6, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str9, "hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str12, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "testSaadTester0.test38");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TalkRegTester0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test002");
        Talk talk0 = new Talk();
        java.lang.Class<?> wildcardClass1 = talk0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test003");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test004");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test005");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test006");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test007");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test008");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test009");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test010");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test011");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test012");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test013");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test014");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test015");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass3 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test016");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test017");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test018");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test019");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass3 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test020");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test021");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test022");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test023");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test024");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test025");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test026");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test027");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test028");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test029");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test030");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test031");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test032");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test033");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test034");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test035");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test036");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test037");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test038");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test039");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test040");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str26, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test041");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test042");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test043");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test044");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test045");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test046");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test047");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test048");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test049");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test050");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test051");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test052");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test053");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test054");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test055");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str20, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test056");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str4 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test057");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test058");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test059");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test060");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str4 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test061");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test062");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test063");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test064");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test065");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test066");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test067");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test068");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test069");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test070");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test071");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test072");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test073");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test074");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test075");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test076");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test077");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test078");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test079");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test080");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test081");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass31 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test082");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str28, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test083");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test084");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str10, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test085");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test086");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test087");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test088");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str24, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test089");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str12, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test090");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test091");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str14, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test092");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test093");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass31 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str30, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test094");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test095");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test096");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test097");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test098");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str10, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test099");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test100");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass31 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test101");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str24, "Hellohi!!\n Hope You're having a good day!");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test102");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test103");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test104");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test105");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test106");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test107");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass3 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test108");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test109");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test110");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test111");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test112");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test113");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test114");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str26, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test115");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test116");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str28, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test117");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test118");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test119");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.String str20 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str20, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test120");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test121");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test122");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test123");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test124");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test125");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass33 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test126");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str20, "Hello!\n Hope You're having a good day!");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test127");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test128");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test129");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test130");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass7 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str6, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test131");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test132");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test133");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test134");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test135");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test136");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test137");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test138");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test139");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test140");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test141");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass31 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test142");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test143");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str34 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str34, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test144");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("hi!");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str24, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test145");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test146");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test147");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test148");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test149");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test150");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str12, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test151");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test152");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test153");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test154");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test155");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test156");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test157");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test158");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test159");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str34 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass35 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str34, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test160");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass29 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str28, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test161");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass25 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test162");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("hi!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str10, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test163");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass5 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test164");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass23 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test165");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass21 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test166");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test167");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("");
        java.lang.Class<?> wildcardClass15 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str14, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test168");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("hi!");
        java.lang.String str24 = talk0.sayHello("");
        java.lang.String str26 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass27 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str22, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str24, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test169");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test170");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test171");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test172");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test173");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass11 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test174");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test175");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.String str20 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test176");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test177");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str2, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test178");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test179");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test180");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str34 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass35 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str34, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test181");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test182");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.Class<?> wildcardClass13 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test183");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test184");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test185");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str10, "Hello!\n Hope You're having a good day!");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test186");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str34 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str36 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str34, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str36, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test187");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test188");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("hi!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str4, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test189");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test190");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test191");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test192");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test193");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test194");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test195");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.String str20 = talk0.sayHello("");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str20, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test196");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass9 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test197");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test198");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test199");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass19 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test200");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("");
        java.lang.String str20 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str18, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str22, "Hello!\n Hope You're having a good day!");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test201");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test202");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.Class<?> wildcardClass17 = talk0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test203");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("");
        java.lang.String str32 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str30, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test204");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str4, "HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test205");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test206");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("");
        java.lang.String str14 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str12, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str14, "HelloHelloHelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test207");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("HelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str20 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str18, "HelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test208");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("");
        java.lang.String str8 = talk0.sayHello("");
        java.lang.String str10 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str18 = talk0.sayHello("hi!");
        java.lang.String str20 = talk0.sayHello("HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str22 = talk0.sayHello("HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str24 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        java.lang.String str26 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str28 = talk0.sayHello("HelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str30 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str32 = talk0.sayHello("HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str34 = talk0.sayHello("HelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str6, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str8, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str12, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str18, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str20, "HelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str22, "HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str24, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str26, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str28, "HelloHelloHelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str30, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str32, "HelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str34, "HelloHelloHelloHelloHelloHelloHelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "TalkRegTester0.test209");
        Talk talk0 = new Talk();
        java.lang.String str2 = talk0.sayHello("hi!");
        java.lang.String str4 = talk0.sayHello("");
        java.lang.String str6 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str8 = talk0.sayHello("Hellohi!!\n Hope You're having a good day!");
        java.lang.String str10 = talk0.sayHello("HelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        java.lang.String str12 = talk0.sayHello("hi!");
        java.lang.String str14 = talk0.sayHello("hi!");
        java.lang.String str16 = talk0.sayHello("Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str2, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hello!\n Hope You're having a good day!" + "'", str4, "Hello!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str6, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str8, "HelloHellohi!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str10, "HelloHelloHelloHelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str12, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hellohi!!\n Hope You're having a good day!" + "'", str14, "Hellohi!!\n Hope You're having a good day!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!" + "'", str16, "HelloHello!\n Hope You're having a good day!!\n Hope You're having a good day!");
    }
}


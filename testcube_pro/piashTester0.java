import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class piashTester0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test01");
        piash piash0 = new piash();
        java.lang.Class<?> wildcardClass1 = piash0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test02");
        int int2 = piash.sum((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test03");
        int int2 = piash.sum((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test04");
        int int2 = piash.sum((int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test05");
        int int2 = piash.sum(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test06");
        int int2 = piash.sum((int) '4', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test07");
        int int2 = piash.sum((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test08");
        int int2 = piash.sum(100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test09");
        int int2 = piash.sum((int) (byte) -1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test10");
        int int2 = piash.sum(52, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test11");
        int int2 = piash.sum((int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test12");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test13");
        int int2 = piash.sum((int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 152 + "'", int2 == 152);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test14");
        int int2 = piash.sum((int) (short) 100, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test15");
        int int2 = piash.sum(0, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test16");
        int int2 = piash.sum((int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test17");
        int int2 = piash.sum((-1), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test18");
        int int2 = piash.sum(96, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 195 + "'", int2 == 195);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test19");
        int int2 = piash.sum((int) (short) 100, 195);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 295 + "'", int2 == 295);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test20");
        int int2 = piash.sum(51, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test21");
        int int2 = piash.sum((int) (byte) 100, 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test22");
        int int2 = piash.sum((int) (short) 1, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test23");
        int int2 = piash.sum(99, 295);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 394 + "'", int2 == 394);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test24");
        int int2 = piash.sum(96, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131 + "'", int2 == 131);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test25");
        int int2 = piash.sum((int) ' ', 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test26");
        int int2 = piash.sum((int) (short) 1, 295);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296 + "'", int2 == 296);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test27");
        int int2 = piash.sum((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test28");
        int int2 = piash.sum((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test29");
        int int2 = piash.sum(51, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test30");
        int int2 = piash.sum((int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107 + "'", int2 == 107);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test31");
        int int2 = piash.sum(195, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 227 + "'", int2 == 227);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test32");
        int int2 = piash.sum(64, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 164 + "'", int2 == 164);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test33");
        int int2 = piash.sum((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test34");
        int int2 = piash.sum(195, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 259 + "'", int2 == 259);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test35");
        int int2 = piash.sum((int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129 + "'", int2 == 129);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test36");
        int int2 = piash.sum((int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51 + "'", int2 == 51);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test37");
        int int2 = piash.sum(1, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test38");
        int int2 = piash.sum((int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test39");
        int int2 = piash.sum(296, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 395 + "'", int2 == 395);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test40");
        int int2 = piash.sum(100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test41");
        int int2 = piash.sum(252, 129);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 381 + "'", int2 == 381);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test42");
        int int2 = piash.sum(381, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 477 + "'", int2 == 477);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test43");
        int int2 = piash.sum(107, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 106 + "'", int2 == 106);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test44");
        int int2 = piash.sum(395, 296);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 691 + "'", int2 == 691);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test45");
        int int2 = piash.sum((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test46");
        int int2 = piash.sum(53, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test47");
        int int2 = piash.sum((int) (byte) 10, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test48");
        int int2 = piash.sum(0, 252);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 252 + "'", int2 == 252);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test49");
        int int2 = piash.sum(295, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 294 + "'", int2 == 294);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test50");
        int int2 = piash.sum(64, 295);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 359 + "'", int2 == 359);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test51");
        int int2 = piash.sum(359, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 358 + "'", int2 == 358);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test52");
        int int2 = piash.sum((int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test53");
        int int2 = piash.sum(64, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 117 + "'", int2 == 117);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test54");
        int int2 = piash.sum((int) 'a', 477);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 574 + "'", int2 == 574);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test55");
        int int2 = piash.sum(2, 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test56");
        int int2 = piash.sum(129, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 229 + "'", int2 == 229);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test57");
        int int2 = piash.sum((-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test58");
        int int2 = piash.sum((int) (short) 1, 229);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 230 + "'", int2 == 230);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test59");
        int int2 = piash.sum((int) (short) 10, 51);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61 + "'", int2 == 61);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test60");
        int int2 = piash.sum(117, 296);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 413 + "'", int2 == 413);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test61");
        int int2 = piash.sum(227, 152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 379 + "'", int2 == 379);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test62");
        int int2 = piash.sum(117, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 149 + "'", int2 == 149);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test63");
        int int2 = piash.sum(413, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 413 + "'", int2 == 413);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test64");
        int int2 = piash.sum(11, 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test65");
        int int2 = piash.sum(11, 296);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 307 + "'", int2 == 307);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test66");
        int int2 = piash.sum(381, 259);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test67");
        int int2 = piash.sum(0, 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test68");
        int int2 = piash.sum(0, 131);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131 + "'", int2 == 131);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test69");
        int int2 = piash.sum(117, 252);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 369 + "'", int2 == 369);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test70");
        int int2 = piash.sum(227, 195);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 422 + "'", int2 == 422);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test71");
        int int2 = piash.sum((int) ' ', 395);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 427 + "'", int2 == 427);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test72");
        int int2 = piash.sum(394, 149);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 543 + "'", int2 == 543);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test73");
        int int2 = piash.sum(50, 574);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 624 + "'", int2 == 624);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test74");
        int int2 = piash.sum(296, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 393 + "'", int2 == 393);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "piashTester0.test75");
        int int2 = piash.sum(640, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 642 + "'", int2 == 642);
    }
}


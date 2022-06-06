public static String longToIp(long ipLong) {
        long[] ipNumbers = new long[4];
        long tmp = 0xFF;
        ipNumbers[0] = ipLong >> 24 & tmp;
        ipNumbers[1] = ipLong >> 16 & tmp;
        ipNumbers[2] = ipLong >> 8 & tmp;
        ipNumbers[3] = ipLong & tmp;

        return ipNumbers[0] + DOT
                + ipNumbers[1] + DOT
                + ipNumbers[2] + DOT
                + ipNumbers[3];
    }

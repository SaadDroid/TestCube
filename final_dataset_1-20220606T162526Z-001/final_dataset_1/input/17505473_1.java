public static long parse(String ipAddress) {
        long num = 0L;

        String[] array = StringUtils.split(ipAddress, ".", 4);
        for (int i = 0; i < 4; i++) {
            num = num * 256;
            num += Long.parseLong(array[i]);
        }

        return num;
    }

public static String repeat(char value, int n) {
        return new String(new char[n]).replace("\0", String.valueOf(value));
    }

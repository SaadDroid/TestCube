public static boolean isSameStr(String a, String b) {
        if (a == null && b != null) {
            return false;
        }

        if (a == null && b == null) {
            return true;
        }

        return a.equals(b);
    }

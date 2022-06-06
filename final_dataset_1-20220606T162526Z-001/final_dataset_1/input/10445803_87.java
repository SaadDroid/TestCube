public static String getSimpleName(Class<?> c) {
        if (c.getEnclosingClass() == null) {
            return c.getSimpleName();
        } else {
            return prefixSimpleName(new StringBuilder(), c).toString();
        }
    }

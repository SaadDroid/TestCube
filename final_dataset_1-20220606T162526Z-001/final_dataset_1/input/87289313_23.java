public static void close(final Object... objs) {
        for (final Object obj : objs) {
            close(obj);
        }
    }

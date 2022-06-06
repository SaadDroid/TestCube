@SuppressWarnings("rawtypes")
    public static void closeQuietly(final Collection objs) {
        for (final Object obj : objs) {
            closeQuietly(obj);
        }
    }

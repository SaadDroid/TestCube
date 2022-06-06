public static void close(AbstractImmutableNativeReference ref) {
        if (null == ref) {
            return;
        }
        ref.close();
    }

public static String join(final String base, final String... paths) {
        String target = base;
        for (String path : paths) {
            target = doJoin(target, path);
        }

        return target;
    }

public static ResourcePath path(String path) {
        if (path == null) {
            throw new IllegalArgumentException("Method argument path must not be null");
        }

        if (PLACEHOLDER.matcher(path).find()) {
            return new PathWithPlaceholders(path);
        }
        return new PathWithoutPlaceholders(path);
    }

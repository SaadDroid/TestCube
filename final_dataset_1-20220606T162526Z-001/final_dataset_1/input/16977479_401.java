public static String relativize(String base, String toBeRelativized) throws URISyntaxException {
        if (base == null || toBeRelativized == null) {
            return null;
        }
        return relativize(new URI(base), new URI(toBeRelativized));
    }

public static Loader getLoader(final String key) {
        for (final Loader loader : ServiceLoader.load(Loader.class)) {
            if (key.equals(loader.key())) {
                return loader;
            }
        }
        throw new DiagramGeneratorRuntimeException("no loader found for key " + key, null);
    }

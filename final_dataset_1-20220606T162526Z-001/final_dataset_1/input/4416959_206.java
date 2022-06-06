public <T> T provide(Class<T> objectType, AnnotationProvider annotationProvider, ObjectLocator locator)
    {
        Path path = annotationProvider.getAnnotation(Path.class);

        if (path == null) return null;

        String expanded = symbolSource.expandSymbols(path.value());

        Asset asset = source.getAsset(null, expanded, null);

        return typeCoercer.coerce(asset, objectType);
    }

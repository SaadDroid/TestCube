public static <T extends SchemaInfo> SubjectSchemas<T> with(Collection<T> schemas) {
        return new SubjectSchemas<>(schemas);
    }

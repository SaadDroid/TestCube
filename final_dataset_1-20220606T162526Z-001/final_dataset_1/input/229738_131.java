public static <T extends Annotation> T create(Class<T> annotationType) {
        return create(annotationType, Collections.emptyMap());
    }

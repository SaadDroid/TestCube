public Stream<META> findAllOn(Annotation annotation) {
        return Arrays.stream(annotation.annotationType().getAnnotationsByType(metaAnnotationClass));
    }

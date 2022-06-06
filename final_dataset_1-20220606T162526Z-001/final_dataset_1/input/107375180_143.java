public static BoundProperty getBoundProperty(AnnotatedElement annotatedElement) {
        return findBoundProperty(annotatedElement)
                .orElseThrow(() -> new IllegalArgumentException(
                        String.format("%s has no annotation that defines a %s. You can call "
                                + BoundPropertyAnnotationReader.class.getSimpleName()
                                + "#isBoundPropertyPresent(AnnotatedElement) to safeguard against this.",
                                      annotatedElement,
                                      BoundPropertyCreator.class.getName())));
    }

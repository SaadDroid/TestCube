public boolean hasAnyAnnotation(Method method) {
        return METHOD_TARGET_ANNOTATION_CLASSES.stream()
                .anyMatch(annotationClass -> !findMergedRepeatableAnnotations(method, annotationClass).isEmpty());
    }

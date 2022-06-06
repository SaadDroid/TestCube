public boolean isPresentOn(@CheckForNull Annotation annotation) {
        if (annotation != null) {
            return repeatable
                    ? annotation.annotationType().getAnnotationsByType(metaAnnotationClass).length > 0
                    : annotation.annotationType().isAnnotationPresent(metaAnnotationClass);
        } else {
            return false;
        }
    }

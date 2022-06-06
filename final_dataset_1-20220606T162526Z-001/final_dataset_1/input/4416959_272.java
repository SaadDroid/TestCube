Translator findTranslator(Class propertyType, AnnotationProvider propertyAnnotations)
    {
        Translate annotation = propertyAnnotations.getAnnotation(Translate.class);

        if (annotation != null)
            return translatorSource.get(annotation.value());

        if (propertyType == null)
            return null;

        return translatorSource.findByType(propertyType);
    }

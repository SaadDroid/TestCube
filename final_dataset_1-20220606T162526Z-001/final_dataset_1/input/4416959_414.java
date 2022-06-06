public List<String> buildConstraints(Class propertyType, AnnotationProvider annotationProvider)
    {
        Validate annotation = annotationProvider.getAnnotation(Validate.class);

        if (annotation == null)
            return null;

        //TAP5-520: Commas within regular expressions like {n,m} or {n,} or a\,b .
        //We use Negative Lookahead to avoid matching the case a\,b .
        //We use Positive Lookahead to avoid matching cases {n,m} and {n,}.
        //http://www.regular-expressions.info/lookaround.html
        return Arrays.asList(validatorPattern.split(annotation.value()));
    }

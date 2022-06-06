@Override
    public CategorizationResult reduce(final Collection<? extends CategorizationResult> results) {
        final RowAnnotationFactory annotationFactory = null;
        final Map<String, RowAnnotation> reducedCategories = new LinkedHashMap<>();
        for (final CategorizationResult result : results) {

            final Collection<String> categoryNames = result.getCategoryNames();
            for (final String categoryName : categoryNames) {
                final RowAnnotation partialAnnotation = result.getCategoryRowAnnotation(categoryName);

                final RowAnnotation reducedAnnotation = reducedCategories.get(categoryName);
                if (reducedAnnotation == null) {
                    // adopt the annotation from the partial result
                    final RowAnnotation annotation = _rowAnnotationFactory.createAnnotation();
                    _rowAnnotationFactory.transferAnnotations(partialAnnotation, annotation);

                    reducedCategories.put(categoryName, annotation);
                } else {
                    // add records to the existing annotation
                    _rowAnnotationFactory.transferAnnotations(partialAnnotation, reducedAnnotation);
                }
            }
        }
        return new CategorizationResult(annotationFactory, reducedCategories);
    }

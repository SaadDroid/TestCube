@Override
    @CheckForNull
    protected <PRESENTATION, MODEL> Converter<PRESENTATION, MODEL> findConverter(
            @CheckForNull Class<PRESENTATION> presentationType,
            @CheckForNull Class<MODEL> modelType) {
        @SuppressWarnings("unchecked")
        @CheckForNull
        Converter<PRESENTATION, MODEL> converter = converterFinder.get().stream()
                .filter(Converter.class::isInstance)
                .map(Converter.class::cast)
                .filter(c -> c.getPresentationType().isAssignableFrom(presentationType)
                        && c.getModelType().isAssignableFrom(modelType))
                .findFirst()
                .orElseGet(() -> super.findConverter(presentationType, modelType));
        return converter;
    }

public String getResolvePlaceholderText(final String text) {
        if (placeholderMap.isEmpty()) {
            return text;
        }
        IllegalArgumentException missingException = null;
        for (Entry<String, PropertySourcesPlaceholderConfigurer> entry : placeholderMap.entrySet()) {
            PropertySourcesPropertyResolver propertyResolver;
            try {
                propertyResolver = new PropertySourcesPropertyResolver(entry.getValue().getAppliedPropertySources());
            } catch (final IllegalStateException ex) {
                continue;
            } catch (final NoSuchMethodError ex) {
                try {
                    propertyResolver = getPropertyResolverBeforeSpring4(entry.getValue());
                } catch (final ReflectiveOperationException e) {
                    log.warn("Cannot get placeholder resolver.");
                    return text;
                }
            }
            try {
                return propertyResolver.resolveRequiredPlaceholders(text);
            } catch (final IllegalArgumentException ex) {
                missingException = ex;
            }
        }
        if (null == missingException) {
            return text;
        }
        throw missingException;
    }

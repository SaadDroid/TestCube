@Override
    public Resource createResource(String resourceUrl, final DataCleanerConfiguration tempConfiguration) {
        final Matcher matcher = HadoopResourceBuilder.RESOURCE_SCHEME_PATTERN.matcher(resourceUrl);
        if (matcher.find()) {
            resourceUrl = matcher.group(1) + "://" + matcher.group(3);
        }
        final URI uri = URI.create(resourceUrl);
        return _hdfsHelper.getResourceToUse(uri);
    }

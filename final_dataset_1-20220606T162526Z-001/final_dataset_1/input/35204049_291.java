@Override
    public Result getResources(Request request) throws InvalidQueryException, ResourceNotFoundException {
        synchronized (TaxonomyResourceProvider.class) {
            createDefaultTaxonomyIfNeeded();
        }
        return doGetResources(request);
    }

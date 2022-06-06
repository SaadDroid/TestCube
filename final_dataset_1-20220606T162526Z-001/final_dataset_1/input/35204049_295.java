@Override
    public void createResource(Request request)
            throws InvalidPayloadException, ResourceAlreadyExistsException {

        // not checking for default taxonomy in create per requirements
        resourceDefinition.validateCreatePayload(request);
        synchronized (TaxonomyResourceProvider.class) {
            ensureTaxonomyDoesntExist(request);
            doCreateResource(request);
        }
    }

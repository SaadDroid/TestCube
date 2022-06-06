@Override
    public void createResource(Request request)
            throws InvalidPayloadException, ResourceAlreadyExistsException, ResourceNotFoundException {

        // creation of entities is currently unsupported
        throw new UnsupportedOperationException("Creation of entities is not currently supported");
    }

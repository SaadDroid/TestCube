@Override
    public Representation doHandle() {
        final StringRepresentation stringRepresentation = new StringRepresentation(EMPTY_RESPONSE);
        try {
            final RestApiResponse restApiResponse = handleRequest();
            fillAllContent(stringRepresentation, restApiResponse);
            return stringRepresentation;
        } catch (final BonitaException e) {
            LOGGER.log(Level.SEVERE, "Failed to handle API Extension call", e);
            getResponse().setStatus(Status.SERVER_ERROR_INTERNAL);
            return null;
        }
    }

@Override
    public Endpoint getEndpoint() {
        throw new CitrusRuntimeException(String.format("Unable to create endpoint for static endpoint adapter type '%s'", getClass()));
    }

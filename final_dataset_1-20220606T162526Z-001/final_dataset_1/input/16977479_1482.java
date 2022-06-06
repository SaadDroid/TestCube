@Override
    public <T> T readEntity(Class<T> cls) throws ProcessingException, IllegalStateException {
        return readEntity(cls, new Annotation[]{});
    }

@Override
    public URI getURI() {
        return URI.create(delegate.absoluteURI());
    }

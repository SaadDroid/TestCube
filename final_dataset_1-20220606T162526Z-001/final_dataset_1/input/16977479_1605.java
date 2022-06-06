@Override
    public URI build(Object... values) throws IllegalArgumentException, UriBuilderException {
        return doBuild(false, true, values);
    }

@Override
    @SuppressWarnings("unchecked")
    public T havingHeaders(final String... names) {
        Validate.notNull(names, "names cannot be null");
        
        for (final String name: names) {
            havingHeader(name);
        }

        return (T)this;
    }

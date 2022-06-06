@SuppressWarnings("unchecked")
    @Override
    public <T> HeaderDelegate<T> createHeaderDelegate(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException("HeaderDelegate type is null");
        }
        return (HeaderDelegate<T>)headerProviders.get(type);
    }

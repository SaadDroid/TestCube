@SuppressWarnings("unchecked")
    public <T extends Enum<T> & LogMessage> OpsLogger<T> build() throws UncheckedIOException {
        if (!cachedInstance.isPresent()) {
            cachedInstance = Optional.of(buildNewInstance());
        }
        return (OpsLogger<T>) cachedInstance.get();
    }

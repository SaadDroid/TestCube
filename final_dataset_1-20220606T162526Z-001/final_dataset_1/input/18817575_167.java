@Reference(cardinality = MULTIPLE, policy = DYNAMIC, unbind = "unbind")
    protected synchronized void bind(AnnotatedFieldMapper<?, ?> mapper) {
        if (mapper == null) {
            throw new IllegalArgumentException("Method argument mapper must not be null.");
        }
        this.fieldMappers.put(mapper.getAnnotationType(), mapper);
        this.cache.clear();
    }

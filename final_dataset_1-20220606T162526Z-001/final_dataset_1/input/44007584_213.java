public <T> void destroy(ReferenceConfig<T> referenceConfig) {
        String key = generator.generateKey(referenceConfig);
        destroyKey(key);
    }

public <T> T create(Class<T> cls, Object... varValues) {
        return cls.cast(createWithValues(varValues));
    }

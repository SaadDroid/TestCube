@Override
    public Object deserializeKey(final String key, final DeserializationContext ctxt) throws IOException {
        try {
            return ctxt.findClass(SimpleClassNameIdResolver.getClassName(key));
        } catch (final Exception e) {
            throw ctxt.mappingException("Cannot find class %s", key);
        }
    }

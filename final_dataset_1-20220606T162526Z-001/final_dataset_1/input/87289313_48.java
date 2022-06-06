@Override
    protected Class<?> _deserialize(final String value, final DeserializationContext ctxt) throws IOException {
        try {
            return ctxt.findClass(SimpleClassNameIdResolver.getClassName(value));
        } catch (final Exception e) {
            throw ctxt.instantiationException(_valueClass, ClassUtil.getRootCause(e));
        }
    }

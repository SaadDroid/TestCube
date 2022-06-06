@SuppressWarnings("unchecked")
    public static <T> T newInstance(Class<T> pojoClass) {
        try {
            return instantiate(pojoClass);
        } catch (ReflectiveOperationException e) {
            throw new HecateException(e, "Unable to instantiate object of type %s.", pojoClass.getCanonicalName());
        }
    }

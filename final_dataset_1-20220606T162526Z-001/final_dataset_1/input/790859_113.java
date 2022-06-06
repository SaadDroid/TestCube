@SuppressWarnings("unchecked")
    @Override
    public Class<T> getType() {
        try {
            ParameterizedType pt =
                (ParameterizedType) getClass().getGenericSuperclass();

            return (Class<T>) pt.getActualTypeArguments()[0];
        } catch (Exception e) {
            // Generics not specified...
            return (Class<T>) Object.class;
        }
    }

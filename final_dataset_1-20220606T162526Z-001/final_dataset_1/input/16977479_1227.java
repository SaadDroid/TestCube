public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mt) {
        return isSupported(type, mt);
    }

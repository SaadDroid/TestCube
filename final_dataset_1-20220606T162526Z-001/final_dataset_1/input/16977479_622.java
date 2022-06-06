@Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return JsonStructure.class.isAssignableFrom(type)
                || JsonObject.class.isAssignableFrom(type)
                || JsonArray.class.isAssignableFrom(type);
    }

@Override
    public void writeTo(JsonStructure t, Class<?> type, Type genericType, Annotation[] annotations,
        MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream)
        throws IOException, WebApplicationException {

        if (entityStream == null) {
            throw new IOException("Initialized OutputStream should be provided");
        }

        try (JsonWriter writer = Json.createWriter(entityStream)) {
            writer.write(t);
        }
    }

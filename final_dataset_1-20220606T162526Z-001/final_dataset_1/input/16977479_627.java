@Override
    public JsonStructure readFrom(Class<JsonStructure> type, Type genericType, Annotation[] annotations,
        MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream)
        throws IOException, WebApplicationException {

        if (entityStream == null) {
            throw new IOException("Initialized InputStream should be provided");
        }

        try (JsonReader reader = Json.createReader(entityStream)) {
            return reader.read();
        } catch (JsonException ex) {
            throw ExceptionUtils.toBadRequestException(ex, null);
        }
    }

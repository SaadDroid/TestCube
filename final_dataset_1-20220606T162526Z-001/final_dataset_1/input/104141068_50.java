public static InputStream serializeMultipartForm(final Multipart form) throws IOException {
        try (final ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
            serializeMultipartForm(form, outputStream);
            return new ByteArrayInputStream(outputStream.toByteArray());
        }
    }

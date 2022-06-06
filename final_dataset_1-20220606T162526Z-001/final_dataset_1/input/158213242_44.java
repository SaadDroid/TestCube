@Override
    public Form getForm(ContainerRequestContext context) throws IOException {
        final InputStream is = context.getEntityStream();

        // Ensure stream can be restored for next interceptor
        InputStream bufferedStream;
        if (is.markSupported()) {
            bufferedStream = is;
        } else {
            bufferedStream = new BufferedInputStream(is);
        }
        bufferedStream.mark(Integer.MAX_VALUE);

        final MediaType contentType = context.getMediaType();

        final String charset = contentType.getParameters().get("charset");
        final String entity = toString(bufferedStream, charset != null ? charset : DEFAULT_CHARSET);

        final Form form = parseForm(entity);

        bufferedStream.reset();
        context.setEntityStream(bufferedStream);

        return form;

    }

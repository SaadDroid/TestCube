public void writeTo(T source, Class<?> clazz, Type genericType, Annotation[] annotations,
        MediaType mt, MultivaluedMap<String, Object> headers, OutputStream os)
        throws IOException {

        String encoding = HttpUtils.getSetEncoding(mt, headers, StandardCharsets.UTF_8.name());

        XMLStreamReader reader = null;
        if (source instanceof Source) {
            reader = StaxUtils.createXMLStreamReader((Source)source);
        } else if (source instanceof Document) {
            reader = StaxUtils.createXMLStreamReader((Document)source);
        } else {
            reader = StaxUtils.createXMLStreamReader(new DOMSource((Node)source));
        }
        XMLStreamWriter writer = StaxUtils.createXMLStreamWriter(os, encoding);
        try {
            StaxUtils.copy(reader, writer);
        } catch (XMLStreamException e) {
            throw ExceptionUtils.toInternalServerErrorException(e, null);
        } finally {
            try {
                reader.close();
            } catch (XMLStreamException e) {
                //ignore
            }
            try {
                writer.flush();
                writer.close();
            } catch (XMLStreamException e) {
                //ignore
            }
        }
    }

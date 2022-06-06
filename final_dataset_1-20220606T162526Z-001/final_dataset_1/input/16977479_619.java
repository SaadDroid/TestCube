public void writeTo(T obj, Class<?> type, Type genericType, Annotation[] anns,
        MediaType m, MultivaluedMap<String, Object> headers, OutputStream os)
        throws IOException {
        if (type == null) {
            type = obj.getClass();
        }
        if (genericType == null) {
            genericType = type;
        }
        AegisContext context = getAegisContext(type, genericType);
        AegisType aegisType = context.getTypeMapping().getType(genericType);
        AegisWriter<XMLStreamWriter> aegisWriter = context.createXMLStreamWriter();
        try {
            String enc = HttpUtils.getSetEncoding(m, headers, StandardCharsets.UTF_8.name());
            XMLStreamWriter xmlStreamWriter = createStreamWriter(aegisType.getSchemaType(), enc, os);
            // use type qname as element qname?
            xmlStreamWriter.writeStartDocument();
            aegisWriter.write(obj, aegisType.getSchemaType(), false, xmlStreamWriter, aegisType);
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.close();
        } catch (Exception e) {
            throw ExceptionUtils.toInternalServerErrorException(e, null);
        }
    }

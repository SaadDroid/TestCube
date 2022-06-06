public void writeTo(T obj, Class<?> cls, Type genericType, Annotation[] anns,
        MediaType m, MultivaluedMap<String, Object> headers, OutputStream os)
        throws IOException {
        if (os == null) {
            StringBuilder sb = new StringBuilder(256);
            sb.append("Jettison needs initialized OutputStream");
            if (getContext() != null && getContext().getContent(XMLStreamWriter.class) == null) {
                sb.append("; if you need to customize Jettison output with the custom XMLStreamWriter"
                          + " then extend JSONProvider or when possible configure it directly.");
            }
            throw new IOException(sb.toString());
        }
        XMLStreamWriter writer = null;
        try {

            String enc = HttpUtils.getSetEncoding(m, headers, StandardCharsets.UTF_8.name());
            if (Document.class.isAssignableFrom(cls)) {
                writer = createWriter(obj, cls, genericType, enc, os, false);
                copyReaderToWriter(StaxUtils.createXMLStreamReader((Document)obj), writer);
                return;
            }
            if (InjectionUtils.isSupportedCollectionOrArray(cls)) {
                marshalCollection(cls, obj, genericType, enc, os, m, anns);
            } else {
                Object actualObject = checkAdapter(obj, cls, anns, true);
                Class<?> actualClass = obj != actualObject || cls.isInterface()
                    ? actualObject.getClass() : cls;
                if (cls == genericType) {
                    genericType = actualClass;
                }

                marshal(actualObject, actualClass, genericType, enc, os);
            }

        } catch (JAXBException e) {
            handleJAXBException(e, false);
        } catch (XMLStreamException e) {
            handleXMLStreamException(e, false);
        } catch (Exception e) {
            throw ExceptionUtils.toInternalServerErrorException(e, null);
        } finally {
            StaxUtils.close(writer);
        }
    }

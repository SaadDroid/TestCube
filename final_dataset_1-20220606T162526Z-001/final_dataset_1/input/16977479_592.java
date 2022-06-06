public T readFrom(Class<T> type, Type genericType, Annotation[] anns, MediaType mt,
        MultivaluedMap<String, String> headers, InputStream is)
        throws IOException {

        if (isPayloadEmpty(headers)) {
            if (AnnotationUtils.getAnnotation(anns, Nullable.class) != null) {
                return null;
            }
            reportEmptyContentLength();
        }

        XMLStreamReader reader = null;
        String enc = HttpUtils.getEncoding(mt, StandardCharsets.UTF_8.name());
        Unmarshaller unmarshaller = null;
        try {
            InputStream realStream = getInputStream(type, genericType, is);
            if (Document.class.isAssignableFrom(type)) {
                W3CDOMStreamWriter writer = new W3CDOMStreamWriter();
                reader = createReader(type, realStream, false, enc);
                copyReaderToWriter(reader, writer);
                return type.cast(writer.getDocument());
            }
            boolean isCollection = InjectionUtils.isSupportedCollectionOrArray(type);
            Class<?> theGenericType = isCollection ? InjectionUtils.getActualType(genericType) : type;
            Class<?> theType = getActualType(theGenericType, genericType, anns);

            unmarshaller = createUnmarshaller(theType, genericType, isCollection);
            XMLStreamReader xsr = createReader(type, realStream, isCollection, enc);

            Object response = null;
            if (JAXBElement.class.isAssignableFrom(type)
                || !isCollection && (unmarshalAsJaxbElement
                || jaxbElementClassMap != null && jaxbElementClassMap.containsKey(theType.getName()))) {
                response = unmarshaller.unmarshal(xsr, theType);
            } else {
                response = unmarshaller.unmarshal(xsr);
            }
            if (response instanceof JAXBElement && !JAXBElement.class.isAssignableFrom(type)) {
                response = ((JAXBElement<?>)response).getValue();
            }
            if (isCollection) {
                response = ((CollectionWrapper)response).getCollectionOrArray(
                               unmarshaller, theType, type, genericType,
                               org.apache.cxf.jaxrs.utils.JAXBUtils.getAdapter(theGenericType, anns));
            } else {
                response = checkAdapter(response, type, anns, false);
            }
            return type.cast(response);

        } catch (JAXBException e) {
            handleJAXBException(e, true);
        } catch (XMLStreamException e) {
            if (e.getCause() instanceof JSONSequenceTooLargeException) {
                throw new WebApplicationException(413);
            }
            handleXMLStreamException(e, true);
        } catch (WebApplicationException e) {
            throw e;
        } catch (Exception e) {
            throw ExceptionUtils.toBadRequestException(e, null);
        } finally {
            try {
                StaxUtils.close(reader);
            } catch (XMLStreamException e) {
                throw ExceptionUtils.toBadRequestException(e, null);
            }
            JAXBUtils.closeUnmarshaller(unmarshaller);
        }
        // unreachable
        return null;
    }

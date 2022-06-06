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
        Unmarshaller unmarshaller = null;
        try {

            boolean isCollection = InjectionUtils.isSupportedCollectionOrArray(type);
            Class<?> theGenericType = isCollection ? InjectionUtils.getActualType(genericType) : type;
            Class<?> theType = getActualType(theGenericType, genericType, anns);

            unmarshaller = createUnmarshaller(theType, genericType, isCollection);
            addAttachmentUnmarshaller(unmarshaller);
            Object response = null;
            if (JAXBElement.class.isAssignableFrom(type)
                || !isCollection && (unmarshalAsJaxbElement
                || jaxbElementClassMap != null && jaxbElementClassMap.containsKey(theType.getName()))) {
                reader = getStreamReader(is, type, mt);
                reader = TransformUtils.createNewReaderIfNeeded(reader, is);
                if (JAXBElement.class.isAssignableFrom(type) && type == theType) {
                    response = unmarshaller.unmarshal(reader);
                } else {
                    response = unmarshaller.unmarshal(reader, theType);
                }
            } else {
                response = doUnmarshal(unmarshaller, type, is, anns, mt);
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
        } catch (DepthExceededStaxException e) {
            throw ExceptionUtils.toWebApplicationException(null, JAXRSUtils.toResponse(413));
        } catch (WebApplicationException e) {
            throw e;
        } catch (Exception e) {
            LOG.warning(ExceptionUtils.getStackTrace(e));
            throw ExceptionUtils.toBadRequestException(e, null);
        } finally {
            try {
                StaxUtils.close(reader);
            } catch (XMLStreamException e) {
                // Ignore
            }
            JAXBUtils.closeUnmarshaller(unmarshaller);
        }
        // unreachable
        return null;
    }

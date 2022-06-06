public void writeTo(T obj, Class<?> cls, Type genericType, Annotation[] anns,
        MediaType m, MultivaluedMap<String, Object> headers, OutputStream os)
        throws IOException {
        try {
            String encoding = HttpUtils.getSetEncoding(m, headers, StandardCharsets.UTF_8.name());
            if (InjectionUtils.isSupportedCollectionOrArray(cls)) {
                marshalCollection(cls, obj, genericType, encoding, os, m, anns);
            } else {
                Object actualObject = checkAdapter(obj, cls, anns, true);
                Class<?> actualClass = obj != actualObject || cls.isInterface()
                    ? actualObject.getClass() : cls;
                marshal(actualObject, actualClass, genericType, encoding, os, m, anns);
            }
        } catch (JAXBException e) {
            handleJAXBException(e, false);
        }  catch (WebApplicationException e) {
            throw e;
        } catch (Exception e) {
            LOG.warning(ExceptionUtils.getStackTrace(e));
            throw ExceptionUtils.toInternalServerErrorException(e, null);
        }
    }

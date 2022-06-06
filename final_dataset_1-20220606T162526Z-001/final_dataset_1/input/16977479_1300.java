public T readFrom(
        Class<T> clazz, Type genericType, Annotation[] annotations, MediaType mt,
        MultivaluedMap<String, String> headers, InputStream is)
        throws IOException {
        if (is == null) {
            return null;
        }
        try {
            if (mt.isCompatible(MediaType.MULTIPART_FORM_DATA_TYPE)) {
                MultipartBody body = AttachmentUtils.getMultipartBody(mc);
                if (MultipartBody.class.isAssignableFrom(clazz)) {
                    return clazz.cast(body);
                } else if (Attachment.class.isAssignableFrom(clazz)) {
                    return clazz.cast(body.getRootAttachment());
                }
            }

            MultivaluedMap<String, String> params = createMap(clazz);
            populateMap(params, annotations, is, mt, !keepEncoded(annotations));
            validateMap(params);

            persistParamsOnMessage(params);

            return getFormObject(clazz, params);
        } catch (WebApplicationException e) {
            throw e;
        } catch (Exception e) {
            throw ExceptionUtils.toBadRequestException(e, null);
        }
    }

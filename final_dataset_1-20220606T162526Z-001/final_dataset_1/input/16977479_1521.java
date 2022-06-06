@Override
    public ResponseBuilder variant(Variant variant) {
        type(variant == null ? null : variant.getMediaType());
        language(variant == null ? null : variant.getLanguage());
        setHeader(HttpHeaders.CONTENT_ENCODING, variant == null ? null : variant.getEncoding());
        return this;
    }

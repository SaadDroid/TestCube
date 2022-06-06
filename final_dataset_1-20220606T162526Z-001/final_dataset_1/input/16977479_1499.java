@Override
    public Locale getLanguage() {
        Object header = metadata.getFirst(HttpHeaders.CONTENT_LANGUAGE);
        return header == null || header instanceof Locale ? (Locale)header
            : HttpUtils.getLocale(header.toString());
    }

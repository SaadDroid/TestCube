static Request convert(final HttpServletRequest source) throws IOException {
        
        final Charset encoding = isNotBlank(source.getCharacterEncoding())
                ? Charset.forName(source.getCharacterEncoding())
                : null;
        
        final Request.Builder builder = Request.builder()
                .method(source.getMethod())
                .requestURI(URI.create(source.getRequestURL() + getQueryString(source)))
                .body(toByteArray(source.getInputStream()));
        
        if (encoding != null) {
            builder.encoding(encoding);
        }
        
        return addHeaders(builder, source).build();
    }

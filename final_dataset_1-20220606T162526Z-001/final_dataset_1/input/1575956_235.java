public static ServiceURI create(String uriStr) {
        checkNotNull(uriStr, "service uri string is null");

        // a service uri first should be a valid java.net.URI
        URI uri = URI.create(uriStr);

        return create(uri);
    }

static String createURL(String headerField, String protocol, String requestUri) {
        if (headerField.startsWith("/")) headerField = headerField.substring(1);
        if (headerField.endsWith("/")) headerField = headerField.substring(0, headerField.lastIndexOf('/'));
        if (requestUri.startsWith("/")) {
            requestUri = requestUri.substring(1);
        }
        String urlString = protocol+"://"+headerField+"/"+requestUri;
        return urlString;
    }

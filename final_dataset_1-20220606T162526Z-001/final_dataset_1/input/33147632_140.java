String constructSignatureBase(String nonce, String timestamp) {
        // Get query parameters from request.
        final URI uri = URI.create(url);
        final TreeMap<String, String> params = UrlUtils.getQueryParams(uri, true);
        if (postParams != null) {
            params.putAll(postParams);
        }

        // Add OAuth parameters.
        if (callback != null) {
            params.put(OAuthConstants.PARAM_CALLBACK, callback);
        }
        params.put(OAuthConstants.PARAM_CONSUMER_KEY, authConfig.getConsumerKey());
        params.put(OAuthConstants.PARAM_NONCE, nonce);
        params.put(OAuthConstants.PARAM_SIGNATURE_METHOD, SIGNATURE_METHOD);
        params.put(OAuthConstants.PARAM_TIMESTAMP, timestamp);
        if (authToken != null && authToken.token != null) {
            params.put(OAuthConstants.PARAM_TOKEN, authToken.token);
        }
        params.put(OAuthConstants.PARAM_VERSION, VERSION);

        // Construct the signature base.
        final String baseUrl = uri.getScheme() + "://" + uri.getHost() + uri.getPath();
        final StringBuilder sb = new StringBuilder()
                .append(method.toUpperCase(Locale.ENGLISH))
                .append('&')
                .append(UrlUtils.percentEncode(baseUrl))
                .append('&')
                .append(getEncodedQueryParams(params));
        return sb.toString();
    }

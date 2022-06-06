String constructAuthorizationHeader(String nonce, String timestamp, String signature) {
        final StringBuilder sb = new StringBuilder("OAuth");
        appendParameter(sb, OAuthConstants.PARAM_CALLBACK, callback);
        appendParameter(sb, OAuthConstants.PARAM_CONSUMER_KEY, authConfig.getConsumerKey());
        appendParameter(sb, OAuthConstants.PARAM_NONCE, nonce);
        appendParameter(sb, OAuthConstants.PARAM_SIGNATURE, signature);
        appendParameter(sb, OAuthConstants.PARAM_SIGNATURE_METHOD, SIGNATURE_METHOD);
        appendParameter(sb, OAuthConstants.PARAM_TIMESTAMP, timestamp);
        final String token = authToken != null ? authToken.token : null;
        appendParameter(sb, OAuthConstants.PARAM_TOKEN, token);
        appendParameter(sb, OAuthConstants.PARAM_VERSION, VERSION);
        // Remove the extra ',' at the end.
        return sb.substring(0, sb.length() - 1);
    }

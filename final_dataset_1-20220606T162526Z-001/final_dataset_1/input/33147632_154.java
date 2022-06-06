public static OAuthResponse parseAuthResponse(String response) {
        final TreeMap<String, String> params = UrlUtils.getQueryParams(response, false);
        final String token = params.get(OAuthConstants.PARAM_TOKEN);
        final String secret = params.get(OAuthConstants.PARAM_TOKEN_SECRET);
        final String userName = params.get(PARAM_SCREEN_NAME);
        final long userId;
        if (params.containsKey(PARAM_USER_ID)) {
            userId = Long.parseLong(params.get(PARAM_USER_ID));
        } else {
            userId = 0L;
        }
        if (token == null || secret == null) {
            return null;
        } else {
            return new OAuthResponse(new TwitterAuthToken(token, secret), userName, userId);
        }
    }

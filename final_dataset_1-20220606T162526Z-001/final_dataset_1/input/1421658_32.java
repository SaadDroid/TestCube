public String buildAuthorizeUrl(String requestToken, OAuth1Parameters parameters) {
		return buildAuthUrl(authorizeUrl, requestToken, parameters);
	}

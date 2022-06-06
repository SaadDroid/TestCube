@RequestMapping(value="/{providerId}", method=RequestMethod.GET, params="error")
	public RedirectView oauth2ErrorCallback(@PathVariable String providerId,
			@RequestParam("error") String error,
			@RequestParam(value="error_description", required=false) String errorDescription,
			@RequestParam(value="error_uri", required=false) String errorUri,
			NativeWebRequest request) {
		logger.warn("Error during authorization: " + error);
		URIBuilder uriBuilder = URIBuilder.fromUri(signInUrl).queryParam("error", error);
		if (errorDescription != null ) { uriBuilder.queryParam("error_description", errorDescription); }
		if (errorUri != null ) { uriBuilder.queryParam("error_uri", errorUri); }
		return redirect(uriBuilder.build().toString());
	}

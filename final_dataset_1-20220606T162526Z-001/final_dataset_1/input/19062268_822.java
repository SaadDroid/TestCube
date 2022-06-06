static URIResolver newInstance(URI endpoint, URI alternative) {
		checkNotNull(endpoint,"Endpoint URI cannot be null");
		checkNotNull(alternative,"Alternative URI cannot be null");
		checkArgument(alternative.isAbsolute() && !alternative.isOpaque(),"Alternative URI must be absolute hierarchical");
		checkArgument(endpoint.isAbsolute() && !endpoint.isOpaque(),"Endpoint URI must be absolute hierarchical");
		checkArgument(!endpoint.equals(alternative),"Endpoint URI must be different from the alternative one");
		return new URIResolver(endpoint,alternative);
	}

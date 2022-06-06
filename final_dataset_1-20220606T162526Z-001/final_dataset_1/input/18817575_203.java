@Override
	public HttpHeaders getMultipartHeaders(String name) {
		String contentType = getMultipartContentType(name);
		if (contentType != null) {
			HttpHeaders headers = new HttpHeaders();
			headers.add(CONTENT_TYPE, contentType);
			return headers;
		} else {
			return null;
		}
	}

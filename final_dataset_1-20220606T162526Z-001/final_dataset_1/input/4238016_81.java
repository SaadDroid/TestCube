String getTextFromUrl(String url, Charset encoding) throws IOException {
		ClientHttpResponse response = null;
		try {
			SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
			requestFactory.setConnectTimeout((int) TIMEOUT);
			requestFactory.setReadTimeout((int) TIMEOUT);
			ClientHttpRequest request = requestFactory.createRequest(URI.create(url), HttpMethod.GET);
			response = request.execute();
			HttpStatus status = response.getStatusCode();
			if (status.series() == Series.SUCCESSFUL) {
				return IOUtils.toString(response.getBody(), encoding);
			}
		} finally {
			if (response != null) {
				response.close();
			}
		}
		return null;
	}

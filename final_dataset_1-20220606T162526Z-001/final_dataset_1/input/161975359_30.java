public String fetchAsString(String url) throws ClientProtocolException, IOException {

		try (CloseableHttpClient client = HttpClientBuilder.create()
				.setDefaultRequestConfig(MY_REQUEST_CONFIG)
				.setRetryHandler(MY_HTTP_REQUEST_RETRY_HANDLER)
				.setServiceUnavailableRetryStrategy(MY_SERVICE_UNAVAILABLE_RETRY_STRATEGY)
				.build()) {

			try (CloseableHttpResponse res = client.execute(new HttpGet(url))) {
				if (res.getStatusLine().getStatusCode() >= 400) {
					throw new HttpResponseException(res.getStatusLine().getStatusCode(), res.getStatusLine()
							.getReasonPhrase());
				}
				return EntityUtils.toString(res.getEntity());
			}
		}

	}

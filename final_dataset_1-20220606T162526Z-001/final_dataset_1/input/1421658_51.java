public void setRequestFactory(ClientHttpRequestFactory requestFactory) {
		Assert.notNull(requestFactory, "The requestFactory property cannot be null");
		getRestTemplate().setRequestFactory(requestFactory);
	}

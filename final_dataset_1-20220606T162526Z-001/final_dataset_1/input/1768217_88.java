public Tweet retweet(long tweetId) {
		requireUserAuthorization();
		MultiValueMap<String, Object> data = new LinkedMultiValueMap<String, Object>();
		return restTemplate.postForObject(buildUri("statuses/retweet/" + tweetId + ".json"), data, Tweet.class);
	}

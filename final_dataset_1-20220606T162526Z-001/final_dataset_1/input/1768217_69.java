public Tweet getStatus(long tweetId) {
		requireEitherUserOrAppAuthorization();
		MultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.set("include_entities", "true");
		return restTemplate.getForObject(buildUri("statuses/show/" + tweetId + ".json", parameters), Tweet.class);
	}

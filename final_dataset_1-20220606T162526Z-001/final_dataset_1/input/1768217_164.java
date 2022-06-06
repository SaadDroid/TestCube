public TwitterProfile enableNotifications(long userId) {
		requireUserAuthorization();
		LinkedMultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.set("user_id", String.valueOf(userId));
		params.set("device", "true");
		return restTemplate.postForObject(buildUri("friendships/update.json", params), EMPTY_DATA, TwitterProfile.class);
	}

public CursoredList<TwitterProfile> getFriendsInCursor(long cursor) {
		requireUserAuthorization();
		LinkedMultiValueMap<String, String> parameters = new LinkedMultiValueMap<String, String>();
		parameters.set("cursor", String.valueOf(cursor));
		return restTemplate.getForObject(buildUri("friends/list.json", parameters), CursoredTwitterProfileUsersList.class).getList();
	}

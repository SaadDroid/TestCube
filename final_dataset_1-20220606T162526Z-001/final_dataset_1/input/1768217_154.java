public CursoredList<Long> getFollowerIdsInCursor(long cursor) {
		requireUserAuthorization();
		return restTemplate.getForObject(buildUri("followers/ids.json", "cursor", String.valueOf(cursor)), CursoredLongList.class).getList();
	}

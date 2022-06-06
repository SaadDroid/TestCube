public static void addSetMembers(String graphId, String setId, List<String> memberIds) {
		validateRequired(graphId, setId, memberIds, GraphCacheErrorCodes.ERR_CACHE_ADD_SET_MEMBER.name());
		Jedis jedis = getRedisConncetion();
		String key = CacheKeyGenerator.getSetMembersKey(graphId, setId);
			try {
				String[] members = new String[memberIds.size()];
				for (int i = 0; i < memberIds.size(); i++) {
					members[i] = memberIds.get(i);
				}
				jedis.sadd(key, members);
			} catch (Exception e) {
				throw new ServerException(GraphCacheErrorCodes.ERR_CACHE_ADD_SET_MEMBER.name(), e.getMessage());
			} finally {
				returnConnection(jedis);
			}
	}

public static void dropSet(String graphId, String setId) {
		validateRequired(graphId, setId, GraphCacheErrorCodes.ERR_CACHE_DROP_SET.name());
		Jedis jedis = getRedisConncetion();
		String key = CacheKeyGenerator.getSetMembersKey(graphId, setId);
			try {
				jedis.del(key);
			} catch (Exception e) {
				throw new ServerException(GraphCacheErrorCodes.ERR_CACHE_DROP_SET.name(), e.getMessage());
			} finally {
				returnConnection(jedis);
			}
	}

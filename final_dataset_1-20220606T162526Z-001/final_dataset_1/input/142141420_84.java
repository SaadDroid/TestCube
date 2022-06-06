public static Object deleteDefinitionNode(String graphId, String objectType) {
		validateRequired(graphId, objectType, GraphCacheErrorCodes.ERR_CACHE_GET_DEF_NODE_ERROR.name());
		String key = CacheKeyGenerator.getKey(graphId, objectType, RedisKeysEnum.DEF_NODE.name());
		TelemetryManager.log("Deleting definition node from cache having objectType: " + objectType + " in graph: "+ graphId);
		return definitionNodeCache.remove(key);
	}

public static void saveDefinitionNode(String graphId, String objectType, Object node) {
		validateRequired(graphId, objectType, node, GraphCacheErrorCodes.ERR_CACHE_SAVE_DEF_NODE_ERROR.name());
		String key = CacheKeyGenerator.getKey(graphId, objectType, RedisKeysEnum.DEF_NODE.name());
		definitionNodeCache.put(key, node);
		TelemetryManager.log("Saved definition node into cache having objectType: " + objectType + " into graph: "+ graphId);
	}

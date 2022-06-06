public static void saveDataNode(String graphId, String id, Object node) {
		validateRequired(graphId, id, node, GraphCacheErrorCodes.ERR_CACHE_SAVE_DEF_NODE_ERROR.name());
		String key = CacheKeyGenerator.getKey(graphId, id, RedisKeysEnum.DATA_NODE.name());
		dataNodeCache.put(key, node);
		TelemetryManager.log("Saved data node into cache having identifier: " + id + " into graph: "+ graphId);
	}

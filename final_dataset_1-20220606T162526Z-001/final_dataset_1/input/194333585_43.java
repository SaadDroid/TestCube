public static Map<String, String> getAnnotations(@NotNull String url, @NotNull Properties info) {
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(info);
        
    	Map<String, String> combinedProperties = getCombinedConnectionProperties(url, info);
    	Map<String, String> result = newHashMapWithExpectedSize(combinedProperties.size());
    	for (Map.Entry<String, String> prop : combinedProperties.entrySet()) {
    		if (prop.getKey().startsWith(ANNOTATION_ATTRIB_PREFIX) &&
    				prop.getKey().length() > ANNOTATION_ATTRIB_PREFIX.length()) {
    			result.put(prop.getKey().substring(ANNOTATION_ATTRIB_PREFIX.length()), prop.getValue());
    		}
    	}
    	return result;
    }

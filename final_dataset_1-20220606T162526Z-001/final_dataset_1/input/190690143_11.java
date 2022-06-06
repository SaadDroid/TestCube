public JsApiCache buildFrom(Map<String, Object> registeredApis) {
		JsApiCache.Builder builder = new JsApiCache.Builder();

		for(String apiBaseName : registeredApis.keySet()) {
			appendObject(builder, apiBaseName, registeredApis.get(apiBaseName));
		}

		return builder.build();
	}

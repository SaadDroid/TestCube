@SuppressWarnings("unchecked")
    public List<Usergroup> get(UsergroupGetParam param) {
        JSONObject params = JSONObject.fromObject(param, defaultConfig);
        JSONArray result = (JSONArray) accessor.execute("usergroup.get", params);

        JsonConfig config = defaultConfig.copy();
        config.setCollectionType(List.class);
        config.setRootClass(Usergroup.class);
        return (List<Usergroup>) JSONArray.toCollection(result, config);
    }

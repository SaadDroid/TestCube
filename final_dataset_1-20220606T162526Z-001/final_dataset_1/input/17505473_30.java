@SuppressWarnings("unchecked")
    public List<User> get(UserGetParam param) {
        JSONObject params = JSONObject.fromObject(param, defaultConfig);
        if (accessor.checkVersion("2.0") < 0) {
            if (params.containsKey("selectUsrgrps")) {
                params.put("select_usrgrps", params.remove("selectUsrgrps"));
            }
        }

        JSONArray result = (JSONArray) accessor.execute("user.get", params);

        JsonConfig config = defaultConfig.copy();
        config.setCollectionType(List.class);
        config.setRootClass(User.class);
        config.getClassMap().put("usrgrps", Usergroup.class);
        return (List<User>) JSONArray.toCollection(result, config);
    }

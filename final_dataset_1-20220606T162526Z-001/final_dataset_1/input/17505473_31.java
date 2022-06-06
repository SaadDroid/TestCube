@SuppressWarnings("unchecked")
    public List<String> create(UserCreateParam param) {
        if (param.getAlias() == null || param.getAlias().length() == 0) {
            throw new IllegalArgumentException("alias is required.");
        }
        if (accessor.checkVersion("2.0") >= 0) {
            if (param.getPasswd() == null || param.getPasswd().length() == 0) {
                throw new IllegalArgumentException("passwd is required.");
            }

            if (param.getUsrgrps() == null || param.getUsrgrps().isEmpty()) {
                throw new IllegalArgumentException("usrgrps is required.");
            }
        }

        JSONObject params = JSONObject.fromObject(param, defaultConfig);
        JSONObject result = (JSONObject) accessor.execute("user.create", params);

        JSONArray userids = result.getJSONArray("userids");
        JsonConfig config = defaultConfig.copy();
        config.setCollectionType(List.class);
        config.setRootClass(String.class);
        return (List<String>) JSONArray.toCollection(userids, config);
    }

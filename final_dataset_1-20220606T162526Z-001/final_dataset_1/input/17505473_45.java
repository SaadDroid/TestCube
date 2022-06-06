@SuppressWarnings("unchecked")
    public List<String> create(HostCreateParam param) {
        if (param.getHost() == null || param.getHost().length() == 0) {
            throw new IllegalArgumentException("host is required.");
        }
        if (param.getGroups() == null || param.getGroups().size() == 0) {
            throw new IllegalArgumentException("groups is required.");
        }

        // Zabbix 1.8用のインターフェースで2.0以降を操作できるようにするためのコード
        if (accessor.checkVersion("2.0") >= 0) {
            if (param.getInterfaces() == null || param.getInterfaces().size() == 0) {
                Hostinterface hostinterface = new Hostinterface();
                hostinterface.setDns(param.getDns());
                hostinterface.setIp((param.getIp() == null || param.getIp().length() == 0) ? "0.0.0.0" : param.getIp());
                hostinterface.setPort((param.getPort() == null) ? 10050 : param.getPort());
                hostinterface.setUseip((param.getUseip() == null) ? 0 : param.getUseip());
                hostinterface.setType(1);
                hostinterface.setMain(1);

                param.setInterfaces(Arrays.asList(hostinterface));
                param.setDns(null);
                param.setIp(null);
                param.setPort(null);
                param.setUseip(null);
            }
        }
        // Zabbix 2.0以降用のインターフェースで1.8を操作できるようにするためのコード
        else {
            if (param.getInterfaces() != null && param.getInterfaces().size() > 0) {
                Hostinterface hostinterface = param.getInterfaces().get(0);
                param.setDns(hostinterface.getDns());
                param.setIp(hostinterface.getIp());
                param.setPort(hostinterface.getPort());
                param.setUseip(hostinterface.getUseip());
                param.setInterfaces(null);
            }
        }

        JSONObject params = JSONObject.fromObject(param, defaultConfig);
        JSONObject result = (JSONObject) accessor.execute("host.create", params);

        JSONArray hostids = result.getJSONArray("hostids");
        JsonConfig config = defaultConfig.copy();
        config.setCollectionType(List.class);
        config.setRootClass(String.class);
        return (List<String>) JSONArray.toCollection(hostids, config);
    }

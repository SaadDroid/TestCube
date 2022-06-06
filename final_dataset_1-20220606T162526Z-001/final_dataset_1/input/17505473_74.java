@SuppressWarnings("unchecked")
    public List<Template> get(TemplateGetParam param) {
        JSONObject params = JSONObject.fromObject(param, defaultConfig);
        Object result = accessor.execute("template.get", params);

        if (result instanceof JSONArray) {
            JsonConfig config = defaultConfig.copy();
            config.setCollectionType(List.class);
            config.setRootClass(Template.class);
            return (List<Template>) JSONArray.toCollection((JSONArray) result, config);
        } else {
            List<Template> templates = new ArrayList<Template>();
            Collection<?> values = ((JSONObject) result).values();
            JsonConfig config = defaultConfig.copy();
            config.setRootClass(Template.class);
            for (Object value : values) {
                JSONObject jsonValue = (JSONObject) value;
                templates.add((Template) JSONObject.toBean(jsonValue, config));
            }
            return templates;
        }
    }

@Activate
    protected void activate(ComponentContext context) throws RepositoryException, ConfigurationException {
        @SuppressWarnings("unchecked")
        Dictionary<String, Object> props = context.getProperties();
        // read service ranking property
        Object ranking = props.get("service.ranking");
        if (ranking != null) {
            try {
                this.ranking = (Integer) ranking;
            } catch (ClassCastException e) {
                // ignore
                logger.warn("Found invalid service.ranking value {}", ranking);
            }
        }

        staticTemplate = PropertiesUtil.toString(props.get(PROP_STATIC_TEMPLATE), null);
        if (StringUtils.isBlank(staticTemplate)) {
            throw new ConfigurationException(PROP_STATIC_TEMPLATE, "Static template is required.");
        }

        editableTemplate = PropertiesUtil.toString(props.get(PROP_EDITABLE_TEMPLATE), null);
        if (StringUtils.isBlank(editableTemplate)) {
            throw new ConfigurationException(PROP_EDITABLE_TEMPLATE, "Editable template is required.");
        }

        slingResourceType = PropertiesUtil.toString(props.get(PROP_SLING_RESOURCE_TYPE), null);
        if (StringUtils.isBlank(slingResourceType)) {
            throw new ConfigurationException(PROP_SLING_RESOURCE_TYPE, "Sling Resource Type is required.");
        }



        String[] orders = PropertiesUtil.toStringArray(props.get(PROP_ORDER_COMPONENTS), new String[] {});
        for (String o : orders) {
            String[] tmp = StringUtils.split(o, ":", 2);
            if (tmp.length < 1) {
                continue;
            }
            if (tmp.length == 2) {
                nested.add(tmp[1]);
            }
            String key = tmp.length == 2 ? tmp[0] : RESPONSIVE_GRID_NODE_NAME;
            String value = tmp.length == 2 ? tmp[1] : tmp[0];
            if (componentOrdering.get(key) == null) {
                componentOrdering.put(key, new ArrayList<>());
            }
            componentOrdering.get(key).add(value);

        }

        componentsToRemove = PropertiesUtil.toStringArray(props.get(PROP_REMOVE_COMPONENTS), new String[] {});

        componentRenamed = RewriteUtils.toMap(
                PropertiesUtil.toStringArray(props.get(PROP_RENAME_COMPONENTS), new String[] {}), ":");

        // Add any renamed component that contains a path separator
        for (String val : componentRenamed.values()) {
            if (val.contains("/")) {
                nested.add(val);
            }
        }
    }

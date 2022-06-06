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

        resourceType = PropertiesUtil.toString(props.get(PROP_RESOURCE_TYPE), PROP_RESOURCE_TYPE_DEFAULT);
        if (StringUtils.isBlank(resourceType)) {
            throw new ConfigurationException(PROP_RESOURCE_TYPE, "Sling Resource Type is required.");
        }

        layout = PropertiesUtil.toString(props.get(PROP_LAYOUT_VALUE), null);
        if (StringUtils.isBlank(layout)) {
            throw new ConfigurationException(PROP_LAYOUT_VALUE, "Layout value property is required.");
        }

        String[] widthsStrings = PropertiesUtil.toStringArray(props.get(PROP_COLUMN_WIDTHS), null);
        if (ArrayUtils.isEmpty(widthsStrings)) {
            throw new ConfigurationException(PROP_COLUMN_WIDTHS, "Column width property is required.");
        } else {
            widths = new long[widthsStrings.length];
            for (int i = 0; i < widthsStrings.length; i++) {
                try {
                    widths[i] = Long.parseLong(widthsStrings[i]);
                } catch (NumberFormatException ex) {
                    throw new ConfigurationException(PROP_COLUMN_WIDTHS, "Column width values must be of type long.");
                }
            }
        }
    }

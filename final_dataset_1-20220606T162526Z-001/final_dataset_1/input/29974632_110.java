@Override
    public void basicValidate(final String section) throws ConfigException {
        if (widgetSettings == null) {
            throw new ConfigException("Static Image Widget", "Widget Settings must be specified for Static Image Widget");
        }

        super.basicValidate(section);
    }

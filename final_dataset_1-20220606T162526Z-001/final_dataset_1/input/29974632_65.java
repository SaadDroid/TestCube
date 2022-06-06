@Override
    public void basicValidate(final String configSection) throws ConfigException {
        if (BooleanUtils.isTrue(enabled)) {
            if (server == null) {
                throw new ConfigException(SECTION,
                    "ControlPoint is enabled but server details are missing");
            }
            server.basicValidate(SECTION);
        }
    }

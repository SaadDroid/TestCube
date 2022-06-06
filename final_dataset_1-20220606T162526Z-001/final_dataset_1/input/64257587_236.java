@Override
    public ProjectConfig parseProjectConfig(@Nonnull String json) throws ConfigParseException {
        try {
            return objectMapper.readValue(json, DatafileProjectConfig.class);
        } catch (Exception e) {
            throw new ConfigParseException("Unable to parse datafile: " + json, e);
        }
    }

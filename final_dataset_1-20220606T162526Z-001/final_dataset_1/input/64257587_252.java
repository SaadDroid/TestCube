@Override
    public ProjectConfig parseProjectConfig(@Nonnull String json) throws ConfigParseException {
        if (json == null) {
            throw new ConfigParseException("Unable to parse null json.");
        }
        if (json.length() == 0) {
            throw new ConfigParseException("Unable to parse empty json.");
        }

        try {
            return gson.fromJson(json, DatafileProjectConfig.class);
        } catch (Exception e) {
            throw new ConfigParseException("Unable to parse datafile: " + json, e);
        }
    }

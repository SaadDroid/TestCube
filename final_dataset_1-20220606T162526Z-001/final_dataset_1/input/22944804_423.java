@Override
    public ScriptConfiguration create(ScriptConfiguration config) throws ScriptException {
        failIfUuidExists(config.getId());
        failIfNameExists(config.getName());
        final ScriptConfiguration updatedConfig = setMetaData(config);
        dataStore.save(updatedConfig);
        return updatedConfig;
    }

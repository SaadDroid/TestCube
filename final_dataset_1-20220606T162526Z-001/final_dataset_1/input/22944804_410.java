@Override
    public void delete(String uuid) throws ScriptException {
        ScriptConfiguration scriptConfig = get(uuid);
        if (containsGlobalUuid(uuid) || isDefaultScript(scriptConfig)) {
            throw new ScriptException(DELETING_DEFAULT_SCRIPT, scriptConfig.getName());
        }
        int usageCount = getUsageCount(scriptConfig);
        if (usageCount > 0) {
            ScriptContext scriptContext = scriptConfig.getContext();
            if (usageCount == 1) {
                throw new ScriptException(DELETING_SCRIPT_IN_USE_SINGULAR, scriptConfig.getName());
            }
            throw new ScriptException(DELETING_SCRIPT_IN_USE_PLURAL,
                    scriptConfig.getName(),
                    Integer.toString(usageCount));
        }
        try {
            getSubOrgConfig().removeSubConfig(uuid);
        } catch (SSOException | SMSException e) {
            throw createAndLogError(logger, DELETE_FAILED, e, uuid, realm);
        }
    }

public ConfigManagement getStrategy(int resourceId) throws PluginContainerException {
        ConfigManagement configManagement = createStrategy(resourceId);
        initStrategyDependencies(configManagement);

        return configManagement;
    }

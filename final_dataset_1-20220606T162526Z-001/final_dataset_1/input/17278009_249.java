public Configuration executeLoad(int resourceId) throws PluginContainerException {
        Configuration configuration = loadConfigFromFacet(resourceId, READ);

        if (configuration == null) {
            return null;
        }
        
        ResourceType resourceType = componentService.getResourceType(resourceId);

        if (configuration.getNotes() == null) {
            configuration.setNotes("Resource config for " + resourceType.getName() + " Resource w/ id " + resourceId);
        }

        ConfigurationDefinition configurationDefinition = resourceType.getResourceConfigurationDefinition();

        configUtilityService.normalizeConfiguration(configuration, configurationDefinition);
        List<String> errorMessages = configUtilityService.validateConfiguration(configuration,
            configurationDefinition);
        for (String errorMessage : errorMessages) {
            log.warn("Plugin Error: Invalid " + resourceType.getName() + " Resource configuration returned by "
                + resourceType.getPlugin() + " plugin - " + errorMessage);
        }

        return configuration;
    }

public void executeUpdate(int resourceId, Configuration configuration)
        throws PluginContainerException {

        ResourceConfigurationFacet facet = loadResourceConfigFacetWithWriteLock(resourceId);
        StringBuilder errors = new StringBuilder();

        for (RawConfiguration rawConfig : configuration.getRawConfigurations()) {
            try {
                facet.validateRawConfiguration(rawConfig);
                facet.persistRawConfiguration(rawConfig);
            }
            catch (Throwable t) {
                // TODO Might want to specify in the error detail whether the validate or update call failed
                errors.append(t.getMessage()).append("\n\n");
            }
        }

        if (errors.length() > 0) {
            throw new ConfigurationUpdateException(errors.toString());
        }
    }

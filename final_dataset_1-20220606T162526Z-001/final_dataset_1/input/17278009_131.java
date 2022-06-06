@Override
    public DiscoveredResourceDetails discoverResource(Configuration config,
        ResourceDiscoveryContext resourceDiscoveryContext) throws InvalidPluginConfigurationException {
        // Get the component configuration. This call will also make configuration checks
        HTTPNetServiceComponentConfiguration componentConfiguration = createComponentConfiguration(config);
        String endPointUrl = componentConfiguration.getEndPointUrl().toExternalForm();
        DiscoveredResourceDetails details = new DiscoveredResourceDetails(resourceDiscoveryContext.getResourceType(),
            endPointUrl, endPointUrl, null, null, config, null);
        return details;
    }

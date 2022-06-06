static ProxyProvider createInternalProxy(final DeploymentConfiguration config, final RegistryQueryResult queryResult) throws IOException {
        final String autoConfigUrl = queryResult.getValue(AUTO_CONFIG_URL_VAL);
        if (autoConfigUrl != null) {
            LOG.debug("Registry value '{}' specified. Will use pac based proxy with pac url '{}'.", AUTO_CONFIG_URL_VAL, autoConfigUrl);
            return new PacBasedProxyProvider(new URL(autoConfigUrl), PacProxyCache.createFor(config));
        } else {
            final boolean proxyEnabledValue = queryResult.getValueAsBoolean(PROXY_ENABLED_VAL);
            if (proxyEnabledValue) {
                final String proxyServerValue = queryResult.getValue(PROXY_SERVER_REGISTRY_VAL);
                if (proxyServerValue != null) {
                    LOG.debug("Proxy server(s) defined ( registry value '" + PROXY_SERVER_REGISTRY_VAL + "'). Will use configured proxy.");
                    final ProxyConfigurationImpl proxyConfiguration = getProxyConfiguration(queryResult);
                    return new ConfigBasedProvider(proxyConfiguration);
                } else {
                    //TODO: is this correct?
                    LOG.debug("No proxy server defined ( registry value '" + PROXY_SERVER_REGISTRY_VAL + "'). Will use direct proxy.");
                    return DirectProxyProvider.getInstance();
                }
            } else {
                LOG.debug("Proxy disabled ( registry value '" + PROXY_ENABLED_VAL + "'). Will use direct proxy.");
                return DirectProxyProvider.getInstance();
            }
        }
    }

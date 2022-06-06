@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        JmxClient client = new JmxClient();

        if (resourcePath.contains("platform")) {
            client.getEndpointConfiguration().setServerUrl("platform");
        } else {
            client.getEndpointConfiguration().setServerUrl("service:jmx:" + resourcePath);
        }

        enrichEndpointConfiguration(client.getEndpointConfiguration(),
                getEndpointConfigurationParameters(parameters, JmxEndpointConfiguration.class), context);
        return client;
    }

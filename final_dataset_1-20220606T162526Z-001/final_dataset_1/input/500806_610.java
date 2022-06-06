@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        RmiClient client = new RmiClient();

        client.getEndpointConfiguration().setHost(RmiEndpointUtils.getHost(resourcePath));
        client.getEndpointConfiguration().setPort(RmiEndpointUtils.getPort(resourcePath, client.getEndpointConfiguration()));
        client.getEndpointConfiguration().setBinding(RmiEndpointUtils.getBinding(resourcePath));

        enrichEndpointConfiguration(client.getEndpointConfiguration(),
                getEndpointConfigurationParameters(parameters, RmiEndpointConfiguration.class), context);
        return client;
    }

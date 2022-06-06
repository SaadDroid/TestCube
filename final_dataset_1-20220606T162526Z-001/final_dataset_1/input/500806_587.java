@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        WebServiceClient client = new WebServiceClient();

        client.getEndpointConfiguration().setDefaultUri("http://" + resourcePath);

        if (parameters.containsKey("errorHandlingStrategy")) {
            String strategy = parameters.remove("errorHandlingStrategy");
            client.getEndpointConfiguration().setErrorHandlingStrategy(ErrorHandlingStrategy.fromName(strategy));
        }

        enrichEndpointConfiguration(client.getEndpointConfiguration(), parameters, context);
        return client;
    }

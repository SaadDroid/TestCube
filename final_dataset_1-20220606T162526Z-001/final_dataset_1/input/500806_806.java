@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        HttpClient client = new HttpClient();

        client.getEndpointConfiguration().setRequestUrl(getScheme() + resourcePath + getParameterString(parameters, HttpEndpointConfiguration.class));

        if (parameters.containsKey("requestMethod")) {
            String method = parameters.remove("requestMethod");
            client.getEndpointConfiguration().setRequestMethod(HttpMethod.valueOf(method));
        }

        if (parameters.containsKey("errorHandlingStrategy")) {
            String strategy = parameters.remove("errorHandlingStrategy");
            client.getEndpointConfiguration().setErrorHandlingStrategy(ErrorHandlingStrategy.fromName(strategy));
        }

        enrichEndpointConfiguration(client.getEndpointConfiguration(),
                getEndpointConfigurationParameters(parameters, HttpEndpointConfiguration.class), context);
        return client;
    }

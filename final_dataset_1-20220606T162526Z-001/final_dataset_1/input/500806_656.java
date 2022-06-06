@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        CamelEndpoint endpoint;
        if (resourcePath.startsWith("sync:")) {
            endpoint = new CamelSyncEndpoint();
            endpoint.getEndpointConfiguration().setEndpointUri(resourcePath.substring("sync:".length()) + getParameterString(parameters, CamelSyncEndpointConfiguration.class));
        } else {
            endpoint = new CamelEndpoint();
            endpoint.getEndpointConfiguration().setEndpointUri(resourcePath + getParameterString(parameters, CamelEndpointConfiguration.class));
        }

        if (context.getReferenceResolver() != null) {
            if (context.getReferenceResolver().resolveAll(CamelContext.class).size() == 1) {
                endpoint.getEndpointConfiguration().setCamelContext(context.getReferenceResolver().resolve(CamelContext.class));
            } else if (context.getReferenceResolver().isResolvable("camelContext")) {
                endpoint.getEndpointConfiguration().setCamelContext(context.getReferenceResolver().resolve("camelContext", CamelContext.class));
            } else {
                endpoint.getEndpointConfiguration().setCamelContext(new DefaultCamelContext());
            }
        }

        enrichEndpointConfiguration(endpoint.getEndpointConfiguration(),
                getEndpointConfigurationParameters(parameters, endpoint.getEndpointConfiguration().getClass()), context);

        return endpoint;
    }

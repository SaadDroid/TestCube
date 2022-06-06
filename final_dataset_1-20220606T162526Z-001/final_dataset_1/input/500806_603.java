@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        JmsEndpoint endpoint;

        if (resourcePath.startsWith("sync:")) {
            endpoint = new JmsSyncEndpoint();
        } else {
            endpoint = new JmsEndpoint();
        }

        if (resourcePath.contains("topic:")) {
            endpoint.getEndpointConfiguration().setPubSubDomain(true);
        }

        // set destination name
        if (resourcePath.indexOf(':') > 0) {
            endpoint.getEndpointConfiguration().setDestinationName(resourcePath.substring(resourcePath.lastIndexOf(':') + 1));
        } else {
            endpoint.getEndpointConfiguration().setDestinationName(resourcePath);
        }

        // set default jms connection factory
        if (context.getReferenceResolver() != null && context.getReferenceResolver().isResolvable("connectionFactory")) {
            endpoint.getEndpointConfiguration().setConnectionFactory(context.getReferenceResolver().resolve("connectionFactory", ConnectionFactory.class));
        }

        enrichEndpointConfiguration(endpoint.getEndpointConfiguration(), parameters, context);

        return endpoint;
    }

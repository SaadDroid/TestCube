@Override
    protected Endpoint createEndpoint(String resourcePath, Map<String, String> parameters, TestContext context) {
        MailClient client = new MailClient();

        if (resourcePath.contains(":")) {
            StringTokenizer tok = new StringTokenizer(resourcePath, ":");

            client.getEndpointConfiguration().setHost(tok.nextToken());

            if (tok.hasMoreTokens()) {
                client.getEndpointConfiguration().setPort(Integer.valueOf(tok.nextToken()));
            }
        } else {
            client.getEndpointConfiguration().setHost(resourcePath);
        }

        enrichEndpointConfiguration(client.getEndpointConfiguration(), parameters, context);
        return client;
    }

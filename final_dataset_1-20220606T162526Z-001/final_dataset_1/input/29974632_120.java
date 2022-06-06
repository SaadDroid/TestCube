@Override
    public void update(final IdolFindConfig config) {
        final CommunityAuthentication community = config.getLogin();
        if (LoginTypes.DEFAULT.equalsIgnoreCase(community.getMethod())) {
            return;
        }

        final ValidationResult validation = community.validate(aciService, processorFactory);
        if (!validation.isValid()) {
            throw new RuntimeException(
                "Community server configuration is invalid: " + validation.getData());
        }

        final AciServerDetails serverDetails = config.getCommunityDetails();

        // terrible hack - using system properties to pass data to migration
        System.setProperty(COMMUNITY_PROTOCOL, serverDetails.getProtocol().toString());
        System.setProperty(COMMUNITY_HOST, serverDetails.getHost());
        System.setProperty(COMMUNITY_PORT, String.valueOf(serverDetails.getPort()));

        flyway.migrate();

        System.clearProperty(COMMUNITY_PROTOCOL);
        System.clearProperty(COMMUNITY_HOST);
        System.clearProperty(COMMUNITY_PORT);
    }

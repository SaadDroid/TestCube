@Override
    public AuthConfig create(RegistryAuthConfig.Kind kind, String user, String registry, Function<String, String> decryptor) {
        // Now lets lookup the registry & user from ~/.m2/setting.xml
        Server defaultServer = null;
        Server found;
        for (Server server : settings.getServers()) {
            String id = server.getId();

            // Remember a default server without user as fallback for later
            if (defaultServer == null) {
                defaultServer = checkForServer(server, id, registry, null);
            }
            // Check for specific server with user part
            found = checkForServer(server, id, registry, user);
            if (found != null) {
                log.debug("AuthConfig: credentials from ~/.m2/setting.xml (%s)", found);
                return createAuthConfigFromServer(found, decryptor);
            }
        }

        if (defaultServer != null) {
            log.debug("AuthConfig: credentials from ~/.m2/setting.xml (%s)", defaultServer);
            return createAuthConfigFromServer(defaultServer, decryptor);
        }

        return null;
    }

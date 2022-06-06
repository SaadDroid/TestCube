public Server create() {
        ClassLoaderHolder orig = null;
        try {
            if (bus != null) {
                ClassLoader loader = bus.getExtension(ClassLoader.class);
                if (loader != null) {
                    orig = ClassLoaderUtils.setThreadContextClassloader(loader);
                }
            }

            Server server = super.create();
            initializeResourcesAndHandlerChain(server);
            checkPrivateEndpoint(server.getEndpoint());

            return server;
        } finally {
            if (orig != null) {
                orig.reset();
            }
        }
    }

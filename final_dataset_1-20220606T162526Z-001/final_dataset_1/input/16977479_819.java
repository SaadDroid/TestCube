@PreDestroy
    public void shutdown() {
        // shutdown remaining endpoints
        if (!reliableEndpoints.isEmpty()) {
            LOG.log(Level.FINE,
                    "Shutting down RMManager with {0} remaining endpoints.",
                    new Object[] {Integer.valueOf(reliableEndpoints.size())});
            for (RMEndpoint rme : reliableEndpoints.values()) {
                rme.shutdown();
            }
        }

        // remove references to timer tasks cancelled above to make them
        // eligible for garbage collection
        Timer t = getTimer(false);
        if (t != null) {
            t.purge();
            t.cancel();
        }

        // unregistring of this managed bean from the server is done by the bus itself
    }

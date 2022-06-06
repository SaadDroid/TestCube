void shutdownReliableEndpoint(Endpoint e) {
        RMEndpoint rme = reliableEndpoints.get(e);
        if (rme == null) {
            // not found
            return;
        }
        rme.shutdown();

        // remove references to timer tasks cancelled above to make them
        // eligible for garbage collection
        Timer t = getTimer(false);
        if (t != null) {
            t.purge();
        }

        reliableEndpoints.remove(e);
    }

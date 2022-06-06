public void executeDeleteObject(final String path) throws CosmicRESTException {
        s_logger.debug("Executing delete object on " + path);
        client.closeResponse(createAndExecuteRequest(HttpMethods.DELETE, path, new HashMap<>(), ABSENT));
    }

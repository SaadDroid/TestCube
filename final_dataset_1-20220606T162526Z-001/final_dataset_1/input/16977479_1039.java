public Destination getDestination(EndpointInfo endpointInfo, Bus bus)
        throws IOException {
        return new CorbaDestination(endpointInfo, orbConfig);
    }

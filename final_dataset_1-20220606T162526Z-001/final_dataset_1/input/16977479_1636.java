public Destination getDestination(EndpointInfo endpointInfo, Bus bus) throws IOException {
        if (destination == null) {
            destination = new JAXWSHttpSpiDestination(bus, new DestinationRegistryImpl(), endpointInfo);
            // set handler into the provided HttpContext, our Destination hook into the server container
            HttpHandlerImpl handler = new HttpHandlerImpl(destination);
            context.setHandler(handler);
        }
        return destination;
    }

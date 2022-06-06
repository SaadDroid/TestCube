@Override
    public synchronized void processConnect(WebSocketChannel channel, WSURI location, String[] protocols) {
        LOG.entering(CLASS_NAME, "connect", channel);

        String path = location.getPath();
        if (path.endsWith("/")) {
            // eliminate duplicate slash when appending create suffix
            path = path.substring(0, path.length()-1);
        }
        
        try {
            CreateChannel createChannel = new CreateChannel();
            createChannel.setParent(channel);
            createChannel.setProtocols(protocols);
            HttpURI createUri = HttpURI.replaceScheme(location, location.getHttpEquivalentScheme())
                                       .replacePath(path + "/;e/cbm");
            createHandler.processOpen(createChannel, createUri);
            
        } catch (Exception e) {
            LOG.log(Level.FINE, e.getMessage(), e);
            listener.connectionFailed(channel, e);
        }
    }

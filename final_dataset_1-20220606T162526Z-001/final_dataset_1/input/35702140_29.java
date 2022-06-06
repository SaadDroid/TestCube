public void setNextHandler(WebSocketHandler handler) {
        this.nextHandler = handler;
        
        handler.setListener(new WebSocketHandlerListener() {

            @Override
            public void connectionOpened(WebSocketChannel channel, String protocol) {
                /* We have to wait until the balancer responds for kaazing gateway */
                if (!WebSocketHandshakeObject.KAAZING_EXTENDED_HANDSHAKE.equals(protocol)) {
                    //Non-kaazing gateway, fire open event
                    WebSocketNativeChannel wsChannel = (WebSocketNativeChannel)channel;
                    wsChannel.balanced.set(2); //turn off balancer message check
                    listener.connectionOpened(channel, protocol);
                }
            }

            @Override
            public void redirected(WebSocketChannel channel, String location) {
                try {
                    LOG.finest("Balancer redirect location = " + StringUtils.stripControlCharacters(location));

                    WSURI uri = new WSURI(location);
                    reconnect(channel, uri, channel.getProtocol());
                    nextHandler.processClose(channel, 0, null);
                } 
                catch (URISyntaxException e) {
                    LOG.log(Level.WARNING, e.getMessage(), e);
                    listener.connectionFailed(channel, e);
                }
                catch (Exception e) {
                    LOG.log(Level.WARNING, e.getMessage(), e);
                    listener.connectionFailed(channel, e);
                }
            }

            @Override
            public void authenticationRequested(WebSocketChannel channel, String location, String challenge) {
                listener.authenticationRequested(channel, location, challenge);
            }

            @Override
            public void binaryMessageReceived(WebSocketChannel channel, WrappedByteBuffer buf) {
                handleBinaryMessageReceived(channel, buf);
            }

            @Override
            public void textMessageReceived(WebSocketChannel channel, String message) {
                handleTextMessageReceived(channel, message);
            }

            @Override
            public void connectionClosed(WebSocketChannel channel, boolean wasClean, int code, String reason) {
                WebSocketNativeChannel wsChannel = (WebSocketNativeChannel)channel;
                if (wsChannel.reconnecting.compareAndSet(true, false)) {
                    //balancer redirect, open a new connection to redirectUri
                    wsChannel.reconnected.set(true);
                    
                    // add kaazing protocol header
                    String[] nextProtocols;
                    String[] requestedProtocols = wsChannel.getRequestedProtocols();
                    if (requestedProtocols == null || requestedProtocols.length == 0) {
                        nextProtocols = new String[] { WebSocketHandshakeObject.KAAZING_EXTENDED_HANDSHAKE };
                    }
                    else {
                        nextProtocols = new String[requestedProtocols.length+1];
                        nextProtocols[0] = WebSocketHandshakeObject.KAAZING_EXTENDED_HANDSHAKE;
                        for (int i=0; i<requestedProtocols.length; i++) {
                            nextProtocols[i+1] = requestedProtocols[i];
                        }
                    }
                    
                    processConnect(channel, wsChannel.redirectUri, nextProtocols);
                }
                else {
                    listener.connectionClosed(channel, wasClean, code, reason);
                }
            }

            @Override
            public void connectionClosed(WebSocketChannel channel, Exception ex) {
                listener.connectionClosed(channel, ex);
            }
                
            @Override
            public void connectionFailed(WebSocketChannel channel, Exception ex) {
                if (ex == null) {
                    listener.connectionClosed(channel, false, 0, null);
                }
                else {
                    listener.connectionClosed(channel, ex);
                }
            }

            @Override
            public void commandMessageReceived(WebSocketChannel channel, CommandMessage message) {
                listener.commandMessageReceived(channel, message);
            }
        });
    }

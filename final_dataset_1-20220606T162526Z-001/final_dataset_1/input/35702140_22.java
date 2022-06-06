@Override
    public void setNextHandler(WebSocketHandler handler) {
        super.setNextHandler(handler);
        
        handler.setListener(new WebSocketHandlerListener() {
            
            @Override
            public void connectionOpened(WebSocketChannel channel, String protocol) {
                clearAuthenticationCredentials(channel);
                listener.connectionOpened(channel, protocol);
            }
            
            @Override
            public void redirected(WebSocketChannel channel, String location) {
                clearAuthenticationCredentials(channel);
                listener.redirected(channel, location);
            }
            
            @Override
            public void authenticationRequested(WebSocketChannel channel, String location, String challenge) {
                handleAuthenticationRequested(channel, location, challenge);
            }
            
            @Override
            public void binaryMessageReceived(WebSocketChannel channel, WrappedByteBuffer buf) {
                listener.binaryMessageReceived(channel, buf);
            }

            @Override
            public void textMessageReceived(WebSocketChannel channel, String message) {
                listener.textMessageReceived(channel, message);
            }
            
            @Override
            public void connectionClosed(WebSocketChannel channel, boolean wasClean, int code, String reason) {
                clearAuthenticationCredentials(channel);
                listener.connectionClosed(channel, wasClean, code, reason);
            }
            
            @Override
            public void connectionClosed(WebSocketChannel channel, Exception ex) {
                listener.connectionClosed(channel, ex);
            }

            @Override
            public void connectionFailed(WebSocketChannel channel, Exception ex) {
                clearAuthenticationCredentials(channel);
                listener.connectionFailed(channel, ex);
            }

            @Override
            public void commandMessageReceived(WebSocketChannel channel, CommandMessage message) {
            }
        });
    }

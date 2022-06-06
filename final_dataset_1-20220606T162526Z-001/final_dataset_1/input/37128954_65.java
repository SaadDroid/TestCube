public void setHandshakeRequired(boolean handshakeRequired) {
        if (mHandshakeRequired != handshakeRequired) {
            Log.v(TAG, "setHandshakeRequired: " + mHandshakeRequired + " -> " + handshakeRequired);
            mHandshakeRequired = handshakeRequired;

            if (mIsServerThreadAlive) {
                stopListeningForIncomingConnections();

                // Stopping the server is asynchronous and may take a short while. Thus, we need to
                // restart it with a small delay.
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        startListeningForIncomingConnections();
                    }
                }, SERVER_RESTART_DELAY_IN_MILLISECONDS);
            }
        }
    }

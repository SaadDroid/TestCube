void stop() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                // Calling Google APIs when the initial connection to GoogleApiClient failed
                // will lead to a crash so we must check for this case.
                // .disconnect() is always safe to call but onGooglePlayServicesDisconnecting()
                // should be invoked only if googleApiClient is not disconnected or not connecting.
                if (googleApiClient.isConnected()) {
                    onGooglePlayServicesDisconnecting();
                }
                googleApiClient.disconnect();
            }
        });
    }

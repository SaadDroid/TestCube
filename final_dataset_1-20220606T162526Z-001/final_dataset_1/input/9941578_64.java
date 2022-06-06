public void hasInternetAccess(final InternetAccessCallback callback) {
        captivePortalPinger.ping(new EndpointPinger.PingerCallback() {
            @Override
            public void onSuccess() {
                callback.onResult(true);
            }

            @Override
            public void onFailure() {
                callback.onResult(false);
            }
        });
    }

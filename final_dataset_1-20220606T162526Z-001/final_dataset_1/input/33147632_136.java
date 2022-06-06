public void requestGuestAuthToken(final Callback<GuestAuthToken> callback) {
        final Callback<OAuth2Token> appAuthCallback = new Callback<OAuth2Token>() {
            @Override
            public void success(Result<OAuth2Token> result) {
                final OAuth2Token appAuthToken = result.data;
                // Got back an app auth token, now request a guest auth token.
                final Callback<GuestTokenResponse> guestTokenCallback
                        = new Callback<GuestTokenResponse>() {
                    @Override
                    public void success(Result<GuestTokenResponse> result) {
                        // Return a GuestAuthToken that includes the guestToken.
                        final GuestAuthToken guestAuthToken = new GuestAuthToken(
                                appAuthToken.getTokenType(), appAuthToken.getAccessToken(),
                                result.data.guestToken);
                        callback.success(new Result<>(guestAuthToken, null));
                    }

                    @Override
                    public void failure(TwitterException error) {
                        Twitter.getLogger().e(TwitterCore.TAG,
                                "Your app may not allow guest auth. Please talk to us "
                                        + "regarding upgrading your consumer key.", error);
                        callback.failure(error);
                    }
                };
                requestGuestToken(guestTokenCallback, appAuthToken);
            }

            @Override
            public void failure(TwitterException error) {
                Twitter.getLogger().e(TwitterCore.TAG, "Failed to get app auth token", error);
                if (callback != null) {
                    callback.failure(error);
                }
            }
        };
        requestAppAuthToken(appAuthCallback);
    }

void startAuth() {
        // Step 1. Obtain a request token to start the sign in flow.
        Twitter.getLogger().d(TwitterCore.TAG, "Obtaining request token to start the sign in flow");
        oAuth1aService.requestTempToken(newRequestTempTokenCallback());
    }

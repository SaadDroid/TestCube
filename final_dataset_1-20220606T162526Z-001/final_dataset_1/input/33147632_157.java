Callback<ResponseBody> getCallbackWrapper(final Callback<OAuthResponse> callback) {
        return new Callback<ResponseBody>() {

            @Override
            public void success(Result<ResponseBody> result) {
                //Try to get response body
                BufferedReader reader = null;
                final StringBuilder sb = new StringBuilder();
                try {
                    try {
                        reader = new BufferedReader(
                                new InputStreamReader(result.data.byteStream()));
                        String line;

                        while ((line = reader.readLine()) != null) {
                            sb.append(line);
                        }
                    } finally {
                        if (reader != null) {
                            reader.close();
                        }
                    }
                    final String responseAsStr = sb.toString();
                    final OAuthResponse authResponse = parseAuthResponse(responseAsStr);
                    if (authResponse == null) {
                        callback.failure(new TwitterAuthException(
                                "Failed to parse auth response: " + responseAsStr));
                    } else {
                        callback.success(new Result<>(authResponse, null));
                    }
                } catch (IOException e) {
                    callback.failure(new TwitterAuthException(e.getMessage(), e));
                }
            }

            @Override
            public void failure(TwitterException exception) {
                callback.failure(exception);
            }
        };
    }

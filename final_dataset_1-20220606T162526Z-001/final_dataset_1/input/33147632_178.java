static ApiError parseApiError(String body) {
        final Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new SafeListAdapter())
                .registerTypeAdapterFactory(new SafeMapAdapter())
                .create();
        try {
            final ApiErrors apiErrors = gson.fromJson(body, ApiErrors.class);
            if (!apiErrors.errors.isEmpty()) {
                return apiErrors.errors.get(0);
            }
        } catch (JsonSyntaxException e) {
            Twitter.getLogger().e(TwitterCore.TAG, "Invalid json: " + body, e);
        }
        return null;
    }

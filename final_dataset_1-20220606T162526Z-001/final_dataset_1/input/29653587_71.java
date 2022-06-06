@Override
    public void reply(Context context, String parentId, String text, Callback callback) {
        Pair<String, String> credentials = AppUtils.getCredentials(context);
        if (credentials == null) {
            callback.onDone(false);
            return;
        }
        execute(postReply(parentId, text, credentials.first, credentials.second))
                .map(response -> response.code() == HttpURLConnection.HTTP_MOVED_TEMP)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(callback::onDone, callback::onError);
    }

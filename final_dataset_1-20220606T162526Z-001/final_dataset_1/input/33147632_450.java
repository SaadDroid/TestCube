@Override
    protected void onHandleIntent(Intent intent) {
        final TwitterAuthToken token = intent.getParcelableExtra(EXTRA_USER_TOKEN);
        this.intent = intent;
        final TwitterSession twitterSession =
                new TwitterSession(token, PLACEHOLDER_ID, PLACEHOLDER_SCREEN_NAME);
        final String tweetText = intent.getStringExtra(EXTRA_TWEET_TEXT);
        final Uri imageUri = intent.getParcelableExtra(EXTRA_IMAGE_URI);

        uploadTweet(twitterSession, tweetText, imageUri);
    }

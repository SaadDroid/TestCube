@Override
    public void success(Result<Tweet> result) {
        tweetRepository.updateCache(result.data);
        baseTweetView.setTweet(result.data);
        if (cb != null) {
            cb.success(result);
        }
    }

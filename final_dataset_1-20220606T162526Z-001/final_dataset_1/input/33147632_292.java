@Override
    public void onClick(View view) {
        if (view instanceof ToggleImageButton) {
            final ToggleImageButton toggleImageButton = (ToggleImageButton) view;
            if (tweet.favorited) {
                tweetRepository.unfavorite(tweet.id,
                        new LikeCallback(toggleImageButton, tweet, getActionCallback()));
            } else {
                tweetRepository.favorite(tweet.id,
                        new LikeCallback(toggleImageButton, tweet, getActionCallback()));
            }
        }
    }

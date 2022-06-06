static CharSequence linkifyUrls(FormattedTweetText tweetText,
                                    final LinkClickListener linkListener,
                                    final int linkColor, final int linkHighlightColor,
                                    boolean stripQuoteTweet, boolean stripVineCard) {
        if (tweetText == null) return null;

        if (TextUtils.isEmpty(tweetText.text)) {
            return tweetText.text;
        }

        final SpannableStringBuilder spannable = new SpannableStringBuilder(tweetText.text);
        final List<FormattedUrlEntity> urls = ModelUtils.getSafeList(tweetText.urlEntities);
        final List<FormattedMediaEntity> media = ModelUtils.getSafeList(tweetText.mediaEntities);
        final List<FormattedUrlEntity> hashtags = ModelUtils.getSafeList(tweetText.hashtagEntities);
        final List<FormattedUrlEntity> mentions = ModelUtils.getSafeList(tweetText.mentionEntities);
        final List<FormattedUrlEntity> symbols = ModelUtils.getSafeList(tweetText.symbolEntities);
        /*
         * We combine and sort the entities here so that we can correctly calculate the offsets
         * into the text.
         */
        final List<FormattedUrlEntity> combined = mergeAndSortEntities(urls, media, hashtags,
                mentions, symbols);
        final FormattedUrlEntity strippedEntity = getEntityToStrip(tweetText.text, combined,
                stripQuoteTweet, stripVineCard);

        addUrlEntities(spannable, combined, strippedEntity, linkListener, linkColor,
                linkHighlightColor);

        return trimEnd(spannable);
    }

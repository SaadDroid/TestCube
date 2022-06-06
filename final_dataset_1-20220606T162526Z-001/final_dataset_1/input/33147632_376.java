static void format(FormattedTweetText formattedTweetText, Tweet tweet) {
        if (TextUtils.isEmpty(tweet.text)) return;

        final HtmlEntities.Unescaped u = HtmlEntities.HTML40.unescape(tweet.text);
        final StringBuilder result = new StringBuilder(u.unescaped);

        adjustIndicesForEscapedChars(formattedTweetText.urlEntities, u.indices);
        adjustIndicesForEscapedChars(formattedTweetText.mediaEntities, u.indices);
        adjustIndicesForEscapedChars(formattedTweetText.hashtagEntities, u.indices);
        adjustIndicesForEscapedChars(formattedTweetText.mentionEntities, u.indices);
        adjustIndicesForEscapedChars(formattedTweetText.symbolEntities, u.indices);
        adjustIndicesForSupplementaryChars(result, formattedTweetText);
        formattedTweetText.text = result.toString();
    }

public static boolean hasSupportedVideo(Tweet tweet) {
        final MediaEntity entity = getVideoEntity(tweet);
        return entity != null && getSupportedVariant(entity) != null;
    }

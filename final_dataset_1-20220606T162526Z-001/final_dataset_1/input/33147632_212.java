boolean containsMatchingHashtag(List<HashtagEntity> hashtags) {
        for (HashtagEntity entity : hashtags) {
            if (hashTagConstraints.contains(entity.text)) {
                return true;
            }
        }

        return false;
    }

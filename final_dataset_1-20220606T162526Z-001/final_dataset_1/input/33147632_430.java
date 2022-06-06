static List<Tweet> orderTweets(List<Long> tweetIds, List<Tweet> tweets) {
        final HashMap<Long, Tweet> idToTweet = new HashMap<>();
        final ArrayList<Tweet> ordered = new ArrayList<>();
        for (Tweet tweet: tweets) {
            idToTweet.put(tweet.id, tweet);
        }
        for (Long id: tweetIds) {
            if (idToTweet.containsKey(id)) {
                ordered.add(idToTweet.get(id));
            }
        }
        return ordered;
    }

public static double getRating(String word) throws IOException, URISyntaxException {
        if (ratingMap == null)
            readRatingsFile();
        if (ratingMap.containsKey(word))
            return ratingMap.get(word);
        return 0;
    }

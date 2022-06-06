public static List<DiscoveredFeed> discoverFeeds(String pageUrl) {

        List<DiscoveredFeed> result = null;
        Document document = null;

        try {

            HttpResult httpResult = httpRetriever.httpGet(pageUrl);
            document = parser.parse(httpResult);

        } catch (Throwable t) {
            // NekoHTML produces various types of Exceptions, just catch them all here and log them.
            LOGGER.error("Error retrieving {} : {} ; {}", pageUrl, t.toString(), t.getMessage());
        }

        if (document != null) {
            result = discoverFeeds(document);
        }

        return result;

    }

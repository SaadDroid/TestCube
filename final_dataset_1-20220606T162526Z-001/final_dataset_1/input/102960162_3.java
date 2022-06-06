public static Optional<RouteSimilarity> getClosestRoute(String url, String[] availableRoutes) {
        if (url.lastIndexOf("/") > 0) {
            Optional<RouteSimilarity> result = Arrays.stream(availableRoutes)
                    .filter(routeData -> !routeData.equals(url))
                    .map(routeData -> new RouteSimilarity(routeData, url))
                    .max(Comparator.comparingInt(RouteSimilarity::getSimilarity));
            if (result.isPresent()) {
                return result;
            }
        }
        return Optional.empty();
    }

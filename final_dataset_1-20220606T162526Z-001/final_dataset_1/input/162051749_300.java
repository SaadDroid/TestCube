public static boolean differentNames(Collection<Location> locations) {
        Set<String> allNames = new HashSet<>();
        for (Location location : locations) {
            Set<String> currentNames = location.collectAlternativeNames();
            if (allNames.size() > 0) {
                Set<String> tempIntersection = new HashSet<>(allNames);
                tempIntersection.retainAll(currentNames);
                if (tempIntersection.isEmpty()) {
                    return true;
                }
            }
            allNames.addAll(currentNames);
        }
        return false;
    }

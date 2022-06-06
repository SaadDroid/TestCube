public Location first() {
        Location first = null;
        for (Location location : locations) {
            if (first == null || first.getId() > location.getId()) {
                first = location;
            }
        }
        return first;
    }

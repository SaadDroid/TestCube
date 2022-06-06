public boolean isOutside(List<Position> path, double minDistanceKm) {
        if (isWithin(path))
            return false;
        else {
            double distance = getDistanceToPathKm(path);
            return distance >= minDistanceKm;
        }
    }

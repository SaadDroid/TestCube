@Override
    public double distance(GeoCoordinate other) {
        Validate.notNull(other, "other must not be null");
        return GeoUtils.computeDistance(getLatitude(), getLongitude(), other.getLatitude(), other.getLongitude());
    }

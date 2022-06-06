@Override
    public boolean contains(double x, double y) {
        CoordinateSystem coordinateSystem = crs.getCoordinateSystem();
        if (coordinateSystem.getDimension() >= 2) {
            if (coordinateSystem.getAxis(0).getRangeMeaning() == RangeMeaning.WRAPAROUND) {
                x = GISUtils.getNextEquivalentLongitude(minx, x);
            }
            if (coordinateSystem.getAxis(1).getRangeMeaning() == RangeMeaning.WRAPAROUND) {
                y = GISUtils.getNextEquivalentLongitude(miny, y);
            }
        }
        return (x >= minx && x <= maxx && y >= miny && y <= maxy);
    }

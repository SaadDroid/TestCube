public static GeoCoordinate getCenterOfMinimumDistance(Collection<? extends GeoCoordinate> coordinates) {
        Validate.notEmpty(coordinates, "coordinates must not be empty");

        if (coordinates.size() == 1) { // shortcut
            return CollectionHelper.getFirst(coordinates);
        }

        // algorithm implemented from explanation at: http://www.geomidpoint.com/calculation.html
        GeoCoordinate currentPoint = getMidpoint(coordinates); // step 1
        double minimumDistance = 0; // step 2: minimum distance = sum of distances to midpoint
        for (GeoCoordinate coordinate : coordinates) {
            minimumDistance += currentPoint.distance(coordinate);
        }

        // step 3: get total distance between each coordinate in the collection and other coordinates,
        // if total distance is smaller, this location becomes currentPoint, and update minimumDistance
        for (GeoCoordinate coordinate1 : coordinates) {
            double currentDistance = 0;
            for (GeoCoordinate coordinate2 : coordinates) {
                currentDistance += coordinate1.distance(coordinate2);
            }
            if (currentDistance < minimumDistance) {
                minimumDistance = currentDistance;
                currentPoint = coordinate1;
            }
        }

        double testDistance = EARTH_RADIUS_KM * Math.PI / 2; // step 4
        // steps 5-8
        boolean foundNewSmallest = false;
        int iterations = 0; // prevent infinite loops, just in case
        while (iterations++ < 5000 && (foundNewSmallest || testDistance >= 2.0e-8 * EARTH_RADIUS_KM)) {
            GeoCoordinate[] testPoints = getTestPoints(currentPoint, testDistance);
            double tempMinimumDistance = Double.MAX_VALUE;
            GeoCoordinate tempCurrentPoint = null;
            for (GeoCoordinate testPoint : testPoints) {
                double currentDistance = 0;
                for (GeoCoordinate coordinate : coordinates) {
                    currentDistance += testPoint.distance(coordinate);
                }
                if (currentDistance < tempMinimumDistance) {
                    tempMinimumDistance = currentDistance;
                    tempCurrentPoint = testPoint;
                }
            }
            if (tempMinimumDistance < minimumDistance) {
                currentPoint = tempCurrentPoint;
                minimumDistance = tempMinimumDistance;
                foundNewSmallest = true;
            } else {
                testDistance /= 2;
                foundNewSmallest = false;
            }
        }
        return currentPoint;
    }

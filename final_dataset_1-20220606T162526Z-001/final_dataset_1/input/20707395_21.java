public static List<Position> getCircle(Position position, double radiusKm, double numPoints) {

        List<Position> positions = new ArrayList<Position>();
        for (int i = 0; i < numPoints; i++) {
            double bearing = 360.0 * i / numPoints;
            Position p = position.predict(radiusKm, bearing).normalizeLongitude();
            positions.add(p);
        }
        positions.add(positions.get(0));
        return positions;
    }

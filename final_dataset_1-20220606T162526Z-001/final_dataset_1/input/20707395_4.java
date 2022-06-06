public final Position getPositionAlongPath(Position position, double proportion) {

        if (proportion >= 0 && proportion <= 1) {

            // Get bearing degrees for course
            double courseDegrees = this.getBearingDegrees(position);

            // Get distance from position arg and this objects location
            double distanceKm = this.getDistanceToKm(position);

            // Predict the position for a proportion of the course
            // where this object is the start position and the arg
            // is the destination position.
            Position retPosition = this.predict(proportion * distanceKm, courseDegrees);

            return retPosition;
        } else
            throw new RuntimeException("Proportion must be between 0 and 1 inclusive");
    }

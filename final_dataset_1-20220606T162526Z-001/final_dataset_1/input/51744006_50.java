public static List<Coordinate> parseCoordinates(String stringCoord) {
        String[] coords = stringCoord.split("\\s*(;|,)\\s*");
        if (coords.length == 0 || coords.length % 2 != 0) {
            throw new InvalidatedSyntaxException("coords");
        }
        List<Coordinate> coordinates = new ArrayList<>();
        try {
            for (int i = 0; i < coords.length; i += 2) {
                coordinates.add(new Coordinate(Double.parseDouble(coords[i]), Double.parseDouble(coords[i + 1])));
            }
        } catch (NumberFormatException e) {
            throw new InvalidatedSyntaxException("coords");
        }
        return coordinates;
    }

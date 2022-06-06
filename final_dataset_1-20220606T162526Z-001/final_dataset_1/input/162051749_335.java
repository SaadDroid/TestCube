static List<MarkupCoordinate> extractCoordinateTag(String text) {
        Validate.notNull(text, "text must not be null");
        List<MarkupCoordinate> result = new ArrayList<>();
        Matcher m = COORDINATE_TAG_PATTERN.matcher(text);
        while (m.find()) {
            // get coordinate parameters
            String data = m.group(9);
            String type = getCoordinateParam(data, "type");
            String globe = getCoordinateParam(data, "globe");
            // ignore extraterrestrial coordinates;
            // http://en.wikipedia.org/wiki/Wikipedia:WikiProject_Geographical_coordinates#globe:G
            if (globe != null && !globe.equalsIgnoreCase("earth")) {
                LOGGER.debug("ignoring coordinate with globe type '{}'", globe);
                continue;
            }
            double lat = parseComponents(m.group(1), m.group(2), m.group(3), m.group(4));
            double lng = parseComponents(m.group(5), m.group(6), m.group(7), m.group(8));
            if (!GeoUtils.isValidCoordinateRange(lat, lng)) {
                LOGGER.warn("lat/lng ({},{}) out of range", lat, lng);
                continue;
            }
            Long population = null;
            if (type != null) {
                population = getNumberInBrackets(type);
                type = type.replaceAll("\\(.*\\)", ""); // remove population
            }
            String region = getCoordinateParam(data, "region");
            // get other parameters
            String display = getOtherParam(data, "display");
            String name = getOtherParam(data, "name");

            result.add(new MarkupCoordinate(lat, lng, name, population, display, type, region));
        }
        return result;
    }

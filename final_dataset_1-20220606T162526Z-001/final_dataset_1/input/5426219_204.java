public static String getGradientColour(double value,
                                           double min,
                                           double max,
                                           String lowValueColourString,
                                           String highValueColourString) {
        Preconditions.checkArgument(
                value >= 0.0 && value >= min && value <= max ||
                value < 0 && value <= min && value >= max);

        Color lowValueColour = getColour(lowValueColourString);
        Color highValueColour = getColour(highValueColourString);

        return colourToHexString(getGradientColour(value, min, max, lowValueColour, highValueColour));
    }

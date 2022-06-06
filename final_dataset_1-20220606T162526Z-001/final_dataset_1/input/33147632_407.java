static int calculateOpacityTransform(final double opacity, final int overlayColor,
            final int primaryColor) {
        final int redPrimary = Color.red(primaryColor);
        final int redOverlay = Color.red(overlayColor);
        final int greenPrimary = Color.green(primaryColor);
        final int greenOverlay = Color.green(overlayColor);
        final int bluePrimary = Color.blue(primaryColor);
        final int blueOverlay = Color.blue(overlayColor);

        final int redCalculated = (int) ((1 - opacity) * redPrimary + opacity * redOverlay);
        final int greenCalculated = (int) ((1 - opacity) * greenPrimary + opacity * greenOverlay);
        final int blueCalculated = (int) ((1 - opacity) * bluePrimary + opacity * blueOverlay);

        return Color.rgb(redCalculated, greenCalculated, blueCalculated);
    }

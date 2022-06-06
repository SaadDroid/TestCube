static boolean isLightColor(final int color) {
        final int r = Color.red(color);
        final int g = Color.green(color);
        final int b = Color.blue(color);

        final double threshold = 0.21 * r + 0.72 * g + 0.07 * b;
        return threshold > 128;
    }

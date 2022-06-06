public static int findPowerOfTwo(int value) {
        for (int ii = value; ii > 0; ii--) {
            if (isPowerOfTwo(ii)) {
                return ii;
            }
        }
        throw new IllegalArgumentException("No power of two found.");
    }

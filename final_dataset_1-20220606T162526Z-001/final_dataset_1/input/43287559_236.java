public static boolean containsInt(final int[] array, final int key) {
        for (int element : array) {
            if (element == key) {
                return true;
            }
        }
        return false;
    }

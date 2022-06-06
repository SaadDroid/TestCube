public static boolean onlyOneIsTrueNonThrow(final boolean... expressions) {
        int count = 0;
        for (final boolean expression : expressions) {
            if (expression && ++count > 1) {
                return false;
            }
        }
        return 1 == count;
    }

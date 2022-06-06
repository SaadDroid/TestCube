public static int getPrefixLength(final String string1, final String string2) {
        if (string1 == null || string2 == null) {
            return 0;
        }
        int[] cpArray1 = stringToCodePointArray(string1);
        int[] cpArray2 = stringToCodePointArray(string2);
        int lengthToMatch = Math.min(cpArray1.length, cpArray2.length);

        final int min = Math.min(MINPREFIXTESTLENGTH, lengthToMatch);
        // check for prefix similarity of length n
        for (int i = 0; i < min; i++) {
            // check the prefix is the same so far
            if (cpArray1[i] != cpArray2[i]) {
                // not the same so return as far as got
                return i;
            }
        }
        return min; // first n characters are the same
    }

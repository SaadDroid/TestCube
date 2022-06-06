@Override
    public double getWeight(String string1, String string2) {
        final int lcs = longestSubstr(string1, string2);
        long maxLength = Math.max(string1.codePoints().count(), string2.codePoints().count());
        return ((double) lcs) / maxLength;
    }

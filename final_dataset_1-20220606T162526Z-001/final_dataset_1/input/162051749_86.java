@Override
    public double getSimilarity(String s1, String s2) {
        Validate.notNull(s1, "s1 must not be null");
        Validate.notNull(s2, "s2 must not be null");
        String s1lower = s1.toLowerCase();
        String s2lower = s2.toLowerCase();
        if (s1lower.equals(s2lower)) {
            return 1;
        }
        Set<String> nGrams1 = createNGrams(s1lower, n);
        Set<String> nGrams2 = createNGrams(s2lower, n);
        return setSimilarity.getSimilarity(nGrams1, nGrams2);
    }

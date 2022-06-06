public static Set<String> calculateWordNGrams(String string, int n) {
        return calculateAllWordNGrams(string, n, n);
    }

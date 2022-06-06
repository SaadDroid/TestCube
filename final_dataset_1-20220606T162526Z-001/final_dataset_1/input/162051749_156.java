public static <T> double getAveragePrecision(Set<T> actual, List<T> predicted, int k) {
        Objects.requireNonNull(actual, "actual was null");
        Objects.requireNonNull(predicted, "predicted was null");
        if (k <= 0) {
            throw new IllegalStateException("k must be greater one");
        }
        if (actual.isEmpty()) {
            return 0;
        }
        if (predicted.size() > k) {
            predicted = predicted.subList(0, k);
        }
        double score = 0.0;
        int numHits = 0;
        for (int i = 0; i < predicted.size(); i++) {
            T p = predicted.get(i);
            if (actual.contains(p) && !predicted.subList(0, i).contains(p)) {
                numHits++;
                score += numHits / (i + 1.0);
            }
        }
        return score / Math.min(actual.size(), k);
    }

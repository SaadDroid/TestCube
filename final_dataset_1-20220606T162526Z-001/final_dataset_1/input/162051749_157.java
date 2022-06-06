public static <T> double getMeanAveragePrecision(Iterable<? extends Pair<? extends Set<T>, ? extends List<T>>> data,
                                                     int k) {
        double meanAveragePrecision = 0;
        int n = 0;
        for (Pair<? extends Set<T>, ? extends List<T>> pair : data) {
            n++;
            meanAveragePrecision += getAveragePrecision(pair.getKey(), pair.getValue(), k);
        }
        return meanAveragePrecision / n;
    }

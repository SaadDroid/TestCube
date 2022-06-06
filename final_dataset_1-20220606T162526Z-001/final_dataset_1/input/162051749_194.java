public Entry<T, Integer> getMax() {
        Entry<T, Integer> max = null;
        for (Entry<T, Integer> entry : unique()) {
            if (max == null || max.getValue() < entry.getValue()) {
                max = entry;
            }
        }
        return max;
    }

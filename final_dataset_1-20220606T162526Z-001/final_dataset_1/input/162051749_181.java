public List<V> getValuesBetween(K lowerBound, K upperBound) {
        List<V> values = new ArrayList<>();

        double lbv = lowerBound.doubleValue();
        double ubv = upperBound.doubleValue();

        for (Map.Entry<K, Collection<V>> entry : this.entrySet()) {
            double v = entry.getKey().doubleValue();
            if (v >= lbv && v <= ubv) {
                values.addAll(entry.getValue());
            }

            if (v > ubv) {
                break;
            }
        }

        return values;
    }

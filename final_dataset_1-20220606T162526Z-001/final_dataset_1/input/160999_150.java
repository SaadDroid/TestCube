@Override
    public Map<String, Object> values() {
        Map<String, Object> m = new LinkedHashMap<>();
        for (Map.Entry<String, AvgMinMaxCounter> entry : counters.entrySet()) {
            m.putAll(entry.getValue().values());
        }
        return m;
    }

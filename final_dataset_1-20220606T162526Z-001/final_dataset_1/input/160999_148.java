public Map<String, Object> values() {
        Map<String, Object> m = new LinkedHashMap<>();
        m.putAll(counter.values());
        m.put("p50_" + name, Math.round(this.histogram.getSnapshot().getMedian()));
        m.put("p95_" + name, Math.round(this.histogram.getSnapshot().get95thPercentile()));
        m.put("p99_" + name, Math.round(this.histogram.getSnapshot().get99thPercentile()));
        m.put("p999_" + name, Math.round(this.histogram.getSnapshot().get999thPercentile()));
        return m;
    }

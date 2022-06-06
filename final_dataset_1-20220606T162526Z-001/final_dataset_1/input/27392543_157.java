public static MetricFilter and(final MetricFilter metricFilter1, final MetricFilter metricFilter2) {
    return new MetricFilter() {
      @Override public boolean matches(String name, Metric metric) {
        return metricFilter1.matches(name, metric) && metricFilter2.matches(name, metric);
      }
    };
  }

public void decGauge(String gaugeName, long delta) {
    MetricMutableGaugeLong gaugeInt = metricsRegistry.getLongGauge(gaugeName, 0l);
    gaugeInt.decr(delta);
  }

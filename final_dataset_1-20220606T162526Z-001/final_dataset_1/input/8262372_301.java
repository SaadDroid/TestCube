public void incGauge(String gaugeName, long delta) {
    MutableGaugeLong gaugeInt = metricsRegistry.getLongGauge(gaugeName, 0l);
    gaugeInt.incr(delta);
  }

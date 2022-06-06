public void incCounters(String key, long delta) {
    MutableCounterLong counter = metricsRegistry.getLongCounter(key, 0l);
    counter.incr(delta);

  }

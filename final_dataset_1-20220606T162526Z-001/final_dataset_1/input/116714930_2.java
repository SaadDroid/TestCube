public Meter getMeter(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("scope cannot be null");
        }
        Meter meter = meters.get(scope);
        if (meter == null) {
            meter = Metrics.newMeter(clazz, name, scope, name, TimeUnit.SECONDS);
            Meter existing = meters.putIfAbsent(scope, meter);
            if (existing != null) {
                meter = existing;
            }
        }
        return meter;
    }
